
public class a295b {
	static long o=100;
	static long o2=o*o;
	public static void main(String[] args){
		long a,b,c,d=1,k1,k2=1,r,f=0,rl,l1,l2,l,cc;
		
		boolean j;
		short kc[][]=new short[3000][3000];
		while(k2<1000){
			k1=1;
			while(k1<=k2){
				l=1;l1=k2;l2=k1;d=0;
				while(l!=0){
					l=l1%l2;
					l1=l2;
					l2=l;
				}
				if(l1==1){
					b=d+k2;rl=(2*d+k2)*k2;a=(rl/k1-k1)/2;c=a+k1;
					r=a*a+b*b;
					
					while(r<o2){
						j=true;
						if(rl!=(2*a+k1)*k1)
							j=false;
						for(long t1=1;t1<k1;t1++){
							l1=(a+t1);
							l1*=l1;
							l2=b-t1*k2/k1;
							l2*=l2;
							l=l1+l2;
							if(l<r)
								j=false;
						}
						if(j){
							kc[(int) k1][(int) k2]++;
							//System.out.print(a+","+b+","+c+","+d+"---");
							System.out.print(r+"\t");
						}
						d++;
						b=d+k2;rl=(2*d+k2)*k2;a=(rl/k1-k1)/2;c=a+k1;
						r=a*a+b*b;
					}
					if(kc[(int) k1][(int) k2]!=0){
						System.out.println("\r");
					}
				}
				k1+=2;
			}
			k2+=2;
		}
		for(int t1=0;t1<1000;t1++){
			for(int t2=0;t2<1000;t2++){
				l=kc[t1][t2];
				f+=l*(l+1)/2;
			}
		}
		System.out.println(f);
	}
}
