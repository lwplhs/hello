package com.lhs.entity;

public class Surname {
	private int id;
	private String surname;
	private String pinyin;
	private String key_uuid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPinyin() {
		return pinyin;
	}
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}
	public String getKey_uuid() {
		return key_uuid;
	}
	public void setKey_uuid(String key_uuid) {
		this.key_uuid = key_uuid;
	}
	@Override
	public String toString() {
		return "Surname [id=" + id + ", surname=" + surname + ", pinyin="
				+ pinyin + ", key_uuid=" + key_uuid + "]";
	}
}
