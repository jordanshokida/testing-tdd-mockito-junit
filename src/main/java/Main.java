import MockitoGame.Game;
import TDD.FizzBuzz;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        double salary = 1000;
        System.out.println(MoneyUtil.format(salary));


        FizzBuzz fizzBuzzApp = new FizzBuzz();
        List<String> numbersAndStrings = fizzBuzzApp.getNumbers();
        System.out.println(numbersAndStrings);


        Game game = new Game();
        game.play();


    }
}
