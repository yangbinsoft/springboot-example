package com.dianmi.model.ownhome;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//深圳，深圳立德，东莞
@Data
@NoArgsConstructor
public class SZLDDGShow implements Serializable{
	private String reportingPeriod;
	private String customerName;
	private String dept;
	private Double pensionSocial;
	private Double medicaltreatmentSocial;
	private Double seriousIllnessSocial;	
	private Double injurySocial;
	private Double unemploymentSocial;
	private Double procreateSocial;
	
	private Double personSocialTotal;
	private Double companySocialTotal;
	private Double socialTotalPay;
	private Double disabilityBenefitFee;
	private Double companyAccumulation;
	private Double personAccumulation;
	private Double accumulationTotalPay;
	
	private Double serviceFee;
	private Double TotalFee;
}
