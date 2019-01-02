package com.rtcab.cesdv.web.action;

import com.haulmont.cuba.core.global.PersistenceHelper;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.components.Component.HasValue;
import com.haulmont.cuba.gui.components.Window.Editor;
import com.rtcab.cesdv.web.InitWithDefault;
import de.balvi.cuba.declarativecontrollers.web.annotationexecutor.editor.EditorFieldAnnotationExecutor;
import java.lang.annotation.Annotation;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Component;

@Component("cesdv$InitWithDefaultEditorAnnotationExecutor")
public class InitWithDefaultEditorAnnotationExecutor implements
    EditorFieldAnnotationExecutor<InitWithDefault, HasValue> {


  @Inject
  protected UserSessionSource userSessionSource;

  @SuppressWarnings("Instanceof")
  public boolean supports(Annotation annotation) {
    return annotation instanceof InitWithDefault;
  }

  @Override
  public void init(InitWithDefault annotation, Editor editor, HasValue target,
      Map<String, Object> params) {

  }

  @Override
  public void postInit(InitWithDefault annotation, Editor editor, HasValue target) {

    if (PersistenceHelper.isNew(editor.getItem())) {
      target.setValue(userSessionSource.getUserSession().getAttribute(annotation.value()));
    }

  }
}
