/*
 * (3*n-1)/2
 * a1,a2,a1+a2,2*a2+a1
 */

public class a044 {
	public static void main(String[] args){
		int o=2000000;
		int o2=38006;
		long[] data=new long[o];
		long temp=4;
		data[0]=1;
		for(int t=1;t<o;t++){
			data[t]=data[t-1]+temp;
			temp+=3;
		}
		long ss=46203;
		ss*=100000;
		ss+=47250;
		System.out.println(data[55499]);
		System.out.println(e(data[200000]));
		///*
		br:
		for(int t1=0;t1<200;t1++){
			for(int t2=t1+1;t2<o;t2++){
				if(e(data[t1]+data[t2])){
					if(t1==t2-1)
					System.out.println((t1+1)+":"+data[t1]+" "+(t2+1)+":"+data[t2]+" "+" "+(data[t1]+data[t2]));
					//break br;
				}
			}
			if(t1%100==0){
				System.out.print((t1/100)+" ");
			}
		}
		//*/
	}
	static boolean e(long a){
		long s=(long) (Math.sqrt(((double) a) *2/3+1/36)+2./6);
		//System.out.println(s);
		return ((s*(3*s-1))/2==a);
	}
}
