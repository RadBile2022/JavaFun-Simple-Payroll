package A2_Model;

public class Controller {
    private Payroll payrollOn;
    private String descPayroll;
    private Pegawai pegawaiOn;

    public Controller(Payroll payrollOn) {
        this.payrollOn = payrollOn;
    }

    public String getDescPayroll() {
        return descPayroll;
    }

    public Pegawai getPegawaiOn() {
        return pegawaiOn;
    }

    public Payroll getPayrollOn() {
        return payrollOn;
    }
    
}
