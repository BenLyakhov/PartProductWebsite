package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class PurchaseProductController {
    @GetMapping("/purchaseConfirmation")
    public String purchaseConfirmation() {
        return "purchaseConfirmation";
    }
}

// notes: this file needs more work. when you click on "Buy Now", you need the small
// dialogue box that pops up in browser (the same box that shows up when you click on
// the delete button: "are you sure you want to delete the product?"
// when you click on "buy now", that box should show up, and you should redirect to the
// purchaseConfirmation page. Or, create an error handle (another webpage) that says the
// buying was unsuccessful.
