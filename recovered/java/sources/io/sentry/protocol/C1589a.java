            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.AbstractMap;
            import java.util.Arrays;
            import java.util.Date;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1589a implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public String f11237U;

                /* JADX INFO: renamed from: V */
                public Boolean f11238V;

                /* JADX INFO: renamed from: W */
                public Boolean f11239W;

                /* JADX INFO: renamed from: X */
                public List f11240X;

                /* JADX INFO: renamed from: Y */
                public ConcurrentHashMap f11241Y;

                /* JADX INFO: renamed from: a */
                public String f11242a;

                /* JADX INFO: renamed from: b */
                public Date f11243b;

                /* JADX INFO: renamed from: c */
                public String f11244c;

                /* JADX INFO: renamed from: d */
                public String f11245d;

                /* JADX INFO: renamed from: e */
                public String f11246e;

                /* JADX INFO: renamed from: f */
                public String f11247f;

                /* JADX INFO: renamed from: i */
                public String f11248i;

                /* JADX INFO: renamed from: v */
                public AbstractMap f11249v;

                /* JADX INFO: renamed from: w */
                public List f11250w;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 149 */               return true;
                    }
/* 5 */             if (obj == null || C1589a.class != obj.getClass()) {
/* 151 */               return false;
                    }
/* 17 */            C1589a c1589a = (C1589a) obj;
                    return AbstractC1704c.m5453h(this.f11242a, c1589a.f11242a) && AbstractC1704c.m5453h(this.f11243b, c1589a.f11243b) && AbstractC1704c.m5453h(this.f11244c, c1589a.f11244c) && AbstractC1704c.m5453h(this.f11245d, c1589a.f11245d) && AbstractC1704c.m5453h(this.f11246e, c1589a.f11246e) && AbstractC1704c.m5453h(this.f11247f, c1589a.f11247f) && AbstractC1704c.m5453h(this.f11248i, c1589a.f11248i) && AbstractC1704c.m5453h(this.f11249v, c1589a.f11249v) && AbstractC1704c.m5453h(this.f11238V, c1589a.f11238V) && AbstractC1704c.m5453h(this.f11250w, c1589a.f11250w) && AbstractC1704c.m5453h(this.f11237U, c1589a.f11237U) && AbstractC1704c.m5453h(this.f11239W, c1589a.f11239W) && AbstractC1704c.m5453h(this.f11240X, c1589a.f11240X);
                }

                public final int hashCode() {
/* 31 */            return Arrays.hashCode(new Object[]{this.f11242a, this.f11243b, this.f11244c, this.f11245d, this.f11246e, this.f11247f, this.f11248i, this.f11249v, this.f11238V, this.f11250w, this.f11237U, this.f11239W, this.f11240X});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11242a != null) {
/* 12 */                c1505c.m5291p("app_identifier");
/* 17 */                c1505c.m5300y(this.f11242a);
                    }
/* 22 */            if (this.f11243b != null) {
/* 26 */                c1505c.m5291p("app_start_time");
/* 31 */                c1505c.m5297v(iLogger, this.f11243b);
                    }
/* 36 */            if (this.f11244c != null) {
/* 40 */                c1505c.m5291p("device_app_hash");
/* 45 */                c1505c.m5300y(this.f11244c);
                    }
/* 50 */            if (this.f11245d != null) {
/* 54 */                c1505c.m5291p("build_type");
/* 59 */                c1505c.m5300y(this.f11245d);
                    }
/* 64 */            if (this.f11246e != null) {
/* 68 */                c1505c.m5291p("app_name");
/* 73 */                c1505c.m5300y(this.f11246e);
                    }
/* 78 */            if (this.f11247f != null) {
/* 82 */                c1505c.m5291p("app_version");
/* 87 */                c1505c.m5300y(this.f11247f);
                    }
/* 92 */            if (this.f11248i != null) {
/* 96 */                c1505c.m5291p("app_build");
/* 101 */               c1505c.m5300y(this.f11248i);
                    }
/* 104 */           AbstractMap abstractMap = this.f11249v;
/* 106 */           if (abstractMap != null && !abstractMap.isEmpty()) {
/* 116 */               c1505c.m5291p("permissions");
/* 121 */               c1505c.m5297v(iLogger, this.f11249v);
                    }
/* 126 */           if (this.f11238V != null) {
/* 130 */               c1505c.m5291p("in_foreground");
/* 135 */               c1505c.m5298w(this.f11238V);
                    }
/* 140 */           if (this.f11250w != null) {
/* 144 */               c1505c.m5291p("view_names");
/* 149 */               c1505c.m5297v(iLogger, this.f11250w);
                    }
/* 154 */           if (this.f11237U != null) {
/* 158 */               c1505c.m5291p("start_type");
/* 163 */               c1505c.m5300y(this.f11237U);
                    }
/* 168 */           if (this.f11239W != null) {
/* 172 */               c1505c.m5291p("is_split_apks");
/* 177 */               c1505c.m5298w(this.f11239W);
                    }
/* 180 */           List list = this.f11240X;
/* 182 */           if (list != null && !list.isEmpty()) {
/* 192 */               c1505c.m5291p("split_names");
/* 197 */               c1505c.m5297v(iLogger, this.f11240X);
                    }
/* 200 */           ConcurrentHashMap concurrentHashMap = this.f11241Y;
/* 202 */           if (concurrentHashMap != null) {
/* 216 */               for (String str : concurrentHashMap.keySet()) {
/* 226 */                   AbstractC0298j.m1863d(this.f11241Y, str, c1505c, str, iLogger);
                        }
                    }
/* 230 */           c1505c.m5288l();
                }
            }
