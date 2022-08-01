package com.roy.mongo.controller.collection;

import com.roy.mongo.service.collection.RemoveCollectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author roy
 */
@Api(tags = "集合操作-删除集合")
@RestController
@RequestMapping("/collection")
public class RemoveCollectionController {

    @Resource
    private RemoveCollectionService removeCollectionService;

    @ApiOperation(value = "删除【集合】", notes = "删除【集合结果】。")
    @DeleteMapping("/drop")
    public Object dropCollection() {
        return removeCollectionService.dropCollection();
    }

}
