            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.os.Build;
            import android.os.Process;
            import android.view.ViewConfiguration;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerProperties;
            import com.appsflyer.internal.components.network.http.ResponseNetwork;
            import java.text.SimpleDateFormat;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 42 */    public final class AFf1oSDK extends AFf1sSDK {
                private static int $10 = 0;
                private static int $11 = 1;
                private static int AFLogger = 1;
                private static int registerClient;
                private final AFc1hSDK copy;
                private final String copydefault;
                private final AFg1nSDK equals;
                private final AFc1oSDK hashCode;
                private static char[] AFKeystoreWrapper = {52730, 63488, 52732, 63493, 63494, 52733, 63510, 52735, 63498};
                private static char AFInAppEventType = 52733;

                public AFf1oSDK(String str, AFd1zSDK aFd1zSDK) {
/* 6 */             super(new AFg1tSDK(), aFd1zSDK, str);
/* 13 */            this.hashCode = aFd1zSDK.AFAdRevenueData();
/* 19 */            this.copy = aFd1zSDK.AFInAppEventParameterName();
/* 21 */            this.copydefault = str;
/* 27 */            this.equals = aFd1zSDK.component3();
                }

                /* JADX INFO: renamed from: a */
                private static void m1800a(byte b, String str, int i, Object[] objArr) {
                    int i2;
                    Object charArray = str;
/* 1 */             if (str != null) {
/* 3 */                 charArray = str.toCharArray();
                    }
/* 7 */             char[] cArr = (char[]) charArray;
/* 11 */            AFk1pSDK aFk1pSDK = new AFk1pSDK();
/* 14 */            char[] cArr2 = AFKeystoreWrapper;
/* 22 */            if (cArr2 != null) {
/* 24 */                int length = cArr2.length;
/* 25 */                char[] cArr3 = new char[length];
/* 28 */                for (int i3 = 0; i3 < length; i3++) {
/* 36 */                    cArr3[i3] = (char) (((long) cArr2[i3]) ^ (-9203380046050046466L));
                        }
/* 41 */                cArr2 = cArr3;
                    }
/* 47 */            char c = (char) ((-9203380046050046466L) ^ ((long) AFInAppEventType));
/* 48 */            char[] cArr4 = new char[i];
/* 52 */            if (i % 2 != 0) {
/* 54 */                i2 = i - 1;
/* 60 */                cArr4[i2] = (char) (cArr[i2] - b);
                    } else {
/* 63 */                i2 = i;
                    }
/* 65 */            if (i2 > 1) {
/* 69 */                int i4 = $10 + 65;
/* 73 */                $11 = i4 % 128;
/* 75 */                int i5 = i4 % 2;
/* 77 */                aFk1pSDK.getMonetizationNetwork = 0;
                        while (true) {
/* 79 */                    int i6 = aFk1pSDK.getMonetizationNetwork;
/* 81 */                    if (i6 >= i2) {
                                break;
                            }
/* 83 */                    char c2 = cArr[i6];
/* 85 */                    aFk1pSDK.getRevenue = c2;
/* 89 */                    char c3 = cArr[i6 + 1];
/* 91 */                    aFk1pSDK.getCurrencyIso4217Code = c3;
/* 93 */                    if (c2 == c3) {
/* 97 */                        int i7 = $11 + 115;
/* 101 */                       $10 = i7 % 128;
/* 105 */                       if (i7 % 2 != 0) {
/* 109 */                           cArr4[i6] = (char) (c2 >>> b);
/* 115 */                           cArr4[i6 >> 1] = (char) (c3 << b);
                                } else {
/* 120 */                           cArr4[i6] = (char) (c2 - b);
/* 126 */                           cArr4[i6 + 1] = (char) (c3 - b);
                                }
                            } else {
/* 129 */                       int i8 = c2 / c;
/* 131 */                       aFk1pSDK.getMediationNetwork = i8;
/* 133 */                       int i9 = c2 % c;
/* 134 */                       aFk1pSDK.component2 = i9;
/* 136 */                       int i10 = c3 / c;
/* 138 */                       aFk1pSDK.AFAdRevenueData = i10;
/* 140 */                       int i11 = c3 % c;
/* 141 */                       aFk1pSDK.component3 = i11;
/* 143 */                       if (i9 == i11) {
/* 147 */                           int i12 = ((i8 + c) - 1) % c;
/* 148 */                           aFk1pSDK.getMediationNetwork = i12;
/* 152 */                           int i13 = ((i10 + c) - 1) % c;
/* 153 */                           aFk1pSDK.AFAdRevenueData = i13;
/* 161 */                           cArr4[i6] = cArr2[(i12 * c) + i9];
/* 167 */                           cArr4[i6 + 1] = cArr2[(i13 * c) + i11];
                                } else if (i8 == i10) {
/* 174 */                           int i14 = ((i9 + c) - 1) % c;
/* 175 */                           aFk1pSDK.component2 = i14;
/* 179 */                           int i15 = ((i11 + c) - 1) % c;
/* 180 */                           aFk1pSDK.component3 = i15;
/* 188 */                           cArr4[i6] = cArr2[(i8 * c) + i14];
/* 194 */                           cArr4[i6 + 1] = cArr2[(i10 * c) + i15];
                                } else {
/* 203 */                           cArr4[i6] = cArr2[(i8 * c) + i11];
/* 209 */                           cArr4[i6 + 1] = cArr2[(i10 * c) + i9];
                                }
                            }
/* 213 */                   aFk1pSDK.getMonetizationNetwork = i6 + 2;
                        }
                    }
/* 223 */           $10 = ($11 + 5) % 128;
/* 226 */           for (int i16 = 0; i16 < i; i16++) {
/* 233 */               cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                    }
/* 243 */           objArr[0] = new String(cArr4);
                }

                private void equals() {
/* 3 */             int i = AFLogger + 33;
/* 7 */             registerClient = i % 128;
/* 9 */             int i2 = i % 2;
/* 18 */            ((AFf1sSDK) this).component2.AFAdRevenueData("sentRegisterRequestToAF", true);
/* 21 */            AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
                }

                public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
/* 6 */             int i4 = ~i2;
/* 12 */            int i5 = ~i;
/* 15 */            int i6 = ~i3;
                    return (((~(i | i2)) | ((~(i6 | i2)) | (~(i4 | i5)))) * 494) + ((((i2 | i5) | i6) * 494) + (((i | i4) * (-988)) + ((i2 * (-493)) + (i * 495)))) != 1 ? getMonetizationNetwork(objArr) : getMediationNetwork(objArr);
                }

                private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
/* 4 */             AFf1oSDK aFf1oSDK = (AFf1oSDK) objArr[0];
/* 8 */             int i = registerClient + 109;
/* 12 */            AFLogger = i % 128;
/* 17 */            if (i % 2 == 0) {
/* 61 */                super.getCurrencyIso4217Code();
/* 64 */                throw null;
                    }
/* 19 */            super.getCurrencyIso4217Code();
/* 22 */            ResponseNetwork responseNetwork = ((AFe1fSDK) aFf1oSDK).areAllFieldsValid;
/* 24 */            if (responseNetwork != null) {
/* 28 */                int i2 = registerClient + 3;
/* 32 */                AFLogger = i2 % 128;
/* 36 */                if (i2 % 2 == 0) {
/* 56 */                    responseNetwork.isSuccessful();
/* 59 */                    throw null;
                        }
/* 42 */                if (responseNetwork.isSuccessful()) {
/* 44 */                    aFf1oSDK.equals();
/* 53 */                    registerClient = (AFLogger + 17) % 128;
                        }
                    }
/* 16 */            return null;
                }

                private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
/* 4 */             AFf1oSDK aFf1oSDK = (AFf1oSDK) objArr[0];
/* 9 */             AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
/* 11 */            super.AFAdRevenueData(aFh1mSDK);
/* 16 */            Context context = aFf1oSDK.copy.getMonetizationNetwork;
/* 18 */            AFa1ySDK revenue = AFa1ySDK.getRevenue();
/* 23 */            if (context == null) {
/* 368 */               f42.m3656l("Context is not provided, can't send register request");
/* 22 */                return null;
                    }
/* 29 */            if (revenue.getCurrencyIso4217Code()) {
/* 357 */               AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
/* 362 */               f42.m3656l("CustomerUserId not set, register is not sent");
/* 22 */                return null;
                    }
                    try {
/* 45 */                aFh1mSDK.getMonetizationNetwork("app_version_code", Integer.toString(aFf1oSDK.hashCode.m1787n_().versionCode));
/* 58 */                aFh1mSDK.getMonetizationNetwork("app_version_name", aFf1oSDK.hashCode.m1787n_().versionName);
/* 71 */                aFh1mSDK.getMonetizationNetwork("app_name", aFf1oSDK.m1801s_(context.getPackageManager()));
/* 97 */                aFh1mSDK.getMonetizationNetwork("installDate", AFa1ySDK.getMonetizationNetwork(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), aFf1oSDK.hashCode.m1787n_().firstInstallTime));
                    } catch (Throwable th) {
/* 104 */               AFLogger.afErrorLog("Exception while collecting application version info.", th);
                    }
/* 111 */           aFf1oSDK.equals.getRevenue(aFh1mSDK.AFAdRevenueData);
/* 118 */           aFh1mSDK.AFAdRevenueData.remove("ivc");
/* 121 */           String mediationNetwork = AFa1ySDK.getMediationNetwork();
/* 125 */           if (mediationNetwork != null) {
/* 129 */               int i = AFLogger + 47;
/* 133 */               registerClient = i % 128;
/* 139 */               if (i % 2 != 0) {
/* 141 */                   aFh1mSDK.getMonetizationNetwork("appUserId", mediationNetwork);
/* 146 */                   int i2 = 83 / 0;
                        } else {
/* 148 */                   aFh1mSDK.getMonetizationNetwork("appUserId", mediationNetwork);
                        }
                    }
                    try {
/* 155 */               aFh1mSDK.getMonetizationNetwork("model", Build.MODEL);
/* 177 */               Object[] objArr2 = new Object[1];
/* 179 */               m1800a((byte) (3 - (ViewConfiguration.getTouchSlop() >> 8)), "\u0003\u0007\u0005\u0006㘁", 5 - (Process.myPid() >> 22), objArr2);
/* 192 */               aFh1mSDK.getMonetizationNetwork(((String) objArr2[0]).intern(), Build.BRAND);
                    } catch (Throwable th2) {
/* 199 */               AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
                    }
/* 212 */           if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
/* 216 */               int i3 = AFLogger + 89;
/* 220 */               registerClient = i3 % 128;
/* 226 */               if (i3 % 2 != 0) {
/* 228 */                   aFh1mSDK.getMonetizationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
/* 233 */                   int i4 = 47 / 0;
                        } else {
/* 235 */                   aFh1mSDK.getMonetizationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                        }
                    }
/* 242 */           AFb1jSDK aFb1jSDKM1774l_ = AFb1lSDK.m1774l_(context.getContentResolver());
/* 246 */           if (aFb1jSDKM1774l_ != null) {
/* 254 */               registerClient = (AFLogger + 35) % 128;
/* 260 */               aFh1mSDK.getMonetizationNetwork("amazon_aid", aFb1jSDKM1774l_.getRevenue);
/* 271 */               aFh1mSDK.getMonetizationNetwork("amazon_aid_limit", String.valueOf(aFb1jSDKM1774l_.getCurrencyIso4217Code));
                    }
/* 282 */           aFh1mSDK.getMonetizationNetwork("devkey", ((AFe1fSDK) aFf1oSDK).component1.getMediationNetwork());
/* 295 */           aFh1mSDK.getMonetizationNetwork("uid", AFb1kSDK.getCurrencyIso4217Code(aFf1oSDK.hashCode.getMediationNetwork));
/* 302 */           aFh1mSDK.getMonetizationNetwork("af_gcm_token", aFf1oSDK.copydefault);
/* 319 */           aFh1mSDK.getMonetizationNetwork("launch_counter", Integer.toString(((AFf1sSDK) aFf1oSDK).component2.getRevenue("appsFlyerCount", 0)));
/* 330 */           aFh1mSDK.getMonetizationNetwork("sdk", Integer.toString(Build.VERSION.SDK_INT));
/* 335 */           String strComponent3 = aFf1oSDK.hashCode.component3();
/* 339 */           if (strComponent3 != null) {
/* 343 */               aFh1mSDK.getMonetizationNetwork(AppsFlyerProperties.CHANNEL, strComponent3);
/* 352 */               AFLogger = (registerClient + 61) % 128;
                    }
/* 22 */            return null;
                }

                /* JADX INFO: renamed from: s_ */
                private String m1801s_(PackageManager packageManager) {
/* 7 */             ApplicationInfo applicationInfo = this.hashCode.m1787n_().applicationInfo;
/* 10 */            if (applicationInfo != null) {
/* 38 */                String string = packageManager.getApplicationLabel(applicationInfo).toString();
/* 44 */                int i = AFLogger + 95;
/* 48 */                registerClient = i % 128;
/* 52 */                if (i % 2 == 0) {
/* 54 */                    return string;
                        }
/* 55 */                throw null;
                    }
/* 12 */            int i2 = AFLogger;
/* 14 */            int i3 = i2 + 119;
/* 18 */            registerClient = i3 % 128;
/* 22 */            if (i3 % 2 != 0) {
/* 33 */                throw null;
                    }
/* 28 */            registerClient = (i2 + 71) % 128;
/* 30 */            return HttpUrl.FRAGMENT_ENCODE_SET;
                }

                @Override // com.appsflyer.internal.AFf1sSDK
                public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
/* 15 */            getCurrencyIso4217Code(new Object[]{this, aFh1mSDK}, 908933800, -908933800, System.identityHashCode(this));
                }

                @Override // com.appsflyer.internal.AFf1sSDK
                public final void component1(AFh1mSDK aFh1mSDK) {
                    String strAreAllFieldsValid;
/* 3 */             int i = AFLogger + 13;
/* 7 */             registerClient = i % 128;
/* 9 */             int i2 = i % 2;
/* 11 */            AFc1oSDK aFc1oSDK = this.hashCode;
/* 13 */            if (i2 != 0) {
/* 15 */                strAreAllFieldsValid = aFc1oSDK.areAllFieldsValid();
/* 21 */                int i3 = 83 / 0;
/* 23 */                if (strAreAllFieldsValid == null) {
/* 26 */                    return;
                        }
                    } else {
/* 27 */                strAreAllFieldsValid = aFc1oSDK.areAllFieldsValid();
/* 31 */                if (strAreAllFieldsValid == null) {
/* 54 */                    return;
                        }
                    }
/* 39 */            registerClient = (AFLogger + 19) % 128;
/* 43 */            aFh1mSDK.getMonetizationNetwork("advertiserId", strAreAllFieldsValid);
/* 52 */            AFLogger = (registerClient + 39) % 128;
                }

                @Override // com.appsflyer.internal.AFf1sSDK, com.appsflyer.internal.AFe1fSDK
                public final boolean copydefault() {
/* 3 */             int i = registerClient + 87;
/* 5 */             int i2 = i % 128;
/* 7 */             AFLogger = i2;
/* 15 */            boolean z = i % 2 == 0;
/* 20 */            registerClient = (i2 + 117) % 128;
/* 22 */            return z;
                }

                @Override // com.appsflyer.internal.AFf1sSDK
                public final void getRevenue(AFh1mSDK aFh1mSDK) {
/* 3 */             int i = AFLogger + 51;
/* 7 */             registerClient = i % 128;
/* 11 */            if (i % 2 != 0) {
/* 15 */                throw null;
                    }
                }

                @Override // com.appsflyer.internal.AFf1sSDK
/* 43 */        public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
/* 44 */            registerClient = (AFLogger + 67) % 128;
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
/* 44 */        public final void getCurrencyIso4217Code() {
/* 45 */            getCurrencyIso4217Code(new Object[]{this}, 838739924, -838739923, System.identityHashCode(this));
                }

                @Override // com.appsflyer.internal.AFf1sSDK
/* 64 */        public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
/* 65 */            registerClient = (AFLogger + 21) % 128;
                }

                @Override // com.appsflyer.internal.AFf1sSDK
/* 371 */       public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
/* 372 */           AFLogger = (registerClient + 1) % 128;
                }
            }
