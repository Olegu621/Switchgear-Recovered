            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.C1554m6;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            
            /* JADX INFO: renamed from: io.sentry.protocol.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1599f implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public C1623t f11307a;

                /* JADX INFO: renamed from: b */
                public List f11308b;

                /* JADX INFO: renamed from: c */
                public HashMap f11309c;

                /* JADX INFO: renamed from: a */
                public static C1599f m5377a(C1599f c1599f, C1554m6 c1554m6) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 10 */            if (c1554m6.getProguardUuid() != null) {
/* 14 */                DebugImage debugImage = new DebugImage();
/* 19 */                debugImage.setType(DebugImage.PROGUARD);
/* 26 */                debugImage.setUuid(c1554m6.getProguardUuid());
/* 29 */                arrayList.add(debugImage);
                    }
/* 44 */            for (String str : c1554m6.getBundleIds()) {
/* 54 */                DebugImage debugImage2 = new DebugImage();
/* 59 */                debugImage2.setType(DebugImage.JVM);
/* 62 */                debugImage2.setDebugId(str);
/* 65 */                arrayList.add(debugImage2);
                    }
/* 73 */            if (arrayList.isEmpty()) {
/* 98 */                return null;
                    }
/* 75 */            if (c1599f == null) {
/* 79 */                c1599f = new C1599f();
                    }
/* 82 */            List list = c1599f.f11308b;
/* 84 */            if (list == null) {
/* 91 */                c1599f.f11308b = new ArrayList(arrayList);
/* 93 */                return c1599f;
                    }
/* 94 */            list.addAll(arrayList);
/* 97 */            return c1599f;
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11307a != null) {
/* 12 */                c1505c.m5291p("sdk_info");
/* 17 */                c1505c.m5297v(iLogger, this.f11307a);
                    }
/* 22 */            if (this.f11308b != null) {
/* 26 */                c1505c.m5291p("images");
/* 31 */                c1505c.m5297v(iLogger, this.f11308b);
                    }
/* 34 */            HashMap map = this.f11309c;
/* 36 */            if (map != null) {
/* 50 */                for (String str : map.keySet()) {
/* 60 */                    AbstractC0298j.m1862c(this.f11309c, str, c1505c, str, iLogger);
                        }
                    }
/* 64 */            c1505c.m5288l();
                }
            }
