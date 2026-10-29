            package com.appsflyer.internal;

            import android.content.Context;
            import android.os.Bundle;
            import android.text.TextUtils;
            import com.appsflyer.AFLogger;
            import java.lang.reflect.InvocationHandler;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.lang.reflect.Proxy;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 2 */     public final class AFb1zSDK implements AFa1cSDK {
                private boolean AFAdRevenueData;
                private final AFc1hSDK getMonetizationNetwork;
                Map<String, Object> getRevenue;

                public AFb1zSDK(AFc1hSDK aFc1hSDK) {
/* 1 */             aFc1hSDK.getClass();
/* 7 */             this.getMonetizationNetwork = aFc1hSDK;
                }

                @Override // com.appsflyer.internal.AFa1cSDK
                public final boolean AFAdRevenueData() {
/* 5 */             if (!getCurrencyIso4217Code()) {
/* 19 */                return false;
                    }
/* 7 */             Map<String, Object> map = this.getRevenue;
                    return map == null || map.isEmpty();
                }

                @Override // com.appsflyer.internal.AFa1cSDK
                public final void getCurrencyIso4217Code(boolean z) {
/* 1 */             this.AFAdRevenueData = z;
                }

                @Override // com.appsflyer.internal.AFa1cSDK
                public final Map<String, Object> getMediationNetwork() {
/* 1 */             return this.getRevenue;
                }

                @Override // com.appsflyer.internal.AFa1cSDK
                public final void getMonetizationNetwork() {
                    Context context;
/* 7 */             if (getCurrencyIso4217Code() && (context = this.getMonetizationNetwork.getMonetizationNetwork) != null) {
/* 22 */                this.getRevenue = new LinkedHashMap();
/* 30 */                AFa1zSDK aFa1zSDK = new AFa1zSDK(System.currentTimeMillis());
                        try {
/* 54 */                    Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
/* 59 */                    Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
/* 65 */                    Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
/* 77 */                    Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
/* 94 */                    Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1bSDK.5
                                private /* synthetic */ AFa1uSDK getCurrencyIso4217Code;
                                private /* synthetic */ Class getMonetizationNetwork;

                                public C02395() {
/* 1 */                             cls = cls;
/* 3 */                             aFa1uSDK = aFa1zSDK;
                                }

                                @Override // java.lang.reflect.InvocationHandler
                                public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                                    String string;
                                    String string2;
                                    String string3;
                                    Bundle bundle;
/* 12 */                            if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
/* 103 */                               AFa1uSDK aFa1uSDK = aFa1uSDK;
/* 105 */                               if (aFa1uSDK != null) {
/* 109 */                                   aFa1uSDK.getRevenue("onDeferredAppLinkDataFetched invocation failed");
                                        }
/* 11 */                                return null;
                                    }
/* 15 */                            Object obj2 = objArr[0];
/* 17 */                            if (obj2 != null) {
/* 43 */                                Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", null).invoke(cls.cast(obj2), null));
/* 45 */                                if (bundle2 != null) {
/* 49 */                                    string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
/* 55 */                                    string3 = bundle2.getString("target_url");
/* 61 */                                    Bundle bundle3 = bundle2.getBundle("extras");
/* 82 */                                    string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                                        } else {
/* 84 */                                    string = null;
/* 85 */                                    string2 = null;
/* 86 */                                    string3 = null;
                                        }
/* 87 */                                AFa1uSDK aFa1uSDK2 = aFa1uSDK;
/* 89 */                                if (aFa1uSDK2 != null) {
/* 91 */                                    aFa1uSDK2.getRevenue(string2, string3, string);
                                        }
                                    } else {
/* 95 */                                AFa1uSDK aFa1uSDK3 = aFa1uSDK;
/* 97 */                                if (aFa1uSDK3 != null) {
/* 99 */                                    aFa1uSDK3.getRevenue(null, null, null);
                                        }
                                    }
/* 11 */                            return null;
                                }
                            });
/* 114 */                   String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
/* 122 */                   if (TextUtils.isEmpty(string)) {
/* 126 */                       aFa1zSDK.getRevenue("Facebook app id not defined in resources");
                            } else {
/* 142 */                       method.invoke(null, context, string, objNewProxyInstance);
                            }
                        } catch (ClassNotFoundException e) {
/* 161 */                   AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e);
/* 168 */                   aFa1zSDK.getRevenue(e.toString());
                        } catch (IllegalAccessException e2) {
/* 148 */                   AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e2);
/* 155 */                   aFa1zSDK.getRevenue(e2.toString());
                        } catch (NoSuchMethodException e3) {
/* 187 */                   AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e3);
/* 194 */                   aFa1zSDK.getRevenue(e3.toString());
                        } catch (InvocationTargetException e4) {
/* 174 */                   AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e4);
/* 181 */                   aFa1zSDK.getRevenue(e4.toString());
                        }
                    }
                }

/* 3 */         private boolean getCurrencyIso4217Code() {
/* 4 */             return this.AFAdRevenueData;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 102 */       public static final class AFa1zSDK implements AFa1bSDK.AFa1uSDK {
                    private /* synthetic */ long getMonetizationNetwork;

                    public AFa1zSDK(long j) {
/* 3 */                 this.getMonetizationNetwork = j;
                    }

                    @Override // com.appsflyer.internal.AFa1bSDK.AFa1uSDK
                    public final void getRevenue(String str, String str2, String str3) {
                        Map<String, Object> map;
/* 3 */                 if (str != null) {
/* 11 */                    AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
/* 16 */                    Map<String, Object> map2 = AFb1zSDK.this.getRevenue;
/* 18 */                    if (map2 != null) {
/* 20 */                        map2.put("link", str);
                            }
/* 23 */                    if (str2 != null && (map = AFb1zSDK.this.getRevenue) != null) {
/* 33 */                        map.put("target_url", str2);
                            }
/* 36 */                    if (str3 != null) {
/* 38 */                        AFb1zSDK aFb1zSDK = AFb1zSDK.this;
/* 42 */                        LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 47 */                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 52 */                        linkedHashMap2.put("promo_code", str3);
/* 57 */                        linkedHashMap.put("deeplink_context", linkedHashMap2);
/* 60 */                        Map<String, Object> map3 = aFb1zSDK.getRevenue;
/* 62 */                        if (map3 != null) {
/* 66 */                            map3.put("extras", linkedHashMap);
                                }
                            }
                        } else {
/* 72 */                    Map<String, Object> map4 = AFb1zSDK.this.getRevenue;
/* 74 */                    if (map4 != null) {
/* 78 */                        map4.put("link", HttpUrl.FRAGMENT_ENCODE_SET);
                            }
                        }
/* 88 */                String strValueOf = String.valueOf(System.currentTimeMillis() - this.getMonetizationNetwork);
/* 94 */                Map<String, Object> map5 = AFb1zSDK.this.getRevenue;
/* 96 */                if (map5 != null) {
/* 100 */                   map5.put("ttr", strValueOf);
                        }
                    }

                    @Override // com.appsflyer.internal.AFa1bSDK.AFa1uSDK
/* 103 */           public final void getRevenue(String str) {
/* 105 */               Map<String, Object> map = AFb1zSDK.this.getRevenue;
                        if (map != null) {
/* 106 */                   map.put("error", str);
                        }
                    }
                }
            }
