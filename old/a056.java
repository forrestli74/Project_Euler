

public class a056 {
	public static void main(String[] args){
		int n[]=new int[200];
		long c,f=0;
		for(byte a=2;a<100;a++){
			for(byte b=2;b<100;b++){
				for(int t1=0;t1<200;t1++){
					n[t1]=0;
				}
				n[0]=1;
				c=0;
				for(byte t1=0;t1<b;t1++){
					for(int t2=0;t2<t1*2+2;t2++){
						n[t2]*=a;
					}
					for(int t2=0;t2<t1*2+3;t2++){
						n[t2+1]+=n[t2]/10;
						n[t2]=n[t2]%10;
					}
				}
				for(int t2=0;t2<199;t2++){
					c+=n[t2];
				}
				if(f<c){
					f=c;
				}
			}
		}
		System.out.println(f);
	}
}
