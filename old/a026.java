
public class a026 {
	public static void main(String[] args){
		int n=1000;
		long l;
		int c=0;
		while(n>0&&c!=1){
			l=1;c=0;
			for(int t=0;t<n-1;t++){
				l*=10;
				l=l%n;
				if(l==1){
					c++;
				}
			}
			n--;
		}
		System.out.println(n+1);
	}
}
