

public class a027 {
	public static void main(String[] args){
		boolean p[]=new boolean[100000];
		int tt;
		int c=0;
		int f=0;
		int fb=0,fa=0;
		int r[]=new int[16800];
		for(int t=2;t<100000;t++){
			if(p[t]==false){
				r[c]=t;
				c++;
				System.out.println(t);
				tt=t*2;
				while(tt<100000){
					p[tt]=true;
					tt+=t;
				}
			}
		}
		for(int t1=0;t1<168;t1++){
			for(int t2=-999;t2<1000;t2++){
				c=0;
				tt=t1;
				while(p[tt]==false){
					c++;
					tt=c*c+t2*c+r[t1];
					if(tt<0){
						tt=4;
					}
				}
				if(c>f){
					f=c;
					fb=r[t1];
					fa=t2;
				}
			}
		}
		System.out.println(f+" "+fb*fa);
	}

}
