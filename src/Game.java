/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;

    public Game(Player p1, Player p2, Dice die) {
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }
    public void play() {
        Player current = p1;
        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);

        System.out.println(announceWinner());
    }

    public Player nextPlayer(Player current) {
        if (current == this.p1) {
            return this.p2;
        } else {
            return this.p1;
        }
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
        System.out.printf("%s rolled %d%n%s rolled %d%n", p1.getName(), p1.getScore(), p2.getName(), p2.getScore());

        if (this.p1.getScore() > this.p2.getScore()) {
            return String.format("%s won, haha you lost %s!", p1.getName(), p2.getName());
        } else if (this.p2.getScore() > this.p1.getScore()) {
            return String.format("%s won, way to lose %s!", p2.getName(), p1.getName());
        } else {
            return String.format("%s and %s tied, this game was boring", p1.getName(), p2.getName());
        }
    }

    public static void main(String[] args) {

        Scanner identifyYoSelf = new Scanner(System.in);

        //Setting Name of Players

        System.out.println("Enter Player 1's Name");
        String playerName = identifyYoSelf.nextLine();

        Player p1 = new Player(playerName); //name 1

        System.out.println("Enter Player 2's Name");
        playerName = identifyYoSelf.nextLine();

        Player p2 = new Player(playerName); //name 2

        //Asking about dice
        System.out.println("How many sides yo dice have?");
        int sides = Integer.parseInt(identifyYoSelf.nextLine());

        //Game
        Game tournamentArc = new Game(p1, p2, new Dice(sides));
        tournamentArc.play();
    }
}
