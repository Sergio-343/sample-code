package inClassExercise02;

import java.util.Date;

public class MyWork {

	public static void main(String[] args) {
		long loopAStartTime;
		long loopBStartTime;
		long loopAEndTime;
		long loopBEndTime;
		Date currentTime;
		boolean foundN = false;
		
		int nVal = 10000;
		while((nVal > 0) && !foundN) {
			currentTime = new Date();
			loopAStartTime = currentTime.getTime();
			loopA(nVal);
			loopAEndTime = currentTime.getTime();
			long totalATime = loopAEndTime - loopAStartTime;
			System.out.println("Test A time: " + totalATime);
		
			currentTime = new Date();
			loopBStartTime = currentTime.getTime();
			loopB(nVal);
			loopBEndTime = currentTime.getTime();
			long totalBTime = loopBEndTime - loopBStartTime;
			System.out.println("Test B time: " + totalBTime);
			
			if(totalBTime < totalATime) {
				System.out.println("Found it: " + nVal);
				foundN = true;
			}
			else {
				nVal --;
			}
		}
		
	}
	public static void loopA(int n) {
		// loop A
	    int sum = 0;
		for (int i = 1; i <= n; i++) 
			for (int j = 1; j <= 10000; j++) 
				sum = sum + j;
			
		}
		
	public static void loopB(int n) {	
		// loop B
		int sum = 0;
		for (int i = 1; i <= n; i++) 
			for (int j = 1; j <= n; j++) 
				sum = sum + j;
			}
		
		
				
				
			
		
		
		
	
	

}
