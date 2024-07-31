import java.util.*;

public class Program {

    public static void Print(String string) {
        System.out.println(string);
    }

    public static void Print(Integer string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        Map<Integer, String[]> dbMap = new HashMap<>();
        String[] prompts = {
                "Who was the most interesting person I interacted with today?",
                "What was the best part of my day?",
                "How did I see the hand of the Lord in my life today?",
                "What was the strongest emotion I felt today?",
                "If I had one thing I could do over today, what would it be?",
                "Did you minister to any one today? Who is in the most need to be ministered to?",
                "How often did I feel the Savior's love during the day?",
                "What was one thing I did to prepare myself to partake of the sacrament?",
                "Are you happy? Why?" };

        while (true) {
            Scanner scanner = new Scanner(System.in);

            Print("Welcome to the Journal Program");
            String menu = "Please select one of the following options:\n1. Write\n2. Display\n3. Load\n4. Save\n5. Quit";
            Print(menu);

            // employ input implementation for the answer variable
            Integer answer = scanner.nextInt();

            // Write to journal
            if (answer == 1) {
                
            }

            // Display
            else if (answer == 2) {
                for (Map.Entry<Integer, String[]> entry : dbMap.entrySet()) {
                    Journal journal = new Journal(entry.getValue()[0], entry.getValue()[1],entry.getValue()[2]);
                    Print(journal.GetJournalDisplay());
                }
            }

            // Load

            // Save

            // Quict
            else if (answer == 5) {
                break;
            }

            scanner.close();
        }

    }
}
