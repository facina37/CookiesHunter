/**
 * Class Player = Subclass of Character.
 * This class represents the players in the different rooms. 
 * It also stored the list of objects picked up 
 * in the different maps = inventory.
 *
 * @author Gabriel Brunet @ Amandine Poullot
 * @version v0.1 2018-nov
 */
public class Player extends Character
{  
    /**
     * Constructeur d'objets de classe Player
     */
    public Player()
    {
        life = new super.lifePoint;
        this.location = new Room;
        this.inventory = new super.inventory;
        this.name = super.name
    }
