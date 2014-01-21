package arrray.control;

import arrray.model.Potato;

public class ArrayController
{
	/* ********** DECLARATION SELECTION ************ */
	/**
	 * An array of integers, it can hold 15 numbers.
	 */
	private int[][] myIntArray = new int[9][9];
	/**
	 * An array of Strings, it can hold sixteen Strings.
	 */
	private String[][] myStringArray = new String[4][4];
	/**
	 * An array of Potatoes, it can hold 24 Potatoes.
	 */
	private Potato[][] myPotatoArray = new Potato[6][4];

	/**
	 * Where the magic happens.
	 */
	public void start()
	{
		fillArrays();
		outputArrays();
	}

	/* **************** METHODS ******************* */
	/**
	 * This fills all the arrays.
	 */
	private void fillArrays()
	{
		// Loop over the integer array's rows.
		for (int rows = 0; rows < myIntArray.length; rows++)
			{
				// Loop over the integer array's columns.
				for (int cols = 0; cols < myIntArray[0].length; cols++)
					{
						myIntArray[rows][cols] = ((rows + 1) % (cols + 1));
					}
			}

		// Loop over the String array's rows.
		for (int rows = 0; rows < myStringArray.length; rows++)
			{
				// Loop over the String array's columns.
				for (int cols = 0; cols < myStringArray[0].length; cols++)
					{
						myStringArray[rows][cols] = "a";
					}
			}

		/*
		 * Manually randomizing the number of eyes, and the masses of the
		 * Potatoes in the array
		 */
		myPotatoArray[0][0] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[0][1] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[0][2] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[0][3] = new Potato((int) (17 * Math.random()), 7 * Math.random());

		myPotatoArray[1][0] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[1][1] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[1][2] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[1][3] = new Potato((int) (17 * Math.random()), 7 * Math.random());

		myPotatoArray[2][0] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[2][1] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[2][2] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[2][3] = new Potato((int) (17 * Math.random()), 7 * Math.random());

		myPotatoArray[3][0] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[3][1] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[3][2] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[3][3] = new Potato((int) (17 * Math.random()), 7 * Math.random());

		myPotatoArray[4][0] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[4][1] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[4][2] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[4][3] = new Potato((int) (17 * Math.random()), 7 * Math.random());

		myPotatoArray[5][0] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[5][1] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[5][2] = new Potato((int) (17 * Math.random()), 7 * Math.random());
		myPotatoArray[5][3] = new Potato((int) (17 * Math.random()), 7 * Math.random());

	}

	private void outputArrays()
	{
		// Output the integer array's contents.
		for (int rows = 0; rows < myIntArray.length; rows++)
			{
				System.out.print("[ ");
				for (int cols = 0; cols < myIntArray[0].length; cols++)
					{
						System.out.print(myIntArray[rows][cols] + ": ");
					}
				System.out.println("]");
			}

		// Output the String array's contents.
		for (int rows = 0; rows < myStringArray.length; rows++)
			{
				System.out.print("[ ");
				for (int cols = 0; cols < myStringArray[0].length; cols++)
					{
						System.out.print(myStringArray[rows][cols] + ": ");
					}
				System.out.println("]");
			}

		// Outputs the Potato array's contents.
		for (int rows = 0; rows < myPotatoArray.length; rows++)
			{
				System.out.print("[ ");
				for (int cols = 0; cols < myPotatoArray[0].length; cols++)
					{
						System.out.print(myPotatoArray[rows][cols].getNumberOfEyes() + ", "
								+ myPotatoArray[rows][cols].getMass() + ": ");
					}
				System.out.println("]");
			}
	}
}
