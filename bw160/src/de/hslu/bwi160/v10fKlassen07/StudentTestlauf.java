package de.hslu.bwi160.v10fKlassen07;

public class StudentTestlauf {
  public static void main(String[] args) {
  Student studi1 = new Student("Albert Einstein",4711);
  Student studi2 = new Student("Pierre Fermat");
  
  System.out.println("Bisher gibt es "+Student.getAnzahl()+" Studenten");
  
  System.out.println(studi2);

  }

}