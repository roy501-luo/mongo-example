package com.roy.mongo.controller.document;

import com.roy.mongo.service.document.SaveService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author roy
 */
@Api(tags = "文档操作-存储文档")
@RestController
@RequestMapping("/document")
public class SaveController {

    @Resource
    private SaveService saveService;

    @ApiOperation(value = "存储【一条文档】数据，如果文档信息已经【存在就执行更新】",
            notes = "存储【一条文档】数据，如果文档信息已经【存在就执行更新】。")
    @PostMapping("/save/one")
    public Object insertData() {
        return saveService.save();
    }

}
