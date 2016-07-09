

public class a035 {
	public static void main(String[] args){
		boolean p[]=new boolean[1000000];
		int tt;
		boolean j;
		int f=0;
		for(int t=2;t<1000000;t++){
			if(p[t]==false){
				tt=t*2;
				while(tt<1000000){
					p[tt]=true;
					tt+=t;
				}
			}
		}
		byte a[]=new byte[6];
		int l;
		a[0]=2;
		byte n;
		while(a[5]<10){
			j=false;
			l=1;
			n=5;
			while(a[n]==0){
				n--;
			}
			n++;
			for(byte t1=0;t1<n;t1++){
				l=0;
				for(byte t2=(byte) (n-1);t2>=0;t2--){
					l+=a[(t1+t2)%n];
					l*=10;
				}
				l/=10;
				if(p[l]==true){
					j=true;
				}
			}
			if(j==false){
				f++;
			}
			a[0]++;
			for(byte t=0;t<5;t++){
				if(a[t]==10){
					a[t]=0;
					a[t+1]++;
				}
			}
		}
		System.out.println(f);
	}
}
