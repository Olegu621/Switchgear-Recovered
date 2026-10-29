            package com.appsflyer.internal;

            import android.content.pm.PackageManager;
            import android.os.Build;
            import android.text.TextUtils;
            import android.view.ViewConfiguration;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerProperties;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.io.UnsupportedEncodingException;
            import java.security.SecureRandom;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 81 */    public final class AFd1lSDK implements AFd1oSDK {
                private static int $10 = 0;
                private static int $11 = 1;
                private static char[] component3 = null;
                private static boolean copy = false;
                private static int copydefault = 1;
                private static int equals;
                private static final int getCurrencyIso4217Code;
                private static int hashCode;
                private static boolean toString;
                private final AFd1zSDK component2;
                private List<String> AFAdRevenueData = new ArrayList();
                private boolean getRevenue = true;
                private final Map<String, Object> getMediationNetwork = new HashMap();
                private SecureRandom areAllFieldsValid = new SecureRandom();
                private boolean component1 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
                private int getMonetizationNetwork = 0;
                private boolean component4 = false;

                static {
/* 1 */             component3();
/* 7 */             getCurrencyIso4217Code = 98166;
/* 15 */            equals = (copydefault + 23) % 128;
                }

                public AFd1lSDK(AFd1zSDK aFd1zSDK) {
/* 46 */            this.component2 = aFd1zSDK;
                }

                private synchronized void AFAdRevenueData(String str, AFf1eSDK aFf1eSDK, AFc1eSDK aFc1eSDK) {
                    try {
/* 2 */                 AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
/* 8 */                 String string = appsFlyerProperties.getString("remote_debug_static_data");
/* 14 */                this.getMediationNetwork.clear();
/* 17 */                if (string != null) {
                            try {
/* 30 */                        this.getMediationNetwork.putAll(AFg1eSDK.getRevenue(new JSONObject(string)));
                            } catch (Throwable unused) {
                            }
                        } else {
/* 51 */                    getCurrencyIso4217Code(this.component2.AFAdRevenueData().areAllFieldsValid(), aFf1eSDK.AFAdRevenueData(), aFc1eSDK.getCurrencyIso4217Code);
/* 58 */                    StringBuilder sb = new StringBuilder("6.17.6.");
/* 63 */                    sb.append(AFa1ySDK.getMonetizationNetwork);
/* 98 */                    getCurrencyIso4217Code(sb.toString(), this.component2.AFInAppEventType().getMediationNetwork(), appsFlyerProperties.getString("KSAppsFlyerId"), AFb1kSDK.getCurrencyIso4217Code(this.component2.AFAdRevenueData().getMediationNetwork));
                            try {
/* 111 */                       int i = this.component2.AFAdRevenueData().m1787n_().versionCode;
/* 129 */                       getRevenue(str, String.valueOf(i), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
/* 138 */                       copydefault = (equals + 29) % 128;
                            } catch (Throwable unused2) {
                            }
/* 154 */                   appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getMediationNetwork).toString());
                        }
/* 180 */               this.getMediationNetwork.put("launch_counter", String.valueOf(this.component2.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0)));
/* 189 */               copydefault = (equals + 41) % 128;
                    } catch (Throwable th) {
/* 194 */               throw th;
                    }
                }

                private void AFInAppEventType() {
/* 7 */             copydefault = (equals + 119) % 128;
/* 17 */            this.component2.component4().AFAdRevenueData("participantInProxy");
/* 22 */            int i = copydefault + 89;
/* 26 */            equals = i % 128;
/* 30 */            if (i % 2 != 0) {
/* 34 */                int i2 = 31 / 0;
                    }
                }

                private boolean AFLogger() {
/* 21 */            return ((Boolean) AFAdRevenueData(new Object[]{this}, -916590221, 916590222, System.identityHashCode(this))).booleanValue();
                }

                /* JADX INFO: renamed from: a */
                private static void m1789a(String str, int[] iArr, String str2, int i, Object[] objArr) throws UnsupportedEncodingException {
/* 5 */             int i2 = ($11 + 29) % 128;
/* 7 */             $10 = i2;
                    Object charArray = str2;
/* 9 */             if (str2 != null) {
/* 11 */                int i3 = i2 + 95;
/* 15 */                $11 = i3 % 128;
/* 19 */                if (i3 % 2 == 0) {
/* 26 */                    str2.toCharArray();
/* 30 */                    throw null;
                        }
/* 21 */                charArray = str2.toCharArray();
                    }
/* 31 */            char[] cArr = (char[]) charArray;
                    Object bytes = str;
/* 33 */            if (str != null) {
/* 37 */                bytes = str.getBytes("ISO-8859-1");
                    }
/* 41 */            byte[] bArr = (byte[]) bytes;
/* 45 */            AFk1oSDK aFk1oSDK = new AFk1oSDK();
/* 48 */            char[] cArr2 = component3;
/* 56 */            if (cArr2 != null) {
/* 58 */                int length = cArr2.length;
/* 59 */                char[] cArr3 = new char[length];
/* 62 */                for (int i4 = 0; i4 < length; i4++) {
/* 70 */                    cArr3[i4] = (char) (((long) cArr2[i4]) ^ 1825820251896122634L);
                        }
/* 75 */                cArr2 = cArr3;
                    }
/* 80 */            int i5 = (int) (1825820251896122634L ^ ((long) hashCode));
/* 83 */            if (copy) {
/* 85 */                int length2 = bArr.length;
/* 86 */                aFk1oSDK.getMonetizationNetwork = length2;
/* 88 */                char[] cArr4 = new char[length2];
/* 90 */                aFk1oSDK.AFAdRevenueData = 0;
                        while (true) {
/* 92 */                    int i6 = aFk1oSDK.AFAdRevenueData;
/* 94 */                    int i7 = aFk1oSDK.getMonetizationNetwork;
/* 96 */                    if (i6 >= i7) {
/* 120 */                       objArr[0] = new String(cArr4);
/* 122 */                       return;
                            } else {
/* 108 */                       cArr4[i6] = (char) (cArr2[bArr[(i7 - 1) - i6] + i] - i5);
/* 112 */                       aFk1oSDK.AFAdRevenueData = i6 + 1;
                            }
                        }
                    } else if (toString) {
/* 127 */               int length3 = cArr.length;
/* 128 */               aFk1oSDK.getMonetizationNetwork = length3;
/* 130 */               char[] cArr5 = new char[length3];
/* 132 */               aFk1oSDK.AFAdRevenueData = 0;
                        while (true) {
/* 134 */                   int i8 = aFk1oSDK.AFAdRevenueData;
/* 136 */                   int i9 = aFk1oSDK.getMonetizationNetwork;
/* 138 */                   if (i8 >= i9) {
/* 184 */                       String str3 = new String(cArr5);
/* 193 */                       $11 = ($10 + 51) % 128;
/* 195 */                       objArr[0] = str3;
/* 197 */                       return;
                            } else {
/* 142 */                       int i10 = $11 + 55;
/* 146 */                       $10 = i10 % 128;
/* 150 */                       if (i10 % 2 != 0) {
/* 162 */                           cArr5[i8] = (char) (cArr2[cArr[(i9 % 1) / i8] - i] % i5);
                                } else {
/* 177 */                           cArr5[i8] = (char) (cArr2[cArr[(i9 - 1) - i8] - i] - i5);
/* 179 */                           i8++;
                                }
/* 164 */                       aFk1oSDK.AFAdRevenueData = i8;
                            }
                        }
                    } else {
/* 198 */               int length4 = iArr.length;
/* 199 */               aFk1oSDK.getMonetizationNetwork = length4;
/* 201 */               char[] cArr6 = new char[length4];
/* 203 */               aFk1oSDK.AFAdRevenueData = 0;
                        while (true) {
/* 205 */                   int i11 = aFk1oSDK.AFAdRevenueData;
/* 207 */                   int i12 = aFk1oSDK.getMonetizationNetwork;
/* 209 */                   if (i11 >= i12) {
/* 233 */                       objArr[0] = new String(cArr6);
/* 235 */                       return;
                            } else {
/* 221 */                       cArr6[i11] = (char) (cArr2[iArr[(i12 - 1) - i11] - i] - i5);
/* 225 */                       aFk1oSDK.AFAdRevenueData = i11 + 1;
                            }
                        }
                    }
                }

                private synchronized void component1() {
/* 4 */             int i = copydefault + 51;
/* 8 */             equals = i % 128;
/* 10 */            int i2 = i % 2;
/* 12 */            boolean z = this.component4;
/* 14 */            if (i2 != 0) {
/* 81 */                throw null;
                    }
/* 16 */            if (z) {
/* 19 */                return;
                    }
/* 21 */            this.component4 = true;
                    try {
/* 49 */                getCurrencyIso4217Code("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
/* 58 */                equals = (copydefault + 83) % 128;
/* 61 */                return;
                    } catch (Throwable th) {
/* 75 */                AFLogger.INSTANCE.m1814e(AFg1cSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
/* 79 */                return;
                    }
/* 85 */            throw th;
                }

                private float component2() {
/* 3 */             int i = copydefault + 115;
/* 7 */             equals = i % 128;
/* 9 */             int i2 = i % 2;
/* 11 */            SecureRandom secureRandom = this.areAllFieldsValid;
/* 13 */            if (i2 == 0) {
/* 15 */                return secureRandom.nextFloat();
                    }
/* 20 */            secureRandom.nextFloat();
/* 24 */            throw null;
                }

                public static void component3() {
/* 7 */             component3 = new char[]{36322, 36338, 36333, 36350, 36320};
/* 12 */            hashCode = 1912311180;
/* 15 */            toString = true;
/* 17 */            copy = true;
                }

                private static String component4() {
/* 3 */             int i = equals + 83;
/* 7 */             copydefault = i % 128;
/* 11 */            if (i % 2 != 0) {
/* 13 */                return "6.17.6";
                    }
/* 17 */            throw null;
                }

                private synchronized void copy() {
/* 7 */             this.AFAdRevenueData = new ArrayList();
/* 10 */            this.getMonetizationNetwork = 0;
/* 18 */            copydefault = (equals + 29) % 128;
                }

                private synchronized Map<String, Object> copydefault() {
                    Map<String, Object> map;
/* 8 */             copydefault = (equals + 37) % 128;
/* 16 */            this.getMediationNetwork.put(SharedDataContentProvider.BASE_PATH, this.AFAdRevenueData);
/* 19 */            copy();
/* 22 */            map = this.getMediationNetwork;
/* 30 */            copydefault = (equals + 111) % 128;
/* 33 */            return map;
                }

                private boolean equals() {
/* 4 */             if (this.component1) {
/* 6 */                 int i = copydefault;
/* 12 */                equals = (i + 31) % 128;
/* 16 */                if (this.getRevenue) {
/* 34 */                    return true;
                        }
/* 18 */                int i2 = i + 37;
/* 22 */                equals = i2 % 128;
/* 24 */                int i3 = i2 % 2;
/* 26 */                boolean z = this.component4;
/* 28 */                if (i3 != 0) {
/* 33 */                    throw null;
                        }
/* 30 */                if (z) {
/* 34 */                    return true;
                        }
                    }
/* 38 */            int i4 = copydefault + 39;
/* 42 */            equals = i4 % 128;
/* 46 */            if (i4 % 2 == 0) {
/* 48 */                return false;
                    }
/* 50 */            throw null;
                }

                private synchronized void getCurrencyIso4217Code(String str, String str2, String... strArr) {
                    String string;
                    try {
/* 6 */                 if (!equals() || this.getMonetizationNetwork >= 98304) {
/* 220 */                   return;
                        }
                        try {
/* 17 */                    long jCurrentTimeMillis = System.currentTimeMillis();
/* 23 */                    String strJoin = TextUtils.join(", ", strArr);
/* 27 */                    if (str != null) {
/* 31 */                        StringBuilder sb = new StringBuilder();
/* 34 */                        sb.append(jCurrentTimeMillis);
/* 39 */                        sb.append(" ");
/* 50 */                        sb.append(Thread.currentThread().getId());
/* 55 */                        sb.append(" _/AppsFlyer_6.17.6 [");
/* 58 */                        sb.append(str);
/* 63 */                        sb.append("] ");
/* 66 */                        sb.append(str2);
/* 71 */                        sb.append(" ");
/* 74 */                        sb.append(strJoin);
/* 77 */                        string = sb.toString();
                            } else {
/* 84 */                        StringBuilder sb2 = new StringBuilder();
/* 87 */                        sb2.append(jCurrentTimeMillis);
/* 92 */                        sb2.append(" ");
/* 103 */                       sb2.append(Thread.currentThread().getId());
/* 108 */                       sb2.append(" ");
/* 111 */                       sb2.append(str2);
/* 116 */                       sb2.append("/AppsFlyer_6.17.6 ");
/* 119 */                       sb2.append(strJoin);
/* 122 */                       string = sb2.toString();
                            }
/* 134 */                   int length = this.getMonetizationNetwork + (string.length() << 1);
/* 135 */                   int i = getCurrencyIso4217Code;
/* 137 */                   boolean z = false;
/* 138 */                   if (length > i) {
/* 146 */                       copydefault = (equals + 55) % 128;
/* 153 */                       string = string.substring(0, (i - this.getMonetizationNetwork) / 2);
/* 157 */                       z = true;
                            }
/* 163 */                   this.AFAdRevenueData.add(string);
/* 174 */                   this.getMonetizationNetwork += string.length() << 1;
/* 176 */                   if (z) {
/* 180 */                       int i2 = equals + 113;
/* 184 */                       copydefault = i2 % 128;
/* 186 */                       int i3 = i2 % 2;
/* 188 */                       List<String> list = this.AFAdRevenueData;
/* 190 */                       if (i3 == 0) {
/* 194 */                           list.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
/* 201 */                           this.getMonetizationNetwork *= 26120;
                                } else {
/* 206 */                           list.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
/* 213 */                           this.getMonetizationNetwork += 138;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable th) {
/* 222 */               throw th;
                    }
                }

                private synchronized boolean getMonetizationNetwork(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
                    try {
/* 3 */                 if (aFi1xSDK == null) {
/* 5 */                     AFInAppEventType();
/* 2 */                     return false;
                        }
/* 16 */                if (!aFi1xSDK.AFAdRevenueData()) {
/* 2 */                     return false;
                        }
/* 36 */                if (this.component2.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0) > aFi1xSDK.AFAdRevenueData) {
/* 2 */                     return false;
                        }
/* 44 */                equals = (copydefault + 113) % 128;
/* 50 */                if (!AFAdRevenueData(aFi1xSDK, aFi1xSDK2)) {
/* 2 */                     return false;
                        }
/* 60 */                if (!getMonetizationNetwork(aFi1xSDK.getRevenue)) {
/* 2 */                     return false;
                        }
/* 70 */                if (getCurrencyIso4217Code(aFi1xSDK.getCurrencyIso4217Code)) {
/* 91 */                    return true;
                        }
/* 74 */                int i = copydefault + 115;
/* 78 */                equals = i % 128;
/* 82 */                if (i % 2 == 0) {
/* 2 */                     return false;
                        }
/* 87 */                throw null;
                    } catch (Throwable th) {
/* 96 */                throw th;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:12:0x0023  */
                /* JADX WARN: Code duplicated, block: B:14:0x0026 A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:4:0x0003, B:7:0x0011, B:14:0x0026, B:19:0x003a, B:20:0x0040, B:21:0x0045, B:24:0x0050, B:29:0x0064, B:30:0x006a, B:31:0x006f, B:33:0x0072, B:35:0x0078), top: B:44:0x0003 }] */
                /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {all -> 0x0080, blocks: (B:4:0x0003, B:7:0x0011, B:14:0x0026, B:19:0x003a, B:20:0x0040, B:21:0x0045, B:24:0x0050, B:29:0x0064, B:30:0x006a, B:31:0x006f, B:33:0x0072, B:35:0x0078), top: B:44:0x0003 }] */
                /* JADX WARN: Code duplicated, block: B:20:0x0040 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:4:0x0003, B:7:0x0011, B:14:0x0026, B:19:0x003a, B:20:0x0040, B:21:0x0045, B:24:0x0050, B:29:0x0064, B:30:0x006a, B:31:0x006f, B:33:0x0072, B:35:0x0078), top: B:44:0x0003 }] */
                /* JADX WARN: Code duplicated, block: B:23:0x0048 A[Catch: all -> 0x0021, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:6:0x0009, B:8:0x0018, B:16:0x002c, B:23:0x0048, B:26:0x0056, B:39:0x0082), top: B:45:0x0009 }] */
                /* JADX WARN: Code duplicated, block: B:26:0x0056 A[Catch: all -> 0x0021, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:6:0x0009, B:8:0x0018, B:16:0x002c, B:23:0x0048, B:26:0x0056, B:39:0x0082), top: B:45:0x0009 }] */
                /* JADX WARN: Code duplicated, block: B:29:0x0064 A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {all -> 0x0080, blocks: (B:4:0x0003, B:7:0x0011, B:14:0x0026, B:19:0x003a, B:20:0x0040, B:21:0x0045, B:24:0x0050, B:29:0x0064, B:30:0x006a, B:31:0x006f, B:33:0x0072, B:35:0x0078), top: B:44:0x0003 }] */
                /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:4:0x0003, B:7:0x0011, B:14:0x0026, B:19:0x003a, B:20:0x0040, B:21:0x0045, B:24:0x0050, B:29:0x0064, B:30:0x006a, B:31:0x006f, B:33:0x0072, B:35:0x0078), top: B:44:0x0003 }] */
                /* JADX WARN: Code duplicated, block: B:33:0x0072 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:4:0x0003, B:7:0x0011, B:14:0x0026, B:19:0x003a, B:20:0x0040, B:21:0x0045, B:24:0x0050, B:29:0x0064, B:30:0x006a, B:31:0x006f, B:33:0x0072, B:35:0x0078), top: B:44:0x0003 }] */
                private synchronized void getRevenue(String str, String str2, String str3, String str4) {
                    int i;
                    Map<String, Object> map;
                    int i2;
                    Map<String, Object> map2;
/* 2 */             if (str != null) {
                        try {
/* 8 */                     if (str.length() > 0) {
/* 16 */                        copydefault = (equals + 65) % 128;
/* 22 */                        this.getMediationNetwork.put("app_id", str);
/* 31 */                        equals = (copydefault + 37) % 128;
/* 37 */                        if (str2 != null && str2.length() > 0) {
/* 47 */                            int i3 = equals + 19;
/* 51 */                            copydefault = i3 % 128;
/* 53 */                            i2 = i3 % 2;
/* 55 */                            map2 = this.getMediationNetwork;
/* 57 */                            if (i2 == 0) {
/* 67 */                                map2.put("app_version", str2);
/* 70 */                                throw null;
                                    }
/* 61 */                            map2.put("app_version", str2);
                                }
/* 71 */                        if (str3 != null) {
/* 79 */                            equals = (copydefault + 105) % 128;
/* 85 */                            if (str3.length() > 0) {
/* 89 */                                int i4 = equals + 123;
/* 93 */                                copydefault = i4 % 128;
/* 95 */                                i = i4 % 2;
/* 97 */                                map = this.getMediationNetwork;
/* 99 */                                if (i == 0) {
/* 109 */                                   map.put(AppsFlyerProperties.CHANNEL, str3);
/* 112 */                                   throw null;
                                        }
/* 103 */                               map.put(AppsFlyerProperties.CHANNEL, str3);
                                    }
                                }
/* 113 */                       if (str4 != null && str4.length() > 0) {
/* 125 */                           this.getMediationNetwork.put("preInstall", str4);
                                }
/* 137 */                       copydefault = (equals + 57) % 128;
                            } else {
/* 37 */                        if (str2 != null) {
/* 47 */                            int i5 = equals + 19;
/* 51 */                            copydefault = i5 % 128;
/* 53 */                            i2 = i5 % 2;
/* 55 */                            map2 = this.getMediationNetwork;
/* 57 */                            if (i2 == 0) {
/* 67 */                                map2.put("app_version", str2);
/* 70 */                                throw null;
                                    }
/* 61 */                            map2.put("app_version", str2);
                                }
/* 71 */                        if (str3 != null) {
/* 79 */                            equals = (copydefault + 105) % 128;
/* 85 */                            if (str3.length() > 0) {
/* 89 */                                int i6 = equals + 123;
/* 93 */                                copydefault = i6 % 128;
/* 95 */                                i = i6 % 2;
/* 97 */                                map = this.getMediationNetwork;
/* 99 */                                if (i == 0) {
/* 109 */                                   map.put(AppsFlyerProperties.CHANNEL, str3);
/* 112 */                                   throw null;
                                        }
/* 103 */                               map.put(AppsFlyerProperties.CHANNEL, str3);
                                    }
                                }
/* 113 */                       if (str4 != null) {
/* 125 */                           this.getMediationNetwork.put("preInstall", str4);
                                }
/* 137 */                       copydefault = (equals + 57) % 128;
                            }
                        } catch (Throwable unused) {
/* 130 */                   return;
                        }
                    } else {
/* 37 */                if (str2 != null) {
/* 47 */                    int i7 = equals + 19;
/* 51 */                    copydefault = i7 % 128;
/* 53 */                    i2 = i7 % 2;
/* 55 */                    map2 = this.getMediationNetwork;
/* 57 */                    if (i2 == 0) {
/* 67 */                        map2.put("app_version", str2);
/* 70 */                        throw null;
                            }
/* 61 */                    map2.put("app_version", str2);
                        }
/* 71 */                if (str3 != null) {
/* 79 */                    equals = (copydefault + 105) % 128;
/* 85 */                    if (str3.length() > 0) {
/* 89 */                        int i8 = equals + 123;
/* 93 */                        copydefault = i8 % 128;
/* 95 */                        i = i8 % 2;
/* 97 */                        map = this.getMediationNetwork;
/* 99 */                        if (i == 0) {
/* 109 */                           map.put(AppsFlyerProperties.CHANNEL, str3);
/* 112 */                           throw null;
                                }
/* 103 */                       map.put(AppsFlyerProperties.CHANNEL, str3);
                            }
                        }
/* 113 */               if (str4 != null) {
/* 125 */                   this.getMediationNetwork.put("preInstall", str4);
                        }
/* 137 */               copydefault = (equals + 57) % 128;
                    }
/* 142 */           throw th;
                }

                @Override // com.appsflyer.internal.AFd1oSDK
                public final boolean areAllFieldsValid() {
/* 3 */             int i = copydefault + 105;
/* 7 */             equals = i % 128;
/* 9 */             int i2 = i % 2;
/* 11 */            boolean z = this.component4;
/* 13 */            if (i2 != 0) {
/* 16 */                int i3 = 7 / 0;
                    }
/* 18 */            return z;
                }

                @Override // com.appsflyer.internal.AFd1oSDK
                public final synchronized void getMediationNetwork() {
/* 4 */             if (!this.component4 && !this.getRevenue) {
/* 16 */                copydefault = (equals + 85) % 128;
/* 19 */                return;
                    }
/* 23 */            this.component4 = false;
/* 25 */            this.getRevenue = false;
                    try {
/* 52 */                getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
/* 61 */                equals = (copydefault + 91) % 128;
                    } catch (Throwable th) {
/* 76 */                AFLogger.INSTANCE.m1814e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
                    }
                }

                @Override // com.appsflyer.internal.AFd1oSDK
                /* JADX INFO: renamed from: q_ */
                public final void mo1790q_(String str, PackageManager packageManager) {
/* 3 */             int i = copydefault + 33;
/* 7 */             equals = i % 128;
                    try {
/* 11 */                if (i % 2 != 0) {
/* 95 */                    this.component2.getRevenue().getMediationNetwork(AFAdRevenueData(str), this.component2.AFInAppEventType().getMediationNetwork());
/* 99 */                    throw null;
                        }
/* 33 */                AFd1kSDK mediationNetwork = this.component2.getRevenue().getMediationNetwork(AFAdRevenueData(str), this.component2.AFInAppEventType().getMediationNetwork());
/* 37 */                if (mediationNetwork == null) {
/* 48 */                    AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                        } else {
/* 63 */                    this.component2.getMonetizationNetwork().execute(new RunnableC0294f(mediationNetwork, 2));
/* 72 */                    equals = (copydefault + 61) % 128;
                        }
                    } catch (Throwable th) {
/* 103 */               AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
                    }
                }

/* 82 */        private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
                    boolean mediationNetwork;
                    AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
                    AFi1xSDK aFi1xSDK = (AFi1xSDK) objArr[1];
                    AFi1xSDK aFi1xSDK2 = (AFi1xSDK) objArr[2];
/* 83 */            int i = equals + 87;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
                        aFi1xSDK.equals(aFi1xSDK2);
                        throw null;
                    }
/* 84 */            if (aFi1xSDK.equals(aFi1xSDK2)) {
/* 85 */                mediationNetwork = aFd1lSDK.AFLogger();
                    } else {
/* 87 */                mediationNetwork = aFd1lSDK.getMediationNetwork(aFi1xSDK.getMonetizationNetwork);
/* 88 */                aFd1lSDK.getMediationNetwork(mediationNetwork);
                    }
/* 89 */            int i2 = copydefault + 63;
                    equals = i2 % 128;
                    if (i2 % 2 == 0) {
/* 90 */                return Boolean.valueOf(mediationNetwork);
                    }
/* 91 */            throw null;
                }

/* 91 */        private void getMediationNetwork(boolean z) {
/* 92 */            int i = equals + 57;
                    copydefault = i % 128;
                    int i2 = i % 2;
/* 93 */            AFd1zSDK aFd1zSDK = this.component2;
                    if (i2 != 0) {
/* 94 */                aFd1zSDK.component4().AFAdRevenueData("participantInProxy", z);
                    } else {
/* 94 */                aFd1zSDK.component4().AFAdRevenueData("participantInProxy", z);
/* 96 */                throw null;
                    }
                }

/* 96 */        private boolean getMediationNetwork(float f) {
/* 97 */            return ((Boolean) AFAdRevenueData(new Object[]{this, Float.valueOf(f)}, 1140261820, -1140261820, System.identityHashCode(this))).booleanValue();
                }

                @Override // com.appsflyer.internal.AFd1oSDK
/* 96 */        public final void getMonetizationNetwork(String str, String str2) {
/* 97 */            int i = equals + 109;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
/* 98 */                getCurrencyIso4217Code((String) null, str, str2);
                    } else {
                        getCurrencyIso4217Code((String) null, str, str2);
                    }
/* 99 */            int i2 = equals + 125;
                    copydefault = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                }

                @Override // com.appsflyer.internal.AFd1oSDK
/* 99 */        public final synchronized void getMonetizationNetwork() {
/* 100 */           equals = (copydefault + 29) % 128;
/* 101 */           this.getMediationNetwork.clear();
/* 102 */           this.AFAdRevenueData.clear();
/* 103 */           this.getMonetizationNetwork = 0;
/* 104 */           int i = equals + 61;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
                
                    return true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
                
                    r2 = r3.equals(r2.component2.AFAdRevenueData().m1787n_().versionName);
                    com.appsflyer.internal.AFd1lSDK.copydefault = (com.appsflyer.internal.AFd1lSDK.equals + 83) % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
                
                    return r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
                
                    if (com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r3) != false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
                
                    if (com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r3) != false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
                
                    com.appsflyer.internal.AFd1lSDK.equals = (com.appsflyer.internal.AFd1lSDK.copydefault + 89) % 128;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
/* 104 */       private boolean getMonetizationNetwork(String str) {
/* 105 */           int i = equals + 47;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 / 0;
                    }
                }

/* 110 */       private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
                    AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
                    float fFloatValue = ((Number) objArr[1]).floatValue();
                    double d = fFloatValue;
                    if (d >= 1.0d) {
/* 111 */               int i = copydefault + 109;
                        equals = i % 128;
                        if (i % 2 == 0) {
                            return Boolean.TRUE;
                        }
                        throw null;
                    }
                    if (d <= 0.0d) {
/* 112 */               return Boolean.FALSE;
                    }
                    if (aFd1lSDK.component2() <= fFloatValue) {
/* 114 */               int i2 = equals + 47;
                        copydefault = i2 % 128;
                        return i2 % 2 == 0 ? Boolean.FALSE : Boolean.TRUE;
                    }
                    int i3 = equals + 71;
                    copydefault = i3 % 128;
                    if (i3 % 2 != 0) {
                        return Boolean.FALSE;
                    }
                    int i4 = 5 / 0;
                    return Boolean.FALSE;
                }

/* 114 */       private static AFi1xSDK getMonetizationNetwork(AFi1vSDK aFi1vSDK) {
/* 115 */           int i = copydefault + 83;
                    int i2 = i % 128;
                    equals = i2;
                    if (i % 2 != 0) {
/* 116 */               int i3 = 4 / 0;
                        if (aFi1vSDK == null) {
                            return null;
                        }
                    } else if (aFi1vSDK == null) {
                        return null;
                    }
/* 117 */           AFi1zSDK aFi1zSDK = aFi1vSDK.getMonetizationNetwork;
                    if (aFi1zSDK == null) {
                        return null;
                    }
/* 118 */           copydefault = (i2 + 33) % 128;
/* 119 */           return aFi1zSDK.getMediationNetwork;
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0032 A[PHI: r0 r1
  0x0032: PHI (r0v10 java.lang.Throwable) = (r0v3 java.lang.Throwable), (r0v11 java.lang.Throwable) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r1v5 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r0 r1
  0x002d: PHI (r0v4 java.lang.Throwable) = (r0v3 java.lang.Throwable), (r0v11 java.lang.Throwable) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // com.appsflyer.internal.AFd1oSDK
/* 142 */       public final void getRevenue(Throwable th) {
                    Throwable cause;
                    String simpleName;
                    String message;
                    StackTraceElement[] stackTrace;
/* 143 */           int i = equals + 103;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
/* 144 */               cause = th.getCause();
/* 145 */               simpleName = th.getClass().getSimpleName();
/* 146 */               int i2 = 82 / 0;
                        if (cause == null) {
/* 149 */                   message = th.getMessage();
                        } else {
                            message = cause.getMessage();
                        }
                    } else {
/* 147 */               cause = th.getCause();
/* 148 */               simpleName = th.getClass().getSimpleName();
                        if (cause == null) {
/* 149 */                   message = th.getMessage();
                        } else {
                            message = cause.getMessage();
                        }
                    }
                    if (cause == null) {
/* 150 */               stackTrace = th.getStackTrace();
                    } else {
                        stackTrace = cause.getStackTrace();
/* 151 */               equals = (copydefault + 47) % 128;
                    }
/* 153 */           getCurrencyIso4217Code("exception", simpleName, getCurrencyIso4217Code(message, stackTrace));
                }

                @Override // com.appsflyer.internal.AFd1oSDK
/* 153 */       public final void getRevenue(String str, String str2) {
/* 154 */           int i = equals + 19;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
/* 155 */               String[] strArr = new String[0];
                        strArr[0] = str2;
                        getCurrencyIso4217Code("server_request", str, strArr);
                    } else {
                        getCurrencyIso4217Code("server_request", str, str2);
                    }
/* 156 */           int i2 = copydefault + 115;
                    equals = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                }

                @Override // com.appsflyer.internal.AFd1oSDK
/* 156 */       public final synchronized void getRevenue() {
                    try {
/* 157 */               int i = copydefault + 23;
                        equals = i % 128;
                        if (i % 2 != 0) {
/* 158 */                   this.getRevenue = false;
                        } else {
/* 161 */                   this.getRevenue = false;
                        }
/* 159 */               getMonetizationNetwork();
/* 160 */               copy();
/* 162 */               int i2 = equals + 31;
                        copydefault = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i3 = 15 / 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }

                @Override // com.appsflyer.internal.AFd1oSDK
/* 162 */       public final void getRevenue(String str, String... strArr) {
/* 163 */           int i = copydefault + 47;
                    equals = i % 128;
                    if (i % 2 != 0) {
/* 164 */               getCurrencyIso4217Code("public_api_call", str, strArr);
/* 165 */               int i2 = 67 / 0;
                    } else {
/* 166 */               getCurrencyIso4217Code("public_api_call", str, strArr);
                    }
/* 167 */           equals = (copydefault + 3) % 128;
                }

/* 167 */       private static /* synthetic */ Object getRevenue(Object[] objArr) {
                    String str = (String) objArr[0];
/* 168 */           int i = equals + 87;
                    copydefault = i % 128;
                    if (i % 2 != 0) {
/* 169 */               if (!AFk1wSDK.getCurrencyIso4217Code(str)) {
                            new AFd1pSDK();
                            return Boolean.valueOf(AFd1pSDK.getCurrencyIso4217Code(component4(), str));
                        }
/* 170 */               int i2 = equals + 123;
                        copydefault = i2 % 128;
                        return Boolean.valueOf(i2 % 2 != 0);
                    }
/* 171 */           AFk1wSDK.getCurrencyIso4217Code(str);
                    throw null;
                }

                @Override // com.appsflyer.internal.AFd1oSDK
/* 194 */       public final boolean AFAdRevenueData() {
/* 195 */           equals = (copydefault + 67) % 128;
/* 204 */           boolean monetizationNetwork = getMonetizationNetwork(getMonetizationNetwork(this.component2.component1().AFAdRevenueData.getCurrencyIso4217Code), getMonetizationNetwork(this.component2.component1().AFAdRevenueData.getMediationNetwork));
                    if (monetizationNetwork) {
/* 205 */               equals = (copydefault + 13) % 128;
/* 206 */               component1();
                    } else {
/* 207 */               getRevenue();
/* 208 */               getMediationNetwork();
                    }
/* 209 */           copydefault = (equals + 119) % 128;
                    return monetizationNetwork;
                }

                @Override // com.appsflyer.internal.AFd1oSDK
/* 209 */       public final void AFAdRevenueData(String str, int i, String str2) {
/* 210 */           int i2 = copydefault + 3;
                    equals = i2 % 128;
                    if (i2 % 2 != 0) {
/* 211 */               String[] strArr = new String[4];
                        strArr[1] = String.valueOf(i);
                        strArr[0] = str2;
                        getCurrencyIso4217Code("server_response", str, strArr);
                    } else {
                        getCurrencyIso4217Code("server_response", str, String.valueOf(i), str2);
                    }
/* 212 */           int i3 = copydefault + 113;
                    equals = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 72 / 0;
                    }
                }

/* 212 */       private Map<String, Object> AFAdRevenueData(String str) {
/* 213 */           int i = equals + 7;
                    copydefault = i % 128;
                    int i2 = i % 2;
/* 214 */           AFd1zSDK aFd1zSDK = this.component2;
                    if (i2 != 0) {
                        AFAdRevenueData(str, aFd1zSDK.AFInAppEventType(), this.component2.force());
/* 215 */               return copydefault();
                    }
/* 216 */           AFAdRevenueData(str, aFd1zSDK.AFInAppEventType(), this.component2.force());
/* 217 */           copydefault();
                    throw null;
                }

/* 217 */       public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i, int i2, int i3) {
                    int i4 = i | i2;
                    int i5 = (i4 * (-502)) + (i2 * 503) + (i * 503);
                    int i6 = ~i;
                    int i7 = ~((~i2) | i6);
                    int i8 = i6 | (~i3);
                    int i9 = i7 | (~i8);
                    int i10 = ~(i3 | i4);
                    int i11 = (((~(i8 | i2)) | i10) * 502) + ((i9 | i10) * (-502)) + i5;
                    if (i11 == 1) {
                        return getCurrencyIso4217Code(objArr);
                    }
                    if (i11 != 2) {
                        return i11 != 3 ? getMonetizationNetwork(objArr) : getRevenue(objArr);
                    }
                    return getMediationNetwork(objArr);
                }

/* 218 */       private boolean AFAdRevenueData(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
/* 219 */           return ((Boolean) AFAdRevenueData(new Object[]{this, aFi1xSDK, aFi1xSDK2}, 322554097, -322554095, System.identityHashCode(this))).booleanValue();
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0077 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0041, B:10:0x005a, B:20:0x0077, B:24:0x008c), top: B:31:0x0041 }] */
                /* JADX WARN: Code duplicated, block: B:23:0x0085 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #1 {all -> 0x0099, blocks: (B:3:0x0001, B:7:0x004d, B:9:0x0053, B:14:0x0065, B:16:0x0068, B:18:0x006e, B:21:0x007f, B:23:0x0085), top: B:33:0x0001 }] */
/* 222 */       private synchronized void getCurrencyIso4217Code(String str, String str2, String str3) {
                    try {
/* 223 */               Map<String, Object> map = this.getMediationNetwork;
                        Object[] objArr = new Object[1];
                        m1789a("\u0085\u0084\u0083\u0082\u0081", null, null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, objArr);
                        map.put(((String) objArr[0]).intern(), Build.BRAND);
/* 224 */               this.getMediationNetwork.put("model", Build.MODEL);
/* 225 */               this.getMediationNetwork.put("platform", "Android");
/* 226 */               this.getMediationNetwork.put("platform_version", Build.VERSION.RELEASE);
                        if (str != null) {
/* 227 */                   int i = copydefault + 19;
                            equals = i % 128;
                            if (i % 2 != 0) {
                                throw null;
                            }
/* 228 */                   if (str.length() > 0) {
/* 229 */                       this.getMediationNetwork.put("advertiserId", str);
/* 230 */                       copydefault = (equals + 55) % 128;
                            }
/* 231 */                   if (str2 != null && str2.length() > 0) {
/* 232 */                       this.getMediationNetwork.put("imei", str2);
                            }
                            if (str3 != null) {
/* 233 */                       equals = (copydefault + 111) % 128;
/* 234 */                       if (str3.length() > 0) {
/* 235 */                           this.getMediationNetwork.put("android_id", str3);
/* 236 */                           equals = (copydefault + 123) % 128;
                                }
                            }
                        } else {
                            if (str2 != null) {
/* 232 */                       this.getMediationNetwork.put("imei", str2);
                            }
                            if (str3 != null) {
/* 233 */                       equals = (copydefault + 111) % 128;
/* 234 */                       if (str3.length() > 0) {
/* 235 */                           this.getMediationNetwork.put("android_id", str3);
/* 236 */                           equals = (copydefault + 123) % 128;
                                }
                            }
                        }
                        throw th;
                    } catch (Throwable unused) {
                    }
                }

/* 238 */       private synchronized void getCurrencyIso4217Code(String str, String str2, String str3, String str4) {
                    try {
/* 239 */               int i = equals + 5;
                        copydefault = i % 128;
                        int i2 = i % 2;
/* 240 */               Map<String, Object> map = this.getMediationNetwork;
                        try {
                            if (i2 != 0) {
                                map.put("sdk_version", str);
                                if (str2 != null) {
/* 241 */                           equals = (copydefault + 29) % 128;
/* 242 */                           if (str2.length() > 0) {
/* 243 */                               this.getMediationNetwork.put("devkey", str2);
                                    }
                                }
/* 244 */                       if (str3 != null && str3.length() > 0) {
/* 245 */                           int i3 = copydefault + 61;
                                    equals = i3 % 128;
                                    int i4 = i3 % 2;
/* 246 */                           Map<String, Object> map2 = this.getMediationNetwork;
                                    if (i4 != 0) {
                                        map2.put("originalAppsFlyerId", str3);
/* 247 */                               throw null;
                                    }
                                    map2.put("originalAppsFlyerId", str3);
                                }
                                if (str4 != null) {
/* 248 */                           int i5 = equals + 79;
                                    copydefault = i5 % 128;
                                    if (i5 % 2 != 0) {
/* 249 */                               if (str4.length() > 0) {
/* 250 */                                   this.getMediationNetwork.put("uid", str4);
                                        }
                                    } else {
/* 251 */                               throw null;
                                    }
                                }
                            } else {
/* 253 */                       map.put("sdk_version", str);
/* 254 */                       throw null;
                            }
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }

                @Override // com.appsflyer.internal.AFd1oSDK
/* 255 */       public final void getCurrencyIso4217Code() {
/* 256 */           int i = copydefault;
/* 257 */           this.component1 = false;
/* 258 */           equals = (i + 13) % 128;
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
                
                    r2 = 1;
                    r0 = new java.lang.String[r4.length + 1];
                    r0[0] = r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
                
                    if (r2 >= r4.length) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
                
                    r3 = com.appsflyer.internal.AFd1lSDK.copydefault + 61;
                    com.appsflyer.internal.AFd1lSDK.equals = r3 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
                
                    if ((r3 % 2) == 0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
                
                    r0[r2] = r4[r2].toString();
                    r2 = r2 + 43;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
                
                    r0[r2] = r4[r2].toString();
                    r2 = r2 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
                
                    if (r4 == null) goto L8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
                
                    if (r4 == null) goto L8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
                
                    return new java.lang.String[]{r3};
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
/* 258 */       private static String[] getCurrencyIso4217Code(String str, StackTraceElement[] stackTraceElementArr) {
/* 259 */           int i = copydefault + 105;
                    equals = i % 128;
                    if (i % 2 != 0) {
/* 260 */               int i2 = 86 / 0;
                    }
                }

/* 266 */       private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
                    AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
/* 267 */           copydefault = (equals + 117) % 128;
                    boolean mediationNetwork = aFd1lSDK.component2.component4().getMediationNetwork("participantInProxy", false);
                    int i = copydefault + 37;
                    equals = i % 128;
                    if (i % 2 == 0) {
                        return Boolean.valueOf(mediationNetwork);
                    }
                    throw null;
                }

/* 267 */       private static boolean getCurrencyIso4217Code(String str) {
/* 268 */           return ((Boolean) AFAdRevenueData(new Object[]{str}, -1244422585, 1244422588, (int) System.currentTimeMillis())).booleanValue();
                }
            }
