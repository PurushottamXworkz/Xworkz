package com.xworkz.lenscart.dto;

import java.util.Objects;

public class LensCartdto {
	
    private String brandOfFrame;
    private String lensType; // 
    private String lensFrame;
    private String varientsOfLens;//power, computer , sunglasses,reading 
    private String storeLocation;
    private String orderType;
    
    public LensCartdto() {
		System.out.println("--------------This is LensCartDto------------");
	}
    
	public LensCartdto(String brandOfFrame, String lensType, String lensFrame, String varientsOfLens, String storeLocation,
			String orderType) {
		super();
		this.brandOfFrame = brandOfFrame;
		this.lensType = lensType;
		this.lensFrame = lensFrame;
		this.varientsOfLens = varientsOfLens;
		this.storeLocation = storeLocation;
		this.orderType = orderType;
	}
	public String getBrandOfFrame() {
		return brandOfFrame;
	}
	public void setBrandOfFrame(String brandOfFrame) {
		this.brandOfFrame = brandOfFrame;
	}
	public String getLensType() {
		return lensType;
	}
	public void setLensType(String lensType) {
		this.lensType = lensType;
	}
	public String getLensFrame() {
		return lensFrame;
	}
	public void setLensFrame(String lensFrame) {
		this.lensFrame = lensFrame;
	}
	public String getVarientsOfLens() {
		return varientsOfLens;
	}
	public void setVarientsOfLens(String varientsOfLens) {
		this.varientsOfLens = varientsOfLens;
	}
	public String getStoreLocation() {
		return storeLocation;
	}
	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brandOfFrame, lensFrame, lensType, orderType, storeLocation, varientsOfLens);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LensCartdto other = (LensCartdto) obj;
		return Objects.equals(brandOfFrame, other.brandOfFrame) && Objects.equals(lensFrame, other.lensFrame)
				&& Objects.equals(lensType, other.lensType) && Objects.equals(orderType, other.orderType)
				&& Objects.equals(storeLocation, other.storeLocation) && Objects.equals(varientsOfLens, other.varientsOfLens);
	}
	@Override
	public String toString() {
		return "LensCartdto [brandOfFrame=" + brandOfFrame + ", lensType=" + lensType + ", lensFrame=" + lensFrame
				+ ", varientsOfLens=" + varientsOfLens + ", storeLocation=" + storeLocation + ", orderType=" + orderType + "]";
	}   
}
