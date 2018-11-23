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
package gwt.material.design.amcharts.client.dataitem;

import gwt.material.design.amcharts.client.animation.Animation;
import gwt.material.design.amcharts.client.base.BaseObjectsEvents;
import gwt.material.design.amcharts.client.base.Sprite;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Date;

@JsType(isNative = true, namespace = "am4charts")
public class DataItem extends BaseObjectsEvents {

    //TODO: adapter

    @JsProperty
    public Animation[] animations;

    @JsProperty
    public Object categories;

    @JsProperty
    public Object dataContext;

    @JsProperty
    public Object dates;

    @JsProperty
    public Number depth;

    @JsProperty
    public boolean hasProperties;

    @JsProperty
    public boolean hidden;

    @JsProperty
    public boolean ignoreMinMax;

    @JsProperty
    public Number index;

    @JsProperty
    public boolean isHiding;

    @JsProperty
    public boolean isTemplate;

    @JsProperty
    public Object locations;

    @JsProperty
    public Number opacity;

    @JsProperty
    public DataItem parent;

    @JsProperty
    public Object properties;

    @JsProperty
    public Sprite[] sprites;

    @JsProperty
    public Object values;

    @JsProperty
    public boolean visible;

    @JsProperty
    public Object workingLocations;

    //TODO: animate

    @JsMethod
    public native void dispose();

    @JsMethod
    public native Date getDate(String name);

    @JsMethod
    public native Number getDuration();

    @JsMethod
    public native Number getDuration(Number duration);

    @JsMethod
    public native Number getValue(String name);

    /**
     * @param calculatedValue @see {@link gwt.material.design.amcharts.client.constants.CalculatedValue}
     */
    @JsMethod
    public native Number getValue(String name, String calculatedValue);

    @JsMethod
    public native Number getWorkingValue(String name);

    @JsMethod
    public native Animation hide();

    @JsMethod
    public native Animation hide(Number duration, Number delay, Number toValue, String[] fields);

    @JsMethod
    public native void setCalculatedValue(String name, Number value);

    /**
     * @param calculatedValue @see {@link gwt.material.design.amcharts.client.constants.CalculatedValue}
     */
    @JsMethod
    public native void setCalculatedValue(String name, Number value, String calculatedValue);

    @JsMethod
    public native void setCategory(String name, String value);

    @JsMethod
    public native void setDate(String name, Date date);

    @JsMethod
    public native void setDate(String name, Date date, Number duration);

    @JsMethod
    public native void setLocation(String name, Number value);

    @JsMethod
    public native void setLocation(String name, Number value, Number duration, Number delay);

    @JsMethod
    public native void setProperty(String name, Object value);

    @JsMethod
    public native void setValue(String name, Number value);

    @JsMethod
    public native void setValue(String name, Number value, Number duration, Number delay);

    @JsMethod
    public native void setVisibility(boolean value);

    @JsMethod
    public native void setVisibility(boolean value, boolean noChangeValues);

    @JsMethod
    public native void setWorkingLocation(String name, Number value);

    @JsMethod
    public native void setWorkingLocation(String name, Number value, Number duration, Number delay);

    @JsMethod
    public native void setWorkingValue(String name, Number value);

    @JsMethod
    public native void setWorkingValue(String name, Number value, Number duration, Number delay);

    @JsMethod
    public native void show();

    @JsMethod
    public native void show(Number duration, Number delay, String[] fields);
}