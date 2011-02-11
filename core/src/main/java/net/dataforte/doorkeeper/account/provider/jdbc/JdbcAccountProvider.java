package net.dataforte.doorkeeper.account.provider.jdbc;

import java.util.List;

import javax.annotation.PostConstruct;

import net.dataforte.doorkeeper.User;
import net.dataforte.doorkeeper.account.provider.AccountProvider;
import net.dataforte.doorkeeper.annotations.Property;
import net.dataforte.doorkeeper.authenticator.AuthenticatorToken;

@Property(name = "name", value = "jdbc")
public class JdbcAccountProvider implements AccountProvider {
	String url;
	String username;
	String password;
	String jndi;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJndi() {
		return jndi;
	}

	public void setJndi(String jndi) {
		this.jndi = jndi;
	}

	@PostConstruct
	public void init() {
	}

	@Override
	public User authenticate(AuthenticatorToken token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User load(AuthenticatorToken token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersInGroup(String group) {
		// TODO Auto-generated method stub
		return null;
	}

	
}