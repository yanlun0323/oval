/*********************************************************************
 * Copyright 2005-2020 by Sebastian Thomschke and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *********************************************************************/
package net.sf.oval.internal.util;

import java.lang.reflect.AccessibleObject;
import java.security.PrivilegedAction;

/**
 * @author Sebastian Thomschke
 */
public final class SetAccessibleAction implements PrivilegedAction<Object> {
   private final AccessibleObject ao;
   private boolean accessible = true;

   public SetAccessibleAction(final AccessibleObject ao) {
      this.ao = ao;
   }

   public SetAccessibleAction(final AccessibleObject ao, final boolean accessible) {
      this.ao = ao;
      this.accessible = accessible;
   }

   @Override
   public Object run() {
      ao.setAccessible(accessible);
      return null;
   }
}
