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

/* $Id: PDFExtensionEventProducer.java 1603596 2014-06-18 19:28:32Z vhennebert $ */

package org.apache.fop.render.pdf.extensions;

import org.xml.sax.Locator;

import org.apache.fop.events.EventProducer;

public interface PDFExtensionEventProducer extends EventProducer {

    /** Reserved keyword.
     *
     * @param source the object source
     * @param locator the location in the source
     * @param keyword the offending keyword
     * @event.severity ERROR
     */
    void reservedKeyword(Object source, Locator locator, String keyword);

}
