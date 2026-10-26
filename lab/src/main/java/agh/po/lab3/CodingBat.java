package agh.po.lab3;

public class CodingBat {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile){
            return true;
        }
        else if(!aSmile && !bSmile){
            return true;
        }
        return false;
    }

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();

        System.out.println("---sleepIn---");
        System.out.println("sleepIn(false, false) -> " + cb.sleepIn(false, false));
        System.out.println("sleepIn(true, false)  -> " + cb.sleepIn(true, false));

        System.out.println("\n---monkeyTrouble---");
        System.out.println("monkeyTrouble(true, true)   -> " + cb.monkeyTrouble(true, true));
        System.out.println("monkeyTrouble(false, false) -> " + cb.monkeyTrouble(false, false));
        System.out.println("monkeyTrouble(true, false)  -> " + cb.monkeyTrouble(true, false));

        System.out.println("\n---countEvens---");
        System.out.println("countEvens([2, 1, 2, 3, 4]) -> " + cb.countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println("countEvens([2, 2, 0])       -> " + cb.countEvens(new int[]{2, 2, 0}));
        System.out.println("countEvens([1, 3, 5])       -> " + cb.countEvens(new int[]{1, 3, 5}));

        System.out.println("\n---helloName---");
        System.out.println("helloName(\"Alan\")   -> " + cb.helloName("Alan"));
        System.out.println("helloName(\"Mateusz\") -> " + cb.helloName("Mateusz"));
        System.out.println("helloName(\"Wojtek\") -> " + cb.helloName("Wojtek"));
    }
}