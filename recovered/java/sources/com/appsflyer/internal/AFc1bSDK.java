            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.os.Process;
            import android.view.ViewConfiguration;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerProperties;
            import com.appsflyer.PurchaseHandler;
            import java.lang.reflect.Constructor;
            import java.util.Map;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicInteger;
            import okhttp3.HttpUrl;
            import p000.RejectedExecutionHandlerC2263up;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 41 */    public final class AFc1bSDK implements AFd1zSDK {
                private static final int getMediationNetwork = 30000;
                private ExecutorService AFAdRevenueData;
                private AFc1tSDK AFInAppEventParameterName;
                private AFf1eSDK AFInAppEventType;
                private AFd1wSDK AFKeystoreWrapper;
                private AFe1vSDK AFLogger;
                private AFg1zSDK AFLoggerLogLevel;
                private AFa1lSDK afDebugLog;
                private AFg1vSDK afErrorLog;
                private AFi1oSDK afInfoLog;
                private AFg1bSDK afLogForce;
                private AFi1hSDK afRDLog;
                private AFf1fSDK afVerboseLog;
                private AFe1sSDK afWarnLog;
                private PurchaseHandler areAllFieldsValid;
                private AFc1pSDK component1;
                private AFf1kSDK component2;
                private AFd1mSDK component3;
                private AFc1oSDK component4;
                private AFj1lSDK copy;
                private AFe1oSDK copydefault;

                /* JADX INFO: renamed from: d */
                private AFj1cSDK f3078d;

                /* JADX INFO: renamed from: e */
                private AFb1aSDK f3079e;
                private AFg1nSDK equals;
                private AFa1mSDK force;
                private AFh1pSDK getLevel;
                private ExecutorService getMonetizationNetwork;
                private ScheduledExecutorService getRevenue;
                private AFd1oSDK hashCode;

                /* JADX INFO: renamed from: i */
                private AFi1kSDK f3080i;
                private AFj1sSDK registerClient;
                private AFh1xSDK toString;
                private AFg1uSDK unregisterClient;

                /* JADX INFO: renamed from: v */
                private AFa1cSDK f3081v;
                private AFc1eSDK valueOf;

                /* JADX INFO: renamed from: w */
                private AFi1pSDK f3082w;
                private String afErrorLogForExcManagerOnly = null;
                public final AFc1hSDK getCurrencyIso4217Code = new AFc1hSDK();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class AFa1zSDK implements ThreadFactory {
                    private static final AtomicInteger getCurrencyIso4217Code = new AtomicInteger();
                    private final AtomicInteger getRevenue = new AtomicInteger();

                    public AFa1zSDK() {
/* 13 */                getCurrencyIso4217Code.incrementAndGet();
                    }

                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
/* 3 */                 int i = getCurrencyIso4217Code.get();
/* 9 */                 int iIncrementAndGet = this.getRevenue.incrementAndGet();
/* 19 */                StringBuilder sb = new StringBuilder("queue-");
/* 22 */                sb.append(i);
/* 27 */                sb.append("-");
/* 30 */                sb.append(iIncrementAndGet);
/* 37 */                return new Thread(runnable, sb.toString());
                    }
                }

                private String AFLoggerLogLevel() {
/* 3 */             if (this.afErrorLogForExcManagerOnly == null) {
/* 14 */                this.afErrorLogForExcManagerOnly = new AFa1uSDK().AFAdRevenueData();
                    }
/* 16 */            return this.afErrorLogForExcManagerOnly;
                }

                private synchronized ExecutorService AFPurchaseDetails() {
                    try {
/* 4 */                 if (this.getMonetizationNetwork == null) {
/* 10 */                    this.getMonetizationNetwork = AFc1kSDK.getMediationNetwork();
                        }
                    } catch (Throwable th) {
/* 20 */                throw th;
                    }
/* 15 */            return this.getMonetizationNetwork;
                }

                private synchronized AFd1mSDK afRDLog() {
                    try {
/* 4 */                 if (this.component3 == null) {
/* 22 */                    this.component3 = new AFd1mSDK(new AFd1gSDK(getMediationNetwork), getMonetizationNetwork());
                        }
                    } catch (Throwable th) {
/* 32 */                throw th;
                    }
/* 27 */            return this.component3;
                }

                private synchronized ScheduledExecutorService getLevel() {
                    try {
/* 4 */                 if (this.getRevenue == null) {
/* 10 */                    this.getRevenue = AFc1kSDK.getRevenue();
                        }
                    } catch (Throwable th) {
/* 20 */                throw th;
                    }
/* 15 */            return this.getRevenue;
                }

                private synchronized AFj1cSDK getPurchaseToken() {
                    try {
/* 4 */                 if (this.f3078d == null) {
/* 15 */                    this.f3078d = new AFj1cSDK(AFAdRevenueData());
                        }
                    } catch (Throwable th) {
/* 25 */                throw th;
                    }
/* 20 */            return this.f3078d;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX INFO: renamed from: o_ */
                public /* synthetic */ SharedPreferences m1778o_() {
/* 3 */             Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
/* 5 */             if (context != null) {
/* 7 */                 return AFa1ySDK.m1763d_(context);
                    }
/* 14 */            f42.m3656l("Context must be set via setContext method before calling this dependency.");
/* 17 */            return null;
                }

                private synchronized AFg1zSDK valueOf() {
                    try {
/* 4 */                 if (this.AFLoggerLogLevel == null) {
/* 19 */                    this.AFLoggerLogLevel = new AFg1zSDK(AFInAppEventParameterName(), AFAdRevenueData());
                        }
                    } catch (Throwable th) {
/* 29 */                throw th;
                    }
/* 24 */            return this.AFLoggerLogLevel;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.appsflyer.internal.AFd1zSDK
                /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
                public synchronized AFd1wSDK afErrorLogForExcManagerOnly() {
                    try {
/* 4 */                 if (this.AFKeystoreWrapper == null) {
/* 11 */                    this.AFKeystoreWrapper = new AFd1wSDK(this);
                        }
                    } catch (Throwable th) {
/* 21 */                throw th;
                    }
/* 16 */            return this.AFKeystoreWrapper;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final synchronized AFc1oSDK AFAdRevenueData() {
                    try {
/* 4 */                 if (this.component4 == null) {
/* 8 */                     AFc1hSDK aFc1hSDKAFInAppEventParameterName = AFInAppEventParameterName();
/* 12 */                    AFc1qSDK aFc1qSDKComponent4 = component4();
/* 18 */                    if (this.valueOf == null) {
/* 25 */                        this.valueOf = new AFc1eSDK();
                            }
/* 39 */                    this.component4 = new AFc1oSDK(aFc1hSDKAFInAppEventParameterName, aFc1qSDKComponent4, this.valueOf, getMonetizationNetwork());
                        }
                    } catch (Throwable th) {
/* 46 */                throw th;
                    }
/* 41 */            return this.component4;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final synchronized AFc1hSDK AFInAppEventParameterName() {
/* 2 */             return this.getCurrencyIso4217Code;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final synchronized AFf1eSDK AFInAppEventType() {
                    try {
/* 4 */                 if (this.AFInAppEventType == null) {
/* 20 */                    this.AFInAppEventType = new AFf1eSDK(AFInAppEventParameterName(), new AFf1dSDK());
                        }
                    } catch (Throwable th) {
/* 30 */                throw th;
                    }
/* 25 */            return this.AFInAppEventType;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final synchronized AFe1vSDK AFKeystoreWrapper() {
                    try {
/* 4 */                 if (this.AFLogger == null) {
/* 19 */                    this.AFLogger = new AFe1vSDK(AFAdRevenueData(), component4());
                        }
                    } catch (Throwable th) {
/* 29 */                throw th;
                    }
/* 24 */            return this.AFLogger;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final synchronized AFj1sSDK AFLogger() {
                    try {
/* 4 */                 if (this.registerClient == null) {
/* 11 */                    this.registerClient = new AFj1sSDK(this);
                        }
                    } catch (Throwable th) {
/* 21 */                throw th;
                    }
/* 16 */            return this.registerClient;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final AFf1fSDK afDebugLog() {
/* 3 */             if (this.afVerboseLog == null) {
/* 11 */                Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
/* 13 */                if (context == null) {
/* 47 */                    f42.m3656l("Context must be set via setContext method before calling this dependency.");
/* 50 */                    return null;
                        }
/* 19 */                AFg1ySDK aFg1ySDK = new AFg1ySDK(context, AppsFlyerProperties.getInstance());
/* 24 */                if (this.valueOf == null) {
/* 31 */                    this.valueOf = new AFc1eSDK();
                        }
/* 42 */                this.afVerboseLog = new AFf1gSDK(aFg1ySDK, this.valueOf, AppsFlyerProperties.getInstance());
                    }
/* 52 */            return this.afVerboseLog;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final AFi1hSDK afErrorLog() {
                    try {
/* 10 */                if (this.afRDLog == null) {
                            try {
/* 25 */                        Object[] objArr = {AFAdRevenueData(), AFInAppEventParameterName(), AFInAppEventType()};
/* 36 */                        Map map = AFi1fSDK.f3095w;
/* 38 */                        Object declaredConstructor = map.get(-362937351);
/* 42 */                        if (declaredConstructor == null) {
/* 84 */                            declaredConstructor = ((Class) AFi1fSDK.getMediationNetwork((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31028), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (Process.myPid() >> 22) + 37)).getDeclaredConstructor(AFc1oSDK.class, AFc1hSDK.class, AFf1eSDK.class);
/* 88 */                            map.put(-362937351, declaredConstructor);
                                }
/* 99 */                        this.afRDLog = (AFi1hSDK) ((Constructor) declaredConstructor).newInstance(objArr);
                            } catch (Throwable th) {
/* 106 */                       Throwable cause = th.getCause();
/* 110 */                       if (cause != null) {
/* 112 */                           throw cause;
                                }
/* 113 */                       throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 135 */               AFLogger.INSTANCE.m1813e(AFg1cSDK.PLAY_INTEGRITY_API, th2.getMessage() != null ? th2.getMessage() : HttpUrl.FRAGMENT_ENCODE_SET, th2, false, false);
                    }
/* 138 */           return this.afRDLog;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final AFg1bSDK afInfoLog() {
/* 3 */             if (this.afLogForce == null) {
/* 10 */                this.afLogForce = new AFh1uSDK(this);
                    }
/* 12 */            return this.afLogForce;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final AFb1hSDK afLogForce() {
/* 5 */             if (this.valueOf == null) {
/* 12 */                this.valueOf = new AFc1eSDK();
                    }
/* 24 */            return new AFb1cSDK(this.valueOf, AFInAppEventParameterName(), AFInAppEventType());
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final AFa1lSDK afVerboseLog() {
/* 3 */             if (this.afDebugLog == null) {
/* 14 */                this.afDebugLog = new AFa1gSDK(component4());
                    }
/* 16 */            return this.afDebugLog;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final AFh1pSDK afWarnLog() {
/* 5 */             if (AFh1sSDK.getMonetizationNetwork() && this.getLevel == null) {
/* 24 */                this.getLevel = new AFh1oSDK(AFAdRevenueData(), AFLogger());
                    }
/* 26 */            return this.getLevel;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final synchronized AFh1xSDK areAllFieldsValid() {
                    try {
/* 4 */                 if (this.toString == null) {
/* 19 */                    this.toString = new AFh1xSDK(component4(), AFAdRevenueData());
                        }
                    } catch (Throwable th) {
/* 29 */                throw th;
                    }
/* 24 */            return this.toString;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final synchronized AFf1kSDK component1() {
                    try {
/* 4 */                 if (this.component2 == null) {
/* 12 */                    AFf1hSDK aFf1hSDK = new AFf1hSDK(component4());
/* 77 */                    this.component2 = new AFf1kSDK(new AFf1nSDK(), AFAdRevenueData(), AFInAppEventType(), aFf1hSDK, new AFd1nSDK(afRDLog(), AFAdRevenueData(), AppsFlyerProperties.getInstance(), AFKeystoreWrapper(), getPurchaseToken(), AFInAppEventType()), new AFf1jSDK(AFAdRevenueData(), aFf1hSDK), copydefault());
                        }
                    } catch (Throwable th) {
/* 87 */                throw th;
                    }
/* 82 */            return this.component2;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final synchronized PurchaseHandler component2() {
                    try {
/* 4 */                 if (this.areAllFieldsValid == null) {
/* 11 */                    this.areAllFieldsValid = new PurchaseHandler(this);
                        }
                    } catch (Throwable th) {
/* 21 */                throw th;
                    }
/* 16 */            return this.areAllFieldsValid;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final AFg1nSDK component3() {
/* 5 */             if (this.equals == null) {
/* 9 */                 String strAFLoggerLogLevel = AFLoggerLogLevel();
/* 15 */                Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
/* 20 */                if (context == null) {
/* 166 */                   f42.m3656l("Context must be set via setContext method before calling this dependency.");
/* 17 */                    return null;
                        }
/* 24 */                if (this.f3080i == null) {
/* 31 */                    this.f3080i = new AFi1iSDK();
                        }
/* 34 */                AFi1kSDK aFi1kSDK = this.f3080i;
/* 38 */                if (this.unregisterClient == null) {
/* 45 */                    this.unregisterClient = new AFg1wSDK();
                        }
/* 48 */                AFg1uSDK aFg1uSDK = this.unregisterClient;
/* 52 */                if (this.copy == null) {
/* 58 */                    Context context2 = this.getCurrencyIso4217Code.getMonetizationNetwork;
/* 60 */                    if (context2 == null) {
/* 73 */                        f42.m3656l("Context must be set via setContext method before calling this dependency.");
/* 17 */                        return null;
                            }
/* 69 */                    this.copy = new AFj1pSDK(context2, AFPurchaseDetails());
                        }
/* 77 */                AFj1lSDK aFj1lSDK = this.copy;
/* 81 */                if (this.afErrorLog == null) {
/* 88 */                    this.afErrorLog = new AFg1qSDK();
                        }
/* 91 */                AFg1vSDK aFg1vSDK = this.afErrorLog;
/* 94 */                AFh1xSDK aFh1xSDKAreAllFieldsValid = areAllFieldsValid();
/* 99 */                AFc1qSDK aFc1qSDKComponent4 = component4();
/* 104 */               AFc1oSDK aFc1oSDKAFAdRevenueData = AFAdRevenueData();
/* 110 */               if (this.f3082w == null) {
/* 116 */                   Context context3 = this.getCurrencyIso4217Code.getMonetizationNetwork;
/* 118 */                   if (context3 == null) {
/* 126 */                       f42.m3656l("Context must be set via setContext method before calling this dependency.");
/* 17 */                        return null;
                            }
/* 123 */                   this.f3082w = new AFi1pSDK(context3);
                        }
/* 130 */               AFi1pSDK aFi1pSDK = this.f3082w;
/* 132 */               AFf1eSDK aFf1eSDKAFInAppEventType = AFInAppEventType();
/* 136 */               AFc1hSDK aFc1hSDKAFInAppEventParameterName = AFInAppEventParameterName();
/* 140 */               AFg1zSDK aFg1zSDKValueOf = valueOf();
/* 146 */               if (this.valueOf == null) {
/* 153 */                   this.valueOf = new AFc1eSDK();
                        }
/* 162 */               this.equals = new AFg1rSDK(strAFLoggerLogLevel, context, aFi1kSDK, aFg1uSDK, aFj1lSDK, aFg1vSDK, aFh1xSDKAreAllFieldsValid, aFc1qSDKComponent4, aFc1oSDKAFAdRevenueData, aFi1pSDK, aFf1eSDKAFInAppEventType, aFc1hSDKAFInAppEventParameterName, aFg1zSDKValueOf, this.valueOf);
                    }
/* 170 */           return this.equals;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final AFc1qSDK component4() {
/* 3 */             if (this.component1 == null) {
/* 21 */                this.component1 = new AFc1pSDK(new AFc1gSDK(new C0292d(this, 1)));
                    }
/* 23 */            return this.component1;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final synchronized AFd1oSDK copy() {
                    try {
/* 4 */                 if (this.hashCode == null) {
/* 11 */                    this.hashCode = new AFd1lSDK(this);
                        }
                    } catch (Throwable th) {
/* 21 */                throw th;
                    }
/* 16 */            return this.hashCode;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final synchronized AFe1oSDK copydefault() {
                    try {
/* 4 */                 if (this.copydefault == null) {
/* 24 */                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1bSDK.1
                                /* JADX INFO: Access modifiers changed from: private */
                                @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                                /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
                                public boolean offer(Runnable runnable) {
/* 5 */                             if (isEmpty()) {
/* 7 */                                 return super.offer(runnable);
                                    }
/* 12 */                            return false;
                                }
                            }, new AFa1zSDK());
/* 33 */                    threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC2263up(1));
/* 41 */                    this.copydefault = new AFe1oSDK(threadPoolExecutor);
                        }
                    } catch (Throwable th) {
/* 51 */                throw th;
                    }
/* 46 */            return this.copydefault;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                /* JADX INFO: renamed from: d */
                public final AFi1pSDK mo1779d() {
/* 3 */             if (this.f3082w == null) {
/* 9 */                 Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
/* 11 */                if (context == null) {
/* 21 */                    f42.m3656l("Context must be set via setContext method before calling this dependency.");
/* 24 */                    return null;
                        }
/* 16 */                this.f3082w = new AFi1pSDK(context);
                    }
/* 26 */            return this.f3082w;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                /* JADX INFO: renamed from: e */
                public final synchronized AFa1cSDK mo1780e() {
                    try {
/* 4 */                 if (this.f3081v == null) {
/* 15 */                    this.f3081v = new AFb1zSDK(AFInAppEventParameterName());
                        }
                    } catch (Throwable th) {
/* 25 */                throw th;
                    }
/* 20 */            return this.f3081v;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final AFj1lSDK equals() {
/* 3 */             if (this.copy == null) {
/* 9 */                 Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
/* 11 */                if (context == null) {
/* 25 */                    f42.m3656l("Context must be set via setContext method before calling this dependency.");
/* 28 */                    return null;
                        }
/* 20 */                this.copy = new AFj1pSDK(context, AFPurchaseDetails());
                    }
/* 30 */            return this.copy;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final AFc1eSDK force() {
/* 3 */             if (this.valueOf == null) {
/* 10 */                this.valueOf = new AFc1eSDK();
                    }
/* 12 */            return this.valueOf;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final AFe1sSDK getCurrencyIso4217Code() {
/* 3 */             if (this.afWarnLog == null) {
/* 38 */                this.afWarnLog = new AFe1sSDK(component4(), AFInAppEventParameterName(), AFAdRevenueData(), getMonetizationNetwork(), component3(), AFInAppEventType(), copydefault());
                    }
/* 40 */            return this.afWarnLog;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final synchronized ScheduledExecutorService getMediationNetwork() {
                    try {
/* 4 */                 if (this.getRevenue == null) {
/* 10 */                    this.getRevenue = AFc1kSDK.getMonetizationNetwork();
                        }
                    } catch (Throwable th) {
/* 20 */                throw th;
                    }
/* 15 */            return this.getRevenue;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final synchronized ExecutorService getMonetizationNetwork() {
                    try {
/* 4 */                 if (this.AFAdRevenueData == null) {
/* 10 */                    this.AFAdRevenueData = AFc1kSDK.getCurrencyIso4217Code();
                        }
                    } catch (Throwable th) {
/* 20 */                throw th;
                    }
/* 15 */            return this.AFAdRevenueData;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final AFd1nSDK getRevenue() {
/* 27 */            return new AFd1nSDK(afRDLog(), AFAdRevenueData(), AppsFlyerProperties.getInstance(), AFKeystoreWrapper(), getPurchaseToken(), AFInAppEventType());
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                /* JADX INFO: renamed from: i */
                public final synchronized AFa1mSDK mo1781i() {
                    try {
/* 4 */                 if (this.force == null) {
/* 11 */                    this.force = new AFa1mSDK(this);
                        }
                    } catch (Throwable th) {
/* 21 */                throw th;
                    }
/* 16 */            return this.force;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final synchronized AFc1tSDK registerClient() {
                    try {
/* 4 */                 if (this.AFInAppEventParameterName == null) {
/* 19 */                    this.AFInAppEventParameterName = new AFc1vSDK(AFInAppEventParameterName(), component4());
                        }
                    } catch (Throwable th) {
/* 29 */                throw th;
                    }
/* 24 */            return this.AFInAppEventParameterName;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                public final AFi1kSDK unregisterClient() {
/* 3 */             if (this.f3080i == null) {
/* 10 */                this.f3080i = new AFi1iSDK();
                    }
/* 12 */            return this.f3080i;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                /* JADX INFO: renamed from: v */
                public final AFb1aSDK mo1782v() {
/* 3 */             if (this.f3079e == null) {
/* 7 */                 ScheduledExecutorService level = getLevel();
/* 11 */                AFa1mSDK aFa1mSDKMo1781i = mo1781i();
/* 17 */                if (this.afInfoLog == null) {
/* 24 */                    this.afInfoLog = new AFi1lSDK();
                        }
/* 31 */                this.f3079e = new AFb1bSDK(level, aFa1mSDKMo1781i, this.afInfoLog);
                    }
/* 33 */            return this.f3079e;
                }

                @Override // com.appsflyer.internal.AFd1zSDK
                /* JADX INFO: renamed from: w */
                public final AFi1oSDK mo1783w() {
/* 3 */             if (this.afInfoLog == null) {
/* 10 */                this.afInfoLog = new AFi1lSDK();
                    }
/* 12 */            return this.afInfoLog;
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 42 */        public static /* synthetic */ void getCurrencyIso4217Code(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    try {
/* 43 */                threadPoolExecutor.getQueue().put(runnable);
                    } catch (InterruptedException e) {
/* 44 */                AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e);
/* 45 */                Thread.currentThread().interrupt();
                    }
                }
            }
