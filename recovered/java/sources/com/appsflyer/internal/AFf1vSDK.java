            package com.appsflyer.internal;

            import android.media.AudioTrack;
            import android.net.Uri;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.ViewConfiguration;
            import com.appsflyer.AFLogger;
            import com.appsflyer.attribution.AppsFlyerRequestListener;
            import com.appsflyer.internal.components.network.http.ResponseNetwork;
            import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.UUID;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class AFf1vSDK extends AFe1fSDK<Map<String, String>> {
                private final UUID AFInAppEventType;
                public AFa1tSDK component2;
                private String copy;
                private String copydefault;
                private final AFd1nSDK equals;
                private String hashCode;
                private final boolean toString;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface AFa1tSDK {
                    void AFAdRevenueData(String str);

                    void getCurrencyIso4217Code(Map<String, String> map);
                }

                public AFf1vSDK(AFd1zSDK aFd1zSDK, UUID uuid, Uri uri) throws Throwable {
/* 45 */            super(AFe1pSDK.ONELINK, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, aFd1zSDK, uuid.toString());
/* 52 */            this.equals = aFd1zSDK.getRevenue();
/* 56 */            this.AFInAppEventType = uuid;
/* 58 */            boolean zBooleanValue = false;
                    try {
/* 67 */                if (!AFk1wSDK.getMonetizationNetwork(uri.getHost()) && !AFk1wSDK.getMonetizationNetwork(uri.getPath())) {
                            try {
/* 84 */                        Object[] objArr = {uri, aFd1zSDK.mo1781i()};
/* 91 */                        Map map = AFa1hSDK.f3072d;
/* 93 */                        Object declaredConstructor = map.get(862139947);
/* 102 */                       if (declaredConstructor == null) {
/* 141 */                           declaredConstructor = ((Class) AFa1hSDK.getRevenue(TextUtils.getCapsMode(HttpUrl.FRAGMENT_ENCODE_SET, 0, 0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 62049), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36)).getDeclaredConstructor(Uri.class, AFa1mSDK.class);
/* 145 */                           map.put(862139947, declaredConstructor);
                                }
/* 150 */                       Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
                                try {
/* 154 */                           Object method = map.get(-180621578);
/* 159 */                           if (method == null) {
/* 190 */                               method = ((Class) AFa1hSDK.getRevenue(ViewConfiguration.getJumpTapTimeout() >> 16, (char) (KeyEvent.getDeadChar(0, 0) + 62049), (ViewConfiguration.getTouchSlop() >> 8) + 37)).getMethod("getMediationNetwork", null);
/* 194 */                               map.put(-180621578, method);
                                    }
/* 199 */                           Object objInvoke = ((Method) method).invoke(objNewInstance, null);
                                    try {
/* 203 */                               Object method2 = map.get(614194017);
/* 207 */                               if (method2 == null) {
/* 243 */                                   method2 = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getLongPressTimeout() >> 16) + 37, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 51)).getMethod("AFAdRevenueData", null);
/* 247 */                                   map.put(614194017, method2);
                                        }
/* 258 */                               boolean zBooleanValue2 = ((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
                                        try {
/* 262 */                                   Object method3 = map.get(2114469703);
/* 266 */                                   if (method3 == null) {
/* 299 */                                       method3 = ((Class) AFa1hSDK.getRevenue(38 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), 51 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("getRevenue", null);
/* 303 */                                       map.put(2114469703, method3);
                                            }
/* 314 */                                   zBooleanValue = ((Boolean) ((Method) method3).invoke(objInvoke, null)).booleanValue();
/* 324 */                                   String[] strArrSplit = uri.getPath().split("/");
/* 328 */                                   if (zBooleanValue2 && strArrSplit.length == 3) {
/* 336 */                                       this.copydefault = strArrSplit[1];
/* 340 */                                       this.copy = strArrSplit[2];
/* 346 */                                       this.hashCode = uri.toString();
                                            }
                                        } catch (Throwable th) {
/* 352 */                                   Throwable cause = th.getCause();
/* 356 */                                   if (cause == null) {
/* 359 */                                       throw th;
                                            }
/* 358 */                                   throw cause;
                                        }
                                    } catch (Throwable th2) {
/* 361 */                               Throwable cause2 = th2.getCause();
/* 365 */                               if (cause2 == null) {
/* 368 */                                   throw th2;
                                        }
/* 367 */                               throw cause2;
                                    }
                                } catch (Throwable th3) {
/* 370 */                           Throwable cause3 = th3.getCause();
/* 374 */                           if (cause3 == null) {
/* 377 */                               throw th3;
                                    }
/* 376 */                           throw cause3;
                                }
                            } catch (Throwable th4) {
/* 379 */                       Throwable cause4 = th4.getCause();
/* 383 */                       if (cause4 == null) {
/* 386 */                           throw th4;
                                }
/* 385 */                       throw cause4;
                            }
                        }
                    } catch (Exception e) {
/* 389 */               AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e);
                    }
/* 392 */           this.toString = zBooleanValue;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AFd1hSDK<Map<String, String>> AFAdRevenueData(String str) {
/* 9 */             return this.equals.getMediationNetwork(this.copydefault, this.copy, this.AFInAppEventType, str);
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                /* JADX INFO: renamed from: a_ */
                public final boolean mo1797a_() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AppsFlyerRequestListener component2() {
/* 1 */             return null;
                }

                public final boolean copy() {
                    return (TextUtils.isEmpty(this.copydefault) || TextUtils.isEmpty(this.copy) || this.copydefault.equals("app")) ? false : true;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final boolean copydefault() {
/* 1 */             return false;
                }

                public final boolean equals() {
/* 1 */             return this.toString;
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final void getCurrencyIso4217Code() {
                    ResponseNetwork responseNetwork;
/* 1 */             super.getCurrencyIso4217Code();
/* 4 */             AFa1tSDK aFa1tSDK = this.component2;
/* 6 */             if (aFa1tSDK != null) {
/* 12 */                if (this.getMonetizationNetwork == AFe1uSDK.SUCCESS && (responseNetwork = ((AFe1fSDK) this).areAllFieldsValid) != null) {
/* 24 */                    aFa1tSDK.getCurrencyIso4217Code((Map) responseNetwork.getBody());
/* 27 */                    return;
                        }
/* 28 */                Throwable thComponent1 = component1();
/* 36 */                if (!(thComponent1 instanceof ParsingException)) {
/* 65 */                    String str = this.hashCode;
/* 70 */                    aFa1tSDK.AFAdRevenueData(str != null ? str : "Can't get OneLink data");
                        } else if (((ParsingException) thComponent1).getRawResponse().isSuccessful()) {
/* 52 */                    aFa1tSDK.AFAdRevenueData("Can't parse one link data");
                        } else {
/* 56 */                    String str2 = this.hashCode;
/* 61 */                    aFa1tSDK.AFAdRevenueData(str2 != null ? str2 : "Can't get OneLink data");
                        }
                    }
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final boolean getMonetizationNetwork() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
/* 13 */        public final long AFAdRevenueData() {
/* 14 */            return 3000L;
                }
            }
