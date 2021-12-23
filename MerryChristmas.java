public class MerryChristmas{
	public static final int SIZE = 15;

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String[] lights = {ANSI_RED, ANSI_YELLOW,
								  		   ANSI_BLUE, ANSI_PURPLE,
								  		   ANSI_CYAN, ANSI_WHITE};

	public static final String s1 = "Merry Christmas &";
	public static final String s2 = "a happy new year.";
	public static final String s3 = "Keep programming :-)";

	public static void main(String[] args){
		System.out.println();
		for (int i = 1; i < SIZE; i++) {
   			System.out.printf("%" + (SIZE - i) + "c", ' ');
   			for(int j = 0; j < (2 * (i-1) + 1); j++){
   				if (Math.random() > 0.5){
   					int colour = (int)(Math.random()*6);
   					System.out.print(lights[colour] + "*");
   				}
   				else
   					System.out.print(ANSI_GREEN + "*");
   			}
   			
   			System.out.println();
   		}	
   		for(int i = 0; i < 2; i++)
   			System.out.printf(ANSI_GREEN + "%" + (SIZE-1) + "c%c%c\n", '*', '*', '*');
   		  		
   		System.out.printf(ANSI_WHITE + "%" + (2*(SIZE-1)-4) + "s\n", s1);
   		System.out.printf(ANSI_WHITE + "%" + (2*(SIZE-1)-4) + "s\n", s2);
   		System.out.printf(ANSI_WHITE + "%" + (2*(SIZE-1)-2) + "s\n", s3);
   		System.out.println(ANSI_RESET);
	}
}