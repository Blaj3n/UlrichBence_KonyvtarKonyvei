package modell;

public class Konyv {


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

    public static void main(String[] args) {
        
    }
    
}
