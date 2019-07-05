/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.herrn.gruvbox.laf;

import eu.herrn.gruvbox.colors.Gruvbox;
import eu.herrn.gruvbox.colors.GruvboxDark;
import eu.herrn.gruvbox.colors.GruvboxLight;
import eu.herrn.gruvbox.colors.GruvboxSolarizedLight;


/**
 *
 * @author mherrn
 */
public enum GruvboxThemeVariant {
  DARK {
    @Override
    public Gruvbox create() {
      return new GruvboxDark();
    }
  },
  LIGHT {
    @Override
    public Gruvbox create() {
      return new GruvboxLight();
    }
  },
  SOLARIZED {
    @Override
    public Gruvbox create() {
      return new GruvboxSolarizedLight();
    }
  },
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

  public abstract Gruvbox create();
}
