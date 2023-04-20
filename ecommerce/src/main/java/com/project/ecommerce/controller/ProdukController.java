package com.project.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ecommerce.entity.Produk;
import com.project.ecommerce.service.ProdukService;
import com.project.ecommerce.exception.BadRequestException;

@RestController
@RequestMapping("/api")
public class ProdukController {

    @Autowired
    private ProdukService produkService;

    @GetMapping("/produks")
    public List<Produk> findAll() {
        return produkService.findAll();
    }

    @GetMapping("/produks/{id}")
    public Produk findById(@PathVariable("id") String id) {
        return produkService.findById(id);
    }

    @PostMapping("/produks")
    public Produk create(@RequestBody Produk produk) {
        if (!StringUtils.hasText(produk.getNama())) {
            throw new BadRequestException("Nama produk tidak boleh kosong");
        }
        return produkService.create(produk);

    }

    @PutMapping("/produks")
    public Produk edit(@RequestBody Produk produk) {
        return produkService.create(produk);
    }

    @DeleteMapping("/produks/{id}")
    public void delete(@PathVariable("id") String id) {
        produkService.deleteById(id);
    }

}
