            package io.sentry;

            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            
            /* JADX INFO: renamed from: io.sentry.i7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1493i7 {

                /* JADX INFO: renamed from: a */
                public final C1554m6 f11014a;

                public C1493i7(C1554m6 c1554m6) {
/* 4 */             this.f11014a = c1554m6;
                }

                /* JADX INFO: renamed from: a */
                public final C1671t3 m5279a(C1505c c1505c) {
/* 4 */             Double d = (Double) c1505c.f11043c;
/* 8 */             C1522j7 c1522j7 = (C1522j7) c1505c.f11042b;
/* 10 */            C1671t3 c1671t3 = c1522j7.f10758d;
/* 12 */            if (c1671t3 != null) {
/* 14 */                return AbstractC1704c.m5447b(c1671t3);
                    }
/* 19 */            C1554m6 c1554m6 = this.f11014a;
/* 21 */            c1554m6.getProfilesSampler();
/* 24 */            Double profilesSampleRate = c1554m6.getProfilesSampleRate();
/* 47 */            Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= d.doubleValue());
/* 51 */            c1554m6.getTracesSampler();
/* 54 */            C1671t3 c1671t4 = c1522j7.f11075c0;
/* 56 */            if (c1671t4 != null) {
/* 58 */                return AbstractC1704c.m5447b(c1671t4);
                    }
/* 63 */            Double tracesSampleRate = c1554m6.getTracesSampleRate();
/* 92 */            Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, c1554m6.getBackpressureMonitor().mo5071a()));
/* 97 */            if (dValueOf != null) {
/* 119 */               return new C1671t3(Boolean.valueOf(dValueOf.doubleValue() >= d.doubleValue()), dValueOf, d, boolValueOf, profilesSampleRate);
                    }
/* 125 */           Boolean bool = Boolean.FALSE;
/* 130 */           return new C1671t3(bool, (Double) null, d, bool, (Double) null);
                }
            }
