package com.zxh.ssm.module.user.pojo;

public class PatientAddress {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patient_address.cardID
     *
     * @mbggenerated
     */
    private Integer cardid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patient_address.paRegister
     *
     * @mbggenerated
     */
    private String paregister;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patient_address.addressStandard
     *
     * @mbggenerated
     */
    private Integer addressstandard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patient_address.paAddress
     *
     * @mbggenerated
     */
    private String paaddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patient_address.cardID
     *
     * @return the value of patient_address.cardID
     *
     * @mbggenerated
     */
    public Integer getCardid() {
        return cardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patient_address.cardID
     *
     * @param cardid the value for patient_address.cardID
     *
     * @mbggenerated
     */
    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patient_address.paRegister
     *
     * @return the value of patient_address.paRegister
     *
     * @mbggenerated
     */
    public String getParegister() {
        return paregister;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patient_address.paRegister
     *
     * @param paregister the value for patient_address.paRegister
     *
     * @mbggenerated
     */
    public void setParegister(String paregister) {
        this.paregister = paregister == null ? null : paregister.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patient_address.addressStandard
     *
     * @return the value of patient_address.addressStandard
     *
     * @mbggenerated
     */
    public Integer getAddressstandard() {
        return addressstandard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patient_address.addressStandard
     *
     * @param addressstandard the value for patient_address.addressStandard
     *
     * @mbggenerated
     */
    public void setAddressstandard(Integer addressstandard) {
        this.addressstandard = addressstandard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patient_address.paAddress
     *
     * @return the value of patient_address.paAddress
     *
     * @mbggenerated
     */
    public String getPaaddress() {
        return paaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patient_address.paAddress
     *
     * @param paaddress the value for patient_address.paAddress
     *
     * @mbggenerated
     */
    public void setPaaddress(String paaddress) {
        this.paaddress = paaddress == null ? null : paaddress.trim();
    }
}