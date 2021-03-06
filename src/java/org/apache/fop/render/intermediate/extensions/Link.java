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

/* $Id: Link.java 746664 2009-02-22 12:40:44Z jeremias $ */

package org.apache.fop.render.intermediate.extensions;

import java.awt.Rectangle;

/**
 * This class is a link element for use in the intermediate format.
 */
public class Link {

    private AbstractAction action;
    private Rectangle targetRect;

    /**
     * Creates a new named destination.
     * @param action the action performed when the destination is selected
     * @param targetRect the target rectangle (coordinates in millipoints)
     */
    public Link(AbstractAction action, Rectangle targetRect) {
        this.action = action;
        this.targetRect = targetRect;
    }

    /**
     * Returns the action performed when the destination is selected.
     * @return the action
     */
    public AbstractAction getAction() {
        return this.action;
    }

    /**
     * Returns the target rectangle, i.e. the hot zone in which the link is activated.
     * @return the target rectangle
     */
    public Rectangle getTargetRect() {
        return new Rectangle(this.targetRect);
    }

    /**
     * Sets the action performed when the destination is selected.
     * @param action the action
     */
    public void setAction(AbstractAction action) {
        this.action = action;
    }

}
