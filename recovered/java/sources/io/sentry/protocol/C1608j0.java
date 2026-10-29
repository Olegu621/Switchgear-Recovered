            package io.sentry.protocol;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.internal.AbstractC0298j;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.j0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1608j0 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public String f11361a;

                /* JADX INFO: renamed from: b */
                public String f11362b;

                /* JADX INFO: renamed from: c */
                public String f11363c;

                /* JADX INFO: renamed from: d */
                public String f11364d;

                /* JADX INFO: renamed from: e */
                public String f11365e;

                /* JADX INFO: renamed from: f */
                public C1611l f11366f;

                /* JADX INFO: renamed from: i */
                public ConcurrentHashMap f11367i;

                /* JADX INFO: renamed from: v */
                public ConcurrentHashMap f11368v;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && C1608j0.class == obj.getClass()) {
/* 17 */                C1608j0 c1608j0 = (C1608j0) obj;
/* 27 */                if (AbstractC1704c.m5453h(this.f11361a, c1608j0.f11361a) && AbstractC1704c.m5453h(this.f11362b, c1608j0.f11362b) && AbstractC1704c.m5453h(this.f11363c, c1608j0.f11363c) && AbstractC1704c.m5453h(this.f11364d, c1608j0.f11364d)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{this.f11361a, this.f11362b, this.f11363c, this.f11364d});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11361a != null) {
/* 12 */                c1505c.m5291p(NotificationCompat.CATEGORY_EMAIL);
/* 17 */                c1505c.m5300y(this.f11361a);
                    }
/* 22 */            if (this.f11362b != null) {
/* 26 */                c1505c.m5291p("id");
/* 31 */                c1505c.m5300y(this.f11362b);
                    }
/* 36 */            if (this.f11363c != null) {
/* 40 */                c1505c.m5291p(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME);
/* 45 */                c1505c.m5300y(this.f11363c);
                    }
/* 50 */            if (this.f11364d != null) {
/* 54 */                c1505c.m5291p("ip_address");
/* 59 */                c1505c.m5300y(this.f11364d);
                    }
/* 64 */            if (this.f11365e != null) {
/* 68 */                c1505c.m5291p("name");
/* 73 */                c1505c.m5300y(this.f11365e);
                    }
/* 78 */            if (this.f11366f != null) {
/* 82 */                c1505c.m5291p("geo");
/* 87 */                this.f11366f.serialize(c1505c, iLogger);
                    }
/* 92 */            if (this.f11367i != null) {
/* 96 */                c1505c.m5291p(SharedDataContentProvider.BASE_PATH);
/* 101 */               c1505c.m5297v(iLogger, this.f11367i);
                    }
/* 104 */           ConcurrentHashMap concurrentHashMap = this.f11368v;
/* 106 */           if (concurrentHashMap != null) {
/* 120 */               for (String str : concurrentHashMap.keySet()) {
/* 130 */                   AbstractC0298j.m1863d(this.f11368v, str, c1505c, str, iLogger);
                        }
                    }
/* 134 */           c1505c.m5288l();
                }
            }
