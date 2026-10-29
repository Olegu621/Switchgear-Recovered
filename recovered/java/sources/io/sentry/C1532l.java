            package io.sentry;

            import android.app.ApplicationExitInfo;
            import android.content.Context;
            import androidx.core.app.NotificationCompat;
            import io.sentry.android.core.C1175b1;
            import io.sentry.android.core.C1285x1;
            import io.sentry.android.core.InterfaceC1233j0;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.core.cache.C1180b;
            import io.sentry.android.core.internal.tombstone.C1213c;
            import io.sentry.android.core.internal.tombstone.EnumC1211a;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.featureflags.C1452a;
            import io.sentry.featureflags.C1454c;
            import io.sentry.featureflags.InterfaceC1453b;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1599f;
            import io.sentry.protocol.C1607j;
            import io.sentry.protocol.C1608j0;
            import io.sentry.protocol.C1615o;
            import io.sentry.protocol.C1616p;
            import io.sentry.protocol.C1621r;
            import io.sentry.protocol.C1625v;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.AbstractC1704c;
            import java.io.BufferedInputStream;
            import java.io.BufferedReader;
            import java.io.ByteArrayInputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.nio.charset.StandardCharsets;
            import java.time.Instant;
            import java.time.format.DateTimeFormatter;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Queue;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import p000.C1795jj;
            import p000.C1822k8;
            
            /* JADX INFO: renamed from: io.sentry.l */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public final class C1532l implements InterfaceC1156a1, InterfaceC1233j0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11099a;

                /* JADX INFO: renamed from: b */
                public final Object f11100b;

                /* JADX INFO: renamed from: c */
                public final Object f11101c;

                /* JADX INFO: renamed from: d */
                public final Object f11102d;

                public C1532l(Context context, SentryAndroidOptions sentryAndroidOptions) {
/* 2 */             this.f11099a = 3;
/* 7 */             this.f11100b = sentryAndroidOptions;
/* 14 */            this.f11101c = new C1822k8(sentryAndroidOptions);
/* 16 */            this.f11102d = context;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: A */
                public List mo4677A() {
/* 3 */             CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
/* 14 */            copyOnWriteArrayList.addAll(((InterfaceC1156a1) this.f11100b).mo4677A());
/* 25 */            copyOnWriteArrayList.addAll(((InterfaceC1156a1) this.f11101c).mo4677A());
/* 36 */            copyOnWriteArrayList.addAll(((InterfaceC1156a1) this.f11102d).mo4677A());
/* 39 */            Collections.sort(copyOnWriteArrayList);
/* 42 */            return copyOnWriteArrayList;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: B */
                public List mo4678B() {
/* 5 */             List listMo4678B = ((InterfaceC1156a1) this.f11100b).mo4678B();
/* 13 */            List listMo4678B2 = ((InterfaceC1156a1) this.f11101c).mo4678B();
/* 21 */            List listMo4678B3 = ((InterfaceC1156a1) this.f11102d).mo4678B();
/* 25 */            boolean zIsEmpty = listMo4678B.isEmpty();
/* 29 */            boolean zIsEmpty2 = listMo4678B2.isEmpty();
/* 33 */            boolean zIsEmpty3 = listMo4678B3.isEmpty();
/* 37 */            if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
/* 47 */                return (List) m5340P(listMo4678B, listMo4678B2, listMo4678B3);
                    }
/* 50 */            if (zIsEmpty2 && zIsEmpty3) {
/* 54 */                return listMo4678B;
                    }
/* 55 */            if (zIsEmpty && zIsEmpty3) {
/* 59 */                return listMo4678B2;
                    }
/* 60 */            if (zIsEmpty && zIsEmpty2) {
/* 64 */                return listMo4678B3;
                    }
/* 67 */            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
/* 70 */            copyOnWriteArrayList.addAll(listMo4678B);
/* 73 */            copyOnWriteArrayList.addAll(listMo4678B2);
/* 76 */            copyOnWriteArrayList.addAll(listMo4678B3);
/* 79 */            return copyOnWriteArrayList;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: C */
                public void mo4679C(C1393c5 c1393c5) {
/* 5 */             ((InterfaceC1156a1) this.f11100b).mo4679C(c1393c5);
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: D */
                public C1597e mo4680D() {
/* 5 */             InterfaceC1156a1 interfaceC1156a1 = (InterfaceC1156a1) this.f11100b;
/* 35 */            return new C1514j(interfaceC1156a1.mo4680D(), ((InterfaceC1156a1) this.f11101c).mo4680D(), ((InterfaceC1156a1) this.f11102d).mo4680D(), interfaceC1156a1.mo4699l().getDefaultScopeType());
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: E */
                public C1671t3 mo4681E(InterfaceC1753y3 interfaceC1753y3) {
/* 6 */             return m5341Q(null).mo4681E(interfaceC1753y3);
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: F */
                public String mo4682F() {
/* 5 */             String strMo4682F = ((InterfaceC1156a1) this.f11102d).mo4682F();
/* 9 */             if (strMo4682F != null) {
/* 11 */                return strMo4682F;
                    }
/* 16 */            String strMo4682F2 = ((InterfaceC1156a1) this.f11101c).mo4682F();
                    return strMo4682F2 != null ? strMo4682F2 : ((InterfaceC1156a1) this.f11100b).mo4682F();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: G */
                public void mo4683G(InterfaceC1159a4 interfaceC1159a4) {
/* 6 */             m5341Q(null).mo4683G(interfaceC1159a4);
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: H */
                public void mo4684H(C1626w c1626w) {
/* 5 */             ((InterfaceC1156a1) this.f11100b).mo4684H(c1626w);
/* 12 */            ((InterfaceC1156a1) this.f11101c).mo4684H(c1626w);
/* 19 */            ((InterfaceC1156a1) this.f11102d).mo4684H(c1626w);
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: I */
                public void mo4685I(InterfaceC1549m1 interfaceC1549m1) {
/* 6 */             m5341Q(null).mo4685I(interfaceC1549m1);
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: J */
                public List mo4686J() {
/* 5 */             List listMo4686J = ((InterfaceC1156a1) this.f11102d).mo4686J();
/* 13 */            if (!listMo4686J.isEmpty()) {
/* 15 */                return listMo4686J;
                    }
/* 20 */            List listMo4686J2 = ((InterfaceC1156a1) this.f11101c).mo4686J();
                    return !listMo4686J2.isEmpty() ? listMo4686J2 : ((InterfaceC1156a1) this.f11100b).mo4686J();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: K */
                public C1608j0 mo4687K() {
/* 5 */             C1608j0 c1608j0Mo4687K = ((InterfaceC1156a1) this.f11102d).mo4687K();
/* 9 */             if (c1608j0Mo4687K != null) {
/* 11 */                return c1608j0Mo4687K;
                    }
/* 16 */            C1608j0 c1608j0Mo4687K2 = ((InterfaceC1156a1) this.f11101c).mo4687K();
                    return c1608j0Mo4687K2 != null ? c1608j0Mo4687K2 : ((InterfaceC1156a1) this.f11100b).mo4687K();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: L */
                public C1621r mo4688L() {
/* 5 */             C1621r c1621rMo4688L = ((InterfaceC1156a1) this.f11102d).mo4688L();
/* 9 */             if (c1621rMo4688L != null) {
/* 11 */                return c1621rMo4688L;
                    }
/* 16 */            C1621r c1621rMo4688L2 = ((InterfaceC1156a1) this.f11101c).mo4688L();
                    return c1621rMo4688L2 != null ? c1621rMo4688L2 : ((InterfaceC1156a1) this.f11100b).mo4688L();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: M */
                public List mo4689M() {
/* 7 */             return AbstractC1704c.m5467v((CopyOnWriteArrayList) mo4677A());
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: N */
                public String mo4690N() {
/* 5 */             String strMo4690N = ((InterfaceC1156a1) this.f11102d).mo4690N();
/* 9 */             if (strMo4690N != null) {
/* 11 */                return strMo4690N;
                    }
/* 16 */            String strMo4690N2 = ((InterfaceC1156a1) this.f11101c).mo4690N();
                    return strMo4690N2 != null ? strMo4690N2 : ((InterfaceC1156a1) this.f11100b).mo4690N();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: O */
                public void mo4691O(C1671t3 c1671t3) {
/* 6 */             m5341Q(null).mo4691O(c1671t3);
                }

                /* JADX INFO: renamed from: P */
                public Object m5340P(Object obj, Object obj2, Object obj3) {
/* 19 */            int i = AbstractC1523k.f11076a[((InterfaceC1156a1) this.f11100b).mo4699l().getDefaultScopeType().ordinal()];
/* 22 */            if (i != 2) {
                        return i != 3 ? obj3 : obj;
                    }
/* 29 */            return obj2;
                }

                /* JADX INFO: renamed from: Q */
                public InterfaceC1156a1 m5341Q(EnumC1448f4 enumC1448f4) {
/* 3 */             InterfaceC1156a1 interfaceC1156a1 = (InterfaceC1156a1) this.f11101c;
/* 7 */             InterfaceC1156a1 interfaceC1156a2 = (InterfaceC1156a1) this.f11102d;
/* 11 */            InterfaceC1156a1 interfaceC1156a3 = (InterfaceC1156a1) this.f11100b;
/* 16 */            if (enumC1448f4 != null) {
/* 24 */                int i = AbstractC1523k.f11076a[enumC1448f4.ordinal()];
/* 26 */                if (i == 1) {
/* 39 */                    return interfaceC1156a2;
                        }
/* 28 */                if (i == 2) {
/* 38 */                    return interfaceC1156a1;
                        }
/* 30 */                if (i == 3) {
/* 37 */                    return interfaceC1156a3;
                        }
/* 33 */                if (i == 4) {
/* 36 */                    return this;
                        }
                    }
/* 54 */            int i2 = AbstractC1523k.f11076a[interfaceC1156a3.mo4699l().getDefaultScopeType().ordinal()];
/* 56 */            if (i2 == 1) {
/* 65 */                return interfaceC1156a2;
                    }
/* 58 */            if (i2 != 2) {
                        return i2 != 3 ? interfaceC1156a2 : interfaceC1156a3;
                    }
/* 64 */            return interfaceC1156a1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: R */
                public C1393c5 m5342R(long j, C1393c5 c1393c5, C1486i0 c1486i0) {
                    SentryAndroidOptions sentryAndroidOptions;
                    C1393c5 c1393c6;
                    boolean z;
                    File[] fileArr;
                    String name;
                    C1175b1 c1175b1;
                    C1175b1 c1175b1M6008e;
                    int i;
                    String string;
                    C1532l c1532l;
                    String str;
/* 7 */             SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.f11100b;
/* 12 */            C1822k8 c1822k8 = (C1822k8) this.f11101c;
/* 17 */            ArrayList arrayList = (ArrayList) c1822k8.f12645c;
/* 22 */            SentryAndroidOptions sentryAndroidOptions3 = (SentryAndroidOptions) c1822k8.f12644b;
/* 26 */            int i2 = 0;
/* 27 */            if (c1822k8.f12643a) {
/* 29 */                sentryAndroidOptions = sentryAndroidOptions2;
/* 30 */                c1393c6 = null;
                    } else {
/* 34 */                boolean z2 = true;
/* 35 */                c1822k8.f12643a = true;
/* 37 */                String outboxPath = sentryAndroidOptions3.getOutboxPath();
/* 41 */                if (outboxPath == null) {
/* 53 */                    sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "Outbox path is null, skipping native event collection.", new Object[0]);
                        } else {
/* 62 */                    File[] fileArrListFiles = new File(outboxPath).listFiles();
/* 66 */                    if (fileArrListFiles == null) {
/* 80 */                        sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "Outbox path is not a directory or an I/O error occurred: %s", outboxPath);
                            } else if (fileArrListFiles.length == 0) {
/* 97 */                        sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "No envelope files found in outbox.", new Object[0]);
                            } else {
/* 118 */                       sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "Scanning %d files in outbox for native events.", Integer.valueOf(fileArrListFiles.length));
/* 121 */                       int length = fileArrListFiles.length;
/* 122 */                       int i3 = 0;
/* 123 */                       while (i3 < length) {
/* 125 */                           File file = fileArrListFiles[i3];
/* 131 */                           if (!file.isFile() || (name = file.getName()) == null || name.startsWith("session") || name.startsWith("previous_session") || name.startsWith("startup_crash")) {
/* 474 */                               sentryAndroidOptions2 = sentryAndroidOptions2;
/* 475 */                               c1822k8 = c1822k8;
/* 477 */                               z = z2;
/* 479 */                               fileArr = fileArrListFiles;
                                    } else {
                                        try {
/* 170 */                                   BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
/* 173 */                                   int i4 = i2;
/* 187 */                                   do {
                                                try {
/* 174 */                                           i = bufferedInputStream.read();
/* 180 */                                           c1175b1 = null;
/* 183 */                                           if (i == -1) {
/* 190 */                                               if (i4 > 0) {
                                                            break;
                                                        }
/* 193 */                                               i4 = -1;
                                                        break;
                                                    }
/* 185 */                                           i4++;
                                                } catch (Throwable th) {
/* 392 */                                           th = th;
/* 393 */                                           sentryAndroidOptions2 = sentryAndroidOptions2;
/* 394 */                                           c1822k8 = c1822k8;
/* 396 */                                           z = z2;
/* 398 */                                           fileArr = fileArrListFiles;
/* 400 */                                           c1175b1 = null;
                                                }
/* 187 */                                   } while (i != 10);
/* 194 */                                   if (i4 < 0) {
                                                try {
/* 196 */                                           bufferedInputStream.close();
/* 199 */                                           c1175b1M6008e = null;
/* 201 */                                           sentryAndroidOptions2 = sentryAndroidOptions2;
/* 202 */                                           c1822k8 = c1822k8;
/* 204 */                                           z = z2;
/* 206 */                                           fileArr = fileArrListFiles;
                                                } catch (Throwable th2) {
/* 210 */                                           th = th2;
/* 211 */                                           sentryAndroidOptions2 = sentryAndroidOptions2;
/* 212 */                                           c1822k8 = c1822k8;
/* 214 */                                           z = z2;
/* 216 */                                           fileArr = fileArrListFiles;
/* 438 */                                           sentryAndroidOptions3.getLogger().mo4670b(EnumC1553m5.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
/* 441 */                                           c1175b1M6008e = c1175b1;
                                                }
                                            } else {
/* 220 */                                       boolean z3 = z2;
/* 221 */                                       fileArr = fileArrListFiles;
                                                long j2 = i4;
                                                while (true) {
/* 229 */                                           if (j2 < 209715200) {
                                                        try {
/* 233 */                                                   StringBuilder sb = new StringBuilder();
/* 236 */                                                   z = z3;
                                                            while (true) {
                                                                try {
/* 238 */                                                           int i5 = bufferedInputStream.read();
/* 242 */                                                           if (i5 == -1) {
/* 260 */                                                               if (sb.length() <= 0) {
/* 267 */                                                                   string = null;
                                                                            break;
                                                                        }
/* 262 */                                                               string = sb.toString();
                                                                        break;
                                                                    }
/* 244 */                                                           if (i5 == 10) {
/* 246 */                                                               string = sb.toString();
                                                                        break;
                                                                    }
/* 252 */                                                           sb.append((char) i5);
                                                                } catch (Throwable th3) {
/* 336 */                                                           th = th3;
/* 337 */                                                           sentryAndroidOptions2 = sentryAndroidOptions2;
/* 338 */                                                           c1822k8 = c1822k8;
                                                                }
                                                            }
/* 269 */                                                   if (string != null && !string.isEmpty()) {
/* 291 */                                                       long length2 = j2 + ((long) (string.length() + 1));
/* 293 */                                                       C1795jj c1795jjM6010k = c1822k8.m6010k(string);
/* 297 */                                                       if (c1795jjM6010k != null) {
/* 300 */                                                           int i6 = c1795jjM6010k.f12324a;
/* 310 */                                                           if (NotificationCompat.CATEGORY_EVENT.equals(c1795jjM6010k.f12325b)) {
/* 312 */                                                               c1175b1M6008e = c1822k8.m6008e(bufferedInputStream, i6, file);
/* 316 */                                                               if (c1175b1M6008e != null) {
                                                                            try {
/* 318 */                                                                       bufferedInputStream.close();
/* 321 */                                                                       sentryAndroidOptions2 = sentryAndroidOptions2;
/* 322 */                                                                       c1822k8 = c1822k8;
                                                                            } catch (Throwable th4) {
/* 326 */                                                                       th = th4;
/* 327 */                                                                       sentryAndroidOptions2 = sentryAndroidOptions2;
/* 328 */                                                                       c1822k8 = c1822k8;
/* 438 */                                                                       sentryAndroidOptions3.getLogger().mo4670b(EnumC1553m5.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
/* 441 */                                                                       c1175b1M6008e = c1175b1;
                                                                            }
                                                                        }
                                                                    } else {
/* 346 */                                                               C1822k8.m6006l(bufferedInputStream, i6);
                                                                    }
                                                                    try {
/* 350 */                                                               long j3 = length2 + ((long) i6);
/* 351 */                                                               int i7 = bufferedInputStream.read();
/* 355 */                                                               if (i7 != -1) {
/* 360 */                                                                   j2 = j3 + 1;
/* 361 */                                                                   if (i7 == 10) {
/* 364 */                                                                       sentryAndroidOptions2 = sentryAndroidOptions2;
/* 365 */                                                                       z3 = z;
/* 367 */                                                                       c1822k8 = c1822k8;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th5) {
/* 372 */                                                               th = th5;
/* 340 */                                                               Throwable th6 = th;
                                                                        try {
/* 403 */                                                                   bufferedInputStream.close();
                                                                        } catch (Throwable th7) {
/* 408 */                                                                   th6.addSuppressed(th7);
                                                                        }
/* 411 */                                                               throw th6;
                                                                    }
                                                                }
                                                            }
/* 277 */                                                   sentryAndroidOptions2 = sentryAndroidOptions2;
/* 278 */                                                   c1822k8 = c1822k8;
                                                        } catch (Throwable th8) {
/* 374 */                                                   th = th8;
/* 375 */                                                   c1822k8 = c1822k8;
/* 377 */                                                   z = z3;
/* 379 */                                                   sentryAndroidOptions2 = sentryAndroidOptions2;
                                                        }
                                                    } else {
/* 381 */                                               c1822k8 = c1822k8;
/* 383 */                                               z = z3;
/* 385 */                                               sentryAndroidOptions2 = sentryAndroidOptions2;
                                                    }
                                                    try {
/* 386 */                                               bufferedInputStream.close();
                                                    } catch (Throwable th9) {
/* 390 */                                               th = th9;
/* 438 */                                               sentryAndroidOptions3.getLogger().mo4670b(EnumC1553m5.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
                                                    }
/* 441 */                                           c1175b1M6008e = c1175b1;
                                                }
                                            }
                                        } catch (Throwable th10) {
/* 412 */                                   th = th10;
/* 413 */                                   sentryAndroidOptions2 = sentryAndroidOptions2;
/* 414 */                                   c1822k8 = c1822k8;
/* 416 */                                   z = z2;
/* 418 */                                   fileArr = fileArrListFiles;
/* 420 */                                   c1175b1 = null;
                                        }
/* 443 */                               if (c1175b1M6008e != null) {
/* 445 */                                   arrayList.add(c1175b1M6008e);
/* 470 */                                   sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(c1175b1M6008e.f9971b));
                                        }
                                    }
/* 483 */                           i3++;
/* 485 */                           sentryAndroidOptions2 = sentryAndroidOptions2;
/* 486 */                           fileArrListFiles = fileArr;
/* 488 */                           z2 = z;
/* 490 */                           c1822k8 = c1822k8;
/* 492 */                           i2 = 0;
                                }
/* 495 */                       sentryAndroidOptions = sentryAndroidOptions2;
/* 496 */                       c1393c6 = null;
/* 518 */                       sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "Collected %d native events from outbox.", Integer.valueOf(arrayList.size()));
                            }
                        }
/* 29 */                sentryAndroidOptions = sentryAndroidOptions2;
/* 30 */                c1393c6 = null;
                    }
/* 521 */           Iterator it = arrayList.iterator();
                    while (true) {
/* 529 */               if (it.hasNext()) {
/* 535 */                   C1175b1 c1175b2 = (C1175b1) it.next();
/* 541 */                   long jAbs = Math.abs(j - c1175b2.f9971b);
/* 549 */                   if (jAbs <= 5000) {
/* 567 */                       sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "Matched native event by timestamp (diff: %d ms)", Long.valueOf(jAbs));
/* 570 */                       arrayList.remove(c1175b2);
/* 573 */                       File file2 = c1175b2.f9970a;
                                try {
/* 582 */                           BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
                                    try {
/* 589 */                               C1505c c1505cMo4676a = sentryAndroidOptions3.getEnvelopeReader().mo4676a(bufferedInputStream2);
/* 593 */                               if (c1505cMo4676a != null) {
/* 607 */                                   Iterator it2 = ((Iterable) c1505cMo4676a.f11043c).iterator();
                                            while (true) {
/* 615 */                                       if (it2.hasNext()) {
/* 621 */                                           C1160a5 c1160a5 = (C1160a5) it2.next();
/* 633 */                                           if (EnumC1538l5.Event.equals(c1160a5.f9799a.f10744e)) {
/* 654 */                                               BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c1160a5.m4722f()), StandardCharsets.UTF_8));
                                                        try {
/* 667 */                                                   C1393c5 c1393c7 = (C1393c5) sentryAndroidOptions3.getSerializer().mo5064b(bufferedReader, C1393c5.class);
/* 669 */                                                   if (c1393c7 != null && "native".equals(c1393c7.f11523v)) {
/* 684 */                                                       C1532l c1532l2 = new C1532l(2, c1393c7, file2, c1505cMo4676a);
/* 687 */                                                       bufferedReader.close();
/* 690 */                                                       bufferedInputStream2.close();
                                                                c1532l = c1532l2;
                                                                break;
                                                            }
/* 700 */                                                   bufferedReader.close();
                                                        } catch (Throwable th11) {
                                                            try {
/* 704 */                                                       bufferedReader.close();
/* 712 */                                                       throw th11;
                                                            } catch (Throwable th12) {
/* 709 */                                                       th11.addSuppressed(th12);
/* 712 */                                                       throw th11;
                                                            }
                                                        }
                                                        try {
/* 713 */                                                   bufferedInputStream2.close();
/* 721 */                                                   throw th;
                                                        } catch (Throwable th13) {
/* 718 */                                                   th.addSuppressed(th13);
/* 721 */                                                   throw th;
                                                        }
                                                    }
                                                }
                                            }
                                        }
/* 595 */                               bufferedInputStream2.close();
                                    } catch (Throwable th14) {
/* 713 */                               bufferedInputStream2.close();
/* 721 */                               throw th14;
                                    }
                                } catch (Throwable th15) {
/* 738 */                           sentryAndroidOptions3.getLogger().mo4670b(EnumC1553m5.DEBUG, th15, "Error loading envelope file: %s", file2.getAbsolutePath());
                                }
                            }
                        }
/* 741 */               c1532l = c1393c6;
                        break;
                    }
/* 743 */           if (c1532l == 0) {
/* 756 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "No matching native event found for tombstone.", new Object[0]);
/* 759 */               return c1393c6;
                    }
/* 763 */           File file3 = (File) c1532l.f11101c;
/* 765 */           ILogger logger = sentryAndroidOptions.getLogger();
/* 769 */           EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 781 */           logger.mo4672k(enumC1553m5, "Found matching native event for tombstone, removing from outbox: %s", file3.getName());
                    try {
/* 788 */               if (!file3.delete()) {
/* 993 */                   sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to delete native event file: %s", file3.getAbsolutePath());
/* 1016 */                  return c1393c6;
                        }
/* 804 */               sentryAndroidOptions3.getLogger().mo4672k(enumC1553m5, "Deleted native event file from outbox: %s", file3.getName());
/* 810 */               C1393c5 c1393c8 = (C1393c5) c1532l.f11100b;
/* 812 */               ArrayList arrayListM5107d = c1393c5.m5107d();
/* 816 */               C1599f c1599f = c1393c5.f11514Y;
/* 818 */               ArrayList arrayListM5108e = c1393c5.m5108e();
/* 822 */               if (arrayListM5107d != null && !arrayListM5107d.isEmpty() && c1599f != null && arrayListM5108e != null) {
/* 841 */                   C1615o c1615o = ((C1625v) arrayListM5107d.get(0)).f11476f;
/* 843 */                   if (c1615o != null) {
/* 851 */                       c1615o.f11411a = EnumC1211a.TOMBSTONE_MERGED.getValue();
                            }
/* 853 */                   C1616p c1616p = c1393c8.f10783b0;
/* 855 */                   if (c1616p == null || (str = c1616p.f11421b) == null || str.isEmpty()) {
/* 869 */                       c1393c8.f10783b0 = c1393c5.f10783b0;
                            }
/* 876 */                   c1393c8.f10786e0 = new C1425d2(arrayListM5107d);
/* 878 */                   c1393c8.f11514Y = c1599f;
/* 885 */                   c1393c8.f10785d0 = new C1425d2(arrayListM5108e);
                        }
/* 903 */               for (C1160a5 c1160a6 : (Iterable) ((C1505c) c1532l.f11102d).f11043c) {
                            try {
/* 911 */                       C1381b5 c1381b5 = c1160a6.f9799a;
/* 913 */                       String str2 = c1381b5.f10742c;
/* 919 */                       if (c1381b5.f10744e == EnumC1538l5.Attachment && str2 != null) {
/* 928 */                           byte[] bArrM4722f = c1160a6.m4722f();
/* 932 */                           C1381b5 c1381b6 = c1160a6.f9799a;
                                    try {
/* 945 */                               c1486i0.f11002b.add(new C1154a(str2, c1381b6.f10740a, c1381b6.f10747v, bArrM4722f));
                                    } catch (Throwable th16) {
/* 949 */                               th = th16;
/* 970 */                               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Failed to process envelope item: %s", th.getMessage());
                                    }
                                }
                            } catch (Throwable th17) {
/* 951 */                       th = th17;
                            }
                        }
/* 974 */               return c1393c8;
                    } catch (Throwable th18) {
/* 1013 */              sentryAndroidOptions3.getLogger().mo4670b(EnumC1553m5.ERROR, th18, "Error deleting native event file: %s", file3.getAbsolutePath());
                    }
                }

                @Override // io.sentry.android.core.InterfaceC1233j0
                /* JADX INFO: renamed from: a */
                public int mo4851a() {
/* 1 */             return 5;
                }

                @Override // io.sentry.android.core.InterfaceC1233j0
                /* JADX INFO: renamed from: b */
                public Long mo4852b() {
/* 9 */             return C1180b.m4774h((SentryAndroidOptions) this.f11100b, "last_tombstone_report", "Tombstone");
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: c */
                public void mo4692c(Throwable th, C1162a7 c1162a7, String str) {
/* 5 */             ((InterfaceC1156a1) this.f11100b).mo4692c(th, c1162a7, str);
                }

                @Override // io.sentry.InterfaceC1156a1
                public void clear() {
/* 6 */             m5341Q(null).clear();
                }

                @Override // io.sentry.InterfaceC1156a1
                public InterfaceC1156a1 clone() {
/* 24 */            return new C1532l(0, (InterfaceC1156a1) this.f11100b, ((InterfaceC1156a1) this.f11101c).clone(), ((InterfaceC1156a1) this.f11102d).clone());
                }

                @Override // io.sentry.android.core.InterfaceC1233j0
                /* JADX INFO: renamed from: d */
                public String mo4853d() {
/* 1 */             return "Tombstone";
                }

                @Override // io.sentry.android.core.InterfaceC1233j0
                /* JADX INFO: renamed from: e */
                public boolean mo4854e() {
/* 5 */             return ((SentryAndroidOptions) this.f11100b).isReportHistoricalTombstones();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: f */
                public void mo4693f(C1443f c1443f, C1486i0 c1486i0) {
/* 6 */             m5341Q(null).mo4693f(c1443f, c1486i0);
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: g */
                public InterfaceC1525k1 mo4694g() {
/* 5 */             InterfaceC1525k1 interfaceC1525k1Mo4694g = ((InterfaceC1156a1) this.f11102d).mo4694g();
/* 9 */             if (interfaceC1525k1Mo4694g != null) {
/* 11 */                return interfaceC1525k1Mo4694g;
                    }
/* 16 */            InterfaceC1525k1 interfaceC1525k1Mo4694g2 = ((InterfaceC1156a1) this.f11101c).mo4694g();
                    return interfaceC1525k1Mo4694g2 != null ? interfaceC1525k1Mo4694g2 : ((InterfaceC1156a1) this.f11100b).mo4694g();
                }

                @Override // io.sentry.InterfaceC1156a1
                public Map getAttributes() {
/* 5 */             Map attributes = ((InterfaceC1156a1) this.f11100b).getAttributes();
/* 13 */            Map attributes2 = ((InterfaceC1156a1) this.f11101c).getAttributes();
/* 21 */            Map attributes3 = ((InterfaceC1156a1) this.f11102d).getAttributes();
/* 25 */            boolean zIsEmpty = attributes.isEmpty();
/* 29 */            boolean zIsEmpty2 = attributes2.isEmpty();
/* 33 */            boolean zIsEmpty3 = attributes3.isEmpty();
/* 37 */            if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
/* 47 */                return (Map) m5340P(attributes, attributes2, attributes3);
                    }
/* 50 */            if (zIsEmpty2 && zIsEmpty3) {
/* 54 */                return attributes;
                    }
/* 55 */            if (zIsEmpty && zIsEmpty3) {
/* 59 */                return attributes2;
                    }
/* 60 */            if (zIsEmpty && zIsEmpty2) {
/* 64 */                return attributes3;
                    }
/* 67 */            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
/* 70 */            concurrentHashMap.putAll(attributes);
/* 73 */            concurrentHashMap.putAll(attributes2);
/* 76 */            concurrentHashMap.putAll(attributes3);
/* 79 */            return concurrentHashMap;
                }

                @Override // io.sentry.InterfaceC1156a1
                public Map getExtras() {
/* 5 */             Map extras = ((InterfaceC1156a1) this.f11100b).getExtras();
/* 13 */            Map extras2 = ((InterfaceC1156a1) this.f11101c).getExtras();
/* 21 */            Map extras3 = ((InterfaceC1156a1) this.f11102d).getExtras();
/* 25 */            boolean zIsEmpty = extras.isEmpty();
/* 29 */            boolean zIsEmpty2 = extras2.isEmpty();
/* 33 */            boolean zIsEmpty3 = extras3.isEmpty();
/* 37 */            if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
/* 47 */                return (Map) m5340P(extras, extras2, extras3);
                    }
/* 50 */            if (zIsEmpty2 && zIsEmpty3) {
/* 54 */                return extras;
                    }
/* 55 */            if (zIsEmpty && zIsEmpty3) {
/* 59 */                return extras2;
                    }
/* 60 */            if (zIsEmpty && zIsEmpty2) {
/* 64 */                return extras3;
                    }
/* 67 */            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
/* 70 */            concurrentHashMap.putAll(extras);
/* 73 */            concurrentHashMap.putAll(extras2);
/* 76 */            concurrentHashMap.putAll(extras3);
/* 79 */            return concurrentHashMap;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: h */
                public C1607j mo4695h() {
/* 5 */             return mo4704q().mo5254h();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: i */
                public C1626w mo4696i() {
/* 5 */             C1626w c1626wMo4696i = ((InterfaceC1156a1) this.f11102d).mo4696i();
/* 9 */             C1626w c1626w = C1626w.f11478b;
/* 15 */            if (!c1626w.equals(c1626wMo4696i)) {
/* 17 */                return c1626wMo4696i;
                    }
/* 22 */            C1626w c1626wMo4696i2 = ((InterfaceC1156a1) this.f11101c).mo4696i();
                    return !c1626w.equals(c1626wMo4696i2) ? c1626wMo4696i2 : ((InterfaceC1156a1) this.f11100b).mo4696i();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: j */
                public void mo4697j(C1154a c1154a) {
/* 6 */             m5341Q(null).mo4697j(c1154a);
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: k */
                public void mo4698k(C1626w c1626w) {
/* 6 */             m5341Q(null).mo4698k(c1626w);
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: l */
                public C1554m6 mo4699l() {
/* 5 */             return ((InterfaceC1156a1) this.f11100b).mo4699l();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: m */
                public InterfaceC1549m1 mo4700m() {
/* 5 */             InterfaceC1549m1 interfaceC1549m1Mo4700m = ((InterfaceC1156a1) this.f11102d).mo4700m();
/* 9 */             if (interfaceC1549m1Mo4700m != null) {
/* 11 */                return interfaceC1549m1Mo4700m;
                    }
/* 16 */            InterfaceC1549m1 interfaceC1549m1Mo4700m2 = ((InterfaceC1156a1) this.f11101c).mo4700m();
                    return interfaceC1549m1Mo4700m2 != null ? interfaceC1549m1Mo4700m2 : ((InterfaceC1156a1) this.f11100b).mo4700m();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: n */
                public C1764z6 mo4701n() {
/* 6 */             return m5341Q(null).mo4701n();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: o */
                public C1505c mo4702o() {
/* 6 */             return m5341Q(null).mo4702o();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: p */
                public void mo4703p() {
/* 6 */             m5341Q(null).mo4703p();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: q */
                public InterfaceC1453b mo4704q() {
/* 5 */             C1554m6 c1554m6Mo4699l = ((InterfaceC1156a1) this.f11100b).mo4699l();
/* 13 */            InterfaceC1453b interfaceC1453bMo4704q = ((InterfaceC1156a1) this.f11100b).mo4704q();
/* 21 */            InterfaceC1453b interfaceC1453bMo4704q2 = ((InterfaceC1156a1) this.f11101c).mo4704q();
/* 29 */            InterfaceC1453b interfaceC1453bMo4704q3 = ((InterfaceC1156a1) this.f11102d).mo4704q();
/* 33 */            C1454c c1454c = C1454c.f10945a;
/* 35 */            int maxFeatureFlags = c1554m6Mo4699l.getMaxFeatureFlags();
/* 39 */            if (maxFeatureFlags > 0) {
/* 50 */                C1452a c1452a = interfaceC1453bMo4704q instanceof C1452a ? (C1452a) interfaceC1453bMo4704q : null;
/* 58 */                C1452a c1452a2 = interfaceC1453bMo4704q2 instanceof C1452a ? (C1452a) interfaceC1453bMo4704q2 : null;
/* 66 */                C1452a c1452a3 = interfaceC1453bMo4704q3 instanceof C1452a ? (C1452a) interfaceC1453bMo4704q3 : null;
/* 71 */                CopyOnWriteArrayList copyOnWriteArrayList = c1452a == null ? null : c1452a.f10943a;
/* 77 */                CopyOnWriteArrayList copyOnWriteArrayList2 = c1452a2 == null ? null : c1452a2.f10943a;
/* 83 */                CopyOnWriteArrayList copyOnWriteArrayList3 = c1452a3 == null ? null : c1452a3.f10943a;
/* 90 */                int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
/* 98 */                int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
/* 105 */               int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
/* 109 */               if (size != 0 || size2 != 0 || size3 != 0) {
/* 116 */                   int i = size - 1;
/* 118 */                   int i2 = size2 - 1;
/* 120 */                   int i3 = size3 - 1;
/* 122 */                   if (copyOnWriteArrayList != null && i >= 0 && copyOnWriteArrayList.get(i) != null) {
/* 134 */                       C1697u2.m5431g();
/* 44 */                        return null;
                            }
/* 138 */                   if (copyOnWriteArrayList2 != null && i2 >= 0 && copyOnWriteArrayList2.get(i2) != null) {
/* 150 */                       C1697u2.m5431g();
/* 44 */                        return null;
                            }
/* 154 */                   if (copyOnWriteArrayList3 != null && i3 >= 0 && copyOnWriteArrayList3.get(i3) != null) {
/* 166 */                       C1697u2.m5431g();
/* 44 */                        return null;
                            }
/* 172 */                   LinkedHashMap linkedHashMap = new LinkedHashMap(maxFeatureFlags);
/* 175 */                   linkedHashMap.size();
/* 184 */                   ArrayList arrayList = new ArrayList(linkedHashMap.values());
/* 187 */                   Collections.reverse(arrayList);
/* 197 */                   return new C1452a(maxFeatureFlags, new CopyOnWriteArrayList(arrayList));
                        }
                    }
/* 115 */           return c1454c;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: r */
                public C1764z6 mo4705r() {
/* 5 */             C1764z6 c1764z6Mo4705r = ((InterfaceC1156a1) this.f11102d).mo4705r();
/* 9 */             if (c1764z6Mo4705r != null) {
/* 11 */                return c1764z6Mo4705r;
                    }
/* 16 */            C1764z6 c1764z6Mo4705r2 = ((InterfaceC1156a1) this.f11101c).mo4705r();
                    return c1764z6Mo4705r2 != null ? c1764z6Mo4705r2 : ((InterfaceC1156a1) this.f11100b).mo4705r();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: s */
                public Queue mo4706s() {
/* 5 */             Queue queueMo4706s = ((InterfaceC1156a1) this.f11100b).mo4706s();
/* 13 */            Queue queueMo4706s2 = ((InterfaceC1156a1) this.f11101c).mo4706s();
/* 19 */            InterfaceC1156a1 interfaceC1156a1 = (InterfaceC1156a1) this.f11102d;
/* 21 */            Queue queueMo4706s3 = interfaceC1156a1.mo4706s();
/* 25 */            boolean zIsEmpty = queueMo4706s.isEmpty();
/* 29 */            boolean zIsEmpty2 = queueMo4706s2.isEmpty();
/* 33 */            boolean zIsEmpty3 = queueMo4706s3.isEmpty();
/* 37 */            if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
/* 47 */                return (Queue) m5340P(queueMo4706s, queueMo4706s2, queueMo4706s3);
                    }
/* 50 */            if (zIsEmpty2 && zIsEmpty3) {
/* 54 */                return queueMo4706s;
                    }
/* 55 */            if (zIsEmpty && zIsEmpty3) {
/* 59 */                return queueMo4706s2;
                    }
/* 60 */            if (zIsEmpty && zIsEmpty2) {
/* 64 */                return queueMo4706s3;
                    }
/* 67 */            ArrayList arrayList = new ArrayList();
/* 70 */            arrayList.addAll(queueMo4706s);
/* 73 */            arrayList.addAll(queueMo4706s2);
/* 76 */            arrayList.addAll(queueMo4706s3);
/* 79 */            Collections.sort(arrayList);
/* 90 */            Queue queueM5068a = C1380b4.m5068a(interfaceC1156a1.mo4699l().getMaxBreadcrumbs());
/* 94 */            queueM5068a.addAll(arrayList);
/* 97 */            return queueM5068a;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: t */
                public EnumC1553m5 mo4707t() {
/* 5 */             EnumC1553m5 enumC1553m5Mo4707t = ((InterfaceC1156a1) this.f11102d).mo4707t();
/* 9 */             if (enumC1553m5Mo4707t != null) {
/* 11 */                return enumC1553m5Mo4707t;
                    }
/* 16 */            EnumC1553m5 enumC1553m5Mo4707t2 = ((InterfaceC1156a1) this.f11101c).mo4707t();
                    return enumC1553m5Mo4707t2 != null ? enumC1553m5Mo4707t2 : ((InterfaceC1156a1) this.f11100b).mo4707t();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: u */
                public C1671t3 mo4708u() {
/* 6 */             return m5341Q(null).mo4708u();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: v */
                public C1764z6 mo4709v(InterfaceC1761z3 interfaceC1761z3) {
/* 6 */             return m5341Q(null).mo4709v(interfaceC1761z3);
                }

                @Override // io.sentry.android.core.InterfaceC1233j0
                /* JADX INFO: renamed from: w */
                public C1532l mo4855w(ApplicationExitInfo applicationExitInfo, boolean z) {
/* 4 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f11100b;
                    try {
/* 7 */                 boolean zIsAttachRawTombstone = sentryAndroidOptions.isAttachRawTombstone();
/* 1 */                 InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                        try {
/* 15 */                    if (traceInputStream == null) {
/* 17 */                        ILogger logger = sentryAndroidOptions.getLogger();
/* 21 */                        EnumC1553m5 enumC1553m5 = EnumC1553m5.WARNING;
/* 1 */                         DateTimeFormatter unused = DateTimeFormatter.ISO_INSTANT;
/* 44 */                        logger.mo4672k(enumC1553m5, "No tombstone InputStream available for ApplicationExitInfo from %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())));
/* 47 */                        if (traceInputStream == null) {
/* 6 */                             return null;
                                }
/* 49 */                        traceInputStream.close();
/* 6 */                         return null;
                            }
/* 69 */                    byte[] bArrM5180t = zIsAttachRawTombstone ? AbstractC1417a.m5180t(traceInputStream) : null;
/* 99 */                    C1213c c1213c = new C1213c(zIsAttachRawTombstone ? new ByteArrayInputStream(bArrM5180t) : traceInputStream, sentryAndroidOptions.getInAppIncludes(), sentryAndroidOptions.getInAppExcludes(), ((Context) this.f11102d).getApplicationInfo().nativeLibraryDir);
                            try {
/* 102 */                       C1393c5 c1393c5M4823c = c1213c.m4823c();
/* 106 */                       c1213c.close();
/* 109 */                       traceInputStream.close();
/* 1 */                         long timestamp = applicationExitInfo.getTimestamp();
/* 121 */                       c1393c5M4823c.f10782a0 = new Date(timestamp);
/* 135 */                       C1285x1 c1285x1 = new C1285x1(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z);
/* 138 */                       C1486i0 c1486i0M5450e = AbstractC1704c.m5450e(c1285x1);
/* 142 */                       if (bArrM5180t != null) {
/* 153 */                           c1486i0M5450e.f11007g = new C1154a(bArrM5180t, "tombstone.pb", "application/x-protobuf");
                                }
                                try {
/* 155 */                           C1393c5 c1393c5M5342R = m5342R(timestamp, c1393c5M4823c, c1486i0M5450e);
/* 159 */                           if (c1393c5M5342R != null) {
/* 161 */                               c1393c5M4823c = c1393c5M5342R;
                                    }
                                } catch (Throwable th) {
/* 181 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to merge native event with tombstone, continuing without merge: %s", th.getMessage());
                                }
/* 187 */                       return new C1532l(1, c1393c5M4823c, c1486i0M5450e, c1285x1);
                            } catch (Throwable th2) {
                                try {
/* 193 */                           c1213c.close();
/* 201 */                           throw th2;
                                } catch (Throwable th3) {
/* 198 */                           th2.addSuppressed(th3);
/* 201 */                           throw th2;
                                }
                            }
                        } catch (Throwable th4) {
/* 202 */                   if (traceInputStream == null) {
/* 212 */                       throw th4;
                            }
                            try {
/* 204 */                       traceInputStream.close();
/* 212 */                       throw th4;
                            } catch (Throwable th5) {
/* 209 */                       th4.addSuppressed(th5);
/* 212 */                       throw th4;
                            }
                        }
                    } catch (Throwable th6) {
/* 213 */               ILogger logger2 = sentryAndroidOptions.getLogger();
/* 217 */               EnumC1553m5 enumC1553m6 = EnumC1553m5.WARNING;
/* 1 */                 DateTimeFormatter unused2 = DateTimeFormatter.ISO_INSTANT;
/* 244 */               logger2.mo4672k(enumC1553m6, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th6.getMessage());
/* 6 */                 return null;
                    }
/* 213 */           ILogger logger3 = sentryAndroidOptions.getLogger();
/* 217 */           EnumC1553m5 enumC1553m7 = EnumC1553m5.WARNING;
/* 1 */             DateTimeFormatter unused3 = DateTimeFormatter.ISO_INSTANT;
/* 244 */           logger3.mo4672k(enumC1553m7, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th6.getMessage());
/* 6 */             return null;
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: x */
                public void mo4710x(String str) {
/* 6 */             m5341Q(null).mo4710x(str);
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: y */
                public InterfaceC1445f1 mo4711y() {
/* 5 */             InterfaceC1445f1 interfaceC1445f1Mo4711y = ((InterfaceC1156a1) this.f11102d).mo4711y();
/* 11 */            if (!(interfaceC1445f1Mo4711y instanceof C1760z2)) {
/* 13 */                return interfaceC1445f1Mo4711y;
                    }
/* 18 */            InterfaceC1445f1 interfaceC1445f1Mo4711y2 = ((InterfaceC1156a1) this.f11101c).mo4711y();
                    return !(interfaceC1445f1Mo4711y2 instanceof C1760z2) ? interfaceC1445f1Mo4711y2 : ((InterfaceC1156a1) this.f11100b).mo4711y();
                }

                @Override // io.sentry.InterfaceC1156a1
                /* JADX INFO: renamed from: z */
                public Map mo4712z() {
/* 5 */             Map mapMo4712z = ((InterfaceC1156a1) this.f11100b).mo4712z();
/* 13 */            Map mapMo4712z2 = ((InterfaceC1156a1) this.f11101c).mo4712z();
/* 21 */            Map mapMo4712z3 = ((InterfaceC1156a1) this.f11102d).mo4712z();
/* 25 */            boolean zIsEmpty = mapMo4712z.isEmpty();
/* 29 */            boolean zIsEmpty2 = mapMo4712z2.isEmpty();
/* 33 */            boolean zIsEmpty3 = mapMo4712z3.isEmpty();
/* 37 */            if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
/* 47 */                return (Map) m5340P(mapMo4712z, mapMo4712z2, mapMo4712z3);
                    }
/* 50 */            if (zIsEmpty2 && zIsEmpty3) {
/* 54 */                return mapMo4712z;
                    }
/* 55 */            if (zIsEmpty && zIsEmpty3) {
/* 59 */                return mapMo4712z2;
                    }
/* 60 */            if (zIsEmpty && zIsEmpty2) {
/* 64 */                return mapMo4712z3;
                    }
/* 67 */            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
/* 70 */            concurrentHashMap.putAll(mapMo4712z);
/* 73 */            concurrentHashMap.putAll(mapMo4712z2);
/* 76 */            concurrentHashMap.putAll(mapMo4712z3);
/* 79 */            return concurrentHashMap;
                }

/* 18 */        public /* synthetic */ C1532l(int i, Object obj, Object obj2, Object obj3) {
/* 19 */            this.f11099a = i;
                    this.f11100b = obj;
                    this.f11101c = obj2;
                    this.f11102d = obj3;
                }

                /* JADX INFO: renamed from: clone, reason: collision with other method in class */
/* 27 */        public /* bridge */ /* synthetic */ Object m10494clone() {
                    switch (this.f11099a) {
                        case 0:
/* 28 */                    return clone();
                        default:
                            return super.clone();
                    }
                }
            }
