package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        hare.tryRun(false);
        wolf.tryEat(ball);
        wolf.tryRun(false);
        fox.tryEat(ball);
        fox.tryRun(true);
    }

}
