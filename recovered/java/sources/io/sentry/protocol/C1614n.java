            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.EnumC1574o4;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.AbstractMap;
            import java.util.HashMap;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.n */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 27 */    public final class C1614n implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11405a = 1;

                /* JADX INFO: renamed from: b */
                public final String f11406b;

                /* JADX INFO: renamed from: c */
                public final Object f11407c;

                /* JADX INFO: renamed from: d */
                public AbstractMap f11408d;

                public C1614n(String str, Object obj) {
/* 7 */             this.f11406b = str;
/* 9 */             if (obj == null || !str.equals("string")) {
/* 26 */                this.f11407c = obj;
                    } else {
/* 23 */                this.f11407c = obj.toString();
                    }
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             int i = this.f11405a;
/* 3 */             Object obj = this.f11407c;
/* 7 */             String str = this.f11406b;
                    switch (i) {
                        case 0:
/* 69 */                    C1505c c1505c = (C1505c) interfaceC1518j3;
/* 71 */                    c1505c.m5287i();
/* 74 */                    c1505c.m5291p(FirebaseAnalytics.Param.VALUE);
/* 79 */                    c1505c.m5299x((Number) obj);
/* 82 */                    if (str != null) {
/* 86 */                        c1505c.m5291p("unit");
/* 89 */                        c1505c.m5300y(str);
                            }
/* 94 */                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f11408d;
/* 96 */                    if (concurrentHashMap != null) {
/* 110 */                       for (String str2 : concurrentHashMap.keySet()) {
/* 122 */                           AbstractC0298j.m1863d((ConcurrentHashMap) this.f11408d, str2, c1505c, str2, iLogger);
                                }
                            }
/* 126 */                   c1505c.m5288l();
                            break;
                        default:
/* 12 */                    C1505c c1505c2 = (C1505c) interfaceC1518j3;
/* 14 */                    c1505c2.m5287i();
/* 19 */                    c1505c2.m5291p("type");
/* 22 */                    c1505c2.m5297v(iLogger, str);
/* 25 */                    c1505c2.m5291p(FirebaseAnalytics.Param.VALUE);
/* 28 */                    c1505c2.m5297v(iLogger, obj);
/* 33 */                    HashMap map = (HashMap) this.f11408d;
/* 35 */                    if (map != null) {
/* 49 */                        for (String str3 : map.keySet()) {
/* 61 */                            AbstractC0298j.m1862c((HashMap) this.f11408d, str3, c1505c2, str3, iLogger);
                                }
                            }
/* 65 */                    c1505c2.m5288l();
                            break;
                    }
                }

/* 28 */        public C1614n(EnumC1574o4 enumC1574o4, Object obj) {
/* 29 */            this(enumC1574o4.apiName(), obj);
                }

/* 29 */        public C1614n(String str, Number number) {
/* 31 */            this.f11407c = number;
/* 32 */            this.f11406b = str;
                }
            }
