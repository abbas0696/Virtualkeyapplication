package lockedmeLtd;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainOperations {
	private static final int GET_NAMES=1;
	private static final int BUSSINESS_OPERATIONS=2;
	private static final int CLOSE_APP=3;
	
	public static void performOperation(Scanner sc) {
		int opr = UserInputs.getMainOperationselection(sc);
		
		switch(opr) {
		case GET_NAMES:{
			getFilesInAcendingOrder();
			break;
		}
		case BUSSINESS_OPERATIONS:{
			Welcome.DisplayBusinessOperation();
			int selection = UserInputs.getBusinessOperation(sc);
			BussinessOperation.performBussinessOperation(selection,sc);
			break;
		}
		case CLOSE_APP:{
			System.out.println("closing your application...\n"+"thank you");
			System.exit(0);
			break;
		}
		default:
			System.out.println("provide correct option");
			break;
		
		}
	}

	private static void getFilesInAcendingOrder() {
		// TODO Auto-generated method stub
		List<String>existingFiles = BussinessOperation.getFilesInRepo();
		Collections.sort(existingFiles);
		System.out.println("files in ascending order"+existingFiles);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
