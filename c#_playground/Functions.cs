namespace CSharpPractice.Functions
{
    public class Functions
    {
        public static void Greeting()
        {
            Console.WriteLine("Hello Learner, How's C#(pronounced as C sharp) going?");
        }
        //Function to add two numbers
        public static void Addition()
        {
            Console.WriteLine("\n=== Performing Addition ===");
            Console.Write("Enter first number: ");
            int.TryParse(Console.ReadLine(), out int num1);

            Console.Write("Enter second number: ");
            int.TryParse(Console.ReadLine(), out int num2);

            Console.WriteLine($"The sum of {num1, 2} and {num2, 2} is {num1 + num2, 3}");
        }
    }
}
