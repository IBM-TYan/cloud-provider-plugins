/*
 * Copyright International Business Machines Corp, 2020
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.ibm.spectrum.cyclecloud.model;

import java.util.Map;

import com.ibm.spectrum.cyclecloud.util.ProvUtil;

/**
* @Class Name : ProvApis
* @Description: Provider APIs
* @Author     : Yudong (Dom) Wang
* @Date       : 2019-6-11 9:22:47
* @Version    : V1.0
*/
public class ProvApis {
    private Map<Integer, ProvApi> apis;

    public Map<Integer, ProvApi> getApis() {
        return apis;
    }

    public void setApis(Map<Integer, ProvApi> apis) {
        this.apis = apis;
    }

    @Override
    public String toString() {
        return ProvUtil.toJsonStr(this);
    }
}
