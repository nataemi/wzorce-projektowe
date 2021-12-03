package com.example.wzorceprojektowe.metoda_wytworcza;

//bazowy wytworca
public abstract class Dialog {

    //metoda z logika biznesowa
    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    //klasy musza nadpisac ta metode i stworzyc odpowiedni Button
    public abstract Button createButton();
}
