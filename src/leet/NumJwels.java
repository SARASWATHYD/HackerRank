package leet;

public class NumJwels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int numJewelsInStones(String J, String S) {
		 int res = 0;
	        for(int i = 0; i < S.length(); i++){
	            if(J.indexOf(S.charAt(i)) != -1){
	                res++;
	            }
	        }
	        return res;
	}

}
