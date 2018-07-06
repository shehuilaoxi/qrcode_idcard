package com.djxs.qrcode;
import java.io.IOException;

import com.djxs.util.*;
public class CreatQrcodeTest {
    public static void main(String[]args) throws IOException{
    	QrcodeTest.CreateQrcode(5, 'Q', "科技一班尹希彤", "D:/djxsQrcode/QQ头像.jpg", 25, "D:/djxsQrcode/qrcode.png", "30,106,230", "151,80,180");
    }
}
