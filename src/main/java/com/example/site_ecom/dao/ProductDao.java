package com.example.site_ecom.dao;

import com.example.site_ecom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {

    List<Product> findByProd(String prod);
}
