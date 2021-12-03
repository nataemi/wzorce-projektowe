package com.example.wzorceprojektowe.metoda_wytworcza;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
