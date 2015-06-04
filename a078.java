import java.util.ArrayList;



public class a078 {
	private static ArrayList<int[]> data=new ArrayList<int[]>();
	public static void main(String[] args){
		data.add(new int[1]);
		data.get(0)[0]=1;
		int n=0;
//		while(data.get(n)[n]!=0){
		while(data.size()<50){
//		while(true){
			n++;
			int[] l=new int[n+1];
			int tem=0;
			for(int k=1;k<=n;k++){
				tem+=get(n-k,k);
//				tem%=100000;
				l[k]=tem;
			}
			data.add(l);
			if(data.get(n)[n]%10000==0)
			System.out.println(n+"\t"+l[n]);
		}
		
		String out="";
		for(int[] l:data){
			for(int l2:l){
				out+=l2+"\t";
			}
			out+="\n";
		}
		System.out.println(out);
		
	}
	private static long get(int n,int k) {
		if(n<0){
			return 0;
		}
		if(k>n){
			return get(n,n);
		}
		return data.get(n)[k];
	}
}
