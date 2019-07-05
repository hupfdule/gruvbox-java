
package eu.herrn.gruvbox.colors;

import java.awt.Color;
import javax.swing.plaf.ColorUIResource;
import static eu.herrn.gruvbox.colors.ColorHelper.*;

/**
 *
 * @author mherrn
 */
public class GruvboxSolarizedLight extends GruvboxLight {

  public static final ColorUIResource bg0          = new ColorUIResource(new Color(0xfd, 0xf6, 0xe3));
  public static final ColorUIResource bg1          = new ColorUIResource(new Color(0xee, 0xe8, 0xd5));


  @Override
  public ColorUIResource getBg() {
    return bg0;
  }


//  @Override
//  public ColorUIResource getBg0() {
//    //return bg1;
//    return new ColorUIResource(Color.PINK);
//  }


  @Override
  public ColorUIResource getBg1() {
    //return new ColorUIResource(bg1);
    return new ColorUIResource(slightlyBrighter(super.getBg1()));
  }


}
