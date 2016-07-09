
public class a211 {
	public static int[] pr;
	public static void main(String[] args){
		long x,sum=0,sx;
		int o=64000000;
		pr=a000.primes(3785086,o);
		for(int t=1;t<o;t++){
			x=c(t);
			sx=(long) Math.sqrt(x);
			if(sx*sx==x){
				//System.out.println(t);
				sum+=t;
			}
			if(t%(o/100)==0){
				System.out.println(t/(o/100));
			}
		}
		System.out.println(sum);
	}
	public static long c(int x){
		long l1=x,l3,f=1;
		int l2=0;
		br:
		while(l1!=1){
			while(true){
				if(l1<pr[l2]*pr[l2]){
					break br;
				}
				if(l1%pr[l2]==0){
					break;
				}
				l2++;
			}
			l3=(long) pr[l2]*pr[l2];
			while(l1%pr[l2]==0){
				l1/=pr[l2];
				l3*=pr[l2]*pr[l2];
			}
			f*=(l3-1)/(pr[l2]*pr[l2]-1);
		}
		return f*(l1*l1+1);
	}
}
