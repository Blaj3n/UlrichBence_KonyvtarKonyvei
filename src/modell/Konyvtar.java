package modell;

import java.util.ArrayList;


public class Konyvtar {
    private static ArrayList<Konyv> konyvek;
    
    public static void main(String[] args) {
        Konyv k1 = new Konyv("Ready Player one", "Ernest Cline", "", 2011);
        Konyv k2 = new Konyv("Harry Potter és a bölcsek köve", "J. K. Rowling", "", 2022);
        Konyv k3 = new Konyv("A Piros Alma", "Zöld Alma", "Piros Eper", 2023);
        
        konyvek.add(k1);
        konyvek.add(k2);
        konyvek.add(k3);
        
        System.out.println(konyvek);
    }
}
