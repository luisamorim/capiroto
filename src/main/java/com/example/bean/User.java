package com.example.bean;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	private String _id;
	private String login;
	private String senha;
	
	public User(){}
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "User [_id=" + _id + ", login=" + login + ", senha=" + senha + "]";
	}
	
	

}
