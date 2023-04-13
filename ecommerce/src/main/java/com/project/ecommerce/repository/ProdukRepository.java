package com.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ecommerce.entity.Produk;

public interface ProdukRepository extends JpaRepository<Produk, String>{
    
}
