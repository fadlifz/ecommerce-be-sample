package com.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ecommerce.entity.Keranjang;

public interface KeranjangRepository extends JpaRepository<Keranjang, String>{
    
}
