

public class a139 {
	public static void main(String[] args){
		long a=2,b=1,o=10,o2=o*o,sum=0,l;
		while(a*a<o2){
			b=1;
			while(b<a&&a*(a+b)<o2/2){
				if(a000.GCD(a, b)==1&&(a*a+b*b)%(a*a-b*b-2*a*b)==0){
					l=o2/(2*a*(a+b));
					System.out.println(l+":\t"+(a*a+b*b)+" "+(a*a-b*b)+" "+(2*a*b));
					sum+=l;
				}
				b++;
			}
			a++;
		}
		System.out.println(sum);
	}
}
