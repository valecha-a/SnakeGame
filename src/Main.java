//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        // Starting a new game
        game.startNewGame();

        // Simulating some gameplay actions
        game.updateScore(10);  // Snake eats food, score updated
        game.pauseGame();      // Game is paused
        game.resumeGame();     // Game resumes
        game.updateScore(20);  // Another food item is consumed, score updates again

        // Exiting the game
        game.exitGame();
    }
}