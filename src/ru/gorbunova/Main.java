package ru.gorbunova;

public class Main {

    public static void main(String[] args) {
        Course c = new Course(new String[] {
                "препятствие 1", "препятствие 2", "препятствие 3", "препятстсиве 4", "препятствие 5" });
        Team team = new Team(new String[]{"Fedor","Ilya","Igor"});
        c.doIt(team);
        team.showResults();
        team.teamInfo();
    }
}
