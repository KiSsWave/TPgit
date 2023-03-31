import java.io.*;

public class Fichier {

    public static void ecrireFichier(String nom, String phrase) throws IOException {
        PrintWriter pw = new PrintWriter(new File(nom));
        pw.println(phrase);
        pw.close();
    }
    
}
