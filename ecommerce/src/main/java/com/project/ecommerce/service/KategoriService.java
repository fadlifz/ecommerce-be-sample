package com.project.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ecommerce.entity.Kategori;
import com.project.ecommerce.exception.ResourceNotFoundException;
import com.project.ecommerce.repository.KategoriRepository;

@Service
public class KategoriService {
    
    @Autowired
    private KategoriRepository kategoriRepository;

    public Kategori findById(String id){
        return kategoriRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Kategori dengan id "+ id +"tidak ditemukan"));
    }

    public List<Kategori> findAll(){
        return kategoriRepository.findAll();
    }

    public Kategori create(Kategori kategori){
        return kategoriRepository.save(kategori);
    }

    public Kategori edit(Kategori kategori){
        return kategoriRepository.save(kategori);
    }

    public void deleteById(String id){
        kategoriRepository.deleteById(id);
    }
    
}
