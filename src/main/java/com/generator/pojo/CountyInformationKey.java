package com.generator.pojo;

public class CountyInformationKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column county_information.countyDistrict
     *
     * @mbggenerated
     */
    private String countydistrict;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column county_information.idPrefecture
     *
     * @mbggenerated
     */
    private Integer idprefecture;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column county_information.countyDistrict
     *
     * @return the value of county_information.countyDistrict
     *
     * @mbggenerated
     */
    public String getCountydistrict() {
        return countydistrict;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column county_information.countyDistrict
     *
     * @param countydistrict the value for county_information.countyDistrict
     *
     * @mbggenerated
     */
    public void setCountydistrict(String countydistrict) {
        this.countydistrict = countydistrict == null ? null : countydistrict.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column county_information.idPrefecture
     *
     * @return the value of county_information.idPrefecture
     *
     * @mbggenerated
     */
    public Integer getIdprefecture() {
        return idprefecture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column county_information.idPrefecture
     *
     * @param idprefecture the value for county_information.idPrefecture
     *
     * @mbggenerated
     */
    public void setIdprefecture(Integer idprefecture) {
        this.idprefecture = idprefecture;
    }
}