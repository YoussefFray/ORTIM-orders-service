package com.clientOrders.orders;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class OrdersApplication {

	public static void main(String[] args) {

		SpringApplication.run(OrdersApplication.class, args);
	}
	@Bean
 CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate) {
	 return args -> {
		 kafkaTemplate.send("orders_notification", "Hello from Kafka");
	 };
 }
}

