
public class a040 {
	public static void main(String[] args){
		byte a[]=new byte[1000001];
		byte b[]=new byte[6];
		byte n;
		int c=0;
		int f;
		
		while(b[5]<10){
			n=5;
			while(b[n]==0&&n>0){
				n--;
			}
			for(byte t=n;t>=0;t--){
				if(c<=1000000){
					a[c]=b[t];
					c++;
				}
			}
			b[0]++;
			for(byte t=0;t<5;t++){
				if(b[t]==10){
					b[t]=0;
					b[t+1]++;
				}
			}
		}
		f=a[1]*a[10]*a[100]*a[1000]*a[10000]*a[100000]*a[1000000];
		System.out.println(f);
	}
}
