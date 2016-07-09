

public class a019 {
	public static void main(String[] args){
		byte a[]={2,2,2,1,3,1,1};
		byte b[]={3,2,1,2,2,1,1};
		int c=0,d=2;
		for(int y=1901;y<=2000;y++){
			if(y%4==0){
				c+=b[d];
				d+=2;
				d=d%7;
			}else{
				c+=a[d];
				d++;
				d=d%7;
			}
		}
		System.out.println(c);
	}
}
