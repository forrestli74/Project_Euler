
public class a028 {
	public static void main(String[] args){
		long f=0;
		int n=5,c=6;
		for(int t=2;t<=501;t++){
			f+=c;
			n+=8;
			c+=n;
		}
		System.out.println(f*4+1);
	}
}
