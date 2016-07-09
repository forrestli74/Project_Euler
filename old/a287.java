

public class a287 {
	static int oo=3;
	static long[] o;
	static long sum;
	static long xx,yy;
	static boolean j,j1,j2;
	public static void main(String[] args){
		o=new long[oo];
		o[0]=1;
		for(int t=1;t<oo;t++){
			o[t]=2*o[t-1];
		}
		sum=1;
		c(o[oo-1]+o[oo-2],o[oo-1]+o[oo-2],oo-1);
		c(o[oo-1]+o[oo-2],o[oo-1]-o[oo-2],oo-1);
		c(o[oo-1]-o[oo-2],o[oo-1]+o[oo-2],oo-1);
		c(o[oo-1]-o[oo-2],o[oo-1]-o[oo-2],oo-1);
		System.out.println(sum);
	}
	static public void c(long x,long y,int lev){
		j=x>o[oo-1]^y>o[oo-1];
		if(lev==1){
			xx=x-o[oo-1];
			yy=y-o[oo-1];
			if(j){
				yy--;
			}
			j1=xx*xx+yy*yy<=o[oo-1]*o[oo-1];
			xx--;
			if(j){
				yy+=2;
			}else{
				yy--;
			}
			j2=xx*xx+yy*yy<=o[oo-1]*o[oo-1];
			if(j1^j2){
				sum+=9;
			}else{
				sum+=2;
			}
			return;
		}
		lev--;
		xx=x+o[lev]-1-o[oo-1];
		if(j){
			yy=y-o[lev]-o[oo-1];
		}else{
			yy=y+o[lev]-1-o[oo-1];
		}
		j1=xx*xx+yy*yy<=o[oo-1]*o[oo-1];
		if(j){
			xx=x+o[lev]-1-o[oo-1];
		}else{
			xx=x-o[lev]-o[oo-1];
		}
		yy=y-o[lev]-o[oo-1];
		j2=xx*xx+yy*yy<=o[oo-1]*o[oo-1];
		if(j1^j2){
			sum++;
			c(x+o[lev-1],y+o[lev-1],lev);
			c(x+o[lev-1],y-o[lev-1],lev);
			c(x-o[lev-1],y+o[lev-1],lev);
			c(x-o[lev-1],y-o[lev-1],lev);
		}else{
			sum+=2;
		}
	}
}
