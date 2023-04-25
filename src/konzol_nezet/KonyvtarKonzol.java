package konzol_nezet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

class Konyv implements Serializable {

    String cim, szerzo1, szerzo2;
    int kiadasi_ev;

    public Konyv(String cim, String szerzo1, String szerzo2, int kiadasi_ev) {
        this.cim = cim;
        this.szerzo1 = szerzo1;
        this.szerzo2 = szerzo2;
        this.kiadasi_ev = kiadasi_ev;
    }

    @Override
    public String toString() {
        return "Konyv{" + "cim=" + cim + ", szerzo1=" + szerzo1 + ", szerzo2=" + szerzo2 + ", kiadasi_ev=" + kiadasi_ev + '}';
    }

}

public class KonyvtarKonzol {

    ArrayList<Konyv> konyvek = new ArrayList<>();

    public static void main(String[] args) {
        new KonyvtarKonzol().tartalom("");
    }

    private void feltoltes() {
        modell.Konyv k1 = new modell.Konyv("Ready Player one", "Ernest Cline", "", 2011);
        modell.Konyv k2 = new modell.Konyv("Harry Potter és a bölcsek köve", "J. K. Rowling", "", 2022);
        modell.Konyv k3 = new modell.Konyv("A Piros Alma", "Zöld Alma", "Piros Eper", 2023);

        konyvek.add(k1);
        konyvek.add(k2);
        konyvek.add(k3);
    }

    private void szerializalas() {
        FileOutputStream kiFajl;
        try {
            kiFajl = new FileOutputStream("konyvtar.bin");
            ObjectOutputStream kiObj = new ObjectOutputStream(kiFajl);
            kiObj.writeObject(konyvek);
            kiObj.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KonyvtarKonzol.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KonyvtarKonzol.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deszerializalas() {
        FileInputStream beFajl;
        try {
            beFajl = new FileInputStream("konyvtar.bin");
            ObjectInputStream beObj = new ObjectInputStream(beFajl);
            konyvek = (ArrayList<Konyv>) beObj.readObject();
            beObj.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KonyvtarKonzol.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(KonyvtarKonzol.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void tartalom(String cim) {
        System.out.println(cim);
        if (konyvek != null) {
            for (Konyv konyv : konyvek) {
                System.out.println(konyv);
            }
        } else {
            System.out.println("A lista üres.");
        }
    }
}
