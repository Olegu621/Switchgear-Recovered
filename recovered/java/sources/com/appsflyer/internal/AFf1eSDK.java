            package com.appsflyer.internal;

            import android.content.Context;
            import android.os.Process;
            import android.telephony.TelephonyManager;
            import android.text.AndroidCharacter;
            import android.text.TextUtils;
            import android.util.Base64;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerProperties;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.nio.charset.Charset;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 29 */    public final class AFf1eSDK {
                private static int $10 = 0;
                private static int $11 = 1;
                private static char areAllFieldsValid = 28972;
                private static char component4 = 39723;
                private static char copydefault = 3892;
                private static int equals = 0;
                private static int hashCode = 1;
                private static char toString = 50688;
                private volatile String component1;
                private volatile String component2;
                private final AFf1dSDK getCurrencyIso4217Code;
                Map<String, Object> getMediationNetwork;
                private final AFc1hSDK getMonetizationNetwork;
                private long getRevenue;
                private boolean AFAdRevenueData = false;
                private volatile boolean component3 = false;

                public AFf1eSDK(AFc1hSDK aFc1hSDK, AFf1dSDK aFf1dSDK) {
/* 9 */             this.getMonetizationNetwork = aFc1hSDK;
/* 11 */            this.getCurrencyIso4217Code = aFf1dSDK;
                }

                /* JADX INFO: renamed from: a */
                private static void m1798a(String str, int i, Object[] objArr) {
/* 8 */             char[] charArray = str != null ? str.toCharArray() : str;
/* 14 */            AFk1qSDK aFk1qSDK = new AFk1qSDK();
/* 18 */            char[] cArr = new char[charArray.length];
/* 21 */            aFk1qSDK.getRevenue = 0;
/* 24 */            char[] cArr2 = new char[2];
                    while (true) {
/* 26 */                int i2 = aFk1qSDK.getRevenue;
/* 29 */                if (i2 >= charArray.length) {
/* 157 */                   objArr[0] = new String(cArr, 0, i);
/* 159 */                   return;
                        }
/* 37 */                $10 = ($11 + 39) % 128;
/* 41 */                cArr2[0] = charArray[i2];
/* 48 */                cArr2[1] = charArray[i2 + 1];
/* 50 */                int i3 = 58224;
/* 56 */                for (int i4 = 0; i4 < 16; i4++) {
/* 64 */                    $11 = ($10 + 91) % 128;
/* 66 */                    char c = cArr2[1];
/* 68 */                    char c2 = cArr2[0];
/* 98 */                    char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (((long) copydefault) ^ (-1199070254561146252L))))) ^ ((c2 >>> 5) + ((char) (((long) toString) ^ (-1199070254561146252L))))));
/* 99 */                    cArr2[1] = c3;
/* 125 */                   cArr2[0] = (char) (c2 - (((c3 >>> 5) + ((char) (((long) areAllFieldsValid) ^ (-1199070254561146252L)))) ^ ((c3 + i3) ^ ((c3 << 4) + ((char) (((long) component4) ^ (-1199070254561146252L)))))));
/* 130 */                   i3 -= 40503;
                        }
/* 134 */               int i5 = aFk1qSDK.getRevenue;
/* 138 */               cArr[i5] = cArr2[0];
/* 144 */               cArr[i5 + 1] = cArr2[1];
/* 147 */               aFk1qSDK.getRevenue = i5 + 2;
                    }
                }

                private boolean component1() {
/* 1 */             int i = hashCode;
/* 7 */             equals = (i + 83) % 128;
/* 9 */             Map<String, Object> map = this.getMediationNetwork;
/* 11 */            if (map == null) {
/* 35 */                return false;
                    }
/* 17 */            equals = (i + 69) % 128;
/* 23 */            if (map.isEmpty()) {
/* 35 */                return false;
                    }
/* 31 */            hashCode = (equals + 47) % 128;
/* 33 */            return true;
                }

                private long component2() {
/* 21 */            return ((Long) getCurrencyIso4217Code(new Object[]{this}, -518249890, 518249890, System.identityHashCode(this))).longValue();
                }

                public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
/* 6 */             int i4 = ~i;
/* 9 */             int i5 = ~((~i3) | i4);
/* 32 */            int i6 = (((~(i | i2 | i3)) | i5) * 338) + ((~(i4 | i2)) * 338) + (((~((~i2) | i)) | i5 | (~(i | i3))) * (-338)) + (i2 * 339) + (i * (-337));
/* 35 */            if (i6 == 1) {
/* 95 */                AFf1eSDK aFf1eSDK = (AFf1eSDK) objArr[0];
/* 99 */                AFc1oSDK aFc1oSDK = (AFc1oSDK) objArr[1];
/* 103 */               StringBuilder sb = new StringBuilder();
/* 112 */               sb.append(AFb1kSDK.getCurrencyIso4217Code(aFc1oSDK.getMediationNetwork));
/* 139 */               sb.append(((Long) getCurrencyIso4217Code(new Object[]{aFf1eSDK}, -518249890, 518249890, System.identityHashCode(aFf1eSDK))).longValue());
/* 150 */               long revenue = AFj1dSDK.getRevenue(AFj1dSDK.AFAdRevenueData(sb.toString()));
/* 160 */               equals = (hashCode + 35) % 128;
/* 162 */               return Long.valueOf(revenue);
                    }
/* 38 */            if (i6 != 2) {
/* 42 */                AFf1eSDK aFf1eSDK2 = (AFf1eSDK) objArr[0];
/* 44 */                int i7 = hashCode;
/* 50 */                equals = (i7 + 117) % 128;
/* 52 */                long j = aFf1eSDK2.getRevenue;
/* 58 */                equals = (i7 + 51) % 128;
/* 60 */                return Long.valueOf(j);
                    }
/* 67 */            AFf1eSDK aFf1eSDK3 = (AFf1eSDK) objArr[0];
/* 71 */            String str = (String) objArr[1];
/* 79 */            equals = (hashCode + 91) % 128;
/* 81 */            aFf1eSDK3.component2 = str;
/* 89 */            hashCode = (equals + 53) % 128;
/* 91 */            return null;
                }

                public static boolean getRevenue(AFh1mSDK aFh1mSDK, AFc1oSDK aFc1oSDK) {
                    String str;
/* 7 */             equals = (hashCode + 115) % 128;
/* 17 */            if (AFk1wSDK.getMonetizationNetwork(aFc1oSDK.AFAdRevenueData)) {
/* 31 */                String currencyIso4217Code = aFc1oSDK.getCurrencyIso4217Code("com.appsflyer.security.uuid");
/* 39 */                if (AFk1wSDK.getMonetizationNetwork(currencyIso4217Code)) {
/* 41 */                    str = null;
                        } else {
/* 45 */                    String strSubstring = currencyIso4217Code.substring(0, 8);
/* 49 */                    aFc1oSDK.AFAdRevenueData = strSubstring;
/* 51 */                    str = strSubstring;
                        }
                    } else {
/* 19 */                str = aFc1oSDK.AFAdRevenueData;
/* 26 */                hashCode = (equals + 1) % 128;
                    }
/* 52 */            if (str != null) {
/* 60 */                hashCode = (equals + 83) % 128;
/* 66 */                if (!str.isEmpty()) {
                            try {
/* 69 */                        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
/* 81 */                        Object[] objArr = new Object[1];
/* 83 */                        m1798a("颸╊Џ誢䚯ྸ\uf0ec⣑缞腁羥燓", '<' - AndroidCharacter.getMirror('0'), objArr);
/* 102 */                       long j = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
/* 106 */                       char[] charArray = str.toCharArray();
/* 114 */                       int i = ((int) (j % 94)) + 33;
/* 118 */                       for (int i2 = 0; i2 < charArray.length; i2++) {
/* 124 */                           charArray[i2] = (char) (charArray[i2] ^ i);
                                }
/* 153 */                       aFh1mSDK.getMediationNetwork.put("af-sdk-sbid", Base64.encodeToString(new String(charArray).getBytes(Charset.defaultCharset()), 2));
/* 15 */                        return true;
                            } catch (Exception e) {
/* 163 */                       AFLogger.INSTANCE.m1811e(AFg1cSDK.GENERAL, "Exception occurred while generating sbid ", e);
                            }
                        }
                    }
/* 16 */            return false;
                }

                public final String AFAdRevenueData() {
/* 3 */             int i = equals + 89;
/* 7 */             hashCode = i % 128;
/* 9 */             int i2 = i % 2;
/* 11 */            String str = this.component2;
/* 14 */            if (i2 == 0) {
/* 30 */                throw null;
                    }
/* 18 */            int i3 = equals + 81;
/* 22 */            hashCode = i3 % 128;
/* 26 */            if (i3 % 2 != 0) {
/* 28 */                return str;
                    }
/* 29 */            throw null;
                }

                public final void component4() {
                    Map<String, Object> map;
                    Object currencyIso4217Code;
/* 3 */             int i = equals + 55;
/* 7 */             hashCode = i % 128;
/* 21 */            if (i % 2 == 0) {
/* 36 */                this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() / this.getRevenue));
/* 39 */                map = this.getMediationNetwork;
/* 49 */                currencyIso4217Code = getCurrencyIso4217Code(new Object[]{this}, -518249890, 518249890, System.identityHashCode(this));
                    } else {
/* 80 */                this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() - this.getRevenue));
/* 83 */                map = this.getMediationNetwork;
/* 93 */                currencyIso4217Code = getCurrencyIso4217Code(new Object[]{this}, -518249890, 518249890, System.identityHashCode(this));
                    }
/* 63 */            map.put("lvl_timestamp", Long.valueOf(((Long) currencyIso4217Code).longValue()));
                }

                public final Map<String, Object> getMediationNetwork(Map<String, Object> map) {
                    try {
                        try {
/* 15 */                    Object[] objArr = {map, this.getMonetizationNetwork.getMonetizationNetwork};
/* 23 */                    Map map2 = AFa1hSDK.f3072d;
/* 25 */                    Object declaredConstructor = map2.get(-532394666);
/* 29 */                    if (declaredConstructor == null) {
/* 65 */                        declaredConstructor = ((Class) AFa1hSDK.getRevenue(Process.getGidForName(HttpUrl.FRAGMENT_ENCODE_SET) + WebSocketProtocol.PAYLOAD_SHORT, (char) TextUtils.getCapsMode(HttpUrl.FRAGMENT_ENCODE_SET, 0, 0), 36 - (Process.myTid() >> 22))).getDeclaredConstructor(Map.class, Context.class);
/* 69 */                        map2.put(-532394666, declaredConstructor);
                            }
/* 78 */                    Map<String, Object> map3 = (Map) ((Constructor) declaredConstructor).newInstance(objArr);
/* 86 */                    hashCode = (equals + 115) % 128;
/* 88 */                    return map3;
                        } catch (Throwable th) {
/* 91 */                    Throwable cause = th.getCause();
/* 95 */                    if (cause != null) {
/* 97 */                        throw cause;
                            }
/* 98 */                    throw th;
                        }
                    } catch (Throwable th2) {
/* 111 */               AFLogger.INSTANCE.m1814e(AFg1cSDK.ANTI_FRAUD, "AFCksmV3: reflection init failed", th2, false, false, true);
/* 116 */               return new HashMap();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:22:0x0078 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:23:0x007a A[Catch: Exception -> 0x005d, InvocationTargetException -> 0x005f, TRY_LEAVE, TryCatch #2 {InvocationTargetException -> 0x005f, Exception -> 0x005d, blocks: (B:12:0x0042, B:23:0x007a, B:19:0x0061), top: B:47:0x0040 }] */
                /* JADX WARN: Code duplicated, block: B:25:0x0082  */
                /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
                public final String getMonetizationNetwork(AFc1qSDK aFc1qSDK) {
                    String str;
/* 7 */             hashCode = (equals + 81) % 128;
/* 16 */            boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
/* 23 */            String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("imeiCached", (String) null);
/* 27 */            if (z && AFk1wSDK.getMonetizationNetwork(this.component2)) {
/* 39 */                Context context = this.getMonetizationNetwork.getMonetizationNetwork;
/* 41 */                if (context == null || !getRevenue(context)) {
/* 207 */                   str = null;
                        } else {
/* 51 */                    int i = hashCode + 123;
/* 55 */                    equals = i % 128;
                            try {
/* 65 */                        if (i % 2 != 0) {
/* 71 */                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
/* 88 */                            str = (String) telephonyManager.getClass().getMethod("getDeviceId", null).invoke(telephonyManager, new Object[1]);
/* 90 */                            if (str == null) {
/* 121 */                               if (monetizationNetwork != null) {
/* 127 */                                   AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                                        } else {
/* 131 */                                   monetizationNetwork = null;
                                        }
/* 132 */                               str = monetizationNetwork;
                                    }
                                } else {
/* 102 */                           TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
/* 116 */                           str = (String) telephonyManager2.getClass().getMethod("getDeviceId", null).invoke(telephonyManager2, null);
/* 118 */                           if (str == null) {
/* 121 */                               if (monetizationNetwork != null) {
/* 127 */                                   AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                                        } else {
/* 131 */                                   monetizationNetwork = null;
                                        }
/* 132 */                               str = monetizationNetwork;
                                    }
                                }
                            } catch (InvocationTargetException e) {
/* 167 */                       if (monetizationNetwork != null) {
/* 173 */                           AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                                } else {
/* 177 */                           monetizationNetwork = null;
                                }
/* 182 */                       StringBuilder sb = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
/* 189 */                       sb.append(e.getMessage());
/* 196 */                       AFLogger.afErrorLog(sb.toString(), e);
                            } catch (Exception e2) {
/* 134 */                       if (monetizationNetwork != null) {
/* 140 */                           AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                                } else {
/* 144 */                           monetizationNetwork = null;
                                }
/* 149 */                       StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
/* 156 */                       sb2.append(e2.getMessage());
/* 163 */                       AFLogger.afErrorLog(sb2.toString(), e2);
                            }
                        }
                    } else if (this.component2 != null) {
/* 204 */               str = this.component2;
                    } else {
/* 207 */               str = null;
                    }
/* 212 */           if (AFk1wSDK.getMonetizationNetwork(str)) {
/* 233 */               AFLogger.afInfoLog("IMEI was not collected.");
/* 22 */                return null;
                    }
/* 214 */           aFc1qSDK.getRevenue("imeiCached", str);
/* 219 */           int i2 = equals + 57;
/* 223 */           hashCode = i2 % 128;
/* 227 */           if (i2 % 2 != 0) {
/* 229 */               return str;
                    }
/* 230 */           throw null;
                }

/* 30 */        public final void AFAdRevenueData(String str) {
/* 31 */            int i = equals + 17;
                    hashCode = i % 128;
                    if (i % 2 == 0) {
/* 32 */                this.component1 = str;
/* 33 */                int i2 = 0 / 0;
                    } else {
/* 34 */                this.component1 = str;
                    }
                }

/* 119 */       public final String getMediationNetwork() {
/* 120 */           int i = equals + 51;
                    hashCode = i % 128;
                    int i2 = i % 2;
                    String str = this.component1;
                    if (i2 != 0) {
                        return str;
                    }
                    throw null;
                }

/* 166 */       public final boolean getCurrencyIso4217Code() {
/* 167 */           int i = hashCode + 39;
                    equals = i % 128;
                    int i2 = i % 2;
                    boolean z = this.component3;
                    if (i2 != 0) {
                        throw null;
                    }
                    hashCode = (equals + 39) % 128;
                    return z;
                }

/* 166 */       public final Map<String, Object> getRevenue(Map<String, Object> map) {
/* 169 */           AFc1iSDK aFc1iSDK = new AFc1iSDK(map, this.getMonetizationNetwork.getMonetizationNetwork);
                    int i = hashCode + 77;
                    equals = i % 128;
                    if (i % 2 == 0) {
                        return aFc1iSDK;
                    }
                    throw null;
                }

/* 167 */       private long getCurrencyIso4217Code(AFc1oSDK aFc1oSDK) {
/* 168 */           return ((Long) getCurrencyIso4217Code(new Object[]{this, aFc1oSDK}, 1277266909, -1277266908, System.identityHashCode(this))).longValue();
                }

/* 169 */       public final Map<String, Object> getRevenue() {
/* 170 */           HashMap map = new HashMap();
/* 171 */           if (component1()) {
/* 172 */               hashCode = (equals + 53) % 128;
/* 173 */               map.put("lvl", this.getMediationNetwork);
/* 174 */               hashCode = (equals + 55) % 128;
                        return map;
                    }
/* 175 */           if (this.AFAdRevenueData) {
/* 176 */               this.getMediationNetwork = new HashMap();
/* 177 */               component4();
/* 178 */               this.getMediationNetwork.put("error", "pending LVL response");
/* 179 */               map.put("lvl", this.getMediationNetwork);
                    }
                    return map;
                }

/* 179 */       public final void getRevenue(AFc1oSDK aFc1oSDK) {
/* 180 */           this.getRevenue = System.currentTimeMillis();
/* 183 */           this.AFAdRevenueData = this.getCurrencyIso4217Code.getRevenue(((Long) getCurrencyIso4217Code(new Object[]{this, aFc1oSDK}, 1277266909, -1277266908, System.identityHashCode(this))).longValue(), this.getMonetizationNetwork.getMonetizationNetwork, new AFf1dSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFf1eSDK.3
                        @Override // com.appsflyer.internal.AFf1dSDK.AFa1tSDK
                        public final void getMonetizationNetwork(String str, String str2) {
/* 8 */                     AFf1eSDK.this.getMediationNetwork = new ConcurrentHashMap();
/* 16 */                    AFf1eSDK.this.getMediationNetwork.put("signedData", str);
/* 25 */                    AFf1eSDK.this.getMediationNetwork.put("signature", str2);
/* 30 */                    AFf1eSDK.this.component4();
/* 35 */                    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                        }

                        @Override // com.appsflyer.internal.AFf1dSDK.AFa1tSDK
                        public final void getRevenue(String str, Exception exc) {
/* 8 */                     AFf1eSDK.this.getMediationNetwork = new ConcurrentHashMap();
/* 10 */                    String message = exc.getMessage();
/* 14 */                    if (message == null) {
/* 16 */                        message = "unknown";
                            }
/* 20 */                    AFf1eSDK.this.component4();
/* 29 */                    AFf1eSDK.this.getMediationNetwork.put("error", message);
/* 34 */                    AFLogger.afErrorLog(str, exc, true, true, false);
                        }
                    });
/* 184 */           int i = equals + 69;
                    hashCode = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 61 / 0;
                    }
                }

/* 184 */       private static boolean getRevenue(Context context) {
/* 185 */           equals = (hashCode + 63) % 128;
/* 187 */           if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
                        return true;
                    }
/* 188 */           equals = (hashCode + 3) % 128;
/* 190 */           if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                        return true;
                    }
/* 191 */           equals = (hashCode + 123) % 128;
                    AFa1ySDK.getRevenue();
                    if (!AFa1ySDK.getRevenue(context)) {
                        return true;
                    }
                    hashCode = (equals + 75) % 128;
                    return false;
                }

/* 191 */       public final void getRevenue(String str) {
/* 192 */           getCurrencyIso4217Code(new Object[]{this, str}, -1410448561, 1410448563, System.identityHashCode(this));
                }

/* 236 */       public final void getMonetizationNetwork(boolean z) {
/* 237 */           int i = equals + 47;
                    hashCode = i % 128;
                    if (i % 2 == 0) {
/* 238 */               this.component3 = z;
/* 239 */               int i2 = 23 / 0;
                    } else {
/* 240 */               this.component3 = z;
                    }
                }

/* 240 */       public static void getMonetizationNetwork(AFh1mSDK aFh1mSDK, byte[] bArr) {
                    try {
/* 241 */               new AFb1sSDK(aFh1mSDK, bArr).afInfoLog();
/* 242 */               hashCode = (equals + 105) % 128;
                    } catch (Exception e) {
/* 243 */               AFLogger.INSTANCE.m1814e(AFg1cSDK.SECURITY, "native: reflection init failed", e, false, false, true);
                    }
                }

/* 243 */       public final boolean getMonetizationNetwork() {
/* 244 */           equals = (hashCode + 37) % 128;
                    if (!this.AFAdRevenueData || component1()) {
                        return false;
                    }
                    equals = (hashCode + 21) % 128;
                    return true;
                }
            }
