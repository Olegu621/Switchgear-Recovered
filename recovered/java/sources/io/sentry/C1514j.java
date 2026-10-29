            package io.sentry;

            import io.sentry.protocol.C1589a;
            import io.sentry.protocol.C1595d;
            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1602g0;
            import io.sentry.protocol.C1603h;
            import io.sentry.protocol.C1607j;
            import io.sentry.protocol.C1613m;
            import io.sentry.protocol.C1620q;
            import io.sentry.protocol.C1622s;
            import io.sentry.protocol.C1628y;
            import java.io.IOException;
            import java.util.Enumeration;
            import java.util.Set;
            
            /* JADX INFO: renamed from: io.sentry.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1514j extends C1597e {

                /* JADX INFO: renamed from: c */
                public final C1597e f11060c;

                /* JADX INFO: renamed from: d */
                public final C1597e f11061d;

                /* JADX INFO: renamed from: e */
                public final C1597e f11062e;

                /* JADX INFO: renamed from: f */
                public final EnumC1448f4 f11063f;

                public C1514j(C1597e c1597e, C1597e c1597e2, C1597e c1597e3, EnumC1448f4 enumC1448f4) {
/* 4 */             this.f11060c = c1597e;
/* 6 */             this.f11061d = c1597e2;
/* 8 */             this.f11062e = c1597e3;
/* 10 */            this.f11063f = enumC1448f4;
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: a */
                public final boolean mo5305a(Object obj) {
                    throw null;
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: b */
                public final Set mo5306b() {
/* 7 */             return m5328y().f11294a.entrySet();
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: c */
                public final Object mo5307c(Object obj) {
/* 3 */             Object objMo5307c = this.f11062e.mo5307c(obj);
/* 7 */             if (objMo5307c != null) {
/* 9 */                 return objMo5307c;
                    }
/* 12 */            Object objMo5307c2 = this.f11061d.mo5307c(obj);
                    return objMo5307c2 != null ? objMo5307c2 : this.f11060c.mo5307c(obj);
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: d */
                public final C1589a mo5308d() {
/* 3 */             C1589a c1589aMo5308d = this.f11062e.mo5308d();
/* 7 */             if (c1589aMo5308d != null) {
/* 9 */                 return c1589aMo5308d;
                    }
/* 12 */            C1589a c1589aMo5308d2 = this.f11061d.mo5308d();
                    return c1589aMo5308d2 != null ? c1589aMo5308d2 : this.f11060c.mo5308d();
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: e */
                public final C1603h mo5309e() {
/* 3 */             C1603h c1603hMo5309e = this.f11062e.mo5309e();
/* 7 */             if (c1603hMo5309e != null) {
/* 9 */                 return c1603hMo5309e;
                    }
/* 12 */            C1603h c1603hMo5309e2 = this.f11061d.mo5309e();
                    return c1603hMo5309e2 != null ? c1603hMo5309e2 : this.f11060c.mo5309e();
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: f */
                public final C1607j mo5310f() {
/* 3 */             C1607j c1607jMo5310f = this.f11062e.mo5310f();
/* 7 */             if (c1607jMo5310f != null) {
/* 9 */                 return c1607jMo5310f;
                    }
/* 12 */            C1607j c1607jMo5310f2 = this.f11061d.mo5310f();
                    return c1607jMo5310f2 != null ? c1607jMo5310f2 : this.f11060c.mo5310f();
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: g */
                public final C1620q mo5311g() {
/* 3 */             C1620q c1620qMo5311g = this.f11062e.mo5311g();
/* 7 */             if (c1620qMo5311g != null) {
/* 9 */                 return c1620qMo5311g;
                    }
/* 12 */            C1620q c1620qMo5311g2 = this.f11061d.mo5311g();
                    return c1620qMo5311g2 != null ? c1620qMo5311g2 : this.f11060c.mo5311g();
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: h */
                public final C1628y mo5312h() {
/* 3 */             C1628y c1628yMo5312h = this.f11062e.mo5312h();
/* 7 */             if (c1628yMo5312h != null) {
/* 9 */                 return c1628yMo5312h;
                    }
/* 12 */            C1628y c1628yMo5312h2 = this.f11061d.mo5312h();
                    return c1628yMo5312h2 != null ? c1628yMo5312h2 : this.f11060c.mo5312h();
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: i */
                public final C1383b7 mo5313i() {
/* 3 */             C1383b7 c1383b7Mo5313i = this.f11062e.mo5313i();
/* 7 */             if (c1383b7Mo5313i != null) {
/* 9 */                 return c1383b7Mo5313i;
                    }
/* 12 */            C1383b7 c1383b7Mo5313i2 = this.f11061d.mo5313i();
                    return c1383b7Mo5313i2 != null ? c1383b7Mo5313i2 : this.f11060c.mo5313i();
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: j */
                public final Enumeration mo5314j() {
/* 7 */             return m5328y().f11294a.keys();
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: k */
                public final Object mo5315k(Object obj, String str) {
/* 5 */             return m5327x().mo5315k(obj, str);
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: l */
                public final void mo5316l(C1597e c1597e) {
                    throw null;
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: m */
                public final void mo5317m(C1589a c1589a) {
/* 5 */             m5327x().mo5317m(c1589a);
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: n */
                public final void mo5318n(C1595d c1595d) {
/* 5 */             m5327x().mo5318n(c1595d);
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: o */
                public final void mo5319o(C1603h c1603h) {
/* 5 */             m5327x().mo5319o(c1603h);
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: p */
                public final void mo5320p(C1607j c1607j) {
                    throw null;
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: q */
                public final void mo5321q(C1613m c1613m) {
/* 5 */             m5327x().mo5321q(c1613m);
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: r */
                public final void mo5322r(C1620q c1620q) {
/* 5 */             m5327x().mo5322r(c1620q);
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: s */
                public final void mo5323s(C1622s c1622s) {
/* 5 */             m5327x().mo5323s(c1622s);
                }

                @Override // io.sentry.protocol.C1597e, io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 5 */             m5328y().serialize(interfaceC1518j3, iLogger);
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: t */
                public final void mo5324t(C1628y c1628y) {
/* 5 */             m5327x().mo5324t(c1628y);
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: u */
                public final void mo5325u(C1602g0 c1602g0) {
/* 5 */             m5327x().mo5325u(c1602g0);
                }

                @Override // io.sentry.protocol.C1597e
                /* JADX INFO: renamed from: v */
                public final void mo5326v(C1383b7 c1383b7) {
/* 5 */             m5327x().mo5326v(c1383b7);
                }

                /* JADX INFO: renamed from: x */
                public final C1597e m5327x() {
/* 9 */             int i = AbstractC1485i.f10999a[this.f11063f.ordinal()];
/* 12 */            C1597e c1597e = this.f11062e;
/* 14 */            if (i == 1) {
/* 29 */                return c1597e;
                    }
/* 17 */            if (i != 2) {
                        return i != 3 ? c1597e : this.f11060c;
                    }
/* 26 */            return this.f11061d;
                }

                /* JADX INFO: renamed from: y */
                public final C1597e m5328y() {
/* 3 */             C1597e c1597e = new C1597e();
/* 8 */             c1597e.mo5316l(this.f11060c);
/* 13 */            c1597e.mo5316l(this.f11061d);
/* 18 */            c1597e.mo5316l(this.f11062e);
/* 21 */            return c1597e;
                }
            }
