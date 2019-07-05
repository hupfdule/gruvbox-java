package eu.herrn.gruvbox.laf;



/**
 *
 * @author mherrn
 */
public enum GruvboxThemeContrast {
  HIGH,
  MEDIUM,
  LOW,
  ;



  // FIXME: compare case insensitive?
  public static GruvboxThemeContrast get(final String name) {
    if (name == null) {
      return null;
    }

    for (final GruvboxThemeContrast v : values()) {
      if (v.name().equals(name)) {
        return v;
      }
    }

    return null;
  }
}
