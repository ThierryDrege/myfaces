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
package javax.faces.component.html;

interface _LinkProperties
{
    /**
     * HTML: Specifies the character encoding of the linked resource.
     * 
     * @JSFProperty
     */
    public abstract String getCharset();
    
    /**
     * HTML: The coordinates of regions within a client side image map.
     * 
     * @JSFProperty
     */
    public abstract String getCoords();
    
    /**
     * HTML: The language of the linked resource.
     * 
     * @JSFProperty
     */
    public abstract String getHreflang();
    
    /**
     * HTML: The relationship between the current document and
     * the linked resource.
     *
     * @JSFProperty
     */
    public abstract String getRel();
    
    /**
     * HTML: The type(s) describing the reverse link for the linked
     * resource.
     * 
     * @JSFProperty
     */
    public abstract String getRev();
    
    /**
     * HTML: The shape of a region in a client side image map.
     * 
     * @JSFProperty
     */
    public abstract String getShape();
    
    /**
     * HTML: Names the frame that should display content generated by invoking this action. 
     * 
     * @JSFProperty
     */
    public abstract String getTarget();
    
    /**
     * HTML: A hint to the user agent about the content type of the linked resource.
     * 
     * @JSFProperty
     */
    public abstract String getType();

}
