package com.company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



class ArrayOps
{
  int findMax( int[] x )   //  this method is called with.                     
  {
    int max = x[0];
    for ( int index=0; index <x.length; index++ )
      if ( x[index] > max )
        max = x[index] ;
    return max ;
  }
}

class ArrayDemo
{
	private static final Log LOGGER = LogFactory.getLog( ArrayDemo.class );
  public static void main ( String[] args ) 
  {
    ArrayOps operate = new ArrayOps();
    int[] ar1 =  { -20, 19, 1, 5, -1, 27, 19, 5 } ;
    int[] ar2 =  { 2, 4, 1, 2, 6, 3, 6, 9 } ;

    System.out.println("The first  maximum is: " + operate.findMax( ar1 )  );
    LOGGER.info("The first  maximum is: " + operate.findMax( ar1 ));
    
    System.out.println("The second maximum is: " + operate.findMax( ar2 )  );    
  }
}      