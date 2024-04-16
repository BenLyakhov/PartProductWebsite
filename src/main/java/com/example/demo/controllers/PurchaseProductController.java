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



