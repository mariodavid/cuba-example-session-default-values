package com.rtcab.cesdv.web.default_values;

import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.TextField;
import java.util.Map;
import javax.inject.Inject;

public class ApplicationDefaultValuesScreen extends DefaultValuesScreen {

  @Inject
  protected PickerField customerField;

  @Inject
  protected TextField nameField;

  @Inject
  protected DateField dueDateField;

  @Override
  public void init(Map<String, Object> params) {
    super.init(params);

    addToDefaultValues(nameField, DefaultValues.NAME);
    addToDefaultValues(dueDateField, DefaultValues.DUE_DATE);
    addToDefaultValues(customerField, DefaultValues.CUSTOMER);

  }
}