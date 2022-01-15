package ro.fasttrackit.temacurs13.ex1.ex2;

import ro.fasttrackit.temacurs13.ex1.DailyPlanner;
import ro.fasttrackit.temacurs13.ex1.DaySchedule;
import ro.fasttrackit.temacurs13.ex1.DaysOfTheWeek;
import java.util.Scanner;

public class Menu {



    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String command;
        boolean exit = false;
        do {
            System.out.print("Please choose an option : ");
            command = console.next();
            String message = switch (command) {
                case "1" -> "add an activity";
                case "2" -> " remove an activity";
                case "3" -> "list all activities";
                case "4" -> "end planning";
                case "5" -> {
                    exit = true;
                    yield " ";
                }
                default -> "Invalid command";

            };
            System.out.println(message);

        } while (!exit);
    }
   /* static void Menu(){
        if()   */



        }






