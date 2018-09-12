package de.hslu.bw140.v10fKlassen06;

public class StudentTestlauf {
  public static void main(String[] args) {
  Student studi1 = new Student("Albert Einstein", 4711);
  Student studi2 = new Student("Pierre Fermat", 4712);
  
  System.out.println("Bisher gibt es "+Student.getAnzahl()+" Studenten");
  
  System.out.println(studi1);

  }

}