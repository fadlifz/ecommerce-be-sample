package com.project.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ecommerce.entity.Produk;
import com.project.ecommerce.exception.ResourceNotFoundException;
import com.project.ecommerce.repository.ProdukRepository;

@Service
public class ProdukService {
    
    @Autowired
    private ProdukRepository produkRepository;

    public Produk findById(String id){
        return produkRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("produk dengan id "+ id +"tidak ditemukan"));
    }

    public List<Produk> findAll(){
        return produkRepository.findAll();
    }

    public Produk create(Produk produk){
        return produkRepository.save(produk);
    }

    public Produk edit(Produk produk){
        return produkRepository.save(produk);
    }

    public Produk ubahGambar(String id, String gambar){
        Produk produk = findById(id);
        produk.setGambar(gambar);
        return produkRepository.save(produk);
    }

    public void deleteById(String id){
        produkRepository.deleteById(id);
    }
    
}
