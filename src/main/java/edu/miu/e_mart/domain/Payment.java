package edu.miu.e_mart.domain;


import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
public class Payment {
    @Id
    @GeneratedValue
    private Integer paymentId;

    @NotEmpty
    private String cardType = "Visa/Mastercardd";

    @CreditCardNumber
    @Size(min=16,max=16, message = "Card should have 16 numbers!")
    private String cartNumber;

    @NotEmpty
    private String nameOnCard = "default name";

    @NotNull
    @DateTimeFormat(pattern = "mm/dd/yyyy")
    private LocalDate cardExpireDate;

    private int ccv = 000;

    private LocalDate paymentDate = LocalDate.now();

    public LocalDate getPaymentDate()
    {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate)
    {
        this.paymentDate = paymentDate;
    }

    public String getCardType()
    {
        return cardType;
    }

    public void setCardType(String cardType)
    {
        this.cardType = cardType;
    }

    public int getCcv()
    {
        return ccv;
    }

    public void setCcv(int ccv)
    {
        this.ccv = ccv;
    }

    public Payment(){}

    public Payment(String cartNumber, String nameOnCard,  LocalDate cardExpireDate) {
        this.cartNumber = cartNumber;
        this.nameOnCard = nameOnCard;
        this.cardExpireDate = cardExpireDate;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer id) {
        this.paymentId = id;
    }

    public String getCartNumber() {
        return cartNumber;
    }

    public void setCartNumber(String cartNumber) {
        this.cartNumber = cartNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }


    public LocalDate getCardExpireDate() {
        return cardExpireDate;
    }

    public void setCardExpireDate(LocalDate expriryYear) {
        this.cardExpireDate = expriryYear;
    }
}