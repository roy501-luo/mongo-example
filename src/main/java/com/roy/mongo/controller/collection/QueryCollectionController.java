package com.roy.mongo.controller.collection;

import com.roy.mongo.service.collection.QueryCollectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author roy
 */
@Api(tags = "集合操作-查询集合")
@RestController
@RequestMapping("/collection")
public class QueryCollectionController {

    @Resource
    private QueryCollectionService queryCollectionService;

    @ApiOperation(value = "获取【集合名称列表】", notes = "获取【集合名称列表】。")
    @GetMapping("/list")
    public Object getCollectionNameList() {
        return queryCollectionService.getCollectionNames();
    }

    @ApiOperation(value = "获取【集合名称列表】", notes = "获取【集合名称列表】。")
    @GetMapping("/exists")
    public Object getCollectionExists() {
        return queryCollectionService.collectionExists();
    }

}
