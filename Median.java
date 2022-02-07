import java.util.ArrayList;
import java.util.List;

public class Median {
	public static void main(String[]args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(0,5);
		arr.add(1,3);
		arr.add(2,1);
		arr.add(3,2);
		arr.add(4,4);
		findMedian(arr);
	}
	public static int findMedian(List<Integer> arr) {
		int temp=0;
		for(int i = 0;i<arr.size();i++) {
			for(int j = i;j>0;j--) {
				if(arr.get(j)<arr.get(j-1)) {
					temp = arr.get(j);
					arr.set(j, arr.get(j-1));
					arr.set(j-1, temp);
				}
			}
		}
		return arr.get(arr.size()/2);
		
	}
}
