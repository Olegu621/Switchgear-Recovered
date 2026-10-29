            package com.appsflyer.internal;

            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.Arrays;
            import kotlin.Pair;
            import kotlin.text.Charsets;
            import kotlin.text.MatchGroup;
            import kotlin.text.Regex;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import p000.C2103qd;
            import p000.ra2;
            import p000.sc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 147 */   public final class AFd1rSDK {
                public static final Pair<Integer, Integer> AFAdRevenueData(String str) {
                    String str2;
                    String str3;
                    String str4;
/* 1 */             str.getClass();
/* 11 */            ra2 ra2VarM6222a = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").m6222a(str);
/* 16 */            if (ra2VarM6222a != null) {
/* 20 */                sc1 sc1Var = (sc1) ra2VarM6222a.f15957c;
/* 23 */                MatchGroup matchGroupM8477a = sc1Var.m8477a(1);
/* 38 */                Integer intOrNull = (matchGroupM8477a == null || (str4 = matchGroupM8477a.f12935a) == null) ? null : StringsKt.toIntOrNull(str4);
/* 40 */                MatchGroup matchGroupM8477a2 = sc1Var.m8477a(3);
/* 55 */                Integer intOrNull2 = (matchGroupM8477a2 == null || (str3 = matchGroupM8477a2.f12935a) == null) ? null : StringsKt.toIntOrNull(str3);
/* 57 */                MatchGroup matchGroupM8477a3 = sc1Var.m8477a(4);
/* 72 */                Integer intOrNull3 = (matchGroupM8477a3 == null || (str2 = matchGroupM8477a3.f12935a) == null) ? null : StringsKt.toIntOrNull(str2);
/* 76 */                if (intOrNull != null) {
/* 100 */                   return new Pair<>(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
                        }
/* 104 */               if (intOrNull2 != null && intOrNull3 != null) {
/* 144 */                   return new Pair<>(Integer.valueOf((intOrNull3.intValue() * 1000) + (intOrNull2.intValue() * 1000000)), Integer.valueOf((((intOrNull3.intValue() + 1) * 1000) + (intOrNull2.intValue() * 1000000)) - 1));
                        }
                    }
/* 15 */            return null;
                }

                public static final String getCurrencyIso4217Code(String str) {
/* 1 */             str.getClass();
/* 14 */            return "[Exception Manager]: " + str;
                }

                public static final Pair<Integer, Integer> getMonetizationNetwork(String str) {
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
/* 1 */             str.getClass();
/* 11 */            ra2 ra2VarM6222a = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").m6222a(str);
/* 16 */            if (ra2VarM6222a != null) {
/* 20 */                sc1 sc1Var = (sc1) ra2VarM6222a.f15957c;
/* 23 */                MatchGroup matchGroupM8477a = sc1Var.m8477a(1);
/* 39 */                Integer intOrNull = (matchGroupM8477a == null || (str7 = matchGroupM8477a.f12935a) == null) ? null : StringsKt.toIntOrNull(str7);
/* 41 */                MatchGroup matchGroupM8477a2 = sc1Var.m8477a(2);
/* 57 */                Integer intOrNull2 = (matchGroupM8477a2 == null || (str6 = matchGroupM8477a2.f12935a) == null) ? null : StringsKt.toIntOrNull(str6);
/* 59 */                MatchGroup matchGroupM8477a3 = sc1Var.m8477a(3);
/* 75 */                Integer intOrNull3 = (matchGroupM8477a3 == null || (str5 = matchGroupM8477a3.f12935a) == null) ? null : StringsKt.toIntOrNull(str5);
/* 77 */                MatchGroup matchGroupM8477a4 = sc1Var.m8477a(4);
/* 93 */                Integer intOrNull4 = (matchGroupM8477a4 == null || (str4 = matchGroupM8477a4.f12935a) == null) ? null : StringsKt.toIntOrNull(str4);
/* 95 */                MatchGroup matchGroupM8477a5 = sc1Var.m8477a(5);
/* 111 */               Integer intOrNull5 = (matchGroupM8477a5 == null || (str3 = matchGroupM8477a5.f12935a) == null) ? null : StringsKt.toIntOrNull(str3);
/* 113 */               MatchGroup matchGroupM8477a6 = sc1Var.m8477a(6);
/* 129 */               Integer intOrNull6 = (matchGroupM8477a6 == null || (str2 = matchGroupM8477a6.f12935a) == null) ? null : StringsKt.toIntOrNull(str2);
/* 134 */               Integer num = intOrNull6;
/* 139 */               if (AFAdRevenueData(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
/* 141 */                   intOrNull.getClass();
/* 151 */                   int iIntValue = intOrNull.intValue() * 1000000;
/* 152 */                   intOrNull2.getClass();
/* 161 */                   int iIntValue2 = (intOrNull2.intValue() * 1000) + iIntValue;
/* 162 */                   intOrNull3.getClass();
/* 170 */                   Integer numValueOf = Integer.valueOf(intOrNull3.intValue() + iIntValue2);
/* 174 */                   intOrNull4.getClass();
/* 181 */                   int iIntValue3 = intOrNull4.intValue() * 1000000;
/* 182 */                   intOrNull5.getClass();
/* 191 */                   int iIntValue4 = (intOrNull5.intValue() * 1000) + iIntValue3;
/* 192 */                   num.getClass();
/* 206 */                   return new Pair<>(numValueOf, Integer.valueOf(num.intValue() + iIntValue4));
                        }
                    }
/* 15 */            return null;
                }

/* 148 */       public static final String AFAdRevenueData(String str, String str2) throws NoSuchAlgorithmException {
/* 149 */           MessageDigest messageDigest = MessageDigest.getInstance(str2);
/* 150 */           byte[] bytes = str.getBytes(Charsets.UTF_8);
                    bytes.getClass();
                    byte[] bArrDigest = messageDigest.digest(bytes);
                    bArrDigest.getClass();
                    String strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
                    for (byte b : bArrDigest) {
/* 152 */               strConcat = strConcat.concat(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
                    }
                    return strConcat;
                }

/* 152 */       private static boolean AFAdRevenueData(Object... objArr) {
                    objArr.getClass();
                    return !C2103qd.m7772g(objArr, null);
                }
            }
