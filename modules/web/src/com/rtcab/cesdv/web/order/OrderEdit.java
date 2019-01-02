package com.rtcab.cesdv.web.order;

import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.PickerField;
import com.rtcab.cesdv.entity.Order;
import com.rtcab.cesdv.web.default_values.InitWithDefault;
import com.rtcab.cesdv.web.default_values.DefaultValues;
import de.balvi.cuba.declarativecontrollers.web.editor.AnnotatableAbstractEditor;
import javax.inject.Named;

public class OrderEdit extends AnnotatableAbstractEditor<Order> {



  @InitWithDefault(DefaultValues.CUSTOMER)
  @Named("fieldGroup.customer")
  protected PickerField customerField;

  @InitWithDefault(DefaultValues.DUE_DATE)
  @Named("fieldGroup.dueDate")
  protected DateField dueDateField;
}