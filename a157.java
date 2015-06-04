

public class a157 {
	public static void main(String[] args){
		long f=0;
		for(int t=1;t<10;t++){
			f+=cal(t);
		}
		System.out.println(f);
	}
	public static long cal(int a){
		final long o=(long) Math.pow(10, a);
		long m1=o*2,m2,l,f=0;
		for(int t1=0;t1<=a;t1++){
			m1/=2;
			m2=m1*5;
			for(int t2=0;t2<=a;t2++){
				m2/=5;
				l=m2+o;
				f+=divcount(l);
			}
		}
		m1=o;
		for(int t1=1;t1<=a;t1++){
			m1/=2;
			m2=o;
			for(int t2=1;t2<=a;t2++){
				m2/=5;
				l=m1+m2;
				f+=divcount(l);
			}
		}
		return f;
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
}
