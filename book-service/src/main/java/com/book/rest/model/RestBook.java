package com.book.rest.model;

import java.util.Date;
import java.util.UUID;

public class RestBook {
	
	private UUID id;
	private String name;
	private String author;
	private String version;
	private Date releasedDate;
	private String language;
	private long totalPage;
	
	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(UUID id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	/**
	 * @return the releasedDate
	 */
	public Date getReleasedDate() {
		return releasedDate;
	}
	/**
	 * @param releasedDate the releasedDate to set
	 */
	public void setReleasedDate(Date releasedDate) {
		this.releasedDate = releasedDate;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the totalPage
	 */
	public long getTotalPage() {
		return totalPage;
	}
	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}

}
