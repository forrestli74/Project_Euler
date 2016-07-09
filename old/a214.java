

public class a214 {
	public static void main(String[] args){
		int o=2433654,c;
		long l,sum=0;
		int[] ps=a000.primes(400,o);
		for(int t=0;t<2433654;t++){
			c=2;
			l=ps[t]-a000.divcount(ps[t]);
			while(l!=1&&c<27){
				l=l-a000.divcount(l);
				c++;
			}
			if(c==25){
				sum+=ps[t];
				System.out.println(ps[t]);
			}
		}
	}
}
