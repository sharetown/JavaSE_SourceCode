package tu.tedu.method;

public class Test4 {
	public static void main(String[] args) {
		System.out.println(ef(1020,0));
	}
	public static int ef(int n,int i) {
		if(n>0) {
			i++;
			return ef(n/2-2,i);
		}else {
			return i;
		}
	}

}
