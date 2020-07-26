package fr.uha.anis;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.uha.anis.dao.CategoryRepository;
import fr.uha.anis.dao.ProductRepository;
import fr.uha.anis.entities.Category;
import fr.uha.anis.entities.Product;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)

public class SpringEcommerceBackendApplication implements CommandLineRunner {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringEcommerceBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		categoryRepository.save(new Category(1L, "Books"));
		categoryRepository.save(new Category(2L, "Software"));
		categoryRepository.save(new Category(3L, "Computers"));
		categoryRepository.save(new Category(4L, "Electronics"));
		
		productRepository.save(new Product(1L, "Effective Java", "Effective Java", "The Definitive Guide to Java Platform Best Practices–Updated for Java 7, 8, and 9", 65.78, "assets/images/products/1L.jpg", true, 22, new Date(), new Date(), categoryRepository.findById(1L).get()));
		productRepository.save(new Product(2L, "An Introduction to Real-World Programming with Java", "An Introduction to Real-World Programming with Java", "If you’re new to Java—or new to programming—this best-selling book will guide you through the language features and APIs of Java 11", 32.00, "assets/images/products/2L.jpg", true, 11, new Date(), new Date(), categoryRepository.findById(1L).get()));
		productRepository.save(new Product(3L, "Learning Spring Boot 2.0", "Learning Spring Boot 2.0", "Get up to date with the defining characteristics of Spring Boot 2.0 in Spring Framework 5", 34.12, "assets/images/products/3L.jpg", true, 1, new Date(), new Date(), categoryRepository.findById(1L).get()));
		productRepository.save(new Product(4L, "Python Crash Course, 2nd Edition", "Python Crash Course, 2nd Edition", "Second edition of the best-selling Python book in the world. A fast-paced, no-nonsense guide to programming in Python. Updated and thoroughly revised to reflect the latest in Python code and practices", 22.12, "assets/images/products/4L.jpg", true, 5, new Date(), new Date(), categoryRepository.findById(1L).get()));
		productRepository.save(new Product(5L, "Pro Angular 9: Build Powerful and Dynamic Web Apps", "Pro Angular 9: Build Powerful and Dynamic Web Apps", "This book has accompanying online files for Angular 9 and 10; all examples in the book work without changes in Angular 10.", 55.21, "assets/images/products/5L.jpg", true, 9, new Date(), new Date(), categoryRepository.findById(1L).get()));

		productRepository.save(new Product(6L, "Acer Swift 3 Thin & Light Laptop", "Acer Swift 3 Thin & Light Laptop", "AMD Ryzen 7 4700U Octa-Core Mobile Processor (Up to 4. 1GHz) with Radeon Graphics | 8GB LPDDR4 Memory | 512GB PCIe NVMe SSD", 23.34, "assets/images/products/6L.jpg", true, 2, new Date(), new Date(), categoryRepository.findById(3L).get()));
		productRepository.save(new Product(7L, "Samsung SSD 860 EVO 1TB 2.5 Inch SATA III Internal SSD", "Samsung SSD 860 EVO 1TB 2.5 Inch SATA III Internal SSD", "Innovative V-Nand Technology: Powered by Samsung V-Nand Technology, the 860 Evo SSD Offers Optimized Performance for Everyday Computing As Well as Rendering Large-Sized 4K Videos and 3D Data Used by the Latest Applications", 27.77, "assets/images/products/7L.jpg", true, 4, new Date(), new Date(), categoryRepository.findById(3L).get()));

		
		productRepository.save(new Product(8L, "Office Home And Student 2019", "Office Home And Student 2019 ", "Office 2019 Home and Student Box is delivered by post.\n" + 
				"Only license key - No CD.\n" + 
				"Only for Windows.", 44.53, "assets/images/products/8L.jpg", true, 5, new Date(), new Date(), categoryRepository.findById(2L).get()));
		productRepository.save(new Product(9L, "Nolo Quicken WillMaker & Trust 2020", "Nolo Quicken WillMaker & Trust 2020", "A customized Estate plan, including a will, revocable living trust (Individual and shared), health care directive, durable power of attorney for finances, and other essential documents", 34.53, "assets/images/products/9L.jpg", true, 6, new Date(), new Date(), categoryRepository.findById(2L).get()));

		productRepository.save(new Product(10L, "Huawei Nova 5T (128GB, 8GB)", "Huawei Nova 5T (128GB, 8GB)", "6.26 inches All-View Display, 16.7 million colours, FHD+ 2340 x 1080, LCD, 97% Screen to Body ratio, 3750 mAh battery", 66.33, "assets/images/products/10L.jpg", true, 7, new Date(), new Date(), categoryRepository.findById(4L).get()));
        
	}

}
