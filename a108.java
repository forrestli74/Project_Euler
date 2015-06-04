

public class a108 {
	public static void main(String[] args){
		long a=2*3*5*7,ff=0;
		long l1,l2,l3,f=1;
		boolean j;
		boolean b[]=new boolean[4000000];
		int p[]=new int[1000000];
		long s[]=new long[2];
		int pt=0;
		s[0]=2;s[1]=2;
		for(int t=2;t<4000000;t++){
			if(!b[t]){
				p[pt]=t;
				pt++;
				for(int pp=t*2;pp<4000000;pp+=t){
					b[pp]=true;
				}
			}
		}
		System.out.println(p[1]);
		pt=1;
		while(f<=1000){
			l1=a;l2=2;f=1;
			while(l1!=1){
				j=true;
				while(l1%l2!=0){
					l2++;
				}
				l3=1;
				while(l1%l2==0){
					l1/=l2;
					l3++;
				}
				f*=l3;
			}
			if(ff<f){
				ff=f;
				System.out.println(a+" , "+f+" , "+s[0]);
				if(a%p[pt+1]==0){
					pt++;
					s[0]=s[1];
					s[1]=a;
					System.out.println("!"+pt+" "+p[pt]+" , "+s[0]);
				}
			}

			a+=2*3*5*7;
		}
		System.out.println(a-s[0]);
	}
}
