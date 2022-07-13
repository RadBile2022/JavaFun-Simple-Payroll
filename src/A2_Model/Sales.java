package A2_Model;

public class Sales extends Pegawai{
    // DATA
    private double bonus;
    
    // CONSTRUCTOR
    public Sales(String jabatan, String nama, double gajiPokok,double bonus) {
        super(jabatan, nama, gajiPokok);
        this.bonus = bonus;
    }
    
    // A. METHOD GETTER
    public double getBonus() {
        return bonus;
    }
    
    // B. METHOD CETAK DATA BASE (OVERRIDE KARENA SUBCLASS)
    @Override
     public String cetakData(){
        return   getJabatan() +
               "\t\t" + getNama() +
               "\t Rp. " + getGajiPokok()+
               "\t Rp. " + getBonus() + "\n";
     }

    // C. METHOD CETAK SLIP GAJI (OVERRIDE KARENA SUBCLASS)
    @Override
    public String cetakGaji() {
        return  "Jabatan\t: " + getJabatan() +
                "\nNama\t: " + getNama() +
                "\nGaji Pokok\t: " + getGajiPokok() +
                "\nBonus\t: " + getBonus() +
                "\n------------------------------------" +
                "\nTOTAL GAJI\t: " + (getGajiPokok()+getBonus()+"\n\n");
    }


}