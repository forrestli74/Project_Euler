

import java.util.Scanner;

public class a059 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in).useDelimiter(",");
		int[] a=new int[1200];
		int[] b=new int[1200];
		int sum,max=0,ssum;
		int tt1,tt2,tt3;
		for(int t=97;t<=122;t++){
			System.out.println(t+" "+(char) t);
		}
		for(int t=0;t<1200;t++){
			a[t]=(char) scanner.nextInt();
		}
		for(int t1=97;t1<=122;t1++){
			for(int t2=97;t2<=122;t2++){
				for(int t3=97;t3<=122;t3++){
					sum=0;
					for(int t4=0;t4<1200;t4+=3){
						b[t4]=a[t4]^t1;
						b[t4+1]=a[t4+1]^t2;
						b[t4+2]=a[t4+2]^t3;
					}
					for(int t4=0;t4<1198;t4++){
						if(b[t4]=='t'&&b[t4+1]=='h'&&b[t4+2]=='e'){
							sum++;
						}
					}
					if(max<sum){
						tt1=t1;tt2=t2;tt3=t3;
						//System.out.println(tt1+" "+tt2+" "+tt3+"\t"+sum);
						max=sum;
						ssum=0;
						for(int t=0;t<1200;t++){
							ssum+=b[t];
							System.out.print((char)b[t]);
						}
						System.out.println("\n"+ssum+"\t"+tt1+" "+tt2+" "+tt3+"\t"+sum);
						System.out.println((73^t1));
					}
				}
			}
		}
		
	}
}
