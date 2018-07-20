package pack1;

public class DeviationEx {
	public static void main(String[] args) {
		int arr[] = {1, 3, -2, 4};  //배열요소를 계속 추가 또는 삭제 할 수 있다.
		
		double sum = 0;
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");	 //1 3 -2 4 
			sum += arr[i];
		}
		
		System.out.println("\n합은 " + sum);  //합은 6.0
		double avg = sum / arr.length;
		System.out.println("평균은 " + avg);  //평균은 1.5
		
		double tot = 0.0;
		for(int su=0; su < arr.length; su++) {
			tot += Math.pow(arr[su] - avg, 2);
		}
		
		double veri = tot / arr.length;
		System.out.println("분산은 " + veri);  //분산은 5.25

		double sd = Math.sqrt(veri);
		System.out.println("표준편차는 " + sd);  //표준편차는 2.29128784747792
	}
}
