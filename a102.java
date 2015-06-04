

import java.util.Scanner;

public class a102 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String string;
		boolean j1,j2;
		int sum=0;
		int[] c=new int[6];
		int l;
		for(int t1=0;t1<1000;t1++){
			string=scanner.nextLine();
			for(int t2=0;t2<5;t2++){
				l=string.indexOf(',');
				c[t2]=Integer.parseInt(string.substring(0,l));
				string=string.substring(l+1);
			}
			c[5]=Integer.parseInt(string.substring(0));
			j1=(c[0]*c[5]-c[1]*c[4]>0);
			j2=true;
			for(int t2=0;t2<4;t2+=2){
				if((c[t2+1]*c[t2+2]-c[t2]*c[t2+3]>0)^j1){
					j2=false;
				}
			}
			if(j2){
				sum++;
			}
		}
		System.out.println(sum);
	}
}
