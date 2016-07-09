

public class a017 {
	public static void main(String[] args){
		int a1=3+3+5+4+4+3+5+5+4;
		int a2=a1*9+3+6+6+8+8+7+7+9+8+8+(6+6+5+5+5+7+6+6)*10;
		int a3=a1*100+7*900+3*891+a2*10;
		System.out.println(a3+11);
	}
}
//a1=1-9	one two three four five six seven eight nine
//a2=1-99	a1*9 ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen (twenty thirty forty fifty sixty seventy eighty ninety)*10
//a3=1-999	hundred*(a1)*100 and*891 