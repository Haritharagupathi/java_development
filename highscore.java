public class highscore {
    public static void main(String[] args){
        int[] scores={randomNumber(),randomNumber()};
        int highscore=0;
        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i]);
            if(scores[i]>highscore){
                highscore=scores[i];
            }
        }
        System.out.println(+highscore);
    }
    public static int randomNumber() {
        double randomDouble = Math.random() * 5000;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
}
    