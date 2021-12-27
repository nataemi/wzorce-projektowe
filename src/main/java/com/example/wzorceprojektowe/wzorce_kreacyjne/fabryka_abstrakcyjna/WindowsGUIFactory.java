package com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna;

import com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.button.Button;
import com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.button.WindowsButton;
import com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.checkbox.Checkbox;
import com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.checkbox.WindowsCheckbox;

public class WindowsGUIFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckbox();
    }
}
