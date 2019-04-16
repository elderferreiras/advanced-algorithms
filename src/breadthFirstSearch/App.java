package breadthFirstSearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /*BFS bfs = new BFS();

        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);

        v1.addNeighborVertex(v2);
        v1.addNeighborVertex(v4);
        v4.addNeighborVertex(v5);
        v2.addNeighborVertex(v3);

        bfs.run(v1);*

         */
        // Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail


        Scanner scanner = new Scanner(System.in);
        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] ar = new String[arCount];


        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int largerString = 0;

        for (int i = 0; i < arItems.length; i++) {
            if(arItems[i].length() > largerString) {
                largerString = arItems[i].length();
            }
        }

        String number = "";

        int rest = 0;
        for (int i = largerString - 1; i >=  0; i--) {
            String sum = sum(arItems, i, rest, largerString);

            if(Integer.parseInt(sum) > 9) {
                if(i == 0) {
                    number = sum + number;
                } else {
                    number = sum.charAt(sum.length() - 1) + number;
                    rest = Integer.parseInt(sum.substring(0, sum.length() - 1 ));
                }

            } else {
                number = sum + number;
                rest = 0;

            }
        }
        System.out.println(number);

    }

    public static String sum(String[] numbers, int pos, int rest, int largerString) {
        int sum = rest;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i].length() <= largerString) {
                int pad = largerString - numbers[i].length();
                int index = pos - pad < 0? 0 : Character.getNumericValue(numbers[i].charAt(pos - pad));
                sum += index;
            } else {
                sum += Character.getNumericValue(numbers[i].charAt(pos));
            }
        }

        return Integer.toString(sum);
    }
}
