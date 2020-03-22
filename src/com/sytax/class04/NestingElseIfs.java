package com.sytax.class04;

public class NestingElseIfs {
	public static void main(String[]args) {
		/*if student completed a quiz, 
		 we will check for a score
		 * if score >90-->great job
		 * if score >80-->well done
		 * if score >70--> could have done better
		 * 
		 * if student did not complete the quize
		 --> not good
		 *please do homework ontime
		 */
		boolean quizComp=true;
		int score=89;
		
		if (quizComp) {
			System.out.println("Check the score");
			if (score>90) {
				System.out.println("great Job");
			}
			else if(score>80) {
				System.out.println("well done");
			} else if(score>70) {
				System.out.println("could have done better");
			} else {
				System.out.println("failed");
			}
		} else {
			System.out.println();
		}
		/*Order is importand for not to have 
		 logical problem, if you replace else if
		 scor>70 with score>80, thn result will be 
		 "could have done better" istead of 
		 "wel done" cause java exit from loop at
		 the poing score>70 eventough score>80*/
	}

}
