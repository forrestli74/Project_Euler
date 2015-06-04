

public class a116 {
	public static void main(String[] args){
		
		long a[]=new long[2];
		long b[]=new long[3];
		long c[]=new long[4];
		long f=0,l1,l2,l3;
		a[0]=3;a[1]=5;b[0]=1;b[1]=1;b[2]=2;c[0]=1;c[1]=1;c[3]=1;
		for(int t1=6;t1<=50;t1++){
			l1=a[1];l2=b[2];l3=c[3];
			a[1]+=a[0];a[0]=l1;
			b[2]+=b[1];b[1]=b[0];b[0]=l2;
			c[3]+=c[2];c[2]=c[1];c[1]=c[0];c[0]=l3;
		}
		f=a[0]+a[1]+b[0]+b[1]+b[2]+c[0]+c[1]+c[2]+c[3];
		System.out.println(f-3);
	}
}
