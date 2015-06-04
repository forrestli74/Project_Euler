
import java.math.*;
import java.util.Scanner;
public class a020 {
	public static void main(String[] args){
		BigInteger a=new BigInteger("1");
		BigInteger b=new BigInteger("2");
		BigInteger b0=new BigInteger("1");
		for(int t=2;t<=100;t++){
			a=a.multiply(b);
			b=b.add(b0);
		}
		System.out.println(a);
		Scanner in=new Scanner(System.in).useDelimiter("\\s*");;
		int d=0;
		int f=0;
		boolean j=false;
		for(int t=0;t<150&&j==false;t++){
			d=in.nextInt();
			f+=d;
		}
		System.out.println(f);
	}
}
