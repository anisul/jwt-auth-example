package com.grasshopper.businesssolution.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "bill")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "billing_date")
    private LocalDate billingDate;

    @Column(name = "amount", precision=10, scale=2)
    private BigDecimal amount;

    @Column(name = "billing_cn")
    private String billingCN;

    @OneToOne
    @JoinColumn(unique = true)
    private Job job;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public Bill billingDate(LocalDate billingDate) {
        this.billingDate = billingDate;
        return this;
    }

    public void setBillingDate(LocalDate billingDate) {
        this.billingDate = billingDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Bill amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBillingCN() {
        return billingCN;
    }

    public Bill billingCN(String billingCN) {
        this.billingCN = billingCN;
        return this;
    }

    public void setBillingCN(String billingCN) {
        this.billingCN = billingCN;
    }

    public Job getJob() {
        return job;
    }

    public Bill job(Job job) {
        this.job = job;
        return this;
    }

    public void setJob(Job job) {
        this.job = job;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bill bill = (Bill) o;
        if (bill.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), bill.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + getId() +
                ", billingDate='" + getBillingDate() + "'" +
                ", amount='" + getAmount() + "'" +
                ", billingCN='" + getBillingCN() + "'" +
                "}";
    }
}