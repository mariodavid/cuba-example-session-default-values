package com.rtcab.cesdv.web.default_values;

import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.security.global.UserSession;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

public class DefaultValuesScreen extends AbstractWindow {

  @Inject
  protected UserSession userSession;

  private List<DefaultValueConfiguration> defaultValueConfigurations = new LinkedList<>();


  protected void addToDefaultValues(HasValue field, String sessionName) {

    defaultValueConfigurations.add(new DefaultValueConfiguration(field, sessionName));

    field.setValue(userSession.getAttribute(sessionName));
  }

  public void save() {

    for (DefaultValueConfiguration defaultValueConfiguration : defaultValueConfigurations) {
      saveValueToSession(defaultValueConfiguration.getSessionAttributeName(),
          defaultValueConfiguration.getField().getValue());
    }

    close(COMMIT_ACTION_ID, true);
  }

  private void saveValueToSession(String attributeName, Serializable attributeValue) {
    if (attributeValue != null) {
      userSession.setAttribute(attributeName, attributeValue);
    } else {
      userSession.removeAttribute(attributeName);
    }
  }


  public void cancel() {
    close(CLOSE_ACTION_ID);
  }
}