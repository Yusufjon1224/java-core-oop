package oop.encapsulation;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();


        //initialize the player fields
        // we are able to initialize these fields coz it is public not private
        // it is the example of without using encapsulation
//        player.name = "Digo";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining() );

        EnhancedPlayer digo = new EnhancedPlayer("Digo", 200, "Sword");
        System.out.println("Initial health is " + digo.healthRemaining());
    }
}
