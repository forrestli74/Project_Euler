
public class a048 {
	public static void main(String[] args){
		long f=1,c;
		long b=1;
		for(byte t=0;t<10;t++){
			b*=10;
		}
		for(long t1=2;t1<=1000;t1++){
			c=1;
			for(long t2=0;t2<t1;t2++){
				c*=t1;
				c=c%b;
			}
			f+=c;
			f=f%b;
		}
		System.out.println(f);
	}
}
