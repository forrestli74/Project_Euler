import java.util.Scanner;


public class a303c{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long sum=0;
		for(int t=0;t<9997;t++){
			String ss=s.nextLine();
			String[] sa=ss.split("\t");
			long tem=Long.parseLong(sa[2])/Long.parseLong(sa[1].substring(0,sa[1].length()-1));
			System.out.println(tem);
			sum+=tem;
		}
		sum+=10002000200020002L/9L;
		sum+=1112222222222220L/4995L;
		sum+=1112222222222220L/9990L;
		System.out.println(sum);
	}
}
