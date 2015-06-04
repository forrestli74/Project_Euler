

public class a051 {
	public static void main(String[] args){
		int d=5,c,c1;
		byte[] a;
		byte[] b;
		int[][] p=new int[1000][4];
		long l1,l2,l;
		for(int tt=0;tt<1000;tt++){
			p[tt][3]=10;
		}
		b1:
		while(true){
			a=new byte[d];
			b=new byte[d-3];
			c=0;
			for(int t1=0;t1<d;t1++){
				for(int t2=t1+1;t2<d;t2++){
					for(int t3=t2+1;t3<d;t3++){
						p[c][0]=t1;
						p[c][1]=t2;
						p[c][2]=t3;
						c++;
					}
				}
			}
			b2:
			while(true){
				for(int t1=0;t1<c;t1++){
					c1=0;
					l1=0;
					l2=0;
					for(int t2=0;t2<d;t2++){
						l1*=10;
						l2*=10;
						if(t2==p[t1][c1]){
							c1++;
							l2+=1;
						}else{
							a[t2]=b[t2-c1];
							l1+=a[t2];
						}
					}
					c1=0;
					for(byte t2=0;t2<10;t2++){
						for(int t3=0;t3<3;t3++){
							a[p[t1][t3]]=t2;
						}
						l=l1+l2*t2;
						if(isPrime(l)){
							c1++;
						}
					}
					if(c1>=8){
						System.out.print(c1+":\t");
						for(int tt=0;tt<10;tt++){
							System.out.print((l1+l2*tt)+"\t");
						}
						System.out.println();
					}
				}
				b[d-4]++;
				c1=d-4;

				while(b[c1]==10&&c1>0){
					b[c1]=0;
					c1--;
					b[c1]++;
				}
				if(b[0]==10){
					d++;
					break b2;
				}
			}
		}
	}
	public static boolean isPrime(long n) {
		long test=(long) Math.sqrt(n);
		if ( n%2 !=0 && n%3!=0) {
			for (long i = 5; i <= test; i += 6){
				if (n % i == 0||n%(i+2)==0) {
					return false;
				}
			}
			return true;
		}else{
			return false;
		}
	}
}
