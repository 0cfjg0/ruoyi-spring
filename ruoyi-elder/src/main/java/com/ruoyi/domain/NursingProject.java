package com.ruoyi.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 护理项目对象 nursing_project
 * 
 * @author cfjg
 * @date 2024-06-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NursingProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long orderNo;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

    /** 图片 */
    @Excel(name = "图片")
    private String image;

    /** 护理要求 */
    @Excel(name = "护理要求")
    private String nursingRequirement;

    /** 状态（0：禁用，1：启用） */
    @Excel(name = "状态", readConverterExp = "0=：禁用，1：启用")
    private Long status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setOrderNo(Long orderNo) 
    {
        this.orderNo = orderNo;
    }

    public Long getOrderNo() 
    {
        return orderNo;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }
    public void setNursingRequirement(String nursingRequirement) 
    {
        this.nursingRequirement = nursingRequirement;
    }

    public String getNursingRequirement() 
    {
        return nursingRequirement;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("orderNo", getOrderNo())
            .append("unit", getUnit())
            .append("price", getPrice())
            .append("image", getImage())
            .append("nursingRequirement", getNursingRequirement())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
