import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Question2b{
    public static void main(String[] args){
        Set<String> uniqueWords = new HashSet<>();

        try{
            File file = new File("MobyDick.txt");
            Scanner fileReader = new Scanner(file);

            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine().toLowerCase().replaceAll("[^a-z]", "");
                String[] words = line.split("\\s+");

                for(String word : words){
                    if(!word.isEmpty()){
                        uniqueWords.add(word);

                    }
                }
            }
            fileReader.close();
            
        } catch(FileNotFoundException e){
            System.out.println("File not found. Please make sure MobyDick.txt exists");
            return;
        }
        
        System.out.println("File processed Successfully");
        System.out.println("Total unique words: " + uniqueWords.size());

        //word search
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter word to search (or type 'exit' to quit): ");
            String query = scanner.nextLine().toLowerCase().trim();

            if(query.equals("exit")){
                System.out.println("Goodbye!");
                break;
            }

            if(uniqueWords.contains(query)){
                System.out.printf("%s is in the file.", query);
            }else{
                System.out.printf("%s is not in the file.", query);
            }
        }
        scanner.close();
    }
}
