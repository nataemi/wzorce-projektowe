package com.example.wzorceprojektowe.wzorce_kreacyjne.metoda_wytworcza;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
