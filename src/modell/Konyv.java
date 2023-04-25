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

    public String getCim() {
        return cim;
    }

    public String getSzerzo1() {
        return szerzo1;
    }

    public String getSzerzo2() {
        return szerzo2;
    }

    public int getKiadasi_ev() {
        return kiadasi_ev;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public void setSzerzo1(String szerzo1) {
        this.szerzo1 = szerzo1;
    }

    public void setSzerzo2(String szerzo2) {
        this.szerzo2 = szerzo2;
    }

    public void setKiadasi_ev(int kiadasi_ev) {
        this.kiadasi_ev = kiadasi_ev;
    }
    
    
    @Override
    public String toString() {
        return "Konyv{" + "cim=" + cim + ", szerzo1=" + szerzo1 + ", szerzo2=" + szerzo2 + ", kiadasi_ev=" + kiadasi_ev + '}';
    }

    public static void main(String[] args) {
        
    }
    
}
