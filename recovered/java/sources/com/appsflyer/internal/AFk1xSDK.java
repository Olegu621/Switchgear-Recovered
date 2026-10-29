            package com.appsflyer.internal;

            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.Arrays;
            import kotlin.text.Charsets;
            import kotlin.text.MatchGroup;
            import kotlin.text.Regex;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import p000.ra2;
            import p000.sc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 98 */    public final class AFk1xSDK {
                public static final int getMediationNetwork(String str) {
                    String str2;
                    Integer intOrNull;
                    String str3;
                    Integer intOrNull2;
                    String str4;
                    Integer intOrNull3;
/* 1 */             str.getClass();
/* 11 */            ra2 ra2VarM6222a = new Regex("(\\d+).(\\d+).(\\d+).*").m6222a(str);
/* 15 */            if (ra2VarM6222a == null) {
/* 98 */                return -1;
                    }
/* 19 */            sc1 sc1Var = (sc1) ra2VarM6222a.f15957c;
/* 22 */            MatchGroup matchGroupM8477a = sc1Var.m8477a(1);
/* 26 */            int iIntValue = 0;
/* 48 */            int iIntValue2 = ((matchGroupM8477a == null || (str4 = matchGroupM8477a.f12935a) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
/* 50 */            MatchGroup matchGroupM8477a2 = sc1Var.m8477a(2);
/* 74 */            int iIntValue3 = (((matchGroupM8477a2 == null || (str3 = matchGroupM8477a2.f12935a) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * 1000) + iIntValue2;
/* 76 */            MatchGroup matchGroupM8477a3 = sc1Var.m8477a(3);
/* 80 */            if (matchGroupM8477a3 != null && (str2 = matchGroupM8477a3.f12935a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
/* 92 */                iIntValue = intOrNull.intValue();
                    }
/* 96 */            return iIntValue3 + iIntValue;
                }

/* 99 */        public static final String getMediationNetwork(String str, String str2) throws NoSuchAlgorithmException {
/* 100 */           MessageDigest messageDigest = MessageDigest.getInstance(str2);
/* 101 */           byte[] bytes = str.getBytes(Charsets.UTF_8);
                    bytes.getClass();
                    byte[] bArrDigest = messageDigest.digest(bytes);
                    bArrDigest.getClass();
                    String strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
                    for (byte b : bArrDigest) {
/* 103 */               strConcat = strConcat.concat(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
                    }
                    return strConcat;
                }
            }
