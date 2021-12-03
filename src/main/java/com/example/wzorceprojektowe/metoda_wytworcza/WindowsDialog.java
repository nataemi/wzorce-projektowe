package com.example.wzorceprojektowe.metoda_wytworcza;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
