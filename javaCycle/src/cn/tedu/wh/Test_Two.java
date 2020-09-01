package cn.tedu.wh;

public class Test_Two {
	public static void main(String[] args) {
		int value=12;
		int[] arr=new int[] {1,3,5,7,9,11,12,18,20,30,40};
		System.out.println(ef(value,arr));
		
	}
	
	public static int ef(int value,int[] arr) {//
		int min=0;
		int max=arr.length-1;
		while(min<max) {
			int mid=(min+max)/2;
			if(value<arr[mid]) {
				max=mid;
			}else if(value>arr[mid]) {
				min=mid;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
