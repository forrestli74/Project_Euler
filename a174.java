

public class a174 {
	public static void main(String[] args){
		int l1,l2,sum=0;
		for(int a=2;a<=250000;a++){
			l1=1;
			for(int t1=2;t1*t1<a;t1++){
				if(a%t1==0){
					l1++;
				}
			}
			if(l1<11){
				sum++;
			}
		}
		System.out.println(sum);
	}
}
