package com.example.wzorceprojektowe.wzorce_kreacyjne.fabryka_abstrakcyjna;

public class FactoryConfiguration {
    private static Application configureApplication() {
        Application app;
        GuiFactory factory;
        String osName = "windows";
        if (osName.contains("mac")) {
            factory = new MacOsGUIFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsGUIFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
