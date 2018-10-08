/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* $Id: FontDetector.java 1356646 2012-07-03 09:46:41Z mehdi $ */


package org.apache.fop.fonts;

import java.util.List;

import org.apache.fop.apps.FOPException;

/**
 * An interface for the font detecting mechanism.
 */

public interface FontDetector {
    void detect(FontManager fontManager, FontAdder fontAdder, boolean strict,
            FontEventListener eventListener, List<EmbedFontInfo> fontInfoList) throws FOPException;
}
