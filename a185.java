
public class a185 {

	static String[] os=new String[22];
	static int[] oc=new int[22];
	static int[][] od=new int[22][16];
	static int[] f=new int[16];
	public static void main(String[] args){
		os[0]="5616185650518293";oc[0]=2;
		os[1]="3847439647293047";oc[1]=1;
		os[2]="5855462940810587";oc[2]=3;
		os[3]="9742855507068353";oc[3]=3;
		os[4]="4296849643607543";oc[4]=3;
		os[5]="3174248439465858";oc[5]=1;
		os[6]="4513559094146117";oc[6]=2;
		os[7]="7890971548908067";oc[7]=3;
		os[8]="8157356344118483";oc[8]=1;
		os[9]="2615250744386899";oc[9]=2;
		os[10]="8690095851526254";oc[10]=3;
		os[11]="6375711915077050";oc[11]=1;
		os[12]="6913859173121360";oc[12]=1;
		os[13]="6442889055042768";oc[13]=2;
		os[14]="2321386104303845";oc[14]=0;
		os[15]="2326509471271448";oc[15]=2;
		os[16]="5251583379644322";oc[16]=2;
		os[17]="1748270476758276";oc[17]=3;
		os[18]="4895722652190306";oc[18]=1;
		os[19]="3041631117224635";oc[19]=3;
		os[20]="1841236454324589";oc[20]=3;
		os[21]="2659862637316867";oc[21]=2;
		for(int t1=0;t1<22;t1++){
			for(int t2=0;t2<16;t2++){
				od[t1][t2]=Integer.parseInt(os[t1].charAt(t2)+"");
			}
		}
		for(int t=0;t<10;t++){
			boolean j=r(oc,t,0);
			if(j){
				break;
			}
		}
		for(int t=0;t<16;t++){
			System.out.print(f[t]);
		}
	}
	public static boolean r(int[] c,int a,int t){
		int[] cc=c.clone();
		f[t]=a;
		for(int tt=0;tt<22;tt++){
			if(od[tt][t]==a){
				cc[tt]--;
				if(cc[tt]<0){
					return false;
				}
			}
		}
		if(t<7){
			System.out.println(""+f[0]+f[1]+f[2]+f[3]+f[4]+f[5]+f[6]);
		}
		
		if(t==15){
			for(int tt=0;tt<22;tt++){
				if(cc[tt]!=0){
					return false;
				}
			}
			return true;
		}
		for(int tt=0;tt<10;tt++){
			boolean j=r(cc,tt,t+1);
			if(j){
				return true;
			}
		}
		return false;
	}
}
