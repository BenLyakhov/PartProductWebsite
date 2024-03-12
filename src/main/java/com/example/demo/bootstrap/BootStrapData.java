package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;


    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository=inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

// listing at least one item as an outsourced part
        OutsourcedPart turkeyBroadhead = new OutsourcedPart();
        turkeyBroadhead.setCompanyName("Sirius Archery");
        turkeyBroadhead.setName("turkey broadhead");
        turkeyBroadhead.setPrice(5.0);
        turkeyBroadhead.setInv(25);
        turkeyBroadhead.setId(10001);
        outsourcedPartRepository.save(turkeyBroadhead);

// printing out the items in the outsourced parts list

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }
// creating in house parts:
        InhousePart hundredGFP = new InhousePart(); // 100 grain field point
        hundredGFP.setName("100 grain field point");
        hundredGFP.setPrice(2.25);
        hundredGFP.setInv(10);
        hundredGFP.setId(1001);
        inhousePartRepository.save(hundredGFP);

        InhousePart twoFiftyGFP = new InhousePart(); // 250 grain field point
        twoFiftyGFP.setName("250 grain field point");
        twoFiftyGFP.setPrice(5.0);
        twoFiftyGFP.setInv(15);
        twoFiftyGFP.setId(2501);
        inhousePartRepository.save(twoFiftyGFP);

        InhousePart hundredGBH = new InhousePart();
        hundredGBH.setName("100 grain broadhead");
        hundredGBH.setPrice(10.0);
        hundredGBH.setInv(20);
        hundredGBH.setId(1002);
        inhousePartRepository.save(hundredGBH);

        InhousePart twoFiftyGBH = new InhousePart();
        twoFiftyGBH.setName("250 grain broadhead");
        twoFiftyGBH.setPrice(15.0);
        twoFiftyGBH.setInv(23);
        twoFiftyGBH.setId(2502);
        inhousePartRepository.save(twoFiftyGBH);

        InhousePart standardFletchings = new InhousePart();
        standardFletchings.setName("standard fletchings (pack of 3)");
        standardFletchings.setPrice(2.5);
        standardFletchings.setInv(30);
        standardFletchings.setId(1);
        inhousePartRepository.save(standardFletchings);

        InhousePart turkeyFletchings = new InhousePart();
        turkeyFletchings.setName("turkey fletchings (pack of 3)");
        turkeyFletchings.setPrice(3.0);
        turkeyFletchings.setInv(25);
        turkeyFletchings.setId(2);
        inhousePartRepository.save(turkeyFletchings);

        Product lightPracticeArrow= new Product("light practice arrow",45.0,5);
        Product heavyPracticeArrow= new Product("heavy practice arrow",50.0,5);
        Product lightHuntingArrow = new Product("light hunting arrow", 50.0, 5);
        Product heavyHuntingArrow = new Product("heavy hunting arrow", 55.0, 5);
        Product turkeyArrow = new Product("turkey arrow", 45.0, 5);
        productRepository.save(lightPracticeArrow);
        productRepository.save(heavyPracticeArrow);
        productRepository.save(lightHuntingArrow);
        productRepository.save(heavyHuntingArrow);
        productRepository.save(turkeyArrow);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
