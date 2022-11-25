import etc.car1;

public class Main {
     public int solution(int n) {
          return 0;
     }
     public static void main(String[] args) {
          int num =0 ;
          
          car1 c1 = new car1();
          c1.setGlob_str(123, "test");
          //c1.setGlob_str(20);
          System.out.println("setGlob_str2");
          num = (int)c1.setGlob_str2(20);
          double num2 = c1.setGlob_str2(20);
          
          System.out.println("setGlob_str2");
          num = 20;
          
          System.out.println("num > " + num);
          
//          car1 c3 = new car1("test123", 12);
//
//          car1 c2 = new car1();
//          System.out.println(System.identityHashCode(c1.glob_str));
//          System.out.println(System.identityHashCode(c2.glob_str));
//
//          System.out.println(System.identityHashCode(c1.glob_str2));
//          System.out.println(System.identityHashCode(c2.glob_str2));
//
//          car2 car2= new car2();
//          System.out.println(System.identityHashCode(car2.car1.glob_str));
//          System.out.println(System.identityHashCode(c1.glob_str));
//
//          String te = "test";
          
     }
}
// System.identityHashCode(Object)