package com.ruoyi.web.controller.integration;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.SysNotice;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wang
 * @description: 版本控制工具控制层
 * @date 2023-10-04 15:39:02
 */
@Controller
@RequestMapping("/integration/version")
public class VersionControlController extends BaseController {

    private final static String prefix = "integration/version";


    /**
     * @Description TODO
     * @Author wang
     * @Date 2023/10/4 16:00
     * @Parameters
     * @Return {@link String}
     */
    @RequiresPermissions("integration:version:view")
    @GetMapping()
    public String versionControl(){
        return prefix + "/versionControl";
    }

    /**
     * @Description 版本控制工具集合
     * @Author wang
     * @Date 2023/10/4 20:34
     * @Parameters  * @param
     * @Return {@link TableDataInfo}
     */
    @RequiresPermissions("integration:version:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(){
        startPage();
        List<SysNotice> list = new ArrayList<>();
        return getDataTable(list);
    }

}
