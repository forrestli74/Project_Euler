import java.math.BigInteger;


public class a321{
	public static void main(String[] args){
		
		BigInteger a,sa,sum,b,sb;
		final BigInteger b2=new BigInteger("2");
		a=new BigInteger("1");
		sa=new BigInteger("3");
		sum=new BigInteger("3");
		b=new BigInteger("2");
		sb=new BigInteger("3");
		int c=1;
		while(c<40){
			a=a.add(BigInteger.ONE);
			sa=sa.add(a.multiply(b2).add(BigInteger.ONE));
			while(sb.compareTo(sa)==-1){
				b=b.add(BigInteger.ONE);
				sb=sb.add(b);
			}
			if(sb.compareTo(sa)==0){
				c++;
				sum=sum.add(a);
				System.out.println(sum+"\t"+a);
				a=a.multiply(b2);
				b=b.multiply(b2);
				sa=a.multiply(a.add(b2));
				sb=b.multiply(b.add(BigInteger.ONE)).divide(b2);
			}
		}
		
		/*
		long a1=1,b1=1,a2,b2,sum=0;
		int c=1;
		while(c<40){
			a2=a1;b2=b1;
			a1=a2+b2;
			b1=b1+7*a2;
			if(b1%2==1){
				c++;
				sum+=a1-1;
			}
			c++;
			System.out.println(c+":\t"+(a1-1)+"\t"+sum);
		}
		*/
	}
}
