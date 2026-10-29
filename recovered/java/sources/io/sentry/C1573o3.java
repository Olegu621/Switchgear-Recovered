            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1599f;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.C1626w;
            import io.sentry.protocol.profiling.C1617a;
            import io.sentry.vendor.gson.stream.C1732c;
            import java.io.File;
            import java.io.IOException;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.ConcurrentHashMap;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: io.sentry.o3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1573o3 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public double f11187U;

                /* JADX INFO: renamed from: V */
                public final File f11188V;

                /* JADX INFO: renamed from: X */
                public C1617a f11190X;

                /* JADX INFO: renamed from: Y */
                public ConcurrentHashMap f11191Y;

                /* JADX INFO: renamed from: b */
                public C1626w f11193b;

                /* JADX INFO: renamed from: c */
                public C1626w f11194c;

                /* JADX INFO: renamed from: d */
                public C1624u f11195d;

                /* JADX INFO: renamed from: e */
                public final Map f11196e;

                /* JADX INFO: renamed from: f */
                public String f11197f;

                /* JADX INFO: renamed from: i */
                public String f11198i;

                /* JADX INFO: renamed from: v */
                public String f11199v;

                /* JADX INFO: renamed from: w */
                public String f11200w;

                /* JADX INFO: renamed from: W */
                public String f11189W = null;

                /* JADX INFO: renamed from: a */
                public C1599f f11192a = null;

                public C1573o3(C1626w c1626w, C1626w c1626w2, File file, Map map, Double d, String str, C1554m6 c1554m6) {
/* 7 */             this.f11193b = c1626w;
/* 9 */             this.f11194c = c1626w2;
/* 11 */            this.f11188V = file;
/* 13 */            this.f11196e = map;
/* 21 */            this.f11195d = c1554m6.getSdkVersion();
/* 36 */            this.f11198i = c1554m6.getRelease() != null ? c1554m6.getRelease() : HttpUrl.FRAGMENT_ENCODE_SET;
/* 42 */            this.f11199v = c1554m6.getEnvironment();
/* 44 */            this.f11197f = str;
/* 48 */            this.f11200w = "2";
/* 54 */            this.f11187U = d.doubleValue();
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 127 */               return true;
                    }
/* 7 */             if (!(obj instanceof C1573o3)) {
/* 129 */               return false;
                    }
/* 11 */            C1573o3 c1573o3 = (C1573o3) obj;
                    return this.f11192a == c1573o3.f11192a && Objects.equals(this.f11193b, c1573o3.f11193b) && Objects.equals(this.f11194c, c1573o3.f11194c) && Objects.equals(this.f11195d, c1573o3.f11195d) && Objects.equals(this.f11196e, c1573o3.f11196e) && Objects.equals(this.f11197f, c1573o3.f11197f) && Objects.equals(this.f11198i, c1573o3.f11198i) && Objects.equals(this.f11199v, c1573o3.f11199v) && Objects.equals(this.f11200w, c1573o3.f11200w) && Objects.equals(this.f11189W, c1573o3.f11189W) && Objects.equals(this.f11191Y, c1573o3.f11191Y) && this.f11190X == c1573o3.f11190X;
                }

                public final int hashCode() {
/* 29 */            return Objects.hash(this.f11192a, this.f11193b, this.f11194c, this.f11195d, this.f11196e, this.f11197f, this.f11198i, this.f11199v, this.f11200w, this.f11189W, this.f11190X, this.f11191Y);
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11192a != null) {
/* 12 */                c1505c.m5291p("debug_meta");
/* 17 */                c1505c.m5297v(iLogger, this.f11192a);
                    }
/* 22 */            c1505c.m5291p("profiler_id");
/* 27 */            c1505c.m5297v(iLogger, this.f11193b);
/* 32 */            c1505c.m5291p("chunk_id");
/* 37 */            c1505c.m5297v(iLogger, this.f11194c);
/* 42 */            if (this.f11195d != null) {
/* 46 */                c1505c.m5291p("client_sdk");
/* 51 */                c1505c.m5297v(iLogger, this.f11195d);
                    }
/* 54 */            Map map = this.f11196e;
/* 60 */            if (!map.isEmpty()) {
/* 66 */                String str = ((C1732c) c1505c.f11042b).f11787d;
/* 70 */                c1505c.m5294s(HttpUrl.FRAGMENT_ENCODE_SET);
/* 75 */                c1505c.m5291p("measurements");
/* 78 */                c1505c.m5297v(iLogger, map);
/* 81 */                c1505c.m5294s(str);
                    }
/* 86 */            c1505c.m5291p("platform");
/* 91 */            c1505c.m5297v(iLogger, this.f11197f);
/* 96 */            c1505c.m5291p("release");
/* 101 */           c1505c.m5297v(iLogger, this.f11198i);
/* 106 */           if (this.f11199v != null) {
/* 110 */               c1505c.m5291p("environment");
/* 115 */               c1505c.m5297v(iLogger, this.f11199v);
                    }
/* 120 */           c1505c.m5291p("version");
/* 125 */           c1505c.m5297v(iLogger, this.f11200w);
/* 130 */           if (this.f11189W != null) {
/* 134 */               c1505c.m5291p("sampled_profile");
/* 139 */               c1505c.m5297v(iLogger, this.f11189W);
                    }
/* 144 */           c1505c.m5291p("timestamp");
/* 153 */           c1505c.m5297v(iLogger, AbstractC1417a.m5169g(this.f11187U));
/* 158 */           if (this.f11190X != null) {
/* 162 */               c1505c.m5291p("profile");
/* 167 */               c1505c.m5297v(iLogger, this.f11190X);
                    }
/* 170 */           ConcurrentHashMap concurrentHashMap = this.f11191Y;
/* 172 */           if (concurrentHashMap != null) {
/* 186 */               for (String str2 : concurrentHashMap.keySet()) {
/* 196 */                   AbstractC0298j.m1863d(this.f11191Y, str2, c1505c, str2, iLogger);
                        }
                    }
/* 200 */           c1505c.m5288l();
                }
            }
