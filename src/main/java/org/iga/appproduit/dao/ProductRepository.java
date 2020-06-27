package org.iga.appproduit.dao;

import org.iga.appproduit.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin
public interface ProductRepository extends JpaRepository<Product, Long> {

}
