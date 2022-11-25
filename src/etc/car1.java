package etc;

public class car1 {
     // 필드
     public String glob_str = "test";
     public String glob_str2 = new String("test");
     
     int glob_int;
     static String global_static_str;
     static int glob_static_int;
     
     // 생성자
     public car1() {
     }
     
     public car1(String glob_str, int glob_int) {
          this.glob_str = glob_str;
          this.glob_int = glob_int;
     }
     
     //메소드
     public void setGlob_str(String glob_str) {
          this.glob_str = glob_str;
     }
     
     public void setGlob_str(int glob_str) {
          System.out.println("setGlob_str2");
     }
     
     public void setGlob_str(String glob_str, int test) {
          System.out.println("실행했습니다.");
          this.glob_str = glob_str;
     }
     
     public void setGlob_str(int test, String glob_str) {
          this.glob_str = glob_str;
     }
     
     public void setGlob_str2(String glob_str) {
          this.glob_str = glob_str;
          setGlob_str("test");
     }
     
     public double setGlob_str2(int glob_str) {
          
          
          System.out.println("setGlob_str2");
          
          return glob_str;
     }
     
}
