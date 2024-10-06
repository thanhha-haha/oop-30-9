//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String []args) {
        Student s = new Student("Le Thanh Ha", "2005", "23020530");
        System.out.println(s.getName() + " " + s.getYear() + " " + s.getMSSV());

        Teacher t = new Teacher("Le Phe Do", "1958");
        System.out.println(t.getName() + " " + t.getYear());
    }
}