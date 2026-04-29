using System.Collections.Generic;
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
        // Lists
        public static void ListsLab()
        {
            List<string> cities = new List<string>();
            cities.Add("Kampala");
            cities.Add("Paris");
            cities.Add("Nairobi");

            Console.Write("City \n");
            foreach( string city in cities)
            {
                Console.Write(city + "\n");
            }
        }

        // Dictionary
        public static void DictionaryLab()
        {
            Dictionary<string, int> studentAge = new Dictionary<string, int>()
            {
                {"Alice", 20},
                {"Bob", 21},
                {"Trevor", 18}
            };
            studentAge["Charlie"] = 22;

            if (studentAge.ContainsKey("Alice"))
            {
                Console.WriteLine($"Alice is {studentAge["Alice"]} years old");
            }

            if(studentAge.TryGetValue("Bob", out int age))
            {
                Console.WriteLine($"Bob is {age}");
            }

            // Looping through dictionary
            Console.WriteLine("Student info summary: ");
            Console.WriteLine($"{"Name", 8} | Age");
            foreach (var student in studentAge)
            {
                Console.WriteLine($"{student.Key, 8} | {student.Value}");
            }
        }
    }
}
