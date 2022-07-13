package A2_Model;

public class Manager extends Pegawai{
    // DATA
    private double tunjangan;
    
    // CONSTRUCTOR
    public Manager( String jabatan, String nama, double gajiPokok, double tunjangan) {
        super(jabatan, nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
    
    // A. METHOD GETTER
    public double getTunjangan() {
        return tunjangan;
    }

    // B. METHOD CETAK DATA BASE (OVERRIDE KARENA SUBCLASS)
    @Override
    public String cetakData(){
        return  getJabatan() +
               "\t\t" + getNama() +
               "\t Rp. " + getGajiPokok()+
               "\t Rp. " + getTunjangan() + "\n";
    }     
    
    // C. METHOD CETAK SLIP GAJI (OVERRIDE KARENA SUBCLASS)
    @Override
    public String cetakGaji() {
        return  "Jabatan\t: " + getJabatan() +
                "\nNama\t: " + getNama() +
                "\nGaji Pokok\t: " + getGajiPokok() +
                "\nTunjangan\t: " + getTunjangan() +
                "\n------------------------------------" +
                "\nTOTAL GAJI\t: " + (getGajiPokok()+getTunjangan()+"\n\n");
    }
}