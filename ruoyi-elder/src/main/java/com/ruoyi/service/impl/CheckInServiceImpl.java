package com.ruoyi.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.domain.CheckIn;
import com.ruoyi.mapper.CheckInMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.service.ICheckInService;

/**
 * checkInService业务层处理
 * 
 * @author cfjg
 * @date 2024-06-21
 */
@Service
public class CheckInServiceImpl implements ICheckInService 
{
    @Autowired
    private CheckInMapper checkInMapper;

    /**
     * 查询checkIn
     * 
     * @param id checkIn主键
     * @return checkIn
     */
    @Override
    public CheckIn selectCheckInById(Long id)
    {
        return checkInMapper.selectCheckInById(id);
    }

    /**
     * 查询checkIn列表
     * 
     * @param checkIn checkIn
     * @return checkIn
     */
    @Override
    public List<CheckIn> selectCheckInList(CheckIn checkIn)
    {
        return checkInMapper.selectCheckInList(checkIn);
    }

    /**
     * 新增checkIn
     * 
     * @param checkIn checkIn
     * @return 结果
     */
    @Override
    public int insertCheckIn(CheckIn checkIn)
    {
        checkIn.setCreateTime(DateUtils.getNowDate());
        return checkInMapper.insertCheckIn(checkIn);
    }

    /**
     * 修改checkIn
     * 
     * @param checkIn checkIn
     * @return 结果
     */
    @Override
    public int updateCheckIn(CheckIn checkIn)
    {
        checkIn.setUpdateTime(DateUtils.getNowDate());
        return checkInMapper.updateCheckIn(checkIn);
    }

    /**
     * 批量删除checkIn
     * 
     * @param ids 需要删除的checkIn主键
     * @return 结果
     */
    @Override
    public int deleteCheckInByIds(Long[] ids)
    {
        return checkInMapper.deleteCheckInByIds(ids);
    }

    /**
     * 删除checkIn信息
     * 
     * @param id checkIn主键
     * @return 结果
     */
    @Override
    public int deleteCheckInById(Long id)
    {
        return checkInMapper.deleteCheckInById(id);
    }
}
