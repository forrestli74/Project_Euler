

public class a114 {
	public static void main(String[] args){
		
		int o=3;
		long a[]=new long[o+1];
		long f=0,l;
		a[0]=1;a[o]=1;
		for(int t1=o+1;t1<=50;t1++){
			l=a[o];
			for(int t2=o;t2>0;t2--){
				a[t2]=a[t2-1];
			}
			a[o]+=l;
			a[0]+=l;
		}
		for(int t=0;t<=o;t++){
			f+=a[t];
		}
		System.out.println();
	}
}
