

public class a302b {
	static long o=1000000;
	static int oo=78498;
	static int c=0;
	static boolean[] b=new boolean[(int) o];
	static int[] p=new int[oo];
	public static void main(String[] args){
		//o*=o;
		long ll;
		for(int t0=2;t0<o;t0++){
			if(!b[t0]){
				p[c]=t0;
				c++;
				for(int t1=t0*2;t1<o;t1+=t0){
					b[t1]=true;
				}
			}
		}
		for(long t=2;t<o;t++){
			ll=c(t);
			if(ll!=0&&c(ll)!=0){
				System.out.println(t);
			}
		}
	}
	public static long c(long a){
		int l=0;
		long b=a;
		while(a!=1){
			if(a%p[l]==0){
				a/=p[l];
				b=b/p[l]*(p[l]-1);
				if(a%p[l]!=0){
					return 0;
				}else{
					while(a%p[l]==0){
						a/=p[l];
					}
				}
			}
			l++;
		}
		return b;
	}
}
