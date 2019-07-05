/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.herrn.gruvbox.colors;

import java.awt.Color;


/**
 *
 * @author mherrn
 */
public class ColorHelper {

  public static Color slightlyDarker(final Color c) {
    final float factor= 0.85f;
        return new Color(Math.max((int)(c.getRed()  *factor), 0),
                         Math.max((int)(c.getGreen()*factor), 0),
                         Math.max((int)(c.getBlue() *factor), 0),
                         c.getAlpha());
    }


  public static Color slightlyBrighter(final Color c) {
    final float factor= 0.85f;
        return new Color(Math.min((int)(c.getRed()  /factor), 255),
                         Math.min((int)(c.getGreen()/factor), 255),
                         Math.min((int)(c.getBlue() /factor), 255),
                         c.getAlpha());
    }
}
