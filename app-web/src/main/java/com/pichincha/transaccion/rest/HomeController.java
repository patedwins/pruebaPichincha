package com.pichincha.transaccion.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/")
@RestController
@Slf4j
public class HomeController {

    @GetMapping
    public ResponseEntity<Date> estadoApi() {
    	return new ResponseEntity<>(Calendar.getInstance().getTime(), HttpStatus.OK);
    }
}
