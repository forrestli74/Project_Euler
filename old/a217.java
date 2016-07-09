
public class a217{
	public static long[][] d1,d2,D1,D2;
	public static int O=47;
	public static void main(String[] args) {
		long o=1;
		for(int t=0;t<15;t++){
			o*=3;
		}
		d1=new long[O/2+1][O/2*10];
		d2=new long[O/2+1][O/2*10];
		D1=new long[O/2+1][O/2*10];
		D2=new long[O/2+1][O/2*10];
		for(int t=0;t<10;t++){
			d1[1][t]=t;
			d2[1][t]=t;
			D1[1][t]=1;
			D2[1][t]=1;
		}
		D2[1][0]=0;
		for(int t1=1;t1<O/2;t1++){
			for(int t2=0;t2<O/2*10;t2++){
				d1[t1][t2]%=o;
				d2[t1][t2]%=o;
				D1[t1][t2]%=o;
				D2[t1][t2]%=o;
				if(D1[t1][t2]!=0){
					for(int t=0;t<10;t++){
						d1[t1+1][t2+t]+=d1[t1][t2]*10+t*D1[t1][t2];
						d2[t1+1][t2+t]+=d2[t1][t2]*10+t*D2[t1][t2];
						D1[t1+1][t2+t]+=D1[t1][t2];
						D2[t1+1][t2+t]+=D2[t1][t2];
					}
				}
			}
		}
		System.out.println(d2[3][26]+" "+o);
		long[] d10=new long[O];
		d10[0]=1;
		for(int t=1;t<O;t++){
			d10[t]=10*d10[t-1];
			d10[t]%=o;
		}
		long sum=45;
		for(int t1=2;t1<=O;t1++){
			for(int t2=0;t2<O/2*10;t2++){
				long l=0;
				int d=t1/2;
				l+=((d1[d][t2]*D2[d][t2])%o)*d10[t1-d];
				l+=d2[d][t2]*D1[d][t2];
				if(t1%2==1){
					l*=10;
					l+=D1[d][t2]*D2[d][t2]*45*d10[d];
				}
				l%=o;
				sum+=l;
				sum%=o;
			}
			//System.out.println(sum);
		}
	}
	
}
