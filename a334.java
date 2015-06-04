import java.math.BigInteger;
public class a334{
	static int[] ts,bs;
	static int o=1500;
	static BigInteger b1=new BigInteger("1");
	static BigInteger b2=new BigInteger("2");
	static BigInteger b3=new BigInteger("3");
	public static void main(String[] args) {
		ts=new int[o];
		bs=new int[o];
		ts[0]=123456/2;
		bs[0]=ts[0]%2048+1;
		long s1=bs[0],s2=0,s3=0;
		for(int t=1;t<o;t++){
			if(ts[t-1]%2==0){
				ts[t]=ts[t-1]/2;
			}else{
				ts[t]=(ts[t-1]/2)^926252;
			}
			bs[t]=ts[t]%2048+1;
			s1+=bs[t];
			s2+=bs[t]*t;
			s3+=bs[t]*t*t;
		}
		if(s1%2==0){
			s2+=s1/2;
		}
		System.out.println(s1+"\t"+s2+"\t"+s3);
		//s1/s2 - s2+s1/s2+1-(s1-s1/s2*s2) s2+s1/s2+1
		BigInteger l1=new BigInteger(s1+s2/s1-s1/2+"");
		BigInteger l2=new BigInteger(s2/s1-s1/2-1+"");
		BigInteger l3=new BigInteger(s1+s2/s1-(s2-s2/s1*s1)-s1/2+"");
		BigInteger f=c(l1);
		System.out.println(f);
		f=f.subtract(c(l2));
		System.out.println(f);
		f=f.subtract(l3.multiply(l3));
		System.out.println(f);
		f=f.subtract(new BigInteger(s3+""));
		System.out.println(f);
		f=f.divide(b2);
		System.out.println(f);
		System.out.println(l1+"\n"+l2+"\n"+l3);
	}
	public static BigInteger c(BigInteger l){
		return l.multiply(l.add(b1)).divide(b2).multiply(b2.multiply(l).add(b1)).divide(b3);
	}
}
