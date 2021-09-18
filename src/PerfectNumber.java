
public class PerfectNumber {
	public static void main(String[] args) {
		int Number=3;
		int SumOfFactor=0;
		for(int i=1;i<Number;i++) {
			if(Number%i==0) 
			{
				SumOfFactor+=i;
			}
		}
		if(SumOfFactor==Number) {
			System.out.println(Number+" is Perfect Number");
		}
		else {
			System.out.println(Number+" is not Perfect Number");
		}
	}

}
