            package io.sentry;

            import io.sentry.config.AbstractC1417a;
            import io.sentry.featureflags.C1452a;
            import io.sentry.featureflags.C1454c;
            import io.sentry.featureflags.InterfaceC1453b;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1589a;
            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1607j;
            import io.sentry.protocol.C1608j0;
            import io.sentry.protocol.C1621r;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1711j;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Queue;
            import java.util.WeakHashMap;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            
            /* JADX INFO: renamed from: io.sentry.b4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public final class C1380b4 implements InterfaceC1156a1 {

                /* JADX INFO: renamed from: a */
                public InterfaceC1549m1 f10717a;

                /* JADX INFO: renamed from: b */
                public final WeakReference f10718b;

                /* JADX INFO: renamed from: c */
                public C1608j0 f10719c;

                /* JADX INFO: renamed from: d */
                public String f10720d;

                /* JADX INFO: renamed from: e */
                public C1621r f10721e;

                /* JADX INFO: renamed from: f */
                public final ArrayList f10722f;

                /* JADX INFO: renamed from: g */
                public volatile Queue f10723g;

                /* JADX INFO: renamed from: h */
                public final ConcurrentHashMap f10724h;

                /* JADX INFO: renamed from: i */
                public final ConcurrentHashMap f10725i;

                /* JADX INFO: renamed from: j */
                public final ConcurrentHashMap f10726j;

                /* JADX INFO: renamed from: k */
                public final CopyOnWriteArrayList f10727k;

                /* JADX INFO: renamed from: l */
                public volatile C1554m6 f10728l;

                /* JADX INFO: renamed from: m */
                public volatile C1764z6 f10729m;

                /* JADX INFO: renamed from: n */
                public final C1702a f10730n;

                /* JADX INFO: renamed from: o */
                public final C1702a f10731o;

                /* JADX INFO: renamed from: p */
                public final C1702a f10732p;

                /* JADX INFO: renamed from: q */
                public final C1597e f10733q;

                /* JADX INFO: renamed from: r */
                public final CopyOnWriteArrayList f10734r;

                /* JADX INFO: renamed from: s */
                public C1671t3 f10735s;

                /* JADX INFO: renamed from: t */
                public C1626w f10736t;

                /* JADX INFO: renamed from: u */
                public InterfaceC1445f1 f10737u;

                /* JADX INFO: renamed from: v */
                public final Map f10738v;

                /* JADX INFO: renamed from: w */
                public final InterfaceC1453b f10739w;

                public C1380b4(C1380b4 c1380b4) {
                    C1608j0 c1608j0;
                    C1621r c1621r;
/* 10 */            this.f10718b = new WeakReference(null);
/* 17 */            this.f10722f = new ArrayList();
/* 24 */            this.f10724h = new ConcurrentHashMap();
/* 31 */            this.f10725i = new ConcurrentHashMap();
/* 38 */            this.f10726j = new ConcurrentHashMap();
/* 45 */            this.f10727k = new CopyOnWriteArrayList();
/* 52 */            this.f10730n = new C1702a();
/* 59 */            this.f10731o = new C1702a();
/* 66 */            this.f10732p = new C1702a();
/* 73 */            this.f10733q = new C1597e();
/* 80 */            this.f10734r = new CopyOnWriteArrayList();
/* 84 */            this.f10736t = C1626w.f11478b;
/* 88 */            this.f10737u = C1760z2.f11849a;
/* 99 */            this.f10738v = Collections.synchronizedMap(new WeakHashMap());
/* 103 */           this.f10717a = c1380b4.f10717a;
/* 107 */           this.f10718b = c1380b4.f10718b;
/* 111 */           this.f10729m = c1380b4.f10729m;
/* 115 */           this.f10728l = c1380b4.f10728l;
/* 119 */           this.f10737u = c1380b4.f10737u;
/* 121 */           C1608j0 c1608j1 = c1380b4.f10719c;
/* 123 */           if (c1608j1 != null) {
/* 127 */               c1608j0 = new C1608j0();
/* 132 */               c1608j0.f11361a = c1608j1.f11361a;
/* 136 */               c1608j0.f11363c = c1608j1.f11363c;
/* 140 */               c1608j0.f11362b = c1608j1.f11362b;
/* 144 */               c1608j0.f11364d = c1608j1.f11364d;
/* 148 */               c1608j0.f11365e = c1608j1.f11365e;
/* 152 */               c1608j0.f11366f = c1608j1.f11366f;
/* 160 */               c1608j0.f11367i = AbstractC1704c.m5459n(c1608j1.f11367i);
/* 168 */               c1608j0.f11368v = AbstractC1704c.m5459n(c1608j1.f11368v);
                    } else {
/* 171 */               c1608j0 = null;
                    }
/* 172 */           this.f10719c = c1608j0;
/* 176 */           this.f10720d = c1380b4.f10720d;
/* 180 */           this.f10736t = c1380b4.f10736t;
/* 182 */           C1621r c1621r2 = c1380b4.f10721e;
/* 184 */           if (c1621r2 != null) {
/* 188 */               c1621r = new C1621r();
/* 193 */               c1621r.f11446a = c1621r2.f11446a;
/* 197 */               c1621r.f11450e = c1621r2.f11450e;
/* 201 */               c1621r.f11447b = c1621r2.f11447b;
/* 205 */               c1621r.f11448c = c1621r2.f11448c;
/* 213 */               c1621r.f11451f = AbstractC1704c.m5459n(c1621r2.f11451f);
/* 221 */               c1621r.f11452i = AbstractC1704c.m5459n(c1621r2.f11452i);
/* 229 */               c1621r.f11454w = AbstractC1704c.m5459n(c1621r2.f11454w);
/* 237 */               c1621r.f11445W = AbstractC1704c.m5459n(c1621r2.f11445W);
/* 241 */               c1621r.f11449d = c1621r2.f11449d;
/* 245 */               c1621r.f11443U = c1621r2.f11443U;
/* 249 */               c1621r.f11453v = c1621r2.f11453v;
/* 253 */               c1621r.f11444V = c1621r2.f11444V;
                    } else {
/* 256 */               c1621r = null;
                    }
/* 257 */           this.f10721e = c1621r;
/* 266 */           this.f10722f = new ArrayList(c1380b4.f10722f);
/* 275 */           this.f10727k = new CopyOnWriteArrayList(c1380b4.f10727k);
/* 286 */           C1443f[] c1443fArr = (C1443f[]) c1380b4.f10723g.toArray(new C1443f[0]);
/* 294 */           Queue queueM5068a = m5068a(c1380b4.f10728l.getMaxBreadcrumbs());
/* 299 */           for (C1443f c1443f : c1443fArr) {
/* 308 */               queueM5068a.add(new C1443f(c1443f));
                    }
/* 314 */           this.f10723g = queueM5068a;
/* 316 */           ConcurrentHashMap concurrentHashMap = c1380b4.f10724h;
/* 320 */           ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
/* 335 */           for (Map.Entry entry : concurrentHashMap.entrySet()) {
/* 343 */               if (entry != null) {
/* 357 */                   concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
/* 361 */           this.f10724h = concurrentHashMap2;
/* 363 */           ConcurrentHashMap concurrentHashMap3 = c1380b4.f10725i;
/* 367 */           ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
/* 382 */           for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
/* 390 */               if (entry2 != null) {
/* 396 */                   String str = (String) entry2.getKey();
/* 402 */                   if (entry2.getValue() != null) {
/* 408 */                       C1697u2.m5431g();
/* 411 */                       throw null;
                            }
/* 404 */                   concurrentHashMap4.put(str, null);
                        }
                    }
/* 412 */           this.f10725i = concurrentHashMap4;
/* 414 */           ConcurrentHashMap concurrentHashMap5 = c1380b4.f10726j;
/* 418 */           ConcurrentHashMap concurrentHashMap6 = new ConcurrentHashMap();
/* 433 */           for (Map.Entry entry3 : concurrentHashMap5.entrySet()) {
/* 441 */               if (entry3 != null) {
/* 453 */                   concurrentHashMap6.put((String) entry3.getKey(), entry3.getValue());
                        }
                    }
/* 457 */           this.f10726j = concurrentHashMap6;
/* 466 */           this.f10733q = new C1597e(c1380b4.f10733q);
/* 475 */           this.f10734r = new CopyOnWriteArrayList(c1380b4.f10734r);
/* 483 */           this.f10739w = c1380b4.f10739w.clone();
/* 492 */           this.f10735s = new C1671t3(c1380b4.f10735s);
                }

                /* JADX INFO: renamed from: a */
                public static Queue m5068a(int i) {
                    return i > 0 ? new C1463g7(new C1464h(i)) : new C1749y();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: A */
                public final List mo4677A() {
/* 1 */             return this.f10727k;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: B */
                public final List mo4678B() {
/* 5 */             return new CopyOnWriteArrayList(this.f10734r);
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: C */
                public final void mo4679C(C1393c5 c1393c5) {
                    InterfaceC1525k1 interfaceC1525k1;
/* 7 */             if (!this.f10728l.isTracingEnabled() || c1393c5.m5381a() == null) {
/* 90 */                return;
                    }
/* 15 */            Map map = this.f10738v;
/* 17 */            Throwable thM5381a = c1393c5.m5381a();
/* 23 */            AbstractC1704c.m5462q(thM5381a, "throwable cannot be null");
/* 30 */            while (thM5381a.getCause() != null && thM5381a.getCause() != thM5381a) {
/* 38 */                thM5381a = thM5381a.getCause();
                    }
/* 47 */            C1711j c1711j = (C1711j) map.get(thM5381a);
/* 49 */            if (c1711j != null) {
/* 51 */                WeakReference weakReference = c1711j.f11734a;
/* 59 */                if (c1393c5.f11517b.mo5313i() == null && (interfaceC1525k1 = (InterfaceC1525k1) weakReference.get()) != null) {
/* 75 */                    c1393c5.f11517b.mo5326v(interfaceC1525k1.mo4737s());
                        }
/* 80 */                String str = (String) c1711j.f11735b;
/* 84 */                if (c1393c5.f10788g0 != null || str == null) {
/* 90 */                    return;
                        }
/* 88 */                c1393c5.f10788g0 = str;
                    }
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: D */
                public final C1597e mo4680D() {
/* 1 */             return this.f10733q;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: E */
                public final C1671t3 mo4681E(InterfaceC1753y3 interfaceC1753y3) {
/* 1 */             C1702a c1702a = this.f10732p;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 interfaceC1753y3.mo4802a(this.f10735s);
/* 15 */                C1671t3 c1671t3 = new C1671t3(this.f10735s);
/* 18 */                c1702a.close();
/* 21 */                return c1671t3;
                    } catch (Throwable th) {
                        try {
/* 23 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 28 */                    th.addSuppressed(th2);
                        }
/* 31 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: F */
                public final String mo4682F() {
/* 1 */             return this.f10720d;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: G */
                public final void mo4683G(InterfaceC1159a4 interfaceC1159a4) {
/* 1 */             C1702a c1702a = this.f10731o;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 interfaceC1159a4.mo4715c(this.f10717a);
/* 11 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 16 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 21 */                    th.addSuppressed(th2);
                        }
/* 24 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: H */
                public final void mo4684H(C1626w c1626w) {
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: I */
                public final void mo4685I(InterfaceC1549m1 interfaceC1549m1) {
/* 1 */             C1702a c1702a = this.f10731o;
/* 3 */             c1702a.m5443c();
                    try {
/* 6 */                 this.f10717a = interfaceC1549m1;
/* 22 */                for (InterfaceC1377b1 interfaceC1377b1 : this.f10728l.getScopeObservers()) {
/* 30 */                    if (interfaceC1549m1 != null) {
/* 36 */                        interfaceC1377b1.mo5062p(interfaceC1549m1.getName());
/* 43 */                        interfaceC1377b1.mo4970n(interfaceC1549m1.mo4737s(), this);
                            } else {
/* 50 */                        interfaceC1377b1.mo5062p(null);
/* 53 */                        interfaceC1377b1.mo4970n(null, this);
                            }
                        }
/* 57 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 61 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 66 */                    th.addSuppressed(th2);
                        }
/* 69 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: J */
                public final List mo4686J() {
/* 1 */             return this.f10722f;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: K */
                public final C1608j0 mo4687K() {
/* 1 */             return this.f10719c;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: L */
                public final C1621r mo4688L() {
/* 1 */             return this.f10721e;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: M */
                public final List mo4689M() {
/* 3 */             return AbstractC1704c.m5467v(this.f10727k);
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: N */
                public final String mo4690N() {
/* 1 */             InterfaceC1549m1 interfaceC1549m1 = this.f10717a;
/* 3 */             if (interfaceC1549m1 != null) {
/* 5 */                 return interfaceC1549m1.getName();
                    }
/* 10 */            return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: O */
                public final void mo4691O(C1671t3 c1671t3) {
/* 1 */             this.f10735s = c1671t3;
/* 16 */            C1383b7 c1383b7 = new C1383b7((C1626w) c1671t3.f11668b, (C1430d7) c1671t3.f11669c, "default", null);
/* 21 */            c1383b7.f10763w = "auto";
/* 29 */            Iterator<InterfaceC1377b1> it = this.f10728l.getScopeObservers().iterator();
/* 37 */            while (it.hasNext()) {
/* 45 */                it.next().mo4970n(c1383b7, this);
                    }
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: c */
                public final void mo4692c(Throwable th, C1162a7 c1162a7, String str) {
/* 3 */             AbstractC1704c.m5462q(th, "throwable is required");
/* 8 */             AbstractC1704c.m5462q(str, "transactionName is required");
/* 15 */            while (th.getCause() != null && th.getCause() != th) {
/* 23 */                th = th.getCause();
                    }
/* 28 */            Map map = this.f10738v;
/* 34 */            if (map.containsKey(th)) {
/* 49 */                return;
                    }
/* 46 */            map.put(th, new C1711j(new WeakReference(c1162a7), str));
                }

                @Override // io.sentry.InterfaceC1156a1
                public final void clear() {
/* 2 */             this.f10719c = null;
/* 4 */             this.f10721e = null;
/* 6 */             this.f10720d = null;
/* 10 */            this.f10722f.clear();
/* 15 */            this.f10723g.clear();
/* 24 */            Iterator<InterfaceC1377b1> it = this.f10728l.getScopeObservers().iterator();
/* 32 */            while (it.hasNext()) {
/* 42 */                it.next().mo5060l(this.f10723g);
                    }
/* 48 */            this.f10724h.clear();
/* 53 */            this.f10725i.clear();
/* 58 */            this.f10726j.clear();
/* 63 */            this.f10727k.clear();
/* 66 */            mo4703p();
/* 71 */            this.f10734r.clear();
/* 80 */            Iterator<InterfaceC1377b1> it2 = this.f10728l.getScopeObservers().iterator();
/* 88 */            while (it2.hasNext()) {
/* 96 */                it2.next().mo4969m();
                    }
/* 102 */           this.f10739w.clear();
                }

                @Override // io.sentry.InterfaceC1156a1
                public final InterfaceC1156a1 clone() {
/* 3 */             return new C1380b4(this);
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: f */
                public final void mo4693f(C1443f c1443f, C1486i0 c1486i0) {
/* 1 */             if (c1443f == null || (this.f10723g instanceof C1749y)) {
/* 113 */               return;
                    }
/* 12 */            InterfaceC1747x5 beforeBreadcrumb = this.f10728l.getBeforeBreadcrumb();
/* 16 */            if (beforeBreadcrumb != null) {
/* 18 */                if (c1486i0 == null) {
/* 22 */                    c1486i0 = new C1486i0();
                        }
                        try {
/* 25 */                    c1443f = beforeBreadcrumb.mo3667b(c1443f, c1486i0);
                        } catch (Throwable th) {
/* 41 */                    this.f10728l.getLogger().mo4671d(EnumC1553m5.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th);
/* 48 */                    if (th.getMessage() != null) {
/* 56 */                        c1443f.m5209d(th.getMessage(), "sentry:message");
                            }
                        }
                    }
/* 59 */            if (c1443f == null) {
/* 110 */               this.f10728l.getLogger().mo4672k(EnumC1553m5.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
/* 113 */               return;
                    }
/* 63 */            this.f10723g.add(c1443f);
/* 80 */            for (InterfaceC1377b1 interfaceC1377b1 : this.f10728l.getScopeObservers()) {
/* 88 */                interfaceC1377b1.mo4967i(c1443f);
/* 93 */                interfaceC1377b1.mo5060l(this.f10723g);
                    }
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: g */
                public final InterfaceC1525k1 mo4694g() {
                    InterfaceC1525k1 interfaceC1525k1Mo5250m;
/* 7 */             InterfaceC1525k1 interfaceC1525k1 = (InterfaceC1525k1) this.f10718b.get();
/* 9 */             if (interfaceC1525k1 != null) {
/* 11 */                return interfaceC1525k1;
                    }
/* 12 */            InterfaceC1549m1 interfaceC1549m1 = this.f10717a;
                    return (interfaceC1549m1 == null || (interfaceC1525k1Mo5250m = interfaceC1549m1.mo5250m()) == null) ? interfaceC1549m1 : interfaceC1525k1Mo5250m;
                }

                @Override // io.sentry.InterfaceC1156a1
                public final Map getAttributes() {
/* 3 */             return AbstractC1704c.m5459n(this.f10725i);
                }

                @Override // io.sentry.InterfaceC1156a1
                public final Map getExtras() {
/* 1 */             return this.f10726j;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: h */
                public final C1607j mo4695h() {
/* 3 */             return this.f10739w.mo5254h();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: i */
                public final C1626w mo4696i() {
/* 1 */             return this.f10736t;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: j */
                public final void mo4697j(C1154a c1154a) {
/* 3 */             this.f10734r.add(c1154a);
/* 12 */            Iterator<InterfaceC1377b1> it = this.f10728l.getScopeObservers().iterator();
/* 20 */            while (it.hasNext()) {
/* 28 */                it.next().mo4968j(c1154a);
                    }
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: k */
                public final void mo4698k(C1626w c1626w) {
/* 1 */             this.f10736t = c1626w;
/* 9 */             Iterator<InterfaceC1377b1> it = this.f10728l.getScopeObservers().iterator();
/* 17 */            while (it.hasNext()) {
/* 25 */                it.next().mo5059k(c1626w);
                    }
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: l */
                public final C1554m6 mo4699l() {
/* 1 */             return this.f10728l;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: m */
                public final InterfaceC1549m1 mo4700m() {
/* 1 */             return this.f10717a;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: n */
                public final C1764z6 mo4701n() {
/* 1 */             C1702a c1702a = this.f10730n;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 C1764z6 c1764z6 = null;
/* 9 */                 if (this.f10729m != null) {
/* 11 */                    C1764z6 c1764z7 = this.f10729m;
/* 13 */                    c1764z7.getClass();
/* 21 */                    c1764z7.m5527b(new Date());
/* 30 */                    this.f10728l.getContinuousProfiler().mo4796d();
/* 35 */                    C1764z6 c1764z6Clone = this.f10729m.clone();
/* 39 */                    this.f10729m = null;
/* 41 */                    c1764z6 = c1764z6Clone;
                        }
/* 45 */                c1702a.close();
/* 48 */                return c1764z6;
                    } catch (Throwable th) {
                        try {
/* 49 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 54 */                    th.addSuppressed(th2);
                        }
/* 57 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: o */
                public final C1505c mo4702o() {
/* 3 */             C1702a c1702a = this.f10730n;
/* 5 */             c1702a.m5443c();
                    try {
/* 10 */                if (this.f10729m != null) {
/* 12 */                    C1764z6 c1764z6 = this.f10729m;
/* 14 */                    c1764z6.getClass();
/* 22 */                    c1764z6.m5527b(new Date());
/* 31 */                    this.f10728l.getContinuousProfiler().mo4796d();
                        }
/* 38 */                C1764z6 c1764z7 = this.f10729m;
/* 46 */                C1505c c1505c = null;
/* 47 */                if (this.f10728l.getRelease() != null) {
/* 53 */                    String distinctId = this.f10728l.getDistinctId();
/* 57 */                    C1608j0 c1608j0 = this.f10719c;
/* 106 */                   this.f10729m = new C1764z6(EnumC1756y6.Ok, new Date(), new Date(), 0, distinctId, AbstractC1417a.m5172j(), Boolean.TRUE, null, null, c1608j0 != null ? c1608j0.f11364d : null, null, this.f10728l.getEnvironment(), this.f10728l.getRelease(), null);
/* 123 */                   c1505c = new C1505c(5, this.f10729m.clone(), c1764z7 != null ? c1764z7.clone() : null);
                        } else {
/* 141 */                   this.f10728l.getLogger().mo4672k(EnumC1553m5.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
                        }
/* 144 */               c1702a.close();
/* 147 */               return c1505c;
                    } catch (Throwable th) {
                        try {
/* 148 */                   c1702a.close();
/* 156 */                   throw th;
                        } catch (Throwable th2) {
/* 153 */                   th.addSuppressed(th2);
/* 156 */                   throw th;
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: p */
                public final void mo4703p() {
/* 1 */             C1702a c1702a = this.f10731o;
/* 3 */             c1702a.m5443c();
                    try {
/* 7 */                 this.f10717a = null;
/* 9 */                 c1702a.close();
/* 26 */                for (InterfaceC1377b1 interfaceC1377b1 : this.f10728l.getScopeObservers()) {
/* 34 */                    interfaceC1377b1.mo5062p(null);
/* 37 */                    interfaceC1377b1.mo4970n(null, this);
                        }
                    } catch (Throwable th) {
                        try {
/* 43 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 48 */                    th.addSuppressed(th2);
                        }
/* 51 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: q */
                public final InterfaceC1453b mo4704q() {
/* 1 */             return this.f10739w;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: r */
                public final C1764z6 mo4705r() {
/* 1 */             return this.f10729m;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: s */
                public final Queue mo4706s() {
/* 1 */             return this.f10723g;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: t */
                public final EnumC1553m5 mo4707t() {
/* 1 */             return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: u */
                public final C1671t3 mo4708u() {
/* 1 */             return this.f10735s;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: v */
                public final C1764z6 mo4709v(InterfaceC1761z3 interfaceC1761z3) {
/* 1 */             C1702a c1702a = this.f10730n;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 interfaceC1761z3.mo5441a(this.f10729m);
/* 24 */                C1764z6 c1764z6Clone = this.f10729m != null ? this.f10729m.clone() : null;
/* 25 */                c1702a.close();
/* 28 */                return c1764z6Clone;
                    } catch (Throwable th) {
                        try {
/* 29 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 34 */                    th.addSuppressed(th2);
                        }
/* 37 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: x */
                public final void mo4710x(String str) {
/* 1 */             this.f10720d = str;
/* 3 */             C1597e c1597e = this.f10733q;
/* 5 */             C1589a c1589aMo5308d = c1597e.mo5308d();
/* 9 */             if (c1589aMo5308d == null) {
/* 13 */                c1589aMo5308d = new C1589a();
/* 16 */                c1597e.mo5317m(c1589aMo5308d);
                    }
/* 19 */            if (str == null) {
/* 22 */                c1589aMo5308d.f11250w = null;
                    } else {
/* 28 */                ArrayList arrayList = new ArrayList(1);
/* 31 */                arrayList.add(str);
/* 34 */                c1589aMo5308d.f11250w = arrayList;
                    }
/* 42 */            Iterator<InterfaceC1377b1> it = this.f10728l.getScopeObservers().iterator();
/* 50 */            while (it.hasNext()) {
/* 58 */                it.next().mo5061o(c1597e);
                    }
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: y */
                public final InterfaceC1445f1 mo4711y() {
/* 1 */             return this.f10737u;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: z */
                public final Map mo4712z() {
/* 3 */             return AbstractC1704c.m5459n(this.f10724h);
                }

                /* JADX INFO: renamed from: clone, reason: collision with other method in class */
/* 6 */         public final Object m10489clone() {
/* 7 */             return new C1380b4(this);
                }

/* 494 */       public C1380b4(C1554m6 c1554m6) {
                    InterfaceC1453b c1452a;
/* 496 */           this.f10718b = new WeakReference(null);
/* 497 */           this.f10722f = new ArrayList();
/* 498 */           this.f10724h = new ConcurrentHashMap();
/* 499 */           this.f10725i = new ConcurrentHashMap();
/* 500 */           this.f10726j = new ConcurrentHashMap();
/* 501 */           this.f10727k = new CopyOnWriteArrayList();
/* 504 */           this.f10730n = new C1702a();
/* 507 */           this.f10731o = new C1702a();
/* 510 */           this.f10732p = new C1702a();
/* 511 */           this.f10733q = new C1597e();
/* 512 */           this.f10734r = new CopyOnWriteArrayList();
/* 513 */           this.f10736t = C1626w.f11478b;
/* 514 */           this.f10737u = C1760z2.f11849a;
/* 516 */           this.f10738v = Collections.synchronizedMap(new WeakHashMap());
/* 517 */           AbstractC1704c.m5462q(c1554m6, "SentryOptions is required.");
                    this.f10728l = c1554m6;
/* 518 */           this.f10723g = m5068a(this.f10728l.getMaxBreadcrumbs());
/* 519 */           int maxFeatureFlags = c1554m6.getMaxFeatureFlags();
                    if (maxFeatureFlags > 0) {
/* 520 */               c1452a = new C1452a(maxFeatureFlags);
                    } else {
/* 521 */               c1452a = C1454c.f10945a;
                    }
/* 522 */           this.f10739w = c1452a;
/* 523 */           this.f10735s = new C1671t3();
                }
            }
