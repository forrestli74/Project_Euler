

public class a145{
	  public static void main(String[] args){
	    int sum=0;
	    for(int a=1;a<1000000000;a++){
	      if(cc(a)){
	        sum++;
	        //System.out.println(a);
	      }
	      if(a%10000000==0){
	        System.out.println(a/10000000);
	      }
	    }
	    System.out.println(sum);
	  }
	  public static boolean cc(int a){
	    int l1=0,l2=a;
	    if(a%10==0){
	      return false;
	    }
	    while(a!=0){
	      l1*=10;
	      l1+=a%10;
	      a/=10;
	    }
	    l1+=l2;
	    while(l1!=0){
	      if(l1%2==0){
	        return false;
	      }else{
	        l1/=10;
	      }
	    }
	    return true;
	  }
	}