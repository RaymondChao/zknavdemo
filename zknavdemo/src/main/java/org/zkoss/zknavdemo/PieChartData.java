package org.zkoss.zknavdemo;

import org.zkoss.zul.PieModel;
import org.zkoss.zul.SimplePieModel;
 
public class PieChartData {
 
    public static PieModel getModel(){
        PieModel model = new SimplePieModel();
        model.setValue("Window", new Double(21.2));
        model.setValue("Bed", new Double(10.2));
        model.setValue("Closet", new Double(40.4));
        model.setValue("Stairs", new Double(28.2));
        return model;
    }
}