import java.util.Hashtable;


public class a208{
	Hashtable<Integer,Integer> hs;
	public static void main(String[] args) {
		
	}
	public int get(int x){
		if(hs.get(x)==null){
			return 0;
		}else{
			return hs.get(x);
		}
	}
	
}
