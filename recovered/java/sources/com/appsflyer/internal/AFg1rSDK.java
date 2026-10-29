            package com.appsflyer.internal;

            import android.app.UiModeManager;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.media.AudioTrack;
            import android.os.Build;
            import android.os.Environment;
            import android.os.StatFs;
            import android.os.SystemClock;
            import android.provider.Settings;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AdRevenueScheme;
            import com.appsflyer.AppsFlyerProperties;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.InputStreamReader;
            import java.io.UnsupportedEncodingException;
            import java.nio.charset.Charset;
            import java.security.NoSuchAlgorithmException;
            import java.security.cert.CertificateException;
            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Properties;
            import java.util.TimeZone;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            import p000.C2085pw;
            import p000.b51;
            import p000.m42;
            import p000.n42;
            import p000.nc1;
            import p000.o42;
            import p000.oc1;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 38 */    public final class AFg1rSDK implements AFg1nSDK {
                private static int $10 = 0;
                private static int $11 = 1;

                /* JADX INFO: renamed from: e */
                private static int f3090e = 1;
                private static int unregisterClient;
                private final String AFAdRevenueData;
                private final p51 AFKeystoreWrapper;
                private final AFh1xSDK areAllFieldsValid;
                private final AFc1qSDK component1;
                private final AFg1vSDK component2;
                private final AFi1pSDK component3;
                private final AFc1oSDK component4;
                private final AFc1hSDK copy;
                private final AFg1zSDK copydefault;
                private final p51 equals;
                private final Context getCurrencyIso4217Code;
                private final AFi1kSDK getMediationNetwork;
                private final AFg1uSDK getMonetizationNetwork;
                private final AFj1lSDK getRevenue;
                private final AFf1eSDK hashCode;
                private final AFc1eSDK toString;
                private static char[] AFInAppEventParameterName = {35909, 35928, 35921, 35926, 35927, 35903, 35904, 35924, 35933, 35910, 35931, 35879, 35908, 35905, 35911};
                private static int registerClient = 1912311267;
                private static boolean AFLogger = true;
                private static boolean AFInAppEventType = true;

                /* JADX INFO: renamed from: com.appsflyer.internal.AFg1rSDK$4 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {"Ljava/text/SimpleDateFormat;", "AFAdRevenueData", "()Ljava/text/SimpleDateFormat;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02754 extends b51 implements Function0<SimpleDateFormat> {
                    public static final C02754 getMonetizationNetwork = new C02754();

                    public C02754() {
/* 2 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
                    public final SimpleDateFormat invoke() {
/* 7 */                 return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFg1rSDK$5 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {"Lcom/appsflyer/AppsFlyerProperties;", "getCurrencyIso4217Code", "()Lcom/appsflyer/AppsFlyerProperties;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02765 extends b51 implements Function0<AppsFlyerProperties> {
                    public static final C02765 getMediationNetwork = new C02765();

                    public C02765() {
/* 2 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
                    public final AppsFlyerProperties invoke() {
/* 1 */                 return AppsFlyerProperties.getInstance();
                    }
                }

                public AFg1rSDK(String str, Context context, AFi1kSDK aFi1kSDK, AFg1uSDK aFg1uSDK, AFj1lSDK aFj1lSDK, AFg1vSDK aFg1vSDK, AFh1xSDK aFh1xSDK, AFc1qSDK aFc1qSDK, AFc1oSDK aFc1oSDK, AFi1pSDK aFi1pSDK, AFf1eSDK aFf1eSDK, AFc1hSDK aFc1hSDK, AFg1zSDK aFg1zSDK, AFc1eSDK aFc1eSDK) {
/* 1 */             str.getClass();
/* 4 */             context.getClass();
/* 7 */             aFi1kSDK.getClass();
/* 10 */            aFg1uSDK.getClass();
/* 13 */            aFj1lSDK.getClass();
/* 16 */            aFg1vSDK.getClass();
/* 19 */            aFh1xSDK.getClass();
/* 22 */            aFc1qSDK.getClass();
/* 25 */            aFc1oSDK.getClass();
/* 28 */            aFi1pSDK.getClass();
/* 31 */            aFf1eSDK.getClass();
/* 34 */            aFc1hSDK.getClass();
/* 37 */            aFg1zSDK.getClass();
/* 40 */            aFc1eSDK.getClass();
/* 46 */            this.AFAdRevenueData = str;
/* 48 */            this.getCurrencyIso4217Code = context;
/* 50 */            this.getMediationNetwork = aFi1kSDK;
/* 52 */            this.getMonetizationNetwork = aFg1uSDK;
/* 54 */            this.getRevenue = aFj1lSDK;
/* 56 */            this.component2 = aFg1vSDK;
/* 58 */            this.areAllFieldsValid = aFh1xSDK;
/* 60 */            this.component1 = aFc1qSDK;
/* 62 */            this.component4 = aFc1oSDK;
/* 64 */            this.component3 = aFi1pSDK;
/* 66 */            this.hashCode = aFf1eSDK;
/* 68 */            this.copy = aFc1hSDK;
/* 70 */            this.copydefault = aFg1zSDK;
/* 72 */            this.toString = aFc1eSDK;
/* 80 */            this.equals = r51.m8065b(C02765.getMediationNetwork);
/* 88 */            this.AFKeystoreWrapper = r51.m8065b(C02754.getMonetizationNetwork);
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0078  */
                /* JADX WARN: Code duplicated, block: B:13:0x0085  */
                /* JADX WARN: Code duplicated, block: B:14:0x0090  */
                private void AFAdRevenueData(Map<String, Object> map, boolean z) {
                    int i;
                    AFj1lSDK aFj1lSDK;
/* 1 */             map.getClass();
/* 6 */             HashMap map2 = new HashMap();
/* 17 */            map2.put("cpu_abi", getCurrencyIso4217Code("ro.product.cpu.abi"));
/* 28 */            map2.put("cpu_abi2", getCurrencyIso4217Code("ro.product.cpu.abi2"));
/* 39 */            map2.put("arch", getCurrencyIso4217Code("os.arch"));
/* 50 */            map2.put("build_display_id", getCurrencyIso4217Code("ro.build.display.id"));
/* 53 */            if (z) {
/* 57 */                int i2 = unregisterClient + 55;
/* 61 */                f3090e = i2 % 128;
/* 74 */                if (i2 % 2 == 0) {
/* 84 */                    getRevenue(new Object[]{this, map2}, -753773633, 753773645, System.identityHashCode(this));
/* 97 */                    if (this.component4.getMediationNetwork.getRevenue("appsFlyerCount", 1) <= 4) {
/* 123 */                       int i3 = unregisterClient + 63;
/* 127 */                       f3090e = i3 % 128;
/* 129 */                       i = i3 % 2;
/* 130 */                       aFj1lSDK = this.getRevenue;
/* 132 */                       if (i == 0) {
/* 138 */                           map2.putAll(aFj1lSDK.getMediationNetwork());
/* 143 */                           int i4 = 65 / 0;
                                } else {
/* 149 */                           map2.putAll(aFj1lSDK.getMediationNetwork());
                                }
                            }
                        } else {
/* 108 */                   getRevenue(new Object[]{this, map2}, -753773633, 753773645, System.identityHashCode(this));
/* 119 */                   if (this.component4.getMediationNetwork.getRevenue("appsFlyerCount", 0) <= 2) {
/* 123 */                       int i5 = unregisterClient + 63;
/* 127 */                       f3090e = i5 % 128;
/* 129 */                       i = i5 % 2;
/* 130 */                       aFj1lSDK = this.getRevenue;
/* 132 */                       if (i == 0) {
/* 138 */                           map2.putAll(aFj1lSDK.getMediationNetwork());
/* 143 */                           int i6 = 65 / 0;
                                } else {
/* 149 */                           map2.putAll(aFj1lSDK.getMediationNetwork());
                                }
                            }
                        }
                    }
/* 162 */           map2.put("dim", this.component2.getMediationNetwork(this.getCurrencyIso4217Code));
/* 167 */           map.put("deviceData", map2);
                }

                private void AFInAppEventParameterName(Map<String, Object> map) {
/* 7 */             unregisterClient = (f3090e + 11) % 128;
/* 9 */             map.getClass();
/* 18 */            map.putAll(this.copydefault.AFAdRevenueData());
/* 23 */            int i = unregisterClient + 65;
/* 27 */            f3090e = i % 128;
/* 31 */            if (i % 2 == 0) {
/* 35 */                throw null;
                    }
                }

                private final String AFInAppEventType() {
/* 7 */             File revenue = getRevenue(getCurrencyIso4217Code("ro.appsflyer.preinstall.path"));
/* 15 */            if (getMediationNetwork(revenue)) {
/* 19 */                int i = f3090e + 121;
/* 23 */                unregisterClient = i % 128;
/* 29 */                if (i % 2 != 0) {
/* 35 */                    revenue = getRevenue(getMediationNetwork("AF_PRE_INSTALL_PATH"));
/* 41 */                    int i2 = 28 / 0;
                        } else {
/* 48 */                    revenue = getRevenue(getMediationNetwork("AF_PRE_INSTALL_PATH"));
                        }
                    }
/* 56 */            if (getMediationNetwork(revenue)) {
/* 60 */                revenue = getRevenue("/data/local/tmp/pre_install.appsflyer");
                    }
/* 69 */            if (getMediationNetwork(revenue)) {
/* 73 */                int i3 = unregisterClient + 25;
/* 77 */                f3090e = i3 % 128;
/* 83 */                if (i3 % 2 == 0) {
/* 90 */                    getRevenue("/etc/pre_install.appsflyer");
/* 93 */                    throw null;
                        }
/* 85 */                revenue = getRevenue("/etc/pre_install.appsflyer");
                    }
/* 98 */            if (getMediationNetwork(revenue)) {
/* 104 */               int i4 = (unregisterClient + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE) % 128;
/* 106 */               f3090e = i4;
/* 112 */               unregisterClient = (i4 + 37) % 128;
/* 68 */                return null;
                    }
/* 117 */           String packageName = this.getCurrencyIso4217Code.getPackageName();
/* 121 */           packageName.getClass();
/* 124 */           String mediationNetwork = getMediationNetwork(revenue, packageName);
/* 134 */           unregisterClient = (f3090e + 33) % 128;
/* 136 */           return mediationNetwork;
                }

                private void AFKeystoreWrapper(Map<String, Object> map) {
/* 3 */             int i = f3090e + 37;
/* 7 */             unregisterClient = i % 128;
/* 20 */            if (i % 2 != 0) {
/* 86 */                map.getClass();
/* 103 */               ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
/* 106 */               throw null;
                    }
/* 22 */            map.getClass();
/* 39 */            String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
/* 43 */            if (string != null) {
/* 47 */                int i2 = f3090e + 113;
/* 51 */                unregisterClient = i2 % 128;
/* 55 */                if (i2 % 2 != 0) {
/* 84 */                    throw null;
                        }
/* 61 */                if (string.length() == 0) {
/* 85 */                    return;
                        }
/* 66 */                int i3 = unregisterClient + 11;
/* 70 */                f3090e = i3 % 128;
/* 74 */                if (i3 % 2 != 0) {
/* 76 */                    map.put(AppsFlyerProperties.EXTENSION, string);
                        } else {
/* 80 */                    map.put(AppsFlyerProperties.EXTENSION, string);
/* 83 */                    throw null;
                        }
                    }
                }

                private void AFLogger(Map<String, Object> map) {
/* 7 */             unregisterClient = (f3090e + 93) % 128;
/* 9 */             map.getClass();
/* 26 */            map.put("af_preinstalled", String.valueOf(this.component4.getMonetizationNetwork(this.getCurrencyIso4217Code)));
/* 35 */            f3090e = (unregisterClient + 19) % 128;
                }

                /* JADX INFO: renamed from: a */
                private static void m1804a(String str, int[] iArr, String str2, int i, Object[] objArr) throws UnsupportedEncodingException {
                    Object charArray = str2;
/* 1 */             if (str2 != null) {
/* 5 */                 int i2 = $10 + 51;
/* 9 */                 $11 = i2 % 128;
/* 13 */                if (i2 % 2 == 0) {
/* 20 */                    str2.toCharArray();
/* 24 */                    throw null;
                        }
/* 15 */                charArray = str2.toCharArray();
                    }
/* 25 */            char[] cArr = (char[]) charArray;
                    Object bytes = str;
/* 27 */            if (str != null) {
/* 31 */                bytes = str.getBytes("ISO-8859-1");
                    }
/* 35 */            byte[] bArr = (byte[]) bytes;
/* 39 */            AFk1oSDK aFk1oSDK = new AFk1oSDK();
/* 42 */            char[] cArr2 = AFInAppEventParameterName;
/* 50 */            if (cArr2 != null) {
/* 52 */                int length = cArr2.length;
/* 53 */                char[] cArr3 = new char[length];
/* 55 */                int i3 = 0;
/* 56 */                while (i3 < length) {
/* 60 */                    int i4 = $11 + 7;
/* 64 */                    $10 = i4 % 128;
/* 68 */                    if (i4 % 2 != 0) {
/* 76 */                        cArr3[i3] = (char) (((long) cArr2[i3]) + 1825820251896122634L);
/* 78 */                        i3 /= 0;
                            } else {
/* 87 */                        cArr3[i3] = (char) (((long) cArr2[i3]) ^ 1825820251896122634L);
/* 89 */                        i3++;
                            }
                        }
/* 92 */                cArr2 = cArr3;
                    }
/* 97 */            int i5 = (int) (1825820251896122634L ^ ((long) registerClient));
/* 100 */           if (AFInAppEventType) {
/* 104 */               int i6 = $10 + 43;
/* 108 */               $11 = i6 % 128;
/* 110 */               int i7 = i6 % 2;
/* 112 */               int length2 = bArr.length;
/* 113 */               aFk1oSDK.getMonetizationNetwork = length2;
/* 115 */               char[] cArr4 = new char[length2];
/* 117 */               aFk1oSDK.AFAdRevenueData = 0;
                        while (true) {
/* 119 */                   int i8 = aFk1oSDK.AFAdRevenueData;
/* 121 */                   int i9 = aFk1oSDK.getMonetizationNetwork;
/* 123 */                   if (i8 >= i9) {
/* 147 */                       objArr[0] = new String(cArr4);
/* 149 */                       return;
                            } else {
/* 135 */                       cArr4[i8] = (char) (cArr2[bArr[(i9 - 1) - i8] + i] - i5);
/* 139 */                       aFk1oSDK.AFAdRevenueData = i8 + 1;
                            }
                        }
                    } else if (AFLogger) {
/* 154 */               int length3 = cArr.length;
/* 155 */               aFk1oSDK.getMonetizationNetwork = length3;
/* 157 */               char[] cArr5 = new char[length3];
/* 159 */               aFk1oSDK.AFAdRevenueData = 0;
                        while (true) {
/* 161 */                   int i10 = aFk1oSDK.AFAdRevenueData;
/* 163 */                   int i11 = aFk1oSDK.getMonetizationNetwork;
/* 165 */                   if (i10 >= i11) {
/* 189 */                       objArr[0] = new String(cArr5);
/* 191 */                       return;
                            } else {
/* 177 */                       cArr5[i10] = (char) (cArr2[cArr[(i11 - 1) - i10] - i] - i5);
/* 181 */                       aFk1oSDK.AFAdRevenueData = i10 + 1;
                            }
                        }
                    } else {
/* 192 */               int length4 = iArr.length;
/* 193 */               aFk1oSDK.getMonetizationNetwork = length4;
/* 195 */               char[] cArr6 = new char[length4];
/* 197 */               aFk1oSDK.AFAdRevenueData = 0;
                        while (true) {
/* 199 */                   int i12 = aFk1oSDK.AFAdRevenueData;
/* 201 */                   int i13 = aFk1oSDK.getMonetizationNetwork;
/* 203 */                   if (i12 >= i13) {
/* 227 */                       objArr[0] = new String(cArr6);
/* 229 */                       return;
                            } else {
/* 215 */                       cArr6[i12] = (char) (cArr2[iArr[(i13 - 1) - i12] - i] - i5);
/* 219 */                       aFk1oSDK.AFAdRevenueData = i12 + 1;
                            }
                        }
                    }
                }

                private void afInfoLog(Map<String, Object> map) {
                    String strAFAdRevenueData;
/* 1 */             map.getClass();
/* 31 */            if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
/* 39 */                f3090e = (unregisterClient + 55) % 128;
                        try {
/* 51 */                    this.getCurrencyIso4217Code.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
/* 58 */                    strAFAdRevenueData = this.component4.AFAdRevenueData(this.getCurrencyIso4217Code);
                        } catch (Throwable unused) {
/* 63 */                    strAFAdRevenueData = null;
                        }
/* 64 */                if (strAFAdRevenueData != null) {
/* 68 */                    int i = unregisterClient + 17;
/* 72 */                    f3090e = i % 128;
/* 78 */                    if (i % 2 != 0) {
/* 80 */                        map.put("fb", strAFAdRevenueData);
                            } else {
/* 84 */                        map.put("fb", strAFAdRevenueData);
/* 87 */                        throw null;
                            }
                        }
                    }
                }

                private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
/* 1 */             boolean z = false;
/* 4 */             AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
/* 9 */             Map map = (Map) objArr[1];
/* 11 */            map.getClass();
/* 16 */            String strComponent3 = aFg1rSDK.component4.component3();
/* 22 */            String strAFAdRevenueData = AFAdRevenueData(aFg1rSDK.component1, strComponent3);
/* 36 */            boolean z2 = (strAFAdRevenueData == null || Intrinsics.m6216a(strAFAdRevenueData, strComponent3)) ? false : true;
/* 37 */            if (strAFAdRevenueData == null && strComponent3 != null) {
/* 41 */                z = true;
                    }
/* 42 */            if (z2 || z) {
/* 48 */                map.put("af_latestchannel", strComponent3);
                    }
/* 51 */            String strComponent4 = aFg1rSDK.component4();
/* 55 */            if (strComponent4 != null) {
/* 57 */                Locale locale = Locale.getDefault();
/* 61 */                locale.getClass();
/* 64 */                String lowerCase = strComponent4.toLowerCase(locale);
/* 68 */                lowerCase.getClass();
/* 73 */                map.put("af_installstore", lowerCase);
                    }
/* 94 */            String str = (String) getRevenue(new Object[]{aFg1rSDK}, -994471321, 994471330, System.identityHashCode(aFg1rSDK));
/* 96 */            if (str != null) {
/* 104 */               f3090e = (unregisterClient + 125) % 128;
/* 106 */               Locale locale2 = Locale.getDefault();
/* 110 */               locale2.getClass();
/* 113 */               String lowerCase2 = str.toLowerCase(locale2);
/* 117 */               lowerCase2.getClass();
/* 122 */               map.put("af_preinstall_name", lowerCase2);
                    }
/* 125 */           String strComponent5 = aFg1rSDK.component3();
/* 130 */           if (strComponent5 == null) {
/* 129 */               return null;
                    }
/* 134 */           int i = unregisterClient + 29;
/* 138 */           f3090e = i % 128;
/* 144 */           if (i % 2 != 0) {
/* 146 */               Locale locale3 = Locale.getDefault();
/* 150 */               locale3.getClass();
/* 153 */               String lowerCase3 = strComponent5.toLowerCase(locale3);
/* 157 */               lowerCase3.getClass();
/* 160 */               map.put("af_currentstore", lowerCase3);
/* 129 */               return null;
                    }
/* 164 */           Locale locale4 = Locale.getDefault();
/* 168 */           locale4.getClass();
/* 171 */           String lowerCase4 = strComponent5.toLowerCase(locale4);
/* 175 */           lowerCase4.getClass();
/* 178 */           map.put("af_currentstore", lowerCase4);
/* 181 */           throw null;
                }

                private static /* synthetic */ Object component1(Object[] objArr) {
/* 4 */             AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
/* 9 */             Map map = (Map) objArr[1];
                    try {
/* 32 */                long jLongValue = ((Long) getRevenue(new Object[]{aFg1rSDK}, 1297709710, -1297709700, System.identityHashCode(aFg1rSDK))).longValue();
/* 42 */                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
/* 53 */                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
/* 65 */                map.put("installDate", simpleDateFormat.format(new Date(jLongValue)));
/* 74 */                unregisterClient = (f3090e + 13) % 128;
/* 11 */                return null;
                    } catch (Exception e) {
/* 80 */                AFLogger.afErrorLog("Exception while collecting install date. ", e);
/* 11 */                return null;
                    }
                }

                private static void component2(Map<String, Object> map) throws UnsupportedEncodingException {
/* 7 */             f3090e = (unregisterClient + 123) % 128;
/* 9 */             map.getClass();
/* 22 */            Object[] objArr = new Object[1];
/* 27 */            m1804a("\u008f\u0089\u0087\u0083\u008e", null, null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, objArr);
/* 41 */            map.put(((String) objArr[0]).intern(), Build.BRAND);
/* 48 */            map.put("device", Build.DEVICE);
/* 55 */            map.put("product", Build.PRODUCT);
/* 66 */            map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
/* 73 */            map.put("model", Build.MODEL);
/* 80 */            map.put("deviceType", Build.TYPE);
/* 85 */            int i = unregisterClient + 71;
/* 89 */            f3090e = i % 128;
/* 93 */            if (i % 2 == 0) {
/* 96 */                throw null;
                    }
                }

                private static /* synthetic */ Object component3(Object[] objArr) {
/* 4 */             AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
/* 28 */            String string = ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).getString("preInstallName");
/* 32 */            if (string != null) {
/* 40 */                f3090e = (unregisterClient + 39) % 128;
/* 42 */                return string;
                    }
/* 46 */            String monetizationNetwork = aFg1rSDK.component1.getMonetizationNetwork("preInstallName", (String) null);
/* 50 */            if (monetizationNetwork != null) {
/* 66 */                ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).set("preInstallName", monetizationNetwork);
/* 71 */                int i = f3090e + 71;
/* 75 */                unregisterClient = i % 128;
/* 79 */                if (i % 2 == 0) {
/* 81 */                    return monetizationNetwork;
                        }
/* 82 */                throw null;
                    }
/* 83 */            String strAFInAppEventType = aFg1rSDK.AFInAppEventType();
/* 87 */            if (strAFInAppEventType == null) {
/* 91 */                int i2 = f3090e + 45;
/* 95 */                unregisterClient = i2 % 128;
/* 101 */               if (i2 % 2 != 0) {
/* 103 */                   strAFInAppEventType = aFg1rSDK.getMediationNetwork("AF_PRE_INSTALL_NAME");
/* 109 */                   int i3 = 98 / 0;
                        } else {
/* 111 */                   strAFInAppEventType = aFg1rSDK.getMediationNetwork("AF_PRE_INSTALL_NAME");
                        }
                    }
/* 115 */           if (strAFInAppEventType != null) {
/* 119 */               aFg1rSDK.component1.getRevenue("preInstallName", strAFInAppEventType);
/* 136 */               ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).set("preInstallName", strAFInAppEventType);
                    }
/* 145 */           unregisterClient = (f3090e + 15) % 128;
/* 147 */           return strAFInAppEventType;
                }

                private String component4() {
/* 3 */             int i = unregisterClient + 61;
/* 7 */             f3090e = i % 128;
/* 9 */             int i2 = i % 2;
/* 11 */            AFc1qSDK aFc1qSDK = this.component1;
/* 16 */            if (i2 == 0) {
/* 66 */                aFc1qSDK.getMonetizationNetwork("INSTALL_STORE", (String) null);
/* 69 */                throw null;
                    }
/* 18 */            String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("INSTALL_STORE", (String) null);
/* 22 */            if (monetizationNetwork != null) {
/* 26 */                int i3 = unregisterClient + 37;
/* 30 */                f3090e = i3 % 128;
/* 34 */                if (i3 % 2 != 0) {
/* 36 */                    return monetizationNetwork;
                        }
/* 37 */                throw null;
                    }
/* 38 */            String strComponent3 = component3();
/* 42 */            if (strComponent3 != null) {
/* 46 */                this.component1.getRevenue("INSTALL_STORE", strComponent3);
                    }
/* 51 */            int i4 = unregisterClient + 67;
/* 55 */            f3090e = i4 % 128;
/* 59 */            if (i4 % 2 == 0) {
/* 63 */                int i5 = 79 / 0;
                    }
/* 65 */            return strComponent3;
                }

                /* JADX WARN: Multi-variable type inference failed */
                private final String copy() {
                    String str;
/* 3 */             int i = f3090e + 103;
/* 7 */             unregisterClient = i % 128;
/* 9 */             int i2 = i % 2;
/* 11 */            AFc1qSDK aFc1qSDK = this.component1;
                    try {
/* 18 */                if (i2 != 0) {
/* 54 */                    aFc1qSDK.getMonetizationNetwork("androidIdCached", (String) null);
/* 64 */                    Settings.Secure.getString(this.getCurrencyIso4217Code.getContentResolver(), "android_id");
/* 67 */                    throw null;
                        }
/* 20 */                String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("androidIdCached", (String) null);
/* 30 */                String string = Settings.Secure.getString(this.getCurrencyIso4217Code.getContentResolver(), "android_id");
                        str = monetizationNetwork;
/* 34 */                if (string != null) {
/* 38 */                    int i3 = unregisterClient + 99;
/* 42 */                    f3090e = i3 % 128;
/* 46 */                    if (i3 % 2 != 0) {
/* 48 */                        return string;
                            }
/* 49 */                    throw null;
                        }
/* 77 */                if (str == 0) {
/* 17 */                    return null;
                        }
/* 81 */                int i4 = f3090e + 63;
/* 85 */                unregisterClient = i4 % 128;
/* 91 */                if (i4 % 2 != 0) {
/* 105 */                   AFLogger.afDebugLog("use cached AndroidId: " + str);
/* 110 */                   int i5 = 53 / 0;
                        } else {
/* 125 */                   AFLogger.afDebugLog("use cached AndroidId: " + str);
                        }
/* 128 */               return str;
                    } catch (Exception e) {
/* 74 */                AFLogger.afErrorLog(e.getMessage(), e);
                        str = i2;
                    }
                }

                private static List<AFe1pSDK> copydefault() {
/* 7 */             unregisterClient = (f3090e + 107) % 128;
/* 27 */            List<AFe1pSDK> listM7566e = C2085pw.m7566e(AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.ADREVENUE);
/* 37 */            f3090e = (unregisterClient + 41) % 128;
/* 39 */            return listM7566e;
                }

                /* JADX INFO: renamed from: d */
                private void m1805d(Map<String, Object> map) {
/* 7 */             f3090e = (unregisterClient + 115) % 128;
/* 9 */             map.getClass();
/* 20 */            if (this.component1.getMonetizationNetwork("is_stop_tracking_used")) {
/* 35 */                map.put("istu", String.valueOf(this.component1.getMediationNetwork("is_stop_tracking_used", false)));
                    }
/* 40 */            int i = unregisterClient + 83;
/* 44 */            f3090e = i % 128;
/* 48 */            if (i % 2 == 0) {
/* 52 */                throw null;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:9:0x0047  */
                /* JADX INFO: renamed from: e */
                private void m1806e(Map<String, Object> map) {
/* 3 */             int i = unregisterClient + 63;
/* 7 */             f3090e = i % 128;
/* 13 */            if (i % 2 == 0) {
/* 15 */                map.getClass();
/* 20 */                boolean monetizationNetwork = AFg1sSDK.getMonetizationNetwork(this.getCurrencyIso4217Code);
/* 36 */                AFLogger.afDebugLog("didConfigureTokenRefreshService=" + monetizationNetwork);
/* 41 */                int i2 = 64 / 0;
/* 43 */                if (!monetizationNetwork) {
/* 76 */                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                        }
                    } else {
/* 46 */                map.getClass();
/* 51 */                boolean monetizationNetwork2 = AFg1sSDK.getMonetizationNetwork(this.getCurrencyIso4217Code);
/* 67 */                AFLogger.afDebugLog("didConfigureTokenRefreshService=" + monetizationNetwork2);
/* 70 */                if (!monetizationNetwork2) {
/* 76 */                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                        }
                    }
/* 91 */            map.put("registeredUninstall", Boolean.valueOf(AFg1sSDK.AFAdRevenueData(this.component1)));
/* 100 */           f3090e = (unregisterClient + 51) % 128;
                }

                private void equals(Map<String, Object> map) {
/* 3 */             int i = unregisterClient + 41;
/* 7 */             f3090e = i % 128;
/* 15 */            if (i % 2 != 0) {
/* 17 */                map.getClass();
/* 38 */                map.put("is_pc", Boolean.valueOf(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
                    } else {
/* 42 */                map.getClass();
/* 63 */                map.put("is_pc", Boolean.valueOf(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
/* 67 */                throw null;
                    }
                }

                public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i2, int i3) {
                    long j;
/* 6 */             int i4 = ~i3;
/* 18 */            int i5 = ((i2 | i3) * 521) + (((~(i4 | i2)) | i) * (-1042)) + (i2 * (-520)) + (i * 522);
/* 19 */            int i6 = ~i;
                    switch ((((~(i | i4 | i2)) | (~(i3 | i6)) | (~((~i2) | i6))) * 521) + i5) {
                        case 1:
/* 285 */                   return AFAdRevenueData(objArr);
                        case 2:
/* 280 */                   return getCurrencyIso4217Code(objArr);
                        case 3:
/* 275 */                   return getRevenue(objArr);
                        case 4:
/* 270 */                   return getMediationNetwork(objArr);
                        case 5:
/* 265 */                   return getMonetizationNetwork(objArr);
                        case 6:
/* 260 */                   return areAllFieldsValid(objArr);
                        case 7:
/* 255 */                   return component2(objArr);
                        case 8:
/* 250 */                   return component1(objArr);
                        case 9:
/* 245 */                   return component3(objArr);
                        case 10:
/* 240 */                   return component4(objArr);
                        case 11:
/* 129 */                   AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
/* 133 */                   AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
/* 141 */                   f3090e = (unregisterClient + 29) % 128;
/* 143 */                   aFh1mSDK.getClass();
/* 146 */                   Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
/* 148 */                   map.getClass();
/* 165 */                   getRevenue(new Object[]{aFg1rSDK, map}, -539509618, 539509626, System.identityHashCode(aFg1rSDK));
/* 168 */                   Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
/* 170 */                   map2.getClass();
/* 175 */                   aFg1rSDK.getMediationNetwork(map2, aFh1mSDK.component4);
/* 178 */                   Map<String, Object> map3 = aFh1mSDK.AFAdRevenueData;
/* 180 */                   map3.getClass();
/* 197 */                   getRevenue(new Object[]{aFg1rSDK, map3}, 1731268052, -1731268046, System.identityHashCode(aFg1rSDK));
/* 200 */                   Map<String, Object> map4 = aFh1mSDK.AFAdRevenueData;
/* 202 */                   map4.getClass();
/* 205 */                   aFg1rSDK.AFLogger(map4);
/* 208 */                   Map<String, Object> map5 = aFh1mSDK.AFAdRevenueData;
/* 210 */                   map5.getClass();
/* 213 */                   aFg1rSDK.afInfoLog(map5);
/* 216 */                   Map<String, Object> map6 = aFh1mSDK.AFAdRevenueData;
/* 218 */                   map6.getClass();
/* 221 */                   AFe1pSDK aFe1pSDKAFAdRevenueData = aFh1mSDK.AFAdRevenueData();
/* 225 */                   aFe1pSDKAFAdRevenueData.getClass();
/* 228 */                   aFg1rSDK.getMediationNetwork(map6, aFe1pSDKAFAdRevenueData);
/* 237 */                   unregisterClient = (f3090e + 51) % 128;
/* 33 */                    return null;
                        case 12:
/* 122 */                   return toString(objArr);
                        default:
/* 41 */                    AFg1rSDK aFg1rSDK2 = (AFg1rSDK) objArr[0];
/* 45 */                    Map map7 = (Map) objArr[1];
/* 53 */                    unregisterClient = (f3090e + 23) % 128;
/* 55 */                    map7.getClass();
/* 64 */                    long monetizationNetwork = aFg1rSDK2.component1.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
/* 68 */                    long jCurrentTimeMillis = System.currentTimeMillis();
/* 74 */                    aFg1rSDK2.component1.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
/* 79 */                    if (monetizationNetwork > 0) {
/* 83 */                        int i7 = unregisterClient + 35;
/* 87 */                        f3090e = i7 % 128;
/* 100 */                       j = i7 % 2 == 0 ? (jCurrentTimeMillis ^ monetizationNetwork) / 1000 : (jCurrentTimeMillis - monetizationNetwork) / 1000;
                            } else {
/* 108 */                       f3090e = (unregisterClient + 1) % 128;
/* 110 */                       j = -1;
                            }
/* 118 */                   map7.put("timepassedsincelastlaunch", String.valueOf(j));
/* 33 */                    return null;
                    }
                }

                private void hashCode(Map<String, Object> map) {
/* 15 */            getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
                }

                /* JADX INFO: renamed from: i */
                private void m1807i(Map<String, Object> map) {
/* 7 */             unregisterClient = (f3090e + 47) % 128;
/* 9 */             map.getClass();
/* 18 */            AFb1jSDK aFb1jSDKM1774l_ = AFb1lSDK.m1774l_(this.getCurrencyIso4217Code.getContentResolver());
/* 22 */            if (aFb1jSDKM1774l_ == null) {
/* 57 */                f3090e = (unregisterClient + 109) % 128;
/* 59 */                return;
                    }
/* 30 */            unregisterClient = (f3090e + 33) % 128;
/* 36 */            map.put("amazon_aid", aFb1jSDKM1774l_.getRevenue);
/* 47 */            map.put("amazon_aid_limit", String.valueOf(aFb1jSDKM1774l_.getCurrencyIso4217Code));
                }

                private void registerClient(Map<String, Object> map) {
/* 15 */            getRevenue(new Object[]{this, map}, 1731268052, -1731268046, System.identityHashCode(this));
                }

                private static /* synthetic */ Object toString(Object[] objArr) {
/* 4 */             AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
/* 9 */             Map map = (Map) objArr[1];
/* 15 */            AFg1uSDK.AFa1zSDK currencyIso4217Code = aFg1rSDK.getMonetizationNetwork.getCurrencyIso4217Code(aFg1rSDK.getCurrencyIso4217Code);
/* 19 */            float f = currencyIso4217Code.getMonetizationNetwork;
/* 21 */            String str = currencyIso4217Code.AFAdRevenueData;
/* 29 */            map.put("btl", String.valueOf(f));
/* 33 */            if (str != null) {
/* 37 */                int i = f3090e + 109;
/* 41 */                unregisterClient = i % 128;
/* 47 */                if (i % 2 != 0) {
/* 53 */                    map.put("btch", str);
/* 56 */                    throw null;
                        }
/* 49 */                map.put("btch", str);
                    }
/* 59 */            int i2 = f3090e + 67;
/* 63 */            unregisterClient = i2 % 128;
/* 67 */            if (i2 % 2 == 0) {
/* 32 */                return null;
                    }
/* 70 */            throw null;
                }

                private static void unregisterClient(Map<String, Object> map) {
/* 16 */            getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
                }

                /* JADX INFO: renamed from: w */
                private void m1808w(Map<String, Object> map) {
/* 3 */             int i = f3090e + 87;
/* 7 */             unregisterClient = i % 128;
/* 12 */            if (i % 2 != 0) {
/* 68 */                map.getClass();
/* 73 */                this.hashCode.getMediationNetwork();
/* 76 */                throw null;
                    }
/* 14 */            map.getClass();
/* 19 */            String mediationNetwork = this.hashCode.getMediationNetwork();
/* 23 */            if (mediationNetwork != null) {
/* 27 */                int i2 = unregisterClient + 71;
/* 31 */                f3090e = i2 % 128;
/* 35 */                if (i2 % 2 == 0) {
/* 50 */                    throw null;
                        }
/* 41 */                if (mediationNetwork.length() != 0) {
/* 46 */                    map.put("appsflyerKey", mediationNetwork);
                        }
                    }
/* 53 */            int i3 = unregisterClient + 43;
/* 57 */            f3090e = i3 % 128;
/* 61 */            if (i3 % 2 == 0) {
/* 65 */                int i4 = 60 / 0;
                    }
                }

                @Override // com.appsflyer.internal.AFg1nSDK
                public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
/* 7 */             f3090e = (unregisterClient + 25) % 128;
/* 9 */             aFh1mSDK.getClass();
/* 12 */            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
/* 14 */            map.getClass();
/* 21 */            AFAdRevenueData(map, aFh1mSDK.getRevenue());
/* 24 */            component2(map);
/* 42 */            getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
/* 45 */            getRevenue(map);
/* 66 */            getRevenue(new Object[]{this, map, this.toString.getCurrencyIso4217Code}, 274047423, -274047418, System.identityHashCode(this));
/* 69 */            m1807i(map);
/* 128 */           map.put("cell", oc1.m7131e(new Pair("mcc", Integer.valueOf(this.getCurrencyIso4217Code.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.getCurrencyIso4217Code.getResources().getConfiguration().mnc))));
/* 137 */           map.put("sig", AFAdRevenueData());
/* 150 */           map.put("last_boot_time", Long.valueOf(component1()));
/* 159 */           map.put("disk", component2());
/* 164 */           int i = unregisterClient + 75;
/* 168 */           f3090e = i % 128;
/* 172 */           if (i % 2 == 0) {
/* 176 */               throw null;
                    }
                }

                @Override // com.appsflyer.internal.AFg1nSDK
                public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
                    boolean zM6216a;
/* 1 */             aFh1mSDK.getClass();
/* 10 */            if (this.component4.component2()) {
/* 69 */                AFh1rSDK aFh1rSDK = this.component4.getMonetizationNetwork.component3;
/* 71 */                if (aFh1rSDK == null) {
/* 228 */                   return;
                        }
/* 75 */                String str = aFh1rSDK.getMediationNetwork;
/* 77 */                if (str != null && str.length() != 0) {
/* 90 */                    aFh1mSDK.getMonetizationNetwork("gaidError", aFh1rSDK.getMediationNetwork);
                        }
/* 93 */                String str2 = aFh1rSDK.getMonetizationNetwork;
/* 95 */                if (str2 != null && aFh1rSDK.AFAdRevenueData != null) {
/* 107 */                   f3090e = (unregisterClient + 89) % 128;
/* 111 */                   aFh1mSDK.getMonetizationNetwork("advertiserId", str2);
/* 122 */                   aFh1mSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(aFh1rSDK.AFAdRevenueData));
/* 133 */                   aFh1mSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(aFh1rSDK.getRevenue));
                        }
                    } else {
/* 14 */                int i = unregisterClient + 91;
/* 18 */                f3090e = i % 128;
/* 24 */                if (i % 2 == 0) {
/* 51 */                    Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
/* 55 */                    mediationNetwork.getClass();
/* 60 */                    mediationNetwork.put("ad_ids_disabled", Boolean.TRUE);
/* 64 */                    throw null;
                        }
/* 28 */                Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
/* 32 */                mediationNetwork2.getClass();
/* 37 */                mediationNetwork2.put("ad_ids_disabled", Boolean.TRUE);
/* 46 */                f3090e = (unregisterClient + 83) % 128;
                    }
/* 140 */           AFh1rSDK aFh1rSDK2 = this.component4.getMonetizationNetwork.component3;
/* 142 */           if (aFh1rSDK2 != null) {
/* 150 */               f3090e = (unregisterClient + 81) % 128;
/* 156 */               zM6216a = Intrinsics.m6216a(aFh1rSDK2.areAllFieldsValid, Boolean.TRUE);
                    } else {
/* 161 */               zM6216a = false;
                    }
/* 168 */           aFh1mSDK.getMonetizationNetwork("GAID_retry", String.valueOf(zM6216a));
/* 191 */           if (C2085pw.m7566e(AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH).contains(aFh1mSDK.AFAdRevenueData())) {
/* 195 */               AFd1aSDK aFd1aSDK = this.toString.component4;
/* 197 */               if (aFd1aSDK == null) {
/* 226 */                   unregisterClient = (f3090e + 77) % 128;
/* 228 */                   return;
                        }
/* 201 */               Map<String, Object> mediationNetwork3 = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
/* 205 */               mediationNetwork3.getClass();
/* 216 */               mediationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getMediationNetwork));
                    }
                }

                @Override // com.appsflyer.internal.AFg1nSDK
                public final void getMonetizationNetwork(Map<String, Object> map) {
/* 1 */             map.getClass();
/* 26 */            Object string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_ID);
/* 30 */            if (string != null) {
/* 32 */                map.put(AppsFlyerProperties.APP_ID, string);
                    }
/* 51 */            String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.CURRENCY_CODE);
/* 55 */            if (string2 != null) {
/* 62 */                if (string2.length() != 3) {
/* 68 */                    StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
/* 71 */                    sb.append(string2);
/* 76 */                    sb.append("' is not a legal value.");
/* 83 */                    AFLogger.afWarnLog(sb.toString());
                        }
/* 88 */                map.put(FirebaseAnalytics.Param.CURRENCY, string2);
                    } else {
/* 98 */                f3090e = (unregisterClient + 67) % 128;
                    }
/* 116 */           Object string3 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.IS_UPDATE);
/* 120 */           if (string3 != null) {
/* 124 */               map.put("isUpdate", string3);
                    }
/* 143 */           Object string4 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
/* 147 */           if (string4 != null) {
/* 151 */               map.put("customData", string4);
                    }
/* 170 */           Object string5 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_USER_ID);
/* 174 */           if (string5 != null) {
/* 178 */               map.put("appUserId", string5);
/* 187 */               f3090e = (unregisterClient + 35) % 128;
                    }
/* 205 */           Object string6 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.USER_EMAILS);
/* 209 */           if (string6 != null) {
/* 213 */               map.put("user_emails", string6);
                    }
/* 218 */           AFb1tSDK aFb1tSDK = this.toString.getRevenue;
/* 220 */           if (aFb1tSDK != null) {
/* 224 */               int i = unregisterClient + 1;
/* 228 */               f3090e = i % 128;
/* 232 */               if (i % 2 == 0) {
/* 244 */                   String[] strArr = aFb1tSDK.AFAdRevenueData;
/* 247 */                   throw null;
                        }
/* 234 */               Object obj = aFb1tSDK.AFAdRevenueData;
/* 236 */               if (obj != null) {
/* 240 */                   map.put("sharing_filter", obj);
                        }
                    }
                }

/* 39 */        private final void copydefault(Map<String, Object> map) {
/* 40 */            f3090e = (unregisterClient + 45) % 128;
/* 41 */            if (AFg1iSDK.getMonetizationNetwork(this.getCurrencyIso4217Code)) {
/* 42 */                map.put("inst_app", Boolean.TRUE);
/* 43 */                unregisterClient = (f3090e + 61) % 128;
                    }
                }

/* 67 */        private String equals() {
/* 68 */            return (String) getRevenue(new Object[]{this}, -994471321, 994471330, System.identityHashCode(this));
                }

/* 69 */        private static /* synthetic */ Object component4(Object[] objArr) {
                    AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
/* 70 */            f3090e = (unregisterClient + 79) % 128;
                    Long lValueOf = Long.valueOf(aFg1rSDK.component4.m1787n_().firstInstallTime);
                    int i = unregisterClient + 85;
                    f3090e = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 20 / 0;
                    }
                    return lValueOf;
                }

/* 70 */        private final void component4(Map<String, Object> map) {
/* 71 */            getRevenue(new Object[]{this, map}, -753773633, 753773645, System.identityHashCode(this));
                }

/* 70 */        private final void toString(Map<String, Object> map) {
/* 71 */            int i = unregisterClient + 93;
                    f3090e = i % 128;
                    int i2 = i % 2;
/* 72 */            Context context = this.getCurrencyIso4217Code;
                    if (i2 != 0) {
/* 74 */                UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
/* 75 */                if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                            return;
                        }
/* 76 */                int i3 = unregisterClient + 33;
                        f3090e = i3 % 128;
                        if (i3 % 2 == 0) {
/* 77 */                    map.put("tv", Boolean.TRUE);
/* 78 */                    int i4 = 55 / 0;
                            return;
                        } else {
/* 79 */                    map.put("tv", Boolean.TRUE);
                            return;
                        }
                    }
                    throw null;
                }

/* 83 */        private static long component1() {
/* 84 */            f3090e = (unregisterClient + 73) % 128;
                    long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                    f3090e = (unregisterClient + 3) % 128;
                    return jCurrentTimeMillis;
                }

/* 84 */        private void component1(Map<String, ? extends Object> map) {
/* 85 */            getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
                }

/* 96 */        private static String component2() {
/* 97 */            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
/* 98 */            long blockSizeLong = statFs.getBlockSizeLong();
/* 99 */            long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
/* 100 */           long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
/* 101 */           double dPow = Math.pow(2.0d, 20.0d);
                    String str = ((long) (availableBlocksLong / dPow)) + "/" + ((long) (blockCountLong / dPow));
                    f3090e = (unregisterClient + 21) % 128;
                    return str;
                }

/* 102 */       private static /* synthetic */ Object component2(Object[] objArr) {
                    AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
/* 103 */           int i = unregisterClient + 15;
                    f3090e = i % 128;
                    int i2 = i % 2;
                    AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) aFg1rSDK.equals.getValue();
                    if (i2 == 0) {
                        int i3 = 65 / 0;
                    }
                    int i4 = f3090e + 91;
                    unregisterClient = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 19 / 0;
                    }
                    return appsFlyerProperties;
                }

/* 106 */       private final boolean AFKeystoreWrapper() {
/* 107 */           unregisterClient = (f3090e + 29) % 128;
/* 108 */           if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                        f3090e = (unregisterClient + 67) % 128;
                        return true;
                    }
/* 110 */           AFa1ySDK.getRevenue();
                    return !AFa1ySDK.getRevenue(this.getCurrencyIso4217Code);
                }

/* 129 */       private void copy(Map<String, Object> map) {
/* 130 */           f3090e = (unregisterClient + 113) % 128;
/* 131 */           map.getClass();
/* 133 */           long j = this.areAllFieldsValid.copydefault;
                    if (j != 0) {
/* 134 */               int i = unregisterClient + 59;
                        f3090e = i % 128;
                        if (i % 2 != 0) {
/* 136 */                   map.put("prev_session_dur", Long.valueOf(j));
                        } else {
/* 138 */                   map.put("prev_session_dur", Long.valueOf(j));
/* 139 */                   throw null;
                        }
                    }
                }

/* 136 */       private static void AFInAppEventType(Map<String, Object> map) {
/* 137 */           getRevenue(new Object[]{map}, -1520031212, 1520031215, (int) System.currentTimeMillis());
                }

/* 147 */       private String component3() {
/* 148 */           f3090e = (unregisterClient + 107) % 128;
/* 149 */           String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
                    if (string != null) {
                        return string;
                    }
/* 150 */           int i = f3090e + 43;
                    unregisterClient = i % 128;
                    if (i % 2 == 0) {
                        return getMediationNetwork("AF_STORE");
                    }
                    getMediationNetwork("AF_STORE");
                    throw null;
                }

/* 150 */       private void component3(Map<String, Object> map) {
/* 151 */           int i = unregisterClient + 81;
                    f3090e = i % 128;
                    if (i % 2 != 0) {
/* 152 */               map.getClass();
/* 153 */               String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
/* 154 */               String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
                        if (string != null) {
/* 155 */                   map.put("onelink_id", string);
                        }
                        if (string2 != null) {
/* 156 */                   f3090e = (unregisterClient + 85) % 128;
/* 157 */                   map.put("onelink_ver", string2);
                            return;
                        }
                        return;
                    }
/* 158 */           map.getClass();
/* 159 */           ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
/* 160 */           ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
/* 161 */           throw null;
                }

                @Override // com.appsflyer.internal.AFg1nSDK
/* 170 */       public final void AFAdRevenueData(Map<String, Object> map) {
/* 171 */           map.getClass();
/* 173 */           String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.component4.getMediationNetwork);
                    if (currencyIso4217Code != null) {
/* 174 */               map.put("uid", currencyIso4217Code);
/* 176 */               if (this.component4.getMediationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", false)) {
/* 177 */                   int i = f3090e + 53;
                            unregisterClient = i % 128;
                            if (i % 2 == 0) {
/* 178 */                       map.put("custom_install_id", Boolean.TRUE);
                            } else {
                                map.put("custom_install_id", Boolean.TRUE);
/* 179 */                       throw null;
                            }
                        }
/* 180 */               f3090e = (unregisterClient + 5) % 128;
                    }
                }

                @Override // com.appsflyer.internal.AFg1nSDK
/* 176 */       public final long getCurrencyIso4217Code() {
/* 177 */           unregisterClient = (f3090e + 103) % 128;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    unregisterClient = (f3090e + 119) % 128;
                    return jCurrentTimeMillis;
                }

                @Override // com.appsflyer.internal.AFg1nSDK
/* 177 */       public final void getCurrencyIso4217Code(Map<String, Object> map, int i, int i2) {
                    boolean z;
/* 178 */           int i3 = unregisterClient + 121;
                    f3090e = i3 % 128;
                    if (i3 % 2 != 0) {
/* 179 */               map.getClass();
/* 180 */               map.put("counter", String.valueOf(i));
/* 181 */               map.put("iaecounter", String.valueOf(i2));
/* 182 */               if (areAllFieldsValid()) {
                            z = false;
                        } else {
                            f3090e = (unregisterClient + 103) % 128;
                            z = true;
                        }
                        map.put("isFirstCall", String.valueOf(z));
/* 183 */               f3090e = (unregisterClient + 103) % 128;
                        return;
                    }
                    map.getClass();
/* 184 */           map.put("counter", String.valueOf(i));
/* 185 */           map.put("iaecounter", String.valueOf(i2));
/* 186 */           areAllFieldsValid();
                    throw null;
                }

/* 180 */       private void AFAdRevenueData(AFh1mSDK aFh1mSDK, String str, String str2, AFb1rSDK aFb1rSDK) {
/* 181 */           aFh1mSDK.getClass();
/* 182 */           Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
/* 183 */           if (aFh1mSDK.AFAdRevenueData() == AFe1pSDK.CONVERSION) {
/* 184 */               int i = unregisterClient + 73;
                        f3090e = i % 128;
                        if (i % 2 != 0) {
/* 185 */                   map.getClass();
                            areAllFieldsValid(map);
/* 186 */                   toString(map);
/* 187 */                   copydefault(map);
/* 188 */                   AFa1vSDK.getMonetizationNetwork(this.copy, this.component4);
                        } else {
/* 189 */                   map.getClass();
                            areAllFieldsValid(map);
/* 190 */                   toString(map);
/* 191 */                   copydefault(map);
/* 192 */                   AFa1vSDK.getMonetizationNetwork(this.copy, this.component4);
/* 193 */                   throw null;
                        }
                    }
                    map.getClass();
                    getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
/* 194 */           component3(map);
/* 195 */           getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
/* 196 */           getMonetizationNetwork(map, str2);
/* 197 */           getRevenue(map, str);
/* 198 */           copy(map);
                    if (aFb1rSDK == null) {
                        f3090e = (unregisterClient + 25) % 128;
                        return;
                    }
/* 199 */           int i2 = f3090e + 103;
                    unregisterClient = i2 % 128;
                    if (i2 % 2 == 0) {
/* 200 */               aFb1rSDK.getCurrencyIso4217Code(map);
                    } else {
/* 201 */               aFb1rSDK.getCurrencyIso4217Code(map);
                        throw null;
                    }
                }

/* 182 */       private final void areAllFieldsValid(Map<String, Object> map) {
/* 183 */           int i = f3090e + 125;
                    unregisterClient = i % 128;
                    if (i % 2 == 0) {
/* 184 */               if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled()) {
                            return;
                        }
/* 185 */               int i2 = unregisterClient + 9;
                        f3090e = i2 % 128;
                        int i3 = i2 % 2;
/* 186 */               AFg1uSDK aFg1uSDK = this.getMonetizationNetwork;
                        if (i3 != 0) {
/* 187 */                   map.put("batteryLevel", String.valueOf(aFg1uSDK.getCurrencyIso4217Code(this.getCurrencyIso4217Code).getMonetizationNetwork));
                            return;
                        } else {
/* 187 */                   map.put("batteryLevel", String.valueOf(aFg1uSDK.getCurrencyIso4217Code(this.getCurrencyIso4217Code).getMonetizationNetwork));
/* 194 */                   throw null;
                        }
                    }
/* 195 */           ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled();
                    throw null;
                }

/* 186 */       private String getCurrencyIso4217Code(SimpleDateFormat simpleDateFormat, int i) {
                    String str;
/* 187 */           int i2 = f3090e + 57;
                    unregisterClient = i2 % 128;
                    if (i2 % 2 == 0) {
/* 188 */               simpleDateFormat.getClass();
/* 189 */               String monetizationNetwork = this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
                        if (monetizationNetwork == null) {
/* 190 */                   int i3 = unregisterClient + 99;
                            f3090e = i3 % 128;
                            if (i3 % 2 != 0 ? i <= 1 : i <= 0) {
/* 191 */                       AFLogger.afDebugLog("AppsFlyer: first launch detected");
/* 192 */                       str = simpleDateFormat.format(new Date());
                            } else {
/* 193 */                       str = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            monetizationNetwork = str;
/* 194 */                   this.component1.getRevenue("appsFlyerFirstInstall", monetizationNetwork);
/* 195 */                   unregisterClient = (f3090e + 77) % 128;
                        }
/* 198 */               AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, AbstractC0886en.m3507k("AppsFlyer: first launch date: ", monetizationNetwork), false, 4, null);
/* 199 */               monetizationNetwork.getClass();
                        return monetizationNetwork;
                    }
/* 200 */           simpleDateFormat.getClass();
/* 201 */           this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
/* 202 */           throw null;
                }

/* 195 */       private boolean areAllFieldsValid() {
/* 196 */           unregisterClient = (f3090e + 45) % 128;
                    boolean z = Boolean.parseBoolean(this.component1.getMonetizationNetwork("sentSuccessfully", (String) null));
                    unregisterClient = (f3090e + 73) % 128;
                    return z;
                }

/* 201 */       private String AFAdRevenueData() throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
/* 202 */           unregisterClient = (f3090e + 31) % 128;
                    String strM1831N_ = AFj1kSDK.m1831N_(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager(), this.getCurrencyIso4217Code.getApplicationContext().getPackageName());
                    unregisterClient = (f3090e + 71) % 128;
                    return strM1831N_;
                }

/* 202 */       private static Object AFAdRevenueData(Object[] objArr) {
                    Object n42Var;
                    AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
                    Map map = (Map) objArr[1];
                    map.getClass();
/* 204 */           String str = aFg1rSDK.toString.getMonetizationNetwork;
                    if (str != null) {
/* 205 */               int i = unregisterClient + 83;
                        f3090e = i % 128;
                        if (i % 2 == 0) {
                            map.get("af_deeplink");
                            throw null;
                        }
/* 206 */               if (map.get("af_deeplink") != null) {
/* 207 */                   AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                        } else {
                            try {
/* 208 */                       m42 m42Var = o42.f14612b;
/* 209 */                       JSONObject jSONObject = new JSONObject(str);
/* 210 */                       jSONObject.put("isPush", "true");
/* 211 */                       map.put("af_deeplink", jSONObject.toString());
/* 212 */                       n42Var = Unit.f12910a;
                            } catch (Throwable th) {
/* 213 */                       m42 m42Var2 = o42.f14612b;
/* 214 */                       n42Var = new n42(th);
                            }
/* 215 */                   Throwable thM7099a = o42.m7099a(n42Var);
                            if (thM7099a != null) {
/* 216 */                       AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", thM7099a, false, false, false, false, 120, null);
/* 217 */                       unregisterClient = (f3090e + 33) % 128;
                            }
                        }
                    }
/* 219 */           aFg1rSDK.toString.getMonetizationNetwork = null;
                    return null;
                }

/* 202 */       private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
                    Map map = (Map) objArr[0];
/* 203 */           f3090e = (unregisterClient + 65) % 128;
/* 204 */           map.getClass();
                    try {
/* 205 */               map.put("lang", Locale.getDefault().getDisplayLanguage());
/* 206 */               unregisterClient = (f3090e + 25) % 128;
                    } catch (Exception e) {
/* 207 */               AFLogger.afErrorLog("Exception while collecting display language name. ", e);
                    }
                    try {
/* 208 */               map.put("lang_code", Locale.getDefault().getLanguage());
                    } catch (Exception e2) {
/* 209 */               AFLogger.afErrorLog("Exception while collecting display language code. ", e2);
                    }
                    try {
/* 210 */               map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
                        return null;
                    } catch (Exception e3) {
/* 211 */               AFLogger.afErrorLog("Exception while collecting country name. ", e3);
                        return null;
                    }
                }

/* 211 */       private static String getCurrencyIso4217Code(String str) {
/* 212 */           f3090e = (unregisterClient + 19) % 128;
                    try {
/* 215 */               Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
/* 216 */               objInvoke.getClass();
                        String str2 = (String) objInvoke;
/* 217 */               unregisterClient = (f3090e + 117) % 128;
                        return str2;
                    } catch (Throwable th) {
/* 218 */               AFLogger.afErrorLog(th.getMessage(), th);
                        return null;
                    }
                }

/* 218 */       private void getCurrencyIso4217Code(Map<String, Object> map, String str) {
/* 219 */           getRevenue(new Object[]{this, map, str}, 274047423, -274047418, System.identityHashCode(this));
                }

/* 219 */       private final String AFAdRevenueData(String str) {
/* 220 */           int i = unregisterClient + 95;
                    f3090e = i % 128;
/* 221 */           if (i % 2 != 0 ? ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false) : ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false)) {
/* 222 */               int i2 = unregisterClient + 43;
                        f3090e = i2 % 128;
                        if (i2 % 2 != 0) {
/* 223 */                   if (str == null || str.length() == 0) {
/* 224 */                       if (!AFKeystoreWrapper()) {
                                    return null;
                                }
/* 225 */                       f3090e = (unregisterClient + 75) % 128;
/* 226 */                       return copy();
                            }
                        } else {
/* 227 */                   throw null;
                        }
                    }
                    if (str == null) {
                        return null;
                    }
                    int i3 = unregisterClient + 23;
                    f3090e = i3 % 128;
                    if (i3 % 2 != 0) {
                        return str;
                    }
                    throw null;
                }

                @Override // com.appsflyer.internal.AFg1nSDK
/* 219 */       public final void getCurrencyIso4217Code(Map<String, Object> map) {
/* 220 */           getRevenue(new Object[]{this, map}, 528204691, -528204690, System.identityHashCode(this));
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
                
                    r4.getRevenue("CACHED_CHANNEL", r5);
                    r4 = com.appsflyer.internal.AFg1rSDK.f3090e + 99;
                    com.appsflyer.internal.AFg1rSDK.unregisterClient = r4 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
                
                    if ((r4 % 2) != 0) goto L14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
                
                    return r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
                
                    if (r0 != null) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
                
                    if (r0 != null) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
                
                    com.appsflyer.internal.AFg1rSDK.f3090e = (com.appsflyer.internal.AFg1rSDK.unregisterClient + 23) % 128;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
/* 227 */       private static String AFAdRevenueData(AFc1qSDK aFc1qSDK, String str) {
                    String monetizationNetwork;
/* 228 */           int i = unregisterClient + 17;
                    f3090e = i % 128;
                    if (i % 2 == 0) {
/* 229 */               monetizationNetwork = aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
/* 230 */               int i2 = 81 / 0;
                    } else {
/* 231 */               monetizationNetwork = aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
                    }
                }

/* 228 */       private final void getMediationNetwork(Map<String, Object> map, int i) {
                    try {
/* 232 */               if (this.component4.m1787n_().versionCode > this.component1.getRevenue("versionCode", 0)) {
/* 233 */                   f3090e = (unregisterClient + 43) % 128;
/* 236 */                   this.component1.getMediationNetwork("versionCode", this.component4.m1787n_().versionCode);
                        }
/* 237 */               map.put("app_version_code", String.valueOf(this.component4.m1787n_().versionCode));
/* 242 */               map.put("app_version_name", this.component4.m1787n_().versionName);
/* 243 */               map.put("targetSDKver", Integer.valueOf(this.component4.getCurrencyIso4217Code.getMonetizationNetwork.getApplicationInfo().targetSdkVersion));
/* 248 */               map.put("date1", getRevenue().format(new Date(((Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this))).longValue())));
/* 249 */               map.put("date2", getRevenue().format(new Date(this.component4.m1787n_().lastUpdateTime)));
                        Object[] objArr = new Object[1];
/* 250 */               m1804a("\u008d\u0085\u0087\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                        String strIntern = ((String) objArr[0]).intern();
                        SimpleDateFormat revenue = getRevenue();
                        revenue.getClass();
                        map.put(strIntern, getCurrencyIso4217Code(revenue, i));
/* 251 */               int i2 = f3090e + 51;
                        unregisterClient = i2 % 128;
                        if (i2 % 2 != 0) {
                            throw null;
                        }
                    } catch (Throwable th) {
/* 252 */               AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
                    }
                }

                @Override // com.appsflyer.internal.AFg1nSDK
/* 234 */       public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
/* 235 */           getRevenue(new Object[]{this, aFh1mSDK}, 572486758, -572486747, System.identityHashCode(this));
                }

/* 248 */       private void getMonetizationNetwork(Map<String, Object> map, boolean z) {
/* 249 */           unregisterClient = (f3090e + 89) % 128;
/* 250 */           map.getClass();
/* 251 */           map.put("platformextension", this.AFAdRevenueData);
                    if (z) {
/* 252 */               map.put("platform_extension_v2", this.getMediationNetwork.getCurrencyIso4217Code());
/* 253 */               unregisterClient = (f3090e + 89) % 128;
                    }
                }

/* 252 */       private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
                    AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
                    Map map = (Map) objArr[1];
                    map.getClass();
/* 253 */           AFh1xSDK aFh1xSDK = aFg1rSDK.areAllFieldsValid;
/* 254 */           HashMap map2 = new HashMap(aFh1xSDK.getRevenue);
/* 255 */           aFh1xSDK.getRevenue.clear();
/* 256 */           aFh1xSDK.getMonetizationNetwork.AFAdRevenueData("gcd");
/* 257 */           if (map2.isEmpty()) {
                        return null;
                    }
/* 258 */           int i = (unregisterClient + 21) % 128;
                    f3090e = i;
                    int i2 = i + 47;
                    unregisterClient = i2 % 128;
                    if (i2 % 2 != 0) {
/* 259 */               Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork((Map<String, Object>) map);
/* 260 */               mediationNetwork.getClass();
                        mediationNetwork.put("gcd", map2);
/* 261 */               int i3 = 34 / 0;
                        return null;
                    }
/* 262 */           Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork((Map<String, Object>) map);
/* 263 */           mediationNetwork2.getClass();
                    mediationNetwork2.put("gcd", map2);
                    return null;
                }

                @Override // com.appsflyer.internal.AFg1nSDK
/* 253 */       public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
/* 254 */           int i = unregisterClient + 125;
                    f3090e = i % 128;
                    if (i % 2 != 0) {
/* 255 */               aFh1mSDK.getClass();
/* 256 */               Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
/* 257 */               map.getClass();
/* 259 */               map.put("open_referrer", aFh1mSDK.getMonetizationNetwork);
/* 260 */               String str = aFh1mSDK.copydefault;
/* 261 */               if (str != null && !StringsKt.m6228D(str)) {
/* 264 */                   map.put("af_web_referrer", aFh1mSDK.copydefault);
                        }
/* 265 */               f3090e = (unregisterClient + 7) % 128;
                        return;
                    }
/* 266 */           aFh1mSDK.getClass();
/* 267 */           Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
/* 268 */           map2.getClass();
/* 270 */           map2.put("open_referrer", aFh1mSDK.getMonetizationNetwork);
/* 271 */           throw null;
                }

/* 263 */       private void getMediationNetwork(Map<String, Object> map, String str) {
/* 264 */           int i = unregisterClient + 7;
                    f3090e = i % 128;
                    try {
                        if (i % 2 != 0) {
/* 265 */                   map.getClass();
                            str.getClass();
/* 266 */                   String monetizationNetwork = this.component1.getMonetizationNetwork("prev_event_name", (String) null);
                            if (monetizationNetwork != null) {
/* 268 */                       JSONObject jSONObject = new JSONObject();
/* 267 */                       jSONObject.put("prev_event_timestamp", this.component1.getMonetizationNetwork("prev_event_timestamp", -1L));
/* 270 */                       jSONObject.put("prev_event_name", monetizationNetwork);
/* 271 */                       map.put("prev_event", jSONObject);
/* 272 */                       unregisterClient = (f3090e + 107) % 128;
                            }
/* 273 */                   this.component1.getRevenue("prev_event_name", str);
/* 267 */                   this.component1.AFAdRevenueData("prev_event_timestamp", System.currentTimeMillis());
                            return;
                        }
/* 275 */               map.getClass();
                        str.getClass();
/* 276 */               this.component1.getMonetizationNetwork("prev_event_name", (String) null);
/* 277 */               throw null;
                    } catch (Exception e) {
/* 279 */               AFLogger.afErrorLog("Error while processing previous event.", e);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:16:0x006b  */
/* 271 */       private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
                    AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
                    Map map = (Map) objArr[1];
                    String str = (String) objArr[2];
                    map.getClass();
/* 272 */           if (((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
/* 273 */               int i = unregisterClient + 33;
                        f3090e = i % 128;
                        if (i % 2 != 0) {
/* 274 */                   map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                            return null;
                        }
                        map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                        throw null;
                    }
/* 275 */           String monetizationNetwork = aFg1rSDK.hashCode.getMonetizationNetwork(aFg1rSDK.component1);
                    if (monetizationNetwork != null) {
/* 276 */               f3090e = (unregisterClient + 79) % 128;
/* 277 */               if (monetizationNetwork.length() != 0) {
/* 278 */                   f3090e = (unregisterClient + 71) % 128;
/* 279 */                   map.put("imei", monetizationNetwork);
                        } else {
/* 280 */                   f3090e = (unregisterClient + 33) % 128;
                        }
                    } else {
/* 280 */               f3090e = (unregisterClient + 33) % 128;
                    }
/* 281 */           String strAFAdRevenueData = aFg1rSDK.AFAdRevenueData(str);
                    if (strAFAdRevenueData != null) {
/* 282 */               aFg1rSDK.component1.getRevenue("androidIdCached", strAFAdRevenueData);
/* 283 */               map.put("android_id", strAFAdRevenueData);
                    } else {
/* 284 */               AFLogger.afInfoLog("Android ID was not collected.");
                    }
/* 285 */           AFb1jSDK mediationNetwork = AFb1lSDK.getMediationNetwork(aFg1rSDK.getCurrencyIso4217Code);
                    if (mediationNetwork != null) {
/* 286 */               LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 287 */               Boolean bool = mediationNetwork.getMonetizationNetwork;
/* 288 */               bool.getClass();
                        linkedHashMap.put("isManual", bool);
/* 289 */               String str2 = mediationNetwork.getRevenue;
/* 290 */               str2.getClass();
                        linkedHashMap.put("val", str2);
/* 291 */               Boolean bool2 = mediationNetwork.getCurrencyIso4217Code;
                        if (bool2 != null) {
/* 292 */                   linkedHashMap.put("isLat", bool2);
                        }
/* 293 */               map.put("oaid", linkedHashMap);
                    }
                    return null;
                }

                @Override // com.appsflyer.internal.AFg1nSDK
/* 279 */       public final void getMediationNetwork(Map<String, Object> map, AFe1pSDK aFe1pSDK) {
/* 280 */           f3090e = (unregisterClient + 113) % 128;
/* 281 */           map.getClass();
                    aFe1pSDK.getClass();
/* 282 */           if (!copydefault().contains(aFe1pSDK)) {
/* 283 */               f3090e = (unregisterClient + 39) % 128;
                        return;
                    }
/* 284 */           if (this.toString.getMediationNetwork()) {
/* 287 */               map.put("app_set_id", nc1.m6963d(new Pair("app_set_id_disabled", Boolean.TRUE)));
/* 289 */               if (this.toString.copydefault != null) {
/* 290 */                   f3090e = (unregisterClient + 85) % 128;
/* 293 */                   AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
/* 294 */                   f3090e = (unregisterClient + 1) % 128;
                            return;
                        } else {
/* 297 */                   AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
/* 298 */                   int i = unregisterClient + 41;
                            f3090e = i % 128;
                            if (i % 2 == 0) {
                                throw null;
                            }
                            return;
                        }
                    }
/* 300 */           AFb1gSDK aFb1gSDK = this.toString.copydefault;
                    if (aFb1gSDK != null) {
/* 307 */               map.put("app_set_id", oc1.m7131e(new Pair("scope", Integer.valueOf(aFb1gSDK.getMonetizationNetwork)), new Pair("id", aFb1gSDK.getMediationNetwork)));
                    }
                }

                @Override // com.appsflyer.internal.AFg1nSDK
/* 290 */       public final void getRevenue(Map<String, Object> map) {
/* 291 */           map.getClass();
/* 293 */           AFi1qSDK aFi1qSDK = this.component3.getMonetizationNetwork;
                    AFi1rSDK monetizationNetwork = aFi1qSDK != null ? aFi1qSDK.getMonetizationNetwork() : null;
                    if (monetizationNetwork != null) {
/* 296 */               map.put("network", monetizationNetwork.getCurrencyIso4217Code);
/* 297 */               map.put("ivc", Boolean.valueOf(monetizationNetwork.getMediationNetwork()));
/* 298 */               if (!((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
/* 299 */                   int i = f3090e;
                            unregisterClient = (i + 69) % 128;
/* 300 */                   String str = monetizationNetwork.getMonetizationNetwork;
                            if (str != null) {
/* 301 */                       map.put("operator", str);
                            } else {
/* 302 */                       unregisterClient = (i + 99) % 128;
                            }
/* 303 */                   String str2 = monetizationNetwork.getRevenue;
                            if (str2 != null) {
/* 304 */                       map.put("carrier", str2);
                                return;
                            }
                            return;
                        }
/* 305 */               f3090e = (unregisterClient + 41) % 128;
                    }
                }

/* 293 */       private static void getMonetizationNetwork(Map<String, Object> map, String str) {
/* 294 */           unregisterClient = (f3090e + 77) % 128;
/* 295 */           map.getClass();
                    if (str != null) {
/* 296 */               f3090e = (unregisterClient + 81) % 128;
/* 297 */               map.put("phone", str);
                    }
                }

/* 297 */       private static void getMonetizationNetwork(Map<String, Object> map, AFh1mSDK aFh1mSDK) {
                    map.getClass();
                    aFh1mSDK.getClass();
/* 298 */           String str = aFh1mSDK.areAllFieldsValid;
                    if (str != null) {
/* 299 */               map.put("eventName", str);
                        Map map2 = aFh1mSDK.getRevenue;
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
/* 301 */               map.put("eventValue", new JSONObject(map2).toString());
                    }
                }

                @Override // com.appsflyer.internal.AFg1nSDK
/* 301 */       public final Long getMonetizationNetwork() {
/* 302 */           return (Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this));
                }

/* 305 */       private final SimpleDateFormat getRevenue() {
/* 306 */           f3090e = (unregisterClient + 23) % 128;
                    SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFKeystoreWrapper.getValue();
                    f3090e = (unregisterClient + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE) % 128;
                    return simpleDateFormat;
                }

                @Override // com.appsflyer.internal.AFg1nSDK
/* 306 */       public final void getRevenue(AFh1mSDK aFh1mSDK) {
/* 307 */           int i = unregisterClient + 113;
                    f3090e = i % 128;
                    if (i % 2 != 0) {
/* 308 */               aFh1mSDK.getClass();
/* 309 */               Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
/* 310 */               if (aFh1mSDK.getRevenue()) {
/* 311 */                   String str = aFh1mSDK.component1;
/* 312 */                   AFc1eSDK aFc1eSDK = this.toString;
/* 315 */                   AFAdRevenueData(aFh1mSDK, str, aFc1eSDK.getMediationNetwork, aFc1eSDK.AFAdRevenueData);
/* 316 */                   f3090e = (unregisterClient + 53) % 128;
                        } else if (!(aFh1mSDK instanceof AFh1fSDK)) {
/* 318 */                   int i2 = f3090e + 93;
                            unregisterClient = i2 % 128;
                            if (i2 % 2 != 0) {
/* 319 */                       map.getClass();
/* 320 */                       String str2 = aFh1mSDK.areAllFieldsValid;
/* 321 */                       str2.getClass();
                                getMediationNetwork(map, str2);
/* 322 */                       int i3 = 79 / 0;
                            } else {
/* 323 */                       map.getClass();
/* 324 */                       String str3 = aFh1mSDK.areAllFieldsValid;
/* 325 */                       str3.getClass();
                                getMediationNetwork(map, str3);
                            }
                        }
/* 326 */               if (C2085pw.m7566e(AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP).contains(aFh1mSDK.AFAdRevenueData())) {
                            int i4 = f3090e + 33;
                            unregisterClient = i4 % 128;
                            if (i4 % 2 != 0) {
/* 327 */                       map.getClass();
                                equals(map);
/* 328 */                       int i5 = 79 / 0;
                            } else {
/* 329 */                       map.getClass();
                                equals(map);
                            }
                        }
/* 330 */               map.getClass();
                        m1808w(map);
/* 331 */               getRevenue(new Object[]{map}, -1520031212, 1520031215, (int) System.currentTimeMillis());
/* 332 */               AFInAppEventParameterName(map);
/* 333 */               AFKeystoreWrapper(map);
/* 334 */               AFAdRevenueData(map);
/* 335 */               getMonetizationNetwork(map, aFh1mSDK.getRevenue());
/* 336 */               m1806e(map);
/* 337 */               m1805d(map);
/* 338 */               getMonetizationNetwork(map, aFh1mSDK);
/* 339 */               map.put("af_events_api", "1");
                        return;
                    }
/* 340 */           aFh1mSDK.getClass();
/* 341 */           Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
/* 342 */           aFh1mSDK.getRevenue();
                    throw null;
                }

/* 307 */       private final String getMediationNetwork(String str) {
/* 308 */           unregisterClient = (f3090e + 73) % 128;
                    String currencyIso4217Code = this.component4.getCurrencyIso4217Code(str);
                    f3090e = (unregisterClient + 57) % 128;
                    return currencyIso4217Code;
                }

/* 308 */       private static boolean getMediationNetwork(File file) {
/* 309 */           int i = (unregisterClient + 55) % 128;
                    f3090e = i;
                    if (file == null) {
                        return true;
                    }
                    int i2 = i + 43;
                    unregisterClient = i2 % 128;
                    if (i2 % 2 == 0) {
                        return !file.exists();
                    }
                    file.exists();
                    throw null;
                }

/* 309 */       private static String getMediationNetwork(File file, String str) {
                    InputStreamReader inputStreamReader;
                    try {
                        try {
                            if (file != null) {
                                try {
/* 311 */                           Properties properties = new Properties();
/* 312 */                           inputStreamReader = new InputStreamReader(AbstractC1417a.m5164b(file, new FileInputStream(file)), Charset.defaultCharset());
                                    try {
/* 313 */                               properties.load(inputStreamReader);
/* 314 */                               AFLogger.afInfoLog("Found PreInstall property!");
/* 315 */                               String property = properties.getProperty(str);
                                        try {
/* 316 */                                   inputStreamReader.close();
                                        } catch (Throwable th) {
/* 317 */                                   AFLogger.afErrorLog(th.getMessage(), th);
                                        }
/* 318 */                               unregisterClient = (f3090e + 73) % 128;
                                        return property;
                                    } catch (FileNotFoundException unused) {
                                        AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                                        if (inputStreamReader != null) {
/* 323 */                                   inputStreamReader.close();
/* 324 */                                   unregisterClient = (f3090e + 93) % 128;
                                        }
                                        return null;
                                    } catch (Throwable th2) {
                                        th = th2;
/* 319 */                               AFLogger.afErrorLog(th.getMessage(), th);
                                        if (inputStreamReader != null) {
/* 320 */                                   inputStreamReader.close();
                                        }
                                        return null;
                                    }
                                } catch (FileNotFoundException unused2) {
                                    inputStreamReader = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    inputStreamReader = null;
                                }
                            }
                        } catch (Throwable th4) {
/* 321 */                   AFLogger.afErrorLog(th4.getMessage(), th4);
                        }
                        return null;
                    } catch (Throwable th5) {
                        if (inputStreamReader != null) {
                            try {
/* 325 */                       inputStreamReader.close();
                            } catch (Throwable th6) {
/* 326 */                       AFLogger.afErrorLog(th6.getMessage(), th6);
                            }
                        }
                        throw th5;
                    }
                }

/* 326 */       private final void getMediationNetwork(Map<String, Object> map) {
/* 327 */           getRevenue(new Object[]{this, map}, -539509618, 539509626, System.identityHashCode(this));
                }

/* 327 */       private final AppsFlyerProperties getMediationNetwork() {
/* 328 */           return (AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this));
                }

/* 342 */       private void getRevenue(Map<String, Object> map, String str) {
/* 343 */           int i = unregisterClient + 75;
                    f3090e = i % 128;
                    if (i % 2 != 0) {
/* 344 */               map.getClass();
                        if (str != null) {
/* 346 */                   unregisterClient = (f3090e + 33) % 128;
/* 347 */                   if (str.length() != 0) {
/* 348 */                       int i2 = f3090e + 61;
                                unregisterClient = i2 % 128;
                                if (i2 % 2 == 0) {
/* 349 */                           map.put("referrer", str);
/* 350 */                           unregisterClient = (f3090e + 41) % 128;
                                } else {
/* 351 */                           map.put("referrer", str);
/* 352 */                           throw null;
                                }
                            }
                        }
                        Object monetizationNetwork = this.component1.getMonetizationNetwork("extraReferrers", (String) null);
                        if (monetizationNetwork != null) {
/* 353 */                   map.put("extraReferrers", monetizationNetwork);
                        }
/* 354 */               String referrer = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getReferrer(this.component1);
                        if (referrer != null) {
/* 355 */                   unregisterClient = (f3090e + 65) % 128;
/* 356 */                   if (referrer.length() != 0) {
/* 345 */                       if (map.get("referrer") == null) {
/* 357 */                           map.put("referrer", referrer);
                                    return;
                                }
                                return;
                            }
                        }
/* 358 */               unregisterClient = (f3090e + 97) % 128;
                        return;
                    }
/* 359 */           map.getClass();
/* 360 */           throw null;
                }

/* 360 */       private static /* synthetic */ Object getRevenue(Object[] objArr) {
                    Map map = (Map) objArr[0];
/* 361 */           f3090e = (unregisterClient + 45) % 128;
/* 362 */           map.getClass();
/* 363 */           String monetizationNetwork = AFa1vSDK.getMonetizationNetwork();
/* 364 */           String currencyIso4217Code = AFa1vSDK.getCurrencyIso4217Code();
                    if (monetizationNetwork != null) {
/* 365 */               int i = f3090e + 93;
                        unregisterClient = i % 128;
                        if (i % 2 == 0) {
/* 366 */                   if (currencyIso4217Code != null && Integer.parseInt(currencyIso4217Code) > 0) {
/* 367 */                       unregisterClient = (f3090e + 1) % 128;
/* 368 */                       map.put("reinstallCounter", currencyIso4217Code);
/* 369 */                       map.put("originalAppsflyerId", monetizationNetwork);
                            }
                        } else {
/* 370 */                   throw null;
                        }
                    }
                    int i2 = f3090e + 13;
                    unregisterClient = i2 % 128;
                    if (i2 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }

/* 370 */       private static File getRevenue(String str) {
/* 371 */           int i = (unregisterClient + 9) % 128;
                    f3090e = i;
                    if (str != null) {
                        int i2 = i + 71;
/* 372 */               unregisterClient = i2 % 128;
                        try {
                            if (i2 % 2 == 0) {
/* 373 */                       if (StringsKt.m6239O(str).toString().length() > 0) {
/* 374 */                           return new File(StringsKt.m6239O(str).toString());
                                }
                            } else {
/* 376 */                       StringsKt.m6239O(str).toString().length();
                                throw null;
                            }
                        } catch (Throwable th) {
/* 377 */                   AFLogger.afErrorLog(th.getMessage(), th);
                        }
                    }
/* 378 */           int i3 = unregisterClient + 41;
                    f3090e = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 94 / 0;
                    }
                    return null;
                }
            }
