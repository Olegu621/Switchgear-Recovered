            package p000;

            import android.app.Application;
            import android.app.Service;
            import android.app.job.JobParameters;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.Intent;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteException;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import android.webkit.ValueCallback;
            import com.google.android.gms.cloudmessaging.CloudMessage;
            import com.google.android.gms.internal.measurement.zzaa;
            import com.google.android.gms.internal.measurement.zzc;
            import com.google.android.gms.internal.measurement.zzcu;
            import com.google.android.gms.internal.measurement.zzd;
            import com.google.android.gms.measurement.internal.zzaf;
            import com.google.android.gms.measurement.internal.zzah;
            import com.google.android.gms.measurement.internal.zzbe;
            import com.google.android.gms.measurement.internal.zzbg;
            import com.google.android.gms.measurement.internal.zzga;
            import com.google.android.gms.measurement.internal.zzjc;
            import com.google.android.gms.measurement.internal.zzpk;
            import com.google.android.gms.measurement.internal.zzr;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.Tasks;
            import com.helpshift.views.HSWebView;
            import com.supercell.titan.C0800g;
            import com.supercell.titan.C0801h;
            import com.supercell.titan.HelpshiftTitan;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Objects;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public final class js0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12467a;

                /* JADX INFO: renamed from: b */
                public Object f12468b;

                /* JADX INFO: renamed from: c */
                public Object f12469c;

                /* JADX INFO: renamed from: d */
                public Object f12470d;

                public js0(js0 js0Var) {
/* 2 */             this.f12467a = 3;
/* 12 */            this.f12469c = new Object();
/* 20 */            this.f12470d = new AtomicBoolean(false);
/* 22 */            this.f12468b = js0Var;
                }

                /* JADX INFO: renamed from: a */
                private final void m5894a() {
                    AtomicReference atomicReference;
/* 3 */             AtomicReference atomicReference2 = (AtomicReference) this.f12468b;
                    synchronized (atomicReference2) {
                        try {
                            try {
/* 8 */                         pn3 pn3Var = (pn3) this.f12470d;
/* 12 */                        ij3 ij3Var = (ij3) pn3Var.f16749a;
/* 14 */                        ki3 ki3Var = ij3Var.f9653e;
/* 16 */                        ij3.m4553j(ki3Var);
/* 29 */                        if (ki3Var.m6116G().m7189i(nk3.ANALYTICS_STORAGE)) {
/* 82 */                            zzga zzgaVar = pn3Var.f15188d;
/* 84 */                            if (zzgaVar != null) {
/* 107 */                               atomicReference2.set(zzgaVar.mo2183k0((zzr) this.f12469c));
/* 114 */                               String str = (String) atomicReference2.get();
/* 116 */                               if (str != null) {
/* 122 */                                   sl3 sl3Var = ((ij3) pn3Var.f16749a).f9642X;
/* 124 */                                   ij3.m4554k(sl3Var);
/* 129 */                                   sl3Var.f16694i.set(str);
/* 132 */                                   ki3 ki3Var2 = ij3Var.f9653e;
/* 134 */                                   ij3.m4553j(ki3Var2);
/* 139 */                                   ki3Var2.f12813i.m8806n(str);
                                        }
/* 142 */                               pn3Var.m7517M();
/* 147 */                               atomicReference = (AtomicReference) this.f12468b;
/* 174 */                               atomicReference.notify();
/* 178 */                               return;
                                    }
/* 86 */                            uh3 uh3Var = ij3Var.f9655f;
/* 88 */                            ij3.m4555l(uh3Var);
/* 95 */                            uh3Var.f17538f.m8510a("Failed to get app instance id");
                                } else {
/* 31 */                            uh3 uh3Var2 = ij3Var.f9655f;
/* 33 */                            ij3.m4555l(uh3Var2);
/* 40 */                            uh3Var2.f17531V.m8510a("Analytics storage consent denied; will not get app instance id");
/* 47 */                            sl3 sl3Var2 = ((ij3) pn3Var.f16749a).f9642X;
/* 49 */                            ij3.m4554k(sl3Var2);
/* 55 */                            sl3Var2.f16694i.set(null);
/* 58 */                            ki3 ki3Var3 = ij3Var.f9653e;
/* 60 */                            ij3.m4553j(ki3Var3);
/* 65 */                            ki3Var3.f12813i.m8806n(null);
/* 68 */                            atomicReference2.set(null);
                                }
/* 71 */                        atomicReference2.notify();
                            } catch (RemoteException e) {
/* 158 */                       uh3 uh3Var3 = ((ij3) ((pn3) this.f12470d).f16749a).f9655f;
/* 160 */                       ij3.m4555l(uh3Var3);
/* 167 */                       uh3Var3.f17538f.m8511b(e, "Failed to get app instance id");
/* 172 */                       atomicReference = (AtomicReference) this.f12468b;
                            }
                        } catch (Throwable th) {
/* 183 */                   ((AtomicReference) this.f12468b).notify();
/* 186 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                private final void m5895b() {
                    up3 up3Var;
/* 5 */             zzcu zzcuVar = (zzcu) this.f12469c;
/* 9 */             pn3 pn3Var = (pn3) this.f12470d;
/* 11 */            String strMo2183k0 = null;
                    try {
                        try {
/* 14 */                    ij3 ij3Var = (ij3) pn3Var.f16749a;
/* 16 */                    ki3 ki3Var = ij3Var.f9653e;
/* 18 */                    uh3 uh3Var = ij3Var.f9655f;
/* 20 */                    ij3.m4553j(ki3Var);
/* 33 */                    if (ki3Var.m6116G().m7189i(nk3.ANALYTICS_STORAGE)) {
/* 68 */                        zzga zzgaVar = pn3Var.f15188d;
/* 70 */                        if (zzgaVar != null) {
/* 93 */                            strMo2183k0 = zzgaVar.mo2183k0((zzr) this.f12468b);
/* 97 */                            if (strMo2183k0 != null) {
/* 99 */                                sl3 sl3Var = ij3Var.f9642X;
/* 101 */                               ij3.m4554k(sl3Var);
/* 106 */                               sl3Var.f16694i.set(strMo2183k0);
/* 109 */                               ij3.m4553j(ki3Var);
/* 114 */                               ki3Var.f12813i.m8806n(strMo2183k0);
                                    }
/* 117 */                           pn3Var.m7517M();
/* 139 */                           up3Var = ((ij3) pn3Var.f16749a).f9668w;
/* 82 */                            ij3.m4553j(up3Var);
/* 85 */                            up3Var.m9105h0(strMo2183k0, zzcuVar);
                                }
/* 72 */                        ij3.m4555l(uh3Var);
/* 77 */                        uh3Var.f17538f.m8510a("Failed to get app instance id");
                            } else {
/* 35 */                        ij3.m4555l(uh3Var);
/* 42 */                        uh3Var.f17531V.m8510a("Analytics storage consent denied; will not get app instance id");
/* 45 */                        sl3 sl3Var2 = ij3Var.f9642X;
/* 47 */                        ij3.m4554k(sl3Var2);
/* 52 */                        sl3Var2.f16694i.set(null);
/* 55 */                        ij3.m4553j(ki3Var);
/* 60 */                        ki3Var.f12813i.m8806n(null);
                            }
/* 80 */                    up3Var = ij3Var.f9668w;
                        } catch (RemoteException e) {
/* 125 */                   uh3 uh3Var2 = ((ij3) pn3Var.f16749a).f9655f;
/* 127 */                   ij3.m4555l(uh3Var2);
/* 132 */                   uh3Var2.f17538f.m8511b(e, "Failed to get app instance id");
                        }
/* 82 */                ij3.m4553j(up3Var);
/* 85 */                up3Var.m9105h0(strMo2183k0, zzcuVar);
                    } catch (Throwable th) {
/* 146 */               up3 up3Var2 = ((ij3) pn3Var.f16749a).f9668w;
/* 148 */               ij3.m4553j(up3Var2);
/* 151 */               up3Var2.m9105h0(null, zzcuVar);
/* 154 */               throw th;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:221:0x05fa A[Catch: all -> 0x05fe, Exception -> 0x0601, TryCatch #19 {all -> 0x05fe, blocks: (B:219:0x05f6, B:221:0x05fa, B:226:0x0603, B:228:0x0607, B:260:0x0652, B:250:0x063d, B:252:0x0641, B:255:0x0647, B:257:0x064b, B:237:0x061b, B:239:0x061f, B:242:0x0625, B:244:0x0629, B:246:0x062d, B:278:0x07d4, B:280:0x07d8, B:283:0x07de, B:285:0x07e2, B:288:0x07ed, B:287:0x07e6, B:198:0x0550, B:201:0x0562, B:203:0x0571, B:205:0x0590, B:209:0x05bb, B:218:0x05e1, B:249:0x0636, B:236:0x0616), top: B:344:0x0550, inners: #9, #10, #18 }] */
                /* JADX WARN: Code duplicated, block: B:228:0x0607 A[Catch: all -> 0x05fe, Exception -> 0x0601, TRY_LEAVE, TryCatch #19 {all -> 0x05fe, blocks: (B:219:0x05f6, B:221:0x05fa, B:226:0x0603, B:228:0x0607, B:260:0x0652, B:250:0x063d, B:252:0x0641, B:255:0x0647, B:257:0x064b, B:237:0x061b, B:239:0x061f, B:242:0x0625, B:244:0x0629, B:246:0x062d, B:278:0x07d4, B:280:0x07d8, B:283:0x07de, B:285:0x07e2, B:288:0x07ed, B:287:0x07e6, B:198:0x0550, B:201:0x0562, B:203:0x0571, B:205:0x0590, B:209:0x05bb, B:218:0x05e1, B:249:0x0636, B:236:0x0616), top: B:344:0x0550, inners: #9, #10, #18 }] */
                /* JADX WARN: Code duplicated, block: B:360:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:43:0x0144  */
                /* JADX WARN: Code duplicated, block: B:46:0x014b  */
                /* JADX WARN: Code duplicated, block: B:47:0x015c  */
                /* JADX WARN: Code duplicated, block: B:49:0x0162  */
                /* JADX WARN: Code duplicated, block: B:51:0x0168  */
                /* JADX WARN: Code duplicated, block: B:54:0x0188  */
                /* JADX WARN: Code duplicated, block: B:57:0x01dc A[Catch: SQLiteException -> 0x01e7, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x01e7, blocks: (B:55:0x01bd, B:57:0x01dc), top: B:329:0x01bd }] */
                /* JADX WARN: Code duplicated, block: B:64:0x020b  */
                /* JADX WARN: Code duplicated, block: B:65:0x020d  */
                /* JADX WARN: Code duplicated, block: B:67:0x0215  */
                /* JADX WARN: Code duplicated, block: B:68:0x021e  */
                /* JADX WARN: Code duplicated, block: B:73:0x0267  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r18v1 */
                /* JADX WARN: Type inference failed for: r18v2 */
                /* JADX WARN: Type inference failed for: r18v3 */
                /* JADX WARN: Type inference failed for: r4v4, types: [int] */
                /* JADX WARN: Type inference failed for: r4v5 */
                /* JADX WARN: Type inference failed for: r4v54 */
                /* JADX WARN: Type inference failed for: r4v55 */
                /* JADX WARN: Type inference failed for: r4v56 */
                /* JADX WARN: Type inference failed for: r4v57 */
                /* JADX WARN: Type inference failed for: r4v58 */
                /* JADX WARN: Type inference failed for: r4v9 */
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    boolean z;
                    String str;
                    boolean z2;
                    ?? r4;
                    at0 at0Var;
                    at0 at0Var2;
                    Object objCall;
                    int i;
                    Task taskM9134d;
                    zzbe zzbeVar;
                    Cursor cursor;
                    Cursor cursorQuery;
                    pp3 pp3Var;
                    String str2;
                    int i2;
                    kp3 kp3Var;
                    ae3 ae3Var;
                    Long lValueOf;
                    ContentValues contentValues;
                    uh3 uh3Var;
/* 7 */             int i3 = 4;
/* 8 */             int i4 = 2;
/* 10 */            boolean z3 = false;
                    switch (this.f12467a) {
                        case 0:
/* 2124 */                  HSWebView hSWebView = ((ls0) this.f12470d).f13478c;
/* 2126 */                  if (hSWebView == null) {
/* 2140 */                      return;
                            }
/* 2137 */                  hSWebView.evaluateJavascript((String) this.f12468b, (ValueCallback) this.f12469c);
/* 2140 */                  return;
                        case 1:
/* 2041 */                  if (((ec0) ((wc0) this.f12470d).f18577b) == null) {
/* 2119 */                      return;
                            }
/* 2046 */                  String str3 = (String) this.f12468b;
/* 2050 */                  HashMap map = (HashMap) this.f12469c;
/* 2052 */                  str3.getClass();
                            switch (str3) {
                                case "helpshiftSessionStarted":
/* 2117 */                          HelpshiftTitan.f5806m = true;
/* 2119 */                          return;
                                case "receivedUnreadMessageCount":
/* 2114 */                          HelpshiftTitan.f5794a = ((Integer) map.get("count")).intValue();
/* 2119 */                          return;
                                case "helpshiftSessionEnded":
/* 2099 */                          HelpshiftTitan.f5806m = false;
/* 2119 */                          return;
                                default:
/* 2119 */                          return;
                            }
                        case 2:
/* 1356 */                  ll1 ll1Var = ((rs0) this.f12468b).f16278w;
                            synchronized (ll1Var) {
                                try {
                                    try {
                                        try {
/* 1365 */                                  int i5 = ll1Var.f13382a.getInt("migration_state", 0);
/* 1371 */                                  boolean zM6486b = ll1Var.m6486b("__hs__db_support_key_values");
                                            try {
/* 1375 */                                      if (zM6486b && i5 == 0) {
/* 1394 */                                          ll1Var.f13383b = new at0(ll1Var.f13385d, "__hs__db_support_key_values", null, 1, 0);
/* 1417 */                                          ll1Var.f13386e = new at0(ll1Var.f13385d, "__hs_db_helpshift_users", null, 2, 1);
/* 1419 */                                          int i6 = 0;
/* 1420 */                                          boolean zM6488d = false;
/* 1421 */                                          boolean zM6490f = false;
/* 1422 */                                          boolean zM6489e = false;
                                                    try {
/* 1423 */                                              while (i6 < 3) {
/* 1428 */                                                  ll1Var.f13390i++;
/* 1430 */                                                  zM6488d = ll1Var.m6488d();
/* 1434 */                                                  zM6490f = ll1Var.m6490f();
/* 1440 */                                                  ll1Var.m6487c("User data migration", zM6490f);
/* 1445 */                                                  ll1Var.m6493j("User Data : ", zM6490f);
/* 1448 */                                                  zM6489e = ll1Var.m6489e();
/* 1454 */                                                  ll1Var.m6487c("Legacy analytics event ID data migration", zM6489e);
/* 1459 */                                                  ll1Var.m6493j("Legacy Analytics Id : ", zM6489e);
/* 1462 */                                                  if (zM6488d && zM6490f && zM6489e) {
/* 1499 */                                                      if (zM6488d && zM6490f && zM6489e) {
                                                                }
/* 1524 */                                                      ll1Var.f13382a.edit().putInt("migration_state", r2).commit();
/* 1527 */                                                      at0Var = ll1Var.f13383b;
/* 1529 */                                                      if (at0Var != null) {
/* 1531 */                                                          at0Var.close();
                                                                }
/* 1540 */                                                      at0Var2 = ll1Var.f13386e;
/* 1392 */                                                      r4 = true;
/* 1542 */                                                      if (at0Var2 != null) {
/* 1544 */                                                          at0Var2.close();
/* 1392 */                                                          r4 = true;
                                                                }
                                                            } else {
/* 1468 */                                                      xi1 xi1Var = ll1Var.f13387f;
/* 1472 */                                                      StringBuilder sb = new StringBuilder();
/* 1477 */                                                      sb.append("Native SDK to SDK X migration failed! Attempt : ");
/* 1480 */                                                      i6++;
/* 1482 */                                                      sb.append(i6);
/* 1489 */                                                      xi1Var.m9969a(sb.toString(), null);
                                                            }
                                                            break;
                                                        }
/* 1527 */                                              at0Var = ll1Var.f13383b;
/* 1529 */                                              if (at0Var != null) {
/* 1531 */                                                  at0Var.close();
                                                        }
/* 1540 */                                              at0Var2 = ll1Var.f13386e;
/* 1392 */                                              r4 = true;
/* 1542 */                                              if (at0Var2 != null) {
/* 1544 */                                                  at0Var2.close();
/* 1392 */                                                  r4 = true;
                                                        }
                                                    } catch (Exception e) {
/* 1538 */                                              e = e;
/* 1548 */                                              str = "Helpshift_Migrator";
/* 1392 */                                              z2 = true;
/* 1619 */                                              AbstractC1245n0.m4877e(str, "Error closing DB instance", e);
                                                        r4 = z2;
                                                    }
/* 1499 */                                          if (zM6488d) {
                                                    }
/* 1524 */                                          ll1Var.f13382a.edit().putInt("migration_state", r2).commit();
                                                } else {
/* 1557 */                                          r4 = 1;
/* 1561 */                                          ll1Var.f13387f.getClass();
                                                    try {
/* 1564 */                                              at0 at0Var3 = ll1Var.f13383b;
/* 1566 */                                              if (at0Var3 != null) {
/* 1568 */                                                  at0Var3.close();
                                                        }
/* 1574 */                                              at0 at0Var4 = ll1Var.f13386e;
/* 1576 */                                              if (at0Var4 != null) {
/* 1578 */                                                  at0Var4.close();
                                                        }
                                                    } catch (Exception e2) {
/* 1586 */                                              AbstractC1245n0.m4877e("Helpshift_Migrator", "Error closing DB instance", e2);
                                                    }
                                                }
                                            } catch (Exception e3) {
/* 1497 */                                      e = e3;
                                                z = zM6486b;
/* 1595 */                                      ll1Var.f13387f.m9969a("Migration failed with exception", e);
                                                try {
/* 1598 */                                          at0 at0Var5 = ll1Var.f13383b;
/* 1600 */                                          if (at0Var5 != null) {
/* 1602 */                                              at0Var5.close();
                                                    }
/* 1608 */                                          at0 at0Var6 = ll1Var.f13386e;
                                                    r4 = z;
/* 1610 */                                          if (at0Var6 != null) {
/* 1612 */                                              at0Var6.close();
                                                        r4 = z;
                                                    }
                                                } catch (Exception e4) {
/* 1606 */                                          e = e4;
/* 1616 */                                          str = "Helpshift_Migrator";
                                                    z2 = z;
/* 1619 */                                          AbstractC1245n0.m4877e(str, "Error closing DB instance", e);
                                                    r4 = z2;
                                                }
                                            }
                                        } catch (Exception e5) {
/* 1553 */                                  e = e5;
/* 1554 */                                  z = true;
                                        }
                                        break;
                                    } catch (Throwable th) {
                                        try {
/* 2005 */                                  at0 at0Var7 = ll1Var.f13383b;
/* 2007 */                                  if (at0Var7 != null) {
/* 2009 */                                      at0Var7.close();
                                            }
/* 2015 */                                  at0 at0Var8 = ll1Var.f13386e;
/* 2017 */                                  if (at0Var8 == null) {
/* 2030 */                                      throw th;
                                            }
/* 2019 */                                  at0Var8.close();
/* 2030 */                                  throw th;
                                        } catch (Exception e6) {
/* 2027 */                                  AbstractC1245n0.m4877e("Helpshift_Migrator", "Error closing DB instance", e6);
/* 2030 */                                  throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
/* 2032 */                          throw th2;
                                }
                            }
/* 1625 */                  rs0 rs0Var = (rs0) this.f12468b;
/* 1629 */                  Application application = (Application) this.f12469c;
/* 1631 */                  rs0Var.getClass();
/* 1644 */                  rs0Var.f16277v = new ScheduledThreadPoolExecutor((int) r4, new qs0(0));
/* 1648 */                  er0 er0Var = rs0Var.f16269n;
/* 1650 */                  C0210cb c0210cb = new C0210cb(i4, application, er0Var);
/* 1653 */                  rs0Var.f16273r = c0210cb;
/* 1657 */                  ra2 ra2Var = rs0Var.f16271p;
/* 1661 */                  C0168b5 c0168b5 = new C0168b5(8);
/* 1664 */                  c0168b5.f2211b = application;
/* 1666 */                  c0168b5.f2212c = c0210cb;
/* 1668 */                  c0168b5.f2213d = er0Var;
/* 1670 */                  c0168b5.f2215f = ra2Var;
/* 1672 */                  rs0Var.f16263h = c0168b5;
/* 1676 */                  ts0 ts0Var = new ts0();
/* 1679 */                  ts0Var.f17248a = er0Var;
/* 1681 */                  rs0Var.f16270o = ts0Var;
/* 1690 */                  rs0Var.f16262g = new ec0(12);
/* 1694 */                  ra2 ra2Var2 = new ra2();
/* 1702 */                  ra2Var2.f15957c = new HashMap();
/* 1709 */                  ra2Var2.f15958d = new HashMap();
/* 1711 */                  ra2Var2.f15955a = er0Var;
/* 1713 */                  ra2Var2.f15956b = c0210cb;
/* 1715 */                  rs0Var.f16264i = ra2Var2;
/* 1719 */                  ra2 ra2Var3 = rs0Var.f16271p;
/* 1721 */                  wc0 wc0Var = new wc0(12, ra2Var3, z3);
/* 1724 */                  rs0Var.f16272q = wc0Var;
/* 1728 */                  C0210cb c0210cb2 = rs0Var.f16273r;
/* 1730 */                  er0 er0Var2 = rs0Var.f16269n;
/* 1732 */                  ec0 ec0Var = rs0Var.f16262g;
/* 1734 */                  ts0 ts0Var2 = rs0Var.f16270o;
/* 1736 */                  qi1 qi1Var = new qi1();
/* 1739 */                  qi1Var.f15577f = c0210cb2;
/* 1741 */                  qi1Var.f15572a = er0Var2;
/* 1743 */                  qi1Var.f15573b = ra2Var3;
/* 1745 */                  qi1Var.f15576e = wc0Var;
/* 1747 */                  qi1Var.f15574c = ec0Var;
/* 1749 */                  qi1Var.f15575d = ts0Var2;
/* 1757 */                  C1969nm c1969nm = new C1969nm(er0Var2, qi1Var, ts0Var2, ra2Var3, rs0Var.f16263h);
/* 1760 */                  rs0Var.f16261f = c1969nm;
/* 1764 */                  ra2 ra2Var4 = rs0Var.f16264i;
/* 1766 */                  C0210cb c0210cb3 = rs0Var.f16273r;
/* 1768 */                  C1773iy c1773iy = new C1773iy();
/* 1776 */                  c1773iy.f11959e = new ArrayList();
/* 1778 */                  c1773iy.f11955a = er0Var;
/* 1780 */                  c1773iy.f11956b = ra2Var4;
/* 1782 */                  c1773iy.f11957c = c0210cb3;
/* 1784 */                  c1773iy.f11958d = c1969nm;
/* 1791 */                  c1773iy.f11961i = new ArrayList();
/* 1793 */                  rs0Var.f16260e = c1773iy;
/* 1797 */                  C0210cb c0210cb4 = rs0Var.f16273r;
/* 1799 */                  er0 er0Var3 = rs0Var.f16269n;
/* 1801 */                  ts0 ts0Var3 = rs0Var.f16270o;
/* 1803 */                  C1969nm c1969nm2 = rs0Var.f16261f;
/* 1805 */                  C0168b5 c0168b6 = rs0Var.f16263h;
/* 1807 */                  ec0 ec0Var2 = rs0Var.f16262g;
/* 1809 */                  wc0 wc0Var2 = rs0Var.f16272q;
/* 1811 */                  C1773iy c1773iy2 = new C1773iy();
/* 1814 */                  c1773iy2.f11955a = c0210cb4;
/* 1816 */                  c1773iy2.f11956b = er0Var3;
/* 1818 */                  c1773iy2.f11957c = ts0Var3;
/* 1820 */                  c1773iy2.f11958d = c1969nm2;
/* 1822 */                  c1773iy2.f11959e = c0168b6;
/* 1824 */                  c1773iy2.f11960f = ec0Var2;
/* 1826 */                  c1773iy2.f11961i = wc0Var2;
/* 1830 */                  ub0 ub0Var = new ub0();
/* 1835 */                  ub0Var.f17435a = 5000;
/* 1840 */                  ub0Var.f17436b = 60000;
/* 1842 */                  ub0Var.f17437c = 5000;
/* 1846 */                  ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = rs0Var.f16277v;
/* 1848 */                  jt1 jt1Var = new jt1();
/* 1851 */                  jt1Var.f12478a = c1773iy2;
/* 1853 */                  jt1Var.f12481d = c1969nm2;
/* 1855 */                  jt1Var.f12480c = ub0Var;
/* 1857 */                  jt1Var.f12479b = scheduledThreadPoolExecutor;
/* 1863 */                  C0210cb c0210cb5 = new C0210cb(28, false ? 1 : 0);
/* 1866 */                  c0210cb5.f2804b = jt1Var;
/* 1868 */                  c0210cb5.f2805c = c1969nm2;
/* 1870 */                  rs0Var.f16274s = c0210cb5;
/* 1872 */                  c1969nm2.f14376d = c0210cb5;
/* 1874 */                  c1969nm2.f14377e = c1773iy2;
/* 1878 */                  ra2 ra2Var5 = rs0Var.f16264i;
/* 1880 */                  ra2 ra2Var6 = rs0Var.f16271p;
/* 1882 */                  xy1 xy1Var = new xy1();
/* 1885 */                  xy1Var.f19393a = c0210cb4;
/* 1887 */                  xy1Var.f19394b = c1969nm2;
/* 1889 */                  xy1Var.f19395c = er0Var3;
/* 1891 */                  xy1Var.f19396d = ra2Var5;
/* 1893 */                  xy1Var.f19397e = ra2Var6;
/* 1895 */                  xy1Var.f19398f = ec0Var2;
/* 1897 */                  rs0Var.f16265j = xy1Var;
/* 1903 */                  C0875ec c0875ec = new C0875ec(24);
/* 1906 */                  c0875ec.f7615d = c1773iy;
/* 1908 */                  rs0Var.f16275t = c0875ec;
/* 1919 */                  rs0Var.f16276u = new C0168b5(er0Var3, c1773iy2, c1969nm2, wc0Var2, ra2Var6, 11);
/* 1923 */                  Application application2 = (Application) this.f12469c;
/* 1931 */                  Object obj = ((HashMap) this.f12470d).get("manualLifecycleTracking");
/* 1950 */                  ?? r18 = ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) ? r4 : 0;
/* 1954 */                  if (fs0.f8337c == null) {
/* 1961 */                      fs0.f8337c = new fs0((int) (false ? 1 : 0), false ? 1 : 0);
                            }
/* 1963 */                  fs0 fs0Var = fs0.f8337c;
/* 1969 */                  ec0 ec0Var3 = new ec0(11);
/* 1976 */                  if (((pg3) fs0Var.f8339b) != null) {
/* 2004 */                      return;
                            }
/* 1979 */                  if (r18 != 0) {
/* 1986 */                      fs0Var.f8339b = new nb1(ec0Var3);
/* 2004 */                      return;
                            }
/* 1991 */                  u50 u50Var = new u50(ec0Var3);
/* 1994 */                  u50Var.f17359U = false;
/* 1996 */                  application2.unregisterActivityLifecycleCallbacks(u50Var);
/* 1999 */                  application2.registerActivityLifecycleCallbacks(u50Var);
/* 2002 */                  fs0Var.f8339b = u50Var;
/* 2004 */                  return;
                        case 3:
                            synchronized (this.f12469c) {
                                try {
                                    try {
/* 1317 */                              ((js0) this.f12468b).run();
/* 1324 */                              ((AtomicBoolean) this.f12470d).set(true);
/* 1329 */                              this.f12469c.notifyAll();
                                    } catch (Throwable th3) {
/* 1341 */                              ((AtomicBoolean) this.f12470d).set(true);
/* 1346 */                              this.f12469c.notifyAll();
/* 1349 */                              throw th3;
                                    }
                                } catch (Throwable th4) {
/* 1351 */                          throw th4;
                                }
                            }
/* 1333 */                  return;
                        case 4:
                            try {
/* 1284 */                      objCall = ((nl0) this.f12468b).call();
                                break;
                            } catch (Exception unused) {
/* 1289 */                      objCall = null;
                            }
/* 1306 */                  ((Handler) this.f12470d).post(new cp0(18, (ac0) this.f12469c, objCall));
/* 1309 */                  return;
                        case 5:
/* 1218 */                  x61 x61Var = (x61) this.f12469c;
/* 1222 */                  bx0 bx0Var = (bx0) this.f12470d;
/* 1226 */                  if (bx0Var.f2631c > 0) {
/* 1230 */                      Bundle bundle = (Bundle) bx0Var.f2632d;
/* 1245 */                      x61Var.onCreate(bundle != null ? bundle.getBundle((String) this.f12468b) : null);
                            }
/* 1250 */                  if (bx0Var.f2631c >= 2) {
/* 1252 */                      x61Var.onStart();
                            }
/* 1257 */                  if (bx0Var.f2631c >= 3) {
/* 1259 */                      x61Var.onResume();
                            }
/* 1264 */                  if (bx0Var.f2631c >= 4) {
/* 1266 */                      x61Var.onStop();
                            }
/* 1272 */                  if (bx0Var.f2631c >= 5) {
/* 1274 */                      x61Var.onDestroy();
/* 1277 */                      return;
                            }
/* 1277 */                  return;
                        case 6:
/* 1210 */                  ((gf3) this.f12468b).m3916C((fs0) this.f12469c, (C0800g) this.f12470d);
/* 1213 */                  return;
                        case 7:
/* 1194 */                  ((gf3) this.f12468b).m3915B((C0832d5) this.f12469c, (ds0) this.f12470d);
/* 1197 */                  return;
                        case 8:
/* 1178 */                  ((gf3) this.f12468b).m3917D((we2) this.f12469c, (C0801h) this.f12470d);
/* 1181 */                  return;
                        case 9:
/* 1031 */                  CloudMessage cloudMessage = (CloudMessage) this.f12469c;
/* 1033 */                  Intent intent = cloudMessage.f3410a;
/* 1037 */                  String stringExtra = intent.getStringExtra("google.message_id");
/* 1041 */                  if (stringExtra == null) {
/* 1045 */                      stringExtra = intent.getStringExtra("message_id");
                            }
/* 1053 */                  if (TextUtils.isEmpty(stringExtra)) {
/* 1055 */                      taskM9134d = Tasks.forResult(null);
                            } else {
/* 1062 */                      Bundle bundle2 = new Bundle();
/* 1065 */                      Intent intent2 = cloudMessage.f3410a;
/* 1069 */                      String stringExtra2 = intent2.getStringExtra("google.message_id");
/* 1073 */                      if (stringExtra2 == null) {
/* 1077 */                          stringExtra2 = intent2.getStringExtra("message_id");
                                }
/* 1083 */                      bundle2.putString("google.message_id", stringExtra2);
/* 1086 */                      Intent intent3 = cloudMessage.f3410a;
/* 1105 */                      Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
/* 1107 */                      if (numValueOf != null) {
/* 1115 */                          bundle2.putInt("google.product_id", numValueOf.intValue());
                                }
/* 1120 */                      Context context = (Context) this.f12468b;
/* 1124 */                      bundle2.putBoolean("supports_message_handled", true);
/* 1127 */                      ur3 ur3VarM9133c = ur3.m9133c(context);
                                synchronized (ur3VarM9133c) {
/* 1134 */                          i = ur3VarM9133c.f17703a;
/* 1138 */                          ur3VarM9133c.f17703a = i + 1;
                                }
/* 1144 */                      taskM9134d = ur3VarM9133c.m9134d(new vq3(i, 2, bundle2, 0));
                            }
/* 1159 */                  taskM9134d.addOnCompleteListener(o80.f14670c, new ac3((CountDownLatch) this.f12470d, i3));
/* 1162 */                  return;
                        case 10:
/* 998 */                   mp3 mp3Var = ((zzjc) this.f12470d).f4212a;
/* 1000 */                  mp3Var.m6731A();
/* 1005 */                  zzah zzahVar = (zzah) this.f12468b;
/* 1009 */                  Object objM2197D1 = zzahVar.f4199c.m2197D1();
/* 1015 */                  zzr zzrVar = (zzr) this.f12469c;
/* 1017 */                  if (objM2197D1 == null) {
/* 1019 */                      mp3Var.m6748Y(zzahVar, zzrVar);
/* 1026 */                      return;
                            } else {
/* 1023 */                      mp3Var.m6747X(zzahVar, zzrVar);
/* 1026 */                      return;
                            }
                        case 11:
/* 682 */                   zzbg zzbgVar = (zzbg) this.f12468b;
/* 686 */                   zzr zzrVar2 = (zzr) this.f12469c;
/* 690 */                   zzjc zzjcVar = (zzjc) this.f12470d;
/* 692 */                   zzjcVar.getClass();
/* 695 */                   mp3 mp3Var2 = zzjcVar.f4212a;
/* 705 */                   if ("_cmp".equals(zzbgVar.f4208a) && (zzbeVar = zzbgVar.f4209b) != null) {
/* 711 */                       Bundle bundle3 = zzbeVar.f4207a;
/* 717 */                       if (bundle3.size() != 0) {
/* 722 */                           String string = bundle3.getString("_cis");
/* 732 */                           if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
/* 754 */                               mp3Var2.mo4557a().f17532W.m8511b(zzbgVar.toString(), "Event has been filtered ");
/* 765 */                               zzbgVar = new zzbg("_cmpx", zzbeVar, zzbgVar.f4210c, zzbgVar.f4211d);
                                    }
                                }
                            }
/* 769 */                   String str4 = zzbgVar.f4208a;
/* 771 */                   vi3 vi3Var = mp3Var2.f13909a;
/* 773 */                   ci3 ci3Var = mp3Var2.f13923i;
/* 775 */                   mp3.m6728S(vi3Var);
/* 778 */                   String str5 = zzrVar2.f4240a;
/* 796 */                   zzc zzcVar = TextUtils.isEmpty(str5) ? null : (zzc) vi3Var.f18206U.get(str5);
/* 798 */                   if (zzcVar == null) {
/* 984 */                       mp3Var2.mo4557a().f17534Y.m8511b(zzrVar2.f4240a, "EES not loaded for");
/* 987 */                       mp3Var2.m6731A();
/* 990 */                       mp3Var2.m6762j(zzbgVar, zzrVar2);
/* 993 */                       return;
                            }
                            try {
/* 800 */                       mp3.m6728S(ci3Var);
/* 809 */                       HashMap mapM1680p0 = ci3.m1680p0(zzbgVar.f4209b.m2167G1(), true);
/* 817 */                       String strM7889V = qj3.m7889V(str4, i13.f9405h, i13.f9403f);
/* 821 */                       if (strM7889V == null) {
/* 824 */                           strM7889V = str4;
                                }
/* 836 */                       if (zzcVar.zzb(new zzaa(strM7889V, zzbgVar.f4211d, mapM1680p0))) {
/* 843 */                           if (zzcVar.zzc()) {
/* 853 */                               mp3Var2.mo4557a().f17534Y.m8511b(str4, "EES edited event");
/* 856 */                               mp3.m6728S(ci3Var);
/* 867 */                               zzbg zzbgVarM1657D = ci3.m1657D(zzcVar.zze().zzc());
/* 871 */                               mp3Var2.m6731A();
/* 874 */                               mp3Var2.m6762j(zzbgVarM1657D, zzrVar2);
                                    } else {
/* 878 */                               mp3Var2.m6731A();
/* 881 */                               mp3Var2.m6762j(zzbgVar, zzrVar2);
                                    }
/* 888 */                           if (zzcVar.zzd()) {
/* 906 */                               for (zzaa zzaaVar : zzcVar.zze().zzf()) {
/* 926 */                                   mp3Var2.mo4557a().f17534Y.m8511b(zzaaVar.zzb(), "EES logging created event");
/* 929 */                                   mp3.m6728S(ci3Var);
/* 932 */                                   zzbg zzbgVarM1657D2 = ci3.m1657D(zzaaVar);
/* 936 */                                   mp3Var2.m6731A();
/* 939 */                                   mp3Var2.m6762j(zzbgVarM1657D2, zzrVar2);
                                        }
/* 993 */                               return;
                                    }
/* 993 */                           return;
                                }
                            } catch (zzd unused2) {
/* 953 */                       mp3Var2.mo4557a().f17538f.m8512c(zzrVar2.f4242b, "EES error. appId, eventName", str4);
                            }
/* 964 */                   mp3Var2.mo4557a().f17534Y.m8511b(str4, "EES was not applied to event");
/* 967 */                   mp3Var2.m6731A();
/* 970 */                   mp3Var2.m6762j(zzbgVar, zzrVar2);
/* 993 */                   return;
                        case 12:
/* 657 */                   zzjc zzjcVar2 = (zzjc) this.f12470d;
/* 661 */                   zzjcVar2.f4212a.m6731A();
/* 674 */                   zzjcVar2.f4212a.m6758h((zzbg) this.f12469c, (String) this.f12468b);
/* 677 */                   return;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 622 */                   zzjc zzjcVar3 = (zzjc) this.f12470d;
/* 624 */                   mp3 mp3Var3 = zzjcVar3.f4212a;
/* 626 */                   mp3 mp3Var4 = zzjcVar3.f4212a;
/* 628 */                   mp3Var3.m6731A();
/* 633 */                   zzpk zzpkVar = (zzpk) this.f12468b;
/* 635 */                   Object objM2197D2 = zzpkVar.m2197D1();
/* 641 */                   zzr zzrVar3 = (zzr) this.f12469c;
/* 643 */                   if (objM2197D2 == null) {
/* 647 */                       mp3Var4.m6745V(zzpkVar.f4228b, zzrVar3);
/* 654 */                       return;
                            } else {
/* 651 */                       mp3Var4.m6744U(zzpkVar, zzrVar3);
/* 654 */                       return;
                            }
                        case 14:
/* 113 */                   zzjc zzjcVar4 = (zzjc) this.f12468b;
/* 117 */                   zzr zzrVar4 = (zzr) this.f12469c;
/* 121 */                   zzaf zzafVar = (zzaf) this.f12470d;
/* 123 */                   mp3 mp3Var5 = zzjcVar4.f4212a;
/* 125 */                   mp3Var5.m6731A();
/* 128 */                   String str6 = zzrVar4.f4240a;
/* 130 */                   kb1.m6061n(str6);
/* 133 */                   HashMap map2 = mp3Var5.f13931p0;
/* 139 */                   mp3Var5.mo4558b().mo1375y();
/* 142 */                   mp3Var5.m6765k0();
/* 145 */                   ae3 ae3Var2 = mp3Var5.f13913c;
/* 147 */                   mp3.m6728S(ae3Var2);
/* 150 */                   long j = zzafVar.f4192a;
/* 152 */                   long j2 = zzafVar.f4194c;
/* 154 */                   ae3Var2.mo1375y();
/* 157 */                   ae3Var2.m9593A();
                            try {
/* 208 */                       cursor = null;
                                try {
/* 210 */                           cursorQuery = ae3Var2.m261q0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j)}, null, null, null, "1");
                                    try {
                                        try {
/* 218 */                                   if (cursorQuery.moveToFirst()) {
/* 223 */                                       String string2 = cursorQuery.getString(1);
/* 227 */                                       kb1.m6061n(string2);
/* 271 */                                       pp3 pp3VarM249c0 = ae3Var2.m249c0(string2, j, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
/* 275 */                                       cursorQuery.close();
/* 278 */                                       pp3Var = pp3VarM249c0;
                                            } else {
/* 323 */                                       if (cursorQuery != null) {
/* 325 */                                           cursorQuery.close();
                                                }
/* 328 */                                       pp3Var = cursor;
                                            }
                                        } catch (SQLiteException e7) {
/* 283 */                                   e = e7;
/* 307 */                                   uh3 uh3Var2 = ((ij3) ae3Var2.f16749a).f9655f;
/* 309 */                                   ij3.m4555l(uh3Var2);
/* 320 */                                   uh3Var2.f17538f.m8512c(Long.valueOf(j), "Error to querying MeasurementBatch from upload_queue. rowId", e);
                                            break;
                                        }
                                    } catch (Throwable th5) {
/* 280 */                               th = th5;
/* 614 */                               if (cursorQuery != null) {
/* 616 */                                   cursorQuery.close();
                                        }
/* 619 */                               throw th;
                                    }
                                } catch (SQLiteException e8) {
/* 287 */                           e = e8;
/* 301 */                           cursorQuery = cursor;
/* 307 */                           uh3 uh3Var3 = ((ij3) ae3Var2.f16749a).f9655f;
/* 309 */                           ij3.m4555l(uh3Var3);
/* 320 */                           uh3Var3.f17538f.m8512c(Long.valueOf(j), "Error to querying MeasurementBatch from upload_queue. rowId", e);
/* 323 */                           if (cursorQuery != null) {
/* 325 */                               cursorQuery.close();
                                    }
/* 328 */                           pp3Var = cursor;
/* 330 */                           if (pp3Var == null) {
/* 344 */                               mp3Var5.mo4557a().f17541w.m8512c(str6, "[sgtm] Queued batch doesn't exist. appId, rowId", Long.valueOf(j));
/* 613 */                               return;
                                    }
/* 349 */                           str2 = pp3Var.f15236c;
/* 351 */                           i2 = zzafVar.f4193b;
/* 353 */                           if (i2 == 1) {
/* 524 */                               if (i2 == 3) {
/* 530 */                                   kp3Var = (kp3) map2.get(str2);
/* 532 */                                   if (kp3Var == null) {
/* 536 */                                       kp3Var = new kp3(mp3Var5);
/* 539 */                                       map2.put(str2, kp3Var);
                                            } else {
/* 546 */                                       kp3Var.f12971b++;
/* 552 */                                       kp3Var.f12972c = kp3Var.m6272a();
                                            }
/* 560 */                                   ((xt0) mp3Var5.mo4562f()).getClass();
/* 585 */                                   mp3Var5.mo4557a().f17534Y.m8513d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str6, str2, Long.valueOf((kp3Var.f12972c - System.currentTimeMillis()) / 1000));
                                        }
/* 588 */                               ae3 ae3Var3 = mp3Var5.f13913c;
/* 590 */                               mp3.m6728S(ae3Var3);
/* 595 */                               Long lValueOf2 = Long.valueOf(zzafVar.f4192a);
/* 599 */                               ae3Var3.m232L(lValueOf2);
/* 610 */                               mp3Var5.mo4557a().f17534Y.m8512c(str6, "[sgtm] increased batch retry count after failed client upload. appId, rowId", lValueOf2);
/* 613 */                               return;
                                    }
/* 359 */                           if (map2.containsKey(str2)) {
/* 361 */                               map2.remove(str2);
                                    }
/* 364 */                           ae3 ae3Var4 = mp3Var5.f13913c;
/* 366 */                           mp3.m6728S(ae3Var4);
/* 369 */                           Long lValueOf3 = Long.valueOf(j);
/* 373 */                           ae3Var4.m224G(lValueOf3);
/* 384 */                           mp3Var5.mo4557a().f17534Y.m8512c(str6, "[sgtm] queued batch deleted after successful client upload. appId, rowId", lValueOf3);
/* 391 */                           if (j2 > 0) {
/* 393 */                               ae3Var = mp3Var5.f13913c;
/* 395 */                               mp3.m6728S(ae3Var);
/* 400 */                               ij3 ij3Var = (ij3) ae3Var.f16749a;
/* 402 */                               ae3Var.mo1375y();
/* 405 */                               ae3Var.m9593A();
/* 408 */                               lValueOf = Long.valueOf(j2);
/* 414 */                               contentValues = new ContentValues();
/* 423 */                               contentValues.put("upload_type", (Integer) 1);
/* 426 */                               xt0 xt0Var = ij3Var.f9640V;
/* 428 */                               uh3Var = ij3Var.f9655f;
/* 430 */                               xt0Var.getClass();
/* 443 */                               contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                        try {
/* 475 */                                   if (ae3Var.m261q0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j2), str6, String.valueOf(4)}) != 1) {
/* 477 */                                       ij3.m4555l(uh3Var);
/* 484 */                                       uh3Var.f17541w.m8512c(str6, "Google Signal pending batch not updated. appId, rowId", lValueOf);
                                                break;
                                            }
/* 502 */                                   mp3Var5.mo4557a().f17534Y.m8512c(str6, "[sgtm] queued Google Signal batch updated. appId, signalRowId", Long.valueOf(j2));
/* 505 */                                   mp3Var5.m6779t(str6);
/* 613 */                                   return;
                                        } catch (SQLiteException e9) {
/* 509 */                                   ij3.m4555l(uh3Var);
/* 520 */                                   uh3Var.f17538f.m8513d("Failed to update google Signal pending batch. appid, rowId", str6, Long.valueOf(j2), e9);
/* 523 */                                   throw e9;
                                        }
                                    }
/* 613 */                           return;
                                } catch (Throwable th6) {
/* 285 */                           th = th6;
/* 297 */                           cursorQuery = cursor;
/* 614 */                           if (cursorQuery != null) {
/* 616 */                               cursorQuery.close();
                                    }
/* 619 */                           throw th;
                                }
                            } catch (SQLiteException e10) {
/* 293 */                       e = e10;
/* 294 */                       cursor = null;
                            } catch (Throwable th7) {
/* 289 */                       th = th7;
/* 290 */                       cursor = null;
                            }
/* 330 */                   if (pp3Var == null) {
/* 344 */                       mp3Var5.mo4557a().f17541w.m8512c(str6, "[sgtm] Queued batch doesn't exist. appId, rowId", Long.valueOf(j));
/* 613 */                       return;
                            }
/* 349 */                   str2 = pp3Var.f15236c;
/* 351 */                   i2 = zzafVar.f4193b;
/* 353 */                   if (i2 == 1) {
/* 524 */                       if (i2 == 3) {
/* 530 */                           kp3Var = (kp3) map2.get(str2);
/* 532 */                           if (kp3Var == null) {
/* 536 */                               kp3Var = new kp3(mp3Var5);
/* 539 */                               map2.put(str2, kp3Var);
                                    } else {
/* 546 */                               kp3Var.f12971b++;
/* 552 */                               kp3Var.f12972c = kp3Var.m6272a();
                                    }
/* 560 */                           ((xt0) mp3Var5.mo4562f()).getClass();
/* 585 */                           mp3Var5.mo4557a().f17534Y.m8513d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str6, str2, Long.valueOf((kp3Var.f12972c - System.currentTimeMillis()) / 1000));
                                }
/* 588 */                       ae3 ae3Var5 = mp3Var5.f13913c;
/* 590 */                       mp3.m6728S(ae3Var5);
/* 595 */                       Long lValueOf4 = Long.valueOf(zzafVar.f4192a);
/* 599 */                       ae3Var5.m232L(lValueOf4);
/* 610 */                       mp3Var5.mo4557a().f17534Y.m8512c(str6, "[sgtm] increased batch retry count after failed client upload. appId, rowId", lValueOf4);
/* 613 */                       return;
                            }
/* 359 */                   if (map2.containsKey(str2)) {
/* 361 */                       map2.remove(str2);
                            }
/* 364 */                   ae3 ae3Var6 = mp3Var5.f13913c;
/* 366 */                   mp3.m6728S(ae3Var6);
/* 369 */                   Long lValueOf5 = Long.valueOf(j);
/* 373 */                   ae3Var6.m224G(lValueOf5);
/* 384 */                   mp3Var5.mo4557a().f17534Y.m8512c(str6, "[sgtm] queued batch deleted after successful client upload. appId, rowId", lValueOf5);
/* 391 */                   if (j2 > 0) {
/* 393 */                       ae3Var = mp3Var5.f13913c;
/* 395 */                       mp3.m6728S(ae3Var);
/* 400 */                       ij3 ij3Var2 = (ij3) ae3Var.f16749a;
/* 402 */                       ae3Var.mo1375y();
/* 405 */                       ae3Var.m9593A();
/* 408 */                       lValueOf = Long.valueOf(j2);
/* 414 */                       contentValues = new ContentValues();
/* 423 */                       contentValues.put("upload_type", (Integer) 1);
/* 426 */                       xt0 xt0Var2 = ij3Var2.f9640V;
/* 428 */                       uh3Var = ij3Var2.f9655f;
/* 430 */                       xt0Var2.getClass();
/* 443 */                       contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
/* 475 */                       if (ae3Var.m261q0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j2), str6, String.valueOf(4)}) != 1) {
/* 477 */                           ij3.m4555l(uh3Var);
/* 484 */                           uh3Var.f17541w.m8512c(str6, "Google Signal pending batch not updated. appId, rowId", lValueOf);
                                    break;
                                }
/* 502 */                       mp3Var5.mo4557a().f17534Y.m8512c(str6, "[sgtm] queued Google Signal batch updated. appId, signalRowId", Long.valueOf(j2));
/* 505 */                       mp3Var5.m6779t(str6);
/* 613 */                       return;
                            }
/* 613 */                   return;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 107 */                   m5894a();
/* 110 */                   return;
                        case 16:
/* 103 */                   m5895b();
/* 106 */                   return;
                        case 17:
/* 45 */                    pn3 pn3Var = (pn3) this.f12468b;
/* 49 */                    zzr zzrVar5 = (zzr) this.f12469c;
/* 53 */                    zzaf zzafVar2 = (zzaf) this.f12470d;
/* 57 */                    ij3 ij3Var3 = (ij3) pn3Var.f16749a;
/* 59 */                    zzga zzgaVar = pn3Var.f15188d;
/* 61 */                    if (zzgaVar == null) {
/* 63 */                        uh3 uh3Var4 = ij3Var3.f9655f;
/* 65 */                        ij3.m4555l(uh3Var4);
/* 72 */                        uh3Var4.f17538f.m8510a("[sgtm] Discarding data. Failed to update batch upload status.");
/* 102 */                       return;
                            }
                            try {
/* 76 */                        zzgaVar.mo2173M(zzrVar5, zzafVar2);
/* 79 */                        pn3Var.m7517M();
/* 102 */                       return;
                            } catch (RemoteException e11) {
/* 84 */                        uh3 uh3Var5 = ij3Var3.f9655f;
/* 86 */                        ij3.m4555l(uh3Var5);
/* 99 */                        uh3Var5.f17538f.m8512c(Long.valueOf(zzafVar2.f4192a), "[sgtm] Failed to update batch upload status, rowId, exception", e11);
/* 102 */                       return;
                            }
                        default:
/* 16 */                    ac3 ac3Var = (ac3) this.f12468b;
/* 20 */                    uh3 uh3Var6 = (uh3) this.f12469c;
/* 24 */                    JobParameters jobParameters = (JobParameters) this.f12470d;
/* 30 */                    uh3Var6.f17534Y.m8510a("AppMeasurementJobService processed last upload request.");
/* 39 */                    ((vn3) ((Service) ac3Var.f184b)).mo2159b(jobParameters);
/* 42 */                    return;
                    }
                }

/* 24 */        public /* synthetic */ js0(int i, Object obj, Object obj2, Object obj3) {
/* 25 */            this.f12467a = i;
                    this.f12470d = obj;
                    this.f12468b = obj2;
                    this.f12469c = obj3;
                }

/* 25 */        public /* synthetic */ js0(Object obj, Object obj2, Object obj3, int i, boolean z) {
/* 26 */            this.f12467a = i;
                    this.f12468b = obj;
                    this.f12469c = obj2;
                    this.f12470d = obj3;
                }

/* 26 */        public js0(bx0 bx0Var, x61 x61Var, String str) {
                    this.f12467a = 5;
                    this.f12469c = x61Var;
                    this.f12468b = str;
                    this.f12470d = bx0Var;
                }

/* 27 */        public js0(zzjc zzjcVar, zzbg zzbgVar, String str) {
                    this.f12467a = 12;
                    this.f12469c = zzbgVar;
                    this.f12468b = str;
                    Objects.requireNonNull(zzjcVar);
                    this.f12470d = zzjcVar;
                }

/* 28 */        public js0(pn3 pn3Var, AtomicReference atomicReference, zzr zzrVar) {
                    this.f12467a = 15;
                    this.f12468b = atomicReference;
                    this.f12469c = zzrVar;
                    Objects.requireNonNull(pn3Var);
                    this.f12470d = pn3Var;
                }

/* 29 */        public /* synthetic */ js0() {
/* 30 */            this.f12467a = 4;
                }
            }
