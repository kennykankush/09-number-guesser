import java.util.Random;

public class numberGenerator{
    
    Random rand;
    private int number;
    public int cpuAnswer;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void randomGenerator(int min, int max){
        rand = new Random();
        setNumber(rand.nextInt(min,max));

        // int random = (int)(Math.random() * 50 + 1);
        // setNumber(random);

    }

    public int cpuNumberGenerator(int min, int max){

        rand = new Random();
        int cpuAnswer = rand.nextInt(min,max);
        this.cpuAnswer = cpuAnswer;

        return cpuAnswer;

    }

    
}