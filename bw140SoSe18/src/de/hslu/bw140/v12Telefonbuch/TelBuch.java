package de.hslu.bw140.v12Telefonbuch;

public class TelBuch {
  private TelEintrag[] eintraege;
  private int anzEintraege;

  public TelBuch(int groesse) {
    eintraege = new TelEintrag[groesse];
    anzEintraege = 0;
  }

  public void hinzufuegen (String vorname, String name, int nummer) {
// prüfen, dass noch Platz und der Eintrag noch nicht vorhanden
    if ( anzEintraege < eintraege.length && lookup(vorname, name) == -1) {
      eintraege[anzEintraege] = new TelEintrag(vorname, name, nummer);
      anzEintraege++;
    }
  }
  public int lookup (String vorname, String name) {
     int i = 0;
     while ( i < anzEintraege && !(name.equals(eintraege[i].name)
                                    && vorname.equals(eintraege[i].vorname) ) )
// Reihenfolge ist wichtig: auf buch[i] darf man nur zugreifen, wenn die erste
// Bedingung erfüllt ist
// Stringvergleich muss man mit .equals machen
         i++;
    if ( i < anzEintraege )        // name.equals(eintraege[i].name)
      return eintraege[i].telnr;    // && vorname.equals(eintraege[i].vorname)
    else                           // i = anz_eintraege --> Name nicht gefunden
      return -1;
  }

  public int getAnzahl() {
    return anzEintraege;
  }


}