package assignments;

import java.util.Scanner;

public class Dice {
	int sides;
	
	public Dice(int sides)
	{
		this.sides = sides;
	}
	
	public String roll()
	{
		int min=1;
		int max=sides;
		String r="invalid Input";
		
		int rand=min+(int)Math.random()*((max-min)+1);
		if(sides==6 || sides==4)
		{
			switch(rand)
			{
			case 1: r= "one";
			break;
			case 2: r= "two";
			break;
			case 3: r= "three";
			break;
			case 4: r= "four";
			break;
			case 5: r= "five";
			break;
			case 6: r= "six";
			break;
			}
		}
		else if(sides==2)
		{
			switch(rand)
			{
			case 1: r= "head";
			break;
			case 2: r= "tail";
			break;
			}
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter sides");
		Scanner sc=new Scanner(System.in);

		int side=sc.nextInt();
		Dice d=new Dice(side);
		String ans=d.roll();
		System.out.println(ans);
	}

}
