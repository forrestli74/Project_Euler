import java.util.ArrayList;


public class a332{
	public static void main(String[] args){
		double f1=0;
		double f2=0;
		double f;
		for(int t=1;t<=50;t++){
			f=solve(t);
			f2+=f;
			f1+=Math.round(f*1000000)/1000000.;
		}
		System.out.println(f1+"\n"+f2);
		System.out.println(solve(14));
	}
	public static double solve(int r){
		double min=100000;
		double tt3,t3;
		double[] t=new double[3];
		ArrayList<double[]> ad=new ArrayList<double[]>();
		double[] s1 = null,s2 = null,s3 = null;
		for(int t1=0;t1<=r;t1++){
			for(int t2=-r;t2<=r;t2++){
				tt3=Math.sqrt(r*r-t1*t1-t2*t2);
				t3=Math.round(tt3);
				if(tt3==t3){
					t=new double[3];
					t[0]=t1;
					t[1]=t2;
					t[2]=t3;
					ad.add(t);
				}
			}
		}
		int size=ad.size();
		double area;
		for(int t1=0;t1<size;t1++){
			for(int t2=t1+1;t2<size;t2++){
				for(int tt=t2+1;tt<size;tt++){
					if(!same(ad.get(t1),ad.get(t2),ad.get(tt))){
						area=area(a(ad.get(t1),ad.get(t2),ad.get(tt)),r);
						if(area<min){
							min=area;
							s1=ad.get(t1);
							s2=ad.get(t2);
							s3=ad.get(tt);
						}
					}
				}
			}
		}
		for(int ttt=0;ttt<3;ttt++){
			System.out.println(s1[ttt]+"\t"+s2[ttt]+"\t"+s3[ttt]);
		}
		System.out.println(r+" "+min);
		return min;
	}
	public static boolean same(double[] a,double[] b,double[] c){
		return Math.abs(d(c(a,b),c))<0.0000001;
	}
	public static double m(double[] a){
		double f=0;
		for(int t=0;t<3;t++){
			f+=a[t]*a[t];
		}
		return Math.sqrt(f);
	}
	public static double[] a(double[] a,double[] b,double[] c){
		double[] f1,f2,f3,d1,d2,d3,f;
		f1=c(b,c);
		f2=c(c,a);
		f3=c(a,b);
		f=new double[3];
		f[0]=a(f2,f3);
		f[1]=a(f3,f1);
		f[2]=a(f1,f2);
		return f;
	}
	public static double area(double[] a,double r){
		return r*r*(a[0]+a[1]+a[2]-Math.PI);
	}
	public static double a(double[] a,double[] b){
		return Math.PI-Math.acos(d(a,b)/m(a)/m(b));
	}
	public static double[] div(double[] a,double b){
		double[] f=new double[3];
		for(int t=0;t<3;t++){
			f[t]=a[t]/b;
		}
		return f;
	}
	public static double[] q(double[] a,double[] b){
		double l=m(b);
		return div(c(b,c(a,b)),l*l);
	}
	
	public static double[] c(double[] a,double[] b){
		double[] f={a[1]*b[2]-a[2]*b[1],a[2]*b[0]-a[0]*b[2],a[0]*b[1]-a[1]*b[0]};
		return f;
	}
	public static double d(double[] a,double[] b){
		double f=0;
		for(int t=0;t<3;t++){
			f+=a[t]*b[t];
		}
		return f;
	}
	public static double[] s(double[] a,double[] b){
		double[] f=new double[3];
		for(int t=0;t<3;t++){
			f[t]=a[t]-b[t];
		}
		return f;
	}
}
