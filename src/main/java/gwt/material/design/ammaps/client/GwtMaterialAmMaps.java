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
package gwt.material.design.ammaps.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import gwt.material.design.amcharts.client.StartupState;
import gwt.material.design.ammaps.client.resources.MapClientBundle;
import gwt.material.design.client.MaterialDesignBase;

public class GwtMaterialAmMaps implements EntryPoint {

    private static StartupState startupState;

    private static void checkStartupState() {
        if (startupState == null) {
            startupState = GWT.create(StartupState.class);
        }
    }

    public static StartupState getStartupState() {
        checkStartupState();
        return startupState;
    }

    public static boolean isDebug() {
        return GwtMaterialAmMaps.getStartupState() instanceof StartupState.DebugState;
    }

    @Override
    public void onModuleLoad() {
        // Initialize the startup state.
        checkStartupState();

        // Inject Am4chart resources
        MaterialDesignBase.injectDebugJs(MapClientBundle.INSTANCE.mapJs());

        //TODO: Move
        MaterialDesignBase.injectDebugJs(MapClientBundle.INSTANCE.worldLowJs());
    }
}