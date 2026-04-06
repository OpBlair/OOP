using System;
using CSharpPractice.Loops;

public class Program{

    // Integers
    static void DataTypes(){
        int a = 10;
        float b = 2.5f;
        double c = 20.0;
        char d = 'A';
        string language = 'c#';
        bool isLearning = true;

        Console.WriteLine("Data Types.");
        Console.WriteLine("Integer: " + a);
        Console.WriteLine("Float: " + b);
        Console.WriteLine("Double: " + c);
        Console.WriteLine("char: " + d);
        Console.WriteLine("string: " + language);
        Console.WriteLine("isLearning data types in C#: " + isLearning);
    }

    public static void Main(string[] args){
        string name = "cyb3r_beta";
        Console.WriteLine("Hello " + name);
        Console.WriteLine("Which section of C# programming do you to want practice ?");
        Console.WriteLine("1. Data Types.");
        Console.WriteLine("2. Loops.");

        Console.Write("Enter your choice: ");

        if(int.TryParse(Console.ReadLine(), out int userChoice))
        {
            switch(userChoice){
                case 1: DataTypes(); break;
                case 2: Loops.ShowLoops(); break;
                default: Console.WriteLine("No input specified!"); break;
            }
        }
        else
        {
            Console.WriteLine("Please enter a number.");
        }
    }
}
