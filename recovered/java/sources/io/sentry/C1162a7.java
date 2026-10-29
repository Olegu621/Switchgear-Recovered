            package io.sentry;

            import io.sentry.protocol.C1614n;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: renamed from: io.sentry.a7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 74 */    public final class C1162a7 implements InterfaceC1525k1 {

                /* JADX INFO: renamed from: a */
                public final AbstractC1672t4 f9802a;

                /* JADX INFO: renamed from: b */
                public AbstractC1672t4 f9803b;

                /* JADX INFO: renamed from: c */
                public final C1383b7 f9804c;

                /* JADX INFO: renamed from: d */
                public final C1748x6 f9805d;

                /* JADX INFO: renamed from: e */
                public IOException f9806e;

                /* JADX INFO: renamed from: f */
                public final InterfaceC1389c1 f9807f;

                /* JADX INFO: renamed from: i */
                public final C1439e7 f9810i;

                /* JADX INFO: renamed from: j */
                public InterfaceC1395c7 f9811j;

                /* JADX INFO: renamed from: g */
                public boolean f9808g = false;

                /* JADX INFO: renamed from: h */
                public final AtomicBoolean f9809h = new AtomicBoolean(false);

                /* JADX INFO: renamed from: k */
                public final ConcurrentHashMap f9812k = new ConcurrentHashMap();

                /* JADX INFO: renamed from: l */
                public final ConcurrentHashMap f9813l = new ConcurrentHashMap();

                public C1162a7(C1748x6 c1748x6, C1460g4 c1460g4, C1383b7 c1383b7, C1439e7 c1439e7, C1701u6 c1701u6) {
/* 30 */            new ConcurrentHashMap();
/* 35 */            this.f9804c = c1383b7;
/* 39 */            c1383b7.f10763w = c1439e7.f10919d;
/* 41 */            this.f9805d = c1748x6;
/* 45 */            AbstractC1704c.m5462q(c1460g4, "Scopes are required");
/* 48 */            this.f9807f = c1460g4;
/* 50 */            this.f9810i = c1439e7;
/* 52 */            this.f9811j = c1701u6;
/* 54 */            AbstractC1672t4 abstractC1672t4 = c1439e7.f10916a;
/* 56 */            if (abstractC1672t4 != null) {
/* 58 */                this.f9802a = abstractC1672t4;
                    } else {
/* 73 */                this.f9802a = c1460g4.mo5092l().getDateProvider().mo4856a();
                    }
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: b */
                public final C1674t6 mo4726b() {
/* 3 */             C1383b7 c1383b7 = this.f9804c;
/* 5 */             C1626w c1626w = c1383b7.f10755a;
/* 7 */             C1430d7 c1430d7 = c1383b7.f10756b;
/* 9 */             C1671t3 c1671t3 = c1383b7.f10758d;
/* 19 */            return new C1674t6(c1626w, c1430d7, c1671t3 == null ? null : (Boolean) c1671t3.f11667a);
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: c */
                public final InterfaceC1525k1 mo4727c(String str, AbstractC1672t4 abstractC1672t4, EnumC1640r1 enumC1640r1) {
/* 12 */            return mo4733n("activity.load", str, abstractC1672t4, enumC1640r1, new C1439e7());
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: d */
                public final boolean mo4728d() {
/* 1 */             return this.f9808g;
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: f */
                public final void mo4729f(EnumC1451f7 enumC1451f7) {
/* 15 */            mo4740v(enumC1451f7, this.f9807f.mo5092l().getDateProvider().mo4856a());
                }

                @Override // io.sentry.InterfaceC1525k1
                public final String getDescription() {
/* 3 */             return this.f9804c.f10760f;
                }

                @Override // io.sentry.InterfaceC1525k1
                public final EnumC1451f7 getStatus() {
/* 3 */             return this.f9804c.f10761i;
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: h */
                public final void mo4730h(IOException iOException) {
/* 1 */             this.f9806e = iOException;
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: i */
                public final void mo4731i() {
/* 5 */             mo4729f(this.f9804c.f10761i);
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: j */
                public final void mo4732j(Object obj, String str) {
/* 1 */             ConcurrentHashMap concurrentHashMap = this.f9812k;
/* 3 */             if (obj == null) {
/* 5 */                 concurrentHashMap.remove(str);
                    } else {
/* 9 */                 concurrentHashMap.put(str, obj);
                    }
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: n */
                public final InterfaceC1525k1 mo4733n(String str, String str2, AbstractC1672t4 abstractC1672t4, EnumC1640r1 enumC1640r1, C1439e7 c1439e7) {
/* 3 */             if (this.f9808g) {
/* 5 */                 return C1426d3.f10849a;
                    }
/* 10 */            C1430d7 c1430d7 = this.f9804c.f10756b;
/* 12 */            C1748x6 c1748x6 = this.f9805d;
/* 16 */            C1383b7 c1383b7 = c1748x6.f11819b.f9804c;
/* 34 */            C1383b7 c1383b8 = new C1383b7(c1383b7.f10755a, new C1430d7(), c1430d7, str, null, c1383b7.f10758d, null, "manual");
/* 37 */            c1383b8.f10760f = str2;
/* 39 */            c1383b8.f10751W = enumC1640r1;
/* 41 */            c1439e7.f10916a = abstractC1672t4;
/* 43 */            return c1748x6.m5525z(c1383b8, c1439e7);
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: o */
                public final void mo4734o(String str) {
/* 3 */             this.f9804c.f10760f = str;
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: p */
                public final InterfaceC1525k1 mo4735p(String str) {
/* 3 */             if (this.f9808g) {
/* 5 */                 return C1426d3.f10849a;
                    }
/* 10 */            C1430d7 c1430d7 = this.f9804c.f10756b;
/* 12 */            C1748x6 c1748x6 = this.f9805d;
/* 14 */            c1748x6.getClass();
/* 19 */            C1439e7 c1439e7 = new C1439e7();
/* 24 */            C1383b7 c1383b7 = c1748x6.f11819b.f9804c;
/* 45 */            C1383b7 c1383b8 = new C1383b7(c1383b7.f10755a, new C1430d7(), c1430d7, str, null, c1383b7.f10758d, null, "manual");
/* 49 */            c1383b8.f10760f = null;
/* 53 */            c1383b8.f10751W = EnumC1640r1.SENTRY;
/* 55 */            return c1748x6.m5525z(c1383b8, c1439e7);
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: r */
                public final void mo4736r(String str, Long l, EnumC1517j2 enumC1517j2) {
/* 3 */             if (this.f9808g) {
/* 23 */                this.f9807f.mo5092l().getLogger().mo4672k(EnumC1553m5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
/* 26 */                return;
                    }
/* 38 */            this.f9813l.put(str, new C1614n(enumC1517j2.apiName(), (Number) l));
/* 41 */            C1748x6 c1748x6 = this.f9805d;
/* 43 */            C1162a7 c1162a7 = c1748x6.f11819b;
/* 45 */            if (c1162a7 == this || c1162a7.f9813l.containsKey(str)) {
/* 58 */                return;
                    }
/* 55 */            c1748x6.mo4736r(str, l, enumC1517j2);
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: s */
                public final C1383b7 mo4737s() {
/* 1 */             return this.f9804c;
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: t */
                public final AbstractC1672t4 mo4738t() {
/* 1 */             return this.f9803b;
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: u */
                public final void mo4739u(String str, Number number) {
/* 3 */             if (this.f9808g) {
/* 23 */                this.f9807f.mo5092l().getLogger().mo4672k(EnumC1553m5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
/* 26 */                return;
                    }
/* 35 */            this.f9813l.put(str, new C1614n((String) null, number));
/* 38 */            C1748x6 c1748x6 = this.f9805d;
/* 40 */            C1162a7 c1162a7 = c1748x6.f11819b;
/* 42 */            if (c1162a7 == this || c1162a7.f9813l.containsKey(str)) {
/* 55 */                return;
                    }
/* 52 */            c1748x6.mo4739u(str, number);
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: v */
                public final void mo4740v(EnumC1451f7 enumC1451f7, AbstractC1672t4 abstractC1672t4) {
                    List<C1162a7> list;
                    AbstractC1672t4 abstractC1672t5;
                    AbstractC1672t4 abstractC1672t6;
/* 3 */             if (this.f9808g || !this.f9809h.compareAndSet(false, true)) {
/* 198 */               return;
                    }
/* 17 */            C1383b7 c1383b7 = this.f9804c;
/* 19 */            c1383b7.f10761i = enumC1451f7;
/* 21 */            C1430d7 c1430d7 = c1383b7.f10756b;
/* 23 */            InterfaceC1389c1 interfaceC1389c1 = this.f9807f;
/* 25 */            if (abstractC1672t4 == null) {
/* 35 */                abstractC1672t4 = interfaceC1389c1.mo5092l().getDateProvider().mo4856a();
                    }
/* 39 */            this.f9803b = abstractC1672t4;
/* 41 */            C1439e7 c1439e7 = this.f9810i;
/* 43 */            c1439e7.getClass();
/* 46 */            boolean z = c1439e7.f10918c;
/* 48 */            C1748x6 c1748x6 = this.f9805d;
/* 50 */            if (z) {
/* 52 */                C1162a7 c1162a7 = c1748x6.f11819b;
/* 54 */                CopyOnWriteArrayList<C1162a7> copyOnWriteArrayList = c1748x6.f11820c;
/* 64 */                if (!c1162a7.f9804c.f10756b.equals(c1430d7)) {
                            list = copyOnWriteArrayList;
/* 69 */                    ArrayList arrayList = new ArrayList();
/* 80 */                    for (C1162a7 c1162a8 : copyOnWriteArrayList) {
/* 90 */                        C1430d7 c1430d8 = c1162a8.f9804c.f10757c;
/* 92 */                        if (c1430d8 != null && c1430d8.equals(c1430d7)) {
/* 100 */                           arrayList.add(c1162a8);
                                }
                            }
/* 104 */                   list = arrayList;
                        }
                        list = copyOnWriteArrayList;
/* 109 */               AbstractC1672t4 abstractC1672t7 = null;
/* 110 */               AbstractC1672t4 abstractC1672t8 = null;
/* 117 */               for (C1162a7 c1162a9 : list) {
/* 125 */                   if (abstractC1672t7 == null || c1162a9.f9802a.mo5412b(abstractC1672t7) < 0) {
/* 137 */                       abstractC1672t7 = c1162a9.f9802a;
                            }
/* 139 */                   if (abstractC1672t8 == null || ((abstractC1672t6 = c1162a9.f9803b) != null && abstractC1672t6.mo5412b(abstractC1672t8) > 0)) {
/* 153 */                       abstractC1672t8 = c1162a9.f9803b;
                            }
                        }
/* 158 */               if (c1439e7.f10918c && abstractC1672t8 != null && (((abstractC1672t5 = this.f9803b) == null || abstractC1672t5.mo5412b(abstractC1672t8) > 0) && this.f9803b != null)) {
/* 178 */                   this.f9803b = abstractC1672t8;
                        }
                    }
/* 180 */           IOException iOException = this.f9806e;
/* 182 */           if (iOException != null) {
/* 186 */               interfaceC1389c1.mo5083c(iOException, this, c1748x6.f11822e);
                    }
/* 189 */           InterfaceC1395c7 interfaceC1395c7 = this.f9811j;
/* 191 */           if (interfaceC1395c7 != null) {
/* 193 */               interfaceC1395c7.mo5112b(this);
                    }
/* 196 */           this.f9808g = true;
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: w */
                public final AbstractC1672t4 mo4741w() {
/* 1 */             return this.f9802a;
                }

/* 75 */        public C1162a7(C1522j7 c1522j7, C1748x6 c1748x6, C1460g4 c1460g4, C1531k7 c1531k7) {
/* 81 */            new ConcurrentHashMap();
/* 83 */            this.f9804c = c1522j7;
/* 85 */            c1522j7.f10763w = c1531k7.f10919d;
/* 86 */            this.f9805d = c1748x6;
/* 87 */            this.f9807f = c1460g4;
/* 88 */            this.f9811j = null;
/* 89 */            AbstractC1672t4 abstractC1672t4 = c1531k7.f10916a;
                    if (abstractC1672t4 != null) {
/* 90 */                this.f9802a = abstractC1672t4;
                    } else {
/* 91 */                this.f9802a = c1460g4.mo5092l().getDateProvider().mo4856a();
                    }
/* 92 */            this.f9810i = c1531k7;
                }
            }
