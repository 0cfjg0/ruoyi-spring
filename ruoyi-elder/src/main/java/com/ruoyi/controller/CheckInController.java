package com.ruoyi.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.domain.CheckIn;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.service.ICheckInService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * checkInController
 * 
 * @author cfjg
 * @date 2024-06-21
 */
@RestController
@RequestMapping("/checkInOut/checkIn")
public class CheckInController extends BaseController
{
    @Autowired
    private ICheckInService checkInService;

    /**
     * 查询checkIn列表
     */
    @PreAuthorize("@ss.hasPermi('checkInOut:checkIn:list')")
    @GetMapping("/list")
    public TableDataInfo list(CheckIn checkIn)
    {
        startPage();
        List<CheckIn> list = checkInService.selectCheckInList(checkIn);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        list.stream().forEach(item->{item.checkTime = df.format(item.getCheckInStartTime())+"~"+df.format(item.getCheckInEndTime());});
        return getDataTable(list);
    }

    /**
     * 导出checkIn列表
     */
    @PreAuthorize("@ss.hasPermi('checkInOut:checkIn:export')")
    @Log(title = "checkIn", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CheckIn checkIn)
    {
        List<CheckIn> list = checkInService.selectCheckInList(checkIn);
        ExcelUtil<CheckIn> util = new ExcelUtil<CheckIn>(CheckIn.class);
        util.exportExcel(response, list, "checkIn数据");
    }

    /**
     * 获取checkIn详细信息
     */
    @PreAuthorize("@ss.hasPermi('checkInOut:checkIn:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        CheckIn item = checkInService.selectCheckInById(id);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        item.checkTime = df.format(item.getCheckInStartTime())+"~"+df.format(item.getCheckInEndTime());
        return success(item);
    }

    /**
     * 新增checkIn
     */
    @PreAuthorize("@ss.hasPermi('checkInOut:checkIn:add')")
    @Log(title = "checkIn", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CheckIn checkIn)
    {
        return toAjax(checkInService.insertCheckIn(checkIn));
    }

    /**
     * 修改checkIn
     */
    @PreAuthorize("@ss.hasPermi('checkInOut:checkIn:edit')")
    @Log(title = "checkIn", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CheckIn checkIn)
    {
        return toAjax(checkInService.updateCheckIn(checkIn));
    }

    /**
     * 删除checkIn
     */
    @PreAuthorize("@ss.hasPermi('checkInOut:checkIn:remove')")
    @Log(title = "checkIn", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(checkInService.deleteCheckInByIds(ids));
    }
}
