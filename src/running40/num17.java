package running40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class num17 {
     public int[] solution(int[] lottos, int[] win_nums) {
          // 겹치는 수 확인 >> 7-cnt = 최저순위
          // lottos - 안겹치는수 = 최고갯수 =
          // lottos >> arraylist >> .contains == 겹치는거
          // 0인거 count
          ArrayList winArr = Arrays.stream(win_nums).boxed().collect(Collectors.toCollection(ArrayList::new));
          long same = Arrays.stream(lottos).filter(winArr::contains).count(); // 0아니고 겹치는거 0~6
          long zero =  Arrays.stream(lottos).filter(n -> n==0).count(); // 0~6
          int good = (int)(7-same-zero);
          int bad = (int)(7-same);
          good = (good > 6) ? 6 : good; // zero =0, same = 0
          bad = (bad >6) ? 6 : bad;
          return new int[]{good, bad};
     }
     
     public static void main(String[] args) {
          num17 test = new num17();
     }
     // 다른분 코드
     // public int[] solution(int[] lottos, int[] winNums) {
     //        return LongStream.of(
     //                (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(winNums).anyMatch(w -> w == l) || l == 0).count(),
     //                (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(winNums).anyMatch(w -> w == l)).count()
     //        )
     //                .mapToInt(op -> (int) (op > 6 ? op - 1 : op))
     //                .toArray();
     //    }
}
