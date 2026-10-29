            package io.sentry;

            import io.sentry.protocol.C1624u;
            import io.sentry.util.AbstractC1704c;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedHashSet;
            import java.util.List;
            import p000.AbstractC2211ta;
            
            /* JADX INFO: renamed from: io.sentry.q6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1637q6 extends AbstractC2211ta {

                /* JADX INFO: renamed from: u */
                public static final List f11525u = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));

                /* JADX INFO: renamed from: c */
                public volatile boolean f11526c;

                /* JADX INFO: renamed from: d */
                public Double f11527d;

                /* JADX INFO: renamed from: e */
                public Double f11528e;

                /* JADX INFO: renamed from: f */
                public EnumC1584p6 f11529f;

                /* JADX INFO: renamed from: g */
                public int f11530g;

                /* JADX INFO: renamed from: h */
                public long f11531h;

                /* JADX INFO: renamed from: i */
                public long f11532i;

                /* JADX INFO: renamed from: j */
                public long f11533j;

                /* JADX INFO: renamed from: k */
                public boolean f11534k;

                /* JADX INFO: renamed from: l */
                public C1624u f11535l;

                /* JADX INFO: renamed from: m */
                public boolean f11536m;

                /* JADX INFO: renamed from: n */
                public EnumC1490i4 f11537n;

                /* JADX INFO: renamed from: o */
                public boolean f11538o;

                /* JADX INFO: renamed from: p */
                public List f11539p;

                /* JADX INFO: renamed from: q */
                public List f11540q;

                /* JADX INFO: renamed from: r */
                public boolean f11541r;

                /* JADX INFO: renamed from: s */
                public List f11542s;

                /* JADX INFO: renamed from: t */
                public List f11543t;

                /* JADX INFO: renamed from: A */
                public final void m5384A(boolean z) {
/* 1 */             this.f11538o = z;
                }

                /* JADX INFO: renamed from: B */
                public final void m5385B(boolean z) {
/* 1 */             this.f11536m = z;
                }

                /* JADX INFO: renamed from: C */
                public final void m5386C(boolean z) {
/* 1 */             this.f11541r = z;
                }

                /* JADX INFO: renamed from: D */
                public final void m5387D(ArrayList arrayList) {
/* 10 */            this.f11539p = Collections.unmodifiableList(new ArrayList(arrayList));
                }

                /* JADX INFO: renamed from: E */
                public final void m5388E(ArrayList arrayList) {
/* 10 */            this.f11540q = Collections.unmodifiableList(new ArrayList(arrayList));
                }

                /* JADX INFO: renamed from: F */
                public final void m5389F(ArrayList arrayList) {
/* 3 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 8 */             linkedHashSet.addAll(f11525u);
/* 11 */            linkedHashSet.addAll(arrayList);
/* 23 */            this.f11542s = Collections.unmodifiableList(new ArrayList(linkedHashSet));
                }

                /* JADX INFO: renamed from: G */
                public final void m5390G(ArrayList arrayList) {
/* 3 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 8 */             linkedHashSet.addAll(f11525u);
/* 11 */            linkedHashSet.addAll(arrayList);
/* 23 */            this.f11543t = Collections.unmodifiableList(new ArrayList(linkedHashSet));
                }

                /* JADX INFO: renamed from: H */
                public final void m5391H(Double d) {
/* 6 */             if (AbstractC1704c.m5457l(d, true)) {
/* 8 */                 this.f11528e = d;
                    } else {
/* 15 */                C1697u2.m5435k(d, "The value ", " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
                    }
                }

                /* JADX INFO: renamed from: I */
                public final void m5392I(Double d) {
/* 6 */             if (AbstractC1704c.m5457l(d, true)) {
/* 8 */                 this.f11527d = d;
                    } else {
/* 15 */                C1697u2.m5435k(d, "The value ", " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
                    }
                }

                @Override // p000.AbstractC2211ta
                /* JADX INFO: renamed from: o */
                public final void mo4869o(boolean z) {
/* 1 */             if (!z) {
/* 3 */                 mo4870r();
                    }
/* 6 */             super.mo4869o(z);
                }

                @Override // p000.AbstractC2211ta
                /* JADX INFO: renamed from: p */
                public final void mo5393p(boolean z) {
/* 1 */             if (!z) {
/* 3 */                 mo4870r();
                    }
/* 6 */             super.mo5393p(z);
                }

                @Override // p000.AbstractC2211ta
                /* JADX INFO: renamed from: r */
                public final void mo4870r() {
/* 3 */             if (this.f11526c) {
/* 13 */                return;
                    }
/* 6 */             this.f11526c = true;
/* 10 */            AbstractC1704c.m5446a("ReplayCustomMasking");
                }

                /* JADX INFO: renamed from: s */
                public final List m5394s() {
/* 1 */             return this.f11539p;
                }

                /* JADX INFO: renamed from: t */
                public final List m5395t() {
/* 1 */             return this.f11540q;
                }

                /* JADX INFO: renamed from: u */
                public final List m5396u() {
/* 1 */             return this.f11542s;
                }

                /* JADX INFO: renamed from: v */
                public final List m5397v() {
/* 1 */             return this.f11543t;
                }

                /* JADX INFO: renamed from: w */
                public final Double m5398w() {
/* 1 */             return this.f11528e;
                }

                /* JADX INFO: renamed from: x */
                public final Double m5399x() {
/* 1 */             return this.f11527d;
                }

                /* JADX INFO: renamed from: y */
                public final boolean m5400y() {
/* 1 */             return this.f11538o;
                }

                /* JADX INFO: renamed from: z */
                public final boolean m5401z() {
/* 1 */             return this.f11541r;
                }
            }
