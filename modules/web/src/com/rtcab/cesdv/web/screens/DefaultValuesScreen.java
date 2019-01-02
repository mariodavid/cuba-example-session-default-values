package com.rtcab.cesdv.web.screens;

import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.security.global.UserSession;
import java.io.Serializable;
import java.util.Map;
import javax.inject.Inject;

public class DefaultValuesScreen extends AbstractWindow {

  @Inject
  protected UserSession userSession;

  @Inject
  protected PickerField customerField;

  @Inject
  protected TextField nameField;

  @Inject
  protected DateField dueDateField;

  @Override
  public void init(Map<String, Object> params) {
    super.init(params);


    nameField.setValue(userSession.getAttribute(DefaultValues.NAME));
    dueDateField.setValue(userSession.getAttribute(DefaultValues.DUE_DATE));
    customerField.setValue(userSession.getAttribute(DefaultValues.CUSTOMER));

  }

  public void save() {
    saveValueToSession(DefaultValues.NAME, nameField.getValue());
    saveValueToSession(DefaultValues.CUSTOMER, customerField.getValue());
    saveValueToSession(DefaultValues.DUE_DATE, dueDateField.getValue());

    close(COMMIT_ACTION_ID, true);
  }

  private void saveValueToSession(String attributeName, Serializable attributeValue) {
    if (attributeValue != null) {
      userSession.setAttribute(attributeName, attributeValue);
    }
    else {
      userSession.removeAttribute(attributeName);
    }
  }


  public void cancel() {
    close(CLOSE_ACTION_ID);
  }
}