

public class a117 {
	public static void main(String[] args){
		
		long b1=4,b2=2,b3=2,a2=4,a3=2,a4=1;
		long f=0,l1,l2,l3;
		
		for(int t1=6;t1<=50;t1++){
			l1=b1;l2=a2;
			a2=b1+b2+b3;b1=l2+a3+a4;a3=b2+b3;a4=b3;b3=b2+b3;b2=l1;
		}
		f=b1+b2+b3+a2+a3+a4;
		System.out.println(f);
	}
}
