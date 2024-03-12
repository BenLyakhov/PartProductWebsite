package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.context.ApplicationContext;


public class PurchaseProductController {
    @GetMapping("/purchaseproduct")// label of the buyNow button in mainscreen.html
    public String purchaseproduct(@RequestParam("productID") int theId, Model theModel) {
//        ProductService productService = context.getBean(ProductServiceImpl.class);
//        Product product3 = productService.findById(theId);
//
//        if (product3.getInv()!=0) {
//            int updatedInventory = product3.getInv() - 1;
//            product3.setInv(updatedInventory);
//            return "purchaseConfirmation";
//        } else {
//            return "purchaseError";
//        }
        // if inventory is not 0, return the confirmation. if the inventory is 0, return the error
        // html template.
        return "purchaseConfirmation";
    }
}

// notes: this file needs more work. Look at the @GetMapping("/deleteproduct") in the
// AddProductController.java. Something similar needs to be done, but instead of deleting a
// product, you are decreasing its inventory by one. If the inventory is zero, you can't buy a
// product, so you need to link to the html template that says you can't buy a product.

// the Product class has set and get Inv. I could probably call the get inv, set that value
// equal to a variable, decrement that variable by one, and use that value to set the inventory
// The issue is how to make the program do that with all parts, not just a specific one or two.

// also see lines 75 to 92 in the AddProductController.java
