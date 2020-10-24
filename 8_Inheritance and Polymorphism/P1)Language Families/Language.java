public class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  Language(String langName, int spkCountry, String regions, String wdOrder ) {
    name = langName;
    numSpeakers = spkCountry;
    regionsSpoken = regions;
    wordOrder = wdOrder;
  }

  public void getInfo() {
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".\nThe language follows the word order:\n" + wordOrder + ".");
  }
  public static void main(String[] args) {
    Language newLang = new Language("KOKI",50000213,"Korea","S-O-V");
    newLang.getInfo();
    Mayan mayan1 = new Mayan("Tektitek",234595);
    mayan1.getInfo();
    SinoTibetan Chinese = new SinoTibetan("Mandarin Chinese", 23123142);
    SinoTibetan non_Chinese = new SinoTibetan("Burmese", 31142);
    Chinese.getInfo();
    non_Chinese.getInfo();
  }
}