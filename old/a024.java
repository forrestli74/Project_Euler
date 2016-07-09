
public class a024 {
	public static void main(String[] args){
		boolean b[]=new boolean[10];
		int c=999999,l2;
		byte l1=0;
		for(byte t1=0;t1<10;t1++){
			l2=j(9-t1);
			l1=(byte) (c/l2);
			c=c%l2;
			for(byte t2=0;t2<10;t2++){
				if(b[t2]==false){
					if(l1==0){
						System.out.print(t2);
						b[t2]=true;
					}
					l1--;
				}
			}
		}
	}
	public static int j(int i){
		int f=1;
		for(byte t=2;t<=i;t++){
			f*=t;
		}
		return f;
	}
}
