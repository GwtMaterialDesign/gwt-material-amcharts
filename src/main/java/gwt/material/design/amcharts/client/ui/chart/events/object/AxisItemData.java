/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.amcharts.client.ui.chart.events.object;

import gwt.material.design.amcharts.client.ui.chart.js.AmRectangularChart;
import gwt.material.design.amcharts.client.ui.chart.js.options.AmAxisBase;
import gwt.material.design.amcharts.client.ui.chart.js.options.SerialDataItem;
import gwt.material.design.amcharts.client.ui.chart.js.options.Label;
import gwt.material.design.jquery.client.api.MouseEvent;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AxisItemData {

    @JsProperty
    private AmAxisBase axisBase;

    @JsProperty
    private Label target;

    @JsProperty
    private AmRectangularChart chart;

    @JsProperty
    private MouseEvent event;

    @JsProperty
    private String type;

    @JsProperty
    private Object value;

    @JsProperty
    private SerialDataItem serialDataItem;

    @JsOverlay
    public final String getType() {
        return type;
    }

    @JsOverlay
    public final Object getValue() {
        return value;
    }

    @JsOverlay
    public final SerialDataItem getSerialDataItem() {
        return serialDataItem;
    }

    @JsOverlay
    public final AmAxisBase getAxisBase() {
        return axisBase;
    }

    @JsOverlay
    public final Label getTarget() {
        return target;
    }

    @JsOverlay
    public final AmRectangularChart getChart() {
        return chart;
    }

    @JsOverlay
    public final MouseEvent getEvent() {
        return event;
    }
}
