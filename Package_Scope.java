
package Eksplorasi;
public class Package_Scope {

    public static void main(String[] args) {
        Mamalia kucing = new Mamalia("Kucing",4, "Tipis");
        System.out.println("Mamalia "+kucing.getNama()+" mempunyai "+kucing.getRuangJantung()
                +" ruang jantung dan mempunyai rambut yang "+kucing.getJenisRambut());
    }
    
}

class Mamalia{
    private String nama;
    private int ruangJantung;
    private String jenisRambut;
    
    public Mamalia(String _nama, int _ruangJantung, String _jenisRambut){
        nama = _nama;
        ruangJantung = _ruangJantung;
        jenisRambut = _jenisRambut;
    }

    public int getRuangJantung() {
        return ruangJantung;
    }

    public String getJenisRambut() {
        return jenisRambut;
    }

    public String getNama() {
        return nama;
    }
    
    
    
}
