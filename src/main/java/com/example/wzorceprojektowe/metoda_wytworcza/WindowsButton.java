package com.example.wzorceprojektowe.metoda_wytworcza;

public class WindowsButton implements Button {
    public void render() {
        System.out.println("<button>Test windows Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Windows Button says - 'Hello World!'");
    }
}
