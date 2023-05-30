public class Loops {
    public static void main(String[] args) {
        Loops loops = new Loops();

        loops.pyramid();
        loops.numSummary(1, 4);
        loops.numbers();
    }
    public void numbers(){
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("The number " + i +" is divisible by two and three.");
            }
            else if (i % 3 == 0) {
                System.out.println("The number " + i +" is divisible by three.");
            }
            else if (i % 2 == 0) {
                System.out.println("The number " + i +" is even.");
            }
            else {
                System.out.println("The number " + i +" is odd.");
            }
        }
    }
    public void numSummary(int num1, int num2) {
        int result = 0;
        for (int i = num1; i <= num2; i++) {
            result += i;
        }
        System.out.println(result);
    }
    public void pyramid(){
        for (int i = 1; i < 7; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
