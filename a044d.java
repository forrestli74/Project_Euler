
/*
 * a1=n1*(3*n1-1)/2
 * a2=n2*(3*n2-1)/2
 * a3=n3*(3*n3-1)/2
 * a3-a2=(n2+d)*(3*(n2+d)-1)/2-n2*(3*n2-1)/2
 *      =3*n2*d+3/2*d^2-d/2
 */

public class a044d {
	public static void main(String[] args){
		long n1=1;
		long a1=1;
		while(n1<100000){
			for(long d=1;d<n1;d++){
				long n2=a1-(3*d-1)*d/2;
				if(n2%(3*d)!=0){
					continue;
				}
				n2=n2/(3*d);
				long a2=n2*(3*n2-1)/2;
				//System.out.println(n1+","+print(a1)+"  "+n2+","+print(a2)+"  "+print(a2+a1));
				long a4=2*a2+a1;
				if(e(a4)!=-1){
					System.out.println(print(a1)+" "+print(a2)+" "+print(a2+a1)+" "+print(a4));
					return;
				}
			}
			a1+=(n1*3+1);
			n1++;
		}
		
	}
	static String print(long a){
		long n=e(a);
		return "("+a+","+get(n)+","+n+")";
	}
	static long get(long n){
		return (n*(3*n-1)/2);
		//3/2*(n^2-2/3*n)
		//3/2*(n-1/3)^2-1/9
	}
	static long e(long a){
		long s=(long) (Math.sqrt(((double) a) *2/3+2./27)+1./3+1./2);
		//System.out.println(s);
		return ((s*(3*s-1))/2==a)?s:-1;
	}
}
