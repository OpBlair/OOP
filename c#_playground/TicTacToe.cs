using System;

namespace TicTacToeGame
{
    public class Game
    {
        public static void Start()
        {
            char[,] board = new char[3, 3];

            // fill board with numbers 1–9
            char value = '1';

            for (int row = 0; row < 3; row++)
            {
                for (int col = 0; col < 3; col++)
                {
                    board[row, col] = value;
                    value++;
                }
            }

            PrintBoard(board);
        }

        static void PrintBoard(char[,] board)
        {
            for (int row = 0; row < 3; row++)
            {
                for (int col = 0; col < 3; col++)
                {
                    Console.Write($" {board[row, col]} ");

                    if (col < 2)
                        Console.Write("|");
                }
                Console.WriteLine();

                if (row < 2)
                    Console.WriteLine("---+---+---");
            }
        }
    }
}
