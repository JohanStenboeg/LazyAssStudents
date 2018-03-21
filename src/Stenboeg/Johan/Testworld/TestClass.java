package Stenboeg.Johan.Testworld;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class TestClass {
    public static void main(String[] args) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");





        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("https://hotspot.sszcloud.dk/fs/customwebauth/easjlogin.html"));

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Something went wrong;D");
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }

        }
    }
}
