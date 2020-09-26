/**
 * Christian Aguirre
 * Project 1 - CMSC203
 */

/**
 * Imported the Scanner class to prompt the user
 */

import java.util.Scanner;

public class WifiDiagnosis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /**
         * Declared the variables for yes and no
         */
        String yes = "yes";
        String no = "no";



        //Prompted the user for the first step if they have connectivity
        System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
        System.out.println("First step: reboot your computer");
        System.out.println("Are you able to connect with the internet? (yes or no)");
        //Created a scanner variable for the user to enter the answer
        String answer = input.nextLine();
        /**
         * Data validation to check if the user has entered the correct answer
         * and also it ignores if the words are capitalized just in case the user
         * enters "YES" or "NO".
         */

        while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
            System.out.println("Please enter " + yes + " or " + no + " for your answer");
            System.out.println("Now are you able to connect with the internet? (yes or no)");
            answer = input.nextLine();
            /**
             * Created a data validation in case the user answers "yes"
             * so that the program doesn't crash and lets the user exit
             * the program
             */
        }  if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Rebooting your computer seemed to work");
            while(answer.equalsIgnoreCase("yes")){
                System.out.println("Please press 1 to exit the program");
                String exit = input.nextLine();
                if(exit.equals("1")){
                    System.exit(0);
                }

            }
            /**
             * Nested decision making for the second step with the same data validation for
             * the correct answer and exit prompt if the user answers "yes"
             */

        } else {
            System.out.println("Second step: reboot your router");
            System.out.println("Now are you able to connect with the internet? (yes or no)");
            answer = input.nextLine();
            while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                System.out.println("Please enter " + yes + " or " + no + " for your answer");
                System.out.println("Now are you able to connect with the internet? (yes or no)");
                answer = input.nextLine();

            }

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Rebooting your router seemed to work");
                while(answer.equalsIgnoreCase("yes")){
                    System.out.println("Please press 1 to exit the program");
                    String exit = input.nextLine();
                    if(exit.equals("1")){
                        System.exit(0);
                    }

                }
                /**
                 * Nested decision making for the third step with the same data validation for
                 * the correct answer and exit prompt if the user answers "yes"
                 */

            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Third step: make sure the cables to your router are plugged in " +
                        " firmly and your router is getting power.");
                System.out.println("Now are you able to connect with the internet? (yes or no)");
                answer = input.nextLine();
                while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                    System.out.println("Please enter " + yes + " or " + no + " for your answer");
                    System.out.println("Now are you able to connect with the internet? (yes or no)");
                    answer = input.nextLine();

                }

                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Checking the router's cables seemed to work");
                    while(answer.equalsIgnoreCase("yes")){
                        System.out.println("Please press 1 to exit the program");
                        String exit = input.nextLine();
                        if(exit.equals("1")){
                            System.exit(0);
                        }

                    }
                    /**
                     * Nested decision making for the fourth step with the same data validation for
                     * the correct answer and exit prompt if the user answers "yes"
                     */
                } else if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Fourth step: move your computer closer to your router");
                    System.out.println("Now are you able to connect with the internet? (yes or no)");
                    answer = input.nextLine();
                    while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                        System.out.println("Please enter " + yes + " or " + no + " for your answer");
                        System.out.println("Now are able to connect with the internet? (yes or no)");
                        answer = input.nextLine();

                    }
                    if (answer.equalsIgnoreCase("yes")) {
                        System.out.println("It seems like moving the computer closer to your router worked");
                        while(answer.equalsIgnoreCase("yes")){
                            System.out.println("Please press 1 to exit the program");
                            String exit = input.nextLine();
                            if(exit.equals("1")){
                                System.exit(0);
                            }

                        }
                        /**
                         * Nested decision making for the fifth step with the same data validation for
                         * the correct answer and exit prompt if the user answers "yes" as well as the
                         * last step which is to "call the ISP" if the user enters "no"
                         */
                    } else if (answer.equalsIgnoreCase("no")) {
                        System.out.println("Fifth Step: contact your ISP");
                        System.out.println("Make sure your ISP is hooked up to your router.");
                        while(answer.equalsIgnoreCase("no")){
                            System.out.println("Please press 1 to exit the program");
                            String exit = input.nextLine();
                            if(exit.equals("1")){
                                System.exit(0);
                            }

                        }

                    }
                }

            }
        }


    }
}

