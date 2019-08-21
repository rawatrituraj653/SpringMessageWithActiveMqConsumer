package com.msg.broker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringMessageWithActiveMqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMessageWithActiveMqConsumerApplication.class, args);
	}

}
