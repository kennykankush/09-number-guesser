import java.util.Scanner;

public class App{

    String line = "";
    Scanner scanner;
    numberGenerator ANSWER;

    public void gameStartHuman(int min, int max){

        humanWelcomeMessage();
        ANSWER = new numberGenerator();
        scanner = new Scanner(System.in);

        ANSWER.randomGenerator(min,max);
        // System.out.println(ANSWER.getNumber() + " is type: " + ((Object)ANSWER.getNumber()).getClass().getSimpleName());
        
        String stringAnswer = String.valueOf(ANSWER.getNumber());
        // System.out.println(stringAnswer + " is type: " + ((Object)stringAnswer).getClass().getSimpleName());
        
        while (!line.equals("quit")){
            System.out.println("Type a number from " + min + " and " + max);
            line = scanner.nextLine();

            if (line.equals(stringAnswer)){
                System.out.println("Congrats");
                break;
            } else  {
                int newline = Integer.parseInt(line);

                if (newline < ANSWER.getNumber()){
                    System.out.println("Higher");

                } else {
                    System.out.println("Lower");
                }

            
            // System.out.println("End of while");
        
        }
    }
   }

    public void gameStartCPU(int min, int max){
        boolean RUNNER = true;
        ANSWER = new numberGenerator();
        ANSWER.randomGenerator(min,max);
        int rand = ANSWER.getNumber();
        int counter = 0;

        cpuWelcomeMessage();

        while (RUNNER){

            ANSWER.cpuNumberGenerator(min, max);

            if (ANSWER.cpuAnswer != rand){
                System.out.println(ANSWER.cpuAnswer);
                try {Thread.sleep(500); }
                catch (InterruptedException e) {}

                counter++;

            } else {
                System.out.println(ANSWER.cpuAnswer + "---- Ding Ding Ding!");
                System.out.println("Total attempts: " + counter + " tries");
                RUNNER = false;
            }

            // System.out.println("End of loop");


        }
    }

    public void cpuWelcomeMessage() {

        int gap = 1000;
        String welcome = "CPU vs The World";
        String loading = "█████████████████ 100%";

        char[] welcome_char = welcome.toCharArray();
        char[] loading_char = loading.toCharArray();

        int welcome_length = welcome_char.length;
        int loading_length = loading_char.length;
        
        for (int i = 0; i < welcome_length; i++){
            System.out.print(welcome_char[i]);
            long loadingTime = (long) (gap / (i + 1) );


            try { Thread.sleep(loadingTime); }
            catch (InterruptedException e) {}

        }

        System.out.print("\n");
        
        for (int i = 0; i < loading_length; i++){
            System.out.print(loading_char[i]);

            long loadingTime = (long) (gap / (i + 1) );


            try { Thread.sleep(loadingTime); }
            catch (InterruptedException e) {}

        }

        System.out.print("\n");

    }

    public void humanWelcomeMessage() {

        System.out.print("\n");

        int gap = 1000;
        String welcome = "You vs The World";
        String loading = "█████████████████ 100%";

        char[] welcome_char = welcome.toCharArray();
        char[] loading_char = loading.toCharArray();

        int welcome_length = welcome_char.length;
        int loading_length = loading_char.length;
        
        for (int i = 0; i < welcome_length; i++){
            System.out.print(welcome_char[i]);
            long loadingTime = (long) (gap / (i + 1) );


            try { Thread.sleep(loadingTime); }
            catch (InterruptedException e) {}

        }

        System.out.print("\n");
        
        for (int i = 0; i < loading_length; i++){
            System.out.print(loading_char[i]);

            long loadingTime = (long) (gap / (i + 1) );


            try { Thread.sleep(loadingTime); }
            catch (InterruptedException e) {}

        }

        System.out.print("\n");

    }

}

        
    
    
//     public boolean hasInteger(String input){

//         char[] chars = input.toCharArray();

//         for (int i = 0; i > chars.length; i++){
//             if (chars[0].isDigit()){
//                 return true
//             }
//         }
//     }
// }







//     public void cpuWelcomeMessage() {
//     int gap = 200; // Reduced gap for faster progress
//     int totalSteps = 15;
//     System.out.print("CPU vs The World\n");

//     try { Thread.sleep(gap); }
//     catch (InterruptedException e) {}

//     System.out.print("[");

//     for (int i = 0; i < totalSteps; i++) {
//         System.out.print("[]");
        
//         int percentage = (int) ((i + 1) / (double) totalSteps * 100);
//         System.out.print(" " + percentage + "%");

//         try { Thread.sleep(gap); }
//         catch (InterruptedException e) {}

//         // Clear percentage part to keep bar clean
//         System.out.print("\b\b\b\b");
//     }

//     System.out.print("]\n");

//     try { Thread.sleep(gap); }
//     catch (InterruptedException e) {}
// }