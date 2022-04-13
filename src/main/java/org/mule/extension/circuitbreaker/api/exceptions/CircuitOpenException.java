/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com The software in this package is published under the terms of the CPAL v1.0 license, a copy of which has been included with this distribution in the LICENSE.md
 * file.
 */
package org.mule.extension.circuitbreaker.api.exceptions;

import java.util.logging.Logger;

public class CircuitOpenException extends Exception {

   private static final long serialVersionUID = -1087947009213021862L;
   private Logger logger = Logger.getLogger(CircuitOpenException.class.getCanonicalName());

   private static final String MESSAGE = "Failure threshold reached; circuit is open";

   public CircuitOpenException() {
      super(MESSAGE);
   }

}
