

import java.math.*;

public class a250 {
	static BigInteger mod=new BigInteger("10000000000000000");
	public static void main(String[] args){
		int[] data=new int[250];
		long[] f1=new long[250];
		long[] f2;
		long[] b=new long[250];
		int l1,l2;
		f1[0]=1;
		for(int t1=0;t1<250;t1++){
			l1=t1;
			for(int t2=1;t2<t1;t2++){
				l1*=t1;
				l1=l1%250;
			}
			data[l1]++;
			l2=l1;
			if(l1==247){
				System.out.println("!!!!!!!!!!  "+(t1));
			}
			for(int t2=t1;t2<250;t2++){
				l1*=t1;
				l1=l1%250;
			}
			for(int t2=1;t2<1001;t2++){
				l2*=l1;
				l2=l1%250;
				data[l2]++;
				if(l2==247){
					System.out.println("!!!!!!!!!!  "+(t1+t2*250));
				}
			}
		}
		for(int t1=0;t1<250;t1++){
			System.out.println(t1+"\t"+data[t1]);
		}
		BigInteger c=new BigInteger("0");
		BigInteger l=new BigInteger("0");
		BigInteger m=new BigInteger("0");
		long lmod=mod.longValue();
		
		long ll;
		for(int t1=0;t1<250;t1++){
			l=BigInteger.ONE;
			b=new long[250];
			b[0]=1;
			c=BigInteger.ONE;
			l=BigInteger.ONE;
			m=new BigInteger(data[t1]+1+"");
			for(int t2=1;t2<=data[t1];t2++){
				c=c.multiply(m.subtract(l)).divide(l);
				ll=c.mod(mod).longValue();
				b[(t2*t1)%250]+=ll;
				b[(t2*t1)%250]=b[(t2*t1)%250]%lmod;
				l=l.add(BigInteger.ONE);
			}
			f2=new long[250];
			for(int t2=0;t2<250;t2++){
				for(int t3=0;t3<250;t3++){
					f2[(t2+t3)%250]+=mm(b[t2],f1[t3]);
					f2[(t2+t3)%250]=f2[(t2+t3)%250]%mod.longValue();
				}
			}
			if(t1==247){
				System.out.println("0:"+f1[0]+"\t3:"+f1[3]+"\n0:"+f2[0]);
			}
			f1=f2.clone();
			System.out.println(f1[0]);
		}
		ll=0;
		for(int t1=0;t1<250;t1++){
			ll+=f1[t1];
			ll=ll%mod.longValue();
		}
		System.out.println(ll);
	}
	public static long mm(long a,long b){
		
		BigInteger aa=new BigInteger(a+"");
		BigInteger bb=new BigInteger(b+"");
		BigInteger f=aa.multiply(bb).mod(mod);
		return f.longValue();
	}
}
