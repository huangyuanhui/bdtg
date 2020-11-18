package com.gdyakj.bdtg.bean;


import java.util.Date;

public class InfoMessage {
    private Integer id;
    private String companyName;
    private Integer area;
    private String system;
    private String customerName;
    private String cellPhone;
    private String machineBand;
    private Date createTime;
    private Integer customerType;

    public Integer getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getMachineBand() {
        return machineBand;
    }

    public void setMachineBand(String machineBand) {
        this.machineBand = machineBand;
    }

    @Override
    public String toString() {
        return "InfoMessage{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", area=" + area +
                ", system='" + system + '\'' +
                ", customerName='" + customerName + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", machineBand='" + machineBand + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
