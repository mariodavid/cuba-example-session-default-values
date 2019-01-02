package com.rtcab.cesdv.web.default_values;

import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.Component.HasValue;

public class DefaultValueConfiguration {

  private Component.HasValue field;
  private String sessionAttributeName;

  public DefaultValueConfiguration(HasValue field, String sessionAttributeName) {
    this.field = field;
    this.sessionAttributeName = sessionAttributeName;
  }

  public HasValue getField() {
    return field;
  }

  public void setField(HasValue field) {
    this.field = field;
  }

  public String getSessionAttributeName() {
    return sessionAttributeName;
  }

  public void setSessionAttributeName(String sessionAttributeName) {
    this.sessionAttributeName = sessionAttributeName;
  }
}
