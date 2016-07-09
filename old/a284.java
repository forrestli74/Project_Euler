
public class a284 {
	public static void main(String[] args){
		int o=10000;
		long f=0,fc;
		long a[]=new long[o];
		long b[]=new long[o+2];
		byte cc;
		int t2;
		byte ff[]=new byte[10];
		cc=7;
		for(int t=0;t<o;t++){
			b[t]=0;
			a[t]=0;
		}
		b[o]=0;
		a[0]=cc;fc=cc;
		b[0]=cc;b[1]=3;
		for(int t1=1;t1<o;t1++){//Digit
			t2=0;
			while((b[t1]+t2*2*cc)%14!=t2){//try number
				t2++;
			}
			a[t1]=t2;
			for(int t3=t1;t3<o;t3++){//calculate No. digit
				b[t3]+=2*a[t3-t1]*t2;
				if(t3==t1*2){
					b[t3]-=a[t3-t1]*t2;
				}
				b[t3+1]+=b[t3]/14;
				b[t3]=b[t3]%14;
			}
			//System.out.print(a[t1]+" ");
			if(t2!=0){
				for(t2=0;t2<=t1;t2++){
					fc+=a[t2];
				}
			}
		}
		f+=fc;
		cc=8;
		for(int t=0;t<o;t++){
			b[t]=0;
			a[t]=0;
		}
		b[o]=0;
		b[o+1]=0;
		a[0]=cc;fc=cc;
		b[0]=cc;b[1]=4;
		for(int t1=1;t1<o;t1++){//Digit
			t2=0;
			while((b[t1]+t2*2*cc)%14!=t2){//try number
				t2++;
			}
			a[t1]=t2;
			for(int t3=t1;t3<o;t3++){//calculate No. digit
				b[t3]+=2*a[t3-t1]*t2;
				if(t3==t1*2){
					b[t3]-=a[t3-t1]*t2;
				}
				b[t3+1]+=b[t3]/14;
				b[t3]=b[t3]%14;
			}
			//System.out.print(a[t1]+" ");
			if(t2!=0){
				for(t2=0;t2<=t1;t2++){
					fc+=a[t2];
				}
			}
		}
		f+=fc;
		/*System.out.println();
		for(int t=0;t<o;t++){
			System.out.print(a[t]+" ");
		}
		*/
		System.out.println(f+1);
		for(byte t=0;t<10;t++){
			ff[t]=(byte) (f%14);
			f/=14;
			System.out.print(ff[t]+" ");
		}
		System.out.println();
	}
}
