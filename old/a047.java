

public class a047 {
	public static void main(String[] args){
		long a=2,c1,c2;
		long v,vf=0;
		boolean j=false;
		do{
			v=a*(a+1)/2;
			vf=v;
			c1=1;
			for(long t=2;t<=v;t++){
				c2=0;
				while(v%t==0){
					c2++;
					v/=t;
				}
				c1*=(c2+1);
			}
			if(c1>499){
				j=true;
			}
			a++;
		}while(j==false);
		System.out.println(vf);
	}
}
