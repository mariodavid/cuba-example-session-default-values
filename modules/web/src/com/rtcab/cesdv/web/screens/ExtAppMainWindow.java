package com.rtcab.cesdv.web.screens;

import com.haulmont.cuba.gui.WindowManager.OpenType;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;

public class ExtAppMainWindow extends AppMainWindow {

  public void openDefaultValuesScreen() {
    openWindow("default-values-screen", OpenType.DIALOG);
  }
}