            package io.sentry;

            import io.sentry.featureflags.C1454c;
            import io.sentry.featureflags.InterfaceC1453b;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1607j;
            import io.sentry.protocol.C1608j0;
            import io.sentry.protocol.C1621r;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.C1708g;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Queue;
            
            /* JADX INFO: renamed from: io.sentry.v2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 2 */     public final class C1724v2 implements InterfaceC1156a1 {

                /* JADX INFO: renamed from: b */
                public static final C1724v2 f11758b = new C1724v2();

                /* JADX INFO: renamed from: a */
                public final C1708g f11759a = new C1708g(new C1697u2(0));

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: A */
                public final List mo4677A() {
/* 3 */             return new ArrayList();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: B */
                public final List mo4678B() {
/* 3 */             return new ArrayList();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: C */
                public final void mo4679C(C1393c5 c1393c5) {
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: D */
                public final C1597e mo4680D() {
/* 3 */             return new C1597e();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: E */
                public final C1671t3 mo4681E(InterfaceC1753y3 interfaceC1753y3) {
/* 3 */             return new C1671t3();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: F */
                public final String mo4682F() {
/* 1 */             return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: G */
                public final void mo4683G(InterfaceC1159a4 interfaceC1159a4) {
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: H */
                public final void mo4684H(C1626w c1626w) {
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: I */
                public final void mo4685I(InterfaceC1549m1 interfaceC1549m1) {
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: J */
                public final List mo4686J() {
/* 3 */             return new ArrayList();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: K */
                public final C1608j0 mo4687K() {
/* 1 */             return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: L */
                public final C1621r mo4688L() {
/* 1 */             return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: M */
                public final List mo4689M() {
/* 3 */             return new ArrayList();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: N */
                public final String mo4690N() {
/* 1 */             return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: O */
                public final void mo4691O(C1671t3 c1671t3) {
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: c */
                public final void mo4692c(Throwable th, C1162a7 c1162a7, String str) {
                }

                @Override // io.sentry.InterfaceC1156a1
                public final void clear() {
                }

                @Override // io.sentry.InterfaceC1156a1
                public final InterfaceC1156a1 clone() {
/* 1 */             return f11758b;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: f */
                public final void mo4693f(C1443f c1443f, C1486i0 c1486i0) {
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: g */
                public final InterfaceC1525k1 mo4694g() {
/* 1 */             return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                public final Map getAttributes() {
/* 3 */             return new HashMap();
                }

                @Override // io.sentry.InterfaceC1156a1
                public final Map getExtras() {
/* 3 */             return new HashMap();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: h */
                public final C1607j mo4695h() {
/* 1 */             return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: i */
                public final C1626w mo4696i() {
/* 1 */             return C1626w.f11478b;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: j */
                public final void mo4697j(C1154a c1154a) {
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: k */
                public final void mo4698k(C1626w c1626w) {
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: l */
                public final C1554m6 mo4699l() {
/* 7 */             return (C1554m6) this.f11759a.m5471a();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: m */
                public final InterfaceC1549m1 mo4700m() {
/* 1 */             return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: n */
                public final C1764z6 mo4701n() {
/* 1 */             return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: o */
                public final C1505c mo4702o() {
/* 1 */             return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: p */
                public final void mo4703p() {
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: q */
                public final InterfaceC1453b mo4704q() {
/* 1 */             return C1454c.f10945a;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: r */
                public final C1764z6 mo4705r() {
/* 1 */             return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: s */
                public final Queue mo4706s() {
/* 3 */             return new ArrayDeque();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: t */
                public final EnumC1553m5 mo4707t() {
/* 1 */             return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: u */
                public final C1671t3 mo4708u() {
/* 3 */             return new C1671t3();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: v */
                public final C1764z6 mo4709v(InterfaceC1761z3 interfaceC1761z3) {
/* 1 */             return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: x */
                public final void mo4710x(String str) {
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: y */
                public final InterfaceC1445f1 mo4711y() {
/* 1 */             return C1760z2.f11849a;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: z */
                public final Map mo4712z() {
/* 3 */             return new HashMap();
                }

                /* JADX INFO: renamed from: clone, reason: collision with other method in class */
/* 3 */         public final Object m10498clone() {
/* 4 */             return f11758b;
                }
            }
