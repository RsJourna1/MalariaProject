package com.zxh.ssm.module.download.pojo;

public class FourLevelLinkage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column four_level_linkage.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column four_level_linkage.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column four_level_linkage.level
     *
     * @mbggenerated
     */
    private Byte level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column four_level_linkage.upId
     *
     * @mbggenerated
     */
    private Integer upid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column four_level_linkage.id
     *
     * @return the value of four_level_linkage.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column four_level_linkage.id
     *
     * @param id the value for four_level_linkage.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column four_level_linkage.name
     *
     * @return the value of four_level_linkage.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column four_level_linkage.name
     *
     * @param name the value for four_level_linkage.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column four_level_linkage.level
     *
     * @return the value of four_level_linkage.level
     *
     * @mbggenerated
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column four_level_linkage.level
     *
     * @param level the value for four_level_linkage.level
     *
     * @mbggenerated
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column four_level_linkage.upId
     *
     * @return the value of four_level_linkage.upId
     *
     * @mbggenerated
     */
    public Integer getUpid() {
        return upid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column four_level_linkage.upId
     *
     * @param upid the value for four_level_linkage.upId
     *
     * @mbggenerated
     */
    public void setUpid(Integer upid) {
        this.upid = upid;
    }
}