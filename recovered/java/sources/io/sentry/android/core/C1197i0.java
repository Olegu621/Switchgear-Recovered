            package io.sentry.android.core;

            import android.app.ActivityManager;
            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.os.Build;
            import android.util.DisplayMetrics;
            import io.sentry.AbstractC1552m4;
            import io.sentry.C1383b7;
            import io.sentry.C1393c5;
            import io.sentry.C1425d2;
            import io.sentry.C1428d5;
            import io.sentry.C1486i0;
            import io.sentry.C1554m6;
            import io.sentry.C1573o3;
            import io.sentry.C1581p3;
            import io.sentry.C1666s6;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1388c0;
            import io.sentry.android.core.anr.AbstractC1169c;
            import io.sentry.android.core.anr.AbstractC1171e;
            import io.sentry.android.core.anr.C1167a;
            import io.sentry.android.core.anr.C1168b;
            import io.sentry.android.core.anr.C1170d;
            import io.sentry.android.core.anr.C1172f;
            import io.sentry.android.core.internal.util.C1219f;
            import io.sentry.cache.AbstractC1396a;
            import io.sentry.cache.C1401f;
            import io.sentry.exception.C1440a;
            import io.sentry.hints.InterfaceC1473a;
            import io.sentry.hints.InterfaceC1474b;
            import io.sentry.protocol.C1589a;
            import io.sentry.protocol.C1590a0;
            import io.sentry.protocol.C1594c0;
            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1598e0;
            import io.sentry.protocol.C1599f;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1603h;
            import io.sentry.protocol.C1608j0;
            import io.sentry.protocol.C1615o;
            import io.sentry.protocol.C1620q;
            import io.sentry.protocol.C1621r;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.C1625v;
            import io.sentry.protocol.C1626w;
            import io.sentry.protocol.DebugImage;
            import io.sentry.protocol.profiling.C1617a;
            import io.sentry.protocol.profiling.C1618b;
            import io.sentry.protocol.profiling.C1619c;
            import io.sentry.util.AbstractC1714m;
            import java.io.File;
            import java.nio.charset.Charset;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicInteger;
            import p000.AbstractC0886en;
            import p000.C2261un;
            import p000.kl0;
            
            /* JADX INFO: renamed from: io.sentry.android.core.i0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1197i0 implements InterfaceC1388c0 {

                /* JADX INFO: renamed from: a */
                public final Context f10061a;

                /* JADX INFO: renamed from: b */
                public final SentryAndroidOptions f10062b;

                /* JADX INFO: renamed from: c */
                public final C1248o0 f10063c;

                /* JADX INFO: renamed from: d */
                public final C1428d5 f10064d;

                /* JADX INFO: renamed from: e */
                public final C1401f f10065e;

                /* JADX INFO: renamed from: f */
                public final List f10066f = Collections.singletonList(new C1194h0(this));

                public C1197i0(Context context, C1248o0 c1248o0, SentryAndroidOptions sentryAndroidOptions) {
/* 15 */            Context applicationContext = context.getApplicationContext();
/* 22 */            this.f10061a = applicationContext != null ? applicationContext : context;
/* 24 */            this.f10062b = sentryAndroidOptions;
/* 26 */            this.f10063c = c1248o0;
/* 32 */            this.f10065e = sentryAndroidOptions.findPersistingScopeObserver();
/* 45 */            this.f10064d = new C1428d5(new C1666s6(sentryAndroidOptions, 0));
                }

                /* JADX INFO: renamed from: a */
                public final Object m4808a(C1554m6 c1554m6, String str, Class cls) {
/* 1 */             C1401f c1401f = this.f10065e;
/* 3 */             if (c1401f == null) {
/* 5 */                 return null;
                    }
/* 7 */             return c1401f.m5128b(c1554m6, str, cls);
                }

                /* JADX WARN: Code duplicated, block: B:188:0x043b  */
                /* JADX WARN: Code duplicated, block: B:376:0x081b  */
                /* JADX WARN: Code duplicated, block: B:377:0x0821  */
                /* JADX WARN: Code duplicated, block: B:380:0x084b  */
                /* JADX WARN: Code duplicated, block: B:382:0x0862  */
                /* JADX WARN: Code duplicated, block: B:384:0x08a2  */
                /* JADX WARN: Code duplicated, block: B:386:0x08c7  */
                /* JADX WARN: Code duplicated, block: B:387:0x08d0  */
                /* JADX WARN: Code duplicated, block: B:390:0x08d9  */
                /* JADX WARN: Code duplicated, block: B:396:0x0901  */
                /* JADX WARN: Code duplicated, block: B:398:0x090d  */
                /* JADX WARN: Code duplicated, block: B:402:0x0922  */
                /* JADX WARN: Code duplicated, block: B:406:0x09ac  */
                /* JADX WARN: Code duplicated, block: B:407:0x09ae  */
                /* JADX WARN: Code duplicated, block: B:410:0x09c1  */
                /* JADX WARN: Code duplicated, block: B:412:0x0a22  */
                /* JADX WARN: Code duplicated, block: B:414:0x0a32  */
                /* JADX WARN: Code duplicated, block: B:421:0x0a5a  */
                /* JADX WARN: Code duplicated, block: B:461:0x0ae6  */
                /* JADX WARN: Code duplicated, block: B:539:0x0935 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:542:0x08e3 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:545:0x0912 A[SYNTHETIC] */
                /* JADX WARN: Instruction removed from duplicated block: B:410:0x09c1, please report this as an issue */
                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: f */
                public final C1393c5 mo4754f(C1393c5 c1393c5, C1486i0 c1486i0) {
                    C1194h0 c1194h0;
                    Context context;
                    String str;
                    C1194h0 c1194h1;
                    String str2;
                    String strM4963a;
                    C1393c5 c1393c6;
                    boolean z;
                    SentryAndroidOptions sentryAndroidOptions;
                    C1597e c1597e;
                    ArrayList arrayListM5107d;
                    List list;
                    String cacheDirPath;
                    long time;
                    C2261un c2261un;
                    ArrayList arrayList;
                    boolean z2;
                    C1167a c1167a;
                    ArrayList arrayList2;
                    int i;
                    C1617a c1617a;
                    ArrayList arrayList3;
                    HashMap map;
                    ArrayList arrayList4;
                    HashMap map2;
                    Iterator it;
                    C1597e c1597e2;
                    C1573o3 c1573o3;
                    C1626w c1626w;
                    StackTraceElement[] stackTraceElementArr;
                    StackTraceElement[] stackTraceElementArr2;
                    ArrayList<Integer> arrayList5;
                    int length;
                    int i2;
                    StringBuilder sb;
                    String string;
                    Integer numValueOf;
                    StackTraceElement stackTraceElement;
                    String string2;
                    Integer numValueOf2;
                    C1590a0 c1590a0;
                    Integer numValueOf3;
                    int i3;
                    String str3;
                    DisplayMetrics displayMetrics;
                    String strM4963a2;
                    C1598e0 c1598e0;
                    ArrayList arrayList6;
/* 9 */             Object objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 13 */            boolean z3 = objM5273b instanceof InterfaceC1474b;
/* 16 */            SentryAndroidOptions sentryAndroidOptions2 = this.f10062b;
/* 18 */            if (!z3) {
/* 30 */                sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
/* 3 */                 return c1393c5;
                    }
/* 35 */            InterfaceC1474b interfaceC1474b = (InterfaceC1474b) objM5273b;
/* 39 */            Iterator it2 = this.f10066f.iterator();
/* 60 */            do {
/* 47 */                if (!it2.hasNext()) {
/* 63 */                    c1194h0 = null;
                            break;
                        }
/* 53 */                c1194h0 = (C1194h0) it2.next();
/* 55 */                c1194h0.getClass();
/* 60 */            } while (!(objM5273b instanceof InterfaceC1473a));
/* 68 */            String str4 = "ANR";
/* 71 */            if (c1194h0 != null) {
/* 89 */                boolean zEquals = interfaceC1474b instanceof InterfaceC1473a ? "anr_background".equals(((InterfaceC1473a) interfaceC1474b).mo4962e()) : false;
/* 90 */                C1197i0 c1197i0 = c1194h0.f10049a;
/* 94 */                if (c1393c5.f11523v == null) {
/* 98 */                    c1393c5.f11523v = "java";
                        }
/* 104 */               if (c1393c5.m5107d() == null) {
/* 110 */                   C1615o c1615o = new C1615o();
/* 117 */                   if (interfaceC1474b.mo4957a()) {
/* 126 */                       c1615o.f11411a = "AppExitInfo";
                            } else {
/* 121 */                       c1615o.f11411a = "HistoricalAppExitInfo";
                            }
/* 140 */                   ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(zEquals ? "Background ANR" : "ANR", Thread.currentThread());
/* 143 */                   ArrayList arrayListM5108e = c1393c5.m5108e();
/* 147 */                   if (arrayListM5108e == null) {
/* 176 */                       c1598e0 = null;
                                break;
                            }
/* 149 */                   Iterator it3 = arrayListM5108e.iterator();
                            while (true) {
/* 157 */                       if (!it3.hasNext()) {
/* 176 */                           c1598e0 = null;
                                    break;
                                }
/* 163 */                       c1598e0 = (C1598e0) it3.next();
/* 165 */                       String str5 = c1598e0.f11300c;
/* 167 */                       if (str5 != null && str5.equals("main")) {
                                    break;
                                }
                            }
/* 177 */                   if (c1598e0 == null) {
/* 181 */                       c1598e0 = new C1598e0();
/* 189 */                       c1598e0.f11306w = new C1594c0();
                            }
/* 193 */                   c1197i0.f10064d.getClass();
/* 196 */                   C1594c0 c1594c0 = c1598e0.f11306w;
/* 198 */                   if (c1594c0 == null) {
/* 202 */                       arrayList6 = new ArrayList(0);
                            } else {
/* 208 */                       ArrayList arrayList7 = new ArrayList(1);
/* 219 */                       arrayList7.add(C1428d5.m5195c(applicationNotResponding, c1615o, c1598e0.f11298a, c1594c0.f11285a, true));
/* 222 */                       arrayList6 = arrayList7;
                            }
/* 228 */                   c1393c5.f10786e0 = new C1425d2(arrayList6);
                        }
                    }
/* 230 */           C1597e c1597e3 = c1393c5.f11517b;
/* 232 */           C1620q c1620qMo5311g = c1597e3.mo5311g();
/* 236 */           Context context2 = this.f10061a;
/* 244 */           c1597e3.mo5322r(C1272t0.m4938c(context2, sentryAndroidOptions2).f10332g);
/* 247 */           if (c1620qMo5311g != null) {
/* 249 */               String str6 = c1620qMo5311g.f11436a;
/* 286 */               c1597e3.mo5315k(c1620qMo5311g, (str6 == null || str6.isEmpty()) ? "os_1" : "os_" + str6.trim().toLowerCase(Locale.ROOT));
                    }
/* 289 */           C1603h c1603hMo5309e = c1597e3.mo5309e();
/* 295 */           C1248o0 c1248o0 = this.f10063c;
/* 297 */           if (c1603hMo5309e == null) {
/* 301 */               C1603h c1603h = new C1603h();
/* 306 */               c1603h.f11327b = Build.MANUFACTURER;
/* 310 */               c1603h.f11329c = Build.BRAND;
/* 320 */               c1603h.f11331d = AbstractC1245n0.m4878f(sentryAndroidOptions2.getLogger());
/* 324 */               c1603h.f11333e = Build.MODEL;
/* 328 */               c1603h.f11335f = Build.ID;
/* 332 */               c1603h.f11339i = Build.SUPPORTED_ABIS;
/* 338 */               ActivityManager.MemoryInfo memoryInfoM4879g = AbstractC1245n0.m4879g(context2, sentryAndroidOptions2.getLogger());
/* 344 */               context = context2;
/* 346 */               if (memoryInfoM4879g != null) {
/* 354 */                   c1603h.f11322X = Long.valueOf(memoryInfoM4879g.totalMem);
                        }
/* 360 */               c1603h.f11321W = c1248o0.m4895a();
/* 362 */               ILogger logger = sentryAndroidOptions2.getLogger();
                        try {
/* 370 */                   displayMetrics = context.getResources().getDisplayMetrics();
                        } catch (Throwable th) {
/* 380 */                   logger.mo4671d(EnumC1553m5.ERROR, "Error getting DisplayMetrics.", th);
/* 383 */                   displayMetrics = null;
                        }
/* 384 */               if (displayMetrics != null) {
/* 392 */                   c1603h.f11336f0 = Integer.valueOf(displayMetrics.widthPixels);
/* 400 */                   c1603h.f11337g0 = Integer.valueOf(displayMetrics.heightPixels);
/* 408 */                   c1603h.f11338h0 = Float.valueOf(displayMetrics.density);
/* 416 */                   c1603h.f11340i0 = Integer.valueOf(displayMetrics.densityDpi);
                        }
/* 420 */               if (c1603h.f11343l0 == null) {
                            try {
/* 422 */                       strM4963a2 = AbstractC1287y0.m4963a(context);
                            } catch (Throwable th2) {
/* 434 */                       sentryAndroidOptions2.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting installationId.", th2);
/* 437 */                       strM4963a2 = null;
                            }
/* 438 */                   c1603h.f11343l0 = strM4963a2;
                        }
/* 442 */               ArrayList arrayListM4843a = C1219f.f10159c.m4843a();
/* 450 */               if (!arrayListM4843a.isEmpty()) {
/* 466 */                   c1603h.f11348q0 = Double.valueOf(((Integer) Collections.max(arrayListM4843a)).doubleValue());
/* 476 */                   c1603h.f11347p0 = Integer.valueOf(arrayListM4843a.size());
                        }
/* 478 */               c1597e3.mo5319o(c1603h);
                    } else {
/* 484 */               context = context2;
                    }
/* 490 */           if (!interfaceC1474b.mo4957a()) {
/* 503 */               sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
/* 3 */                 return c1393c5;
                    }
/* 509 */           if (c1393c5.f11519d == null) {
/* 521 */               c1393c5.f11519d = (C1621r) m4808a(sentryAndroidOptions2, "request.json", C1621r.class);
                    }
/* 525 */           if (c1393c5.f11524w == null) {
/* 537 */               c1393c5.f11524w = (C1608j0) m4808a(sentryAndroidOptions2, "user.json", C1608j0.class);
                    }
/* 547 */           Map map3 = (Map) m4808a(sentryAndroidOptions2, "tags.json", Map.class);
/* 549 */           if (map3 != null) {
/* 554 */               if (c1393c5.f11520e == null) {
/* 561 */                   c1393c5.m5383c(new HashMap(map3));
                        } else {
/* 569 */                   Iterator it4 = map3.entrySet().iterator();
/* 577 */                   while (it4.hasNext()) {
/* 583 */                       Map.Entry entry = (Map.Entry) it4.next();
/* 587 */                       Iterator it5 = it4;
/* 597 */                       if (!c1393c5.f11520e.containsKey(entry.getKey())) {
/* 611 */                           c1393c5.m5382b((String) entry.getKey(), (String) entry.getValue());
                                }
/* 614 */                       it4 = it5;
                            }
                        }
                    }
/* 625 */           List list2 = (List) m4808a(sentryAndroidOptions2, "breadcrumbs.json", List.class);
/* 627 */           if (list2 != null) {
/* 630 */               List list3 = c1393c5.f11513X;
/* 632 */               if (list3 == null) {
/* 639 */                   c1393c5.f11513X = new ArrayList(list2);
                        } else {
/* 642 */                   list3.addAll(list2);
                        }
                    }
/* 651 */           Map map4 = (Map) m4808a(sentryAndroidOptions2, "extras.json", Map.class);
/* 653 */           if (map4 != null) {
/* 658 */               if (c1393c5.f11515Z == null) {
/* 670 */                   c1393c5.f11515Z = new HashMap(new HashMap(map4));
                        } else {
/* 679 */                   Iterator it6 = map4.entrySet().iterator();
/* 687 */                   while (it6.hasNext()) {
/* 693 */                       Map.Entry entry2 = (Map.Entry) it6.next();
/* 695 */                       Iterator it7 = it6;
/* 709 */                       if (!c1393c5.f11515Z.containsKey(entry2.getKey())) {
/* 725 */                           c1393c5.f11515Z.put((String) entry2.getKey(), entry2.getValue());
                                }
/* 731 */                       it6 = it7;
/* 733 */                       str4 = str4;
                            }
                        }
                    }
/* 672 */           String str7 = str4;
/* 744 */           C1597e c1597e4 = (C1597e) m4808a(sentryAndroidOptions2, "contexts.json", C1597e.class);
/* 746 */           if (c1597e4 != null) {
/* 760 */               Iterator it8 = new C1597e(c1597e4).f11294a.entrySet().iterator();
/* 768 */               while (it8.hasNext()) {
/* 774 */                   Map.Entry entry3 = (Map.Entry) it8.next();
/* 776 */                   Object value = entry3.getValue();
/* 780 */                   Iterator it9 = it8;
/* 794 */                   if ((!"trace".equals(entry3.getKey()) || !(value instanceof C1383b7)) && !c1597e3.mo5305a(entry3.getKey())) {
/* 819 */                       c1597e3.mo5315k(value, (String) entry3.getKey());
                            }
/* 800 */                   it8 = it9;
                        }
                    }
/* 831 */           String str8 = (String) m4808a(sentryAndroidOptions2, "transaction.json", String.class);
/* 835 */           if (c1393c5.f10788g0 == null) {
/* 837 */               c1393c5.f10788g0 = str8;
                    }
/* 845 */           List list4 = (List) m4808a(sentryAndroidOptions2, "fingerprint.json", List.class);
/* 849 */           if (c1393c5.f10789h0 == null) {
/* 851 */               c1393c5.m5111h(list4);
                    }
/* 862 */           EnumC1553m5 enumC1553m5 = (EnumC1553m5) m4808a(sentryAndroidOptions2, "level.json", EnumC1553m5.class);
/* 866 */           if (c1393c5.f10787f0 == null) {
/* 868 */               c1393c5.f10787f0 = enumC1553m5;
                    }
/* 878 */           C1383b7 c1383b7 = (C1383b7) m4808a(sentryAndroidOptions2, "trace.json", C1383b7.class);
/* 884 */           if (c1597e3.mo5313i() == null && c1383b7 != null) {
/* 888 */               c1597e3.mo5326v(c1383b7);
                    }
/* 897 */           String str9 = (String) m4808a(sentryAndroidOptions2, "replay.json", String.class);
/* 899 */           String cacheDirPath2 = sentryAndroidOptions2.getCacheDirPath();
/* 905 */           if (cacheDirPath2 == null) {
/* 64 */                str2 = "anr_background";
/* 909 */               c1194h1 = c1194h0;
/* 66 */                str = "main";
                    } else {
/* 66 */                str = "main";
/* 919 */               c1194h1 = c1194h0;
/* 64 */                str2 = "anr_background";
/* 936 */               if (!new File(cacheDirPath2, AbstractC0886en.m3507k("replay_", str9)).exists()) {
/* 944 */                   String str10 = (String) AbstractC1396a.m5115c(sentryAndroidOptions2, ".options-cache", "replay-error-sample-rate.json", String.class);
/* 946 */                   if (str10 != null) {
                                try {
/* 964 */                           if (Double.parseDouble(str10) < AbstractC1714m.m5481a().m5480c()) {
/* 980 */                               sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", c1393c5.f11516a);
                                    } else {
/* 992 */                               File[] fileArrListFiles = new File(cacheDirPath2).listFiles();
/* 996 */                               if (fileArrListFiles != null) {
/* 998 */                                   int length2 = fileArrListFiles.length;
/* 999 */                                   long jLastModified = Long.MIN_VALUE;
/* 1001 */                                  String strSubstring = null;
/* 1002 */                                  int i4 = 0;
/* 1003 */                                  while (i4 < length2) {
/* 1005 */                                      File file = fileArrListFiles[i4];
/* 1011 */                                      File[] fileArr = fileArrListFiles;
/* 1013 */                                      if (file.isDirectory() && file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= c1393c5.f10782a0.getTime()) {
/* 1047 */                                          jLastModified = file.lastModified();
/* 1056 */                                          strSubstring = file.getName().substring(7);
                                                }
/* 1060 */                                      i4++;
/* 1062 */                                      fileArrListFiles = fileArr;
                                            }
/* 1065 */                                  str9 = strSubstring;
                                        } else {
/* 1067 */                                  str9 = null;
                                        }
/* 1081 */                              if (str9 != null) {
/* 1084 */                                  Charset charset = C1401f.f10808c;
/* 1088 */                                  AbstractC1396a.m5116d(sentryAndroidOptions2, str9, ".scope-cache", "replay.json");
/* 1093 */                                  c1597e3.mo5315k(str9, "replay_id");
                                        }
                                    }
                                } catch (Throwable th3) {
/* 1077 */                          sentryAndroidOptions2.getLogger().mo4671d(EnumC1553m5.ERROR, "Error parsing replay sample rate.", th3);
                                }
                            }
                        } else if (str9 != null) {
/* 1084 */                  Charset charset2 = C1401f.f10808c;
/* 1088 */                  AbstractC1396a.m5116d(sentryAndroidOptions2, str9, ".scope-cache", "replay.json");
/* 1093 */                  c1597e3.mo5315k(str9, "replay_id");
                        }
                    }
/* 1100 */          if (c1393c5.f11521f == null) {
/* 1108 */              c1393c5.f11521f = (String) AbstractC1396a.m5115c(sentryAndroidOptions2, ".options-cache", "release.json", String.class);
                    }
/* 1112 */          if (c1393c5.f11522i == null) {
/* 1120 */              String environment = (String) AbstractC1396a.m5115c(sentryAndroidOptions2, ".options-cache", "environment.json", String.class);
/* 1122 */              if (environment == null) {
/* 1125 */                  environment = sentryAndroidOptions2.getEnvironment();
                        }
/* 1129 */              c1393c5.f11522i = environment;
                    }
/* 1133 */          if (c1393c5.f11512W == null) {
/* 1143 */              c1393c5.f11512W = (String) AbstractC1396a.m5115c(sentryAndroidOptions2, ".options-cache", "dist.json", String.class);
                    }
/* 1151 */          if (c1393c5.f11512W == null && (str3 = (String) AbstractC1396a.m5115c(sentryAndroidOptions2, ".options-cache", "release.json", String.class)) != null) {
                        try {
/* 1171 */                  c1393c5.f11512W = str3.substring(str3.indexOf(43) + 1);
                        } catch (Throwable unused) {
/* 1184 */                  sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to parse release from scope cache: %s", str3);
                        }
                    }
/* 1187 */          C1599f c1599f = c1393c5.f11514Y;
/* 1189 */          if (c1599f == null) {
/* 1193 */              c1599f = new C1599f();
                    }
/* 1198 */          if (c1599f.f11308b == null) {
/* 1210 */              c1599f.f11308b = new ArrayList(new ArrayList());
                    }
/* 1212 */          List list5 = c1599f.f11308b;
/* 1214 */          if (list5 != null) {
/* 1222 */              String str11 = (String) AbstractC1396a.m5115c(sentryAndroidOptions2, ".options-cache", "proguard-uuid.json", String.class);
/* 1224 */              if (str11 != null) {
/* 1228 */                  DebugImage debugImage = new DebugImage();
/* 1235 */                  debugImage.setType(DebugImage.PROGUARD);
/* 1238 */                  debugImage.setUuid(str11);
/* 1241 */                  list5.add(debugImage);
                        }
/* 1247 */              c1393c5.f11514Y = c1599f;
                    } else {
/* 1250 */              interfaceC1474b = interfaceC1474b;
                    }
/* 1254 */          if (c1393c5.f11518c == null) {
/* 1266 */              c1393c5.f11518c = (C1624u) AbstractC1396a.m5115c(sentryAndroidOptions2, ".options-cache", "sdk-version.json", C1624u.class);
                    }
/* 1268 */          C1589a c1589aMo5308d = c1597e3.mo5308d();
/* 1272 */          if (c1589aMo5308d == null) {
/* 1276 */              c1589aMo5308d = new C1589a();
                    }
/* 1279 */          C1589a c1589a = c1589aMo5308d;
/* 1282 */          Context context3 = context;
/* 1290 */          c1589a.f11246e = (String) AbstractC1245n0.f10219c.m1157c(context3);
/* 1292 */          PackageInfo packageInfoM4880h = AbstractC1245n0.m4880h(context3, c1248o0);
/* 1296 */          if (packageInfoM4880h != null) {
/* 1300 */              c1589a.f11242a = packageInfoM4880h.packageName;
                    }
/* 1302 */          String str12 = c1393c5.f11521f;
/* 1304 */          if (str12 == null) {
/* 1311 */              str12 = (String) AbstractC1396a.m5115c(sentryAndroidOptions2, ".options-cache", "release.json", String.class);
                    }
/* 1313 */          if (str12 != null) {
                        try {
/* 1329 */                  String strSubstring2 = str12.substring(str12.indexOf(64) + 1, str12.indexOf(43));
/* 1339 */                  String strSubstring3 = str12.substring(str12.indexOf(43) + 1);
/* 1343 */                  c1589a.f11247f = strSubstring2;
/* 1345 */                  c1589a.f11248i = strSubstring3;
                        } catch (Throwable unused2) {
/* 1358 */                  sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to parse release from scope cache: %s", str12);
                        }
                    }
                    try {
/* 1365 */              C1242m0 c1242m0 = C1272t0.m4938c(context3, sentryAndroidOptions2).f10331f;
/* 1367 */              if (c1242m0 != null) {
/* 1375 */                  c1589a.f11239W = Boolean.valueOf(c1242m0.f10215a);
/* 1379 */                  String[] strArr = (String[]) c1242m0.f10216b;
/* 1381 */                  if (strArr != null) {
/* 1387 */                      c1589a.f11240X = Arrays.asList(strArr);
                            }
                        }
                    } catch (Throwable th4) {
/* 1399 */              sentryAndroidOptions2.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting split apks info.", th4);
                    }
/* 1402 */          c1597e3.mo5317m(c1589a);
/* 1409 */          Map map5 = (Map) AbstractC1396a.m5115c(sentryAndroidOptions2, ".options-cache", "tags.json", Map.class);
/* 1411 */          if (map5 != null) {
/* 1416 */              if (c1393c5.f11520e == null) {
/* 1423 */                  c1393c5.m5383c(new HashMap(map5));
                        } else {
/* 1439 */                  for (Map.Entry entry4 : map5.entrySet()) {
/* 1457 */                      if (!c1393c5.f11520e.containsKey(entry4.getKey())) {
/* 1471 */                          c1393c5.m5382b((String) entry4.getKey(), (String) entry4.getValue());
                                }
                            }
                        }
                    }
/* 1475 */          C1608j0 c1608j0 = c1393c5.f11524w;
/* 1477 */          if (c1608j0 == null) {
/* 1481 */              c1608j0 = new C1608j0();
/* 1484 */              c1393c5.f11524w = c1608j0;
                    }
/* 1486 */          C1608j0 c1608j1 = c1608j0;
/* 1489 */          if (c1608j1.f11362b == null) {
                        try {
/* 1491 */                  strM4963a = AbstractC1287y0.m4963a(context3);
                        } catch (Throwable th5) {
/* 1503 */                  sentryAndroidOptions2.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting installationId.", th5);
/* 1506 */                  strM4963a = null;
                        }
/* 1507 */              c1608j1.f11362b = strM4963a;
                    }
/* 1511 */          if (c1608j1.f11364d == null && sentryAndroidOptions2.isSendDefaultPii()) {
/* 1521 */              c1608j1.f11364d = "{{auto}}";
                    }
                    try {
/* 1527 */              C1242m0 c1242m1 = C1272t0.m4938c(context3, sentryAndroidOptions2).f10330e;
/* 1529 */              if (c1242m1 != null) {
/* 1533 */                  HashMap map6 = new HashMap();
/* 1544 */                  map6.put("isSideLoaded", String.valueOf(c1242m1.f10215a));
/* 1549 */                  String str13 = (String) c1242m1.f10216b;
/* 1551 */                  if (str13 != null) {
/* 1555 */                      map6.put("installerStore", str13);
                            }
/* 1570 */                  for (Map.Entry entry5 : map6.entrySet()) {
/* 1590 */                      c1393c5.m5382b((String) entry5.getKey(), (String) entry5.getValue());
                            }
                        }
                    } catch (Throwable th6) {
/* 1603 */              sentryAndroidOptions2.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting side loaded info.", th6);
                    }
/* 1606 */          if (c1194h1 == null) {
/* 2832 */              return c1393c5;
                    }
/* 1608 */          InterfaceC1474b interfaceC1474b2 = interfaceC1474b;
/* 1610 */          boolean z4 = interfaceC1474b2 instanceof InterfaceC1473a;
/* 1631 */          boolean zEquals2 = z4 ? str2.equals(((InterfaceC1473a) interfaceC1474b2).mo4962e()) : false;
/* 1633 */          C1197i0 c1197i1 = c1194h1.f10049a;
/* 1635 */          SentryAndroidOptions sentryAndroidOptions3 = c1197i1.f10062b;
/* 1641 */          if (!sentryAndroidOptions3.isAnrProfilingEnabled() || zEquals2 || (cacheDirPath = sentryAndroidOptions3.getCacheDirPath()) == null) {
/* 2651 */              c1393c6 = c1393c5;
/* 2652 */              z = zEquals2;
/* 2654 */              sentryAndroidOptions = sentryAndroidOptions3;
/* 2656 */              c1597e = c1597e3;
                    } else {
/* 1659 */              File file2 = new File(cacheDirPath);
/* 1662 */              if (z4) {
/* 1669 */                  Long lMo4960b = ((InterfaceC1473a) interfaceC1474b2).mo4960b();
                            try {
/* 1673 */                      if (lMo4960b != null) {
/* 1675 */                          time = lMo4960b.longValue();
                                } else {
/* 1681 */                          Date date = c1393c5.f10782a0;
/* 1683 */                          if (date != null) {
/* 1685 */                              time = date.getTime();
                                    } else {
/* 2651 */                              c1393c6 = c1393c5;
/* 2652 */                              z = zEquals2;
/* 2654 */                              sentryAndroidOptions = sentryAndroidOptions3;
/* 2656 */                              c1597e = c1597e3;
                                    }
                                }
/* 1690 */                      AbstractC1171e.m4772b(file2);
/* 1697 */                      File file3 = new File(file2, "anr_profile_old");
/* 1704 */                      if (file3.exists()) {
/* 1717 */                          sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "Reading ANR profile", new Object[0]);
/* 1722 */                          C1170d c1170d = new C1170d(sentryAndroidOptions3, file3);
                                    try {
/* 1733 */                              c2261un = new C2261un(c1170d.f9958a.m5134f());
                                        try {
/* 1736 */                                  c1170d.close();
/* 1739 */                                  i3 = 0;
                                        } catch (Throwable th7) {
/* 1741 */                                  th = th7;
                                            try {
/* 1792 */                                      ILogger logger2 = sentryAndroidOptions3.getLogger();
/* 1796 */                                      EnumC1553m5 enumC1553m6 = EnumC1553m5.INFO;
/* 1800 */                                      logger2.mo4671d(enumC1553m6, "Could not retrieve ANR profile", th);
/* 1807 */                                      if (!AbstractC1171e.m4771a(file2)) {
/* 1816 */                                          sentryAndroidOptions3.getLogger().mo4672k(enumC1553m6, "Could not delete ANR profile file", new Object[0]);
                                                }
                                            } catch (Throwable th8) {
/* 2636 */                                      if (!AbstractC1171e.m4771a(file2)) {
/* 2647 */                                          sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.INFO, "Could not delete ANR profile file", new Object[0]);
                                                }
/* 2650 */                                      throw th8;
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        try {
/* 1747 */                                  c1170d.close();
/* 1755 */                                  throw th9;
                                        } catch (Throwable th10) {
/* 1752 */                                  th9.addSuppressed(th10);
/* 1755 */                                  throw th9;
                                        }
                                    }
                                } else {
/* 1767 */                          i3 = 0;
/* 1770 */                          sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "No ANR profile file found", new Object[0]);
/* 1773 */                          c2261un = null;
                                }
/* 1778 */                      if (!AbstractC1171e.m4771a(file2)) {
/* 1788 */                          sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.INFO, "Could not delete ANR profile file", new Object[i3]);
                                }
                            } catch (Throwable th11) {
/* 1756 */                      th = th11;
/* 1757 */                      c2261un = null;
                            }
/* 1679 */                  long j = time;
/* 1819 */                  if (c2261un == null) {
/* 2651 */                      c1393c6 = c1393c5;
/* 2652 */                      z = zEquals2;
/* 2654 */                      sentryAndroidOptions = sentryAndroidOptions3;
/* 2656 */                      c1597e = c1597e3;
                            } else {
/* 1825 */                      ArrayList<C1172f> arrayList8 = (ArrayList) c2261un.f17602c;
/* 1838 */                      sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.INFO, "ANR profile found", new Object[0]);
/* 1845 */                      if (j < c2261un.f17600a || j > c2261un.f17601b) {
/* 1853 */                          c1393c6 = c1393c5;
/* 1854 */                          z = zEquals2;
/* 1856 */                          sentryAndroidOptions = sentryAndroidOptions3;
/* 1858 */                          c1597e = c1597e3;
/* 2625 */                          sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                } else {
/* 1861 */                          ArrayList arrayList9 = AbstractC1169c.f9957a;
/* 1867 */                          if (arrayList8.isEmpty()) {
/* 1869 */                              arrayList = arrayList8;
/* 1871 */                              z2 = zEquals2;
/* 1872 */                              sentryAndroidOptions = sentryAndroidOptions3;
                                    } else {
/* 1879 */                              HashMap map7 = new HashMap();
/* 1890 */                              for (C1172f c1172f : arrayList8) {
/* 1898 */                                  StackTraceElement[] stackTraceElementArr3 = c1172f.f9961a;
/* 1902 */                                  if (stackTraceElementArr3.length >= 2) {
/* 1906 */                                      int length3 = stackTraceElementArr3.length - 1;
/* 1908 */                                      int i5 = 0;
/* 1909 */                                      while (length3 >= 0) {
/* 1913 */                                          String className = stackTraceElementArr3[length3].getClassName();
/* 1919 */                                          Iterator it10 = AbstractC1169c.f9957a.iterator();
                                                    while (true) {
/* 1927 */                                              if (!it10.hasNext()) {
/* 1949 */                                                  arrayList2 = arrayList8;
/* 1951 */                                                  i5++;
                                                            break;
                                                        }
/* 1933 */                                              arrayList2 = arrayList8;
/* 1943 */                                              if (className.startsWith((String) it10.next())) {
                                                            break;
                                                        }
/* 1946 */                                              arrayList8 = arrayList2;
                                                    }
/* 1957 */                                          float length4 = i5 / (stackTraceElementArr3.length - length3);
/* 1964 */                                          C1168b c1168b = new C1168b(stackTraceElementArr3, length3, stackTraceElementArr3.length - 1);
/* 1971 */                                          C1167a c1167a2 = (C1167a) map7.get(c1168b);
/* 1973 */                                          if (c1167a2 == null) {
/* 1977 */                                              StackTraceElement[] stackTraceElementArr4 = c1172f.f9961a;
/* 1989 */                                              i = length3;
/* 1998 */                                              map7.put(c1168b, new C1167a(stackTraceElementArr4, i, stackTraceElementArr4.length - 1, c1172f.f9962b, length4));
                                                    } else {
/* 2006 */                                              i = length3;
/* 2008 */                                              long j2 = c1172f.f9962b;
/* 2017 */                                              c1167a2.f9951g = Math.min(c1167a2.f9951g, j2);
/* 2025 */                                              c1167a2.f9952h = Math.max(c1167a2.f9952h, j2);
/* 2031 */                                              c1167a2.f9950f++;
                                                    }
/* 2035 */                                          map7 = map7;
/* 2036 */                                          zEquals2 = zEquals2;
/* 2037 */                                          sentryAndroidOptions3 = sentryAndroidOptions3;
/* 2033 */                                          length3 = i - 1;
/* 2040 */                                          arrayList8 = arrayList2;
                                                }
                                            }
                                        }
/* 2044 */                              arrayList = arrayList8;
/* 2046 */                              HashMap map8 = map7;
/* 2047 */                              z2 = zEquals2;
/* 2048 */                              sentryAndroidOptions = sentryAndroidOptions3;
/* 2054 */                              if (!map8.isEmpty()) {
/* 2072 */                                  c1167a = (C1167a) Collections.max(map8.values(), new kl0(4));
                                        }
/* 2074 */                              if (c1167a == null) {
/* 2076 */                                  c1393c6 = c1393c5;
/* 2077 */                                  c1597e = c1597e3;
/* 2078 */                                  z = z2;
                                        } else {
/* 2084 */                                  c1617a = new C1617a();
/* 2089 */                                  arrayList3 = new ArrayList();
/* 2094 */                                  map = new HashMap();
/* 2099 */                                  arrayList4 = new ArrayList();
/* 2104 */                                  map2 = new HashMap();
/* 2107 */                                  it = arrayList.iterator();
/* 2122 */                                  while (it.hasNext()) {
/* 2128 */                                      C1172f c1172f2 = (C1172f) it.next();
/* 2130 */                                      stackTraceElementArr2 = c1172f2.f9961a;
/* 2132 */                                      Iterator it11 = it;
/* 2136 */                                      arrayList5 = new ArrayList();
/* 2139 */                                      boolean z5 = z2;
/* 2141 */                                      length = stackTraceElementArr2.length;
/* 2144 */                                      i2 = 0;
/* 2145 */                                      while (i2 < length) {
/* 2147 */                                          stackTraceElement = stackTraceElementArr2[i2];
/* 2149 */                                          int i6 = i2;
/* 2153 */                                          StringBuilder sb2 = new StringBuilder();
/* 2156 */                                          int i7 = length;
/* 2162 */                                          sb2.append(stackTraceElement.getClassName());
/* 2167 */                                          sb2.append("#");
/* 2170 */                                          C1597e c1597e5 = c1597e3;
/* 2176 */                                          sb2.append(stackTraceElement.getMethodName());
/* 2179 */                                          sb2.append("#");
/* 2186 */                                          sb2.append(stackTraceElement.getFileName());
/* 2189 */                                          sb2.append("#");
/* 2196 */                                          sb2.append(stackTraceElement.getLineNumber());
/* 2199 */                                          string2 = sb2.toString();
/* 2207 */                                          numValueOf2 = (Integer) map.get(string2);
/* 2209 */                                          if (numValueOf2 == null) {
/* 2215 */                                              numValueOf2 = Integer.valueOf(arrayList3.size());
/* 2221 */                                              c1590a0 = new C1590a0();
/* 2228 */                                              c1590a0.f11263d = stackTraceElement.getFileName();
/* 2234 */                                              c1590a0.f11265e = stackTraceElement.getMethodName();
/* 2240 */                                              c1590a0.f11267f = stackTraceElement.getClassName();
/* 2246 */                                              if (stackTraceElement.getLineNumber() > 0) {
/* 2252 */                                                  numValueOf3 = Integer.valueOf(stackTraceElement.getLineNumber());
                                                        } else {
/* 2257 */                                                  numValueOf3 = null;
                                                        }
/* 2258 */                                              c1590a0.f11270i = numValueOf3;
/* 2264 */                                              if (stackTraceElement.isNativeMethod()) {
/* 2268 */                                                  c1590a0.f11254X = Boolean.TRUE;
                                                        }
/* 2270 */                                              arrayList3.add(c1590a0);
/* 2273 */                                              map.put(string2, numValueOf2);
                                                    }
/* 2276 */                                          arrayList5.add(numValueOf2);
/* 2279 */                                          i2 = i6 + 1;
/* 2283 */                                          length = i7;
/* 2285 */                                          c1597e3 = c1597e5;
                                                }
/* 2289 */                                      C1597e c1597e6 = c1597e3;
/* 2293 */                                      sb = new StringBuilder();
/* 2304 */                                      for (Integer num : arrayList5) {
/* 2316 */                                          if (sb.length() > 0) {
/* 2320 */                                              sb.append(",");
                                                    }
/* 2323 */                                          sb.append(num);
                                                }
/* 2327 */                                      string = sb.toString();
/* 2335 */                                      numValueOf = (Integer) map2.get(string);
/* 2337 */                                      if (numValueOf == null) {
/* 2343 */                                          numValueOf = Integer.valueOf(arrayList4.size());
/* 2352 */                                          arrayList4.add(new ArrayList(arrayList5));
/* 2355 */                                          map2.put(string, numValueOf);
                                                }
/* 2360 */                                      C1618b c1618b = new C1618b();
/* 2368 */                                      c1618b.f11429a = c1172f2.f9962b / 1000.0d;
/* 2374 */                                      c1618b.f11430b = numValueOf.intValue();
/* 2376 */                                      c1618b.f11431c = "0";
/* 2380 */                                      c1617a.f11424a.add(c1618b);
/* 2383 */                                      it = it11;
/* 2387 */                                      z2 = z5;
/* 2389 */                                      c1597e3 = c1597e6;
                                            }
/* 2393 */                                  c1597e2 = c1597e3;
/* 2395 */                                  z = z2;
/* 2397 */                                  c1617a.f11426c = arrayList3;
/* 2399 */                                  c1617a.f11425b = arrayList4;
/* 2403 */                                  C1619c c1619c = new C1619c();
/* 2408 */                                  c1619c.f11433a = str;
/* 2411 */                                  c1619c.f11434b = 5;
/* 2417 */                                  c1617a.f11427d = Collections.singletonMap("0", c1619c);
/* 2454 */                                  c1573o3 = new C1573o3(new C1626w(), new C1626w(), null, new HashMap(0), Double.valueOf(j / 1000.0d), "java", c1197i1.f10062b);
/* 2459 */                                  c1573o3.f11190X = c1617a;
/* 2475 */                                  if (C1626w.f11478b.equals(AbstractC1552m4.m5357b().mo5090j(c1573o3))) {
/* 2477 */                                      c1626w = null;
                                            } else {
/* 2479 */                                      c1626w = c1573o3.f11193b;
                                            }
/* 2493 */                                  stackTraceElementArr = (StackTraceElement[]) Arrays.copyOfRange(c1167a.f9947c, c1167a.f9948d, c1167a.f9949e + 1);
/* 2496 */                                  if (stackTraceElementArr.length > 0) {
/* 2500 */                                      StackTraceElement stackTraceElement2 = stackTraceElementArr[0];
/* 2532 */                                      ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(stackTraceElement2.getClassName() + "." + stackTraceElement2.getMethodName());
/* 2535 */                                      applicationNotResponding2.setStackTrace(stackTraceElementArr);
/* 2540 */                                      C1615o c1615o2 = new C1615o();
/* 2545 */                                      c1615o2.f11411a = str7;
/* 2551 */                                      C1440a c1440a = new C1440a(c1615o2, applicationNotResponding2, null, false);
/* 2554 */                                      C1428d5 c1428d5 = c1197i1.f10064d;
/* 2556 */                                      c1428d5.getClass();
/* 2562 */                                      AtomicInteger atomicInteger = new AtomicInteger(-1);
/* 2567 */                                      HashSet hashSet = new HashSet();
/* 2572 */                                      ArrayDeque arrayDeque = new ArrayDeque();
/* 2576 */                                      c1428d5.m5196a(c1440a, atomicInteger, hashSet, arrayDeque, null);
/* 2589 */                                      c1393c6 = c1393c5;
/* 2591 */                                      c1393c6.f10786e0 = new C1425d2(new ArrayList(arrayDeque));
/* 2593 */                                      if (c1626w != null) {
/* 2602 */                                          c1597e = c1597e2;
/* 2604 */                                          c1597e.mo5315k(new C1581p3(c1626w), "profile");
                                                }
                                            } else {
/* 2611 */                                      c1393c6 = c1393c5;
                                            }
/* 2608 */                                  c1597e = c1597e2;
                                        }
                                    }
/* 1874 */                          c1167a = null;
/* 2074 */                          if (c1167a == null) {
/* 2076 */                              c1393c6 = c1393c5;
/* 2077 */                              c1597e = c1597e3;
/* 2078 */                              z = z2;
                                    } else {
/* 2084 */                              c1617a = new C1617a();
/* 2089 */                              arrayList3 = new ArrayList();
/* 2094 */                              map = new HashMap();
/* 2099 */                              arrayList4 = new ArrayList();
/* 2104 */                              map2 = new HashMap();
/* 2107 */                              it = arrayList.iterator();
/* 2122 */                              while (it.hasNext()) {
/* 2128 */                                  C1172f c1172f3 = (C1172f) it.next();
/* 2130 */                                  stackTraceElementArr2 = c1172f3.f9961a;
/* 2132 */                                  Iterator it12 = it;
/* 2136 */                                  arrayList5 = new ArrayList();
/* 2139 */                                  boolean z6 = z2;
/* 2141 */                                  length = stackTraceElementArr2.length;
/* 2144 */                                  i2 = 0;
/* 2145 */                                  while (i2 < length) {
/* 2147 */                                      stackTraceElement = stackTraceElementArr2[i2];
/* 2149 */                                      int i8 = i2;
/* 2153 */                                      StringBuilder sb3 = new StringBuilder();
/* 2156 */                                      int i9 = length;
/* 2162 */                                      sb3.append(stackTraceElement.getClassName());
/* 2167 */                                      sb3.append("#");
/* 2170 */                                      C1597e c1597e7 = c1597e3;
/* 2176 */                                      sb3.append(stackTraceElement.getMethodName());
/* 2179 */                                      sb3.append("#");
/* 2186 */                                      sb3.append(stackTraceElement.getFileName());
/* 2189 */                                      sb3.append("#");
/* 2196 */                                      sb3.append(stackTraceElement.getLineNumber());
/* 2199 */                                      string2 = sb3.toString();
/* 2207 */                                      numValueOf2 = (Integer) map.get(string2);
/* 2209 */                                      if (numValueOf2 == null) {
/* 2215 */                                          numValueOf2 = Integer.valueOf(arrayList3.size());
/* 2221 */                                          c1590a0 = new C1590a0();
/* 2228 */                                          c1590a0.f11263d = stackTraceElement.getFileName();
/* 2234 */                                          c1590a0.f11265e = stackTraceElement.getMethodName();
/* 2240 */                                          c1590a0.f11267f = stackTraceElement.getClassName();
/* 2246 */                                          if (stackTraceElement.getLineNumber() > 0) {
/* 2252 */                                              numValueOf3 = Integer.valueOf(stackTraceElement.getLineNumber());
                                                    } else {
/* 2257 */                                              numValueOf3 = null;
                                                    }
/* 2258 */                                          c1590a0.f11270i = numValueOf3;
/* 2264 */                                          if (stackTraceElement.isNativeMethod()) {
/* 2268 */                                              c1590a0.f11254X = Boolean.TRUE;
                                                    }
/* 2270 */                                          arrayList3.add(c1590a0);
/* 2273 */                                          map.put(string2, numValueOf2);
                                                }
/* 2276 */                                      arrayList5.add(numValueOf2);
/* 2279 */                                      i2 = i8 + 1;
/* 2283 */                                      length = i9;
/* 2285 */                                      c1597e3 = c1597e7;
                                            }
/* 2289 */                                  C1597e c1597e8 = c1597e3;
/* 2293 */                                  sb = new StringBuilder();
/* 2304 */                                  while (r8.hasNext()) {
/* 2316 */                                      if (sb.length() > 0) {
/* 2320 */                                          sb.append(",");
                                                }
/* 2323 */                                      sb.append(num);
                                            }
/* 2327 */                                  string = sb.toString();
/* 2335 */                                  numValueOf = (Integer) map2.get(string);
/* 2337 */                                  if (numValueOf == null) {
/* 2343 */                                      numValueOf = Integer.valueOf(arrayList4.size());
/* 2352 */                                      arrayList4.add(new ArrayList(arrayList5));
/* 2355 */                                      map2.put(string, numValueOf);
                                            }
/* 2360 */                                  C1618b c1618b2 = new C1618b();
/* 2368 */                                  c1618b2.f11429a = c1172f3.f9962b / 1000.0d;
/* 2374 */                                  c1618b2.f11430b = numValueOf.intValue();
/* 2376 */                                  c1618b2.f11431c = "0";
/* 2380 */                                  c1617a.f11424a.add(c1618b2);
/* 2383 */                                  it = it12;
/* 2387 */                                  z2 = z6;
/* 2389 */                                  c1597e3 = c1597e8;
                                        }
/* 2393 */                              c1597e2 = c1597e3;
/* 2395 */                              z = z2;
/* 2397 */                              c1617a.f11426c = arrayList3;
/* 2399 */                              c1617a.f11425b = arrayList4;
/* 2403 */                              C1619c c1619c2 = new C1619c();
/* 2408 */                              c1619c2.f11433a = str;
/* 2411 */                              c1619c2.f11434b = 5;
/* 2417 */                              c1617a.f11427d = Collections.singletonMap("0", c1619c2);
/* 2454 */                              c1573o3 = new C1573o3(new C1626w(), new C1626w(), null, new HashMap(0), Double.valueOf(j / 1000.0d), "java", c1197i1.f10062b);
/* 2459 */                              c1573o3.f11190X = c1617a;
/* 2475 */                              if (C1626w.f11478b.equals(AbstractC1552m4.m5357b().mo5090j(c1573o3))) {
/* 2477 */                                  c1626w = null;
                                        } else {
/* 2479 */                                  c1626w = c1573o3.f11193b;
                                        }
/* 2493 */                              stackTraceElementArr = (StackTraceElement[]) Arrays.copyOfRange(c1167a.f9947c, c1167a.f9948d, c1167a.f9949e + 1);
/* 2496 */                              if (stackTraceElementArr.length > 0) {
/* 2500 */                                  StackTraceElement stackTraceElement3 = stackTraceElementArr[0];
/* 2532 */                                  ApplicationNotResponding applicationNotResponding3 = new ApplicationNotResponding(stackTraceElement3.getClassName() + "." + stackTraceElement3.getMethodName());
/* 2535 */                                  applicationNotResponding3.setStackTrace(stackTraceElementArr);
/* 2540 */                                  C1615o c1615o3 = new C1615o();
/* 2545 */                                  c1615o3.f11411a = str7;
/* 2551 */                                  C1440a c1440a2 = new C1440a(c1615o3, applicationNotResponding3, null, false);
/* 2554 */                                  C1428d5 c1428d6 = c1197i1.f10064d;
/* 2556 */                                  c1428d6.getClass();
/* 2562 */                                  AtomicInteger atomicInteger2 = new AtomicInteger(-1);
/* 2567 */                                  HashSet hashSet2 = new HashSet();
/* 2572 */                                  ArrayDeque arrayDeque2 = new ArrayDeque();
/* 2576 */                                  c1428d6.m5196a(c1440a2, atomicInteger2, hashSet2, arrayDeque2, null);
/* 2589 */                                  c1393c6 = c1393c5;
/* 2591 */                                  c1393c6.f10786e0 = new C1425d2(new ArrayList(arrayDeque2));
/* 2593 */                                  if (c1626w != null) {
/* 2602 */                                      c1597e = c1597e2;
/* 2604 */                                      c1597e.mo5315k(new C1581p3(c1626w), "profile");
                                            }
                                        } else {
/* 2611 */                                  c1393c6 = c1393c5;
                                        }
/* 2608 */                              c1597e = c1597e2;
                                    }
                                }
                            }
                        } else {
/* 2651 */                  c1393c6 = c1393c5;
/* 2652 */                  z = zEquals2;
/* 2654 */                  sentryAndroidOptions = sentryAndroidOptions3;
/* 2656 */                  c1597e = c1597e3;
                        }
                    }
/* 2659 */          if (c1393c6.f10789h0 == null) {
/* 2671 */              if (!sentryAndroidOptions.isEnableAnrFingerprinting() || (arrayListM5107d = c1393c6.m5107d()) == null || arrayListM5107d.isEmpty()) {
/* 2802 */                  c1393c6.m5111h(Arrays.asList("{{ default }}", z ? "background-anr" : "foreground-anr"));
                        } else {
/* 2686 */                  Iterator it13 = arrayListM5107d.iterator();
                            while (true) {
/* 2694 */                      if (it13.hasNext()) {
/* 2702 */                          C1594c0 c1594c1 = ((C1625v) it13.next()).f11475e;
/* 2704 */                          if (c1594c1 != null && (list = c1594c1.f11285a) != null && !list.isEmpty()) {
/* 2716 */                              Iterator it14 = list.iterator();
                                        while (true) {
/* 2724 */                                  if (it14.hasNext()) {
/* 2730 */                                      C1590a0 c1590a1 = (C1590a0) it14.next();
/* 2732 */                                      Boolean bool = c1590a1.f11252V;
/* 2734 */                                      if (bool == null || !bool.booleanValue()) {
/* 2743 */                                          String str14 = c1590a1.f11267f;
/* 2745 */                                          if (str14 != null) {
/* 2749 */                                              Iterator it15 = AbstractC1169c.f9957a.iterator();
                                                        while (true) {
/* 2757 */                                                  if (it15.hasNext()) {
/* 2769 */                                                      if (str14.startsWith((String) it15.next())) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
/* 2802 */                                      c1393c6.m5111h(Arrays.asList("{{ default }}", z ? "background-anr" : "foreground-anr"));
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                } else {
/* 2785 */                          c1393c6.m5111h(Arrays.asList("system-frames-only-anr", z ? "background-anr" : "foreground-anr"));
                                }
                            }
                        }
                    }
/* 2805 */          boolean z7 = !z;
/* 2807 */          C1589a c1589aMo5308d2 = c1597e.mo5308d();
/* 2811 */          if (c1589aMo5308d2 == null) {
/* 2815 */              c1589aMo5308d2 = new C1589a();
/* 2818 */              c1597e.mo5317m(c1589aMo5308d2);
                    }
/* 2823 */          if (c1589aMo5308d2.f11238V != null) {
/* 2833 */              return c1393c6;
                    }
/* 2829 */          c1589aMo5308d2.f11238V = Boolean.valueOf(z7);
/* 2833 */          return c1393c6;
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: g */
                public final C1600f0 mo4755g(C1600f0 c1600f0, C1486i0 c1486i0) {
/* 1 */             return c1600f0;
                }
            }
