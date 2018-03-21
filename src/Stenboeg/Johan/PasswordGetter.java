package Stenboeg.Johan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PasswordGetter {

    private static final String FILENAME = "C:\\Users\\Johan Stenbøg\\Documents\\AutoLogin.txt";
    private String password;

    public String getPassword() {
        return password;
    }

    public PasswordGetter(){

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            String sCurrentLine;


            while ((sCurrentLine = br.readLine()) != null) {
                password = sCurrentLine;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
