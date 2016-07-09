

public class a297 {
	public static void main(String[] args){
		long a[]=new long[84];
		long b[]=new long[84];
		long c=10;
		int l1=83;
		long f=0;
		boolean j1;
		for(int t=1;t<17;t++)
			c*=10;
		c--;
		//c=12;
		a[0]=1;a[1]=2;b[0]=1;b[1]=2;
		for(int t=1;t<83;t++){
			a[t+1]=a[t]+a[t-1];
			b[t+1]=b[t]+b[t-1]+a[t-1]-1;
			System.out.println((t+1)+"\t"+a[t+1]+"\t"+b[t+1]);
		}
		while(c!=0){
			j1=true;
			while(j1){
				if(a[l1]<=c){
					c-=a[l1];
					j1=false;
				}
				l1--;
			}
			l1++;
			System.out.println(c+"\t"+l1);
			f+=b[l1]+c;
		}
		System.out.println(f);
	}
}
