public class Person {
    private String name;
    private String year;

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

    public Person() {

    }
    public Person(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public Person(Person s) {
        this.name = s.name;
        this.year = s.year;
    }
}
