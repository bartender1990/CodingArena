/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
		*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        //System.out.println(T);
        for (int i = 0; i < T; i++) {
        	HashMap<String,Integer> uh1 = new HashMap<String,Integer>();
        	HashMap<String,Integer> uh2 = new HashMap<String,Integer>();
        	HashMap<String,Integer> uh3 = new HashMap<String,Integer>();
        	
        	String line1 = br.readLine();
        	
        	String[] numWordsReadStr= line1.split("\\s");
        	
        	int user1Count= Integer.parseInt(numWordsReadStr[0]);
        	int user2Count= Integer.parseInt(numWordsReadStr[1]);
        	int user3Count= Integer.parseInt(numWordsReadStr[2]);
        	
        	int user1Sum = 0;
        	int user2Sum = 0;
        	int user3Sum = 0;
        	
			//System.out.println("userCount1 = "+user1Count);
        	//System.out.println("userCount2 = "+user2Count);
			//System.out.println("userCount3 = "+user3Count);
			
        	if(user1Count>0){
        		String line2 = br.readLine();
        		String[] user1Words= line2.split("\\s");
        		for(String s:user1Words){
					//System.out.println("user1 words = "+s);
        			uh1.put(s,3);
        			user1Sum +=  3;
					//System.out.println("user1 sum = "+user1Sum);
					//System.out.println("user1 sum = "+user2Sum);
					//System.out.println("user1 sum = "+user3Sum);
        		}
				
        	}
        	if(user2Count>0){
        		String line3 = br.readLine();
        		String[] user2Words= line3.split("\\s");
        		for(String s:user2Words){
					//System.out.println("user2 words = "+s);
        			if(uh1.get(s)==null){
        				uh2.put(s,3);
        				user2Sum +=  3;
        			}
        			else
        			{
        				uh1.put(s,2);
        				uh2.put(s,2);
        				user1Sum -=  1;
        				user2Sum +=  2;
        			}
					//System.out.println("user1 sum = "+user1Sum);
					//System.out.println("user1 sum = "+user2Sum);
					//System.out.println("user1 sum = "+user3Sum);
        		}
        	}
        	if(user3Count>0){
        		String line4 = br.readLine();
        		String[] user3Words= line4.split("\\s");
        		for(String s:user3Words){
					//System.out.println("user3 words = "+s);
        			boolean isIn1 = uh1.get(s)==null?false:true;
        			boolean isIn2 = uh2.get(s)==null?false:true;
        			if(!isIn1 && !isIn2){
        				uh3.put(s,3);
        				user3Sum +=  3;
        			}
        			if(!isIn1 && isIn2){
        				uh2.put(s,2);
        				uh3.put(s,2);
        				user2Sum -=  1;
        				user3Sum +=  2;
        			}
        			if(isIn1 && !isIn2){
        				uh1.put(s,2);
        				uh3.put(s,2);
        				user1Sum -=  1;
        				user3Sum +=  2;
        			}
        			if(isIn1 && isIn2){
        				uh1.put(s,1);
        				uh2.put(s,1);
        				uh3.put(s,1);
        				user1Sum -=  1;
        				user2Sum -=  1;
        				user3Sum +=  1;
        			}
					//System.out.println("user1 sum = "+user1Sum);
					//System.out.println("user1 sum = "+user2Sum);
					//System.out.println("user1 sum = "+user3Sum);
        		}
        		
        	}
			
			int gotAnswer = 0;
			if(user1Sum > user2Sum && user1Sum > user3Sum){
				System.out.println("Raju");
				gotAnswer =1 ;
			}
			if(user2Sum > user1Sum && user2Sum > user3Sum){
				System.out.println("Ramu");	
				gotAnswer =1 ;
			}
			if(user3Sum > user1Sum && user3Sum > user2Sum) {
				System.out.println("Rakesh");
				gotAnswer =1;
			}
			if(gotAnswer==0) {
				System.out.println("Tie");		
			}
				
			
			
        }
        

        //System.out.println("Hello World!");
    }
}
