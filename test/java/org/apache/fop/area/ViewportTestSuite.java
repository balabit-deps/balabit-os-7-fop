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

/* $Id: ViewportTestSuite.java 1551536 2013-12-17 13:15:06Z vhennebert $ */

package org.apache.fop.area;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.apache.fop.area.inline.InlineViewportTestCase;

/**
 * A suite of all the tests relating to the {@linkplain Viewport} interface.
 */
@RunWith(Suite.class)
@SuiteClasses({
    RegionViewportTestCase.class,
    BlockViewportTestCase.class,
    InlineViewportTestCase.class
})
public final class ViewportTestSuite {
}
