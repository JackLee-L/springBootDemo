package cn.gree.lwh.scheduled;

import cn.gree.lwh.service.commonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 260175 on 2018/8/24.
 * Author:JackLee -李文华
 * Email：18173910487@163.com
 * 描述：
 */
@Component
public class myScheduled {
    @Autowired
    private commonService commonService;

    private String[] myArray = {"ffx00002056-008","ffg00009867-014","gzbh001925-008","ffa00001045-016","ffa00001183-006","167719","142830","121629","023930","065526","100101","100074","059109","021403","110504"
            ,"002253","113932","143947","155219","105948","159911","150654","116910","096103","157994","066665","121624","033213","099340","110460","096791","128203","133491","111901","105975","148268"
            ,"159928","159909","159380","159922","177466","015142","071388","001","002","003","004","006","007","008","009","010","005"
    };

    @Scheduled(cron = "*/12 * * * * ?")
    public void doing() throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(new Date()));
        for(String Array: myArray){
            String response = (String) commonService.getCommon(Array) + "\n";

            System.out.println(Array);

            FileOutputStream fileOutputStream = new FileOutputStream("D:\\IdeaProject\\SpringBootDemo\\BluetoothData.json", true);
            OutputStreamWriter outputStream = new OutputStreamWriter(fileOutputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStream);
            bufferedWriter.write(response);
            bufferedWriter.close();

            System.out.println("文件写入成功！");
        }
        System.out.println(df.format(new Date()));
        System.out.println("========================================================================================================");
    }
}
