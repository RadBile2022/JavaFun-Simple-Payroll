package A2_Model;

// *IMPORT DECLARATION AND PACKAGE
import java.util.ArrayList;
import java.util.List;

// *CLASS
public class Payroll {
    // DATA
    private String descMonth;
    private String descYear;
    private List <Pegawai> listPegawai = new ArrayList <>();

    // CONSTRUCTOR
    public Payroll(String descMonth, String descYear) {
        this.descMonth = descMonth;
        this.descYear = descYear;
    }
    
    // A. METHOD GETTER
    public String getDescMonth() {
        return descMonth;
    }

    public String getDescYear() {
        return descYear;
    }

    public List<Pegawai> getListPegawai() {
        return listPegawai;
    }
    
    // B. METHOD ADD (ARRAY LIST)
    public void addPegawai (Pegawai p){
        listPegawai.add(p);
    }
      
    // C. METHOD REGISTRASI REKENING
    public void registrasiPegawai (Pegawai p){
        addPegawai(p);
        p.setJabatan(p.getJabatan());
        p.setNama(p.getNama());
    }
    
    // D. METHOD CETAK DESKRIPSI
    public String CetakDeskripsi (){
        return "GAJI BULAN " + getDescMonth().toUpperCase() +
                " " + getDescYear() + "\n";
    }
    
}