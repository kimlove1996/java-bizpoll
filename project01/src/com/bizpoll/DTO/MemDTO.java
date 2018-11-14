package com.bizpoll.DTO;

public class MemDTO {

	private String id;
	private String pw;
	private String name;
	private String nick;
	private String addr;
	private String email;
	private String bitrh;
	private String status;
	
	
	public MemDTO() {};
	
	
	public MemDTO(String id, String pw, String name, String nick, String addr, String email, String bitrh,
			String status) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nick = nick;
		this.addr = addr;
		this.email = email;
		this.bitrh = bitrh;
		this.status = status;
	}

	
	

	public MemDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	
	
	
	

	public MemDTO(String id, String pw, String name, String addr, String status) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.addr = addr;
		this.status = status;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
	}


	public String getAddr() {
		return addr;
	}


	public void setaddr(String addr) {
		this.addr = addr;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getBitrh() {
		return bitrh;
	}


	public void setBitrh(String bitrh) {
		this.bitrh = bitrh;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}	
	
	
	
	
}
