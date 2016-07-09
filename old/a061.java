
public class a061 {
			public static void main(String[] args) {
						int oo=1;
						for(int t=2;t<7;t++){
									oo*=t;
						}
						int[] i=new int[6];
						int[] f=new int[6];
						for(int o=0;o<oo;o++){
									toA(o,i);
									//print(i);
									for(int x=1;x<100;x++){
												f[0]=x;
												if(c(i,f,0)){
															print(f,i);
												}
									}
						}
			}
			static boolean c(int[] i, int[] f,int ind){
						if(ind>2){
									//System.out.println(ind);
									//print(i,f);
						}
						int[] range=B(i[ind],f[ind]);
						//System.out.println(i[ind]+" "+f[ind]+" "+range[0]+" "+range[1]);
						for(int x=range[0];x<range[1];x++){
									int nx=T(i[ind],x)-f[ind]*100;
									//print(i,f);
									//System.out.println(ind);
									if(ind==5){
												if(nx==f[0]){
															return true;
												}
									}else{
												f[ind+1]=nx;
												if(c(i,f,ind+1)){
															return true;
												}
									}
						}
						return false;
			}
			static int T(int type,int x){
						switch(type){
									case 0:
												return x*(x+1)/2;
									case 1:
												return x*x;
									case 2:
												return x*(3*x-1)/2;
									case 3:
												return x*(2*x-1);
									case 4:
												return x*(5*x-3)/2;
									case 5:
												return x*(3*x-2);
									default:
												return -1;
						}
			}
			static int[] B(int type,int x){
						x*=100;
						int[] f=new int[2];
						int a=(int)(Math.sqrt(x*2/(type+1)))-2;
						int test=T(type,a);
						while(test<x+10){
									a++;
									test=T(type,a);
						}
						f[0]=a;
						while(test<x+100){
									a++;
									test=T(type,a);
						}
						f[1]=a;
						return f;
			}
			static void toA(int x,int[] f){
						for(int t=0;t<6;t++){
									f[t]=-1;
						}
						
						for(int t=6;t>0;t--){
									int a=x%t;
									x/=t;
									int tt=0;
									while(tt<6&&a>=0){
												if(f[tt]==-1){
															a--;
												}
												tt++;
									}
									tt--;
									f[tt]=6-t;
						}
						
			}
			static void print(int[] a){
						String s="";
						for(int t=0;t<6;t++){
									s+=a[t]+" ";
						}
						System.out.println(s);
			}
			private static void print(int[] f,int[] i) {
						String fs1="",fs2="";
						for(int t=0;t<6;t++){
									fs1+=f[t]+"\t";
									fs2+=i[t]+"\t";
						}
						System.out.println(fs1+"\n"+fs2);
			}
}
