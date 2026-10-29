            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.Date;
            import java.util.TimeZone;
            import java.util.concurrent.ConcurrentHashMap;
            import p000.w20;
            
            /* JADX INFO: renamed from: io.sentry.protocol.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1603h implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public Boolean f11319U;

                /* JADX INFO: renamed from: V */
                public EnumC1601g f11320V;

                /* JADX INFO: renamed from: W */
                public Boolean f11321W;

                /* JADX INFO: renamed from: X */
                public Long f11322X;

                /* JADX INFO: renamed from: Y */
                public Long f11323Y;

                /* JADX INFO: renamed from: Z */
                public Long f11324Z;

                /* JADX INFO: renamed from: a */
                public String f11325a;

                /* JADX INFO: renamed from: a0 */
                public Boolean f11326a0;

                /* JADX INFO: renamed from: b */
                public String f11327b;

                /* JADX INFO: renamed from: b0 */
                public Long f11328b0;

                /* JADX INFO: renamed from: c */
                public String f11329c;

                /* JADX INFO: renamed from: c0 */
                public Long f11330c0;

                /* JADX INFO: renamed from: d */
                public String f11331d;

                /* JADX INFO: renamed from: d0 */
                public Long f11332d0;

                /* JADX INFO: renamed from: e */
                public String f11333e;

                /* JADX INFO: renamed from: e0 */
                public Long f11334e0;

                /* JADX INFO: renamed from: f */
                public String f11335f;

                /* JADX INFO: renamed from: f0 */
                public Integer f11336f0;

                /* JADX INFO: renamed from: g0 */
                public Integer f11337g0;

                /* JADX INFO: renamed from: h0 */
                public Float f11338h0;

                /* JADX INFO: renamed from: i */
                public String[] f11339i;

                /* JADX INFO: renamed from: i0 */
                public Integer f11340i0;

                /* JADX INFO: renamed from: j0 */
                public Date f11341j0;

                /* JADX INFO: renamed from: k0 */
                public TimeZone f11342k0;

                /* JADX INFO: renamed from: l0 */
                public String f11343l0;

                /* JADX INFO: renamed from: m0 */
                public String f11344m0;

                /* JADX INFO: renamed from: n0 */
                public String f11345n0;

                /* JADX INFO: renamed from: o0 */
                public Float f11346o0;

                /* JADX INFO: renamed from: p0 */
                public Integer f11347p0;

                /* JADX INFO: renamed from: q0 */
                public Double f11348q0;

                /* JADX INFO: renamed from: r0 */
                public String f11349r0;

                /* JADX INFO: renamed from: s0 */
                public String f11350s0;

                /* JADX INFO: renamed from: t0 */
                public ConcurrentHashMap f11351t0;

                /* JADX INFO: renamed from: v */
                public Float f11352v;

                /* JADX INFO: renamed from: w */
                public Boolean f11353w;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && C1603h.class == obj.getClass()) {
/* 18 */                C1603h c1603h = (C1603h) obj;
/* 28 */                if (AbstractC1704c.m5453h(this.f11325a, c1603h.f11325a) && AbstractC1704c.m5453h(this.f11327b, c1603h.f11327b) && AbstractC1704c.m5453h(this.f11329c, c1603h.f11329c) && AbstractC1704c.m5453h(this.f11331d, c1603h.f11331d) && AbstractC1704c.m5453h(this.f11333e, c1603h.f11333e) && AbstractC1704c.m5453h(this.f11335f, c1603h.f11335f) && Arrays.equals(this.f11339i, c1603h.f11339i) && AbstractC1704c.m5453h(this.f11352v, c1603h.f11352v) && AbstractC1704c.m5453h(this.f11353w, c1603h.f11353w) && AbstractC1704c.m5453h(this.f11319U, c1603h.f11319U) && this.f11320V == c1603h.f11320V && AbstractC1704c.m5453h(this.f11321W, c1603h.f11321W) && AbstractC1704c.m5453h(this.f11322X, c1603h.f11322X) && AbstractC1704c.m5453h(this.f11323Y, c1603h.f11323Y) && AbstractC1704c.m5453h(this.f11324Z, c1603h.f11324Z) && AbstractC1704c.m5453h(this.f11326a0, c1603h.f11326a0) && AbstractC1704c.m5453h(this.f11328b0, c1603h.f11328b0) && AbstractC1704c.m5453h(this.f11330c0, c1603h.f11330c0) && AbstractC1704c.m5453h(this.f11332d0, c1603h.f11332d0) && AbstractC1704c.m5453h(this.f11334e0, c1603h.f11334e0) && AbstractC1704c.m5453h(this.f11336f0, c1603h.f11336f0) && AbstractC1704c.m5453h(this.f11337g0, c1603h.f11337g0) && AbstractC1704c.m5453h(this.f11338h0, c1603h.f11338h0) && AbstractC1704c.m5453h(this.f11340i0, c1603h.f11340i0) && AbstractC1704c.m5453h(this.f11341j0, c1603h.f11341j0) && AbstractC1704c.m5453h(this.f11343l0, c1603h.f11343l0) && AbstractC1704c.m5453h(this.f11344m0, c1603h.f11344m0) && AbstractC1704c.m5453h(this.f11345n0, c1603h.f11345n0) && AbstractC1704c.m5453h(this.f11346o0, c1603h.f11346o0) && AbstractC1704c.m5453h(this.f11347p0, c1603h.f11347p0) && AbstractC1704c.m5453h(this.f11348q0, c1603h.f11348q0) && AbstractC1704c.m5453h(this.f11349r0, c1603h.f11349r0) && AbstractC1704c.m5453h(this.f11350s0, c1603h.f11350s0)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 161 */           return (Arrays.hashCode(new Object[]{this.f11325a, this.f11327b, this.f11329c, this.f11331d, this.f11333e, this.f11335f, this.f11352v, this.f11353w, this.f11319U, this.f11320V, this.f11321W, this.f11322X, this.f11323Y, this.f11324Z, this.f11326a0, this.f11328b0, this.f11330c0, this.f11332d0, this.f11334e0, this.f11336f0, this.f11337g0, this.f11338h0, this.f11340i0, this.f11341j0, this.f11342k0, this.f11343l0, this.f11344m0, this.f11345n0, this.f11346o0, this.f11347p0, this.f11348q0, this.f11349r0, this.f11350s0}) * 31) + Arrays.hashCode(this.f11339i);
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11325a != null) {
/* 12 */                c1505c.m5291p("name");
/* 17 */                c1505c.m5300y(this.f11325a);
                    }
/* 22 */            if (this.f11327b != null) {
/* 26 */                c1505c.m5291p("manufacturer");
/* 31 */                c1505c.m5300y(this.f11327b);
                    }
/* 36 */            if (this.f11329c != null) {
/* 40 */                c1505c.m5291p("brand");
/* 45 */                c1505c.m5300y(this.f11329c);
                    }
/* 50 */            if (this.f11331d != null) {
/* 54 */                c1505c.m5291p("family");
/* 59 */                c1505c.m5300y(this.f11331d);
                    }
/* 64 */            if (this.f11333e != null) {
/* 68 */                c1505c.m5291p("model");
/* 73 */                c1505c.m5300y(this.f11333e);
                    }
/* 78 */            if (this.f11335f != null) {
/* 82 */                c1505c.m5291p("model_id");
/* 87 */                c1505c.m5300y(this.f11335f);
                    }
/* 92 */            if (this.f11339i != null) {
/* 96 */                c1505c.m5291p("archs");
/* 101 */               c1505c.m5297v(iLogger, this.f11339i);
                    }
/* 106 */           if (this.f11352v != null) {
/* 110 */               c1505c.m5291p("battery_level");
/* 115 */               c1505c.m5299x(this.f11352v);
                    }
/* 120 */           if (this.f11353w != null) {
/* 124 */               c1505c.m5291p("charging");
/* 129 */               c1505c.m5298w(this.f11353w);
                    }
/* 134 */           if (this.f11319U != null) {
/* 138 */               c1505c.m5291p(w20.ONLINE_EXTRAS_KEY);
/* 143 */               c1505c.m5298w(this.f11319U);
                    }
/* 148 */           if (this.f11320V != null) {
/* 152 */               c1505c.m5291p("orientation");
/* 157 */               c1505c.m5297v(iLogger, this.f11320V);
                    }
/* 162 */           if (this.f11321W != null) {
/* 166 */               c1505c.m5291p("simulator");
/* 171 */               c1505c.m5298w(this.f11321W);
                    }
/* 176 */           if (this.f11322X != null) {
/* 180 */               c1505c.m5291p("memory_size");
/* 185 */               c1505c.m5299x(this.f11322X);
                    }
/* 190 */           if (this.f11323Y != null) {
/* 194 */               c1505c.m5291p("free_memory");
/* 199 */               c1505c.m5299x(this.f11323Y);
                    }
/* 204 */           if (this.f11324Z != null) {
/* 208 */               c1505c.m5291p("usable_memory");
/* 213 */               c1505c.m5299x(this.f11324Z);
                    }
/* 218 */           if (this.f11326a0 != null) {
/* 222 */               c1505c.m5291p("low_memory");
/* 227 */               c1505c.m5298w(this.f11326a0);
                    }
/* 232 */           if (this.f11328b0 != null) {
/* 236 */               c1505c.m5291p("storage_size");
/* 241 */               c1505c.m5299x(this.f11328b0);
                    }
/* 246 */           if (this.f11330c0 != null) {
/* 250 */               c1505c.m5291p("free_storage");
/* 255 */               c1505c.m5299x(this.f11330c0);
                    }
/* 260 */           if (this.f11332d0 != null) {
/* 264 */               c1505c.m5291p("external_storage_size");
/* 269 */               c1505c.m5299x(this.f11332d0);
                    }
/* 274 */           if (this.f11334e0 != null) {
/* 278 */               c1505c.m5291p("external_free_storage");
/* 283 */               c1505c.m5299x(this.f11334e0);
                    }
/* 288 */           if (this.f11336f0 != null) {
/* 292 */               c1505c.m5291p("screen_width_pixels");
/* 297 */               c1505c.m5299x(this.f11336f0);
                    }
/* 302 */           if (this.f11337g0 != null) {
/* 306 */               c1505c.m5291p("screen_height_pixels");
/* 311 */               c1505c.m5299x(this.f11337g0);
                    }
/* 316 */           if (this.f11338h0 != null) {
/* 320 */               c1505c.m5291p("screen_density");
/* 325 */               c1505c.m5299x(this.f11338h0);
                    }
/* 330 */           if (this.f11340i0 != null) {
/* 334 */               c1505c.m5291p("screen_dpi");
/* 339 */               c1505c.m5299x(this.f11340i0);
                    }
/* 344 */           if (this.f11341j0 != null) {
/* 348 */               c1505c.m5291p("boot_time");
/* 353 */               c1505c.m5297v(iLogger, this.f11341j0);
                    }
/* 358 */           if (this.f11342k0 != null) {
/* 362 */               c1505c.m5291p("timezone");
/* 367 */               c1505c.m5297v(iLogger, this.f11342k0);
                    }
/* 372 */           if (this.f11343l0 != null) {
/* 376 */               c1505c.m5291p("id");
/* 381 */               c1505c.m5300y(this.f11343l0);
                    }
/* 386 */           if (this.f11345n0 != null) {
/* 390 */               c1505c.m5291p("connection_type");
/* 395 */               c1505c.m5300y(this.f11345n0);
                    }
/* 400 */           if (this.f11346o0 != null) {
/* 404 */               c1505c.m5291p("battery_temperature");
/* 409 */               c1505c.m5299x(this.f11346o0);
                    }
/* 414 */           if (this.f11344m0 != null) {
/* 418 */               c1505c.m5291p("locale");
/* 423 */               c1505c.m5300y(this.f11344m0);
                    }
/* 428 */           if (this.f11347p0 != null) {
/* 432 */               c1505c.m5291p("processor_count");
/* 437 */               c1505c.m5299x(this.f11347p0);
                    }
/* 442 */           if (this.f11348q0 != null) {
/* 446 */               c1505c.m5291p("processor_frequency");
/* 451 */               c1505c.m5299x(this.f11348q0);
                    }
/* 456 */           if (this.f11349r0 != null) {
/* 460 */               c1505c.m5291p("cpu_description");
/* 465 */               c1505c.m5300y(this.f11349r0);
                    }
/* 470 */           if (this.f11350s0 != null) {
/* 474 */               c1505c.m5291p("chipset");
/* 479 */               c1505c.m5300y(this.f11350s0);
                    }
/* 482 */           ConcurrentHashMap concurrentHashMap = this.f11351t0;
/* 484 */           if (concurrentHashMap != null) {
/* 498 */               for (String str : concurrentHashMap.keySet()) {
/* 508 */                   AbstractC0298j.m1863d(this.f11351t0, str, c1505c, str, iLogger);
                        }
                    }
/* 512 */           c1505c.m5288l();
                }
            }
