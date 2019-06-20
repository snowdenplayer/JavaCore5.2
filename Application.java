import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int num;
        String exit= "y";
        int symb;

            Scanner in = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        while(exit.equals("y")){

                System.out.println("Вгадай що випаде(решка = 0 а орел = 1)");
                symb = in.nextInt();

                num = (int) (Math.random() * 2);

                if (num == 0 ) {
                    System.out.println("Випала решка");
                } else if (num == 1){
                    System.out.println("Випав орел");
                }
                if ( symb == num) {
                    System.out.println("Ти виграв");
                } else if(symb<0 || symb>1){
                    System.out.println("Некоректне число");
                }else{
                    System.out.println("Yoy are loser");

                }


                System.out.println("Для вихода нажмыть любу клавышу крым Y");

                exit = s.nextLine();

                }

            }

        }


