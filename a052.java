

public class a052 {
	public static void main(String[] args){
		byte o=8;
		byte a[]=new byte[o];
		byte b[]=new byte[o];
		byte c0[]=new byte[10];
		byte c[]=new byte[10];
		int f=0;
		boolean j1=false,j2;
		a[0]=1;
		while(a[o-1]<10&&j1==false){
			for(byte t=0;t<10;t++){
				c0[t]=0;
			}
			for(byte t=0;t<o;t++){
				c0[a[t]]++;
			}
			j2=false;
			for(byte tt=2;tt<7;tt++){
				for(byte t=0;t<10;t++){
					c[t]=0;
				}
				for(byte t=0;t<o;t++){
					b[t]=(byte) (tt*a[t]);
				}
				for(byte t=0;t<o-1;t++){
					b[t+1]+=b[t]/10;
					b[t]=(byte) (b[t]%10);
				}
				b[o-1]=(byte) (b[o-1]%10);
				for(byte t=0;t<o;t++){
					c[b[t]]++;
				}
				for(byte t=0;t<10;t++){
					if(c[t]!=c0[t]){
						j2=true;
					}
				}
			}
			if(j2==false){
				j1=true;
				f=0;
				for(byte t=(byte) (o-1);t>=0;t--){
					f+=a[t];
					f*=10;
				}
				f/=10;
				System.out.println(f);
			}
			a[0]++;
			for(byte t=0;t<o-1;t++){
				if(a[t]==10){
					a[t]=0;
					a[t+1]++;
				}
			}
		}
	}
}
