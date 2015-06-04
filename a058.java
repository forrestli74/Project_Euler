

public class a058 {
	public static void main(String[] args){
		long a=3,b=5;
		long c[]=new long[4],t=2;
		while(a*10>=b){
			c[0]=1+(4*t-2)*t;
			c[1]=2*t+1;c[1]*=c[1];
			c[2]=1+(4*t+2)*t;
			c[3]=4*t*t+1;
			for(byte tt=0;tt<4;tt++){
				if(q(c[tt])){
					//System.out.println(c[tt]);
					a++;
				}
			}
			b+=4;
			t++;
			//System.out.println(a+"\t/ "+b);
		}
		System.out.println(t*2-1);
	}
	public static boolean q(long a){
		boolean j=true;
		long sq=sq(a);
		for(long t=2;t<sq;t++){
			if(a%t==0){
				j=false;
			}
		}
		return j;
	}
	public static long sq(long x){
		long a=x;
		long b=a+1;
		while(a!=b){
			b=a;
			a=a-(a*a-x)/a/2;
		}
		return a;
	}
}
