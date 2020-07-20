
public class Level1_문자열을정수로바꾸기 {
	    public int solution(String s) {
	        int answer = 0;
	        
	        if( s.length()>=1 && s.length()<=5){
	            answer = Integer.parseInt(s);
	        }
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level1_문자열을정수로바꾸기 sol = new Level1_문자열을정수로바꾸기();
		
		System.out.printf("%d",sol.solution("1234"));
	}

}
