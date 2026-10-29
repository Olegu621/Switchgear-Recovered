            package io.sentry.android.core;

            import android.view.Choreographer;
            import io.sentry.AbstractC1672t4;
            import io.sentry.C1426d3;
            import io.sentry.C1447f3;
            import io.sentry.C1700u5;
            import io.sentry.InterfaceC1525k1;
            import io.sentry.InterfaceC1549m1;
            import io.sentry.InterfaceC1742x0;
            import io.sentry.android.core.internal.util.C1231r;
            import io.sentry.android.core.internal.util.InterfaceC1230q;
            import io.sentry.util.C1702a;
            import java.lang.reflect.Field;
            import java.util.Iterator;
            import java.util.TreeSet;
            import java.util.concurrent.ConcurrentSkipListSet;
            import p000.kl0;
            
            /* JADX INFO: renamed from: io.sentry.android.core.u1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1276u1 implements InterfaceC1230q, InterfaceC1742x0 {

                /* JADX INFO: renamed from: h */
                public static final C1700u5 f10345h = new C1700u5(0, 0);

                /* JADX INFO: renamed from: a */
                public final boolean f10346a;

                /* JADX INFO: renamed from: c */
                public final C1231r f10348c;

                /* JADX INFO: renamed from: d */
                public volatile String f10349d;

                /* JADX INFO: renamed from: b */
                public final C1702a f10347b = new C1702a();

                /* JADX INFO: renamed from: e */
                public final TreeSet f10350e = new TreeSet(new kl0(3));

                /* JADX INFO: renamed from: f */
                public final ConcurrentSkipListSet f10351f = new ConcurrentSkipListSet();

                /* JADX INFO: renamed from: g */
                public long f10352g = 16666666;

                public C1276u1(SentryAndroidOptions sentryAndroidOptions, C1231r c1231r) {
/* 36 */            this.f10348c = c1231r;
/* 53 */            this.f10346a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
                }

                /* JADX INFO: renamed from: g */
                public static long m4945g(AbstractC1672t4 abstractC1672t4) {
/* 3 */             if (abstractC1672t4 instanceof C1700u5) {
/* 7 */                 return abstractC1672t4.mo5412b(f10345h);
                    }
/* 29 */            return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - abstractC1672t4.mo5278d());
                }

                @Override // io.sentry.android.core.internal.util.InterfaceC1230q
                /* JADX INFO: renamed from: b */
                public final void mo4847b(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
/* 3 */             ConcurrentSkipListSet concurrentSkipListSet = this.f10351f;
/* 11 */            if (concurrentSkipListSet.size() > 3600) {
/* 31 */                return;
                    }
/* 23 */            long j5 = (long) (1.0E9d / ((double) f));
/* 24 */            this.f10352g = j5;
/* 26 */            if (z || z2) {
/* 50 */                concurrentSkipListSet.add(new C1273t1(j, j2, j3, j4, z, z2, j5));
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m4946d() {
/* 1 */             C1702a c1702a = this.f10347b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 if (this.f10349d != null) {
/* 14 */                    this.f10348c.m4849b(this.f10349d);
/* 18 */                    this.f10349d = null;
                        }
/* 25 */                this.f10351f.clear();
/* 30 */                this.f10350e.clear();
/* 33 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 37 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 42 */                    th.addSuppressed(th2);
                        }
/* 45 */                throw th;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:84:0x015f  */
                /* JADX INFO: renamed from: e */
                public final void m4947e(InterfaceC1525k1 interfaceC1525k1) throws Throwable {
                    C1702a c1702a;
                    AbstractC1672t4 abstractC1672t4Mo4738t;
                    TreeSet treeSet;
                    ConcurrentSkipListSet concurrentSkipListSet;
                    int i;
                    int i2;
                    long j;
                    long j2;
                    long j3;
                    long jLongValue;
                    Field field;
                    Iterator it;
                    ConcurrentSkipListSet concurrentSkipListSet2;
/* 5 */             TreeSet treeSet2 = this.f10350e;
/* 9 */             if (!this.f10346a || (interfaceC1525k1 instanceof C1426d3) || (interfaceC1525k1 instanceof C1447f3)) {
/* 21 */                return;
                    }
/* 22 */            C1702a c1702a2 = this.f10347b;
/* 24 */            c1702a2.m5443c();
                    try {
/* 31 */                if (!treeSet2.contains(interfaceC1525k1)) {
/* 33 */                    c1702a2.close();
/* 36 */                    return;
                        }
/* 37 */                c1702a2.close();
/* 40 */                c1702a2.m5443c();
                        try {
/* 43 */                    boolean zRemove = treeSet2.remove(interfaceC1525k1);
/* 47 */                    ConcurrentSkipListSet concurrentSkipListSet3 = this.f10351f;
/* 49 */                    if (zRemove && (abstractC1672t4Mo4738t = interfaceC1525k1.mo4738t()) != null) {
/* 72 */                        long jM4945g = m4945g(interfaceC1525k1.mo4741w());
/* 76 */                        long jM4945g2 = m4945g(abstractC1672t4Mo4738t);
/* 80 */                        long j4 = jM4945g2 - jM4945g;
/* 86 */                        if (j4 <= 0) {
/* 51 */                            c1702a2.close();
/* 54 */                            treeSet = treeSet2;
/* 55 */                            c1702a = c1702a2;
/* 57 */                            concurrentSkipListSet = concurrentSkipListSet3;
                                } else {
/* 89 */                            long j5 = this.f10352g;
/* 98 */                            int i3 = 1;
/* 102 */                           if (concurrentSkipListSet3.isEmpty()) {
/* 310 */                               treeSet = treeSet2;
/* 311 */                               c1702a = c1702a2;
/* 313 */                               concurrentSkipListSet = concurrentSkipListSet3;
/* 315 */                               i = 0;
/* 317 */                               i2 = 0;
/* 319 */                               j = 0;
/* 321 */                               j2 = 0;
/* 323 */                               j3 = 0;
                                    } else {
/* 113 */                               Iterator it2 = concurrentSkipListSet3.tailSet(new C1273t1(jM4945g)).iterator();
/* 117 */                               j = 0;
/* 119 */                               j2 = 0;
/* 121 */                               j3 = 0;
/* 123 */                               i = 0;
/* 125 */                               i2 = 0;
                                        while (true) {
/* 131 */                                   if (!it2.hasNext()) {
/* 305 */                                       treeSet = treeSet2;
/* 306 */                                       c1702a = c1702a2;
                                                break;
                                            }
/* 139 */                                   C1273t1 c1273t1 = (C1273t1) it2.next();
/* 141 */                                   treeSet = treeSet2;
/* 142 */                                   c1702a = c1702a2;
                                            try {
/* 144 */                                       long j6 = c1273t1.f10334a;
/* 148 */                                       long j7 = c1273t1.f10337d;
/* 152 */                                       long j8 = c1273t1.f10340i;
/* 156 */                                       long j9 = c1273t1.f10335b;
/* 160 */                                       if (j6 > jM4945g2) {
                                                    break;
                                                }
/* 168 */                                       if (j6 < jM4945g || j9 > jM4945g2) {
/* 206 */                                           if ((jM4945g > j6 && jM4945g < j9) || (jM4945g2 > j6 && jM4945g2 < j9)) {
/* 222 */                                               it = it2;
/* 224 */                                               concurrentSkipListSet2 = concurrentSkipListSet3;
/* 240 */                                               long jMin = Math.min(j7 - Math.max(0L, Math.max(0L, jM4945g - j6) - j8), j4);
/* 254 */                                               long jMin2 = Math.min(jM4945g2, j9) - Math.max(jM4945g, c1273t1.f10334a);
/* 262 */                                               boolean z = jMin2 > j8;
/* 273 */                                               j += jMin2;
/* 275 */                                               if (jMin2 > 700000000) {
/* 277 */                                                   j3 += jMin;
/* 279 */                                                   i2++;
                                                        } else if (z) {
/* 284 */                                                   j2 += jMin;
/* 286 */                                                   i++;
                                                        }
                                                    }
/* 288 */                                           treeSet2 = treeSet;
/* 289 */                                           c1702a2 = c1702a;
/* 291 */                                           concurrentSkipListSet3 = concurrentSkipListSet2;
/* 293 */                                           it2 = it;
/* 295 */                                           j5 = j8;
                                                } else {
/* 174 */                                           long j10 = c1273t1.f10336c;
/* 176 */                                           boolean z2 = c1273t1.f10338e;
/* 180 */                                           j += j10;
/* 182 */                                           if (c1273t1.f10339f) {
/* 184 */                                               j3 += j7;
/* 186 */                                               i2++;
                                                    } else if (z2) {
/* 191 */                                               j2 += j7;
/* 193 */                                               i++;
                                                    }
                                                }
/* 195 */                                       it = it2;
/* 197 */                                       concurrentSkipListSet2 = concurrentSkipListSet3;
/* 288 */                                       treeSet2 = treeSet;
/* 289 */                                       c1702a2 = c1702a;
/* 291 */                                       concurrentSkipListSet3 = concurrentSkipListSet2;
/* 293 */                                       it2 = it;
/* 295 */                                       j5 = j8;
                                            } catch (Throwable th) {
/* 200 */                                       th = th;
/* 201 */                                       Throwable th2 = th;
                                                try {
/* 575 */                                           c1702a.close();
/* 583 */                                           throw th2;
                                                } catch (Throwable th3) {
/* 580 */                                           th2.addSuppressed(th3);
/* 583 */                                           throw th2;
                                                }
                                            }
                                        }
/* 162 */                               concurrentSkipListSet = concurrentSkipListSet3;
                                    }
/* 325 */                           int iCeil = i + i2;
/* 327 */                           C1231r c1231r = this.f10348c;
/* 329 */                           Choreographer choreographer = c1231r.f10192V;
/* 333 */                           if (choreographer == null || (field = c1231r.f10193W) == null) {
/* 352 */                               jLongValue = -1;
                                    } else {
                                        try {
/* 343 */                                   Long l = (Long) field.get(choreographer);
/* 345 */                                   if (l != null) {
/* 347 */                                       jLongValue = l.longValue();
                                            } else {
/* 352 */                                       jLongValue = -1;
                                            }
                                        } catch (IllegalAccessException unused) {
                                        }
                                    }
/* 355 */                           if (jLongValue != -1) {
/* 360 */                               long jMax = Math.max(0L, jM4945g2 - jLongValue);
/* 373 */                               if (jMax > j5) {
/* 382 */                                   boolean z3 = jMax > 700000000;
/* 388 */                                   long jMax2 = Math.max(0L, jMax - j5);
/* 392 */                                   j += jMax;
/* 394 */                                   if (z3) {
/* 396 */                                       j3 += jMax2;
/* 398 */                                       i2++;
                                            } else {
/* 401 */                                       j2 += jMax2;
/* 403 */                                       i++;
                                            }
                                        } else {
/* 406 */                                   i3 = 0;
                                        }
/* 410 */                               long j11 = j4 - j;
/* 428 */                               iCeil = iCeil + i3 + (j11 > 0 ? (int) Math.ceil(j11 / j5) : 0);
                                    }
/* 438 */                           double d = (j2 + j3) / 1.0E9d;
/* 445 */                           interfaceC1525k1.mo4732j(Integer.valueOf(iCeil), "frames.total");
/* 454 */                           interfaceC1525k1.mo4732j(Integer.valueOf(i), "frames.slow");
/* 463 */                           interfaceC1525k1.mo4732j(Integer.valueOf(i2), "frames.frozen");
/* 472 */                           interfaceC1525k1.mo4732j(Double.valueOf(d), "frames.delay");
/* 477 */                           if (interfaceC1525k1 instanceof InterfaceC1549m1) {
/* 485 */                               interfaceC1525k1.mo4739u("frames_total", Integer.valueOf(iCeil));
/* 494 */                               interfaceC1525k1.mo4739u("frames_slow", Integer.valueOf(i));
/* 503 */                               interfaceC1525k1.mo4739u("frames_frozen", Integer.valueOf(i2));
/* 512 */                               interfaceC1525k1.mo4739u("frames_delay", Double.valueOf(d));
                                    }
/* 515 */                           c1702a.close();
                                }
                            } else {
/* 51 */                        c1702a2.close();
/* 54 */                        treeSet = treeSet2;
/* 55 */                        c1702a = c1702a2;
/* 57 */                        concurrentSkipListSet = concurrentSkipListSet3;
                            }
/* 518 */                   c1702a.m5443c();
                            try {
/* 525 */                       if (treeSet.isEmpty()) {
/* 527 */                           m4946d();
                                } else {
/* 559 */                           concurrentSkipListSet.headSet(new C1273t1(m4945g(((InterfaceC1525k1) treeSet.first()).mo4741w()))).clear();
                                }
/* 562 */                       c1702a.close();
                            } catch (Throwable th4) {
                                try {
/* 566 */                           c1702a.close();
/* 574 */                           throw th4;
                                } catch (Throwable th5) {
/* 571 */                           th4.addSuppressed(th5);
/* 574 */                           throw th4;
                                }
                            }
                        } catch (Throwable th6) {
/* 301 */                   th = th6;
/* 302 */                   c1702a = c1702a2;
                        }
                    } catch (Throwable th7) {
                        try {
/* 588 */                   c1702a2.close();
/* 596 */                   throw th7;
                        } catch (Throwable th8) {
/* 593 */                   th7.addSuppressed(th8);
/* 596 */                   throw th7;
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m4948f(InterfaceC1525k1 interfaceC1525k1) {
/* 3 */             if (!this.f10346a || (interfaceC1525k1 instanceof C1426d3) || (interfaceC1525k1 instanceof C1447f3)) {
/* 15 */                return;
                    }
/* 16 */            C1702a c1702a = this.f10347b;
/* 18 */            c1702a.m5443c();
                    try {
/* 23 */                this.f10350e.add(interfaceC1525k1);
/* 28 */                if (this.f10349d == null) {
/* 36 */                    this.f10349d = this.f10348c.m4848a(this);
                        }
/* 41 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 45 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 50 */                    th.addSuppressed(th2);
                        }
/* 53 */                throw th;
                    }
                }
            }
