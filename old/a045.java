
public class a045 {
	public static void main(String[] args){
		boolean j=false;
		long t=286;
		long l1,l2,l0=0;
		while(j==false){
			l0=t*(t+1)/2;
			l1=(long) Math.sqrt((l0+1.0/24)/1.5);
			l2=(long) Math.sqrt((l0+1.0/8)/2);
			l1++;l2++;
			l1=l1*(3*l1-1)/2;
			l2=l2*(2*l2-1);
			if(l1==l0&&l2==l0){
				j=true;
			}
			t++;
		}
		System.out.println(l0);
	}
}
