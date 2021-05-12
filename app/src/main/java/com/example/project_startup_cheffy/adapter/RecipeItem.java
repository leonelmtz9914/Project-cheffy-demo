package com.example.project_startup_cheffy.adapter;



public class RecipeItem {

    private String image;
    private String name;

    public RecipeItem(String image, String recipeName) {
        setImage(image);
        setName(recipeName);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
