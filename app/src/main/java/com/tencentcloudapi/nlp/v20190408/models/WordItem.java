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

public class WordItem extends AbstractModel{

    /**
    * 词条文本内容。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 词条创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 词条的词性。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pos")
    @Expose
    private String Pos;

    /**
     * Get 词条文本内容。 
     * @return Text 词条文本内容。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 词条文本内容。
     * @param Text 词条文本内容。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 词条创建时间。 
     * @return CreateTime 词条创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 词条创建时间。
     * @param CreateTime 词条创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 词条的词性。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pos 词条的词性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPos() {
        return this.Pos;
    }

    /**
     * Set 词条的词性。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pos 词条的词性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPos(String Pos) {
        this.Pos = Pos;
    }

    public WordItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WordItem(WordItem source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Pos != null) {
            this.Pos = new String(source.Pos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Pos", this.Pos);

    }
}

