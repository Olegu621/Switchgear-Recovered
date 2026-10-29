            package io.sentry;

            import io.sentry.android.core.EnumC1164a0;
            import io.sentry.protocol.C1593c;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.AbstractC1704c;
            import java.io.Serializable;
            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: io.sentry.t3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 32 */    public final class C1671t3 {

                /* JADX INFO: renamed from: a */
                public final Serializable f11667a;

                /* JADX INFO: renamed from: b */
                public final Object f11668b;

                /* JADX INFO: renamed from: c */
                public final Object f11669c;

                /* JADX INFO: renamed from: d */
                public final Object f11670d;

                /* JADX INFO: renamed from: e */
                public final Object f11671e;

                public C1671t3(Boolean bool, Double d, Double d2, Boolean bool2, Double d3) {
/* 4 */             this.f11667a = bool;
/* 6 */             this.f11668b = d;
/* 8 */             this.f11669c = d2;
/* 29 */            this.f11670d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
/* 31 */            this.f11671e = d3;
                }

                /* JADX INFO: renamed from: a */
                public static C1671t3 m5410a(C1674t6 c1674t6, C1387c c1387c, C1554m6 c1554m6) {
/* 1 */             if (c1554m6 != null) {
/* 3 */                 String effectiveOrgId = c1554m6.getEffectiveOrgId();
/* 9 */                 String strM5075b = c1387c.m5075b("sentry-org_id");
/* 30 */                String strTrim = (strM5075b == null || strM5075b.trim().isEmpty()) ? null : strM5075b.trim();
/* 31 */                if ((effectiveOrgId != null && strTrim != null && !effectiveOrgId.equals(strTrim)) || (c1554m6.isStrictTraceContinuation() && ((effectiveOrgId != null || strTrim != null) && (effectiveOrgId == null || !effectiveOrgId.equals(strTrim))))) {
/* 73 */                    c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "Not continuing trace due to strict org ID validation failure.", new Object[0]);
/* 78 */                    return new C1671t3();
                        }
                    }
/* 96 */            return new C1671t3(c1674t6.f11675a, new C1430d7(), c1674t6.f11676b, c1387c, c1674t6.f11677c);
                }

/* 33 */        public C1671t3(Boolean bool, Double d, Double d2) {
/* 34 */            this(bool, d, d2, Boolean.FALSE, (Double) null);
                }

/* 34 */        public C1671t3(Boolean bool, Double d) {
/* 35 */            this(bool, d, (Double) null, Boolean.FALSE, (Double) null);
                }

/* 35 */        public C1671t3() {
/* 40 */            this(new C1626w(), new C1430d7(), (C1430d7) null, (C1387c) null, (Boolean) null);
                }

/* 40 */        public C1671t3(C1626w c1626w, C1430d7 c1430d7, C1430d7 c1430d8, C1387c c1387c, Boolean bool) {
/* 42 */            this.f11668b = c1626w;
/* 43 */            this.f11669c = c1430d7;
/* 44 */            this.f11670d = c1430d8;
/* 45 */            this.f11671e = AbstractC1704c.m5452g(c1387c, bool, null, null);
/* 46 */            this.f11667a = bool;
                }

/* 46 */        public C1671t3(C1671t3 c1671t3) {
/* 52 */            this((C1626w) c1671t3.f11668b, (C1430d7) c1671t3.f11669c, (C1430d7) c1671t3.f11670d, (C1387c) c1671t3.f11671e, (Boolean) c1671t3.f11667a);
                }

/* 52 */        public C1671t3(EnumC1164a0 enumC1164a0) {
/* 54 */            this.f11668b = enumC1164a0;
/* 55 */            this.f11669c = null;
/* 56 */            this.f11670d = null;
/* 57 */            this.f11667a = null;
/* 58 */            this.f11671e = null;
                }

/* 58 */        public C1671t3(EnumC1164a0 enumC1164a0, byte[] bArr) {
/* 60 */            this.f11668b = enumC1164a0;
/* 61 */            this.f11669c = bArr;
/* 62 */            this.f11670d = null;
/* 63 */            this.f11667a = null;
/* 64 */            this.f11671e = null;
                }

/* 64 */        public C1671t3(EnumC1164a0 enumC1164a0, byte[] bArr, ArrayList arrayList, ArrayList arrayList2, C1593c c1593c) {
/* 66 */            this.f11668b = enumC1164a0;
/* 67 */            this.f11669c = bArr;
/* 68 */            this.f11670d = arrayList;
/* 69 */            this.f11667a = arrayList2;
/* 70 */            this.f11671e = c1593c;
                }
            }
