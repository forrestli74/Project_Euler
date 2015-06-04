

public class a041 {
	public static void main(String[] args){
		byte o=7;
		byte a[]=new byte[o];
		byte b[]=new byte[o];
		boolean c[]=new boolean[o];
		boolean j=true;
		byte c1,c2;
		long l;
		int l0;
		int f=0;
		while(a[o-1]==0){
			for(byte t2=0;t2<o;t2++)
				c[t2]=false;
			for(byte t=0;t<o;t++){
				j=false;
				c1=a[t];
				c2=0;
				while(j==false){
					if(c[c2]==true){}else if(c1==0){
						b[t]=(byte) (c2+1);
						c[c2]=true;
						j=true;
					}else{
						c1--;
					}
					c2++;
				}
			}
			l=0;
			for(byte t=(byte) (o-1);t>=0;t--){
				l+=b[t];
				l*=10;
			}
			l/=10;
			l0=(int) Math.sqrt(l);
			//System.out.println(l);
			j=false;
			for(int t=2;t<=l0&&j==false;t++){
				if(l%t==0){
					j=true;
				}
			}
			if(j==false&&f<l){
				f=(int) l;
			}
			a[0]++;
			c1=o;
			for(byte t1=0;t1<o-1;t1++){
				if(a[t1]==c1){
					a[t1]=0;
					a[t1+1]++;
				}
				c1--;
			}
		}
		System.out.println(f);
	}
}
