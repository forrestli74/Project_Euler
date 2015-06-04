

public class a093 {
	static int c,o1,o2,o3,f1,f2,g1,g2,max=0,tn;
	static int[] s=new int[1000];
	static int[] t=new int[4];
	static int[] a=new int[4];
	static int[] o=new int[3];
	static boolean[] ch=new boolean[4];
	static boolean j;
	static int[] save;
	public static void main(String[] args){
		int l1,l2,r;
		for(a[0]=1;a[0]<10;a[0]++){
			for(a[1]=a[0];a[1]<10;a[1]++){
				for(a[2]=a[1];a[2]<10;a[2]++){
					for(a[3]=a[2];a[3]<10;a[3]++){
						c=0;
						for(int d=0;d<24;d++){
							l1=d;
							for(int tt=0;tt<4;tt++){
								ch[tt]=true;
							}
							for(int tt=4;tt>0;tt--){
								l2=l1%tt;
								r=0;
								while(l2>=0){
									if(ch[r]){
										l2--;
									}
									r++;
								}
								t[r-1]=a[tt-1];
								ch[r-1]=false;
								
							}
							for(o[0]=0;o[0]<6;o[0]++){
								for(o[1]=0;o[1]<6;o[1]++){
									for(o[2]=0;o[2]<6;o[2]++){
										f1=t[0];f2=1;
										for(int tt=0;tt<3;tt++){
											c(tt);
										}
										s();
										j=(f1>0);
										for(int tt=0;tt<c;tt++){
											if(f1==s[tt]){
												j=false;
												break;
											}
										}
										if(j){
											s[c]=f1;
											c++;
										}
										f1=t[0];f2=1;
										c(0);
										g1=f1;g2=f2;
										f1=t[2];
										f2=1;
										c(2);
										switch(o[1]){
											case 0:
												f1=f1*g2+f2*g1;
												f2*=g2;
												break;
											case 1:
												f1=f1*g2-f2*g1;
												f2*=g2;
												break;
											case 2:
												f1*=g1;
												f2*=g2;
												break;
											case 3:
												f1*=g2;
												f2*=g1;;
												break;
											case 4:
												int l;
												l=f1*g2;
												f1=f2*g1;
												f2=l;
												break;
											case 5:
												f1=f2*g1-f1*g2;
												f2*=g2;
												break;
										}
										j=(f1>0);
										for(int tt=0;tt<c;tt++){
											if(f1==s[tt]){
												j=false;
												break;
											}
										}
										if(j){
											s[c]=f1;
											c++;
										}
									}
								}
							}
						}
						tn=1;j=true;
						while(j){
							j=false;
							for(int tt=0;tt<c;tt++){
								if(s[tt]==tn){
									j=true;
									break;
								}
							}
							tn++;
						}
						if(tn>max){
							max=tn;
							save=t.clone();
							for(int tt=0;tt<c;tt++){
								System.out.print(s[tt]+" ");
							}
							System.out.println("\n"+max+"\t"+tn+"\t"+save[0]+"\t"+save[1]+"\t"+save[2]+"\t"+save[3]);
						}
					}
				}
			}
		}
		
	}
	public static void c(int tt){
		switch(o[tt]){
			case 0:
				f1+=f2*t[tt+1];
				break;
			case 1:
				f1-=f2*t[tt+1];
				break;
			case 2:
				f1*=t[tt+1];
				break;
			case 3:
				f2*=t[tt+1];
				break;
			case 4:
				int l;
				l=f1;
				f1=f2*t[tt+1];
				f2=l;
				break;
			case 5:
				f1=f2*t[tt+1]-f1;
				break;
		}
	}
	public static void s(){
		if(f2!=0){
			if(f1%f2==0){
				f1/=f2;
				return;
			}
		}
		f1=0;
	}
}
