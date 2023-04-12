package com.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ecommerce.entity.Kategori;

public interface KategoriRepository extends JpaRepository<Kategori, String>{
    
}
