            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.r21;
            import p000.sb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, m6176d2 = {"Lcom/appsflyer/internal/AFj1aSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", "AFAdRevenueData", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "p1", HttpUrl.FRAGMENT_ENCODE_SET, "p2", "Ljava/util/concurrent/TimeUnit;", "p3", HttpUrl.FRAGMENT_ENCODE_SET, "getCurrencyIso4217Code", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class AFj1aSDK {
                public static final AFj1aSDK INSTANCE = new AFj1aSDK();

                private AFj1aSDK() {
                }

                public static final Map<String, Object> AFAdRevenueData(Map<String, Object> p0) {
/* 1 */             p0.getClass();
/* 6 */             Object obj = p0.get("meta");
/* 25 */            Map<String, Object> map = (!(obj instanceof Map) || ((obj instanceof r21) && !(obj instanceof sb1))) ? null : (Map) obj;
/* 26 */            if (map != null) {
/* 36 */                return map;
                    }
/* 30 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 33 */            p0.put("meta", linkedHashMap);
/* 36 */            return linkedHashMap;
                }

                public static final void getCurrencyIso4217Code(ScheduledExecutorService p0, Runnable p1, long p2, TimeUnit p3) {
/* 1 */             p0.getClass();
/* 4 */             p1.getClass();
/* 7 */             p3.getClass();
                    try {
/* 10 */                p0.schedule(p1, p2, p3);
                    } catch (RejectedExecutionException e) {
/* 24 */                AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
                    } catch (Throwable th) {
/* 17 */                AFLogger.afErrorLog("scheduleJob failed with Exception", th);
                    }
                }
            }
