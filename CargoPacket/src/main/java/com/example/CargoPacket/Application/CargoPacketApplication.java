package com.example.CargoPacket.Application;

import com.example.CargoPacket.Operations.PrepareCargo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CargoPacketApplication implements CommandLineRunner {

	public static final Logger LOG = LoggerFactory.getLogger(CargoPacketApplication.class);

	@Autowired PrepareCargo prepareCargo;
	public static void main(String[] args) {
		LOG.info("Application started.");
		SpringApplication.run(CargoPacketApplication.class, args);
		LOG.info("Application ended.");
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.print("7 kilgramlık sabunlardan kaç adet olsun: " );
		int sevenKg = scanner.nextInt();

		System.out.print("2 kilgramlık sabunlardan kaç adet olsun: " );
		int twoKg = scanner.nextInt();

		System.out.print("Toplam kaç kilogram kargo olsun: " );
		int cargoWeight = scanner.nextInt();

		int result = prepareCargo.prepareCargoPacket(sevenKg, twoKg, cargoWeight);

		System.out.println(result);

	}
}
