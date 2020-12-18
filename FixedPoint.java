
public class FixedPoint {

	public static int point(int[] arr){
		if(arr == null || arr.length == 0) return -1;
		if(arr.length == 1) return arr[0] == 0 ? 0 : -1;
		int len = arr.length;
		int start = 0;
		int end = len;
		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			if(arr[mid] == mid) return mid;
			else if(arr[mid] > mid) end = mid;
			else start = mid;
		}
		if(arr[start] == start) return start;
		else if (arr[end] == end) return end;
		else return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(point(new int[]{1, 5, 7, 8}));
	}

}
