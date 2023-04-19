package ru.top.cooking_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.top.cooking_app.model.Recipe;
import ru.top.cooking_app.repository.RecipeRepository;

import java.util.List;

//    http://localhost:8080/recipes/7
@RestController
@RequestMapping(value = "/recipes")
public class RecipeController {

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping
    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Recipe getById(@PathVariable(value = "id") int recipeId) {
        return recipeRepository.findById(recipeId).get();
    }
}
