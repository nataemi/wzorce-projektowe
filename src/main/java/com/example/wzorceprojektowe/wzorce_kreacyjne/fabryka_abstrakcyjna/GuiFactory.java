package com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna;

import com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.button.Button;
import com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna.checkbox.Checkbox;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckBox();
}
