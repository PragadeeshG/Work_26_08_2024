package com.test1;

public class BankForexData {
	private Integer forexAccountNumber;
	private String forexCard;
	private String remitAbroadNonAccountHolder;
	private Integer onlineFunds;
	private Integer safeDepositFunds;
	private String onlineTransferMode;
	private Integer ImpsCode;
	private Integer RtgsCode;
	private String foreignCurrencyCash;
	private Integer currencyDemandDrafts;
	private Integer travellerChequeNumber;
	private String travellerChequeValidity;
	private String remarks;

	public BankForexData() {

	}

	public BankForexData(Integer forexAccountNumber, String forexCard, String remitAbroadNonAccountHolder,
			Integer onlineFunds, Integer safeDepositFunds, String onlineTransferMode, Integer impsCode,
			Integer rtgsCode, String foreignCurrencyCash, Integer currencyDemandDrafts, Integer travellerChequeNumber,
			String travellerChequeValidity, String remarks) {
		super();
		this.forexAccountNumber = forexAccountNumber;
		this.forexCard = forexCard;
		this.remitAbroadNonAccountHolder = remitAbroadNonAccountHolder;
		this.onlineFunds = onlineFunds;
		this.safeDepositFunds = safeDepositFunds;
		this.onlineTransferMode = onlineTransferMode;
		ImpsCode = impsCode;
		RtgsCode = rtgsCode;
		this.foreignCurrencyCash = foreignCurrencyCash;
		this.currencyDemandDrafts = currencyDemandDrafts;
		this.travellerChequeNumber = travellerChequeNumber;
		this.travellerChequeValidity = travellerChequeValidity;
		this.remarks = remarks;
	}

	public Integer getForexAccountNumber() {
		return forexAccountNumber;
	}

	public void setForexAccountNumber(Integer forexAccountNumber) {
		this.forexAccountNumber = forexAccountNumber;
	}

	public String getForexCard() {
		return forexCard;
	}

	public void setForexCard(String forexCard) {
		this.forexCard = forexCard;
	}

	public String getRemitAbroadNonAccountHolder() {
		return remitAbroadNonAccountHolder;
	}

	public void setRemitAbroadNonAccountHolder(String remitAbroadNonAccountHolder) {
		this.remitAbroadNonAccountHolder = remitAbroadNonAccountHolder;
	}

	public Integer getOnlineFunds() {
		return onlineFunds;
	}

	public void setOnlineFunds(Integer onlineFunds) {
		this.onlineFunds = onlineFunds;
	}

	public Integer getSafeDepositFunds() {
		return safeDepositFunds;
	}

	public void setSafeDepositFunds(Integer safeDepositFunds) {
		this.safeDepositFunds = safeDepositFunds;
	}

	public String getOnlineTransferMode() {
		return onlineTransferMode;
	}

	public void setOnlineTransferMode(String onlineTransferMode) {
		this.onlineTransferMode = onlineTransferMode;
	}

	public Integer getImpsCode() {
		return ImpsCode;
	}

	public void setImpsCode(Integer impsCode) {
		ImpsCode = impsCode;
	}

	public Integer getRtgsCode() {
		return RtgsCode;
	}

	public void setRtgsCode(Integer rtgsCode) {
		RtgsCode = rtgsCode;
	}

	public String getForeignCurrencyCash() {
		return foreignCurrencyCash;
	}

	public void setForeignCurrencyCash(String foreignCurrencyCash) {
		this.foreignCurrencyCash = foreignCurrencyCash;
	}

	public Integer getCurrencyDemandDrafts() {
		return currencyDemandDrafts;
	}

	public void setCurrencyDemandDrafts(Integer currencyDemandDrafts) {
		this.currencyDemandDrafts = currencyDemandDrafts;
	}

	public Integer getTravellerChequeNumber() {
		return travellerChequeNumber;
	}

	public void setTravellerChequeNumber(Integer travellerChequeNumber) {
		this.travellerChequeNumber = travellerChequeNumber;
	}

	public String getTravellerChequeValidity() {
		return travellerChequeValidity;
	}

	public void setTravellerChequeValidity(String travellerChequeValidity) {
		this.travellerChequeValidity = travellerChequeValidity;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
