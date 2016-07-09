
public class a034 {
	public static void main(String[] args){
		byte o=7;
		int a[]=new int[o];
		a[1]=1;
		int l,l2,n;
		long f=0;
		boolean j;
		while(a[o-1]<10){
			l=0;j=false;n=o-1;
			while(a[n]==0){
				n--;
			}
			for(byte t=0;t<o;t++){
				l2=1;
				for(byte t2=2;t2<=a[t];t2++){
					l2*=t2;
				}
				l2=(t>n?0:l2);
				l+=l2;
			}
			l2=l;
			for(byte t=0;t<o;t++){
				if(l%10!=a[t]){
					j=true;
				}
				l/=10;
			}
			if(j==false){
				f+=l2;
				System.out.println(l2);
			}
			a[0]++;
			for(byte t=0;t<o-1;t++){
				if(a[t]==10){
					a[t]=0;
					a[t+1]++;
				}
			}
		}
		System.out.println(f);
	}
}
