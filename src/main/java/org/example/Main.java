package org.example;


public class Main {
    static int getInterval(String[] args) {
        if (args.length > 0) {
            try {
                return Integer.parseInt(args[0]);
            } catch (Exception e) {
                return 1000;
            }
        }
        return 0;
    }

    static int getRepetitions(String[] args) {
        if (args.length > 1) {
            try {
                return Integer.parseInt(args[1]);
            } catch (Exception e) {
                return 10;
            }
        }
        return 100;
    }

    public static void main(String[] args) {
        QuotesCollection collection = new QuotesCollection();

        int index;
        int interval = getInterval(args);
        int max = getRepetitions(args);


        for (int count = 0; count <= max; count++) {
            index = (int) ((collection.getLength() - 1) * Math.random());
            System.out.println(collection.getQuote(index));

            try{
                Thread.sleep(interval);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        }

    }
}