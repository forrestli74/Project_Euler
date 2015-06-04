
public class a029 {
	public static void main(String[] args){
		int o=100;
		boolean a[]=new boolean[o+1];
		int b[]=new int[2000];
		int l;
		int l3,f=0;
		int l2;
		boolean j;
		for(byte t=2;t<=o;t++){
			if(a[t]==false){
				l=t;l2=0;
				while(l<=o){
					a[l]=true;
					l*=t;
					l2++;
				}
				l=0;
				for(byte t1=2;t1<=o;t1++){
					for(byte t2=1;t2<=l2;t2++){
						j=false;
						l3=t1*t2;
						for(int t3=0;t3<l;t3++){
							if(b[t3]==l3){
								j=true;
							}
						}
						if(j==false){
							b[l]=l3;
							l++;
						}
					}
				}
				f+=l;
			}
		}
		System.out.println(f);
	}
}
