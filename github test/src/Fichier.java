import java.io.*;

public class Fichier {

    public static void ecrireFichier(String nom, String phrase) throws IOException {
        PrintWriter pw = new PrintWriter(new File(nom));
        pw.println(phrase);
        pw.close();
    }

    public static void main(String[] args) throws IOException {
        Fichier.ecrireFichier("newF.txt", "la phrase");
        Fichier.readFile("newF.txt");
    }

    public static void readFile(String nomFich) throws IOException {
        BufferedReader fich =  new BufferedReader(new FileReader(nomFich));
        String line = fich.readLine();
        System.out.println(line);
    }
    
}
