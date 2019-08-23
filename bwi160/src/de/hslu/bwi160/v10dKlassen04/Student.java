package de.hslu.bwi160.v10dKlassen04;

public class Student {

  private String name;
  private int nummer;

  public void setName(String paramName) {
// würde auch gehen (Gefahr ist aber bei Namensgleichheit mit dem Paramater)
    name = paramName;
//  besser:
    this.name = paramName;
  }

  public String getName() {
    return this.name;
  }

  public void setNummer(int n) {
    this.nummer = n;
  }
  public int getNummer() {
    return this.nummer;
  }

}