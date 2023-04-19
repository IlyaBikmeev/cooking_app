package ru.top.cooking_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.top.cooking_app.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
}
