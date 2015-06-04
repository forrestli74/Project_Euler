

public class a049 {
	static byte c1[]=new byte[10];
	static byte c2[]=new byte[10];
	public static void main(String[] args){
		boolean p[]=new boolean[10000];
		int tt,l1;
		int c=0;
		int f=0;
		int fc=1;
		int r[]=new int[1229];
		for(int t=2;t<10000;t++){
			if(p[t]==false){
				r[c]=t;
				//System.out.println(c+" "+t);
				c++;
				tt=t*2;
				while(tt<10000){
					p[tt]=true;
					tt+=t;
				}
			}
		}
		System.out.println(c);
		co1(1234);co2(1235);
		System.out.println(e()?"1":"0");
		//for(int t1=0;t1<10;t1++){
		//	System.out.println(c2[t1]);
		//}
		for(int t1=168;t1<1227;t1++){
			co1(r[t1]);
			for(int t2=t1+1;t2<1228;t2++){
				co2(r[t2]);
				l1=2*r[t2]-r[t1];
				if(e()&&l1<10000){
					co2(l1);
					if(e()&&p[l1]==false){
						System.out.println(r[t1]+""+r[t2]+""+l1);
					}
				}
			}
		}
	}
	public static void co1(int x){
		for(byte t1=0;t1<10;t1++)
			c1[t1]=0;
		for(byte t1=0;t1<4;t1++){
			c1[x%10]++;
			x/=10;
		}
	}
	public static void co2(int x){
		for(byte t1=0;t1<10;t1++)
			c2[t1]=0;
		for(byte t1=0;t1<4;t1++){
			c2[x%10]++;
			x/=10;
		}
	}
	public static boolean e(){
		boolean j=true;
		for(byte t1=0;t1<10;t1++){
			if(c1[t1]!=c2[t1]){
				j=false;
			}
		}
		return j;
	}
}
