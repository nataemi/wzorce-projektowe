package com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna;

import com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.button.Button;
import com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.checkbox.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GuiFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
