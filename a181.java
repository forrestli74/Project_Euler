import java.util.Scanner;


public class a181{
	private static long[][][][] data;
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int size1=scanner.nextInt();
		int size2=scanner.nextInt();
		data=new long[size1][][][];
		for(int t1=0;t1<size1;t1++){
			data[t1]=new long[t1+1][][];
			for(int t2=0;t2<=t1;t2++){
				data[t1][t2]=new long[size2][];
				for(int t3=0;t3<size2;t3++){
					data[t1][t2][t3]=new long[t3+1];
				}
			}
		}
		data[0][0][0][0]=1;
		for(int n=1;n<size2;n++){
			for(int k=1;k<=n;k++){
				long tem=0;
				for(int i=1;i<=k;i++){
					tem+=get(0,0,n-i,i);
				}
				data[0][0][n][k]=tem;
			}
		}
		for(int n1=1;n1<size1;n1++){
			for(int k1=1;k1<=n1;k1++){
				for(int n2=0;n2<size2;n2++){
					for(int k2=0;k2<=n2;k2++){
						long tem=0;
						for(int i1=0;i1<=k2;i1++){
							tem+=get(n1-k1,k1,n2-i1,i1);
							if(n1==1&&k1==1&&n2==0&&k2==1&&i1==0){
								System.out.println(get(n1-k1,k1,n2-i1,i1));
							}
						}
						for(int i1=0;i1<k1;i1++){
							for(int i2=0;i2<=n2;i2++){
							tem+=get(n1-i1,i1,n2-i2,i2);
							}
						}
						data[n1][k1][n2][k2]=tem;
					}
				}
			}
		}
		System.out.println("print:");
		String f="";
		
		for(int n1=0;n1<size1;n1++){
			for(int n2=0;n2<size2;n2++){
				for(int k1=0;k1<size1;k1++){
					f+="n="+n2+":\t";
					for(int k2=0;k2<size2;k2++){
						f+=get(n1,k1,n2,k2)+"\t";
					}
					f+="\t";
				}
				f+="\n";
			}
			f+="\n";
		}
		
		/*
		for(int n1=0;n1<size1;n1++){
			for(int n2=0;n2<size2;n2++){
				f+=data[n1][n1][n2][n2]+"\t";
			}
			f+="\n";
		}
		*/
		System.out.println(f);
	}
	public static long get(int n1,int k1,int n2,int k2){
		if(n1<0||n2<0){
			return 0;
		}
		if(k1>n1){
			return get(n1,n1,n2,n2);
		}
		if(k2>n2){
			return get(n1,k1,n2,n2);
		}
		return data[n1][k1][n2][k2];
	}
}
