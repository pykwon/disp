package pack1;

public class DeviationEx {
	public static void main(String[] args) {
		int arr[] = {1, 3, -2, 4};  //�迭��Ҹ� ��� �߰� �Ǵ� ���� �� �� �ִ�.
		
		double sum = 0;
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");	 //1 3 -2 4 
			sum += arr[i];
		}
		
		System.out.println("\n���� " + sum);  //���� 6.0
		double avg = sum / arr.length;
		System.out.println("����� " + avg);  //����� 1.5
		
		double tot = 0.0;
		for(int su=0; su < arr.length; su++) {
			tot += Math.pow(arr[su] - avg, 2);
		}
		
		double veri = tot / arr.length;
		System.out.println("�л��� " + veri);  //�л��� 5.25

		double sd = Math.sqrt(veri);
		System.out.println("ǥ�������� " + sd);  //ǥ�������� 2.29128784747792
	}
}
