            package com.appsflyer.internal;

            import android.os.Build;
            import android.os.Process;
            import android.os.SystemClock;
            import android.text.AndroidCharacter;
            import android.text.TextUtils;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.ViewConfiguration;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerLib;
            import com.appsflyer.AppsFlyerProperties;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.lang.reflect.Method;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.UUID;
            import kotlin.text.Regex;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 129 */   public final class AFd1nSDK {
                private static int $10 = 0;
                private static int $11 = 1;
                private static char areAllFieldsValid = 0;
                private static char component3 = 0;
                private static char copy = 0;
                private static int copydefault = 0;
                private static char equals = 0;
                public static String getMonetizationNetwork = null;
                private static String getRevenue = null;
                private static int hashCode = 1;
                private final AppsFlyerProperties AFAdRevenueData;
                private final AFj1cSDK component1;
                private final AFf1eSDK component2;
                private final AFe1vSDK component4;
                private final AFd1mSDK getCurrencyIso4217Code;
                private final AFc1oSDK getMediationNetwork;

                static {
/* 1 */             getMediationNetwork();
/* 6 */             getMonetizationNetwork = "https://%sgcdsdk.%s/install_data/v5.0/";
/* 10 */            getRevenue = "https://%sonelink.%s/shortlink-sdk/v2";
/* 14 */            int i = copydefault + 31;
/* 18 */            hashCode = i % 128;
/* 22 */            if (i % 2 == 0) {
/* 26 */                int i2 = 46 / 0;
                    }
                }

                public AFd1nSDK(AFd1mSDK aFd1mSDK, AFc1oSDK aFc1oSDK, AppsFlyerProperties appsFlyerProperties, AFe1vSDK aFe1vSDK, AFj1cSDK aFj1cSDK, AFf1eSDK aFf1eSDK) {
/* 4 */             this.getCurrencyIso4217Code = aFd1mSDK;
/* 6 */             this.getMediationNetwork = aFc1oSDK;
/* 8 */             this.AFAdRevenueData = appsFlyerProperties;
/* 10 */            this.component4 = aFe1vSDK;
/* 12 */            this.component1 = aFj1cSDK;
/* 14 */            this.component2 = aFf1eSDK;
                }

                /* JADX INFO: renamed from: a */
                private static void m1791a(String str, int i, Object[] objArr) {
                    char[] charArray;
/* 2 */             if (str != null) {
/* 6 */                 int i2 = $11 + 87;
/* 10 */                $10 = i2 % 128;
/* 13 */                if (i2 % 2 != 0) {
/* 20 */                    str.toCharArray();
/* 24 */                    throw null;
                        }
/* 15 */                charArray = str.toCharArray();
                    } else {
/* 25 */                charArray = str;
                    }
/* 27 */            char[] cArr = charArray;
/* 31 */            AFk1qSDK aFk1qSDK = new AFk1qSDK();
/* 35 */            char[] cArr2 = new char[cArr.length];
/* 38 */            aFk1qSDK.getRevenue = 0;
/* 40 */            char[] cArr3 = new char[2];
                    while (true) {
/* 42 */                int i3 = aFk1qSDK.getRevenue;
/* 45 */                if (i3 >= cArr.length) {
/* 186 */                   objArr[0] = new String(cArr2, 0, i);
/* 188 */                   return;
                        }
/* 49 */                int i4 = $10 + 97;
/* 53 */                $11 = i4 % 128;
/* 57 */                if (i4 % 2 == 0) {
/* 61 */                    cArr3[1] = cArr[i3];
/* 65 */                    cArr3[1] = cArr[i3];
                        } else {
/* 70 */                    cArr3[0] = cArr[i3];
/* 76 */                    cArr3[1] = cArr[i3 + 1];
                        }
/* 78 */                int i5 = 58224;
/* 84 */                for (int i6 = 0; i6 < 16; i6++) {
/* 92 */                    $11 = ($10 + 75) % 128;
/* 94 */                    char c = cArr3[1];
/* 96 */                    char c2 = cArr3[0];
/* 126 */                   char c3 = (char) (c - (((c2 + i5) ^ ((c2 << 4) + ((char) (((long) equals) ^ (-1199070254561146252L))))) ^ ((c2 >>> 5) + ((char) (((long) copy) ^ (-1199070254561146252L))))));
/* 127 */                   cArr3[1] = c3;
/* 153 */                   cArr3[0] = (char) (c2 - (((c3 >>> 5) + ((char) (((long) areAllFieldsValid) ^ (-1199070254561146252L)))) ^ ((c3 + i5) ^ ((c3 << 4) + ((char) (((long) component3) ^ (-1199070254561146252L)))))));
/* 158 */                   i5 -= 40503;
                        }
/* 162 */               int i7 = aFk1qSDK.getRevenue;
/* 166 */               cArr2[i7] = cArr3[0];
/* 172 */               cArr2[i7 + 1] = cArr3[1];
/* 175 */               aFk1qSDK.getRevenue = i7 + 2;
                    }
                }

                private Map<String, Object> getRevenue() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("build_number", "6.17.6");
/* 30 */            map.put("counter", Integer.valueOf(this.getMediationNetwork.getMediationNetwork.getRevenue("appsFlyerCount", 0)));
/* 37 */            map.put("model", Build.MODEL);
/* 49 */            Object[] objArr = new Object[1];
/* 53 */            m1791a("ĒⒾ〟圌\uea94狦", 5 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
/* 66 */            map.put(((String) objArr[0]).intern(), Build.BRAND);
/* 77 */            map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
/* 90 */            map.put("app_version_name", this.getMediationNetwork.m1787n_().versionName);
/* 105 */           map.put("app_id", this.getMediationNetwork.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName());
/* 119 */           map.put("platformextension", new AFa1uSDK().AFAdRevenueData());
/* 128 */           copydefault = (hashCode + 69) % 128;
/* 130 */           return map;
                }

                /* JADX WARN: Code duplicated, block: B:19:0x0086  */
                public final AFd1hSDK<String> AFAdRevenueData(Map<String, Object> map, String str, String str2) {
                    String mediationNetwork;
                    try {
/* 12 */                Object[] objArr = {map, str};
/* 20 */                Map map2 = AFa1hSDK.f3072d;
/* 22 */                Object method = map2.get(1320791325);
/* 26 */                if (method == null) {
/* 64 */                    method = ((Class) AFa1hSDK.getRevenue(KeyEvent.keyCodeFromString(HttpUrl.FRAGMENT_ENCODE_SET) + 198, (char) View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET, '0', 0) + 38)).getMethod("getRevenue", Map.class, String.class);
/* 68 */                    map2.put(1320791325, method);
                        }
/* 78 */                byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
/* 80 */                AFj1cSDK aFj1cSDK = this.component1;
/* 82 */                if (str2 != null) {
/* 90 */                    hashCode = (copydefault + 87) % 128;
/* 96 */                    if (str2.length() == 0) {
/* 141 */                       copydefault = (hashCode + 37) % 128;
                            } else if (!new Regex("4.?(\\d+)?.?(\\d+)").m6223b(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").m6223b(str2)) {
/* 130 */                       mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                            }
/* 147 */                   mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                        } else {
/* 141 */                   copydefault = (hashCode + 37) % 128;
/* 147 */                   mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                        }
/* 174 */               return getRevenue(new AFd1bSDK(aFj1cSDK.getMediationNetwork(aFj1cSDK.getMediationNetwork(mediationNetwork), false), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1dSDK());
                    } catch (Throwable th) {
                        try {
/* 181 */                   Throwable cause = th.getCause();
/* 185 */                   if (cause != null) {
/* 187 */                       throw cause;
                            }
/* 192 */                   throw th;
                        } catch (Throwable th2) {
/* 201 */                   AFLogger.INSTANCE.m1813e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th2, false, false);
/* 11 */                    return null;
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
                public final AFd1hSDK<String> getCurrencyIso4217Code(AFh1mSDK aFh1mSDK, String str, AFc1hSDK aFc1hSDK) {
                    String mediationNetwork;
                    String mediationNetwork2;
                    try {
                        try {
/* 12 */                    Object[] objArr = {aFh1mSDK, str, aFc1hSDK};
/* 23 */                    Map map = AFa1hSDK.f3072d;
/* 25 */                    Object method = map.get(-1034782704);
/* 29 */                    if (method == null) {
/* 73 */                        method = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 198, (char) TextUtils.indexOf(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 37)).getMethod("AFAdRevenueData", AFh1mSDK.class, String.class, AFc1hSDK.class);
/* 77 */                        map.put(-1034782704, method);
                            }
/* 87 */                    byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
/* 89 */                    getCurrencyIso4217Code(aFh1mSDK, bArr);
/* 98 */                    hashCode = (copydefault + 67) % 128;
/* 100 */                   AFj1cSDK aFj1cSDK = this.component1;
/* 102 */                   aFh1mSDK.getClass();
/* 105 */                   boolean revenue = aFh1mSDK.getRevenue();
/* 109 */                   boolean z = aFh1mSDK instanceof AFh1lSDK;
/* 111 */                   boolean z2 = aFh1mSDK instanceof AFh1nSDK;
/* 113 */                   boolean z3 = aFh1mSDK instanceof AFh1kSDK;
/* 115 */                   boolean z4 = aFh1mSDK instanceof AFh1cSDK;
/* 117 */                   boolean z5 = aFh1mSDK instanceof AFh1bSDK;
/* 119 */                   boolean z6 = aFh1mSDK instanceof AFg1tSDK;
/* 123 */                   if (!(aFh1mSDK instanceof AFh1iSDK)) {
/* 135 */                       if (z3) {
/* 248 */                           mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.getMediationNetwork);
                                } else {
/* 139 */                           int i = copydefault + 5;
/* 141 */                           int i2 = i % 128;
/* 143 */                           hashCode = i2;
/* 146 */                           if (i % 2 == 0) {
/* 243 */                               throw null;
                                    }
/* 148 */                           if (z2) {
/* 248 */                               mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.getMediationNetwork);
                                    } else if (z) {
/* 157 */                               copydefault = (i2 + 63) % 128;
/* 163 */                               mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.AFAdRevenueData);
                                    } else if (z4) {
/* 174 */                               mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.component1);
                                    } else if (z5) {
/* 185 */                               mediationNetwork2 = aFj1cSDK.getRevenue.getMediationNetwork("https://%ssdk-services.%s/validate-android-signature");
                                    } else if (z6) {
/* 197 */                               mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.component2);
/* 207 */                               copydefault = (hashCode + 91) % 128;
                                    } else if (revenue) {
/* 229 */                               mediationNetwork = aFh1mSDK.component4 < 2 ? aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.getMonetizationNetwork) : aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.areAllFieldsValid);
                                    } else {
/* 238 */                               mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.component4);
                                    }
                                }
/* 291 */                       return getRevenue(new AFd1bSDK(mediationNetwork2, bArr, "POST", aFh1mSDK.getMediationNetwork, aFh1mSDK.getCurrencyIso4217Code()), new AFd1dSDK());
                            }
/* 129 */                   mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork("https://%spia.%s/api/v1.0/pia-android-event?app_id=");
/* 260 */                   mediationNetwork2 = aFj1cSDK.getMediationNetwork(AFj1cSDK.getRevenue(aFj1cSDK.getMediationNetwork(mediationNetwork), z), z6);
/* 270 */                   copydefault = (hashCode + 41) % 128;
/* 291 */                   return getRevenue(new AFd1bSDK(mediationNetwork2, bArr, "POST", aFh1mSDK.getMediationNetwork, aFh1mSDK.getCurrencyIso4217Code()), new AFd1dSDK());
                        } catch (Throwable th) {
/* 302 */                   Throwable cause = th.getCause();
/* 306 */                   if (cause != null) {
/* 308 */                       throw cause;
                            }
/* 309 */                   throw th;
                        }
                    } catch (Throwable th2) {
/* 318 */               AFLogger.INSTANCE.m1813e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
/* 11 */                return null;
                    }
                }

                public final AFd1hSDK<Map<String, String>> getMediationNetwork(String str, String str2, UUID uuid, String str3) {
/* 1 */             String string = uuid.toString();
/* 7 */             StringBuilder sb = new StringBuilder();
/* 36 */            sb.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName()));
/* 41 */            sb.append("/");
/* 44 */            sb.append(str);
/* 49 */            sb.append("?id=");
/* 52 */            sb.append(str2);
/* 55 */            String string2 = sb.toString();
/* 59 */            Map<String, Object> revenue = getRevenue();
/* 69 */            String strValueOf = String.valueOf(revenue.get("build_number"));
/* 75 */            HashMap map = new HashMap();
/* 84 */            map.put("Af-UUID", uuid.toString());
/* 89 */            map.put("Af-Meta-Sdk-Ver", strValueOf);
/* 104 */           map.put("Af-Meta-Counter", String.valueOf(revenue.get("counter")));
/* 119 */           map.put("Af-Meta-Model", String.valueOf(revenue.get("model")));
/* 134 */           map.put("Af-Meta-Platform", String.valueOf(revenue.get("platformextension")));
/* 149 */           map.put("Af-Meta-System-Version", String.valueOf(revenue.get("sdk")));
/* 164 */           Object[] objArr = new Object[1];
/* 168 */           m1791a("ꪹᇎ䪙佧ퟬ\ueecf脛ᒬ襵㗗݁詼", TextUtils.indexOf((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET, '0', 0) + 13, objArr);
/* 189 */           map.put(((String) objArr[0]).intern(), getMonetizationNetwork(str3, string, "GET", string, str, str2, strValueOf));
/* 204 */           AFd1hSDK<Map<String, String>> revenue2 = getRevenue(new AFd1bSDK(string2, null, "GET", map, false), new AFd1eSDK());
/* 214 */           hashCode = (copydefault + 73) % 128;
/* 216 */           return revenue2;
                }

                public final AFd1hSDK<String> getMonetizationNetwork(Map<String, Object> map, String str) {
/* 10 */            int i = hashCode + 111;
/* 14 */            copydefault = i % 128;
                    try {
/* 31 */                if (i % 2 != 0) {
                            try {
/* 33 */                        Object[] objArr = {map, str};
/* 39 */                        Map map2 = AFa1hSDK.f3072d;
/* 41 */                        Object method = map2.get(1320791325);
/* 45 */                        if (method == null) {
/* 80 */                            method = ((Class) AFa1hSDK.getRevenue(198 - KeyEvent.getDeadChar(0, 0), (char) (TextUtils.lastIndexOf(HttpUrl.FRAGMENT_ENCODE_SET, '0') + 1), 38 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getMethod("getRevenue", Map.class, String.class);
/* 84 */                            map2.put(1320791325, method);
                                }
/* 95 */                        throw null;
                            } catch (Throwable th) {
/* 103 */                       Throwable cause = th.getCause();
/* 107 */                       if (cause != null) {
/* 109 */                           throw cause;
                                }
/* 110 */                       throw th;
                            }
                        }
                        try {
/* 111 */                   Object[] objArr2 = {map, str};
/* 117 */                   Map map3 = AFa1hSDK.f3072d;
/* 119 */                   Object method2 = map3.get(1320791325);
/* 123 */                   if (method2 == null) {
/* 155 */                       method2 = ((Class) AFa1hSDK.getRevenue(197 - TextUtils.indexOf((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET, '0'), (char) (ViewConfiguration.getEdgeSlop() >> 16), 37 - TextUtils.indexOf(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET))).getMethod("getRevenue", Map.class, String.class);
/* 159 */                       map3.put(1320791325, method2);
                            }
/* 169 */                   byte[] bArr = (byte[]) ((Method) method2).invoke(null, objArr2);
/* 171 */                   AFj1cSDK aFj1cSDK = this.component1;
/* 200 */                   AFd1hSDK<String> revenue = getRevenue(new AFd1bSDK(aFj1cSDK.getMediationNetwork(aFj1cSDK.getRevenue.getMediationNetwork("https://%svalidate-and-log.%s/api/v4.0/android/one_time_purchase/validateAndLog?app_id=")), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1dSDK());
/* 210 */                   copydefault = (hashCode + 53) % 128;
/* 212 */                   return revenue;
                        } catch (Throwable th2) {
/* 215 */                   Throwable cause2 = th2.getCause();
/* 219 */                   if (cause2 != null) {
/* 221 */                       throw cause2;
                            }
/* 222 */                   throw th2;
                        }
                    } catch (Throwable th3) {
/* 231 */               AFLogger.INSTANCE.m1813e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
/* 27 */                return null;
                    }
/* 231 */           AFLogger.INSTANCE.m1813e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
/* 27 */            return null;
                }

/* 130 */       public final AFd1hSDK<String> getRevenue(AFh1gSDK aFh1gSDK) {
/* 136 */           AFd1hSDK<String> revenue = getRevenue(new AFd1bSDK(aFh1gSDK.component2, aFh1gSDK.getMonetizationNetwork(), "POST", aFh1gSDK.getMediationNetwork, true), new AFd1dSDK());
                    copydefault = (hashCode + 35) % 128;
                    return revenue;
                }

/* 136 */       private <T> AFd1hSDK<T> getRevenue(AFd1bSDK aFd1bSDK, AFe1zSDK<T> aFe1zSDK) {
/* 137 */           copydefault = (hashCode + 37) % 128;
/* 139 */           AFd1hSDK<T> revenue = getRevenue(aFd1bSDK, aFe1zSDK, AFAdRevenueData());
                    int i = hashCode + 51;
                    copydefault = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 10 / 0;
                    }
                    return revenue;
                }

/* 139 */       public final AFd1hSDK<AFi1vSDK> getRevenue(boolean z, boolean z2, String str, int i) {
                    String str2;
/* 140 */           AFe1vSDK aFe1vSDK = this.component4;
                    str.getClass();
/* 141 */           String str3 = z ? AFe1vSDK.getCurrencyIso4217Code : AFe1vSDK.getMonetizationNetwork;
/* 142 */           String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                    if (!z2) {
/* 142 */               str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 143 */               copydefault = (hashCode + 17) % 128;
/* 144 */               str2 = "stg";
                    }
/* 145 */           if (AFe1vSDK.getMediationNetwork()) {
/* 146 */               copydefault = (hashCode + 93) % 128;
/* 147 */               str4 = (String) aFe1vSDK.getRevenue.getValue();
                    }
/* 151 */           AFd1bSDK aFd1bSDK = new AFd1bSDK(String.format(str3, Arrays.copyOf(new Object[]{str4, str2, aFe1vSDK.AFAdRevenueData(), str}, 4)), "GET");
/* 152 */           aFd1bSDK.component4 = 1500;
/* 153 */           return getRevenue(aFd1bSDK, new AFd1cSDK());
                }

/* 153 */       private <T> AFd1hSDK<T> getRevenue(AFd1bSDK aFd1bSDK, AFe1zSDK<T> aFe1zSDK, boolean z) {
/* 154 */           aFd1bSDK.getCurrencyIso4217Code = z;
/* 155 */           AFd1mSDK aFd1mSDK = this.getCurrencyIso4217Code;
/* 156 */           AFd1hSDK<T> aFd1hSDK = new AFd1hSDK<>(aFd1bSDK, aFd1mSDK.getRevenue, aFd1mSDK.getMonetizationNetwork, aFe1zSDK);
/* 157 */           int i = copydefault + 1;
                    hashCode = i % 128;
                    if (i % 2 != 0) {
                        return aFd1hSDK;
                    }
                    throw null;
                }

/* 204 */       private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
                    AFd1nSDK aFd1nSDK = (AFd1nSDK) objArr[0];
/* 205 */           AFd1bSDK aFd1bSDK = new AFd1bSDK((String) objArr[1], null, "GET", Collections.EMPTY_MAP, false);
/* 207 */           aFd1bSDK.component4 = 10000;
/* 208 */           aFd1bSDK.getRevenue = false;
/* 209 */           AFd1hSDK revenue = aFd1nSDK.getRevenue(aFd1bSDK, new AFd1dSDK());
                    int i = hashCode + 41;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
                        return revenue;
                    }
                    throw null;
                }

/* 209 */       private boolean AFAdRevenueData() {
/* 210 */           return ((Boolean) getMediationNetwork(new Object[]{this}, -221532825, 221532826, System.identityHashCode(this))).booleanValue();
                }

/* 216 */       public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
                    int i4 = ~i;
                    int i5 = ~(i4 | i2);
                    int i6 = ~i2;
                    int i7 = ((i3 | i5 | (~(i6 | i))) * 614) + (i2 * (-613)) + (i * 615);
                    int i8 = ~i3;
                    int i9 = (((~(i | i8 | i2)) | (~(i4 | i6 | i8))) * 614) + (((~(i4 | i8)) | i5 | (~(i8 | i2))) * (-1228)) + i7;
                    if (i9 != 1) {
                        return i9 != 2 ? AFAdRevenueData(objArr) : getCurrencyIso4217Code(objArr);
                    }
                    AFd1nSDK aFd1nSDK = (AFd1nSDK) objArr[0];
/* 218 */           copydefault = (hashCode + 113) % 128;
                    if (aFd1nSDK.AFAdRevenueData.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
                        return Boolean.FALSE;
                    }
                    int i10 = copydefault + 69;
                    hashCode = i10 % 128;
                    return i10 % 2 == 0 ? Boolean.FALSE : Boolean.TRUE;
                }

/* 218 */       public final AFd1kSDK getMediationNetwork(Map<String, Object> map, String str) {
/* 220 */           hashCode = (copydefault + 43) % 128;
                    try {
                        try {
/* 221 */                   Object[] objArr = {map, str};
                            Map map2 = AFa1hSDK.f3072d;
/* 219 */                   Object method = map2.get(1320791325);
                            if (method == null) {
                                method = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 197, (char) KeyEvent.getDeadChar(0, 0), 37 - (Process.myTid() >> 22))).getMethod("getRevenue", Map.class, String.class);
/* 219 */                       map2.put(1320791325, method);
                            }
                            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
                            if (bArr != null) {
                                return new AFd1kSDK(this.getMediationNetwork, bArr);
                            }
/* 222 */                   AFLogger.INSTANCE.m1813e(AFg1cSDK.GENERAL, "AFFinalizer: failed to create bytes.", new IllegalArgumentException("Failed to create bytes from proxyData, bytes are null"), false, false);
/* 223 */                   copydefault = (hashCode + 77) % 128;
                            return null;
                        } catch (Throwable th) {
/* 224 */                   Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
/* 225 */               AFLogger.INSTANCE.m1813e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
                        return null;
                    }
                }

/* 225 */       public static void getMediationNetwork() {
/* 226 */           component3 = (char) 38421;
                    areAllFieldsValid = (char) 15473;
                    equals = (char) 49306;
                    copy = (char) 12673;
                }

/* 226 */       public final AFd1hSDK<String> getMediationNetwork(Map<String, Object> map, String str, String str2) {
/* 227 */           return (AFd1hSDK) getMediationNetwork(new Object[]{this, map, str, str2}, -1130573825, 1130573827, System.identityHashCode(this));
                }

/* 234 */       public final AFd1hSDK<Map<String, Object>> getMonetizationNetwork(String str, String str2) {
/* 241 */           AFd1hSDK<Map<String, Object>> revenue = getRevenue(AFd1fSDK.getRevenue(this.getMediationNetwork.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName(), AFb1kSDK.getCurrencyIso4217Code(this.getMediationNetwork.getMediationNetwork), str, str2), new AFd1iSDK());
                    copydefault = (hashCode + 23) % 128;
                    return revenue;
                }

/* 241 */       public final AFd1hSDK<String> getMonetizationNetwork(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
/* 242 */           String string = uuid.toString();
/* 243 */           HashMap map2 = new HashMap();
/* 244 */           map2.put("ttl", "-1");
/* 245 */           map2.put("uuid", string);
/* 246 */           map2.put(SharedDataContentProvider.BASE_PATH, map);
/* 247 */           map2.put("meta", getRevenue());
                    if (str2 != null) {
/* 248 */               copydefault = (hashCode + 85) % 128;
/* 249 */               map2.put("brand_domain", str2);
/* 250 */               copydefault = (hashCode + 75) % 128;
                    }
/* 251 */           String string2 = AFg1eSDK.getMediationNetwork(map2).toString();
/* 252 */           HashMap map3 = new HashMap();
                    Object[] objArr = new Object[1];
/* 253 */           m1791a("ꪹᇎ䪙佧ퟬ\ueecf脛ᒬ襵㗗݁詼", 12 - View.MeasureSpec.getSize(0), objArr);
                    map3.put(((String) objArr[0]).intern(), getMonetizationNetwork(str3, string, "POST", string2));
                    StringBuilder sb = new StringBuilder();
/* 256 */           sb.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName()));
                    sb.append("/");
                    sb.append(str);
/* 258 */           return getRevenue(new AFd1bSDK(sb.toString(), string2.getBytes(Charset.defaultCharset()), "POST", map3, false), new AFd1dSDK(), true);
                }

/* 258 */       private static String getMonetizationNetwork(String str, String str2, String... strArr) {
/* 259 */           ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
/* 260 */           arrayList.add(1, "v2");
/* 262 */           String strJoin = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
/* 263 */           StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str2);
/* 260 */           sb.append("v2");
/* 264 */           String monetizationNetwork = AFj1dSDK.getMonetizationNetwork(strJoin, sb.toString());
                    int i = hashCode + 9;
                    copydefault = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 60 / 0;
                    }
                    return monetizationNetwork;
                }

/* 264 */       public final AFd1hSDK<AFa1oSDK> getMonetizationNetwork(AFa1rSDK aFa1rSDK) {
/* 272 */           AFd1hSDK<AFa1oSDK> revenue = getRevenue(new AFd1bSDK(aFa1rSDK.component2, AFg1eSDK.getMediationNetwork(aFa1rSDK.AFAdRevenueData).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFa1rSDK.getCurrencyIso4217Code()), new AFa1pSDK());
                    int i = hashCode + 73;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
                        return revenue;
                    }
                    throw null;
                }

/* 321 */       public final AFd1hSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str) {
/* 323 */           copydefault = (hashCode + 9) % 128;
                    try {
/* 324 */               Object[] objArr = {map, str};
                        Map map2 = AFa1hSDK.f3072d;
/* 322 */               Object method = map2.get(1320791325);
                        if (method == null) {
                            method = ((Class) AFa1hSDK.getRevenue(AndroidCharacter.getMirror('0') + 150, (char) View.combineMeasuredStates(0, 0), 37 - (ViewConfiguration.getEdgeSlop() >> 16))).getMethod("getRevenue", Map.class, String.class);
/* 322 */                   map2.put(1320791325, method);
                        }
                        byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
/* 325 */               AFj1cSDK aFj1cSDK = this.component1;
/* 332 */               AFd1hSDK<String> revenue = getRevenue(new AFd1bSDK(aFj1cSDK.getMediationNetwork(aFj1cSDK.getRevenue.getMediationNetwork("https://%svalidate-and-log.%s/api/v4.0/android/subscription/validateAndLog?app_id=")), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1dSDK());
                        int i = hashCode + 49;
                        copydefault = i % 128;
                        if (i % 2 == 0) {
                            return revenue;
                        }
                        throw null;
                    } catch (Throwable th) {
                        try {
/* 333 */                   Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        } catch (Throwable th2) {
/* 334 */                   AFLogger.INSTANCE.m1813e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th2, false, false);
                            return null;
                        }
                    }
                }

/* 334 */       private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
                    String mediationNetwork;
/* 336 */           AFd1nSDK aFd1nSDK = (AFd1nSDK) objArr[0];
                    Map map = (Map) objArr[1];
                    String str = (String) objArr[2];
                    String str2 = (String) objArr[3];
/* 337 */           hashCode = (copydefault + 1) % 128;
                    try {
/* 338 */               Object[] objArr2 = {map, str};
                        Map map2 = AFa1hSDK.f3072d;
/* 335 */               Object method = map2.get(1320791325);
                        if (method == null) {
                            method = ((Class) AFa1hSDK.getRevenue(((byte) KeyEvent.getModifierMetaStateMask()) + 199, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 37 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("getRevenue", Map.class, String.class);
/* 335 */                   map2.put(1320791325, method);
                        }
                        byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr2);
/* 339 */               AFj1cSDK aFj1cSDK = aFd1nSDK.component1;
/* 340 */               if (str2 != null && str2.length() != 0 && !new Regex("4.?(\\d+)?.?(\\d+)").m6223b(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").m6223b(str2)) {
/* 342 */                   hashCode = (copydefault + 11) % 128;
/* 345 */                   mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
                        } else {
/* 346 */                   int i = copydefault + 57;
                            hashCode = i % 128;
                            if (i % 2 != 0) {
/* 347 */                       mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
                            } else {
/* 352 */                       aFj1cSDK.getRevenue.getMediationNetwork("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
/* 353 */                       throw null;
                            }
                        }
/* 351 */               return aFd1nSDK.getRevenue(new AFd1bSDK(aFj1cSDK.getMediationNetwork(aFj1cSDK.getMediationNetwork(mediationNetwork), false), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1dSDK());
                    } catch (Throwable th) {
                        try {
/* 354 */                   Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        } catch (Throwable th2) {
/* 355 */                   AFLogger.INSTANCE.m1813e(AFg1cSDK.ENGAGEMENT, "AFFinalizer: reflection init failed.", th2, false, false);
                            return null;
                        }
                    }
                }

/* 355 */       private void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK, byte[] bArr) {
/* 356 */           int i = copydefault + 79;
                    hashCode = i % 128;
                    int i2 = i % 2;
/* 357 */           AFc1oSDK aFc1oSDK = this.getMediationNetwork;
                    if (i2 != 0) {
/* 359 */               boolean mediationNetwork = aFc1oSDK.getMediationNetwork("com.appsflyer.security.enable");
/* 360 */               if (aFh1mSDK.getMediationNetwork() && mediationNetwork) {
/* 361 */                   hashCode = (copydefault + 73) % 128;
/* 362 */                   if (AFf1eSDK.getRevenue(aFh1mSDK, this.getMediationNetwork)) {
/* 363 */                       int i3 = hashCode + 103;
                                copydefault = i3 % 128;
                                if (i3 % 2 != 0) {
/* 364 */                           AFf1eSDK.getMonetizationNetwork(aFh1mSDK, bArr);
/* 365 */                           int i4 = 88 / 0;
                                } else {
/* 366 */                           AFf1eSDK.getMonetizationNetwork(aFh1mSDK, bArr);
                                }
/* 367 */                       copydefault = (hashCode + 89) % 128;
                                return;
                            }
                            return;
                        }
                        return;
                    }
/* 368 */           aFc1oSDK.getMediationNetwork("com.appsflyer.security.enable");
/* 369 */           aFh1mSDK.getMediationNetwork();
                    throw null;
                }

/* 369 */       public final AFd1hSDK<String> getCurrencyIso4217Code(String str) {
/* 370 */           return (AFd1hSDK) getMediationNetwork(new Object[]{this, str}, 1535622589, -1535622589, System.identityHashCode(this));
                }
            }
