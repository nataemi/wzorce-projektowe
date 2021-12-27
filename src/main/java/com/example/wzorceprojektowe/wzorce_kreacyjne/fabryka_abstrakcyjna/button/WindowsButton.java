package com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.button;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Windows button clicked");
    }
}
