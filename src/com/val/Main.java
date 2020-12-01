package com.val;

public class Main {

    public static void main(String[] args) {

//        90 people in line
//                every 5 min 40 peple join the ride and 63 join the line
//                how long to line be 600 people

        int line = 90;
        int min = 0;
        int endTime = 0;

        while (line != 600) {
            for (int i = 0; i <= line; i++) {
                line += 63;
                for (int j = 0; j < 6; j++) {
                    endTime += j;
                }

            }

        }
        System.out.println(endTime);
    }
}
