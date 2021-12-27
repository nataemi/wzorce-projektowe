package com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.checkbox;

public class MacOSCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("Mac os checkbox clicked");
    }
}
