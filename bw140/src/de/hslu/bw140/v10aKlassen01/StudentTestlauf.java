package de.hslu.bw140.v10aKlassen01;

public class StudentTestlauf {
  public static void main(String[] args) {

  Student studi1 = new Student();

  studi1.name = "Albert Einstein";
  studi1.nummer = 4711;

  Student studi2 = new Student();

  studi2.name = "Pierre Fermat";
  studi2.nummer = 4712;


  Student studi3 = new Student();
// wie bei Arrays: Durch "=" ist der Zeiger auf dem gleichen Objekt
  studi3 = studi1;
  studi3.nummer  = 12345;

  System.out.println(studi1.name+"  "+studi1.nummer);
  }
}