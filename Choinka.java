import java.util.Scanner;

/*public class Choinka {
    public static void main(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Wysokosc");

        int wysokosc = myObj.nextInt();

        for(int i=0; i<wysokosc; i++){
            for(int j = 0; j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}*/

public class Choinka {
    public static void main(String[] args){

        System.out.println("Wysokosc : "+ args[0]);

        int wysokosc = Integer.parseInt(args[0]);

        for(int i=0; i<wysokosc; i++){
            for(int j = 0; j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}