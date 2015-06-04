
public class a311 {
	public static void main(String[] args){
		long o=100;
		long sum1=2,sum2,fsum,tsum,min;
		long count,f=0;
		for(int BO=1;sum1<o;BO++){
			sum2=sum1+2;
			for(int AO=1;sum2<o;AO++){
				count=0;
				min=AO*AO-BO*BO;
				if(min<BO-AO){
					min=-min;
				}
				tsum=a000.sqrt(min+1);
				tsum*=tsum;
				fsum=AO*AO+BO*BO;
				for(long AB=a000.sqrt(min+1);AB*AB<fsum;AB++){
					if(a000.sqrtif(sum2-tsum)){
						System.out.println(BO+" "+AO+" "+sum2+" "+AB+" "+(sum2-tsum));
						count++;
					}
					tsum+=AB*2+1;
				}
				f+=count*(count-1)/2;
				sum2+=AO*4+2;
			}
			sum1+=BO*4+2;
		}
		System.out.println(f);
	}
}
