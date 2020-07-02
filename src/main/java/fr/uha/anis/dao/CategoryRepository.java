package fr.uha.anis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.uha.anis.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
