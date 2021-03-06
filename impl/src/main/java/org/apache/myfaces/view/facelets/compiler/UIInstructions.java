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
package org.apache.myfaces.view.facelets.compiler;

import java.io.IOException;
import java.util.Arrays;

import jakarta.faces.context.FacesContext;

import org.apache.myfaces.view.facelets.el.ELText;

final class UIInstructions extends UILeaf
{

    private final ELText txt;
    private final Instruction[] instructions;

    public UIInstructions(ELText txt, Instruction[] instructions)
    {
        this.txt = txt;
        this.instructions = instructions;
    }

    @Override
    public void encodeBegin(FacesContext context) throws IOException
    {
        int size = this.instructions.length;
        for (int i = 0; i < size; i++)
        {
            this.instructions[i].write(context);
        }
    }

    @Override
    public String toString()
    {
        return (this.txt != null) ? this.txt.toString() : "UIInstructions[" + Arrays.asList(instructions) + ']';
    }

}
