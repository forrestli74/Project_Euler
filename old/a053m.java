
public class a053m {
	public static void main(String[] args){
		long v;
		boolean j;
		byte c1;
		int f=0;
		boolean b[]=new boolean[101];
		for(byte n=23;n<=100;n++){
			for(byte r=0;r<=n;r++){
				v=1;j=false;
				c1=(byte) (r+1);
				for(byte t=0;t<101;t++){
					b[t]=false;
				}
				while(j==false&&c1<=n){
					v*=c1;
					c1++;
					for(byte t=2;t<=r;t++){
						if(b[t]==false&&v%t==0){
							v/=t;
							b[t]=true;
						}
					}
					if(v>1000000){
						j=true;
						System.out.println(n+" "+r);
					}
				}
				if(j==true){
					f++;
				}
			}
		}
		System.out.println(f);
	}
}
