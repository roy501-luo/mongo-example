package com.roy.mongo.controller.document;

import com.roy.mongo.service.document.InsertService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author roy
 */
@Api(tags = "文档操作-插入文档")
@RestController
@RequestMapping("/document")
public class InsertController {

    @Resource
    private InsertService insertService;

    @ApiOperation(value = "插入【一条】文档数据，如果文档信息已经【存在就抛出异常】",
            notes = "插入【一条】文档数据，如果文档信息已经【存在就抛出异常】。")
    @PostMapping("/insert/one")
    public Object insertData() {
        return insertService.insert();
    }

    @ApiOperation(value = "插入【多条】文档数据，如果文档信息已经【存在就抛出异常】",
            notes = "插入【多条】文档数据，如果文档信息已经【存在就抛出异常】。")
    @PostMapping("/insert/many")
    public Object insertManyData() {
        return insertService.insertMany();
    }

}
