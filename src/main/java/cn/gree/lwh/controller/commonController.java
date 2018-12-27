package cn.gree.lwh.controller;

import cn.gree.lwh.entity.Response;
import cn.gree.lwh.service.commonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 260175 on 2018/8/24.
 * Author:JackLee -李文华
 * Email：18173910487@163.com
 * 描述： 调用该接口用于获取港大的数据
 *        访问地址 http://localhost:8084/common/getData
 */
@Controller
@RequestMapping(value = "common")
public class commonController {
    @Autowired
    private commonService commonService;

    private String[] myArray = {"ffx00002056-008","ffg00009867-014","gzbh001925-008","ffa00001045-016","ffa00001183-006","167719","142830","121629","023930","065526","100101","100074","059109","021403","110504"
            ,"002253","113932","143947","155219","105948","159911","150654","116910","096103","157994","066665","121624","033213","099340","110460","096791","128203","133491","111901","105975","148268"
            ,"159928","159909","159380","159922","177466","015142","071388","001","002","003","004","006","007","008","009","010","005"
    };

    @RequestMapping(value="getData")
    public @ResponseBody
    Object getCommonCon()throws Exception{
        Response result = null;
        for (String Array : myArray){
            result = (Response) commonService.getCommon(Array);
        }
        return result;
    }
}
