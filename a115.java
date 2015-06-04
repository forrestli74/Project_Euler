

public class a115 {
	public static void main(String[] args){
		
		int o=50;
		long a[]=new long[o+1];
		long f=2,l;
		a[0]=1;a[o]=1;
		int t1=o;
		while(f<=1000000){
			l=a[o];
			for(int t2=o;t2>0;t2--){
				a[t2]=a[t2-1];
			}
			a[o]+=l;
			a[0]+=l;
			f+=a[0];
			t1++;
		}
		System.out.println(t1);
	}
}
