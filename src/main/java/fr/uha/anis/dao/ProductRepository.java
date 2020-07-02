package fr.uha.anis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.uha.anis.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
