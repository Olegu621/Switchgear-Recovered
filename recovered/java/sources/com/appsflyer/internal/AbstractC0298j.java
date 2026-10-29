            package com.appsflyer.internal;

            import io.sentry.ILogger;
            import io.sentry.internal.debugmeta.C1505c;
            import java.util.HashMap;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: com.appsflyer.internal.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract /* synthetic */ class AbstractC0298j {
                /* JADX INFO: renamed from: a */
                public static int m1860a(int i, int i2, int i3) {
/* 6 */             return (Integer.hashCode(i) + i2) * i3;
                }

                /* JADX INFO: renamed from: b */
                public static int m1861b(int i, int i2, List list) {
/* 6 */             return (list.hashCode() + i) * i2;
                }

                /* JADX INFO: renamed from: c */
                public static void m1862c(HashMap map, String str, C1505c c1505c, String str2, ILogger iLogger) {
/* 1 */             Object obj = map.get(str);
/* 5 */             c1505c.m5291p(str2);
/* 8 */             c1505c.m5297v(iLogger, obj);
                }

                /* JADX INFO: renamed from: d */
                public static void m1863d(ConcurrentHashMap concurrentHashMap, String str, C1505c c1505c, String str2, ILogger iLogger) {
/* 1 */             Object obj = concurrentHashMap.get(str);
/* 5 */             c1505c.m5291p(str2);
/* 8 */             c1505c.m5297v(iLogger, obj);
                }
            }
