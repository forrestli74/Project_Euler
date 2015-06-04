

public class a147 {
	public static void main(String[] args){
		int f=0,sum,m;
		for(int a=1;a<48;a++){
			for(int b=1;b<44;b++){
				sum=a*(a+1)*b*(b+1)/4;
				m=Math.min(a,b);
				for(int t=1;t<=m;t++){
					sum+=(a-t)*(b-t)*4*t;
					sum+=(a-t)*(b-t+1)*t;
					sum+=(a-t+1)*(b-t)*t;
				}
				for(int t=1;t<m;t++){
					sum+=(a-t)*(b-t)*t;
					sum+=(a-t-1)*(b-t-1)*t;
				}
				System.out.println("a:"+a+"\tb:"+b+"\t"+sum);
				f+=sum;
			}
		}
		System.out.println(f);
	}
}
