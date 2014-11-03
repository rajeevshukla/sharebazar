package com.gss.spring.security.domain.common;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name="UserConnection", uniqueConstraints = {@UniqueConstraint(columnNames = { "userId", "providerId", "providerUserId" }),
                            @UniqueConstraint(columnNames = { "userId", "providerId", "rank" })})
public class SocialUser {
  
private static final long serialVersionUID = -389712894370020124L;
 public SocialUser() {
 
   }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  /**
   * A local identifier for the user, in our case the username.
   */
  private String userId;
  

  @Column(nullable = false)
  private String providerId;

  private String providerUserId;

  @Column(nullable = false)
  private int rank;

  private String displayName;

  private String profileUrl;

  private String imageUrl;

  @Column(nullable = false)
  private String accessToken;

  private String secret;

  private String refreshToken;

  private Long expireTime;


  private Date createDate = new Date();


public int getId() {
	return id;
}


public String getUserId() {
	return userId;
}


public String getProviderId() {
	return providerId;
}


public String getProviderUserId() {
	return providerUserId;
}


public int getRank() {
	return rank;
}


public String getDisplayName() {
	return displayName;
}


public String getProfileUrl() {
	return profileUrl;
}


public String getImageUrl() {
	return imageUrl;
}


public String getAccessToken() {
	return accessToken;
}


public String getSecret() {
	return secret;
}


public String getRefreshToken() {
	return refreshToken;
}


public Long getExpireTime() {
	return expireTime;
}


public Date getCreateDate() {
	return createDate;
}


public void setId(int id) {
	this.id = id;
}


public void setUserId(String userId) {
	this.userId = userId;
}


public void setProviderId(String providerId) {
	this.providerId = providerId;
}


public void setProviderUserId(String providerUserId) {
	this.providerUserId = providerUserId;
}


public void setRank(int rank) {
	this.rank = rank;
}


public void setDisplayName(String displayName) {
	this.displayName = displayName;
}


public void setProfileUrl(String profileUrl) {
	this.profileUrl = profileUrl;
}


public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}


public void setAccessToken(String accessToken) {
	this.accessToken = accessToken;
}


public void setSecret(String secret) {
	this.secret = secret;
}


public void setRefreshToken(String refreshToken) {
	this.refreshToken = refreshToken;
}


public void setExpireTime(Long expireTime) {
	this.expireTime = expireTime;
}


public void setCreateDate(Date createDate) {
	this.createDate = createDate;
}




}

