package com.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ecommerce.entity.Pesanan;

public interface PesananRepository extends JpaRepository<Pesanan, String>{
    
}
