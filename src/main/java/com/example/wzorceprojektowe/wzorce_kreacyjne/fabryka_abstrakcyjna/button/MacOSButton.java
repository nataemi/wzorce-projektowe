package com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.button;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("Mac OS Button created");
    }
}
