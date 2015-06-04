
public class Fraction implements Comparable<Fraction>{
	long a,b;
	public Fraction(long aa){
		a=aa;
		b=1;
	}
	public Fraction(long aa,long bb){
		a=aa;b=bb;
		simplify();
	}
        public void set(long aa,long bb){
            a=aa;b=bb;
            simplify();
        }
        public void set(Fraction f){
            a=f.a;b=f.b;
        }
	public void add(Fraction x){
		a=a*x.b+x.a*b;
		b=b*x.b;
		simplify();
	}
	public void sub(Fraction x){
		a=a*x.b-x.a*b;
		b=b*x.b;
		simplify();
	}
	public void mul(Fraction x){
		a*=x.a;
		b*=x.b;
		simplify();
	}
	public void div(Fraction x){
		a*=x.b;
		b*=x.a;
		simplify();
	}
	public void simplify(){
		long c=LCD(a,b);
		a/=c;
		b/=c;
		if(b<0){
			a=-a;
			b=-b;
		}
	}
	public static long LCD(long a,long b){
		if(a<0){a=-a;}
		if(b<0){b=-b;}
		long c;
		if(a>=b){
			c=b;
		}else{
			c=a;
			a=b;
			b=c;
		}
		while(c!=0){
			c=a%b;
			a=b;
			b=c;
		}
		return a;
	}
	@Override
	public int compareTo(Fraction x) {
		long f=a*x.b-b*x.a;
		if(f>0){return 1;}else if(f<0){return -1;}else{return 0;}
	}
}
