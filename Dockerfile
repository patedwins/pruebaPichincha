FROM gradle:jdk11-openj9 as backend-compiler
LABEL version="1.0.0"
LABEL mantainer="patedwins@gmail.com"
WORKDIR /app
COPY . .

ARG PICHINCHA_MAVEN_USER_ARG
ARG PICHINCHA_MAVEN_PASSWORD_ARG

ENV PICHINCHA_MAVEN_USER=$PICHINCHA_MAVEN_USER_ARG
ENV PICHINCHA_MAVEN_PASSWORD=$PICHINCHA_MAVEN_PASSWORD_ARG

RUN gradle build  -x check --refresh-dependencies || return 0


FROM openjdk:8-alpine
RUN apk add tzdata
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

COPY --from=backend-compiler /app/app-web/build/libs/app-web-2.0.0.war /opt/app-web.war
ENTRYPOINT ["/usr/bin/java", "-jar", "/opt/app-web.war"]
