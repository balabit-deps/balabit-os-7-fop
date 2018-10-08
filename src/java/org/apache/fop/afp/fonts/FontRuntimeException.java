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

/* $Id: FontRuntimeException.java 1679676 2015-05-16 02:10:42Z adelmelle $ */

package org.apache.fop.afp.fonts;

/**
 * A runtime exception for handling fatal errors in processing fonts.
 */
public class FontRuntimeException extends RuntimeException {

    private static final long serialVersionUID = -2217420523816384707L;

    /**
     * Constructs a FontRuntimeException with the specified message.
     * @param msg the exception mesaage
     */
    public FontRuntimeException(String msg) {
        super(msg);
    }

    /**
     * Constructs a FontRuntimeException with the specified message
     * wrapping the underlying exception.
     * @param msg the exception mesaage
     * @param t the underlying exception
     */
    public FontRuntimeException(String msg, Throwable t) {
        super(msg, t);
    }

}
