package gwt.material.design.amcharts.client.ui.chart;

import gwt.material.design.amcharts.client.ui.chart.base.Container;
import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import gwt.material.design.amcharts.client.ui.chart.base.Percent;
import gwt.material.design.amcharts.client.ui.chart.datafields.chart.IRadarChartDataFields;
import gwt.material.design.amcharts.client.ui.chart.series.RadarSeries;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class RadarChart extends XYChart {

    @JsProperty
    public Number endAngle;

    /**
     * Accepts {@link Number} or {@link Percent}
     */
    @JsProperty
    public Object innerRadius;

    @JsProperty
    public Number pixelInnerRadius;

    @JsProperty
    public Container radarContainer;

    /**
     * Accepts {@link Number} or {@link Percent}
     */
    @JsProperty
    public Object radius;

    @JsProperty
    public Number startAngle;

    @JsProperty
    public IRadarChartDataFields dataFields;

    @JsProperty
    public ListTemplate<RadarSeries> series;
}
