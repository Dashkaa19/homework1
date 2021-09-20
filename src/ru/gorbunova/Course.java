package ru.gorbunova;

public class Course {
    public String[] courses;

    public Course(String[] courses){
        this.courses = courses;
    }

    public void doIt(Team team){
        for (int i = 0; i < team.team.length; i++) {
            for (int j = 0; j < courses.length; j++) {
                System.out.println(team.team[i] + " прошел препятствие " + courses[j]);
                Team.finishedCourse[i] = team.team[i];
            }
        }
    }
}
