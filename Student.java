public class Student extends Person{
    private String MSSV;

    public Student(String name, String year, String MSSV) {
        super(name, year);
        this.MSSV = MSSV;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }
}