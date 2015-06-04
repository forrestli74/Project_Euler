import java.util.Scanner;


public class a089{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int count=0;
		int[] data={1,5,10,50,100,500,1000};
		int[] data2={0,1,2,3,2,1,2,3,4,2};
		for(int t=0;t<1000;t++){
			String a=scanner.nextLine();
			int[] n=new int[7];
			int[] od=new int[8];
			int o=7;
			boolean j=true;
			int to=0;
			System.out.print(a);
			for(char c:a.toCharArray()){
				switch(c){
				case 'I':n[0]++;if(o!=0){od[o]=to;to++;}o=0;break;
				case 'V':n[1]++;if(o!=1){od[o]=to;to++;}o=1;break;
				case 'X':n[2]++;if(o!=2){od[o]=to;to++;}o=2;break;
				case 'L':n[3]++;if(o!=3){od[o]=to;to++;}o=3;break;
				case 'C':n[4]++;if(o!=4){od[o]=to;to++;}o=4;break;
				case 'D':n[5]++;if(o!=5){od[o]=to;to++;}o=5;break;
				case 'M':n[6]++;if(o!=6){od[o]=to;to++;}o=6;break;
				}
			}
			/*
			int sum=0;
			for(int tt=0;tt<7;tt++){
				int  x=tt+1;
				while(od[x]==0&&x!=7){
					x++;
				}
				if(od[x]<od[tt]){
					sum+=n[tt]*data[tt];
				}else{
					sum-=n[tt]*data[tt];
				}
			}
			int size=0;
			while(sum!=0){
				size+=data2[sum%10];
				sum/=10;
			}
			j=size==a.length();
			*/
			for(int tt=0;tt<3;tt++){
				if(n[tt*2]>3||n[tt*2+1]>1){
					j=false;
					break;
				}
			}
			if(j){
				count+=a.length();
			}
			System.out.println(j);
		}
		System.out.println(count);
	}
}
