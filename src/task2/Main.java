package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String month;
        System.out.println("Press 1 if you want to check if months exist");
        System.out.println("Press 2 if you want to out all month with the same season");
        System.out.println("Press 3 if you want to print all months that have the same number of days");
        System.out.println("Press 4 if you want to print all months that have minimal number of day");
        System.out.println("Press 5 if you want to print all months that have maximal number of day");
        System.out.println("Press 6 if you want to print next season");
        System.out.println("Press 7 if you want to print previous season");
        System.out.println("Press 8 if you want to print all months that have even number of days");
        System.out.println("Press 9 if you want to  print all months that have odd number of days");
        System.out.println("Press 10 if you want know: is month has even number of days?");
        Scanner sc =new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        ArrayList months = new ArrayList();
        for(Months m:Months.values()){
            months.add(m);
        }

        while (true){
            switch (sc.nextInt()){
                case 1:{
                    System.out.println("Write name of month");
                    month = s.nextLine();
                    boolean flag = true;
                    for (int i = 0; i < months.size(); i++) {
                        if (month.equalsIgnoreCase(months.get(i).toString())) {
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
                    for (int i = 0; i <months.size() ; i++) {
                        if (month.equalsIgnoreCase(months.get(i).toString())){
                            flag=false;
                            for (int j = 0; j <months.size() ; j++) {
                                if (months.get(i).season.equals(months.get(j).getSeasons)){
                                    System.out.print(months.get(j).toString());
                                }
                            }
                        }
                    }
                    if (flag) {
                        System.out.println(month + " don't exist");
                    }
                    break;
                    System.out.println();
                }
            }
        }
    }
}
