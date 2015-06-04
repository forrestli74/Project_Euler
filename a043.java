

public class a043 {
	public static void main(String[] args){
		byte a[]=new byte[10];
		byte b[]=new byte[10];
		boolean c[]=new boolean[10];
		int d[]=new int[7];
		byte fc[]={2,3,5,7,11,13,17};
		long f=0,l;
		byte c1,c2;
		boolean j;
		while(a[9]==0){
			for(byte t2=0;t2<10;t2++)
				c[t2]=false;
			for(byte t=0;t<10;t++){
				j=false;
				c1=a[t];
				c2=0;
				while(j==false){
					if(c[c2]==true){}else if(c1==0){
						b[t]=c2;
						//System.out.print(b[t]);
						c[c2]=true;
						j=true;
					}else{
						c1--;
					}
					c2++;
				}
			}
			//System.out.println();
			j=true;
			for(c1=0;c1<7;c1++){
				if((100*b[c1+1]+10*b[c1+2]+b[c1+3])%fc[c1]!=0){
					j=false;
				}
			}
			if(j){
				l=0;
				for(c1=0;c1<10;c1++){
					l+=b[c1];
					l*=10;
				}
				f+=(l/10);
				System.out.println(l);
			}
			a[0]++;
			c1=10;
			for(byte t1=0;t1<9;t1++){
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
