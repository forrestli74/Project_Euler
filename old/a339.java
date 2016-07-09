
public class a339{
	static Fraction[][] data;
	static int o2=10;
	static int o1;
	public static void main(String[] args){
		o1=o2*2+1;
		int con=0;
		data=new Fraction[o1][o1];
		for(int t1=0;t1<o1;t1++){
			data[0][t1]=new Fraction(t1);
		}
                /*
		for(int t1=2;t1<o1;t1++){
			for(int t2=1;t2<t1;t2++){
				con++;
				int t3=t1-t2;
				double tem=data[t3-1][t2+1]*t2+data[t3+1][t2-1]*t3;
				tem/=t1;
				if(tem<data[t3-1][t2]){
					tem=data[t3-1][t2];
				}
				if(data[t3][t2]<tem){
					data[t3][t2]=tem;
					if(t2!=1){
						t2-=2;
					}
				}
			}
		}
                */
		/*
		for(int t1=0;t1<o1;t1++){
			data[t1][0]=t1;
			for(int t2)
		}
		*/
		String f="";
		for(int t1=0;t1<o1;t1++){
			for(int t2=0;t2<o1;t2++){
				f+=data[t1][t2]+"\t";
			}
			f+="\n";
		}
		System.out.println(f);
		
		//double ff=data[o2-1][o2+1]+data[o2+1][o2-1];
		//System.out.println(ff/2+"\n"+con);
	}
}
