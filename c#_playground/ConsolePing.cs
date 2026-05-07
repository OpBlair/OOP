using System;
using System.Net.NetworkInformation;

namespace ConsolePing
{
    public static class PingTool
    {
        public static void ConsolePingApp()
        {
            Console.Clear();
            Console.WriteLine("=== Console Ping App ===");
            Console.Write("Enter IP or Hostname to ping: ");
            string target = Console.ReadLine();

            Ping pingSender = new Ping();

            try
            {
                PingReply reply = pingSender.Send(target, 1000); // 1 second timeout

                if (reply.Status == IPStatus.Success)
                {
                    Console.ForegroundColor = ConsoleColor.Green;
                    Console.WriteLine($"Ping to {target} succeeded! Roundtrip: {reply.RoundtripTime} ms");
                }
                else
                {
                    Console.ForegroundColor = ConsoleColor.Red;
                    Console.WriteLine($"Ping to {target} failed: {reply.Status}");
                }
            }
            catch (Exception ex)
            {
                Console.ForegroundColor = ConsoleColor.Red;
                Console.WriteLine($"Error: {ex.Message}");
            }

            Console.ResetColor();
            Console.WriteLine("\nPress any key to return to the menu...");
            Console.ReadKey();
            Console.Clear();
        }
    }
}
