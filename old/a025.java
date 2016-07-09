

import java.math.*;

public class a025 {
	public static void main(String[] args){
		BigInteger a1=new BigInteger("0");
		BigInteger a2=new BigInteger("1");
		BigInteger b=new BigInteger("10");
		b=b.pow(1000);
		for(int t=0;t<2391;t++){
			a1=a2.add(a1);
			a2=a1.add(a2);
		}
		System.out.println(a1);
		System.out.println(2391*2);
	}
}
