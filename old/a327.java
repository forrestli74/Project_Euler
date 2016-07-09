
public class a327{
	public static void main(String[] args){
		long f=0;
		for(int t=3;t<41;t++){
			f+=cc(t,30);
		}
		System.out.println(f);
	}
	public static long cc(long a,long b){
		long f=0;
		for(int t=0;t<=b;t++){
			f=c(f,a);
		}
		return f;
	}
	public static long c(long x,long a){
		if(a>x){
			return x+1;
		}
		long t1=(x-2)/(a-2);
		return x+1+t1*2;
	}
}
