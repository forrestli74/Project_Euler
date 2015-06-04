
public class a222{
	public static void main(String[] args) {
		int[] a=new int[21];
		for(int t=0;t<=20;t++){
			a[t]=30+t;
		}
		double f=r(a);
		System.out.println(f);
	}
	private static double r(int[] a) {
		double x=c(a);
		double m=x;
		int[] na=null;
		for(int t1=0;t1<21;t1++){
			for(int t2=t1;t2<21;t2++){
				for(int t3=t2;t3<21;t3++){
					for(int t4=t3;t4<21;t4++){
						double tem=c(s(a,t1,t2,t3,t4));
						if(m>tem){
							na=s(a,t1,t2,t3,t4);
							m=tem;
						}
					}
				}
			}
		}
		if(m<x){

			print(na);
			return r(na);
		}
		return x;
	}
	private static void print(int[] a) {
		String out="";
		for(int t=0;t<=20;t++){
			out+=a[t]+" ";
		}
		System.out.println(out+c(a));
	}
	private static int[] s(int[] a,int q,int w, int e,int r) {
		int[] f=a.clone();
		int l=f[q];
		f[q]=f[w];
		f[w]=f[e];
		f[e]=f[r];
		f[r]=l;
		return f;
	}
	public static double c(int[] a){

		double sum=a[0]+a[20];
		for(int t=0;t<20;t++){
			sum+=Math.sqrt(sq(a[t]+a[t+1])-sq(100-a[t]-a[t+1]));
		}
		return sum;
	}
	public static double sq(double x){
		return x*x;
	}
}
