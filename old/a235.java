

import java.math.BigDecimal;

public class a235 {
	public static void main(String[] args){
		BigDecimal x1=new BigDecimal("1.002322108");
		BigDecimal x2=new BigDecimal("1.002322109");
		BigDecimal d=new BigDecimal("0.1");
		BigDecimal b1=d.pow(12);
		d=x2.subtract(x1);
		while(d.compareTo(b1)==1){
			
		}
	}
}
