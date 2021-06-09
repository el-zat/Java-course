package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;

public class NewContactTests extends TestBase {

  @Test
  public void testNewContact() {
    app.getNavigationHelper().gotoNewContactPage();
    app.getContactHelper().fillNewContactForm(new NewContactData("Ivan", "Ivanov", "Vanya", "322 223 322", "www.ivanov.org", "Amazon"));
    app.getContactHelper().submitNewContactCreation();
  }

}
