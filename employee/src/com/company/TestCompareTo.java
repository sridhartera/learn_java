package com.company;

class TestCompareTo
{
  public static void main ( String[] args )
  {
    String appleA = new String("apple"); // want distinct objects, not literals
    String appleB = new String("apple");
    String berry  = "berry";
    String cherry = "cherry";
    String damson = "damson";
    String A, B;
    
    A = appleA; B = appleB;
    System.out.println();
    System.out.print(  A + ".compareTo(" + B + ") returns ");
    if ( A.compareTo(B) == 0) System.out.println("Zero");
    if ( A.compareTo(B) < 0 ) System.out.println("Negative");
    if ( A.compareTo(B) > 0 ) System.out.println("Positive");
    System.out.println(  A + ".equals(" + B + ") is " + A.equals(B) );
    
    A = appleA; B = berry;
    System.out.println();
    System.out.print(  A + ".compareTo(" + B + ") returns ");
    if ( A.compareTo(B) == 0) System.out.println("Zero");
    if ( A.compareTo(B) < 0 ) System.out.println("Negative");
    if ( A.compareTo(B) > 0 ) System.out.println("Positive");
    System.out.println(  A + ".equals(" + B + ") is " + A.equals(B) );
    
    A = berry; B = appleA;
    System.out.println();
    System.out.print(  A + ".compareTo(" + B + ") returns ");
    if ( A.compareTo(B) == 0) System.out.println("Zero");
    if ( A.compareTo(B) < 0 ) System.out.println("Negative");
    if ( A.compareTo(B) > 0 ) System.out.println("Positive");
    System.out.println(  A + ".equals(" + B + ") is " + A.equals(B) );
 }
}