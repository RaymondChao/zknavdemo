package org.zkoss.zknavdemo;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.PieModel;
	 
public class CatVM {
 
    PieChartEngine engine;
    PieModel model;
    boolean threeD = false;
    String message;
     
    @Init
    public void init() {
        // prepare chart data
        engine = new PieChartEngine();
 
        model = PieChartData.getModel();
    }
 
    public PieChartEngine getEngine() {
        return engine;
    }
 
    public PieModel getModel() {
        return model;
    }
 
    @GlobalCommand("dataChanged") 
    @NotifyChange("model")
    public void onDataChanged(
            @BindingParam("category")String category,
            @BindingParam("num") Number num){
        model.setValue(category, num);
    }

}