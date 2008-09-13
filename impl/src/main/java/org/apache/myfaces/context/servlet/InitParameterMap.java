/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.myfaces.context.servlet;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.myfaces.util.AbstractAttributeMap;


/**
 * ServletContext init parameters as Map.
 * 
 * @author Anton Koinov (latest modification by $Author$)
 * @version $Revision$ $Date$
 */
public final class InitParameterMap extends AbstractAttributeMap<String>
{
    private final ServletContext _servletContext;

    InitParameterMap(final ServletContext servletContext)
    {
        _servletContext = servletContext;
    }

    protected String getAttribute(final String key)
    {
        return _servletContext.getInitParameter(key);
    }

    protected void setAttribute(final String key, final String value)
    {
        throw new UnsupportedOperationException(
            "Cannot set ServletContext InitParameter");
    }

    protected void removeAttribute(final String key)
    {
        throw new UnsupportedOperationException(
            "Cannot remove ServletContext InitParameter");
    }

    @SuppressWarnings("unchecked")
    protected Enumeration<String> getAttributeNames()
    {
        return _servletContext.getInitParameterNames();
    }
    
    public void putAll(final Map t)
    {
        throw new UnsupportedOperationException();
    }


    public void clear()
    {
        throw new UnsupportedOperationException();
    }
}
