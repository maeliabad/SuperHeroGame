public class Main {
    public static void main(String[] args) {
        // 3. Create a new Superhero (placeholder) using your new default Constructor
        Superhero placeholder = new Superhero();

        // 4. Create 2 new Superheroes
        Superhero batman = new Superhero("Batman", "Batsuit", "Batarang");
        Superhero spiderman = new Superhero("Spiderman", "Redsuit", "Superweb");

        // 5. Print out their details
        System.out.println("--- Initial Details ---");
        System.out.println(placeholder + "\n");
        System.out.println(batman + "\n");
        System.out.println(spiderman + "\n");

        // 6. Spiderman has a bad day
        System.out.println("The Green Goblin shows up...");
        spiderman.loseLife();
        System.out.println(spiderman + "\n");

        // 7. Batman and placeholder fight
        int batmanSpecial = batman.specialAttack(4);
        int placeHolderSpecial = placeholder.specialAttack(9001);

        // 8. Print out the results of this fight
        // (Note: Using getName() respects encapsulation since instance variables are private)
        System.out.println("--- Fight Results ---");
        System.out.println(batman.getName() + " uses his special attack and deals " + batmanSpecial + " damage.");
        System.out.println(placeholder.getName() + " uses his special attack and deals " + placeHolderSpecial + " damage.");
    }
}