            package com.appsflyer.internal;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.AFLogger;
            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import java.security.InvalidKeyException;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.Arrays;
            import java.util.Locale;
            import java.util.Map;
            import javax.crypto.Mac;
            import javax.crypto.spec.SecretKeySpec;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 36 */    public final class AFj1dSDK {
                private static String AFAdRevenueData(byte[] bArr) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             for (byte b : bArr) {
/* 27 */                sb.append(Integer.toString((b & 255) + NotificationCompat.FLAG_LOCAL_ONLY, 16).substring(1));
                    }
/* 33 */            return sb.toString();
                }

                public static boolean getCurrencyIso4217Code(Map<String, Object> map, String[] strArr, AFc1oSDK aFc1oSDK) throws IllegalStateException {
/* 2 */             if (map == null || map.isEmpty()) {
/* 1 */                 return false;
                    }
/* 13 */            for (String str : strArr) {
/* 21 */                if (!map.containsKey(str)) {
/* 1 */                     return false;
                        }
                    }
/* 33 */            String str2 = (String) map.remove("sig");
/* 35 */            if (str2 == null) {
/* 1 */                 return false;
                    }
/* 38 */            String strComponent4 = AFc1oSDK.component4();
/* 44 */            StringBuilder sb = new StringBuilder();
/* 52 */            sb.append(new JSONObject(map));
/* 55 */            sb.append(strComponent4);
/* 72 */            return getMonetizationNetwork(sb.toString(), AFb1kSDK.getCurrencyIso4217Code(aFc1oSDK.getMediationNetwork)).equals(str2);
                }

                public static String getMonetizationNetwork(String str, String str2) {
                    try {
/* 3 */                 Mac mac = Mac.getInstance("HmacSHA256");
/* 20 */                mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
/* 43 */                return AFAdRevenueData(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
                    } catch (InvalidKeyException | NoSuchAlgorithmException e) {
/* 54 */                AFLogger.afErrorLog(e.getMessage(), e, true);
/* 57 */                return e.getMessage();
                    }
                }

                public static long getRevenue(byte[] bArr) {
/* 1 */             if (bArr == null || bArr.length <= 0) {
/* 31 */                return -1L;
                    }
/* 9 */             if (bArr.length > 8) {
/* 12 */                bArr = Arrays.copyOfRange(bArr, 0, 8);
                    }
/* 16 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
/* 20 */            byteBufferAllocate.put(bArr);
/* 23 */            byteBufferAllocate.flip();
/* 26 */            return byteBufferAllocate.getLong();
                }

/* 37 */        public static byte[] AFAdRevenueData(String str) {
                    try {
/* 38 */                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 39 */                messageDigest.update(str.getBytes(Charset.defaultCharset()));
/* 40 */                return messageDigest.digest();
                    } catch (Exception e) {
/* 41 */                AFLogger.afErrorLog("Error turning string to SHA-256 byte array", e);
                        return null;
                    }
                }

/* 77 */        public static String getCurrencyIso4217Code(String str) {
                    try {
/* 78 */                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 79 */                messageDigest.update(str.getBytes(Charset.defaultCharset()));
/* 80 */                return AFAdRevenueData(messageDigest.digest());
                    } catch (Exception e) {
/* 81 */                AFLogger.afErrorLog("Error turning data to SHA-256 string", e);
                        return null;
                    }
                }
            }
