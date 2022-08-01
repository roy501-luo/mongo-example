package com.roy.mongo.controller.command;

import com.roy.mongo.service.command.RunCommandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author roy
 */
@Api(tags = "RunCommand 命令")
@RestController
@RequestMapping("/command")
public class RunCommandController {

    @Resource
    private RunCommandService runCommandService;

    @ApiOperation(value = "执行【runCommand】自定义命令", notes = "执行【runCommand】自定义命令。")
    @GetMapping
    public Object runCommand() {
        return runCommandService.runCommand();
    }

}
