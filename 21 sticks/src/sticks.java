import java.util.Scanner;

public class sticks
	{
		static int numOfSticks = 21;
		static int numOfPull;
		static int compPull;
		static int turn;

		public static void main(String[] args)

			{
				System.out.println("In this game you start off with twenty-one sticks. You can only draw either one or two sticks during your turn. Your goal is to not draw the last stick from the pile. If you do, you lose. If your opponent draws the last one, you win.");
				System.out.println("You were chosen to go first. How many sticks do you want to draw? 1 or 2?");
				Scanner userInput = new Scanner(System.in);
				numOfPull = userInput.nextInt();
				numOfSticks -= numOfPull;
					{
						System.out.println("There are now " + numOfSticks + " sticks in the pile.");
					}

				while (numOfSticks > 0)
					{
						int compPull = (int) (Math.random() * 2) + 1;

						System.out.println("Now I'll go. I will pull " + compPull + " stick(s).");
						numOfSticks -= compPull;
							{
								System.out.println("There are now " + numOfSticks + " sticks in the pile.");
							}
							{
								if (turn % 2 == 1 && numOfSticks == 2)
									{
										compPull = 1;
										System.out.println("You lose! You drew the last stick.");
										System.exit(0);
									}
								if (turn % 2 == 1 && numOfSticks == 1)
									{
										compPull = 1;
										System.out.println("You win! I drew the last stick.");
										System.exit(0);
									}
								if (turn % 2 == 0 && numOfSticks == 2 && numOfPull == 2)
									{
										System.out.println("You lose! You drew the last stick.");
										System.exit(0);
									}
								if (turn % 2 == 0 && numOfSticks == 2 && numOfPull == 1)
									{
										System.out.println("You win! I drew the last stick.");
										System.exit(0);
									}
								if (turn % 2 == 0 && numOfSticks == 0)
									{
										System.out.println("You lose! You drew the last stick!");
										System.exit(0);
									}
								System.out.println("Now how many sticks do you want to draw?");
								Scanner userInput2 = new Scanner(System.in);
								numOfPull = userInput.nextInt();
								numOfSticks -= numOfPull;
									{
										System.out.println("There are now " + numOfSticks + " sticks in the pile."); //githubtester
									}

							}

					}
			}
	}
