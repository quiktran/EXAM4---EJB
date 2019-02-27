package com.fpt.examejb.Model;

import com.fpt.examejb.entity.Sale;
import org.springframework.data.repository.CrudRepository;

public interface SaleCrud extends CrudRepository<Sale, Integer> {
}
