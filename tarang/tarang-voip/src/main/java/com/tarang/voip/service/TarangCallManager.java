package com.tarang.voip.service;

import org.apache.log4j.Logger;

public class TarangCallManager {
	private static final Logger log = Logger.getLogger(TarangCallManager.class);

	private String id;
	private String accesskey;
	private String host;
	private String protocol;

	public boolean placeCall(String mobileno) {
		log.info("placeCall: [id=" + id + ", accesskey=" + accesskey + ", host=" + host + ", protocol=" + protocol
				+ "] with mibileno: " + mobileno);
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccesskey() {
		return accesskey;
	}

	public void setAccesskey(String accesskey) {
		this.accesskey = accesskey;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public static Logger getLog() {
		return log;
	}

	@Override
	public String toString() {
		return "TarangCallManager [id=" + id + ", accesskey=" + accesskey + ", host=" + host + ", protocol=" + protocol
				+ "]";
	}

}
