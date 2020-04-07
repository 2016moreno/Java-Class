package Class_Examples;

public class Main {

	 

    public static void main(String[] args) {

          Person p = new Person ("David", "whatup@gmail.com", 18);
          p.displayName();
          p.displayEmail();
          p.displayAge();

          p.updateName("Dave");
          p.updateEmail("update@aol.com");
          p.updateAge(16);

         

          p.displayName();
          p.displayEmail();
          p.displayAge();

         

    }

}
