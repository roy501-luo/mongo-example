package com.roy.mongo.controller.collection;

import com.roy.mongo.service.collection.ViewService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author roy
 */
@Api(tags = "集合操作-视图操作")
@RestController
@RequestMapping("/view")
public class ViewController {

    @Resource
    private ViewService viewService;

    @ApiOperation(value = "创建【集合视图】", notes = "创建【视图】。")
    @GetMapping
    public Object createView() {
        return viewService.createView();
    }

    @ApiOperation(value = "删除【集合视图】", notes = "删除【视图】。")
    @DeleteMapping
    public Object dropView() {
        return viewService.dropView();
    }

}
