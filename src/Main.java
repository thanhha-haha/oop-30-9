//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Le Thanh Ha");
        p1.setYear("2005");

        Teacher t1 = new Teacher();
        t1.setName("Le Phe Do");
        t1.setYear("1950");

        Student s1 = new Student();
        s1.setMssv("23020530");
        s1.setName("Le Thanh Ha");
        s1.setYear("2005");

        System.out.println(s1.getName());
    }
}