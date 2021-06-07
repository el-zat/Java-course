package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;

public class NewContactModificationTests extends TestBase {

  @Test
  public void newContactModification() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().editContact();
    app.getContactHelper().fillNewContactForm(new NewContactData("Petr", "Petrov", "Petya", "7892 553 782", "www.petrov.org", "Google"));
    app.getContactHelper().submitContactModification();
  }
}

