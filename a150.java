

import java.util.Scanner;

public class a150 {
	public static void main(String[] args){
		long o1=615949,o2=797807,o3=1000,o4=1024*1024;
		//long o1=47,o2=17,o3=6,o4=64;
		long[][] data=new long[(int) o3][(int) o3];
		long[][][] d=new long[4][(int) o3][(int) o3];
		long tem1=0;
		int tem2=0;
		long sum=0,sumt,count=0;
		//String out="";
		//Scanner scanner=new Scanner(System.in).useDelimiter("\\s* ");
		for(int t=0;t<o3;t++){
			tem1=(o1*tem1+o2)%o4;
			if(t>tem2){
				t=0;
				tem2++;
				//out+="\n";
			}

			d[3][(int) (o3-1-tem2)][t]=tem1-o4/2;
			data[(int) (o3-1-tem2)][t]=tem1-o4/2;
			//d[3][(int) (o3-1-tem2)][t]=scanner.nextLong();
			//data[(int) (o3-1-tem2)][t]=d[3][(int) (o3-1-tem2)][t];
			//out+=d[3][(int) (o3-1-tem2)][t]+"\t";
		}
		//System.out.println(out);
		System.out.println(d[3][(int) (o3-1)][0]+"\t"+d[3][(int) (o3-2)][0]+"\t"+d[3][(int) (o3-2)][1]);
		for(int t1=1;t1<o3;t1++){
			for(int t2=0;t2<o3;t2++){
				d[0][t2]=d[1][t2].clone();
				d[1][t2]=d[2][t2].clone();
				d[2][t2]=d[3][t2].clone();
			}
			//System.out.println("!!!"+d[2][5][0]+"\t"+d[2][4][0]+"\t"+d[2][4][1]);
			for(int t2=0;t1+t2<o3;t2++){
				for(int t3=0;t1+t2+t3<o3;t3++){
					d[3][t2][t3]=
						(d[2][t2][t3]+d[2][t2+1][t3]+d[2][t2][t3+1])-
						(d[1][t2+1][t3+1]+d[1][t2+1][t3]+d[1][t2][t3+1])+
						d[0][t2+1][t3+1];
					//System.out.println(d[2][t2][t3]+"\t"+d[2][t2+1][t3]+"\t"+d[2][t2][t3+1]);
					//System.out.println(t1+" "+t2+" "+t3+" "+d[3][t2][t3]);
					if(d[3][t2][t3]<sum){
						count++;
						sum=d[3][t2][t3];
						if(count%1000==0){
							sumt=0;
							for(int tt1=0;tt1<=t1;tt1++){
								for(int tt2=0;tt2+tt1<=t1;tt2++){
									sumt+=data[t2+tt1][t3+tt2];
								}
							}
							System.out.println((count/1000)+"\t"+sum+"\t"+sumt);
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}
