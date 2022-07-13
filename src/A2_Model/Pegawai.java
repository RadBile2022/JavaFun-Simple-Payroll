package A2_Model;

public class Pegawai {
    // DATA
    private String jabatan;
    private String nama;
    private double gajiPokok;
    
    // CONSTRUCTOR
    public Pegawai(String jabatan, String nama, double gajiPokok) {
        this.jabatan = jabatan;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    
    // A. METHOD GETTER
    public String getJabatan() {
        return jabatan;
    }
    
    public String getNama(){
        return nama;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    
    // B. METHOD SETTER
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    // C. METHOD CETAK DATA BASE
    public String cetakData(){
        return getJabatan() +
               "\t" + getNama() +
               "\t Rp. " + getGajiPokok()+"\n";
    }
    
    // D. METHOD CETAK SLIP GAJI
    public String cetakGaji(){
        return  "Jabatan\t: " + getJabatan() +
                "\nNama\t: " + getNama() +
                "\nGaji Pokok\t: " + getGajiPokok() +
                "\n------------------------------------" +
                "\nTOTAL GAJI\t: " + getGajiPokok()+"\n\n";
     }
    
}