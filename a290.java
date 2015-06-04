
public class a290 {
	public static void main(String[] args){
		byte a[]=new byte[21];
		int b[]=new int[21];
		int l1,l2;
		long f=0;
		while(a[19]<1){
			a[0]++;b[0]=0;l1=0;l2=0;
			for(byte t=0;t<20;t++){
				if(a[t]==10){
					a[t+1]++;
					a[t]=0;
				}
				l1+=a[t];
				b[t]+=137*a[t];
				b[t+1]=b[t]/10;
				b[t]=b[t]%10;
				l2+=b[t];
			}
			l2+=b[20];
			if(l1==l2){
				f++;
			}
		}
		System.out.println(f);
	}
}
//137*279927=99999999!!!!!!!!!!!!!!!!!!!!