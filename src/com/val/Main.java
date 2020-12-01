package com.val;

public class Main {

    public static void main(String[] args) {

//        90 people in line
//                every 5 min 40 peple join the ride and 63 join the line
//                how long to line be 600 people

        int peopleInLine = 90;
        int peopleOnRide = 40;
        int totalPeople = 600;
        int peopleGettingInLine = 63;
        int time = 0;
        int timeLapse = 5;

        while (peopleInLine <= totalPeople) {
            peopleInLine -= peopleOnRide;
            peopleInLine += peopleGettingInLine;
            time += timeLapse;

        }
        System.out.println(time + " minutes to line get " + totalPeople + " people");

    }

}


