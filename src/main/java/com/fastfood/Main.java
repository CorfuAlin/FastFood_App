package com.fastfood;

public class Main {

    public static void main(String[] args) {
        com.fastfood.Hamburger hamburger =
                new com.fastfood.Hamburger("Basic", "Sausage", 3.56D, "White");

        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27D);
        hamburger.addHamburgerAddition2("Lettuce", 0.75D);
        hamburger.addHamburgerAddition3("Cheese", 1.13D);
        System.out.println("Total Burger price is " + price + "$");

        com.fastfood.HealthyBurger healthyBurger = new com.fastfood.HealthyBurger("Bacon", 5.67D);
        healthyBurger.addHamburgerAddition1("Egg", 5.43D);
        healthyBurger.addHealthAddition1("Lentils", 3.41D);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger() + "$");

        com.fastfood.DeluxeBurger db = new com.fastfood.DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53D);
        db.itemizeHamburger();
    }
}

