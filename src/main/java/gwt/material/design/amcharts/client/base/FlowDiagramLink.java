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
package gwt.material.design.amcharts.client.base;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class FlowDiagramLink extends Container {

    @JsProperty
    public ListTemplate<Bullet> bullets;

    @JsProperty
    public Container bulletsContainer;

    @JsProperty
    public Sprite bulletsMask;

    /**
     * @see gwt.material.design.amcharts.client.constants.ColorMode
     */
    @JsProperty
    public String colorMode;

    @JsProperty
    public Number endAngle;

    @JsProperty
    public LinearGradient gradient;

    @JsProperty
    public Sprite link;

    @JsProperty
    public boolean maskBullets;

    /**
     * Accepts {@link Line} or {@link PolyLine}
     */
    @JsProperty
    public Object middleLine;

    @JsProperty
    public Number startAngle;

    @JsProperty
    public Number tooltipLocation;

    @JsMethod
    public native void copyFrom(FlowDiagramLink source);
}