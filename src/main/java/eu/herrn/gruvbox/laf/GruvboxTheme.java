/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.herrn.gruvbox.laf;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;


/**
 *
 * @author mherrn
 */
public class GruvboxTheme extends MetalTheme {

  private final GruvboxThemeVariant variant;

  private final GruvboxThemeContrast contrast;


  public GruvboxTheme(final GruvboxThemeVariant variant, final GruvboxThemeContrast contrast) {
    this.variant = variant;
    this.contrast = contrast;
  }


  @Override
  public String getName() {
    // TODO: variant + contrast to CamelCase
    return "Gruvbox " + this.variant + " " + this.contrast;
  }


  @Override
  protected ColorUIResource getPrimary1() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


  @Override
  protected ColorUIResource getPrimary2() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


  @Override
  protected ColorUIResource getPrimary3() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


  @Override
  protected ColorUIResource getSecondary1() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


  @Override
  protected ColorUIResource getSecondary2() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


  @Override
  protected ColorUIResource getSecondary3() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


  @Override
  public FontUIResource getControlTextFont() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


  @Override
  public FontUIResource getSystemTextFont() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


  @Override
  public FontUIResource getUserTextFont() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


  @Override
  public FontUIResource getMenuTextFont() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


  @Override
  public FontUIResource getWindowTitleFont() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


  @Override
  public FontUIResource getSubTextFont() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


}
