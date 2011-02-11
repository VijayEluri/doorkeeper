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
package net.dataforte.doorkeeper.account.provider;

import java.util.List;

import net.dataforte.doorkeeper.User;
import net.dataforte.doorkeeper.authenticator.AuthenticatorException;
import net.dataforte.doorkeeper.authenticator.AuthenticatorToken;

public interface AccountProvider {

	User authenticate(AuthenticatorToken token) throws AuthenticatorException;

	User load(AuthenticatorToken token) throws AuthenticatorException;
	
	List<User> getUsersInGroup(String group);
}