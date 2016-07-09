
public class a295 {
	static long o=100;
	static long o2=o*o;
	public static void main(String[] args){
		long a,b,c,d=1,k1,k2=1,r,f=0,rl,l1,l2,l;
		int cc=0,cc2;
		boolean j;
		short kc[]=new short[2000];
		long fc[][]=new long[200][200];
		while(k2<1000){
			k1=1;
			while(k1<=k2){
				l=1;l1=k2;l2=k1;d=0;cc2=0;
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
							kc[cc]++;
							fc[cc][cc2]=r;
							cc2++;
							//System.out.print(a+","+b+","+c+","+d+"---");
							System.out.print(r+"\t");
						}
						d++;
						b=d+k2;rl=(2*d+k2)*k2;a=(rl/k1-k1)/2;c=a+k1;
						r=a*a+b*b;
					}
					if(kc[cc]!=0){
						System.out.println("\rcc:"+cc+" "+kc[cc]);
						cc++;
					}
				}
				k1+=2;
			}
			k2+=2;
		}
		for(int t1=0;t1<cc;t1++){
				l=kc[t1];
				f+=l*(l+1)/2;
		}
		for(int t1=1;t1<200;t1++){
			
		}
		System.out.println(f);
	}
}
