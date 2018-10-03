/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicesession;

/**
 *
 * @author Abu Rayhan
 */
public class PracticeSession {

    /**
     * @param args the command line arguments
     */
    static public void main(String args[]){ //line 2
            int i, j;
            for(i=0; i<3; i++){
                  for(j=1; j<4; j++){
                        i%=j;
			System.out.println(j);
		  }
	    }
      }


}
