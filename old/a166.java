

public class a166 {
	public static void main(String[] args){
		byte a[]=new byte[16];
		long c=0;
		byte c1,c2,c3,c4,l;
		boolean j=false;
		while(a[8]<10){
			l=0;j=false;c3=0;c4=0;
			for(byte t=0;t<4;t++)
				l+=a[t];
			a[12]=(byte) (l-a[0]-a[4]-a[8]);
			a[9]=(byte) (l-a[3]-a[6]-a[12]);
			a[13]=(byte) (l-a[1]-a[5]-a[9]);
			a[15]=(byte) ((l+a[8]+a[9]-a[0]-a[3]-a[5]-a[7])/2);
			a[14]=(byte) (l-a[12]-a[13]-a[15]);
			a[11]=(byte) (l-a[3]-a[7]-a[15]);
			a[10]=(byte) (l-a[8]-a[9]-a[11]);
			for(byte t=9;t<16;t++){
				if(a[t]>9||a[t]<0){
					j=true;
				}
			}
			for(byte t1=0;t1<4&&j==false;t1++){
				c1=0;c2=0;
				for(byte t2=0;t2<4;t2++){
					c1+=a[t1*4+t2];
					c2+=a[t2*4+t1];
				}
				if(c1==l&&c2==l){}else{
					j=true;
				}
				c3+=a[t1*5];
				c4+=a[3+t1*3];
			}
			if(c3!=l||c4!=l){
				j=true;
			}
			if(j==false){
				c++;
			}
			a[0]++;
			for(byte t=0;t<8;t++){
				if(a[t]==10){
					a[t]=0;
					a[t+1]++;
				}
			}
		}
		System.out.println(c);
	}
}
