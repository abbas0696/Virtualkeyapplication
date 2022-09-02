package lockedmeLtd;

public class Welcome {
	public static void showWelcomeDetails(){
		System.out.println("----------------------");
		System.out.println("  ");
		System.out.println("Welcome to lockedme.com");
		System.out.println("Application name is : Virtual key project");
		System.out.println("----------------------");
		System.out.println("- Name: Abbas lakdawala");
		System.out.println("Developer");
		System.out.println("- Date : 02-09-2022");
		System.out.println("-----------------------");
	}
	public static void displayMainOption() {
		System.out.println("\n"+"Select below options");
		
		String[] arr = {"1.Get file names in acsending order","2.Wish to perform business level operation",
				"3.close the application"};
		int[] arr1= {1,2,3};
		int len = arr1.length;
		for(int i=0; i<=len; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void DisplayBusinessOperation() {
		System.out.println("\n"+"select below options");
		System.out.println("   ");
		
		String[] arr = {"1.Add a file into existing directory list","2.Search a file from the main directory",
				"3.Delete a file from existing directory","4.Back to main context"};
		int [] arr1 = {1,2,3,4};
		int len = arr.length;
		for(int i=0; i<=len; i++) {
			System.out.println(arr[i]);
		}
		
	}
	

	public static void main(String[] args){
		// TODO Auto-generated method stub
		

	}

}
