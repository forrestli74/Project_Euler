

public class a036 {
	public static void main(String[] args){
		byte a[]=new byte[6];
		byte b[]=new byte[20];
		boolean j;
		int f=0;
		int l1,l2;
		for(int t=1;t<1000000;t++){
			l1=t;l2=t;
			for(byte t1=0;t1<6;t1++){
				a[t1]=(byte) (l1%10);
				l1/=10;
			}
			for(byte t1=0;t1<20;t1++){
				b[t1]=(byte) (l2%2);
				l2/=2;
			}
			j=false;
			l1=5;
			while(a[l1]==0){
				l1--;
			}
			l2=19;
			while(b[l2]==0){
				l2--;
			}
			for(byte t1=0;t1<=l1/2&&j==false;t1++){
				if(a[t1]!=a[l1-t1]){
					j=true;
				}
			}
			for(byte t1=0;t1<=l2/2&&j==false;t1++){
				if(b[t1]!=b[l2-t1]){
					j=true;
				}
			}
			if(j==false){
				for(byte t1=19;t1>=0;t1--){
					System.out.print(b[t1]);
				}
				System.out.println(" "+t);
				f+=t;
			}
		}
		System.out.println(f);
	}
}
