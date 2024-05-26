package StudyGroup.Study0405;

//SKY반에는 학생 A,B,C,D,E,F,G가 있고 각 학생의 점수는 80,45,29,78,64,98,57 이다.
//SKY반 학생들의 성적을 하나의 배열로 보관하고,
//SKY반 학생의 평균,평균,최고점,최저점을 구하시오.
public class HW03 {
    public static void main(String[] args) {
        int a = 80, b = 45, c = 29, d = 78, e = 64, f = 98,g = 57;
        int [] skyClass = {a,b,c,d,e,f,g};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
          for (int i = 0; i < skyClass.length; i++) {
              if (max < skyClass[i]) {
                  max = skyClass[i];
              }
              if (min > skyClass[i]) {
                  min = skyClass[i];
              }
        }
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);
    }
}
