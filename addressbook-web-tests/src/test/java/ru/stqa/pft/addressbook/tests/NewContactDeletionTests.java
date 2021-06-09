
package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;


public class NewContactDeletionTests extends TestBase {

  @Test
  public void newContactDeletion() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().contactDeletion();
    app.getContactHelper().alert();

  }
}