

public class a066 {
	public static void main(String[] args){
		long l,ll,s;
		double r;
		long max=0;
		for(long a=2;a<=1000;a++){
			r=Math.sqrt(a);
			l=(long) r;
			if(l*l==a){
				a++;
			}
			r=Math.sqrt(a);
			l=(long) r;
			r-=l;
			r=1/r;
			ll=((long) r)*l+1;
			if(ll*ll-a*((long) r)==1){
				if(max<ll){
					s=a;
					max=ll;
					System.out.println(s+"\t"+max+"\t"+l+"\t"+(long) r);
				}
			}else{
				
			}
		}
		
	}
	
}
