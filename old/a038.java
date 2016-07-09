

public class a038 {
	public static void main(String[] args){
		boolean a[]=new boolean[10];
		int s[]=new int[10];
		byte t1,t2;
		int l1,l2,l3;
		boolean j1,j2;
		for(int t=1;t<10000;t++){
			l1=t;j1=true;j2=true;
			t2=0;
			for(t1=0;t1<10;t1++){
				a[t1]=false;
				s[t1]=0;
			}
			while(j2&&j1){
				s[t2]=l1;
				l2=l1;
				while(l2!=0){
					l3=l2%10;
					l2/=10;
					if(a[l3]){
						j1=false;
					}else if(l3==0){
						j1=false;
					}else{
						a[l3]=true;
					}
				}
				j2=false;
				for(t1=1;t1<10;t1++){
					if(a[t1]==false){
						j2=true;
					}
				}
				l1+=t;
				t2++;
			}
			if(j1){
				for(t2=0;t2<10;t2++){
					System.out.print(s[t2]==0?"":s[t2]);
				}
				System.out.println();
			}
			
		}
	}
}
