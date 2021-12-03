package com.example.wzorceprojektowe.metoda_wytworcza;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    // wybieramy odpowiednia fabryke w zaleznosci od ustawien systemu
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

  // logika biznesowa odpowiednia dla wybranej fabryki
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
