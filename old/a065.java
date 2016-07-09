
import java.math.*;
public class a065 {
	public static void main(String[] args){
		BigInteger l1=new BigInteger("0");
		BigInteger l2=new BigInteger("1");
		BigInteger f=new BigInteger("0");
		int n=100;
		BigInteger ll[]={l2,l2};
		BigInteger l=new BigInteger("0");
		final BigInteger b0=new BigInteger("0");
		BigInteger b2=new BigInteger("2");
		BigInteger b1=new BigInteger("1");
		BigInteger bl=new BigInteger("10");
		BigInteger d[]=new BigInteger[n];
		d[0]=b2;
		l=b2;
		for(int t=1;t<n;t++)
			d[t]=b1;
		for(int t=2;t<n;t+=3){
			d[t]=l;
			l=l.add(b2);
		}
		for(int c=n-1;c>=0;c--){
			l=l1.add(d[c].multiply(l2));
			l1=l2;
			l2=l;
			//System.out.println(l1+"/"+l2);
		}
		while(l2!=b0){
			ll=l2.divideAndRemainder(bl);
			l2=ll[0];
			f=f.add(ll[1]);
		System.out.println(f);
		}
		
	}
}
