

public class a050 {
	public static void main(String[] args){
		boolean p[]=new boolean[1000000];
		int tt,t1,l1;
		int c=0;
		int f=0;
		int fc=1;
		int r[]=new int[78498];
		for(int t=2;t<1000000;t++){
			if(p[t]==false){
				r[c]=t;
				//System.out.println(t);
				c++;
				tt=t*2;
				while(tt<1000000){
					p[tt]=true;
					tt+=t;
				}
			}
		}
		System.out.println(p[r[2]]?"":r[2]);
		for(int t=0;t<78498;t++){
			l1=0;t1=0;
			//for(int t2=t;t2<t1+t;t2++){
			//	l1+=r[t2];
			//}
			while(l1<1000000&&t1+t<78498){
				//System.out.println(l1);
				if(p[l1]==false){
					if(fc<t1){
						f=l1;
						fc=t1;
					}
				}
				l1+=r[t1+t];
				t1++;
			}
		}
		System.out.println(f+" "+fc);
	}
}
