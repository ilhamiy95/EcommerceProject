package com.example.site_ecom.controller;

import com.example.site_ecom.dao.CategoryDao;
import com.example.site_ecom.dao.ProductDao;
import com.example.site_ecom.exception.UserNotFoundException;
import com.example.site_ecom.model.Category;
import com.example.site_ecom.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryDao categoryDao;
    @Autowired
    ProductDao productDao;

    @GetMapping
    public Page<Category> categorys(Pageable pageable) {


        return categoryDao.findAll(pageable);
    }


    @DeleteMapping("/{id}")
    public void supp(@PathVariable Long id) {

        categoryDao.deleteById(id);
    }

    @GetMapping("/{id}")
    public Category getcategoryById(@PathVariable Long id) {
        Optional<Category> byId = categoryDao.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        } else {
            throw new UserNotFoundException("user not exist with id :" + id);
        }

    }

    @PostMapping
    ResponseEntity<Category> crt(@Valid @RequestBody Category category) {
        List<Product> products = category.getProducts();
        if(products !=null && !products.isEmpty()){
            for( Product product :products ){
                //product.setCategory(category);
                productDao.saveAndFlush(product);

            }
            //productDao.saveAllAndFlush(products);
        }
        Category g1 = categoryDao.save(category);
        return ResponseEntity.ok(g1);
    }

    @PutMapping("/{id}")
    public Category mod(@PathVariable Long id, @RequestBody Category category) {
        category.setId(id);
        return categoryDao.save(category);
    }


}


