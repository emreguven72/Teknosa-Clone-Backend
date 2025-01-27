package com.emregvn.teknosa.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emregvn.teknosa.entities.concretes.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
