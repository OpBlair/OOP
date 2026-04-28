namespace CSharpPractice.Collections
{
    public class CollectionsLab
    {
        public static void Arrays()
        {
            int[] numbers = {10, 20, 30, 40, 50};
            string[] fruits = {"oranges", "mangoes", "apple"};

            Console.Write("Numbers: ");
            foreach(int num in numbers)
            {
                Console.Write(num + " ");
            }

            Console.WriteLine("Fruits: " + string.Join(", ", fruits));
        }
    }
}
