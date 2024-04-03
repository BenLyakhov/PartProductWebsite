
## Updates for D287 Java Fundamentals Project
### Task A - GitLab Repository
1. Clone repository from GitLab - done
2. Commit and push each completed task listed below (you may commit even if the task is not yet complete) - ongoing
3. Submit a copy of the Git repository URL and a copy of the branch history retrieved from the repository
 - URL: https://gitlab.com/wgu-gitlab-environment/student-repos/blyakho/d287-java-frameworks.git
 - Branch History: to be done at the end of the assignment

### Task B - Creating a ReadMe file
this task is ongoing throughout the entire assignment. whenever you make a change to the code that you cloned, you are supposed to write about it here

### Task C - Customize HTML
Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
1. In mainscreen.html, line 14: changed Title from "My Bicycle Shop" to "Ben's Hunting Arrow Shop"
2. In mainscreen.html, line 19: changed h1 header content from "Shop" to "Ben's Hunting Arrow Shop"
3. In mainscreen.html, line 21: changed h2 content from "Parts" to "Arrow Parts"
4. In mainscreen.html, line 53: changed h2 content from "Products" to "Complete Arrows"
5. Committed above changes to repository

### Task D - "About" Page
Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
1. Created "about.html" page and typed information about the shop on lines 22 to 34
2. Created link to mainscreen.html in about.html file, line 90
    -changed link from "http://localhost:8080/about" to "/about" to make the mapping work (see step 4)
3. Created a link to about.html in mainscreen.html file, line 23
4. Created a new controller named AboutPageController to link about.html and mainscreen.html

### Task E - Sample Inventory
Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

In BootStrapData.java, I added/changed the following:
1. line 32, added private final inhousePartRepository
2. line 35, added InhousePartRepository inhousePartRepository as one of the parameters of the BootStrap function
3. line 39, added the variable this.InhousePartRepository=inhousePartRepository
4. lines 46 to 54, changed the outsourced part from "out test" to "turkey broadhead"
5. lines 61 to 102, added 6 inhouse parts and saved them to the inhouse part repository.
6. lines 104 to 113, added the 5 products to the product repository.

### Task F - Add "Buy Now Button"
Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.
1. added the buy now button and notes on lines 85 to 88 in mainscreen.html.
2. added new class PurchaseProductController.java
3. created purchaseConfirmation.html file to indicate to the user a successful purchase.
4. in PurchaseProductController.java, created an if-else statement to decrement the inventory when the "buy now" button is pressed. included a check for if product.getInv() = 0.
5. The PurchaseProductController.java wasn't working in its own controller file; moved the code to the end of AddProductController.java, lines 176 to 191. the button is now working, and the correct webpage shows up depending on if the inventory is 0 or not.
6. 3/25/24 - in PurchaseProductController.java, lines 17 to 38, added code to decrement inventory value upon clicking the buy now button. need to work on the decrement portion (instructor appt made.)
7. 3/39/24 - AddProductController.java, added line 201, where it saves the product in the product service. Buy Now button is now working

### Task G - Track Min/Max of Inventory
Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
1. in Part.java, lines 33 to 35, lines 58 to 66, lines 99 to 102, added minInv and maxInv variables, created overloaded constructor, created setters and getters.
2. in Bootstrapdata.java, lines 47 to 116, added min and max inventory to all parts listed.
3. mainscreen.html, lines 46 to 48: inHousePartForm.html, lines 24 and 25: OutsourcedPartForm.html lines 25 and 26: added input fields for min and max inventory
4. application.properties: made a copy of the database file and renamed the file to version 2.
5. 3/29/24 - application.properties, deleted the database file in Windows file explorer (Users folder on C drive): program recreated database with new data for min and max inventory values
6. mainscreen.html, lines 38 and 39: added table headers for min inventory and max inventory.
7. made 2 new files: MaxInvValidator.java and ValidMaxInv.java. 
8. in part.java, line 136: added boolean of true or false if the user entered inventory is outside user max and min limits (added boolean isInRange on line 41 in part.java)
9. line 55 in AddOutsourcedPartController.java and line 45 in AddInhousePartController.java, added if statement that looked at the boolean value of part.isInventoryInRange() and determined if it would return the form again or return the confirmation

### Task H - Validation Test of Min/Max of Inventory
Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

### Task I - Add at least 2 unit tests for the max and min fields of the PartTest class in the test package

### Task J - Remove the class files for any unused validaotors in order to clean up your code

#### Other Notes:
I was having a really hard time figuring out how to get the springboot app to start working again.
Here's what I did:
1. Run/Debug Configuration Templates: SpringBoot and Maven
   1. SpringBoot: selected java21 as the build tool and the demoapplication as the source
   2. Maven: working directory set to demo.
2. I haven't tried this with just the springboot. 