package com.miracle.sharebazar.customer.model;

public class ChangePasswordForm {

	private String currentPassword;
	private String newPassword;
	private String rePassword;

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

	@Override
	public String toString() {
		return "ChangePasswordForm [currentPassword=" + currentPassword
				+ ", newPassword=" + newPassword + ", rePassword=" + rePassword
				+ "]";
	}

}
