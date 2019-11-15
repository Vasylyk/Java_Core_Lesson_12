package task2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String month;
        System.out.println("Press 1 if you want to check if months exist");
        System.out.println("Press 2 if you want to out all month with the same season");
        System.out.println("Press 3 if you want to print all months that have the same number of days");
        System.out.println("Press 4 if you want to print all months that have less number of days");
        System.out.println("Press 5 if you want to print all months that have more number of day");
        System.out.println("Press 6 if you want to print all months that have even number of days");
        System.out.println("Press 7 if you want to  print all months that have odd number of days");
        System.out.println("Press 8 if you want know: is month has even number of days?");
        Scanner sc =new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Months[]months = Months.values();
        List<Months> monthsList = Arrays.asList(months);


            switch (sc.nextInt()){
                case 1:{
                    System.out.println("Write name of month");
                    month = s.nextLine();
                    boolean flag = true;
                    for (int i = 0; i < monthsList.size(); i++) {
                        if (month.equalsIgnoreCase(monthsList.get(i).toString())) {
                            System.out.println(month + " is exist");
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println(month + " don't exist");
                    }
                    break;
                }
                case 2:{
                    System.out.println("Write name of month");
                    month = s.nextLine();
                    System.out.println("Months of this season: ");
                    boolean flag = true;
                    for (int i = 0; i <monthsList.size() ; i++) {
                        if (month.equalsIgnoreCase(monthsList.get(i).toString())){
                            flag=false;
                            for (int j = 0; j <monthsList.size() ; j++) {
                                if (monthsList.get(i).seasons.equals(monthsList.get(j).seasons)){
                                    System.out.print(monthsList.get(j)+" ");
                                }
                            }
                        }
                    }
                    if (flag) {
                        System.out.println(month + " don't exist");
                    }
                    System.out.println();
                    break;
                }
                case 3:{
                    System.out.println("Write name of month");
                    month = s.nextLine();
                    System.out.println("Months with same number of days: ");
                    boolean flag = true;
                    for (int i = 0; i <monthsList.size() ; i++) {
                        if (month.equalsIgnoreCase(monthsList.get(i).toString())){
                            for (int j = 0; j <monthsList.size() ; j++) {
                                if (monthsList.get(i).days==monthsList.get(j).days){
                                    System.out.print(monthsList.get(j)+" ");
                                    flag = false;
                                }
                            }
                        }
                    }
                    if (flag){
                        System.out.println("does not exist");
                    }
                    System.out.println();
                    break;
                }
                case 4:{
                    System.out.println("Write name of month");
                    month = s.nextLine();
                    System.out.println("Months with minimal number of days:");
                    boolean flag = true;
                    for (int i = 0; i <monthsList.size() ; i++) {
                        if (month.equalsIgnoreCase(monthsList.get(i).toString())){
                            for (int j = 0; j <monthsList.size(); j++) {
                                if (monthsList.get(i).days>monthsList.get(j).days){
                                    System.out.print(monthsList.get(j)+" ");
                                    flag = false;
                                }
                            }
                        }
                    }
                    if (flag){
                        System.out.println("does not exist");
                    }
                    System.out.println();
                    break;
                }
                case 5:{
                    System.out.println("Write name of month");
                    month = s.nextLine();
                    System.out.println("Months with more days: ");
                    boolean flag = true;
                    for (int i = 0; i <monthsList.size() ; i++) {
                        if (month.equalsIgnoreCase(monthsList.get(i).toString())){
                            for (int j = 0; j <monthsList.size(); j++) {
                                if (monthsList.get(i).days<monthsList.get(j).days){
                                    System.out.print(monthsList.get(j)+" ");
                                    flag = false;
                                }
                            }
                        }
                    }
                    if (flag){
                        System.out.println("does not exist");
                    }
                    System.out.println();
                    break;
                }
                case 6:{
                    System.out.println("Months that have even number of days: ");
                    for (int i = 0; i <monthsList.size() ; i++) {
                        if (monthsList.get(i).days%2==0){
                            System.out.print(monthsList.get(i)+" ");
                        }
                    }
                    break;
                }
                case 7:{
                    System.out.println("Months that have odd number of days: ");
                    for (int i = 0; i <monthsList.size() ; i++) {
                        if (monthsList.get(i).days%2==1){
                            System.out.print(monthsList.get(i)+" ");
                        }
                    }
                    break;
                }
                case 8:{
                    System.out.println("Write name of month");
                    month = s.nextLine();
                    boolean flag = true;
                    for (int i = 0; i <monthsList.size() ; i++) {
                        if (month.equalsIgnoreCase(monthsList.get(i).toString())){
                            flag=false;
                            if (monthsList.get(i).days%2==0){
                                System.out.print(month+" has even number of days");
                            } else {
                                System.out.println(month+" has odd number of days");
                            }
                        }
                    }
                    if (flag){
                        System.out.println("does not exist");
                    }
                    break;
                }
            }
    }
}
