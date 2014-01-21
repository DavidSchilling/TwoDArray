package arrray.model;

/**
 * This is a potato, it has some eyes (the black bits) and a mass.
 * 
 * @author David Schilling
 * @version 1.0.2
 * 
 */
public class Potato
{
	// ******** DECLARATION SECTION *********//
	/**
	 * The number of black spots on a potato.
	 */
	private int numberOfEyes;
	/**
	 * The mass of the potato.
	 */
	private double mass;

	/**
	 * This is a constructor, it constructs a potato based on the parameters
	 * passed to it.
	 * 
	 * @param numberOfEyes
	 *            The number of black bits, or "eyes" on the potato.
	 * @param mass
	 *            The mass of the potato.
	 */
	public Potato(int numberOfEyes, double mass)
	{
		this.numberOfEyes = numberOfEyes;
		this.mass = mass;
	}

	// ************ GETTERS ************//
	public int getNumberOfEyes()
	{
		return numberOfEyes;
	}

	public double getMass()
	{
		return mass;
	}

	// *********** SETTERS *************//
	public void setMass(double mass)
	{
		this.mass = mass;
	}

	public void setNumberOfEyes(int numberOfEyes)
	{
		this.numberOfEyes = numberOfEyes;
	}

}
