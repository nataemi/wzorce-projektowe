package com.example.wzorceprojektowe.wzorce_kreacyjne.metoda_wytworcza;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
