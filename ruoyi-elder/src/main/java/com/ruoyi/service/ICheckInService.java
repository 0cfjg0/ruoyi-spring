package com.ruoyi.service;

import java.util.List;

import com.ruoyi.domain.CheckIn;

/**
 * checkInService接口
 * 
 * @author cfjg
 * @date 2024-06-21
 */
public interface ICheckInService 
{
    /**
     * 查询checkIn
     * 
     * @param id checkIn主键
     * @return checkIn
     */
    public CheckIn selectCheckInById(Long id);

    /**
     * 查询checkIn列表
     * 
     * @param checkIn checkIn
     * @return checkIn集合
     */
    public List<CheckIn> selectCheckInList(CheckIn checkIn);

    /**
     * 新增checkIn
     * 
     * @param checkIn checkIn
     * @return 结果
     */
    public int insertCheckIn(CheckIn checkIn);

    /**
     * 修改checkIn
     * 
     * @param checkIn checkIn
     * @return 结果
     */
    public int updateCheckIn(CheckIn checkIn);

    /**
     * 批量删除checkIn
     * 
     * @param ids 需要删除的checkIn主键集合
     * @return 结果
     */
    public int deleteCheckInByIds(Long[] ids);

    /**
     * 删除checkIn信息
     * 
     * @param id checkIn主键
     * @return 结果
     */
    public int deleteCheckInById(Long id);
}