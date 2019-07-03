/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.herrn.gruvbox;


/**
 *
 * @author mherrn
 */
public enum GruvboxThemeVariant {
  DARK,
  LIGHT,
  ;

  // FIXME: compare case insensitive?
  public static GruvboxThemeVariant get(final String name) {
    if (name == null) {
      return null;
    }

    for (final GruvboxThemeVariant v : values()) {
      if (v.name().equals(name)) {
        return v;
      }
    }

    return null;
  }
}
