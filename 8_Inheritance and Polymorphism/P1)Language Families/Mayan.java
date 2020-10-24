class Mayan extends Language {
  Mayan(String langName, int speakers) {
    super(langName, speakers, "Central America", "verb-object-subject");
  }
  @Override
  public void getInfo() {
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".\nThe language follows the word order:\n" + wordOrder + "\nFun fact: " + name + " is and ergative language.");
  }
}