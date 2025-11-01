package baitap42;

public class TestPerson {
    public static void main(String[] args) {

        Person p1 = new Person("Nam", "Da Nang");
        System.out.println(p1);


        Student s1 = new Student("Huy", "Hue", "Computer Science", 2025, 15000000);
        System.out.println(s1);


        Staff st1 = new Staff("Thao", "Quang Nam", "VKU", 12000000);
        System.out.println(st1);
    }
}

