            package io.sentry;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1626w;
            import java.io.IOException;
            import java.util.HashMap;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.m7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1555m7 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public final C1626w f11145a;

                /* JADX INFO: renamed from: b */
                public final String f11146b;

                /* JADX INFO: renamed from: c */
                public final String f11147c;

                /* JADX INFO: renamed from: d */
                public final String f11148d;

                /* JADX INFO: renamed from: e */
                public HashMap f11149e;

                public C1555m7(C1626w c1626w, String str, String str2, String str3) {
/* 4 */             this.f11145a = c1626w;
/* 6 */             this.f11146b = str;
/* 8 */             this.f11147c = str2;
/* 10 */            this.f11148d = str3;
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("event_id");
/* 13 */            this.f11145a.serialize(c1505c, iLogger);
/* 16 */            String str = this.f11146b;
/* 18 */            if (str != null) {
/* 22 */                c1505c.m5291p("name");
/* 25 */                c1505c.m5300y(str);
                    }
/* 28 */            String str2 = this.f11147c;
/* 30 */            if (str2 != null) {
/* 34 */                c1505c.m5291p(NotificationCompat.CATEGORY_EMAIL);
/* 37 */                c1505c.m5300y(str2);
                    }
/* 40 */            String str3 = this.f11148d;
/* 42 */            if (str3 != null) {
/* 46 */                c1505c.m5291p("comments");
/* 49 */                c1505c.m5300y(str3);
                    }
/* 52 */            HashMap map = this.f11149e;
/* 54 */            if (map != null) {
/* 68 */                for (String str4 : map.keySet()) {
/* 78 */                    AbstractC0298j.m1862c(this.f11149e, str4, c1505c, str4, iLogger);
                        }
                    }
/* 82 */            c1505c.m5288l();
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("UserFeedback{eventId=");
/* 10 */            sb.append(this.f11145a);
/* 15 */            sb.append(", name='");
/* 20 */            sb.append(this.f11146b);
/* 25 */            sb.append("', email='");
/* 30 */            sb.append(this.f11147c);
/* 35 */            sb.append("', comments='");
/* 42 */            return fm0.m3789o(sb, this.f11148d, "'}");
                }
            }
