public class Code {
	public static void main(String[ ] args) {
		//Palindrome
		int x = 1221;
		String str = x + "";
		System.out.println(str.equals(new StringBuilder(str).reverse().toString()));
		
		System.out.println();
		
		//Reverse Integer
		x = 123;
		str = x + "";
		boolean ch = str.toCharArray()[0] == '-';
		if(ch) {
			str = str.substring(1);
		}
		int g;
		try {
			g = Integer.valueOf(new StringBuilder(str).reverse().toString());
		}
		catch(Exception e){
			g = 0;
		}
		if(ch) {
			System.out.println(g * -1);
		}
		else{
			System.out.println(g);
		}
		
		System.out.println();
		
		//Divide two integers
		int dividend = 10,divisor = 5;
		if( (dividend == -2147483648) && (divisor == -1)) {
			System.out.println(2147483647);
		}
        if( (dividend == -2147483648) && (divisor == 1)) {
			System.out.println(-2147483648);
		}
        int ans = 0;
        ch = ((dividend < 0) && !(divisor < 0)) || (!(dividend < 0) && (divisor < 0));
        if(dividend > 0){
            dividend *= -1;
        }
        if(divisor > 0){
            divisor *= -1;
        }
        while(dividend <= divisor){
            ans++;
            dividend -= divisor;
        }
        if(ch){
            ans *= -1;
        }
        System.out.println(ans);
        
        System.out.println();
        
        //Sqrt()
        x = 9;
        
        double l = 0, r = x, m = (r + l) / 2;
        if(x == 1)
            System.out.println(1);
		for(int i = 0; i < 75; i++) {
			m = (l + r)/2;
			if(m * m == x) {
				break;
			}
			else if(m * m > x) {
				r = m;
			}
			else {
				l = m;
			}
		}
		System.out.println((int)m);
    }
}
