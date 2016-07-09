

public class a092 {
	public static void main(String[] args){
		int l1,l2,c,f=0;
		for(int a=1;a<10000000;a++){
			l1=a;
			while(l1!=1&&l1!=89){
				l2=l1;
				l1=0;
				for(int t=0;t<9;t++){
					c=l2%10;
					c*=c;
					l1+=c;
					l2/=10;
				}
			}
			if(l1==89){
				//System.out.println(a);
				f++;
			}
		}
		System.out.println(f);
	}
}
