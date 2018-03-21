package Stenboeg.Johan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PasswordGetter {

    private static final String FILENAME = "C:\\Users\\Johan Stenbøg\\Documents\\AutoLogin.txt";

    public static String getFILENAME() {
        return FILENAME;
    }

    public PasswordGetter(){

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            String sCurrentLine;


            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
