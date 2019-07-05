/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.herrn.gruvbox.laf;

import eu.herrn.gruvbox.colors.Gruvbox;
import eu.herrn.gruvbox.colors.GruvboxDark;
import eu.herrn.gruvbox.colors.GruvboxLight;
import java.awt.Color;
import java.awt.Font;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;


/**
 *
 * @author mherrn
 */
public class GruvboxTheme extends MetalTheme {
  private static final Logger LOGGER= Logger.getLogger(GruvboxTheme.class.getName());

  private final static FontUIResource DEFAULT_FONT = new FontUIResource("Dialog", Font.PLAIN, 11); //NOI18N

  private final GruvboxThemeVariant variant;

  private final GruvboxThemeContrast contrast;

  private final Gruvbox gruvbox;


  public GruvboxTheme(final GruvboxThemeVariant variant, final GruvboxThemeContrast contrast) {
    Objects.requireNonNull(variant);
    Objects.requireNonNull(contrast);
    this.variant= variant;
    this.contrast= contrast;
    switch (variant) {
      case DARK:
        this.gruvbox= new GruvboxDark();
        break;
      case LIGHT:
        this.gruvbox= new GruvboxLight();
        break;
      default:
        LOGGER.log(Level.WARNING, "Invalid variant {0}. Using {1} instead.", new Object[]{variant, GruvboxThemeVariant.DARK});
        this.gruvbox= new GruvboxDark();
        break;
    }
  }


  @Override
  public String getName() {
    // TODO: variant + contrast to CamelCase
    return "Gruvbox " + this.variant + " " + this.contrast;
  }



  @Override
  protected ColorUIResource getPrimary1() {
    // used for
    //  - one side of separators
    //  - folder icons tab
    //  - border of internal frame
    //  - some knobs contrast
    //  - border around expanded menu
    return this.gruvbox.getFg4();
  }


  @Override
  protected ColorUIResource getPrimary2() {
    // used for
    //  - selected menu entry
    //  - selected entry in combo box
    //  - active slider
    //  - border around caption on focused component
    return this.gruvbox.getBg2();
  }


  @Override
  protected ColorUIResource getPrimary3() {
    // used for
    //  - base color of folder icons
    //  - lines in Jtree
    //  - tooltip background
    //  - selection background in tables and lists
    //  - activated JInternalFrame
    return this.gruvbox.getBg3();
  }


  @Override
  protected ColorUIResource getSecondary1() {
    // used for:
    //  - borders (or border shadows)
    //  - ripple effect in tab bars and internal frames
    return this.gruvbox.getGray();
  }


  @Override
  protected ColorUIResource getSecondary2() {
    // used for:
    //  - deactivated tabs
    //  - border between menu bar and main panel
    //  - part of border of sliders
    //  - grid lines in tables
    //  - activated toggle buttons
    //  - pressed down buttons
    return this.gruvbox.getFg4();
  }


  @Override
  protected ColorUIResource getSecondary3() {
    // used for:
    //  - menubar background
    //  - toolbar background
    //  - JInternalFrame titlebar background

    return this.gruvbox.getBg1();
  }


  @Override
  public ColorUIResource getWindowBackground() {
    // used for:
    //  - background of
    //    - tables
    //    - trees
    //    - text fields
    //    - text areas
    switch(this.contrast) {
      case HIGH: this.gruvbox.getBgHard();
      case MEDIUM: return this.gruvbox.getBg();
      case LOW: return this.gruvbox.getBgSoft();
      default:
        LOGGER.log(Level.WARNING, "Invalid contrast {0}. Using {1} instead.", new Object[]{variant, GruvboxThemeContrast.MEDIUM});
        return this.gruvbox.getBg1();
    }
  }


  @Override
  public ColorUIResource getControl() {
    // used for:
    //  - panels
    //  - buttons
    //  - activated tabs
    //  - table headers
    return this.gruvbox.getBg1();
  }


  @Override
  public ColorUIResource getControlTextColor() {
    // used for:
    //  - text on controls (but not in trees, lists, but also in tables)
    return this.gruvbox.getFg();
  }


  @Override
  public ColorUIResource getControlHighlight() {
    // used for:
    //  - shadowed borders (sun on upper left)
    //  - slider handle
    return super.getControlHighlight();
  }


  @Override
  public ColorUIResource getControlInfo() {
    // used for:
    //  - Dropdown-Button in ComboBox
    //  - upper part of Slider component
    return this.getControlTextColor();
  }


  @Override
  public ColorUIResource getControlDarkShadow() {
    // used for:
    //  - lightened borders (sun on upper left)
    //  - border around selected menu
    return this.gruvbox.getBg4();
  }


  @Override
  public ColorUIResource getControlShadow() {
    // used for:
    //  - inactive tabs
    //  - pressed buttons
    //  - table grid lines
    //  - separator between menu and main panel
    //  - border of disabled elements
    return this.gruvbox.getBg2();
  }



  @Override
  public ColorUIResource getFocusColor() {
    // used for:
    //  - border around text on focused element
    return this.gruvbox.getBg4();
  }


  @Override
  public FontUIResource getControlTextFont() {
    return DEFAULT_FONT;
  }


  @Override
  public FontUIResource getSystemTextFont() {
    return DEFAULT_FONT;
  }


  @Override
  public FontUIResource getUserTextFont() {
    return DEFAULT_FONT;
  }


  @Override
  public FontUIResource getMenuTextFont() {
    return DEFAULT_FONT;
  }


  @Override
  public FontUIResource getWindowTitleFont() {
    return DEFAULT_FONT;
  }


  @Override
  public FontUIResource getSubTextFont() {
    return DEFAULT_FONT;
  }


}
