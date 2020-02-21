import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String in = "",output ="";
		int rows, columns;
		String inputArray[]=input.split("\\s");
		for (int i = 0; i <= inputArray.length - 1; i++) {
			in = in + inputArray[i];
		}

		int length = in.length();
		rows = (int) Math.floor(Math.sqrt(input.length()));
		columns = (int) Math.ceil(Math.sqrt(input.length()));
        
        if (columns*rows < input.length()){
			rows++;
        }
        
       
        
        char matrix[][] = new char[rows][columns];
        
        //Store message in array
        for(int row_i=0; row_i<rows; row_i++){
            for(int collumn_i=0; collumn_i<columns; collumn_i++){
                if(((row_i*columns)+collumn_i) < (input.length())){
                    matrix[row_i][collumn_i] = input.charAt((row_i*columns)+collumn_i);
                }
            }
        }
        for(int collumn_i=0; collumn_i<columns; collumn_i++){
            for(int row_i=0; row_i<rows; row_i++){
                if(((row_i*columns)+collumn_i) < (input.length())){
                    output += matrix[row_i][collumn_i];
                }
            }
            if(collumn_i < (columns-1)){
                output+=" ";
            }
        }
        System.out.println(output);
    }

}

