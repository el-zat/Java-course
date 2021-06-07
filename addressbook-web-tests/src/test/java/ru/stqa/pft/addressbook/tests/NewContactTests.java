package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;

public class NewContactTests extends TestBase {

  @Test
  public void testNewContact() {
    app.gotoNewContactPage();
    app.fillNewContactForm(new NewContactData("Ivan", "Ivanov", "Vanya", "322 223 322", "ivan_ivanov@mail.com", "1", "January", "1980", "www.ivanov.org", "Amazon"));
    app.submitNewContactCreation();
  }

}
