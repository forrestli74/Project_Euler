

public class a160 {
	public static void main(String[] args){
		long[] n=new long[6];
		for(int t=0;t<6;t++){
			long o=1;
			for(int ot=0;ot<t;ot++){
				o*=10;
			}
			long tem=1;
			for(int tt=1;tt<o;tt++){
				if(tt%10!=0){
					tem*=tt;
					tem%=10000000000L;
					if(tem%10==0){
						tem/=10;
					}
				}
			}
			n[t]=tem;
		}
		long f=1;
		long nn=11111111%40000;
		for(int t=0;t<nn;t++){
			f*=n[5];
			f%=100000;
		}
		for(int t=1;t<5;t++){
			f*=n[t];
			f%=100000;
		}
		System.out.println(f);
	}
}
