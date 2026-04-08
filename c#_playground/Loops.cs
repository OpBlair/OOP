namespace CSharpPractice.Loops
{
    public class Loops
    {
        public static void ShowLoops()
        {
            Console.WriteLine("For Loops");
            for(int a = 0; a < 4; a++)
            {
                Console.WriteLine("a " + a);
            }
        }

        // Multiplication Table4

        public static void Multiplication()
        {
            int number = 10;
            Console.WriteLine($"Multiplication Table for {number}");
            for(int b = 1; b < 5; b++)
            {
                for(int d = 1; d < 5; d++)
                {
                    Console.Write($"{b, 2} * {d, 2} = {b * d, 3} | ");
                }
                Console.WriteLine("");
            }
        }
    }
}
