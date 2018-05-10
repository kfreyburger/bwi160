package de.hslu.bw140.v12Telefonbuch;

public class TelEintrag {
// der Einfachheit halber nicht private
  public String vorname;
  public String name;
  public int telnr;

  public TelEintrag(String vorname, String name, int telnr) {
    this.vorname = vorname;
    this.name = name;
    this.telnr = telnr;
  }
}