package com.company;

class Fleet
{
  // data
  Car town;
  Car suv;

  // constructor
  Fleet( int start1, int end1, double gal1, 
         int start2, int end2, double gal2 )
  {
    town = new Car( start1, end1, gal1) ;
    suv  = new Car( start2, end2, gal2) ;
  }

  // method
  double calculateMPG()
  {
    double sumMPG; 

    sumMPG = town.calculateMPG() + suv.calculateMPG() ;

    return sumMPG/2.0;
  }
}

class Car
{
  // data
  int startMiles;   // Starting odometer reading
  int endMiles;     // Ending   odometer reading
  double gallons;   // Gallons of gas used between the readings

  // constructor
  Car(  int first, int last, double gals  )
  {
    startMiles = first ;
    endMiles   = last ;
    gallons    = gals ;
  }

  // methods
  double calculateMPG()
  {
    return (endMiles - startMiles)/gallons ;
  }

}

class FleetTester
{
  public static void main ( String[] args)
  {
    Fleet myCars = new Fleet( 1000, 1234, 10, 777, 999, 20 );
    System.out.println("Fleet average MPG= " + myCars.calculateMPG() );
  }
}