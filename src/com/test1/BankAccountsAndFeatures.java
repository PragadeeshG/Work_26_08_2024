package com.test1;

public class BankAccountsAndFeatures {
	private String savingsAcc;
	private String currentAcc;
	private String salaryAcc;
	private String directInvestAcc;
	private String safeDepositLocker;
	private String safeCustody;
	private String nationalPensionScheme;
	private String pensionDisbursmentAccount;
	private String pmjdy;
	private String otherOptions;

	public BankAccountsAndFeatures() {

	}

	public BankAccountsAndFeatures(String savingsAcc, String currentAcc, String salaryAcc, String directInvestAcc,
			String safeDepositLocker, String safeCustody, String nationalPensionScheme,
			String pensionDisbursmentAccount, String pmjdy, String otherOptions) {
		super();
		this.savingsAcc = savingsAcc;
		this.currentAcc = currentAcc;
		this.salaryAcc = salaryAcc;
		this.directInvestAcc = directInvestAcc;
		this.safeDepositLocker = safeDepositLocker;
		this.safeCustody = safeCustody;
		this.nationalPensionScheme = nationalPensionScheme;
		this.pensionDisbursmentAccount = pensionDisbursmentAccount;
		this.pmjdy = pmjdy;
		this.otherOptions = otherOptions;
	}

	public String getSavingsAcc() {
		return savingsAcc;
	}

	public void setSavingsAcc(String savingsAcc) {
		this.savingsAcc = savingsAcc;
	}

	public String getCurrentAcc() {
		return currentAcc;
	}

	public void setCurrentAcc(String currentAcc) {
		this.currentAcc = currentAcc;
	}

	public String getSalaryAcc() {
		return salaryAcc;
	}

	public void setSalaryAcc(String salaryAcc) {
		this.salaryAcc = salaryAcc;
	}

	public String getDirectInvestAcc() {
		return directInvestAcc;
	}

	public void setDirectInvestAcc(String directInvestAcc) {
		this.directInvestAcc = directInvestAcc;
	}

	public String getSafeDepositLocker() {
		return safeDepositLocker;
	}

	public void setSafeDepositLocker(String safeDepositLocker) {
		this.safeDepositLocker = safeDepositLocker;
	}

	public String getSafeCustody() {
		return safeCustody;
	}

	public void setSafeCustody(String safeCustody) {
		this.safeCustody = safeCustody;
	}

	public String getNationalPensionScheme() {
		return nationalPensionScheme;
	}

	public void setNationalPensionScheme(String nationalPensionScheme) {
		this.nationalPensionScheme = nationalPensionScheme;
	}

	public String getPensionDisbursmentAccount() {
		return pensionDisbursmentAccount;
	}

	public void setPensionDisbursmentAccount(String pensionDisbursmentAccount) {
		this.pensionDisbursmentAccount = pensionDisbursmentAccount;
	}

	public String getPmjdy() {
		return pmjdy;
	}

	public void setPmjdy(String pmjdy) {
		this.pmjdy = pmjdy;
	}

	public String getOtherOptions() {
		return otherOptions;
	}

	public void setOtherOptions(String otherOptions) {
		this.otherOptions = otherOptions;
	}

}
