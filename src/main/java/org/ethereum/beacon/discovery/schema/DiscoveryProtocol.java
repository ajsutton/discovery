/*
 * SPDX-License-Identifier: Apache-2.0
 */

package org.ethereum.beacon.discovery.schema;

import java.util.HashMap;
import java.util.Map;

/** Discovery protocol versions */
public enum DiscoveryProtocol {
  V4("v4"),
  V5("v5");

  private static final Map<String, DiscoveryProtocol> nameMap = new HashMap<>();

  static {
    for (DiscoveryProtocol scheme : DiscoveryProtocol.values()) {
      nameMap.put(scheme.name, scheme);
    }
  }

  private String name;

  private DiscoveryProtocol(String name) {
    this.name = name;
  }

  public static DiscoveryProtocol fromString(String name) {
    return nameMap.get(name);
  }

  public String stringName() {
    return name;
  }
}
