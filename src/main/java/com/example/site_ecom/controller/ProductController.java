package com.example.site_ecom.controller;

import com.example.site_ecom.dao.ProductDao;
import com.example.site_ecom.dao.CategoryDao;
import com.example.site_ecom.exception.VoitureNotFoundException;
import com.example.site_ecom.model.Category;
import com.example.site_ecom.model.ImageModel;
import com.example.site_ecom.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.util.*;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200") //kikhlih idkhel pour yconsommer
public class ProductController {

    @Autowired
    ProductDao productDao;
    @Autowired
    CategoryDao categoryDao;

    @GetMapping
    public List<Product> getProduct() {
        return productDao.findAll();
    }

    @GetMapping("/{id}")
    public Product aff(@PathVariable Long id) {
        Optional<Product> id1 = productDao.findById(id);
        if (id1.isPresent()) {
            return id1.get();
        } else {
            throw new VoitureNotFoundException("voiture de id:" + id + "non trouvé");
        }
    }

    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    ResponseEntity<Product> crt(@RequestPart("product") Product product,
                                @RequestPart("imageFile") MultipartFile[] file) {
        try {
            Product produit1 = productDao.save(product);
            return ResponseEntity.ok(produit1);


        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    public void uploadImage(MultipartFile[] multipartFiles) throws IOException {
        Set<ImageModel> imageModels = new HashSet<>();

        for (MultipartFile file : multipartFiles) {
            ImageModel imageModel = new ImageModel(
                    file.getOriginalFilename(),
                    file.getContentType(),
                    file.getBytes());

        }
    }

    @DeleteMapping("/{id}")
    public void supresion(@PathVariable Long id) {
        productDao.deleteById(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        return productDao.save(product);
    }

    @PostMapping("/addProductToCategory/{categoryName}")
    public Product addProductToCategory(@RequestBody Product product, @PathVariable String categoryName) {
        Category category = categoryDao.findByName(categoryName);
        product.setCategory(category);
        return productDao.save(product);
    }


}
