// 1. パッケージ化
package bean;

import java.io.Serializable;

// 2. public指定
// 3. Serializableインターフェースを実装
public class RegisterBean implements Serializable {
  private String name;
  private String age;
  private String[] langs;

  // 4. 引数なしのコンストラクタを作成
  public RegisterBean() {}

  // 5. setterを作成
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public void setLangs(String[] langs) {
    this.langs = langs;
  }

  // 5.  getterを作成
  public String getName() {
    return this.name;
  }

  public String getAge() {
    return this.age;
  }

  public String[] getLangs() {
    return this.langs;
  }

  // カスタムメソッド
  public String getStrLangs() {
    String strLangs = "";
    for (int i = 0; i < this.langs.length; i++) {
      strLangs = strLangs + this.langs[i] + " ";
    }
    return strLangs;
  }
}
