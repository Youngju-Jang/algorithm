package running40;

public class car2 {
     public car1 car1 = new car1("test", 123);
     public String glob_str = car1.glob_str;
     
     public car2() {
     }
     
     public car2(running40.car1 car1) {
          this.car1 = car1;
     }
}
