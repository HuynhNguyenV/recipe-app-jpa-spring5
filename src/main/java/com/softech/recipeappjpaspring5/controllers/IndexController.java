package com.softech.recipeappjpaspring5.controllers;

import com.softech.recipeappjpaspring5.domain.Category;
import com.softech.recipeappjpaspring5.domain.UnitOfMeasure;
import com.softech.recipeappjpaspring5.repositories.CategoryRepository;
import com.softech.recipeappjpaspring5.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;

    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping(value = {"", "/","/index"})
    private String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("Vietnamese");
        Optional<UnitOfMeasure> measureOptional = unitOfMeasureRepository.findByDescription("Cup");

        System.out.println("Id category: " + categoryOptional.get().getId());
        System.out.println("Id Unit Of Measure: " + measureOptional.get().getId());

        return "index";
    }



}
