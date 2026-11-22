package agh.po.lab1;
//import java.util.Scanner;

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
        int wysokosc;

        if (args.length>0) {
            wysokosc = Integer.parseInt(args[0]);
            System.out.println("Wysokosc : " + wysokosc);
        }
        else{
            wysokosc=5;
            System.out.println("Wysokosc (stala) : "+wysokosc);
        }

        for(int i=0; i<wysokosc; i++){
            for(int j = 0; j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}