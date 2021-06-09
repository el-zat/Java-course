package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(ChromeDriver wd) {
    super(wd);
  }

  public void gotoNewContactPage() {
    click(By.linkText("add new"));
  }

  public void gotoHomePage() {
    click(By.linkText("home"));
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }
}
