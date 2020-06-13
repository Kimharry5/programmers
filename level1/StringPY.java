
class StringPY {
    boolean solution(String s) {
        boolean answer = true;
        
       String[] s_arrays = new String[50] ;
       s_arrays = s.split("");
       
       int p=0, y=0;
       
       for(int i = 0 ; i < s_arrays.length; i++) {
    	   if ( s_arrays[i].equals("p") || s_arrays[i].equals("P")) 
    		   p++;
    	   
    	   else if (s_arrays[i].equals("y") || s_arrays[i].equals("Y") )
    		   y++;
    	   
       }
       if( p != y )
		   answer = false;
       
	return answer;
    }
    public static void main(String[] args){
    	StringPY sol = new StringPY ();
        System.out.println("s = pPoooyY: " + sol.solution("pPyY"));
        System.out.println("s = Pyy: " + sol.solution("PyyY"));
    }
}