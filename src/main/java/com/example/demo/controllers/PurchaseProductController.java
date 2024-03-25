package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@Controller
public class PurchaseProductController {

    @Autowired
    //private ApplicationContext context;
    private ProductRepository productRepository;

    @PostMapping("/purchaseproduct")// label of the buyNow button in mainscreen.html
    public String purchaseproduct(@RequestParam("productID") int theId, Model theModel) {
//        ProductService productService = context.getBean(ProductServiceImpl.class);
//        Product theProduct = productService.findById(theId);

        long theIdl = (long) theId; // product Repository needs the id to be long, not int.
        Optional<Product> product = productRepository.findById(theIdl);

            Product theProduct = product.get();
            if (theProduct.getInv() != 0) { // if the inventory is not zero
                int decrementedInv = (theProduct.getInv() - 1); // decrement inventory by one
                theProduct.setInv(decrementedInv); // set the inventory to the new value
                productRepository.save(theProduct); // save it back into the repository
                return "purchaseConfirmation";
            } else return "purchaseError";

    } // end String purchaseproduct
} // end PurchaseProductController

// STUCK: the values don't decrement. the controller points to the correct html page (if the inventory
// is not zero, it redirects to purchaseConfirmation.html. If the inventory is zero, it redirects
// to purchaseError.)
// The issue Im having is the inventory does not decrement: I don't know how else to do this part.

// see lines 75 to 92 in the AddProductController.java
