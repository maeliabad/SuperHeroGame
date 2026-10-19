public class Superhero {
    // Instance variables
    private String name;
    private String costume;
    private String weapon;
    private boolean life;
    private int weaponStrength;

    // ==========================================
    // TODO #1: Add missing constructors
    // ==========================================
    
    // No-argument (Default) Constructor
    public Superhero() {
        this.name = "Unknown Hero";
        this.costume = "Standard Suit";
        this.weapon = "None";
        this.life = true; // Defaults to true
        this.weaponStrength = 0; // Defaults to 0
    }

    // Parameterized Constructor to create a hero with specific traits
    public Superhero(String name, String costume, String weapon) {
        this.name = name;
        this.costume = costume;
        this.weapon = weapon;
        this.life = true; // Defaults to true
        this.weaponStrength = 0; // Defaults to 0
    }


    // ==========================================
    // TODO #2: Add missing methods (Getters & Setters)
    // ==========================================
    
    // Getters (Accessors)
    public String getName() { return name; }
    public String getCostume() { return costume; }
    public String getWeapon() { return weapon; }
    public boolean isAlive() { return life; }
    public int getWeaponStrength() { return weaponStrength; }

    // Setters (Mutators)
    public void setName(String name) { this.name = name; }
    public void setCostume(String costume) { this.costume = costume; }
    public void setWeapon(String weapon) { this.weapon = weapon; }
    public void setLife(boolean life) { this.life = life; }
    public void setWeaponStrength(int weaponStrength) { this.weaponStrength = weaponStrength; }


    // ==========================================
    // TODO #3: Complete the toString() method
    // ==========================================
    public String toString() {
        // Formats a clean string combining all the superhero's attributes
        String superHeroDetails = "Superhero Name: " + name + "\n" +
                                 "Costume: " + costume + "\n" +
                                 "Weapon: " + weapon + " (Strength: " + weaponStrength + ")\n" +
                                 "Status: " + (life ? "Alive": "Defeated");
        
        return superHeroDetails;
    }

    public void loseLife() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loseLife'");
    }
}
