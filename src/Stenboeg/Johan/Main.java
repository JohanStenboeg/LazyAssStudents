package Stenboeg.Johan;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main( String[] args ) {
        if (Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(new URI("https://hotspot.sszcloud.dk/fs/customwebauth/easjlogin.html"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }

    }

}
