

public class a183{
	  final static double e=Math.E;
	  public static void main(String[] args){
	    int sum=0;
	    for(int a=5;a<=10000;a++){
	      if(cc(a)){
	        sum-=a;
	      }else{
	        sum+=a;
	      }
	    }
	    System.out.println(sum);
	  }
	  public static boolean cc(int a){
	    int l=(int) (a/e+.5);
	    //System.out.println(l);
	    while(l%2==0){
	      l/=2;
	    }
	    while(l%5==0){
	      l/=5;
	    }
	    if(a%l==0){
	      return true;
	    }else{
	      return false;
	    }
	  }
	}