/**
 * Copyright 2010 Tristan Tarrant
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.dataforte.doorkeeper.account.provider.ldap;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LdapEntry implements Serializable {
	String dn;
	public Map<String, String> attributes = new HashMap<String, String>();
	Set<String> addGroups = new HashSet<String>();
	Set<String> delGroups = new HashSet<String>();
	

	public LdapEntry(String dn) {
		this.dn = dn;
	}

	@Override
	public String toString() {
		return "LdapEntry [dn=" + dn + ", attributes=" + attributes + (addGroups != null ? ",addGroups=" + addGroups : "")+ (delGroups != null ? ",delGroups=" + delGroups : "") + "]";
	}

}
