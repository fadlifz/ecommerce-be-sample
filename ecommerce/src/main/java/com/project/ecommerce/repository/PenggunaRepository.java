package com.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ecommerce.entity.Pengguna;

public interface PenggunaRepository extends JpaRepository<Pengguna, String>{
    
}
