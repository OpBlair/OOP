import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

public class Question2a{
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        try{
            File file = new File("numbers.txt");
            Scanner reader = new Scanner(file);

            //traverse the file data
            while(reader.hasNextLine()){
                String data = reader.nextLine().trim();
                if(!data.isEmpty()){
                    try{
                        int number = Integer.parseInt(data);
                        numbers.add(number);
                    }catch(NumberFormatException e){
                        System.out.println("Skipping invalid number: " + data);
                    }
                }
            }

            reader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("The file wasn't found. Please make sure you have the file created.");
            //e.printStackTrace();
        }

        System.out.printf("%nAll numbers: %s", numbers.toString());

        if(numbers.isEmpty()){
            System.out.println("No valid numbers found");
            return;
        }
        
        int sum = 0;
        int min = numbers.get(0);
        int max = numbers.get(0);
        
        for(int num: numbers){
            sum += num;
            if(num < min) min = num;
            if(num > max) max = num;
        }
        
        double average = (double) sum / numbers.size();
        System.out.printf("%nAverage: %.2f %nHighest number: %d %nLowest number: %d%n", average, max, min);

        List<Integer> oddNumbers = new ArrayList<>();
        for(int num : numbers){
            if(num % 2 != 0){
                oddNumbers.add(num);
            }
        }
        
        System.out.printf("Odd numbers: %s",oddNumbers.toString());    
    }
}