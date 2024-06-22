package com.ruoyi.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * checkIn对象 check_in
 * 
 * @author cfjg
 * @date 2024-06-21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckIn extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 编号 */
    @Excel(name = "编号")
    private String checkInCode;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 老人id */
    @Excel(name = "老人id")
    private Long elderId;

    /** 入住时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入住时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date checkInTime;

    /** 申请人 */
    @Excel(name = "申请人")
    private String applicat;

    /** 申请人id */
    @Excel(name = "申请人id")
    private Long applicatId;

    /** 入住状态，0：入住中，1：已退住 */
    @Excel(name = "入住状态，0：入住中，1：已退住")
    private Long status;

    /** 其他申请信息 */
    @Excel(name = "其他申请信息")
    private String otherApplyInfo;

    /** 老人姓名 */
    private String name;

    /** 身份证号 */
    private String idCardNo;

    /**床号**/
    private String bedNumber;

    /**护理等级**/
    private String nursingLevelName;

    /**入住开始时间**/
    private Date checkInStartTime;

    /**入住结束时间**/
    private Date checkInEndTime;

    public String checkTime;

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    public String getNursingLevelName() {
        return nursingLevelName;
    }

    public void setNursingLevelName(String nursingLevelName) {
        this.nursingLevelName = nursingLevelName;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCheckInCode(String checkInCode) 
    {
        this.checkInCode = checkInCode;
    }

    public String getCheckInCode() 
    {
        return checkInCode;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setElderId(Long elderId) 
    {
        this.elderId = elderId;
    }

    public Long getElderId() 
    {
        return elderId;
    }
    public void setCheckInTime(Date checkInTime) 
    {
        this.checkInTime = checkInTime;
    }

    public Date getCheckInTime() 
    {
        return checkInTime;
    }
    public void setApplicat(String applicat) 
    {
        this.applicat = applicat;
    }

    public String getApplicat() 
    {
        return applicat;
    }
    public void setApplicatId(Long applicatId) 
    {
        this.applicatId = applicatId;
    }

    public Long getApplicatId() 
    {
        return applicatId;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setOtherApplyInfo(String otherApplyInfo) 
    {
        this.otherApplyInfo = otherApplyInfo;
    }

    public String getOtherApplyInfo() 
    {
        return otherApplyInfo;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("checkInCode", getCheckInCode())
            .append("title", getTitle())
            .append("elderId", getElderId())
            .append("checkInTime", getCheckInTime())
            .append("remark", getRemark())
            .append("applicat", getApplicat())
            .append("applicatId", getApplicatId())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .append("otherApplyInfo", getOtherApplyInfo())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
