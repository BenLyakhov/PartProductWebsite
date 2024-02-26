
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
1. created "about.html" page and typed filler text for now
2. created link to mainscreen.html in about.html file
3. created a link to about.html in mainscreen.html file (doesn't work yet)

### Task E - Sample Inventory
Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

### Task F - Add "Buy Now Button"
Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

### Task G - Track Min/Max of Inventory
Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

### Task H - Validation Test of Min/Max of Inventory
Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

### Task I - Add at least 2 unit tests for the max and min fields of the PartTest class in the test package

### Task J - Remove the class files for any unused validaotors in order to clean up your code
