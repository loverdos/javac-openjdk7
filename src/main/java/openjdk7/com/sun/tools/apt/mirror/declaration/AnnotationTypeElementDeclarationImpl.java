/*
 * Copyright (c) 2004, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package openjdk7.com.sun.tools.apt.mirror.declaration;


import openjdk7.com.sun.mirror.declaration.*;
import openjdk7.com.sun.mirror.util.DeclarationVisitor;
import openjdk7.com.sun.tools.apt.mirror.AptEnv;
import openjdk7.com.sun.tools.javac.code.Symbol.MethodSymbol;


/**
 * Implementation of AnnotationTypeElementDeclaration
 */
@SuppressWarnings("deprecation")
public class AnnotationTypeElementDeclarationImpl extends MethodDeclarationImpl
                                  implements AnnotationTypeElementDeclaration {

    AnnotationTypeElementDeclarationImpl(AptEnv env, MethodSymbol sym) {
        super(env, sym);
    }

    /**
     * {@inheritDoc}
     */
    public AnnotationTypeDeclaration getDeclaringType() {
        return (AnnotationTypeDeclaration) super.getDeclaringType();
    }

    /**
     * {@inheritDoc}
     */
    public AnnotationValue getDefaultValue() {
        return (sym.defaultValue == null)
               ? null
               : new AnnotationValueImpl(env, sym.defaultValue, null);
    }

    /**
     * {@inheritDoc}
     */
    public void accept(DeclarationVisitor v) {
        v.visitAnnotationTypeElementDeclaration(this);
    }
}
