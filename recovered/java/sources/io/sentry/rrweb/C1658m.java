            package io.sentry.rrweb;

            import com.appsflyer.internal.AbstractC0298j;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.rrweb.m */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1658m extends AbstractC1647b implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public int f11623U;

                /* JADX INFO: renamed from: V */
                public int f11624V;

                /* JADX INFO: renamed from: W */
                public String f11625W;

                /* JADX INFO: renamed from: X */
                public int f11626X;

                /* JADX INFO: renamed from: Y */
                public int f11627Y;

                /* JADX INFO: renamed from: Z */
                public int f11628Z;

                /* JADX INFO: renamed from: a0 */
                public HashMap f11629a0;

                /* JADX INFO: renamed from: b0 */
                public ConcurrentHashMap f11630b0;

                /* JADX INFO: renamed from: c */
                public String f11631c;

                /* JADX INFO: renamed from: c0 */
                public ConcurrentHashMap f11632c0;

                /* JADX INFO: renamed from: d */
                public int f11633d;

                /* JADX INFO: renamed from: e */
                public long f11634e;

                /* JADX INFO: renamed from: f */
                public long f11635f;

                /* JADX INFO: renamed from: i */
                public String f11636i;

                /* JADX INFO: renamed from: v */
                public String f11637v;

                /* JADX INFO: renamed from: w */
                public int f11638w;

                public C1658m() {
/* 3 */             super(EnumC1648c.Custom);
/* 8 */             this.f11636i = "h264";
/* 12 */            this.f11637v = "mp4";
/* 16 */            this.f11625W = "constant";
/* 20 */            this.f11631c = "video";
                }

                @Override // io.sentry.rrweb.AbstractC1647b
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || C1658m.class != obj.getClass() || !super.equals(obj)) {
/* 5 */                 return false;
                    }
/* 24 */            C1658m c1658m = (C1658m) obj;
                    return this.f11633d == c1658m.f11633d && this.f11634e == c1658m.f11634e && this.f11635f == c1658m.f11635f && this.f11638w == c1658m.f11638w && this.f11623U == c1658m.f11623U && this.f11624V == c1658m.f11624V && this.f11626X == c1658m.f11626X && this.f11627Y == c1658m.f11627Y && this.f11628Z == c1658m.f11628Z && AbstractC1704c.m5453h(this.f11631c, c1658m.f11631c) && AbstractC1704c.m5453h(this.f11636i, c1658m.f11636i) && AbstractC1704c.m5453h(this.f11637v, c1658m.f11637v) && AbstractC1704c.m5453h(this.f11625W, c1658m.f11625W);
                }

                @Override // io.sentry.rrweb.AbstractC1647b
                public final int hashCode() {
/* 75 */            return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f11631c, Integer.valueOf(this.f11633d), Long.valueOf(this.f11634e), Long.valueOf(this.f11635f), this.f11636i, this.f11637v, Integer.valueOf(this.f11638w), Integer.valueOf(this.f11623U), Integer.valueOf(this.f11624V), this.f11625W, Integer.valueOf(this.f11626X), Integer.valueOf(this.f11627Y), Integer.valueOf(this.f11628Z)});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("type");
/* 13 */            c1505c.m5297v(iLogger, this.f11588a);
/* 18 */            c1505c.m5291p("timestamp");
/* 23 */            c1505c.m5296u(this.f11589b);
/* 28 */            c1505c.m5291p(SharedDataContentProvider.BASE_PATH);
/* 31 */            c1505c.m5287i();
/* 36 */            c1505c.m5291p("tag");
/* 41 */            c1505c.m5300y(this.f11631c);
/* 46 */            c1505c.m5291p("payload");
/* 49 */            c1505c.m5287i();
/* 54 */            c1505c.m5291p("segmentId");
/* 60 */            c1505c.m5296u(this.f11633d);
/* 65 */            c1505c.m5291p("size");
/* 70 */            c1505c.m5296u(this.f11634e);
/* 75 */            c1505c.m5291p("duration");
/* 80 */            c1505c.m5296u(this.f11635f);
/* 85 */            c1505c.m5291p("encoding");
/* 90 */            c1505c.m5300y(this.f11636i);
/* 95 */            c1505c.m5291p("container");
/* 100 */           c1505c.m5300y(this.f11637v);
/* 105 */           c1505c.m5291p("height");
/* 111 */           c1505c.m5296u(this.f11638w);
/* 116 */           c1505c.m5291p("width");
/* 122 */           c1505c.m5296u(this.f11623U);
/* 127 */           c1505c.m5291p("frameCount");
/* 133 */           c1505c.m5296u(this.f11624V);
/* 138 */           c1505c.m5291p("frameRate");
/* 144 */           c1505c.m5296u(this.f11626X);
/* 149 */           c1505c.m5291p("frameRateType");
/* 154 */           c1505c.m5300y(this.f11625W);
/* 159 */           c1505c.m5291p("left");
/* 165 */           c1505c.m5296u(this.f11627Y);
/* 170 */           c1505c.m5291p("top");
/* 176 */           c1505c.m5296u(this.f11628Z);
/* 179 */           ConcurrentHashMap concurrentHashMap = this.f11630b0;
/* 181 */           if (concurrentHashMap != null) {
/* 195 */               for (String str : concurrentHashMap.keySet()) {
/* 205 */                   AbstractC0298j.m1863d(this.f11630b0, str, c1505c, str, iLogger);
                        }
                    }
/* 209 */           c1505c.m5288l();
/* 212 */           ConcurrentHashMap concurrentHashMap2 = this.f11632c0;
/* 214 */           if (concurrentHashMap2 != null) {
/* 228 */               for (String str2 : concurrentHashMap2.keySet()) {
/* 238 */                   AbstractC0298j.m1863d(this.f11632c0, str2, c1505c, str2, iLogger);
                        }
                    }
/* 242 */           c1505c.m5288l();
/* 245 */           HashMap map = this.f11629a0;
/* 247 */           if (map != null) {
/* 261 */               for (String str3 : map.keySet()) {
/* 271 */                   AbstractC0298j.m1862c(this.f11629a0, str3, c1505c, str3, iLogger);
                        }
                    }
/* 275 */           c1505c.m5288l();
                }
            }
