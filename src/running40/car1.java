package running40;

public class car1 {
     public String glob_str;
     int glob_int;
     static String global_static_str;
     static int glob_static_int;
     
     public car1() {
     }
     
     public car1(String glob_str, int glob_int) {
          this.glob_str = glob_str;
          this.glob_int = glob_int;
     }
     
     public void setGlob_str(String glob_str) {
          this.glob_str = glob_str;
     }
}
