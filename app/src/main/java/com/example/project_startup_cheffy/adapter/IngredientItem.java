package com.example.project_startup_cheffy.adapter;


public class IngredientItem {

    private String ingredient;
    private String quantity;

    public IngredientItem(String ingredient, String quantity) {
        setIngredient(ingredient);
        setQuantity(quantity);
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
