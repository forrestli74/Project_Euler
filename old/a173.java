

public class a173 {
	public static void main(String[] args){
		final int o=1000000;
		int h=1;
		int l=8;
		int s=8;
		long sum=0;
		while(s<=o){
			while(s<=o){
				sum++;
				//System.out.println(h+" "+(l/4+1));
				l+=8;
				s+=l;
			}
			h++;
			s=(h+1)*4;
			l=s;
		}
		System.out.println(sum);
	}
}
