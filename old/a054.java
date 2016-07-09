

import java.util.Scanner;

public class a054 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		byte[][] p=new byte[2][18];
		boolean j1,j2;
		long[][] s=new long[2][2];
		int sum=0;
		String u;
		for(int round=0;round<1000;round++){
			u=scanner.nextLine();
			for(int tt=0;tt<2;tt++){
				for(int t1=1;t1<14;t1++){
					p[tt][t1]=0;
				}
				for(int t=tt*15;t<15*(tt+1);t+=3){
					switch(u.charAt(t)){
						case 'A':
							p[tt][13]++;break;
						case '2':
							p[tt][1]++;break;
						case '3':
							p[tt][2]++;break;
						case '4':
							p[tt][3]++;break;
						case '5':
							p[tt][4]++;break;
						case '6':
							p[tt][5]++;break;
						case '7':
							p[tt][6]++;break;
						case '8':
							p[tt][7]++;break;
						case '9':
							p[tt][8]++;break;
						case 'T':
							p[tt][9]++;break;
						case 'J':
							p[tt][10]++;break;
						case 'Q':
							p[tt][11]++;break;
						case 'K':
							p[tt][12]++;break;
					}
					switch(u.charAt(t+1)){
						case 'D':
							p[tt][14]=0;break;
						case 'S':
							p[tt][15]=1;break;
						case 'C':
							p[tt][16]=2;break;
						case 'H':
							p[tt][17]=3;break;
					}
				}
				
			}
			for(int tt=0;tt<2;tt++){
				br:{
					j2=true;
					for(int t1=15;t1<18;t1++){
						if(p[tt][14]!=p[tt][t1]){
							j2=false;
						}
					}
					for(int t0=10;t0>0;t0--){
						j1=true;
						for(int t1=t0;t1<t0+5;t1++){
							if(p[tt][t1]!=1){
								j1=false;
								break;
							}
						}
						if(j1){
							s[tt][1]=(byte) t0;
							if(j2){
								//Straight Flush or Royal Flush
								s[tt][0]=8;
							}else{
								//Straight
								s[tt][0]=4;
							}
							break br;
						}
					}
					if(j2){
						//Flush
						s[tt][0]=5;
						for(int t1=13;t1>0;t1--){
							if(p[tt][t1]>0){
								s[tt][1]=(byte) t1;
								break br;
							}
						}
						break br;
					}
					for(byte t1=13;t1>0;t1--){
						if(p[tt][t1]==4){
							//Four of a kind
							s[tt][1]=t1;
							s[tt][0]=7;
							break br;
						}
					}
					
					for(byte t1=13;t1>0;t1--){
						if(p[tt][t1]==3){
							s[tt][1]=t1;
							for(byte t2=13;t2>0;t2--){
								if(p[tt][t1]==2){
									//Full House
									s[tt][0]=6;
									break br;
								}
							}
							//Three of a kind;
							s[tt][0]=3;
							break br;
						}
					}
					
					for(byte t1=13;t1>0;t1--){
						if(p[tt][t1]==2){
							s[tt][1]=t1;
							for(byte t2=(byte) (t1-1);t2>0;t2--){
								if(p[tt][t2]==2){
									//Two Pairs
									s[tt][0]=2;
									s[tt][1]*=14;
									s[tt][1]+=t2;
									for(byte t3=13;t3>0;t3--){
										if(p[tt][t3]==1){
											s[tt][1]*=14;
											s[tt][1]+=t3;
											break br;
										}
									}
								}
							}
							//One Pair;
							s[tt][0]=1;
							for(byte t3=13;t3>0;t3--){
								if(p[tt][t3]==1){
									s[tt][1]*=14;
									s[tt][1]+=t3;
								}
							}
							break br;
						}
					}
					
					//High Card
					s[tt][0]=0;
					s[tt][1]=0;
					for(byte t3=13;t3>0;t3--){
						if(p[tt][t3]==1){
							s[tt][1]*=14;
							s[tt][1]+=t3;
						}
					}
				}
			}
			System.out.println(u);
			System.out.println(round+":\t"+s[0][0]+" "+s[0][1]+"\t"+s[1][0]+" "+s[1][1]);
			if(s[0][0]>s[1][0]){
				sum++;
			}else if(s[0][0]<s[1][0]){}else{
				if(s[0][1]>s[1][1]){
					sum++;
				}else if(s[0][1]==s[1][1]){
					System.out.println("!!!!!!!!!!!!!!!!");
				}
			}
		}
		System.out.println(sum);
	}
}
