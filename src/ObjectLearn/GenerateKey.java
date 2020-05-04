package ObjectLearn;

import java.math.BigInteger;
import java.security.MessageDigest;

public class GenerateKey {
    private static String originKey = "4FQXq0xLptd0JS78h16p";

    private static String getMD5(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
        }
        return "";
    }

//    private static String getSalt() {
//        String saltUrl = "https://open.beva.com/v1/auth/get-salt-code";
//        String res = HttpClient.get(saltUrl);
//        if (StringUtils.isBlank(res)) {
//            return "";
//        }
//        JSONObject jsonObject = JSONObject.fromObject(res);
//        return jsonObject.getString("data");
//    }
//
//    private static String getAccessKey(String md5Salt, String salt) {
//        String url = "https://open.beva.com/v1/auth/get-access-token?appkey=APP-8&salt=%s&secret=%s";
//        String reqUrl = String.format(url, salt, md5Salt);
//        String res = HttpClient.get(reqUrl);
//        if (StringUtils.isBlank(res)) {
//            return "";
//        }
//        JSONObject jsonObject = JSONObject.fromObject(res);
//        return jsonObject.getString("data");
//    }

    public static void main(String args[]) {
        String salt = "1586763582";
        String md5access = originKey + salt;
        String md5 = getMD5(md5access);
        System.out.println("=====md5======:"+md5);

        String url = "https://open.beva.com/v1/auth/get-access-token?appkey=APP-8&salt=%s&secret=%s";
        String reqUrl = String.format(url,md5,salt);
        System.out.println("======reqUrl====:"+reqUrl);
//        return getAccessKey(md5, salt);
    }
}
