package net.javavideotutorials.assignment1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryNumberGenerator 
{

  /**
   * This method should return a Set of 6 different
   * integers.  
   * 
   * Hint: use the 'Random' class located here: java.util.Random
   *       to generate random numbers
   * @return
   */
  public Set<Integer> generateLotteryNumbers ()
  {
	  Random rand = new Random();
	  Set<Integer> lotteryNumber = new HashSet<Integer>();
	  while(lotteryNumber.size() < 6){
		  lotteryNumber.add(rand.nextInt(49)+1);
		  }
	  return lotteryNumber;
	  
  }
}
