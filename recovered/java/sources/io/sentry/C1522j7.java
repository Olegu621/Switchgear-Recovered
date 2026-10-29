            package io.sentry;

            import io.sentry.protocol.C1626w;
            import io.sentry.protocol.EnumC1606i0;
            import io.sentry.util.AbstractC1704c;
            
            /* JADX INFO: renamed from: io.sentry.j7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 51 */    public final class C1522j7 extends C1383b7 {

                /* JADX INFO: renamed from: d0 */
                public static final EnumC1606i0 f11072d0 = EnumC1606i0.CUSTOM;

                /* JADX INFO: renamed from: a0 */
                public String f11073a0;

                /* JADX INFO: renamed from: b0 */
                public EnumC1606i0 f11074b0;

                /* JADX INFO: renamed from: c0 */
                public final C1671t3 f11075c0;

                public C1522j7(String str, EnumC1606i0 enumC1606i0, String str2, C1671t3 c1671t3) {
/* 12 */            super(new C1626w(), new C1430d7(), str2, null);
/* 15 */            this.f11073a0 = str;
/* 17 */            this.f11074b0 = enumC1606i0;
/* 19 */            m5070a(c1671t3);
/* 50 */            this.f10752X = AbstractC1704c.m5452g(null, c1671t3 == null ? null : (Boolean) c1671t3.f11667a, c1671t3 == null ? null : (Double) c1671t3.f11668b, c1671t3 == null ? null : (Double) c1671t3.f11669c);
                }

                /* JADX INFO: renamed from: b */
                public static C1522j7 m5331b(C1671t3 c1671t3) {
                    C1671t3 c1671t4;
/* 3 */             Boolean bool = (Boolean) c1671t3.f11667a;
/* 8 */             C1387c c1387c = (C1387c) c1671t3.f11671e;
/* 10 */            Double d = c1387c.f10773c;
/* 12 */            if (bool == null) {
/* 15 */                c1671t4 = null;
                    } else {
/* 19 */                Double d2 = c1387c.f10774d;
/* 34 */                c1671t4 = new C1671t3(bool, d, Double.valueOf(d2 == null ? 0.0d : d2.doubleValue()));
                    }
/* 55 */            return new C1522j7((C1626w) c1671t3.f11668b, (C1430d7) c1671t3.f11669c, (C1430d7) c1671t3.f11670d, c1671t4, c1387c);
                }

/* 52 */        public C1522j7(C1626w c1626w, C1430d7 c1430d7, C1430d7 c1430d8, C1671t3 c1671t3, C1387c c1387c) {
/* 53 */            super(c1626w, c1430d7, "default", c1430d8);
/* 54 */            this.f11073a0 = "<unlabeled transaction>";
/* 55 */            this.f11075c0 = c1671t3;
/* 56 */            this.f11074b0 = f11072d0;
/* 61 */            this.f10752X = AbstractC1704c.m5452g(c1387c, c1671t3 == null ? null : (Boolean) c1671t3.f11667a, c1671t3 == null ? null : (Double) c1671t3.f11668b, c1671t3 != null ? (Double) c1671t3.f11669c : null);
                }
            }
