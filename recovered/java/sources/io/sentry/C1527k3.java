            package io.sentry;

            import io.sentry.android.core.C1278v0;
            import io.sentry.hints.InterfaceC1478f;
            import io.sentry.hints.InterfaceC1480h;
            import io.sentry.hints.InterfaceC1483k;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.AbstractC1704c;
            import java.io.BufferedInputStream;
            import java.io.BufferedReader;
            import java.io.ByteArrayInputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.nio.charset.Charset;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.concurrent.CountDownLatch;
            
            /* JADX INFO: renamed from: io.sentry.k3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1527k3 extends AbstractC1733w {

                /* JADX INFO: renamed from: i */
                public static final Charset f11081i = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: e */
                public final InterfaceC1389c1 f11082e;

                /* JADX INFO: renamed from: f */
                public final InterfaceC1668t0 f11083f;

                /* JADX INFO: renamed from: g */
                public final InterfaceC1487i1 f11084g;

                /* JADX INFO: renamed from: h */
                public final ILogger f11085h;

                public C1527k3(InterfaceC1389c1 interfaceC1389c1, InterfaceC1668t0 interfaceC1668t0, InterfaceC1487i1 interfaceC1487i1, ILogger iLogger, long j, int i) {
/* 6 */             super(interfaceC1389c1, iLogger, j, i);
/* 11 */            AbstractC1704c.m5462q(interfaceC1389c1, "Scopes are required.");
/* 14 */            this.f11082e = interfaceC1389c1;
/* 18 */            AbstractC1704c.m5462q(interfaceC1668t0, "Envelope reader is required.");
/* 21 */            this.f11083f = interfaceC1668t0;
/* 25 */            AbstractC1704c.m5462q(interfaceC1487i1, "Serializer is required.");
/* 28 */            this.f11084g = interfaceC1487i1;
/* 32 */            AbstractC1704c.m5462q(iLogger, "Logger is required.");
/* 35 */            this.f11085h = iLogger;
                }

                /* JADX INFO: renamed from: c */
                public static /* synthetic */ void m5332c(C1527k3 c1527k3, File file, InterfaceC1480h interfaceC1480h) {
/* 3 */             ILogger iLogger = c1527k3.f11085h;
/* 9 */             if (interfaceC1480h.mo4952a()) {
/* 45 */                return;
                    }
                    try {
/* 15 */                if (file.delete()) {
/* 45 */                    return;
                        }
/* 27 */                iLogger.mo4672k(EnumC1553m5.ERROR, "Failed to delete: %s", file.getAbsolutePath());
                    } catch (RuntimeException e) {
/* 42 */                iLogger.mo4670b(EnumC1553m5.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
                    }
                }

                @Override // io.sentry.AbstractC1733w
                /* JADX INFO: renamed from: a */
                public final boolean mo5057a(String str) {
                    return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
                }

                @Override // io.sentry.AbstractC1733w
                /* JADX INFO: renamed from: b */
                public final void mo5058b(File file, C1486i0 c1486i0) {
/* 9 */             boolean zMo5057a = mo5057a(file.getName());
/* 13 */            ILogger iLogger = this.f11085h;
                    try {
/* 15 */                if (!zMo5057a) {
/* 29 */                    iLogger.mo4672k(EnumC1553m5.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
/* 32 */                    return;
                        }
                        try {
/* 40 */                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                            try {
/* 45 */                        C1505c c1505cMo4676a = this.f11083f.mo4676a(bufferedInputStream);
/* 49 */                        if (c1505cMo4676a == null) {
/* 63 */                            iLogger.mo4672k(EnumC1553m5.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                                } else {
/* 69 */                            m5334e(c1505cMo4676a, c1486i0);
/* 84 */                            iLogger.mo4672k(EnumC1553m5.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                                }
/* 87 */                        bufferedInputStream.close();
/* 90 */                        Object objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 102 */                       if (!InterfaceC1480h.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) || objM5273b == null) {
/* 112 */                           AbstractC1704c.m5458m(InterfaceC1480h.class, objM5273b, iLogger);
                                } else {
/* 108 */                           m5332c(this, file, (InterfaceC1480h) objM5273b);
                                }
                            } catch (Throwable th) {
                                try {
/* 120 */                           bufferedInputStream.close();
                                } catch (Throwable th2) {
/* 125 */                           th.addSuppressed(th2);
                                }
/* 128 */                       throw th;
                            }
                        } catch (IOException e) {
/* 133 */                   iLogger.mo4671d(EnumC1553m5.ERROR, "Error processing envelope.", e);
/* 136 */                   Object objM5273b2 = c1486i0.m5273b("sentry:typeCheckHint");
/* 148 */                   if (!InterfaceC1480h.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) || objM5273b2 == null) {
/* 158 */                       AbstractC1704c.m5458m(InterfaceC1480h.class, objM5273b2, iLogger);
                            } else {
/* 154 */                       m5332c(this, file, (InterfaceC1480h) objM5273b2);
                            }
                        }
                    } catch (Throwable th3) {
/* 162 */               Object objM5273b3 = c1486i0.m5273b("sentry:typeCheckHint");
/* 174 */               if (!InterfaceC1480h.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) || objM5273b3 == null) {
/* 184 */                   AbstractC1704c.m5458m(InterfaceC1480h.class, objM5273b3, iLogger);
                        } else {
/* 180 */                   m5332c(this, file, (InterfaceC1480h) objM5273b3);
                        }
/* 187 */               throw th3;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final C1671t3 m5333d(C1472h7 c1472h7) {
                    String str;
/* 1 */             ILogger iLogger = this.f11085h;
/* 3 */             if (c1472h7 != null && (str = c1472h7.f10993i) != null) {
                        try {
/* 13 */                    Double dValueOf = Double.valueOf(Double.parseDouble(str));
/* 22 */                    if (AbstractC1704c.m5457l(dValueOf, false)) {
/* 36 */                        String str2 = c1472h7.f10994v;
/* 38 */                        if (str2 != null) {
/* 44 */                            Double dValueOf2 = Double.valueOf(Double.parseDouble(str2));
/* 52 */                            if (AbstractC1704c.m5457l(dValueOf2, false)) {
/* 58 */                                return new C1671t3(Boolean.TRUE, dValueOf, dValueOf2);
                                    }
                                }
/* 69 */                        return AbstractC1704c.m5447b(new C1671t3(Boolean.TRUE, dValueOf));
                            }
/* 32 */                    iLogger.mo4672k(EnumC1553m5.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
                        } catch (Exception unused) {
/* 82 */                    iLogger.mo4672k(EnumC1553m5.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
                        }
                    }
/* 90 */            return new C1671t3(Boolean.TRUE, (Double) null);
                }

                /* JADX INFO: renamed from: e */
                public final void m5334e(C1505c c1505c, C1486i0 c1486i0) {
                    int size;
                    Iterator it;
                    int i;
                    Object objM5273b;
/* 7 */             EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 11 */            Iterable iterable = (Iterable) c1505c.f11043c;
/* 16 */            C1726v4 c1726v4 = (C1726v4) c1505c.f11042b;
/* 20 */            if (iterable instanceof Collection) {
/* 25 */                size = ((Collection) iterable).size();
                    } else {
/* 30 */                Iterator it2 = iterable.iterator();
/* 34 */                int i2 = 0;
/* 39 */                while (it2.hasNext()) {
/* 41 */                    it2.next();
/* 44 */                    i2++;
                        }
/* 47 */                size = i2;
                    }
/* 52 */            Object[] objArr = {Integer.valueOf(size)};
/* 56 */            ILogger iLogger = this.f11085h;
/* 60 */            iLogger.mo4672k(enumC1553m5, "Processing Envelope with %d item(s)", objArr);
/* 63 */            Iterator it3 = iterable.iterator();
/* 67 */            int i3 = 0;
/* 72 */            while (it3.hasNext()) {
/* 78 */                C1160a5 c1160a5 = (C1160a5) it3.next();
/* 81 */                int i4 = i3 + 1;
/* 83 */                C1381b5 c1381b5 = c1160a5.f9799a;
/* 85 */                C1381b5 c1381b6 = c1160a5.f9799a;
/* 87 */                if (c1381b5 == null) {
/* 101 */                   iLogger.mo4672k(EnumC1553m5.ERROR, "Item %d has no header", Integer.valueOf(i4));
/* 104 */                   it = it3;
/* 106 */                   i = i4;
                        } else {
/* 115 */                   boolean zEquals = EnumC1538l5.Event.equals(c1381b5.f10744e);
/* 129 */                   InterfaceC1487i1 interfaceC1487i1 = this.f11084g;
/* 131 */                   it = it3;
/* 133 */                   Charset charset = f11081i;
/* 135 */                   i = i4;
/* 137 */                   InterfaceC1389c1 interfaceC1389c1 = this.f11082e;
/* 139 */                   if (zEquals) {
                                try {
                                    try {
/* 161 */                               BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c1160a5.m4722f()), charset));
                                        try {
/* 170 */                                   C1393c5 c1393c5 = (C1393c5) interfaceC1487i1.mo5064b(bufferedReader, C1393c5.class);
/* 172 */                                   if (c1393c5 == null) {
/* 186 */                                       iLogger.mo4672k(EnumC1553m5.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i), c1381b6.f10744e);
                                            } else {
/* 194 */                                       C1624u c1624u = c1393c5.f11518c;
/* 196 */                                       if (c1624u != null) {
/* 198 */                                           String str = c1624u.f11466a;
/* 206 */                                           if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
/* 228 */                                               c1486i0.m5275d(Boolean.TRUE, "sentry:isFromHybridSdk");
                                                    }
                                                }
/* 234 */                                       C1626w c1626w = c1726v4.f11760a;
/* 236 */                                       if (c1626w == null || c1626w.equals(c1393c5.f11516a)) {
/* 270 */                                           interfaceC1389c1.mo5080B(c1393c5, c1486i0);
/* 283 */                                           iLogger.mo4672k(EnumC1553m5.DEBUG, "Item %d is being captured.", Integer.valueOf(i));
/* 290 */                                           if (!m5335f(c1486i0)) {
/* 300 */                                               iLogger.mo4672k(EnumC1553m5.WARNING, "Timed out waiting for event id submission: %s", c1393c5.f11516a);
/* 303 */                                               bufferedReader.close();
/* 650 */                                               return;
                                                    }
                                                } else {
/* 260 */                                           iLogger.mo4672k(EnumC1553m5.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i), c1726v4.f11760a, c1393c5.f11516a);
/* 263 */                                           bufferedReader.close();
                                                }
                                            }
/* 308 */                                   bufferedReader.close();
                                        } catch (Throwable th) {
                                            try {
/* 313 */                                       bufferedReader.close();
/* 321 */                                       throw th;
                                            } catch (Throwable th2) {
/* 318 */                                       th.addSuppressed(th2);
/* 321 */                                       throw th;
                                            }
                                        }
                                    } catch (Throwable th3) {
/* 268 */                               th = th3;
/* 329 */                               iLogger.mo4671d(EnumC1553m5.ERROR, "Item failed to process.", th);
                                    }
                                } catch (Throwable th4) {
/* 322 */                           th = th4;
                                }
/* 579 */                       objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 585 */                       if (!(objM5273b instanceof InterfaceC1483k) && !((InterfaceC1483k) objM5273b).mo4956e()) {
/* 607 */                           iLogger.mo4672k(EnumC1553m5.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i));
/* 650 */                           return;
                                }
/* 611 */                       Object objM5273b2 = c1486i0.m5273b("sentry:typeCheckHint");
/* 625 */                       if (!C1278v0.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) && objM5273b2 != null) {
/* 629 */                           C1278v0 c1278v0 = (C1278v0) objM5273b2;
/* 637 */                           c1278v0.f10371c = new CountDownLatch(1);
/* 640 */                           c1278v0.f10369a = false;
/* 642 */                           c1278v0.f10370b = false;
                                }
/* 644 */                       it3 = it;
/* 646 */                       i3 = i;
                            } else {
/* 337 */                       EnumC1538l5 enumC1538l5 = EnumC1538l5.Transaction;
/* 339 */                       EnumC1538l5 enumC1538l6 = c1381b5.f10744e;
/* 341 */                       EnumC1538l5 enumC1538l7 = c1381b5.f10744e;
/* 347 */                       if (enumC1538l5.equals(enumC1538l6)) {
                                    try {
                                        try {
/* 367 */                                   BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c1160a5.m4722f()), charset));
                                            try {
/* 376 */                                       C1600f0 c1600f0 = (C1600f0) interfaceC1487i1.mo5064b(bufferedReader2, C1600f0.class);
/* 378 */                                       if (c1600f0 == null) {
/* 392 */                                           iLogger.mo4672k(EnumC1553m5.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i), c1381b6.f10744e);
                                                } else {
/* 398 */                                           C1626w c1626w2 = c1726v4.f11760a;
/* 400 */                                           if (c1626w2 == null || c1626w2.equals(c1600f0.f11516a)) {
/* 436 */                                               C1472h7 c1472h7 = c1726v4.f11762c;
/* 444 */                                               if (c1600f0.f11517b.mo5313i() != null) {
/* 456 */                                                   c1600f0.f11517b.mo5313i().m5070a(m5333d(c1472h7));
                                                        }
/* 460 */                                               interfaceC1389c1.mo5105y(c1600f0, c1472h7, c1486i0, null);
/* 473 */                                               iLogger.mo4672k(EnumC1553m5.DEBUG, "Item %d is being captured.", Integer.valueOf(i));
/* 480 */                                               if (!m5335f(c1486i0)) {
/* 490 */                                                   iLogger.mo4672k(EnumC1553m5.WARNING, "Timed out waiting for event id submission: %s", c1600f0.f11516a);
/* 493 */                                                   bufferedReader2.close();
/* 650 */                                                   return;
                                                        }
                                                    } else {
/* 424 */                                               iLogger.mo4672k(EnumC1553m5.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i), c1726v4.f11760a, c1600f0.f11516a);
/* 427 */                                               bufferedReader2.close();
                                                    }
                                                }
/* 498 */                                       bufferedReader2.close();
                                            } catch (Throwable th5) {
                                                try {
/* 502 */                                           bufferedReader2.close();
/* 510 */                                           throw th5;
                                                } catch (Throwable th6) {
/* 507 */                                           th5.addSuppressed(th6);
/* 510 */                                           throw th5;
                                                }
                                            }
                                        } catch (Throwable th7) {
/* 432 */                                   th = th7;
/* 518 */                                   iLogger.mo4671d(EnumC1553m5.ERROR, "Item failed to process.", th);
                                        }
                                    } catch (Throwable th8) {
/* 511 */                               th = th8;
                                    }
                                } else {
/* 533 */                           interfaceC1389c1.mo5088h(new C1505c(c1726v4.f11760a, c1726v4.f11761b, c1160a5), c1486i0);
/* 552 */                           iLogger.mo4672k(EnumC1553m5.DEBUG, "%s item %d is being captured.", enumC1538l7.getItemType(), Integer.valueOf(i));
/* 559 */                           if (!m5335f(c1486i0)) {
/* 573 */                               iLogger.mo4672k(EnumC1553m5.WARNING, "Timed out waiting for item type submission: %s", enumC1538l7.getItemType());
/* 650 */                               return;
                                    }
                                }
/* 579 */                       objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 585 */                       if (!(objM5273b instanceof InterfaceC1483k)) {
                                }
/* 611 */                       Object objM5273b3 = c1486i0.m5273b("sentry:typeCheckHint");
/* 625 */                       if (!C1278v0.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"))) {
                                }
/* 644 */                       it3 = it;
/* 646 */                       i3 = i;
                            }
                        }
/* 644 */               it3 = it;
/* 646 */               i3 = i;
                    }
                }

                /* JADX INFO: renamed from: f */
                public final boolean m5335f(C1486i0 c1486i0) {
/* 3 */             Object objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 9 */             if (objM5273b instanceof InterfaceC1478f) {
/* 13 */                return ((InterfaceC1478f) objM5273b).mo4955d();
                    }
/* 22 */            AbstractC1704c.m5458m(InterfaceC1478f.class, objM5273b, this.f11085h);
/* 25 */            return true;
                }
            }
