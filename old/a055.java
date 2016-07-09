

public class a055 {
	public static void main(String[] args){
		byte a[]=new byte[4];
		byte b[]=new byte[31];
		byte c[]=new byte[31];
		byte n;
		byte t2;
		boolean j;
		int f=0;
		a[0]=1;b[0]=1;
		while(a[3]<10){
			t2=0;
			while(t2<51){
				n=30;
				j=false;
				while(b[n]==0)
					n--;
				for(byte t1=0;t1<=30;t1++)
					c[t1]=0;
				for(byte t1=0;t1<=n;t1++){
					c[t1]+=(byte) (b[t1]+b[n-t1]);
					c[t1+1]=(byte) (c[t1]/10);
					c[t1]=(byte) (c[t1]%10);
				}
				for(byte t1=0;t1<=28;t1++)
					b[t1]=c[t1];
				n=30;
				while(b[n]==0)
					n--;
				for(byte t1=0;t1<=n;t1++){
					if(b[t1]!=b[n-t1]){
						j=true;
					}
				}
				if(j==false){
					t2=99;
				}
				t2++;
			}
			if(t2==51){
				f++;
			}
			a[0]++;
			for(byte t=0;t<3;t++){
				if(a[t]==10){
					a[t]=0;
					a[t+1]++;
				}
				b[t]=a[t];
			}
			for(byte t=4;t<29;t++){
				b[t]=0;
			}
			b[3]=a[3];
		}
		System.out.println(f);
	}
}
