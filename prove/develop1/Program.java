public class Program {

    public static void Print(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        String[] prompts = {
            "Who was the most interesting person I interacted with today?",
            "What was the best part of my day?",
            "How did I see the hand of the Lord in my life today?",
            "What was the strongest emotion I felt today?",
            "If I had one thing I could do over today, what would it be?",
            "Did you minister to any one today? Who is in the most need to be ministered to?",
            "How often did I feel the Savior's love during the day?",
            "What was one thing I did to prepare myself to partake of the sacrament?",
            "Are you happy? Why?"};

        while (true) {
            System.console();
            String menu = "1. Write\n2. Display\n3. Load\n4. Save\n5. Quit";
            Print(menu);
            try {
                // employ input implementation for the answer variable
                String answer = System.console().readLine();
                Print(answer);
                if (answer == "1") {
                    Print("answer is 1");
                    break;
                } else if (answer == "2") {
                    Journal journal = new Journal("??", "Edward");
                    Print(journal.GetJournalDisplay());
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block

                e.printStackTrace();
            }

        }

    }
}
