package org.gwtproject.editor.processor.test02;

import org.gwtproject.editor.processor.common.EditorBeanWithInterface;
import org.gwtproject.editor.processor.common.WidgetImplementsAsEditor;
import org.gwtproject.editor.client.annotation.IsDriver;
import org.gwtproject.editor.client.Editor;
import org.gwtproject.editor.client.SimpleBeanEditorDriver;

public class TestEditor02 implements Editor<EditorBeanWithInterface> {
  
  private Driver driver;
  
  @IsDriver
  interface Driver
      extends SimpleBeanEditorDriver<EditorBeanWithInterface, TestEditor02> {
    
  }
  
  WidgetImplementsAsEditor id;
  WidgetImplementsAsEditor label;
  
  public TestEditor02() {
    driver = new TestEditor02_Driver_Impl();
    driver.initialize(this);
  }
  
}