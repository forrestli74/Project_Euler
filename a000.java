
public class a000{
	public static long sqrt(long x){
		long a=x;
		long b=a+1;
		while(a!=b){
			b=a;
			a=a+((x-1)/a-a)/2;
		}
		return a;
	}
	public static boolean sqrtif(long x){
		boolean j=false;
		long a=x;
		long b=a+1;
		while(a!=b){
			b=a;
			a=a-(a*a-x+1)/a/2;
		}
		if(b*b==x){
			j=true;
		}
		return j;
	}
	public static int[] primes(int size,int lim){
		lim/=2;
		BArray data=new BArray(lim);
		int[] f=new int[size];
		f[0]=2;
		int t=1,tt=4,rt=3,ft=1;
		while(tt<lim&&ft<size){
			if(!data.get(t)){
				rt=t*2+1;
				f[ft]=rt;
				ft++;
				for(int a=tt;a<lim;a+=rt){
					data.set(a,true);
				}
			}
			t++;
			tt+=4*t;
		}
		while(t<lim&&ft<size){
			
			if(!data.get(t)){
				f[ft]=2*t+1;
				ft++;
			}
			t++;
		}
		return f;
	}
	public static boolean primeif(long x){
		boolean j=true;
		return j;
	}
	public static long divsum(long x){
		long l1=x,l2=2,l3,f=1;
		boolean j;
		while(l1!=1){
			j=true;
			while(j){
				if(l1%l2==0){
					j=false;
				}else{
					l2++;
				}
			}
			l3=l2;
			while(l1%l2==0){
				l1/=l2;
				l3*=l2;
			}
			f*=(l3-1)/(l2-1);
		}
		return (f-x);
	}
	public static long divcount(long x){
		long l1=x,l2=2,l3,f=1;
		boolean j;
		while(l1!=1){
			j=true;
			while(j){
				if(l1%l2==0){
					j=false;
				}else{
					l2++;
				}
			}
			l3=1;
			while(l1%l2==0){
				l1/=l2;
				l3++;
			}
			f*=l3;
		}
		return f;
	}
	public static long fact(long x){
		long f=1;
		for(long t=2;t<=x;t++){
			f*=t;
		}
		return f;
	}
	public static long c(long n,long a){
		long f=1,l=1;
		for(int t=0;t<a;t++){
			f*=(n-t);
			l*=(t+1);
		}
		return f/l;
	}
	public static long GCD(long a,long b){
		long l1,l2,l;
		if(a<b){
			l1=a;l2=b;
		}else if(a>b){
			l1=b;l2=a;
		}else{
			return a;
		}
		while(l1!=0){
			l=l1;
			l1=l2%l1;
			l2=l;
		}
		return l2;
	}
}
