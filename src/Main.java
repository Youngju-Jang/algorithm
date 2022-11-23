import running40.car1;
import running40.car2;

public class Main {
     public static void main(String[] args) {
          car1 car1 = new car1("test", 123);
          System.out.println(System.identityHashCode(car1));
     
          car2 car2 = new car2();
          String test = car2.glob_str;
          System.out.println(car2.car1.hashCode());
     
          System.out.println(System.identityHashCode("test")+" : " + System.identityHashCode(new String("test")));
     }
}