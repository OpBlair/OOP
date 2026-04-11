namespace NumberGuessing
{
    public class Game
    {
        public static void GuessNumber()
        {
            int[,] grid = new int[5, 5];

            for( int row = 0; row < 5; row++)
            {
                for(int col = 0; col < 5; col++)
                {
                    grid[row, col] = Random.Shared.Next(10);
                }
            }
        }
    }
}
