package cap.model;

public class Profile {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.first_name
     *
     * @mbg.generated
     */
    private String firstName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.last_name
     *
     * @mbg.generated
     */
    private String lastName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.gender
     *
     * @mbg.generated
     */
    private Boolean gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.telephone
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.id
     *
     * @return the value of profile.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.id
     *
     * @param id the value for profile.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.user_id
     *
     * @return the value of profile.user_id
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.user_id
     *
     * @param userId the value for profile.user_id
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.first_name
     *
     * @return the value of profile.first_name
     * @mbg.generated
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.first_name
     *
     * @param firstName the value for profile.first_name
     * @mbg.generated
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.last_name
     *
     * @return the value of profile.last_name
     * @mbg.generated
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.last_name
     *
     * @param lastName the value for profile.last_name
     * @mbg.generated
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.gender
     *
     * @return the value of profile.gender
     * @mbg.generated
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.gender
     *
     * @param gender the value for profile.gender
     * @mbg.generated
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.telephone
     *
     * @return the value of profile.telephone
     * @mbg.generated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.telephone
     *
     * @param telephone the value for profile.telephone
     * @mbg.generated
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
}