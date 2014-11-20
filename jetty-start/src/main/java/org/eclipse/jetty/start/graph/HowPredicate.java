//
//  ========================================================================
//  Copyright (c) 1995-2014 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.start.graph;

/**
 * Predicate against a specific {@link Selection#getHow()}
 */
public class HowPredicate implements Predicate
{
    private final String how;

    public HowPredicate(String how)
    {
        this.how = how;
    }

    @Override
    public boolean match(Node<?> node)
    {
        for (Selection selection : node.getSelections())
        {
            if (how.equalsIgnoreCase(selection.getHow()))
            {
                return true;
            }
        }
        return false;
    }
}