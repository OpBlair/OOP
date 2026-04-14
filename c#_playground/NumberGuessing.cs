namespace NumberGuessing
{
    public class Game
    {
        public static void GuessNumber()
        {
            Console.WriteLine("\n=== Guess a Number ===");
            // The Grid
            int[,] grid = new int[5, 5];
            bool[,] revealed = new bool[5, 5]; // tracks revealed numbers

            for( int row = 0; row < 5; row++)
            {
                for(int col = 0; col < 5; col++)
                {
                    grid[row, col] = Random.Shared.Next(1, 11);
                }
            }    

            while (true)
            {
                Console.ForegroundColor = ConsoleColor.Cyan;
                Console.WriteLine("\n --- current grid ---");
                Console.ResetColor();
                for(int row = 0; row < 5; row++)
                {
                    for(int col = 0; col < 5; col++)
                    {
                        Console.ForegroundColor = revealed[row, col] ? ConsoleColor.Green : ConsoleColor.Gray;
                        Console.Write(revealed[row, col] ? $"{grid[row, col]} " : "* ");
                        Console.ResetColor();
                    }
                    Console.WriteLine();
                }

                Console.Write("Enter row number (0-4): ");
                if (!int.TryParse(Console.ReadLine(), out int num1) || num1 < 0 || num1 > 4) continue;

                Console.Write("Enter column number (0-4): ");
                if (!int.TryParse(Console.ReadLine(), out int num2) || num2 < 0 || num2 > 4) continue;

                Console.Write("Enter your guess:");
                int.TryParse(Console.ReadLine(), out int GuessedNum);

                int actualValue = grid[num1, num2];

                if(GuessedNum == actualValue)
                {
                    Console.WriteLine("Correct Guess");
                    revealed[num1, num2] = true;
                }
                else
                {
                    Console.WriteLine("That wasn't correct. Try Again.");
                }
            }        
        }
    }
}



