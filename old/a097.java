
public class a097 {
	public static void main(String[] args){
		long f=28433;
		long o=1;
		for(byte t=0;t<10;t++){
			o*=10;
		}
		for(int t=0;t<7830457;t++){
			f*=2;
			f=f%o;
		}
		f++;
		System.out.println(f);
	}
}
