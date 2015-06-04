
public class a031 {
	public static void main(String[] args){
		int f=0;
		int m=200;
		int m200,m100,m50,m20,m10,m5;
		for(int t200=0;t200*200<=m;t200++){
			m200=m-t200*200;
			for(int t100=0;t100*100<=m200;t100++){
				m100=m200-t100*100;
				for(int t50=0;t50*50<=m100;t50++){
					m50=m100-t50*50;
					for(int t20=0;t20*20<=m50;t20++){
						m20=m50-t20*20;
						for(int t10=0;t10*10<=m20;t10++){
							m10=m20-t10*10;
							for(int t5=0;t5*5<=m10;t5++){
								m5=m10-t5*5;
								for(int t2=0;t2*2<=m5;t2++){
									f++;
								}
							}
						}
					}
				}
			}
		}
		System.out.print(f);
	}
}
