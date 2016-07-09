

public class a033 {
	public static void main(String[] args){
		int l11,l12,l21,l22;
		double r11,r12,r21,r22;
		int c=0;
		for(byte t1=0;t1<10;t1++){
			for(byte t2=(byte) (t1+1);t2<10;t2++){
				for(byte t=1;t<10;t++){
					l11=t1*10+t;
					l12=t*10+t1;
					l21=t2*10+t;
					l22=t*10+t2;
					if(l11*t2==l21*t1){
						c++;
						System.out.println(t1+"/"+t2);
					}
					if(l11*t2==l22*t1){
						c++;
						System.out.println(t1+"/"+t2);
					}
					if(l12*t2==l21*t1){
						c++;
						System.out.println(t1+"/"+t2);
					}
					if(l12*t2==l22*t1){
						c++;
						System.out.println(t1+"/"+t2);
					}
				}
			}
		}
	}
}
