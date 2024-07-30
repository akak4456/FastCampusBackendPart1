package com.adele;

public class Customer {

    public void order(String menuName, Menu menu, Cooking cooking) {
        MenuItem menuItem = menu.choose(menuName);
        cooking.makeCook(menuItem);
        // 해당 요리를 먹어
    }
}
