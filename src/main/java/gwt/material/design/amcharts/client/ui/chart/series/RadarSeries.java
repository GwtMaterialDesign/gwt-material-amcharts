package gwt.material.design.amcharts.client.ui.chart.series;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class RadarSeries extends LineSeries {

    @JsProperty
    public boolean connectEnds;
}