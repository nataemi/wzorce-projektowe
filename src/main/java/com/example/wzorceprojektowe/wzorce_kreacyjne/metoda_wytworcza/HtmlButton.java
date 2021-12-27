package com.example.wzorceprojektowe.wzorce_kreacyjne.metoda_wytworcza;

public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test html Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Html button");
    }
}
