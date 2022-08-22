package com.chou.Controller;


import com.chou.Util.POIUtils;
import com.chou.config.ResultsPage;
import com.chou.service.impl.CoordinateDepthServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.transform.Result;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@RestController
@Api(tags = "读取Excel API")
public class GetExcelController {

    @Autowired
    private CoordinateDepthServiceImpl coordinateDepthService;
    //POI结构
//    HSSF － 提供读写Microsoft Excel XLS格式档案的功能
//    XSSF － 提供读写Microsoft Excel OOXML XLSX格式档案的功能
//    HWPF － 提供读写Microsoft Word DOC格式档案的功能
//    HSLF － 提供读写Microsoft PowerPoint格式档案的功能
//    HDGF － 提供读Microsoft Visio格式档案的功能
//    HPBF － 提供读Microsoft Publisher格式档案的功能
//    HSMF － 提供读Microsoft Outlook格式档案的功能

    @GetMapping("/getExcel")
    @ApiOperation(value = "读取Excel")
    public ResultsPage getExcel() throws IOException {
        File file  = new File("C:\\Users\\10727\\Desktop\\数据交换SQL表结构.xlsx");
        //File文件转MultipartFile
        FileInputStream input = new FileInputStream(file);
        MultipartFile excelFile = new MockMultipartFile("file", file.getName(), "text/plain", IOUtils.toByteArray(input));
        try {
            //读取Excel文件数据
            List<String[]> list = POIUtils.readExcel(excelFile);

            if(list != null && list.size() > 0){
//                List<OrderSetting> orderSettingList = new ArrayList<>();
                for (String[] strings : list) {
                    System.out.println("第一个数列"+strings[0]);
                    System.out.println("第二个数列"+strings[1]);
                    System.out.println("第三个数列"+strings[2]);
//                    OrderSetting orderSetting =
//                            new OrderSetting(new Date(strings[0]), Integer.parseInt(strings[1]));
//                    orderSettingList.add(orderSetting);
                }
//                orderSettingService.add(orderSettingList);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return ResultsPage.Error("读取失败！") ;
        }
        return ResultsPage.succeed("添加成功！") ;
    }



}
