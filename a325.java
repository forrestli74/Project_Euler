import java.math.BigInteger;
import java.util.ArrayList;


public class a325{
	static BigInteger o=new BigInteger("10000000000000000");
	static ArrayList<BigInteger> fibs;
	public static void main(String[] args){
		fibs=new ArrayList<BigInteger>();
		fibs.add(new BigInteger("0"));
		fibs.add(new BigInteger("1"));
		int i=1;
		while(fibs.get(i).compareTo(o)==-1){
			fibs.add(fibs.get(i-1).add(fibs.get(i)));
			i++;
		}
		BigInteger w=o.multiply(fibs.get(i-1)).divide(fibs.get(i));
		System.out.println(w);
	}
	public static boolean c(long a,long b){
		return false;
	}
}