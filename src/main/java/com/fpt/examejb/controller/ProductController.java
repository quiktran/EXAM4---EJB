package com.fpt.examejb.controller;

import com.fpt.examejb.Model.ProductCrud;
import com.fpt.examejb.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class ProductController {

    @Autowired
    ProductCrud productCrud;
//    @Autowired
//    SaleCrud saleCrud;

    @RequestMapping(path = "/product/create", method = RequestMethod.GET)
    public String createProduct(){
        return "product-form";
    }


    @RequestMapping(path = "/product/create", method = RequestMethod.POST)
    public String saveProduct(Product product, BindingResult result){
        //        if(result.hasErrors()) return "product-form";
        productCrud.save(product);
        return "product-list";
    }

    @RequestMapping(path = "/product/list", method = RequestMethod.GET)
    public String getListProduct(Model model){
        ArrayList<Product> list = (ArrayList<Product>) productCrud.findAll();
        model.addAttribute("list", list);
        return "product-list";
    }

    @RequestMapping(path = "/product/delete/{id}", method = RequestMethod.POST)
    public String deleteProduct(@PathVariable int id) {
        Optional<Product> optionalProduct = productCrud.findById(id);
        if (optionalProduct.isPresent()) {
            productCrud.delete(optionalProduct.get());
            return "redirect:/product/list";
        } else {
            return "not-found";
        }
    }


}
