package com.desafio.program;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.program.entities.Order;
import com.desafio.program.services.OrderService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner{

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o código: ");
		int code = sc.nextInt();
		System.out.println("Insira o valor base:");
		double basic = sc.nextDouble();
		System.out.println("Insira o desconto:");
		double discount = sc.nextDouble();
		
		sc.close();
		
		Order order = new Order(code, basic, discount);
		
		System.out.println(orderService.total(order));
	}
	
	

}
