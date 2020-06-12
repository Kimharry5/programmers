public class WaterMelon  {
    public String solution(final int n) {
        String answer = "";
        final StringBuffer strAnswer = new StringBuffer(answer);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                answer = "수";

            else
                answer = "박";

            strAnswer.append(answer);
        }

        return strAnswer.toString();
    }

    public static void main(String[] args){
        WaterMelon  sol = new WaterMelon ();
        System.out.println("n이 3인 경우: " + sol.solution(3));
        System.out.println("n이 4인 경우: " + sol.solution(4));
    }
}