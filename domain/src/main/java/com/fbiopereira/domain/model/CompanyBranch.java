package com.fbiopereira.domain.model;

import com.fbiopereira.domain.enums.CompanyBranchType;

import java.time.LocalDateTime;
import java.util.UUID;

public class CompanyBranch {

    private UUID branchId;
    private String name;
    private int taxIdentificationNumber;

    private String city;

    private String state;

    private CompanyBranchType companyBranchType;

    private boolean operative;

    private LocalDateTime registerDate;

    private LocalDateTime lastUpdated;

    public UUID getBranchId() {
        return branchId;
    }

    public void setBranchId(UUID branchId) {
        this.branchId = branchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(int taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CompanyBranchType getCompanyBranchType() {
        return companyBranchType;
    }

    public void setCompanyBranchType(CompanyBranchType companyBranchType) {
        this.companyBranchType = companyBranchType;
    }

    public boolean isOperative() {
        return operative;
    }

    public void setOperative(boolean operative) {
        this.operative = operative;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
