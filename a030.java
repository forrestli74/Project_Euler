
public class a030 {
	public static void main(String[] args){
		byte o=6,o2=5;
		int a[]=new int[o];
		a[1]=1;
		int l,l2;
		long f=0;
		boolean j;
		while(a[o-1]<10){
			l=0;j=false;
			for(byte t=0;t<o;t++){
				l+=Math.pow(a[t], o2);
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
