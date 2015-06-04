
public class a121 {
			public static final int goal=15;
public static void main(String[] args) {
			long[] f=x(0,0);
			System.out.println(f[0]+"/"+f[1]);
}
public static long[] x(int r,int b){
			long[] f1=y(r+1,b).clone();
			long[] f2=y(r,b+1).clone();
			long[] f=new long[2];
			f[0]=f1[0]*f2[1]+f1[1]*f2[0];
			f[1]=f1[1]*f2[1]*2;
			sim(f);
			System.out.println("x: "+r+" "+b+" "+f[0]+"/"+f[1]);
			return f;
}
public static long[] y(int r,int b){
			long[] f=new long[2];
			if(b>goal/2){
						f[0]=1;
						f[1]=1;
						return f;
			}else if(2*r>=goal){
						f[0]=0;
						f[1]=1;
						return f;
			}
			f=x(r,b).clone();
			f[0]*=2;
			f[1]*=3;
			sim(f);
			
			System.out.println("y: "+r+" "+b+" "+f[0]+"/"+f[1]);
			return f;
			
}
public static void sim(long[] f){
			long a=f[0];
			long b=f[1];
			long c;
			while(a!=0){
						c=b%a;
						b=a;
						a=c;
			}
			f[0]/=b;
			f[1]/=b;
}
}
