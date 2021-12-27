package com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.checkbox;

public class WindowsCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("Windows checkbox checked");
    }
}
