public class Superhero {
    // Instance variables
    private String name;
    private String costume;
    private String weapon;
    private boolean life;
    private int weaponStrength;

    // Default Constructor
    public Superhero() {
        this.name = "Unknown Hero";
        this.costume = "Standard Suit";
        this.weapon = "None";
        this.life = true;
        this.weaponStrength = (int)(Math.random() * 10) + 1;
    }

    // Parameterized Constructor
    public Superhero(String name, String costume, String weapon) {
        this.name = name;
        this.costume = costume;
        this.weapon = weapon;
        this.life = true;
        this.weaponStrength = (int)(Math.random() * 10) + 1;
    }

    // New Constructor with Custom Weapon Strength
    public Superhero(String name, String costume, String weapon, int weaponStrength) {
        this.name = name;
        this.costume = costume;
        this.weapon = weapon;
        this.life = true;
        this.weaponStrength = weaponStrength;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCostume() {
        return costume;
    }

    public String getWeapon() {
        return weapon;
    }

    public boolean isAlive() {
        return life;
    }

    public int getWeaponStrength() {
        return weaponStrength;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public void setWeaponStrength(int weaponStrength) {
        this.weaponStrength = weaponStrength;
    }

    // toString Method
    public String toString() {
        String superHeroDetails = "Superhero Name: " + name + "\n" +
                "Costume: " + costume + "\n" +
                "Weapon: " + weapon + " (Strength: " + weaponStrength + ")\n" +
                "Status: " + (life ? "Alive" : "Defeated");

        return superHeroDetails;
    }

    // Lose Life Method
    public void loseLife() {
        life = false;
    }
}