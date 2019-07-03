package eu.herrn.gruvbox;

import java.util.logging.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.MetalTheme;

/**
 *
 * @author mherrn
 */
public class GruvboxLookAndFeel extends MetalLookAndFeel {
  private static final Logger LOGGER= Logger.getLogger(GruvboxLookAndFeel.class.getName());

  /////////////////////////////////////////////////////////////////////////////
  //
  // Attributes

  /////////////////////////////////////////////////////////////////////////////
  //
  // Constructors

  /////////////////////////////////////////////////////////////////////////////
  //
  // Methods

  @Override
  public String getName() {
    return "Gruvbox";
  }

  @Override
  protected void createDefaultTheme() {
    setCurrentTheme(createDefaultGruvboxTheme());
  }

  private MetalTheme createDefaultGruvboxTheme() {
    final String defaultContrast= System.getProperty(SystemProperties.CONTRAST);
    GruvboxThemeContrast contrast= GruvboxThemeContrast.get(defaultContrast);
    if (contrast == null) {
      contrast= GruvboxThemeContrast.MEDIUM;
    }

    final String defaultThemeName= System.getProperty(SystemProperties.THEME);
    GruvboxThemeVariant variant = GruvboxThemeVariant.get(defaultThemeName);
    if (variant == null) {
      variant= GruvboxThemeVariant.DARK;
    }

    return new GruvboxTheme(variant, contrast);
  }

}
