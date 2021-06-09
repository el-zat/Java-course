package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.NewContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(ChromeDriver wd) {
    super(wd);
  }

  public void fillNewContactForm(NewContactData newContactData) {
    type(By.name("firstname"), newContactData.getFirstname());
    type(By.name("lastname"), newContactData.getLastname());
    type(By.name("nickname"), newContactData.getNickname());
    type(By.name("mobile"), newContactData.getMobile());
    type(By.name("homepage"), newContactData.getHomepage());
    type(By.name("company"), newContactData.getCompany());
  }

  public void submitNewContactCreation() {
    click(By.name("submit"));
  }

  public void selectContact() {
    click(By.id("7"));
  }

  public void editContact() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void submitContactModification() {
    click(By.xpath("//input[@name='update']"));
  }

  public void contactDeletion() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public void alert() {
    wd.switchTo().alert().accept();
  }
}