import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();
        int countTree = 100000;
        int balance = 0;

        for (int i = 0; i < countTree; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            int x = 0;
            while(map.heightTree() < 6){
                x = rnd.nextInt(201)-100;
                map.put(x, x);
            }
            map.delete(x);
            if (map.isBalance()){
                balance++;
            }
        }

        System.out.println("balance " + balance + " of " + countTree);
        System.out.println("balanced " + (double) balance / countTree * 100 + " %");
        System.out.println("not balanced " + (double) (countTree - balance) / countTree * 100 + " %");
    }
}
