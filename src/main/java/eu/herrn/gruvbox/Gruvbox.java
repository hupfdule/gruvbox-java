package eu.herrn.gruvbox;

import java.awt.Color;

public class Gruvbox {
  //                        GRUVCOLR                    HEX                    RELATV ALIAS   TERMCOLOR      RGB           ITERM RGB     OSX HEX
  public static final Color DARK0_HARD     =  new Color(0x1d, 0x20, 0x21); //  [   ]  [   ]   234 [h0][  ]    29- 32- 33    22- 24- 25   #161819
  public static final Color DARK0          =  new Color(0x28, 0x28, 0x28); //  [bg0]  [fg0]   235 [ 0][  ]    40- 40- 40    30- 30- 30   #1e1e1e
  public static final Color DARK0_SOFT     =  new Color(0x32, 0x30, 0x2f); //  [   ]  [   ]   236 [s0][  ]    50- 48- 47    38- 36- 35   #262423
  public static final Color DARK1          =  new Color(0x3c, 0x38, 0x36); //  [bg1]  [fg1]   237 [  ][15]    60- 56- 54    46- 42- 41   #2e2a29
  public static final Color DARK2          =  new Color(0x50, 0x49, 0x45); //  [bg2]  [fg2]   239 [  ][  ]    80- 73- 69    63- 57- 53   #3f3935
  public static final Color DARK3          =  new Color(0x66, 0x5c, 0x54); //  [bg3]  [fg3]   241 [  ][  ]   102- 92- 84    83- 74- 66   #534a42
  public static final Color DARK4          =  new Color(0x7c, 0x6f, 0x64); //  [bg4]  [fg4]   243 [  ][ 7]   124-111-100   104- 92- 81   #685c51

  public static final Color GRAY_245       =  new Color(0x92, 0x83, 0x74); //  [gray] [   ]   245 [ 8][  ]   146-131-116   127-112- 97   #7f7061
  public static final Color GRAY_244       =  new Color(0x92, 0x83, 0x74); //  [   ] [gray]   244 [  ][ 8]   146-131-116   127-112- 97   #7f7061

  public static final Color LIGHT0_HARD    =  new Color(0xf9, 0xf5, 0xd7); //  [   ]  [   ]   230 [  ][h0]   249-245-215   248-244-205   #f8f4cd
  public static final Color LIGHT0         =  new Color(0xfb, 0xf1, 0xc7); //  [fg0]  [bg0]   229 [  ][ 0]   251-241-199   250-238-187   #faeebb
  public static final Color LIGHT0_SOFT    =  new Color(0xf2, 0xe5, 0xbc); //  [   ]  [   ]   228 [  ][s0]   242-229-188   239-223-174   #efdfae
  public static final Color LIGHT1         =  new Color(0xeb, 0xdb, 0xb2); //  [fg1]  [bg1]   223 [15][  ]   235-219-178   230-212-163   #e6d4a3
  public static final Color LIGHT2         =  new Color(0xd5, 0xc4, 0xa1); //  [fg2]  [bg2]   250 [  ][  ]   213-196-161   203-184-144   #cbb890
  public static final Color LIGHT3         =  new Color(0xbd, 0xae, 0x93); //  [fg3]  [bg3]   248 [  ][  ]   189-174-147   175-159-129   #af9f81
  public static final Color LIGHT4         =  new Color(0xa8, 0x99, 0x84); //  [fg4]  [bg4]   246 [ 7][  ]   168-153-132   151-135-113   #978771

  public static final Color BRIGHT_RED     =  new Color(0xfb, 0x49, 0x34); //  [red]   [  ]   167 [ 9][  ]   251- 73- 52   247- 48- 40   #f73028
  public static final Color BRIGHT_GREEN   =  new Color(0xb8, 0xbb, 0x26); //  [green] [  ]   142 [10][  ]   184-187- 38   170-176- 30   #aab01e
  public static final Color BRIGHT_YELLOW  =  new Color(0xfa, 0xbd, 0x2f); //  [yellow][  ]   214 [11][  ]   250-189- 47   247-177- 37   #f7b125
  public static final Color BRIGHT_BLUE    =  new Color(0x83, 0xa5, 0x98); //  [blue]  [  ]   109 [12][  ]   131-165-152   113-149-134   #719586
  public static final Color BRIGHT_PURPLE  =  new Color(0xd3, 0x86, 0x9b); //  [purple][  ]   175 [13][  ]   211-134-155   199-112-137   #c77089
  public static final Color BRIGHT_AQUA    =  new Color(0x8e, 0xc0, 0x7c); //  [aqua]  [  ]   108 [14][  ]   142-192-124   125-182-105   #7db669
  public static final Color BRIGHT_ORANGE  =  new Color(0xfe, 0x80, 0x19); //  [orange][  ]   208 [  ][  ]   254-128- 25   251-106- 22   #fb6a16

  public static final Color NEUTRAL_RED    =  new Color(0xcc, 0x24, 0x1d); //  [   ]  [   ]   124 [ 1][ 1]   204- 36- 29   190- 15- 23   #be0f17
  public static final Color NEUTRAL_GREEN  =  new Color(0x98, 0x97, 0x1a); //  [   ]  [   ]   106 [ 2][ 2]   152-151- 26   134-135- 21   #868715
  public static final Color NEUTRAL_YELLOW =  new Color(0xd7, 0x99, 0x21); //  [   ]  [   ]   172 [ 3][ 3]   215-153- 33   204-136- 26   #cc881a
  public static final Color NEUTRAL_BLUE   =  new Color(0x45, 0x85, 0x88); //  [   ]  [   ]    30 [ 4][ 4]    69-133-136    55-115-117   #377375
  public static final Color NEUTRAL_PURPLE =  new Color(0xb1, 0x62, 0x86); //  [   ]  [   ]   132 [ 5][ 5]   177- 98-134   160- 75-115   #a04b73
  public static final Color NEUTRAL_AQUA   =  new Color(0x68, 0x9d, 0x6a); //  [   ]  [   ]    72 [ 6][ 6]   104-157-106    87-142- 87   #578e57
  public static final Color NEUTRAL_ORANGE =  new Color(0xd6, 0x5d, 0x0e); //  [   ]  [   ]   166 [  ][  ]   214- 93- 14   202- 72- 14   #ca480e

  public static final Color FADED_RED      =  new Color(0x9d, 0x00, 0x06); //  [   ]   [red]   88 [  ][ 9]   157-  0-  6   137-  0-  9   #890009
  public static final Color FADED_GREEN    =  new Color(0x79, 0x74, 0x0e); //  [   ] [green]  100 [  ][10]   121-116- 14   102- 98- 13   #66620d
  public static final Color FADED_YELLOW   =  new Color(0xb5, 0x76, 0x14); //  [   ][yellow]  136 [  ][11]   181-118- 20   165- 99- 17   #a56311
  public static final Color FADED_BLUE     =  new Color(0x07, 0x66, 0x78); //  [   ]  [blue]   24 [  ][12]     7-102-120    14- 83-101   #0e5365
  public static final Color FADED_PURPLE   =  new Color(0x8f, 0x3f, 0x71); //  [   ][purple]   96 [  ][13]   143- 63-113   123- 43- 94   #7b2b5e
  public static final Color FADED_AQUA     =  new Color(0x42, 0x7b, 0x58); //  [   ]  [aqua]   66 [  ][14]    66-123- 88    53-106- 70   #356a46
  public static final Color FADED_ORANGE   =  new Color(0xaf, 0x3a, 0x03); //  [   ][orange]  130 [  ][  ]   175- 58-  3   157- 40-  7   #9d2807
}
