import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		//int n = Integer.MAX_VALUE;
		//int[] arr = new int[n];

	// 	Scanner scan = new Scanner(System.in);
	// 	int num = scan.nextInt();
	// 	int[] arr = new int[num];
	// 	arr[0] = 1;
	// 	arr[1] = 1;
	// 	for (int i = 2; i< num ; ++i ){
			
	// 		arr[i] = arr[i-1]+ arr[i-2];
	// 	}

	// 	System.out.println( arr[num-1]);
		
	// }

    import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		//int n = Integer.MAX_VALUE;
		//int[] arr = new int[n];

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if (num == 0 || num ==1 ) System.out.println(1); // this handles array out of bound exception, make sure that you handle corner scenarios
		
		else {
			int[] arr = new int[num];
			arr[0]=1;
			arr[1]=1;
			for (int i = 2; i< num ; ++i ){
			
				arr[i] = arr[i-1]+ arr[i-2];
			}
			System.out.println( arr[num-1]);
		}
		

		
		
	}

}


}
