/**
 * 
 */
package hiki.o2o.entity;

import java.util.Date;

/**
 * @Hiki msi
 *
 */
public class PersonInfo {
	private Long userId;
	private String name;
	//ͷ���ַ
	private String profilImg;
	private String email;
	private String gender;
	//�û�״̬ ���Ƿ񱻷����0λ��ֹ��1����
	private Integer enableStatus;
	//�û���ݱ�ʶ  1.�˿�  2.���  3.��������Ա
	private Integer userType;
	private Date createTime;
	private Date lastEditTime;
	/**
	 * @return userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param userId 要设置的 userId
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return profilImg
	 */
	public String getProfilImg() {
		return profilImg;
	}
	/**
	 * @param profilImg 要设置的 profilImg
	 */
	public void setProfilImg(String profilImg) {
		this.profilImg = profilImg;
	}
	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email 要设置的 email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender 要设置的 gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return enableStatus
	 */
	public Integer getEnableStatus() {
		return enableStatus;
	}
	/**
	 * @param enableStatus 要设置的 enableStatus
	 */
	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}
	/**
	 * @return userType
	 */
	public Integer getUserType() {
		return userType;
	}
	/**
	 * @param userType 要设置的 userType
	 */
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	/**
	 * @return createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime 要设置的 createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return lastEditTime
	 */
	public Date getLastEditTime() {
		return lastEditTime;
	}
	/**
	 * @param lastEditTime 要设置的 lastEditTime
	 */
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	
}
