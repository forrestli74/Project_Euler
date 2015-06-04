

public class a032 {
	public static void main(String[] args){
		byte a[]=new byte[9];
		byte b[]=new byte[9];
		boolean c[]=new boolean[9];
		byte c1,c2;
		boolean j;
		int n1,n2,n3;
		long f=0;
		while(a[8]==0){
			for(byte t2=0;t2<9;t2++)
				c[t2]=false;
			for(byte t=0;t<9;t++){
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
			n1=b[0]*10+b[1];
			n2=(b[2]*10+b[3])*10+b[4];
			n3=((b[5]*10+b[6])*10+b[7])*10+b[8];
			if(n1*n2==n3){
				f+=n3;
				System.out.println(n1+"*"+n2+"="+n3);
			}
			n1=b[0];
			n2=((b[2]*10+b[3])*10+b[4])*10+b[1];
			n3=((b[5]*10+b[6])*10+b[7])*10+b[8];
			if(n1*n2==n3){
				f+=n3;
				System.out.println(n1+"*"+n2+"="+n3);
			}
			a[0]++;
			c1=9;
			for(byte t1=0;t1<8;t1++){
				if(a[t1]==c1){
					a[t1]=0;
					a[t1+1]++;
				}
				c1--;
			}
		}
		System.out.println(f-5346-5796);
		
	}
}
