package com.fpt.examejb.Model;

import com.fpt.examejb.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrud extends CrudRepository<Product, Integer> {
}
