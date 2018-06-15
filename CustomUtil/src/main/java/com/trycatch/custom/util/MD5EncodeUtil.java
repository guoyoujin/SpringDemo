package com.trycatch.custom.util;


import java.security.MessageDigest;

public class MD5EncodeUtil {

    /**
     * 加密算法MD5
     *
     * @param text
     *            明文
     * @return String 密文
     */
    public final static String encoding(String text,String charset)
    {
        try {
            byte[] btInput = text.getBytes(charset);
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < md.length; i++) {
                int val = ((int) md[i]) & 0xff;
                if (val < 16){
                    sb.append("0");
                }
                sb.append(Integer.toHexString(val));
            }
            return sb.toString();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 加密算法MD5,默认编码 utf-8
     *
     * @param text
     *            明文
     * @return String 密文
     */
    public final static String encoding(String text)
    {
        return encoding(text,"utf-8");
    }
}
