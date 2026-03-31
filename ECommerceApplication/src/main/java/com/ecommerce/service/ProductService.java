package com.ecommerce.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;

@Service
public class ProductService {

 @Autowired
 private ProductRepository repo;


 public List<Product> searchProducts(String keyword){

  return repo.searchProducts(keyword);

 }

}