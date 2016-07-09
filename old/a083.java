

import java.util.Scanner;

public class a083 {
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in).useDelimiter("\\s* ");
		int o=80;
		int a[][]=new int[o][o];
		int b[][]=new int[o][o];
		int c1,c2,t1,t2;
		for(t1=0;t1<o;t1++){
			for(t2=0;t2<o;t2++){
				a[t1][t2]=scanner.nextInt();
				System.out.print(a[t1][t2]+"\t");
			}
			System.out.println();
		}
		b[0][0]=a[0][0];
		t1=0;t2=0;
		while(t1<o){
			if(t1<o-1){
				if(b[t1+1][t2]==0||b[t1+1][t2]>b[t1][t2]+a[t1+1][t2]){
					b[t1+1][t2]=b[t1][t2]+a[t1+1][t2];
				}
			}
			if(t2<o-1){
				if(b[t1][t2+1]==0||b[t1][t2+1]>b[t1][t2]+a[t1][t2+1]){
					b[t1][t2+1]=b[t1][t2]+a[t1][t2+1];
				}
			}
			br:{
				if(t1>0){
					if(b[t1-1][t2]==0||b[t1-1][t2]>b[t1][t2]+a[t1-1][t2]){
						b[t1-1][t2]=b[t1][t2]+a[t1-1][t2];
						//System.out.println("!!!"+t1+" "+t2);
						t1--;
						break br;
					}
				}
				if(t2>0){
					if(b[t1][t2-1]==0||b[t1][t2-1]>b[t1][t2]+a[t1][t2-1]){
						b[t1][t2-1]=b[t1][t2]+a[t1][t2-1];
						t2--;
						break br;
					}
				}
				t2++;
				if(t2==o){
					t2=0;
					t1++;
				}
			}
		}
		System.out.println();
		for(t1=0;t1<o;t1++){
			for(t2=0;t2<o;t2++){
				System.out.print(b[t1][t2]+"\t");
			}
			System.out.println();
		}
	}
}
