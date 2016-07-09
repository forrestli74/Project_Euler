

public class a270{
	public static void main(String[] args){
		long[][][][] sideRectangle=new long[31][31][31][31];
		int size=30;
		long o=100000000;
		long sum=0;
		sideRectangle[0][1][1][0]=1;
		for(int t1=1;t1<31;t1++){
		  	for(int t2=1;t2<31;t2++){
		   		sideRectangle[0][t1][t2][0]+=(sideRectangle[0][t1-1][t2][0]+sideRectangle[0][t1][t2-1][0])%o;
		   		sideRectangle[t1][t2][0][0]=sideRectangle[0][t1][t2][0];
		   		sideRectangle[0][0][t1][t2]=sideRectangle[0][t1][t2][0];
		   	}
		}
		for(int t1=1;t1<31;t1++){
			for(int t2=1;t2<31;t2++){
				for(int t3=1;t3<31;t3++){
					sideRectangle[0][t1][t2][t3]=(sideRectangle[0][t1-1][t2][t3]+sideRectangle[0][t1][t2][t3-1])%o;//5
					for(int t4=1;t4<t2;t4++){
						sideRectangle[0][t1][t2][t3]+=(sideRectangle[0][t1][t4][0]*sideRectangle[0][0][t2-t4][t3])%o;
					}
					sideRectangle[0][t1][t2][t3]=sideRectangle[0][t1][t2][t3]%o;
					sideRectangle[t1][t2][t3][0]=sideRectangle[0][t1][t2][t3];
				}
			}
		}
		for(int t1=1;t1<31;t1++){
			for(int t2=1;t2<31;t2++){
				for(int t3=1;t3<31;t3++){
					for(int t4=1;t4<31;t4++){
						sideRectangle[t1][t2][t3][t4]=(sideRectangle[t1-1][t2][t3][t4]+sideRectangle[t1][t2][t3][t4-1]+sideRectangle[t1][t2][0][0]*sideRectangle[0][0][t3][t4])%o;
						for(int t5=1;t5<t2;t5++){
							sideRectangle[t1][t2][t3][t4]+=(sideRectangle[t1][t2-t5][0][0]*sideRectangle[0][t5][t3][t4])%o;
						}
						for(int t5=1;t5<t3;t5++){
							sideRectangle[t1][t2][t3][t4]+=(sideRectangle[t1][t2][t3-t5][0]*sideRectangle[0][0][t5][t4])%o;
						}
						sideRectangle[t1][t2][t3][t4]=sideRectangle[t1][t2][t3][t4]%o;
					}
				}
			}
		}
		sum+=(sideRectangle[size-1][size][size][size-1]+sideRectangle[size-1][size][0][0]*sideRectangle[0][0][size][size])%o;
		for(int t=1;t<size;t++){
			sum+=(sideRectangle[size-1][t][0][0]*sideRectangle[0][size-t][size][size])%o;
			sum+=(sideRectangle[size-1][size][t][0]*sideRectangle[0][0][size-t][size])%o;
		}
		sum=sum%o;
		System.out.println(sideRectangle[0][2][2][0]);
		System.out.println(sideRectangle[0][10][10][10]);
		System.out.println(sum);
	}
}