/*   
    Author: Chan In Kou
    Purpose: Review of Java: Calling method from same class, for loop 
*/
package lesson6;


public class Lesson6 {
	public static void main(String[] args) {
		final int NUMBER = 10;
		printMethod();
		for(int i = 1; i < NUMBER; i++){
			System.out.print(loop(i) + ", ");
		}

	}
	
	public static void printMethod(){
		System.out.println("This is the result");
	}
	
	public static int loop(int m){
		int answer = 0;
		for(int i = 1; i <= m; i++){
			answer += i;
		}
		return answer;
	}
}
