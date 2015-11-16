import java.util.*;
class RunPi{
public static void main(String args[]){
	System.out.println("How many decimals would you like to output pi to?");
	Scanner reader = new Scanner(System.in);
	Pi calcPi = new Pi();
	int digs = reader.nextInt();
	System.out.println("" + calcPi.pi(digs));
}
}