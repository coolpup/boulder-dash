package fr.enssat.BoulderDash.models;

import fr.enssat.BoulderDash.interfaces.PublisherInterface;
import fr.enssat.BoulderDash.models.DisplayableElementModel;


/**
 * BrickWallModel
 *
 * Represents the brick wall in the game.
 *
 * @author      Colin Leverger <me@colinleverger.fr>
 * @since       2015-06-19
 */
public class BrickWallModel extends DisplayableElementModel implements PublisherInterface {
	private static String pathToSprite;
	private static String spriteName;
	private static boolean isDestructible;
	private static boolean canMove;
	private static boolean impactExplosive;
	private static boolean animate;
	private static int priority;
	private static boolean falling;
	private static String collideSound;

    /**
     * Static dataset
     * Specifies the physical parameters of the object
     */
	static {
		spriteName = "brickwall";
		isDestructible = true;
		canMove = false;
		impactExplosive = false;
		animate = false;
		priority = 3;
		falling = false;
		collideSound = null;
	}

    /**
     * Class constructor
     */
	public BrickWallModel() {
		super(isDestructible, canMove, pathToSprite, priority, impactExplosive, animate, falling, collideSound);

        this.loadSprite(spriteName);
	}
}
