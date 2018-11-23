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
package gwt.material.design.amcharts.client;

import gwt.material.design.amcharts.client.axis.ValueAxis;
import gwt.material.design.amcharts.client.base.ColorSet;
import gwt.material.design.amcharts.client.base.ListTemplate;
import gwt.material.design.amcharts.client.base.NavigationBar;
import gwt.material.design.amcharts.client.datafields.chart.ITreeMapDataFields;
import gwt.material.design.amcharts.client.dictionary.DictionaryTemplate;
import gwt.material.design.amcharts.client.series.TreeMapSeries;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class TreeMap extends XYChart {

    @JsProperty
    public ColorSet colors;

    @JsProperty
    public Number currentLevel;

    //TODO: TreeMapDataItem currentlyZoomed

    @JsProperty
    public String homeText;

    @JsProperty
    public Object layoutAlgorithm;

    @JsProperty
    public Number maxLevels;

    @JsProperty
    public NavigationBar navigationBar;

    @JsProperty
    public DictionaryTemplate<TreeMapSeries> seriesTemplates;

    /**
     * @see gwt.material.design.amcharts.client.constants.Sorting
     */
    @JsProperty
    public String sorting;

    @JsProperty
    public ValueAxis xAxis;

    @JsProperty
    public ValueAxis yAxis;

    @JsProperty
    public boolean zoomable;

    @JsProperty
    public ITreeMapDataFields dataFields;

    @JsProperty
    public ListTemplate<TreeMapSeries> series;

    //TODO
    /*@JsMethod
    public native void zoomToSeriesDataItem(TreeMapSeriesDataItem dataItem);*/
}