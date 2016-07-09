

public class a012 {
	public static void main(String[] args){
		long c1,c2,c3=0;
		long v=1000,vf=0;
		do{
			vf=v;
			c1=0;
			for(long t=2;t<=vf;t++){
				c2=0;
				while(vf%t==0){
					c2++;
					vf/=t;
				}
				if(c2!=0){
					c1++;
				}
			}
			if(c1==4){
				c3++;
			}else{
				c3=0;
			}
			v++;
		}while(c3<4);
		System.out.println(v-4);
	}
}
