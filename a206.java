

public class a206 {
	public static void main(String[] args){
		long a=100000007;
		long l;
		boolean j;
		System.out.println(a*a);
		while(true){
			l=a*a/100;
			j=true;
			for(int t=8;t>0;t--){
				if(l%10!=t){
					j=false;
					break;
				}
				l/=100;
			}
			if(j){
				System.out.println(a+" "+a*a);
			}
			a+=10;
		}
	}
}