public class Runner{

    public static void main(String[] args){

        App app = new App();
        int input1 = Integer.parseInt(args[0]);
        int input2 = Integer.parseInt(args[1]);

        // int input1 = 10;
        // int input2 = 20;

        app.gameStartCPU(input1,input2);
        app.gameStartHuman(input1,input2);
        
    }




}