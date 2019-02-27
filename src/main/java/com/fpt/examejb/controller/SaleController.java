package com.fpt.examejb.controller;

import com.fpt.examejb.Model.SaleCrud;
import com.fpt.examejb.entity.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SaleController {

    @Autowired
    SaleCrud saleCrud;

    @RequestMapping(path = "/sale/update", method = RequestMethod.GET)
    public String updateSale(){
        return "sale-form";
    }


    @RequestMapping(path = "/sale/update", method = RequestMethod.POST)
    public String saveSale(Sale sale,  BindingResult result){
//        if(result.hasErrors()) return "sale-form";
        saleCrud.save(sale);
        return "product-list";
    }

}
