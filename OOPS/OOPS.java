public class OOPS {
    public static void main(String[] args) {
        Ekant e1 = new Ekant();
        e1.fathername = "Sushil Kumar";
        System.out.println(e1.fathername);
        e1.mothername = "Usha devi";
        System.out.println(e1.mothername);
        e1.age = 17;
        System.out.println(e1.age);
    }
}

class Ekant {
    String fathername;
    String mothername;
    int age;

    String getname() {
        return this.fathername;
    }
}