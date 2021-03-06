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

package openjdk7.com.sun.mirror.declaration;


import java.util.Collection;

import openjdk7.com.sun.mirror.type.*;


/**
 * Represents a formal type parameter of a generic type, method,
 * or constructor declaration.
 * A type parameter declares a {@link TypeVariable}.
 *
 * @deprecated All components of this API have been superseded by the
 * standardized annotation processing API.  The replacement for the
 * functionality of this interface is {@link
 * javax.lang.model.element.TypeParameterElement}.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @since 1.5
 */
@Deprecated
@SuppressWarnings("deprecation")
public interface TypeParameterDeclaration extends Declaration {

    /**
     * Returns the bounds of this type parameter.
     * These are the types given by the <i>extends</i> clause.
     * If there is no explicit <i>extends</i> clause, then
     * <tt>java.lang.Object</tt> is considered to be the sole bound.
     *
     * @return the bounds of this type parameter
     */
    Collection<ReferenceType> getBounds();

    /**
     * Returns the type, method, or constructor declaration within which
     * this type parameter is declared.
     *
     * @return the declaration within which this type parameter is declared
     */
    Declaration getOwner();
}
