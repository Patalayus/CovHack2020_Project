import java.util.Scanner;

public class hiddenfile{
    static void hiddenMethod2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nbut the wall smashes...\n"+
        "and then it flickers until it appears to turn off?\n"+
        "like some kind of TV screen? But where are you now?\n"+
        "1. Look Around\n2. Yell for Help\n3. Try to find a way out...\n");
        int questionResp = sc.nextInt();
        if(questionResp==1){
            System.out.println("You look around but there is nothing useful,\n" +
                    "it seems like you were in a simulation or maybe some kind of\n" +
                    "arena? How strange...");
            portal_start();
        }else if(questionResp==2){
            System.out.println("You yell for help, but nobody hears you\n" +
                    "there is nobody around you either, were they even real?...");
            portal_start();
        }else if(questionResp==3){
            System.out.println("It appears, there is some kind of hologram, which was\n" +
                    "the race you were in. It is glitching in and out. But in reality,\n" +
                    "you weren't racing at all and you've been in a simulation\n" +
                    "the whole time...");
            portal_start();
        }else{
            System.out.println("That is not a valid response, please enter one...\n");
            hiddenMethod2();
        }
    }
    static void portal_start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You overhear a robotic voice coming from outside\n" +
                "of the simulation...\n" +
                "'Ah it appears the program was created with a bug...'\n" +
                "It says...\n");
        System.out.println("What do you say in reply?..\n1. 'Hello? Who's there?'\n" +
                "2. 'Who are you?'\n3. 'What's going on?'\n");
        int resp_ = sc.nextInt();
        if(resp_ == 1){

        }else if(resp_ == 2){

        }else if(resp_ == 3){

        }else{

        }
    }

}