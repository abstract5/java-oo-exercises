package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Javagram {

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath = null;
		String ans;
		int filterType;
		Filter filter = null;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				imagePath = dir + "\\" + relPath;
				
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
		// TODO - prompt user for filter and validate input
		
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
		do{
			try{
				System.out.println("Please select a filter: 1)BlueFilter 2)GrayScaleFilter 3)InvertFilter");
				filterType = in.nextInt();
					
				filter = getFilter(filterType);
			}catch(IllegalArgumentException e){
				System.out.println("That is not a valid selection");
			}
		}while(filter == null);
		

		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();
		
		
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		if(fileName.equals(relPath)){
			System.out.println("Do you want to overwrite the original file: yes or no?");
			ans = in.next();
			
			if(ans.equals("no")){
				System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
				fileName = in.next();
			}
		}
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		}else {
			String absFileName = dir + "\\" + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}	
		
		// close input scanner
		in.close();
	}
	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to throw an exception if the int doesn't correspond to a filter
	private static Filter getFilter(int selection) {
		
		// TODO - create some more filters, and add logic to return the appropriate one
		if(selection < 1 || selection > 3){
			throw new IllegalArgumentException();
		}
		if(selection == 1){
			return new BlueFilter();
		}else if(selection == 2){
			return new GrayScaleFilter();
		}else{
			return new InvertFilter();
		}
	}

}