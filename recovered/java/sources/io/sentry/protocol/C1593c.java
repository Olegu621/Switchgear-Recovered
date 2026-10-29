            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1593c implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public Long f11273U;

                /* JADX INFO: renamed from: V */
                public Long f11274V;

                /* JADX INFO: renamed from: W */
                public ConcurrentHashMap f11275W;

                /* JADX INFO: renamed from: a */
                public Long f11276a;

                /* JADX INFO: renamed from: b */
                public Double f11277b;

                /* JADX INFO: renamed from: c */
                public Long f11278c;

                /* JADX INFO: renamed from: d */
                public Double f11279d;

                /* JADX INFO: renamed from: e */
                public Long f11280e;

                /* JADX INFO: renamed from: f */
                public Double f11281f;

                /* JADX INFO: renamed from: i */
                public Long f11282i;

                /* JADX INFO: renamed from: v */
                public Long f11283v;

                /* JADX INFO: renamed from: w */
                public Long f11284w;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && C1593c.class == obj.getClass()) {
/* 17 */                C1593c c1593c = (C1593c) obj;
/* 27 */                if (AbstractC1704c.m5453h(this.f11276a, c1593c.f11276a) && AbstractC1704c.m5453h(this.f11277b, c1593c.f11277b) && AbstractC1704c.m5453h(this.f11278c, c1593c.f11278c) && AbstractC1704c.m5453h(this.f11279d, c1593c.f11279d) && AbstractC1704c.m5453h(this.f11280e, c1593c.f11280e) && AbstractC1704c.m5453h(this.f11281f, c1593c.f11281f) && AbstractC1704c.m5453h(this.f11282i, c1593c.f11282i) && AbstractC1704c.m5453h(this.f11283v, c1593c.f11283v) && AbstractC1704c.m5453h(this.f11284w, c1593c.f11284w) && AbstractC1704c.m5453h(this.f11273U, c1593c.f11273U) && AbstractC1704c.m5453h(this.f11274V, c1593c.f11274V)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 27 */            return Arrays.hashCode(new Object[]{this.f11276a, this.f11277b, this.f11278c, this.f11279d, this.f11280e, this.f11281f, this.f11282i, this.f11283v, this.f11284w, this.f11273U, this.f11274V});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11276a != null) {
/* 12 */                c1505c.m5291p("gc.total_count");
/* 17 */                c1505c.m5299x(this.f11276a);
                    }
/* 22 */            if (this.f11277b != null) {
/* 26 */                c1505c.m5291p("gc.total_time");
/* 31 */                c1505c.m5299x(this.f11277b);
                    }
/* 36 */            if (this.f11278c != null) {
/* 40 */                c1505c.m5291p("gc.blocking_count");
/* 45 */                c1505c.m5299x(this.f11278c);
                    }
/* 50 */            if (this.f11279d != null) {
/* 54 */                c1505c.m5291p("gc.blocking_time");
/* 59 */                c1505c.m5299x(this.f11279d);
                    }
/* 64 */            if (this.f11280e != null) {
/* 68 */                c1505c.m5291p("gc.pre_oome_count");
/* 73 */                c1505c.m5299x(this.f11280e);
                    }
/* 78 */            if (this.f11281f != null) {
/* 82 */                c1505c.m5291p("gc.waiting_time");
/* 87 */                c1505c.m5299x(this.f11281f);
                    }
/* 92 */            if (this.f11282i != null) {
/* 96 */                c1505c.m5291p("memory.free");
/* 101 */               c1505c.m5299x(this.f11282i);
                    }
/* 106 */           if (this.f11283v != null) {
/* 110 */               c1505c.m5291p("memory.free_until_gc");
/* 115 */               c1505c.m5299x(this.f11283v);
                    }
/* 120 */           if (this.f11284w != null) {
/* 124 */               c1505c.m5291p("memory.free_until_oome");
/* 129 */               c1505c.m5299x(this.f11284w);
                    }
/* 134 */           if (this.f11273U != null) {
/* 138 */               c1505c.m5291p("memory.total");
/* 143 */               c1505c.m5299x(this.f11273U);
                    }
/* 148 */           if (this.f11274V != null) {
/* 152 */               c1505c.m5291p("memory.max");
/* 157 */               c1505c.m5299x(this.f11274V);
                    }
/* 160 */           ConcurrentHashMap concurrentHashMap = this.f11275W;
/* 162 */           if (concurrentHashMap != null) {
/* 176 */               for (String str : concurrentHashMap.keySet()) {
/* 186 */                   AbstractC0298j.m1863d(this.f11275W, str, c1505c, str, iLogger);
                        }
                    }
/* 190 */           c1505c.m5288l();
                }
            }
