package practice_codes2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumbers {

	public static void main(String[] args) {
		
		System.out.println(Math.random()); //it create random between 0 to 1
		
		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextFloat());
		System.out.println(ThreadLocalRandom.current().nextDouble());
		
		Random r = new Random();
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100));
		System.out.println(r.nextDouble());
		System.out.println(r.nextLong());
		

	}

}
