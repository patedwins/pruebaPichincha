package com.pichincha.transaccion.config.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.Serializable;

/**
 * @author <a href="mailto:patedwins@gmail.com">Patricio Peñaloza</a>
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.pichincha-transaccion.core.repository")
public class AppConfig implements Serializable {

	private static final long serialVersionUID = -4580567702999656285L;
}
