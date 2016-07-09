

public class a165 {
	public static void main(String[] args){
		long ss=290797;
		int a[][]=new int[5000][4];
		int s[][]=new int[5000000][6];
		int m[]=new int[5000];
		int cx[]=new int[5000];
		int cy[]=new int[5000];
		int t1,t2,x1,x2,y1,y2,x=0,y=0,t=0,l1,l2,tt;
		long time=System.currentTimeMillis();
		boolean j1,j2;
		for(t1=0;t1<5000;t1++){
			for(t2=0;t2<4;t2++){
				ss=(ss*ss)%50515093;
				a[t1][t2]=(int) (ss%500);
				System.out.print(a[t1][t2]+"\t");
			}
			m[t1]=a[t1][0]*a[t1][3]-a[t1][1]*a[t1][2];
			cx[t1]=a[t1][0]-a[t1][2];
			cy[t1]=a[t1][1]-a[t1][3];
			System.out.println();
		}
		for(t1=0;t1<5000;t1++){
			for(t2=t1+1;t2<5000;t2++){
				j2=true;
				x1=-m[t1]*cx[t2]+m[t2]*cx[t1];
				x2=cy[t1]*cx[t2]-cx[t1]*cy[t2];
				if(x2==0){
					j2=false;
				}else{
					x=x1/x2;
				}
				y1=m[t1]*cy[t2]-m[t2]*cy[t1];
				y2=-cy[t1]*cx[t2]+cx[t1]*cy[t2];
				if(y2==0){
					j2=false;
				}else{
					y=y1/y2;
				}
				
				j1=true;
				if(a[t1][0]<a[t1][2]){
					l1=a[t1][0];l2=a[t1][2];
				}else if(a[t1][0]>a[t1][2]){
					l2=a[t1][0];l1=a[t1][2];
				}else{
					j1=false;
					if(a[t1][1]<a[t1][3]){
						l1=a[t1][1];l2=a[t1][3];
					}else{
						l2=a[t1][1];l1=a[t1][3];
					}
				}
				if(j2){
					if(j1){
						if(l1>x||x>=l2){
							j2=false;
						}else if(l1*x2>=x1){
							j2=false;
						}
					}else{
						if(l1>y||y>=l2){
							j2=false;
						}else if(l1*y2>=y1){
							j2=false;
						}
					}
				}
				if(j2){
					j1=true;
					if(a[t2][0]<a[t2][2]){
						l1=a[t2][0];l2=a[t2][2];
					}else if(a[t2][0]>a[t2][2]){
						l2=a[t2][0];l1=a[t2][2];
					}else{
						j1=false;
						if(a[t2][1]<a[t2][3]){
							l1=a[t2][1];l2=a[t2][3];
						}else{
							l2=a[t2][1];l1=a[t2][3];
						}
					}
					if(j1){
						if(l1>x||x>=l2){
							j2=false;
						}else if(l1*x2>=x1){
							j2=false;
						}
					}else{
						if(l1>y||y>=l2){
							j2=false;
						}else if(l1*y2>=y1){
							j2=false;
						}
					}
				}
				tt=0;
				while(j2&&tt<t){
					if(s[tt][4]==x&&s[tt][5]==y){
						if(s[tt][0]*x2==x1*s[tt][1]&&s[tt][2]*y2==s[tt][3]*y1){
							System.out.println("!\n!\n!\n!\n!");
							j2=false;
						}
					}
					tt++;
				}
				if(j2){
					s[t][0]=x1;s[t][1]=x2;s[t][2]=y1;s[t][3]=y2;s[t][4]=x;s[t][5]=y;
					t++;
					//System.out.println("No."+t+"\t"+(System.currentTimeMillis()-time));
				}
			}
			//System.out.println("No."+t1+":"+"\t"+t+"\t"+(System.currentTimeMillis()-time));
		}
		System.out.println(t);
	}
}
