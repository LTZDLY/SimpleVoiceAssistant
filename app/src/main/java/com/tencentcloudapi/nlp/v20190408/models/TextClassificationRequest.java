/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextClassificationRequest extends AbstractModel{

    /**
    * 待分类的文本（仅支持UTF-8格式，不超过10000字）
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 领域分类体系（默认取1值）：
1、通用领域，二分类
2、新闻领域，五分类。类别数据不一定全部返回，详情见类目映射表（注意：目前五分类已下线不可用）
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
     * Get 待分类的文本（仅支持UTF-8格式，不超过10000字） 
     * @return Text 待分类的文本（仅支持UTF-8格式，不超过10000字）
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 待分类的文本（仅支持UTF-8格式，不超过10000字）
     * @param Text 待分类的文本（仅支持UTF-8格式，不超过10000字）
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 领域分类体系（默认取1值）：
1、通用领域，二分类
2、新闻领域，五分类。类别数据不一定全部返回，详情见类目映射表（注意：目前五分类已下线不可用） 
     * @return Flag 领域分类体系（默认取1值）：
1、通用领域，二分类
2、新闻领域，五分类。类别数据不一定全部返回，详情见类目映射表（注意：目前五分类已下线不可用）
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set 领域分类体系（默认取1值）：
1、通用领域，二分类
2、新闻领域，五分类。类别数据不一定全部返回，详情见类目映射表（注意：目前五分类已下线不可用）
     * @param Flag 领域分类体系（默认取1值）：
1、通用领域，二分类
2、新闻领域，五分类。类别数据不一定全部返回，详情见类目映射表（注意：目前五分类已下线不可用）
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    public TextClassificationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextClassificationRequest(TextClassificationRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Flag != null) {
            this.Flag = new Long(source.Flag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Flag", this.Flag);

    }
}

