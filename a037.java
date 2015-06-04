

public class a037 {
	public static void main(String[] args){
		int n1=78498,n2;
		int o=6;
		int o2=(int) Math.pow(10,o);
		boolean p[]=new boolean[o2];
		int tt;
		int c=0;
		int l1;
		int r[]=new int[n1];
		boolean j;
		int f=0;
		byte a[]=new byte[o];
		for(int t=2;t<o2;t++){
			if(p[t]==false){
				r[c]=t;
				c++;
				tt=t*2;
				while(tt<o2){
					p[tt]=true;
					tt+=t;
				}
			}
		}
		p[1]=true;
		System.out.print(r[n1-1]);
		for(int t1=4;t1<n1;t1++){
			l1=r[t1];
			for(byte t2=0;t2<o;t2++){
				a[t2]=(byte) (l1%10);
				l1/=10;
			}
			n2=o-1;
			while(a[n2]==0){
				n2--;
			}
			j=false;
			for(byte t2=0;t2<=n2;t2++){
				l1=0;
				for(byte t3=t2;t3>=0;t3--){
					l1+=a[t3];
					l1*=10;
				}
				l1/=10;
				if(p[l1]==true){
					j=true;
				}
				l1=0;
				for(byte t3=(byte) n2;t3>=t2;t3--){
					l1+=a[t3];
					l1*=10;
				}
				l1/=10;
				if(p[l1]==true){
					j=true;
				}
			}
			if(j==false){
				f+=r[t1];
				System.out.println(r[t1]);
			}
		}
		System.out.println(f);
	}
}
