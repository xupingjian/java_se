package com.it2;

public class Customers {
    private FoodMenu foodMenu;
    private final String name = "fsaf";
    public static final double PI = 3.14;
    public Customers() {
    }

    public Customers(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }
    //点菜
    public void order(){

        foodMenu.shizichaojidan();
        foodMenu.yuxiangrousi();
    }
}
