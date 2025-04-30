package bean;

import java.io.Serializable;

public class RegisterBean3 implements Serializable {
  private String name;
  private String age;
  private String[] langs;

  public RegisterBean3() {}

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public void setLangs(String[] langs) {
    this.langs = langs;
  }

  public String getName() {
    return this.name;
  }

  public String getAge() {
    return this.age;
  }

  public String[] getLangs() {
    return this.langs;
  }

  public String getJpAge() {
    if (age.equals("child")) {
      return "Under18";
    }
    return "Over18";
  }

  public String getStrLangs() {
    String strLangs = "";
    for (int i = 0; i < this.langs.length; i++) {
      strLangs = strLangs + this.langs[i] + " ";
    }
    return strLangs;
  }
}
