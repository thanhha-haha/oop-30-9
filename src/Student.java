public class Student {
    private String name;
    private String year;
    private String mssv;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public Student() {

    }
    public Student(String name, String year, String mssv) {
        this.name = name;
        this.year = year;
        this.mssv = mssv;
    }

    public Student(Student s) {
        this.name = s.name;
        this.year = s.year;
        this.mssv = s.mssv;
    }
}
