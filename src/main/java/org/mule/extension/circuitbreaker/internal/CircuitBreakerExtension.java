/**
 *
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */
package org.mule.extension.circuitbreaker.internal;

import org.mule.extension.circuitbreaker.api.util.SimpleLogger;
import org.mule.runtime.api.meta.Category;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;

/**
 * Circuit Breaker module
 *
 * @Author Roy Prins
 * 
 */
@Xml(prefix = "circuit-breaker-module")
@Extension(name = "Circuit Breaker Module", category = Category.COMMUNITY)
@Configurations(CircuitBreakerConfiguration.class)
public class CircuitBreakerExtension {
   
   private static final SimpleLogger logger = new SimpleLogger(CircuitBreakerExtension.class.getCanonicalName());

   public CircuitBreakerExtension() {
      logger.info("*** CircuitBreakerExtension initialized ***");
      
   }

}
