package com.example.wzorceprojektowe.metoda_wytworcza;

public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test html Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Html button");
    }
}
