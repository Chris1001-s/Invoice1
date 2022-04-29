//For invoice Hw 1

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice2 {
    public static void main(String args[]) {

        Invoice1 item = new Invoice1();
        Invoice1 item2 = new Invoice1();
        Invoice1 item3 = new Invoice1();
        Invoice1 item4 = new Invoice1();


        item.display();
        item.setItem("bison sweater");
        item.setPrice(55.99);

        item2.setItem("bison tee");
        item2.setPrice(14.99);

        item3.setItem("bison hoodie");
        item3.setPrice(23.99);

        item4.setItem("bison bumpersticker");
        item4.setPrice(4.99);
        item.toString();
        item2.toString();
        item3.toString();
        item4.toString();

        //creating ArrayLists
        ArrayList<String> products = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();

        //taking input from user
        Scanner input = new Scanner(System.in);



        //Adding products and prices
        products.add("bison sweater");
        prices.add(55.99);
        products.add("bison tee");
        prices.add(14.99);
        products.add("bison hoodie");
        prices.add(23.99);
        products.add("bison bumpersticker");
        prices.add(4.99);

        String answer;
        ArrayList<String> purchases = new ArrayList<String>();

        do {
            System.out.println("What do you want to do?");
            System.out.println("1) add purchase 2) show purchases 3) finish transaction");

            answer = input.nextLine();
            if (answer.equals("1"))
            {
                System.out.println("What do you wish to buy?");
                answer = input.nextLine();
                purchases.add(answer);
            }

            //displaying the purchases information
            else if (answer.equals("2"))
            {
                for(int i = 0; i < purchases.size(); i++)
                {
                    System.out.println(purchases.get(i));
                }
            }
        } while (! answer.equals("3"));

        //calculating total cost
        double totalcost = 0.0;
        int j = 0;
        for (int i = 0; i < purchases.size(); i++)
        {
            j=0;
            do {

                //  check if the value in purchases at position i is equal to the value in products at position j
                if (purchases.get(i).equals(products.get(j)) )
                {

                    // increment total cost with the value in the prices array
                    totalcost = totalcost + prices.get(j);
                }
                j++;
            } while (j < products.size());
        }
        System.out.println("Total Cost: "+ totalcost);
    }
}
