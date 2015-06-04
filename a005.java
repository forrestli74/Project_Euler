
public class a005 {
	public static void main(String[] args){
		byte a[]=new byte[21];
		long p=1;
		for(byte t=1;t<21;t++){
			a[t]=t;
		}
		for(byte t=2;t<21;t++){
			p*=a[t];
			for(byte tt=(byte) (t+1);tt<21;tt++){
				if(a[tt]%a[t]==0){
					a[tt]/=a[t];
				}
			}
		}
		System.out.println(p);
	}
}
