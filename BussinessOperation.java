package lockedmeLtd;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BussinessOperation {
	private static final int ADD =1;
	private static final int DELETE =2;
	private static final int SEARCH =3;
	private static final int BACK =4;
	
	public static void performBussinessOperation(int opr,Scanner sc) {
		switch(opr) {
		case ADD:
			createNewFile(sc);
			break;
		case DELETE:
			deleteExistingFile(sc);
			break;
		case SEARCH:
			searchFile(sc);
			break;
		case BACK:
			MainOperations.performOperation(sc);
			break;
		default:
			System.out.println("provide correct option");
			break;
		
		}
		
			
	}

	private static void searchFile(Scanner sc) {
		// TODO Auto-generated method stub
		String filename = UserInputs.getFileNameFromUser(sc);
		List<String> results = getFilesInRepo();
		String result = "File not found in repository";
		for(String item : results) {
			if(item.equalsIgnoreCase(filename)) {
				result ="file found in directory";
				break;
			}
		}
		System.out.println(result);
		
	}
	public static List<String>getFilesInRepo(){
		List<String>results = new ArrayList<String>();
		String dir = "C://Users//Desktop//Abbasproject//";
		File[] files= new File(dir).listFiles();
		for(File file: files) {
			if(file.isFile()) {
				results.add(file.getName());
			}
		}
		return results;
	}

	private static void deleteExistingFile(Scanner sc) {
		// TODO Auto-generated method stub
		String filename= UserInputs.getFileNameFromUser(sc);
		Path file= Paths.get("C://MinGW//abbasproject//"+filename+".txt");
		try {
			if(Files.deleteIfExists(file)) {
				System.out.println("file deleted successfully");
			}
			else {
				System.out.println("unable to delete file");
			}
		}
		catch(IOException e) {
			System.out.println("Exception occurred unable to delete a file");
			e.printStackTrace();
		}
		
	}

	private static void createNewFile(Scanner sc) {
		// TODO Auto-generated method stub
		String filename = UserInputs.getFileNameFromUser(sc);
		File file = new File("C://MinGW//abbasproject//"+filename+".txt");
		try {
			if(file.createNewFile()) {
				System.out.println("file created successfully");
			}
			else {
				System.out.println("Existing file\n");
			}
		}
		catch(IOException e) {
			System.out.println("failed to create new file");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	}
		
	}

