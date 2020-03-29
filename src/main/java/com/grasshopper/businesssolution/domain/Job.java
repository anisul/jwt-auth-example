package com.grasshopper.businesssolution.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "job")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Job implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "invoice_number")
    private String invoiceNumber;

    @Column(name = "lc_value")
    private String lcValue;

    @Column(name = "invoice_value")
    private String invoiceValue;

    @Column(name = "goods_quantity")
    private Integer goodsQuantity;

    @Column(name = "document_receive_date")
    private LocalDate documentReceiveDate;

    @Column(name = "document_delivery_date")
    private LocalDate documentDeliveryDate;

    @Column(name = "delivery_station")
    private String deliveryStation;

    @Column(name = "courier_number")
    private String courierNumber;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "attachment")
    private String attachment;

    @ManyToOne
    private User user;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public Job invoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getLcValue() {
        return lcValue;
    }

    public Job lcValue(String lcValue) {
        this.lcValue = lcValue;
        return this;
    }

    public void setLcValue(String lcValue) {
        this.lcValue = lcValue;
    }

    public String getInvoiceValue() {
        return invoiceValue;
    }

    public Job invoiceValue(String invoiceValue) {
        this.invoiceValue = invoiceValue;
        return this;
    }

    public void setInvoiceValue(String invoiceValue) {
        this.invoiceValue = invoiceValue;
    }

    public Integer getGoodsQuantity() {
        return goodsQuantity;
    }

    public Job goodsQuantity(Integer goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
        return this;
    }

    public void setGoodsQuantity(Integer goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    public LocalDate getDocumentReceiveDate() {
        return documentReceiveDate;
    }

    public Job documentReceiveDate(LocalDate documentReceiveDate) {
        this.documentReceiveDate = documentReceiveDate;
        return this;
    }

    public void setDocumentReceiveDate(LocalDate documentReceiveDate) {
        this.documentReceiveDate = documentReceiveDate;
    }

    public LocalDate getDocumentDeliveryDate() {
        return documentDeliveryDate;
    }

    public Job documentDeliveryDate(LocalDate documentDeliveryDate) {
        this.documentDeliveryDate = documentDeliveryDate;
        return this;
    }

    public void setDocumentDeliveryDate(LocalDate documentDeliveryDate) {
        this.documentDeliveryDate = documentDeliveryDate;
    }

    public String getDeliveryStation() {
        return deliveryStation;
    }

    public Job deliveryStation(String deliveryStation) {
        this.deliveryStation = deliveryStation;
        return this;
    }

    public void setDeliveryStation(String deliveryStation) {
        this.deliveryStation = deliveryStation;
    }

    public String getCourierNumber() {
        return courierNumber;
    }

    public Job courierNumber(String courierNumber) {
        this.courierNumber = courierNumber;
        return this;
    }

    public void setCourierNumber(String courierNumber) {
        this.courierNumber = courierNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public Job remarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAttachment() {
        return attachment;
    }

    public Job attachment(String attachment) {
        this.attachment = attachment;
        return this;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public User getUser() {
        return user;
    }

    public Job user(User user) {
        this.user = user;
        return this;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Job job = (Job) o;
        if (job.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), job.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + getId() +
                ", invoiceNumber='" + getInvoiceNumber() + "'" +
                ", lcValue='" + getLcValue() + "'" +
                ", invoiceValue='" + getInvoiceValue() + "'" +
                ", goodsQuantity='" + getGoodsQuantity() + "'" +
                ", documentReceiveDate='" + getDocumentReceiveDate() + "'" +
                ", documentDeliveryDate='" + getDocumentDeliveryDate() + "'" +
                ", deliveryStation='" + getDeliveryStation() + "'" +
                ", courierNumber='" + getCourierNumber() + "'" +
                ", remarks='" + getRemarks() + "'" +
                ", attachment='" + getAttachment() + "'" +
                "}";
    }
}
