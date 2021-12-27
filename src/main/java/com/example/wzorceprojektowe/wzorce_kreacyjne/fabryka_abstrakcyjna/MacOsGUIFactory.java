package com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna;

import com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.button.Button;
import com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.button.MacOSButton;
import com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.checkbox.Checkbox;
import com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.checkbox.MacOSCheckbox;

public class MacOsGUIFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacOSCheckbox();
    }
}
