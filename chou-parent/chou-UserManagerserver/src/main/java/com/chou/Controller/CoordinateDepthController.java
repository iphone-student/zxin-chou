package com.chou.Controller;


import com.chou.dao.CoordinateDepth;
import com.chou.service.impl.CoordinateDepthServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@Api(tags = "文本转数据库 API")
public class CoordinateDepthController {

    @Autowired
    private CoordinateDepthServiceImpl coordinateDepthService;


    @GetMapping("/txt2DB")
    @ApiOperation(value = "文本转数据库")
    public String txt2DB() throws IOException {
        File file = new File("C:\\Users\\10727\\Desktop\\6、坐标水深.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"utf-8"));
        String TempNum = "";
        int user = 0;

        while((TempNum = br.readLine())!= null){
//            System.out.println(TempNum);
            //1.创建匹配模式
            Pattern pattern = Pattern.compile("(-?[1-9]\\d*\\.?\\d*)|(-?(0\\.\\d*[1-9]))");//匹配一个或多个数字字符带负号

            //2.选择匹配对象
            Matcher matcher = pattern.matcher(TempNum);
            //与谁匹配？与参数字符串str匹配
            int count = 0;
            double [] a = new double[4];
            while (matcher.find())//matcher.find()用于查找是否有这个字符，有的话返回true
            {
                ++count;
//                System.out.println("第" + (index) + "次找到");
                //start()返回上一个匹配项的起始索引
                //end()返回上一个匹配项的末尾索引。
                System.out.println(TempNum.substring(matcher.start(), matcher.end()));
                a[count] = Double.parseDouble(TempNum.substring(matcher.start(),matcher.end()));
                //System.out.println(Double.parseDouble(TempNum.substring(matcher.start(),matcher.end())));

            }
//            System.out.println("数组： "+a[0]+"++"+a[1]+"++"+a[2]+"++"+a[3]);
                   user = coordinateDepthService.txt2DB(a[1],a[2],a[3]);
        }

        return user > 0 ? "操作成功": "失败！！！";
    }



}
