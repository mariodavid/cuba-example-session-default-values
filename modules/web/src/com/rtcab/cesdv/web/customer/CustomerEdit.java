package com.rtcab.cesdv.web.customer;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.TextField;
import com.rtcab.cesdv.entity.Customer;
import com.rtcab.cesdv.web.InitWithDefault;
import com.rtcab.cesdv.web.screens.DefaultValues;
import de.balvi.cuba.declarativecontrollers.web.editor.AnnotatableAbstractEditor;
import javax.inject.Named;

public class CustomerEdit extends AnnotatableAbstractEditor<Customer> {


  @InitWithDefault(DefaultValues.NAME)
  @Named("fieldGroup.name")
  protected TextField nameField;
}