

public class a301 {
	public static void main(String[] args){
		long a0=0;
		long a1=1;
		long l0,l1;
		for(int t=1;t<=31;t++){
			l0=a0;l1=a1;
			a0=l1+l0;
			a1=l0;
			System.out.println(t+":\t"+(a0+a1)+"\t"+a0+"\t"+a1);
		}
	}
}
