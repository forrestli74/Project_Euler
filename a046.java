

public class a046 {
	public static void main(String[] args){
		boolean p[]=new boolean[1000000];
		boolean a[]=new boolean[1000000];
		int tt,t1,l1;
		int c=0;
		int f=0;
		boolean j=true;
		int r[]=new int[78498];
		for(int t=2;t<1000000;t++){
			if(p[t]==false){
				r[c]=t;
				t1=0;
				l1=0;
				while(l1<1000000){
					a[l1]=true;
					t1++;
					l1=t+2*t1*t1;
				}
				c++;
				tt=t*2;
				while(tt<1000000){
					p[tt]=true;
					tt+=t;
				}
			}
		}
		t1=9;
		while(j&&t1<1000000){
			if(p[t1]==true&&a[t1]==false){
				j=false;
			}
			t1+=2;
		}
		System.out.println(t1-2);
	}
}
