package org.iga.appproduit;

import java.util.Random;

import org.iga.appproduit.dao.ProductRepository;
import org.iga.appproduit.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.bytebuddy.utility.RandomString;

@SpringBootApplication
public class AppProduitApplication implements CommandLineRunner {
	
	private ProductRepository productRepository;
	
	public AppProduitApplication(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppProduitApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Random random = new Random();
		for(int i=0;i<120;i++) {
			productRepository.save(new Product(null,RandomString.make(5),100+random.nextDouble()*4900));
		}
	}

}
