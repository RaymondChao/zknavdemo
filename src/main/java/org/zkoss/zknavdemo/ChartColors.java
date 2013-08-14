package org.zkoss.zknavdemo;

import java.awt.Color;

import org.apache.commons.lang.StringUtils;
 
public class ChartColors {
    //main colors
    public static Color COLOR_1 = new Color(0x3E454C);
    public static Color COLOR_2 = new Color(0x2185C5);
    public static Color COLOR_3 = new Color(0x7ECEFD);
    public static Color COLOR_4 = new Color(0xFFF6E5);
    public static Color COLOR_5 = new Color(0xFF7F66);
    //additional colors
    public static Color COLOR_6 = new Color(0x98D9FF);
    public static Color COLOR_7 = new Color(0x4689B1);
    public static Color COLOR_8 = new Color(0xB17C35);
    public static Color COLOR_9 = new Color(0xFDC77E);
     
    public static String toHtmlColor(Color color) {
        return "#" + toHexColor(color);
    }
 
    public static String toHexColor(Color color) {
        return StringUtils.leftPad(Integer.toHexString(color.getRGB() & 0xFFFFFF), 6, '0');
    }
     
}