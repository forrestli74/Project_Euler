
/**
 * a one dimensional array that holds booleans 
 * 
 * @author jiaqi
 * @version 1.0
 */
public class BArray {
	/**Length of the array*/
	private int length=0;
	/**A long array that save booleans in group of 64*/
	long[] a;
	/**A long array with length of 64 The numbers are 2<sup>i</sup> (i=0...63)*/
	static long[] o;
	/**True means "o" has been generated.*/
	static boolean ifo=false;
	int aSize;
	/**
	 * @param length Length of the array you want to instantiate.
	 */
	public BArray(int length){
		this.length=length;
		aSize=(length-1)/64+1;
		a=new long[aSize];
		if(!ifo){
			o=new long[64];
			o[0]=1;
			for(int t=1;t<64;t++){
				o[t]=o[t-1]*2;
			}
		}
	}
	public boolean get(int index){
		if(index>=length){
			System.err.println("too big");
		}
		int aIndex=index/64;
		int aleft=index%64;
		if((a[aIndex]|o[aleft])==a[aIndex]){
			return true;
		}else{
			return false;
		}
	}
	public void set(int index,boolean b){
		if(index>length){
			System.err.println("too big");
		}
		int aIndex=index/64;
		int aleft=index%64;
		a[aIndex]|=o[aleft];
		if(!b){
			a[aIndex]^=o[aleft];
		}
	}
	public void set(int index,boolean[] bs){
		if(index+bs.length>length){
			System.err.println("too big");
		}
		int aIndex=index/64;
		int aleft=index%64;
		int newleft=aleft+bs.length;
		int newIndex=newleft/64+aIndex;
		if(newleft<64){
			a[aIndex]|=o[newleft]-o[aleft];
			for(int t=aleft;t<newleft;t++){
				if(!bs[t-aleft]){
					a[aIndex]^=o[aleft];
				}
			}
			return;
		}
		a[aIndex]|=-o[aleft];
		for(int t=aleft;t<64;t++){
			if(!bs[t-aleft]){
				a[aIndex]^=o[t];
			}
		}
		aIndex++;
		aleft=64-aleft;
		while(aIndex<newIndex){
			a[aIndex]=0;
			for(int t=0;t<64;t++){
				if(bs[t+aleft]){
					a[aIndex]^=o[t];
				}
			}
			aIndex++;
			aleft+=64;
		}
		a[aIndex]|=o[bs.length-aleft]-1;
		for(int t=aleft;t<bs.length;t++){
			if(!bs[t]){
				a[aIndex]^=o[t-aleft];
			}
		}
	}
}
