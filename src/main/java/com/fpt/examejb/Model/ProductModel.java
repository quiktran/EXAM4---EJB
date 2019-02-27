package com.fpt.examejb.Model;

import com.fpt.examejb.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductModel extends PagingAndSortingRepository<Product, Integer> {
}
