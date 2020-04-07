package Class_Examples;

public class Person {

    public String name;
    public String email;
    public int age;


    public Person(String n, String e, int a) {

          name = n;
          email = e;
          age = a;
    }

   

    // Display name function

    public void displayName() {

          System.out.println(name);
    }

    // Display email

    public void displayEmail() {
          System.out.println(email);
    }

    public void displayAge() {
          System.out.println(age);
    }

    public void updateName(String n) {
          name = n;
    }

    public void updateEmail(String e) {
          email = e;
    }

    public void updateAge(int a) {
          age = a;
    }

}