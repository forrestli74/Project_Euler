

public class a137 {
	public static void main(String[] args){
		long a,b,l;
		a=2;b=15;
		for(int t=3;t<=15;t++){
			l=b*7-a+1;
			a=b;
			b=l;
		}
		System.out.println(b);
	}	
}
