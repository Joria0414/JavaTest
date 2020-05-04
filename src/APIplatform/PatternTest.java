package APIplatform;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void  main(String[] args){
////        小王在第一个task中遇到的问题
//
//        String a = "abc";
//        String b = "bcd";
//
//        if(a.compareTo(b) < 0 ){
//            System.out.println(a);
//        }
//
//        /**
//         * 用split提取字符串中的信息
//         */
//        String INPUT = "wang-yi-lin-yeah";
//        String[] InputGroup=INPUT.split("-");
//        int i;
//        for ( i=0;i<InputGroup.length;i++)
//            System.out.println(i + ":" + InputGroup[i] + " " );
//
//
//        /**
//         * 泛型arrayList的使用
//         */
//
//        String[] stringList = {"1"};
//        ArrayList<String> stringArrayList = new ArrayList<>() ;
//        stringArrayList.add("1");
//        //stringList[1]="2";
//
//        System.out.println(stringArrayList.get(0));
//
//        /**
//         * 正则表达式提取关键字段
//         */
//
//        String AudioInfo = "feedsshort_shortvideo_1234556_ext";
//        Pattern pattern = Pattern.compile("([0-9a-zA-Z]+)_([0-9a-zA-Z]+)_([0-9a-zA-Z_]+)_ext(_*)([0-9a-zA-Z]*)");
//        Matcher matcher = pattern.matcher(AudioInfo);
//        while(matcher.find()){
//            System.out.println(matcher.group(1));
//            System.out.println(matcher.group(3));
//            //System.out.println(matcher.group(2));
//        }
//
//        /**
//         * 正则表达式对字符串进行变换操作
//         */
//        // 去除单词与 , 和 . 之间的空格
//        String Str = "Hello , World .";
//        String pattern1 = "(\\w)(\\s+)([.,])";
//        // $0 匹配 `(\w)(\s+)([.,])` 结果为 `o空格,` 和 `d空格.`
//        // $1 匹配 `(\w)` 结果为 `o` 和 `d`
//        // $2 匹配 `(\s+)` 结果为 `空格` 和 `空格`
//        // $3 匹配 `([.,])` 结果为 `,` 和 `.`
//        System.out.println(Str.replaceAll(pattern1, "$1$3")); // Hello, World.

//        String str = "@wxj 你好啊";
//        Pattern pattern2 = Pattern.compile("@(?<first>\\w+\\s)"); // 保存一个副本
//        Matcher matcher1 = pattern2.matcher(str);
//        while (matcher1.find()) {
//            System.out.println(matcher1.group());
//            System.out.println(matcher1.group(1));
//            System.out.println(matcher1.group("first"));
//        }


//        Pattern pattern = Pattern.compile("(\\?|&)([^&]+)=([^&]+)(&|$)");
//        Matcher matcher = pattern.matcher(str);
//        List<String> parms = new ArrayList<String>();
//        int index=0;
//        while (matcher.find(index)) {
//            index = matcher.end()-1;
//            parms.add(matcher.group(2)+"="+matcher.group(3));
//        }
//        System.out.println(parms.toString());
        String str = "/api/proxy/douban/v2/movie/business_data/search?apikey=062d8a35e030e35e12889ea1a092aa1a&q=红海行动";
        String prePath = "/api/proxy/";
//        Pattern p = Pattern.compile("^"+prePath+"\\/([A-Za-z0-9]+)\\/");
        Pattern p = Pattern.compile("^"+prePath+"([A-Za-z0-9]+)");
        Matcher matcher = p.matcher(str);
        String requestPath = null;
        if(matcher.find()){
            requestPath = matcher.group(1);
        }
        System.out.println(requestPath);



//        String str ="http://localhost:8266/api/proxy/douban/v2/movie/business_data/search?apikey=062d8a35e030e35e12889ea1a092aa1a&q=红海行动";
//        Pattern pattern = Pattern.compile("(&|\\?)([A-Za-z0-9]+)=([A-Za-z0-9]+)(&|$)");
//        Matcher matcher = pattern.matcher(str);
//        List<String> parms = new ArrayList<String>();
//        while (matcher.find()) {
//            parms.add(matcher.group(2)+"="+matcher.group(3));
//        }
//        System.out.println(parms.toString());


//        /**
//         * 字符串的比较
//         */
//
//        String host = "http://c3-feeds-bench05.bj:9733";
//        String path = "/meta/get";
//        String RequestUrl = null;
//
//        RequestUrl = host + path;
//        System.out.println(RequestUrl);
//
//       String cp = "feedsshort";
//        String cp1 = "feedsshort";
//        String cp3 = cp + cp1;
//        if(cp == "feedsshort") {
//            System.out.println("==: "+true);
//        }
//        else {
//            System.out.println("==: "+false);
//        }
//
//        if(cp.equals("feedsshort")) {
//            System.out.println("equals: " +true);
//        }
//        else {
//            System.out.println("equals: "+false);
//        }
//
//        if(cp.equals(cp1)) {
//            System.out.println("equals cp1: " +true);
//        }
//        else {
//            System.out.println("equals cp1: "+false);
//        }


        /*AudioInfo.put("name",NiuKeWebsite.node.get(requestBody.).get("data").get("metaMap").get("title"));
        AudioInfo.put("horizontal_img_url",NiuKeWebsite.node.get("data").get("metaMap").get("thumbnails"));
        AudioInfo.put("play_length",NiuKeWebsite.node.get("data").get("metaMap").get("duration"));
        AudioInfo.put("style",NiuKeWebsite.node.get("data").get("metaMap").get("category"));

        ObjectMapper mapper = new ObjectMapper();
        JsonNode NiuKeWebsite.node = mapper.readTree(message);
        JSONObject AudioInfo = new JSONObject();*/



    }
}

