package de.hslu.bw140.v10gKlassen07;

public class MixTypTestlauf {
  public static void main(String[] args) {
    MixTyp f, g;
    f = new MixTyp();
    g = new MixTyp();
    System.out.println("f.s = " + f.s);
    System.out.println("f.i = " + f.i);
    System.out.println("g.s = " + g.s);
    System.out.println("g.i = " + g.i);
    f.s = 200;
    f.i = 20;
    System.out.println("f.s = " + f.s);
    System.out.println("f.i = " + f.i);
    System.out.println("g.s = " + g.s);
    System.out.println("g.i = " + g.i);
    g.s = 300;
    g.i = 30;
    System.out.println("f.s = " + f.s);
    System.out.println("f.i = " + f.i);
    System.out.println("g.s = " + g.s);
    System.out.println("g.i = " + g.i);
    MixTyp.s = 400;
    System.out.println("f.s = " + f.s);
    System.out.println("f.i = " + f.i);
    System.out.println("g.s = " + g.s);
    System.out.println("g.i = " + g.i);
//   MixTyp.i = 40;
//   ist nicht erlaubt, Compiler:
//   nicht-statische Variable kann nicht aus einem statischen Kontext aufgerufen werden

  }
}