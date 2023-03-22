public class Pattern10{

public static void main(String args []){
	int a=74;
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
	System.out.print(" ");
	
			}
		for(int k=5-i+1;k<=i;k++){
		System.out.print((char)(a-k)+" ");
			
		}
	System.out.println();
	
	    }
		
	}
	
}