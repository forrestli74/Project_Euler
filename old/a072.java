

public class a072 {
	public static void main(String[] args){
		long l1,l2,c,fc1=0,fc2=1,f=0;
		boolean j;
		for(long a=2;a<=1000000;a++){
			l1=a;l2=2;c=a;
			while(l1!=1){
				j=true;
				while(j){
					if(l1%l2==0){
						j=false;
					}else{
						l2++;
					}
				}
				while(l1%l2==0)
					l1/=l2;
				c*=(l2-1);c/=l2;
			}
			if(fc1*c<fc2*a){
				fc1=a;
				fc2=c;
			}
			f+=c;
			//System.out.println(a+"/"+c);
		}
		System.out.println(f);
	}
}
