package ru.gorbunova;

public class Team {
    public String[] team;
    public static String[] finishedCourse = new String[4];

    public Team(String[] team){
        this.team = team;
    }

    public void showResults(){
        for (int i = 0; i < finishedCourse.length; i++) {
            if (finishedCourse[i] != null) {
                System.out.println(finishedCourse[i] + " прошел дистанцию");
            }
        }
    }

    public void teamInfo(){
        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i]);
        }
    }
}
