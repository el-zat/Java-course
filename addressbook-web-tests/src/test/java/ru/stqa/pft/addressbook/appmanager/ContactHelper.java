package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.NewContactData;

public class ContactHelper extends HelperBase{

  public ContactHelper (ChromeDriver wd) {
    super(wd);
  }

  public void fillNewContactForm(NewContactData newContactData) {
    type(By.name("firstname"), newContactData.getFirstname());
    type(By.name("lastname"), newContactData.getLastname());
    type(By.name("nickname"), newContactData.getNickname());
    type(By.name("mobile"), newContactData.getMobile());
    click(By.name("theform"));
    type(By.name("email"), newContactData.getEmail());
    click(By.name("bday"));
    new Select(wd.findElement(By.name("bday"))).selectByVisibleText(newContactData.getBday());
    click(By.name("bday"));
    click(By.name("bmonth"));
    new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(newContactData.getBmonth());
    click(By.name("bmonth"));
    type(By.name("byear"), newContactData.getByear());
    type(By.name("homepage"), newContactData.getHomepage());
    type(By.name("company"), newContactData.getCompany());
  }

  public void submitNewContactCreation() {
    click(By.name("submit"));
  }
}
