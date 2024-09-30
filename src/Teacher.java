public class Teacher {
    String name;
    String year;

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
    public Teacher() {

    }
    public Teacher(String name, String year) {
        this.name = name;
        this.year = year;
    }
    public Teacher(Teacher s) {
        this.name = s.name;
        this.year = s.year;
    }
}
