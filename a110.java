

public class a110 {
	public static void main(String[] args){
		long o=1000000000;
		o*=o;
		long ff=0;
		long a[]=new long[2];
		long l1[]=new long[2];
		long l2;
		long l3;
		long f=1;
		boolean j;
		boolean b[]=new boolean[4000000];
		int p[]=new int[1000000];
		long s[][]=new long[2][2];
		int pt=0;
		s[0][0]=2;s[1][0]=2;a[0]=2;
		for(int t=2;t<4000000;t++){
			if(!b[t]){
				p[pt]=t;
				pt++;
				for(int pp=t*2;pp<4000000;pp+=t){
					b[pp]=true;
				}
			}
		}
		int c=0;
		System.out.println(p[1]);
		pt=1;
		while(f<=4000000){
			l1[0]=a[0];l1[1]=a[1];l2=2;f=1;
			while(l1[0]!=1||l1[1]!=0){
				j=true;
				while(((l1[1]%l2)*(o%l2)+l1[0])%l2!=0){
					l2++;
				}
				l3=1;
				while(((l1[1]%l2)*(o%l2)+l1[0])%l2==0){
					l1[0]=(o/l2)*(l1[1]%l2)+((o%l2)*(l1[1]%l2)+l1[0])/l2;
					l1[1]/=l2;
					l3++;
				}
				f*=l3;
			}
			if(ff<f){
				ff=f;
				System.out.println(a[1]+"'"+a[0]+" , "+f+" , "+s[0][1]+"'"+s[0][0]);
				if(((a[1]%p[pt+1])*(o%p[pt+1])+a[0])%p[pt+1]==0){
					pt++;
					s[0][0]=s[1][0];
					s[0][1]=s[1][1];
					s[1][0]=a[0];
					s[1][1]=a[1];
					System.out.println("!"+pt+" "+p[pt]+" , "+s[0][1]+"'"+s[0][0]);
					
				}
			}
			if(c>10000){
				System.out.print("/"+s[0][0]+"/");
				c=0;
			}
			c++;
			a[0]+=s[0][0];
			a[1]+=s[0][1]+a[0]/o;
			a[0]=a[0]%o;
		}
	}
}
