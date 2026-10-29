            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.C1566n5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.a0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1590a0 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public String f11251U;

                /* JADX INFO: renamed from: V */
                public Boolean f11252V;

                /* JADX INFO: renamed from: W */
                public String f11253W;

                /* JADX INFO: renamed from: X */
                public Boolean f11254X;

                /* JADX INFO: renamed from: Y */
                public String f11255Y;

                /* JADX INFO: renamed from: Z */
                public String f11256Z;

                /* JADX INFO: renamed from: a */
                public List f11257a;

                /* JADX INFO: renamed from: a0 */
                public String f11258a0;

                /* JADX INFO: renamed from: b */
                public List f11259b;

                /* JADX INFO: renamed from: b0 */
                public String f11260b0;

                /* JADX INFO: renamed from: c */
                public Map f11261c;

                /* JADX INFO: renamed from: c0 */
                public String f11262c0;

                /* JADX INFO: renamed from: d */
                public String f11263d;

                /* JADX INFO: renamed from: d0 */
                public String f11264d0;

                /* JADX INFO: renamed from: e */
                public String f11265e;

                /* JADX INFO: renamed from: e0 */
                public ConcurrentHashMap f11266e0;

                /* JADX INFO: renamed from: f */
                public String f11267f;

                /* JADX INFO: renamed from: f0 */
                public String f11268f0;

                /* JADX INFO: renamed from: g0 */
                public C1566n5 f11269g0;

                /* JADX INFO: renamed from: i */
                public Integer f11270i;

                /* JADX INFO: renamed from: v */
                public Integer f11271v;

                /* JADX INFO: renamed from: w */
                public String f11272w;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == null || C1590a0.class != obj.getClass()) {
/* 237 */               return false;
                    }
/* 13 */            C1590a0 c1590a0 = (C1590a0) obj;
                    return Objects.equals(this.f11257a, c1590a0.f11257a) && Objects.equals(this.f11259b, c1590a0.f11259b) && Objects.equals(this.f11261c, c1590a0.f11261c) && Objects.equals(this.f11263d, c1590a0.f11263d) && Objects.equals(this.f11265e, c1590a0.f11265e) && Objects.equals(this.f11267f, c1590a0.f11267f) && Objects.equals(this.f11270i, c1590a0.f11270i) && Objects.equals(this.f11271v, c1590a0.f11271v) && Objects.equals(this.f11272w, c1590a0.f11272w) && Objects.equals(this.f11251U, c1590a0.f11251U) && Objects.equals(this.f11252V, c1590a0.f11252V) && Objects.equals(this.f11253W, c1590a0.f11253W) && Objects.equals(this.f11254X, c1590a0.f11254X) && Objects.equals(this.f11255Y, c1590a0.f11255Y) && Objects.equals(this.f11256Z, c1590a0.f11256Z) && Objects.equals(this.f11258a0, c1590a0.f11258a0) && Objects.equals(this.f11260b0, c1590a0.f11260b0) && Objects.equals(this.f11262c0, c1590a0.f11262c0) && Objects.equals(this.f11264d0, c1590a0.f11264d0) && Objects.equals(this.f11266e0, c1590a0.f11266e0) && Objects.equals(this.f11268f0, c1590a0.f11268f0) && Objects.equals(this.f11269g0, c1590a0.f11269g0);
                }

                public final int hashCode() {
/* 72 */            return Objects.hash(this.f11257a, this.f11259b, this.f11261c, null, this.f11263d, this.f11265e, this.f11267f, this.f11270i, this.f11271v, this.f11272w, this.f11251U, this.f11252V, this.f11253W, this.f11254X, this.f11255Y, this.f11256Z, this.f11258a0, this.f11260b0, this.f11262c0, this.f11264d0, this.f11266e0, this.f11268f0, this.f11269g0);
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11263d != null) {
/* 12 */                c1505c.m5291p("filename");
/* 17 */                c1505c.m5300y(this.f11263d);
                    }
/* 22 */            if (this.f11265e != null) {
/* 26 */                c1505c.m5291p("function");
/* 31 */                c1505c.m5300y(this.f11265e);
                    }
/* 36 */            if (this.f11267f != null) {
/* 40 */                c1505c.m5291p("module");
/* 45 */                c1505c.m5300y(this.f11267f);
                    }
/* 50 */            if (this.f11270i != null) {
/* 54 */                c1505c.m5291p("lineno");
/* 59 */                c1505c.m5299x(this.f11270i);
                    }
/* 64 */            if (this.f11271v != null) {
/* 68 */                c1505c.m5291p("colno");
/* 73 */                c1505c.m5299x(this.f11271v);
                    }
/* 78 */            if (this.f11272w != null) {
/* 82 */                c1505c.m5291p("abs_path");
/* 87 */                c1505c.m5300y(this.f11272w);
                    }
/* 92 */            if (this.f11251U != null) {
/* 96 */                c1505c.m5291p("context_line");
/* 101 */               c1505c.m5300y(this.f11251U);
                    }
/* 106 */           if (this.f11252V != null) {
/* 110 */               c1505c.m5291p("in_app");
/* 115 */               c1505c.m5298w(this.f11252V);
                    }
/* 120 */           if (this.f11253W != null) {
/* 124 */               c1505c.m5291p("package");
/* 129 */               c1505c.m5300y(this.f11253W);
                    }
/* 134 */           if (this.f11254X != null) {
/* 138 */               c1505c.m5291p("native");
/* 143 */               c1505c.m5298w(this.f11254X);
                    }
/* 148 */           if (this.f11255Y != null) {
/* 152 */               c1505c.m5291p("platform");
/* 157 */               c1505c.m5300y(this.f11255Y);
                    }
/* 162 */           if (this.f11256Z != null) {
/* 166 */               c1505c.m5291p("image_addr");
/* 171 */               c1505c.m5300y(this.f11256Z);
                    }
/* 176 */           if (this.f11258a0 != null) {
/* 180 */               c1505c.m5291p("symbol_addr");
/* 185 */               c1505c.m5300y(this.f11258a0);
                    }
/* 190 */           if (this.f11260b0 != null) {
/* 194 */               c1505c.m5291p("instruction_addr");
/* 199 */               c1505c.m5300y(this.f11260b0);
                    }
/* 204 */           if (this.f11262c0 != null) {
/* 208 */               c1505c.m5291p("addr_mode");
/* 213 */               c1505c.m5300y(this.f11262c0);
                    }
/* 218 */           if (this.f11268f0 != null) {
/* 222 */               c1505c.m5291p("raw_function");
/* 227 */               c1505c.m5300y(this.f11268f0);
                    }
/* 232 */           if (this.f11264d0 != null) {
/* 236 */               c1505c.m5291p("symbol");
/* 241 */               c1505c.m5300y(this.f11264d0);
                    }
/* 246 */           if (this.f11269g0 != null) {
/* 250 */               c1505c.m5291p("lock");
/* 255 */               c1505c.m5297v(iLogger, this.f11269g0);
                    }
/* 258 */           List list = this.f11257a;
/* 260 */           if (list != null && !list.isEmpty()) {
/* 270 */               c1505c.m5291p("pre_context");
/* 275 */               c1505c.m5297v(iLogger, this.f11257a);
                    }
/* 278 */           List list2 = this.f11259b;
/* 280 */           if (list2 != null && !list2.isEmpty()) {
/* 290 */               c1505c.m5291p("post_context");
/* 295 */               c1505c.m5297v(iLogger, this.f11259b);
                    }
/* 298 */           Map map = this.f11261c;
/* 300 */           if (map != null && !map.isEmpty()) {
/* 310 */               c1505c.m5291p("vars");
/* 315 */               c1505c.m5297v(iLogger, this.f11261c);
                    }
/* 318 */           ConcurrentHashMap concurrentHashMap = this.f11266e0;
/* 320 */           if (concurrentHashMap != null) {
/* 334 */               for (String str : concurrentHashMap.keySet()) {
/* 344 */                   AbstractC0298j.m1863d(this.f11266e0, str, c1505c, str, iLogger);
                        }
                    }
/* 348 */           c1505c.m5288l();
                }
            }
