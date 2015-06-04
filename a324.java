import java.util.ArrayList;


public class a324{

	static long o=29;
	static int[][] matrix;
	static int[] b;
	static int[] box,box2;
	public static void main(String[] args){
		matrix=new int[512][512];
		b=new int[9];
		box=new int[12];
		box2=new int[12];
		for(int t=0;t<9;t++){
			b[t]=1<<t;
		}
		int tem;
		for(int t=0;t<6;t++){
			tem=(t/2)*3+t%2;
			box[t]=b[tem]+b[tem+1];
		}
		for(int t=0;t<6;t++){
			box[t+6]=b[t]+b[t+3];
		}
		for(int t=0;t<12;t++){
			box2[t]=511^box[t];
			System.out.println(box[t]);
		}
		for(int t=0;t<512;t++){
			c(0,t,t);
		}
		boolean j=true;
		boolean[] bb=new boolean[512];
		bb[0]=true;
		while(j){
			j=false;
			for(int t=0;t<512;t++){
				if(bb[t]){
					for(int tt=0;tt<512;tt++){
						if(matrix[t][tt]!=0&&(!bb[tt])){
							bb[tt]=true;
							j=true;
						}
					}
				}
			}
		}
		int coun=0;
		int[] sm=new int[252];
		for(int t=0;t<512;t++){
			if(bb[t]){
				sm[coun]=t;
				coun++;
			}
			System.out.print(bb[t]?1:0);
		}
		System.out.println("\n"+coun);

		String out="";
		for(int t1=0;t1<252;t1++){
			for(int t2=0;t2+t1<252;t2++){
				out+=matrix[sm[t1]][sm[t2]];
			}
			out+="\n";
		}
		System.out.print(out);
		long[] real=new long[252];
		long[] real2=new long[252];
		real[0]=1;
		long c=0;
		while(real[0]!=1||c==0){
			c++;
			real2=real.clone();
			real=new long[252];
			for(int t1=0;t1<252;t1++){
				for(int t2=0;t2<t1;t2++){
					real[t1]+=real2[t2]*matrix[sm[t1]][sm[t2]];
				}
				real[t1]%=o;
			}
			if(c%10000==0){
				System.out.println(c/10000);
			}
		}
		System.out.println(c);
	}
	private static void c(int t,int p,int or) {
		if(t<3){
			System.out.println(or+" "+t);
		}
		
		if(t<12){
			c(t+1,p,or);
			if((p&box2[t])==p){
				c(t+1,p|box[t],or);
			}
		}else{
			matrix[or][511^p]++;
		}
	}
}
