

public class a044b {
	public static void main(String[] args){
		long a1=1,b2,temp=4;
		for(int b1=1;b1<10000000;b1++){
			br:{
				a1+=temp;
				temp+=3;
				if(a1%3!=1){
					break br;
				}
				b2=a1/3+1;
				if(e(b2*b2)){
					System.out.println(a1);
					break;
				}
			}
		}
	}
	static boolean e(long a){
		long s=(long) (Math.sqrt(((double) a) *2/3+1/36)+2./6);
		//System.out.println(s);
		return ((s*(3*s-1))/2==a);
	}
}
