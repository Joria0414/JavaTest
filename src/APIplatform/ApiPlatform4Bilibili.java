package APIplatform;

import com.sun.istack.internal.localization.NullLocalizable;

import java.security.MessageDigest;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ApiPlatform4Bilibili{
    private static String appSecret = "arPe3Yzq42b28fv1daza2d";
    private static String appkey = "xiaomi_xiaoai";

    public static void getSign() throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("appkey", "xiaomi_xiaoai");
        params.put("ts", "1555048539");
        params.put("ps", "100");
        params.put("pn", "1");
        params.put("type", "1");
        List<String> sortParams = params.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).map(v -> v.getKey() + "=" + v.getValue()).collect(Collectors.toList());
        String secretParams = String.join("&", sortParams) + appSecret;
        MessageDigest digest = MessageDigest.getInstance("md5");
        byte[] result = digest.digest(secretParams.getBytes());
        StringBuilder buffer = new StringBuilder();
        // 把每一个byte 做一个与运算 0xff;
        for (byte b : result) {
            // 与运算
            int number = b & 0xff;// 加盐
            String str = Integer.toHexString(number);
            if (str.length() == 1) {
                buffer.append("0");
            }
            buffer.append(str);
        }
        System.out.println(buffer.toString());
    }

    public static void main(String[] args) throws Exception {
         getSign();
    }



}
