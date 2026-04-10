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
        // Multiplication Function
        public static void Multiplication()
        {
            Console.WriteLine("\n=== Performing Multiplication ===");
            Console.Write("Enter first number: ");
            double.TryParse(Console.ReadLine(), out double num1);

            Console.Write("Enter second number: ");
            double.TryParse(Console.ReadLine(), out double num2);

            Console.WriteLine($"The product of {num1} and {num2} is {num1 * num2:F3}");
        }
        // Subtraction Function
        public static void Subtraction()
        {
            Console.WriteLine("\n=== Performing Subtraction ===");
            Console.Write("Enter first number: ");
            int.TryParse(Console.ReadLine(), out int num1);

            Console.Write("Enter second number: ");
            int.TryParse(Console.ReadLine(), out int num2);

            Console.WriteLine($"The difference between {num1} and {num2} is {num1 - num2, 2}");
        }
        // Division Function
        public static void Division()
        {
            Console.WriteLine("\n=== Performing Subtraction ===");
            Console.Write("Enter first number: ");
            double.TryParse(Console.ReadLine(), out double num1);

            Console.Write("Enter second number: ");
            double.TryParse(Console.ReadLine(), out double num2);

            Console.WriteLine($"The difference between {num1} and {num2} is {num1 / num2: 2F}");
        }
    }
}
