            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.HashMap;
            import java.util.List;
            
            /* JADX INFO: renamed from: io.sentry.t5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1673t5 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public final List f11672a;

                /* JADX INFO: renamed from: b */
                public HashMap f11673b;

                public C1673t5(List list) {
/* 4 */             this.f11672a = list;
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p(FirebaseAnalytics.Param.ITEMS);
/* 13 */            c1505c.m5297v(iLogger, this.f11672a);
/* 16 */            HashMap map = this.f11673b;
/* 18 */            if (map != null) {
/* 32 */                for (String str : map.keySet()) {
/* 42 */                    AbstractC0298j.m1862c(this.f11673b, str, c1505c, str, iLogger);
                        }
                    }
/* 46 */            c1505c.m5288l();
                }
            }
