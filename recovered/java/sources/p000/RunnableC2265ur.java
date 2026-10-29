            package p000;

            import android.content.ContentValues;
            import android.database.sqlite.SQLiteException;
            import android.os.Bundle;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.android.gms.internal.measurement.zzcu;
            import com.google.android.gms.internal.measurement.zzhz;
            import com.google.android.gms.internal.measurement.zzib;
            import com.google.android.gms.internal.measurement.zzic;
            import com.google.android.gms.internal.measurement.zzmq;
            import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
            import com.google.android.gms.measurement.internal.zzbg;
            import com.google.android.gms.measurement.internal.zzga;
            import com.google.android.gms.measurement.internal.zzgg;
            import com.google.android.gms.measurement.internal.zzjc;
            import com.google.android.gms.measurement.internal.zzol;
            import com.google.android.gms.measurement.internal.zzon;
            import com.google.android.gms.measurement.internal.zzop;
            import com.google.android.gms.measurement.internal.zzr;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicReference;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: ur */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public final class RunnableC2265ur implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17673a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f17674b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f17675c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f17676d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f17677e;

                public RunnableC2265ur(sl3 sl3Var, AtomicReference atomicReference, String str, String str2) {
/* 2 */             this.f17673a = 5;
/* 7 */             this.f17674b = atomicReference;
/* 9 */             this.f17675c = str;
/* 11 */            this.f17676d = str2;
/* 13 */            Objects.requireNonNull(sl3Var);
/* 16 */            this.f17677e = sl3Var;
                }

                /* JADX WARN: Code duplicated, block: B:106:0x03c1  */
                /* JADX WARN: Code duplicated, block: B:109:0x03d6 A[LOOP:1: B:107:0x03d0->B:109:0x03d6, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:114:0x0422 A[Catch: zzmq -> 0x0475, LOOP:2: B:112:0x041c->B:114:0x0422, LOOP_END, TryCatch #4 {zzmq -> 0x0475, blocks: (B:111:0x040f, B:112:0x041c, B:114:0x0422, B:115:0x0442, B:117:0x045d), top: B:151:0x040f }] */
                /* JADX WARN: Code duplicated, block: B:117:0x045d A[Catch: zzmq -> 0x0475, TRY_LEAVE, TryCatch #4 {zzmq -> 0x0475, blocks: (B:111:0x040f, B:112:0x041c, B:114:0x0422, B:115:0x0442, B:117:0x045d), top: B:151:0x040f }] */
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    Bundle bundle;
                    zzol zzolVar;
                    zzhz zzhzVar;
                    int i;
/* 6 */             byte[] bArrMo2174N = null;
                    switch (this.f17673a) {
                        case 0:
/* 1313 */                  ViewOnKeyListenerC2341wr viewOnKeyListenerC2341wr = (ViewOnKeyListenerC2341wr) ((qc3) this.f17677e).f15492b;
/* 1317 */                  sg1 sg1Var = (sg1) this.f17675c;
/* 1321 */                  C2304vr c2304vr = (C2304vr) this.f17674b;
/* 1323 */                  if (c2304vr != null) {
/* 1326 */                      viewOnKeyListenerC2341wr.f18780k0 = true;
/* 1331 */                      c2304vr.f18324b.m5803c(false);
/* 1334 */                      viewOnKeyListenerC2341wr.f18780k0 = false;
                            }
/* 1340 */                  if (sg1Var.isEnabled() && sg1Var.hasSubMenu()) {
/* 1354 */                      ((jg1) this.f17676d).m5809q(sg1Var, null, 4);
/* 1357 */                      return;
                            }
/* 1357 */                  return;
                        case 1:
                            try {
/* 1217 */                      HashMap map = new HashMap();
/* 1226 */                      map.put("userName", (String) this.f17674b);
/* 1235 */                      map.put("userId", (String) this.f17675c);
/* 1244 */                      map.put("userEmail", (String) this.f17676d);
/* 1253 */                      map.put("userAuthToken", (String) this.f17677e);
/* 1260 */                      if (rs0.m8239b()) {
/* 1280 */                          xe2.m9775m("Helpshift", "Logging in the user: " + map, null);
/* 1283 */                          rs0 rs0Var = rs0.f16254y;
/* 1294 */                          rs0Var.f16271p.m8116u(new cp0(12, rs0Var, map));
/* 1306 */                          return;
                                }
/* 1306 */                      return;
                            } catch (Exception e) {
/* 1303 */                      AbstractC1245n0.m4877e("HelpshiftTitan", "HelpshiftTitan.login", e);
/* 1306 */                      return;
                            }
                        case 2:
/* 788 */                   zzjc zzjcVar = (zzjc) this.f17674b;
/* 792 */                   String str = (String) this.f17675c;
/* 796 */                   zzon zzonVar = (zzon) this.f17676d;
/* 800 */                   zzgg zzggVar = (zzgg) this.f17677e;
/* 802 */                   mp3 mp3Var = zzjcVar.f4212a;
/* 804 */                   mp3Var.m6731A();
/* 811 */                   mp3Var.mo4558b().mo1375y();
/* 814 */                   mp3Var.m6765k0();
/* 817 */                   ae3 ae3Var = mp3Var.f13913c;
/* 819 */                   mp3.m6728S(ae3Var);
/* 834 */                   List<pp3> listM220E = ae3Var.m220E(str, zzonVar, ((Integer) vg3.f18065B.m9011a(null)).intValue());
/* 840 */                   ArrayList arrayList = new ArrayList();
/* 851 */                   for (pp3 pp3Var : listM220E) {
/* 859 */                       String str2 = pp3Var.f15236c;
/* 861 */                       long j = pp3Var.f15241h;
/* 863 */                       long j2 = pp3Var.f15234a;
/* 869 */                       if (mp3Var.m6778s(str, str2)) {
/* 889 */                           int i2 = pp3Var.f15242i;
/* 891 */                           if (i2 > 0) {
/* 906 */                               if (i2 <= ((Integer) vg3.f18175z.m9011a(bArrMo2174N)).intValue()) {
/* 940 */                                   long jMin = Math.min(((Long) vg3.f18171x.m9011a(bArrMo2174N)).longValue() * (1 << (i2 - 1)), ((Long) vg3.f18173y.m9011a(bArrMo2174N)).longValue());
/* 950 */                                   ((xt0) mp3Var.mo4562f()).getClass();
/* 960 */                                   if (System.currentTimeMillis() >= jMin + j) {
/* 964 */                                       bundle = new Bundle();
/* 981 */                                       for (Map.Entry entry : pp3Var.f15237d.entrySet()) {
/* 1001 */                                          bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                                }
/* 1005 */                                      long j3 = pp3Var.f15234a;
/* 1007 */                                      zzib zzibVar = pp3Var.f15235b;
/* 1035 */                                      zzolVar = new zzol(j3, zzibVar.zzcc(), pp3Var.f15236c, bundle, pp3Var.f15238e.f20243a, pp3Var.f15240g, HttpUrl.FRAGMENT_ENCODE_SET);
                                                try {
/* 1050 */                                          zzhzVar = (zzhz) ci3.m1677m0(zzib.zzh(), zzolVar.f4219b);
/* 1057 */                                          for (i = 0; i < zzhzVar.zzb(); i++) {
/* 1067 */                                              zzic zzicVar = (zzic) zzhzVar.zzc(i).zzcl();
/* 1075 */                                              ((xt0) mp3Var.mo4562f()).getClass();
/* 1082 */                                              zzicVar.zzs(System.currentTimeMillis());
/* 1085 */                                              zzhzVar.zzd(i, zzicVar);
                                                    }
/* 1101 */                                          zzolVar.f4219b = ((zzib) zzhzVar.zzbc()).zzcc();
/* 1116 */                                          if (Log.isLoggable(mp3Var.mo4557a().m9021J(), 2)) {
/* 1118 */                                              ci3 ci3Var = mp3Var.f13923i;
/* 1120 */                                              mp3.m6728S(ci3Var);
/* 1133 */                                              zzolVar.f4224i = ci3Var.m1689c0((zzib) zzhzVar.zzbc());
                                                    }
/* 1135 */                                          arrayList.add(zzolVar);
                                                } catch (zzmq unused) {
/* 1150 */                                          mp3Var.mo4557a().f17541w.m8511b(str, "Failed to parse queued batch. appId");
                                                }
                                            }
                                        }
/* 1170 */                              mp3Var.mo4557a().f17534Y.m8513d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j2), Long.valueOf(j));
                                    } else {
/* 964 */                               bundle = new Bundle();
/* 981 */                               while (r3.hasNext()) {
/* 1001 */                                  bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                        }
/* 1005 */                              long j4 = pp3Var.f15234a;
/* 1007 */                              zzib zzibVar2 = pp3Var.f15235b;
/* 1035 */                              zzolVar = new zzol(j4, zzibVar2.zzcc(), pp3Var.f15236c, bundle, pp3Var.f15238e.f20243a, pp3Var.f15240g, HttpUrl.FRAGMENT_ENCODE_SET);
/* 1050 */                              zzhzVar = (zzhz) ci3.m1677m0(zzib.zzh(), zzolVar.f4219b);
/* 1057 */                              while (i < zzhzVar.zzb()) {
/* 1067 */                                  zzic zzicVar2 = (zzic) zzhzVar.zzc(i).zzcl();
/* 1075 */                                  ((xt0) mp3Var.mo4562f()).getClass();
/* 1082 */                                  zzicVar2.zzs(System.currentTimeMillis());
/* 1085 */                                  zzhzVar.zzd(i, zzicVar2);
                                        }
/* 1101 */                              zzolVar.f4219b = ((zzib) zzhzVar.zzbc()).zzcc();
/* 1116 */                              if (Log.isLoggable(mp3Var.mo4557a().m9021J(), 2)) {
/* 1118 */                                  ci3 ci3Var2 = mp3Var.f13923i;
/* 1120 */                                  mp3.m6728S(ci3Var2);
/* 1133 */                                  zzolVar.f4224i = ci3Var2.m1689c0((zzib) zzhzVar.zzbc());
                                        }
/* 1135 */                              arrayList.add(zzolVar);
                                    }
/* 1139 */                          bArrMo2174N = null;
                                } else {
/* 885 */                           mp3Var.mo4557a().f17534Y.m8513d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j2), pp3Var.f15236c);
                                }
                            }
                            try {
/* 1179 */                      zzggVar.mo2191i0(new zzop(arrayList));
/* 1198 */                      mp3Var.mo4557a().f17534Y.m8512c(str, "[sgtm] Sending queued upload batches to client. appId, count", Integer.valueOf(arrayList.size()));
/* 1214 */                      return;
                            } catch (RemoteException e2) {
/* 1211 */                      mp3Var.mo4557a().f17538f.m8512c(str, "[sgtm] Failed to return upload batches for app", e2);
/* 1214 */                      return;
                            }
                        case 3:
/* 702 */                   pn3 pn3VarM4567o = ((AppMeasurementDynamiteService) this.f17677e).f4190a.m4567o();
/* 709 */                   zzcu zzcuVar = (zzcu) this.f17674b;
/* 714 */                   zzbg zzbgVar = (zzbg) this.f17675c;
/* 719 */                   String str3 = (String) this.f17676d;
/* 721 */                   pn3VarM4567o.mo1375y();
/* 724 */                   pn3VarM4567o.m9576A();
/* 729 */                   ij3 ij3Var = (ij3) pn3VarM4567o.f16749a;
/* 731 */                   up3 up3Var = ij3Var.f9668w;
/* 733 */                   ij3.m4553j(up3Var);
/* 751 */                   if (qr0.f15712b.m8004c(((ij3) up3Var.f16749a).f9645a, 12451000) == 0) {
/* 782 */                       pn3VarM4567o.m7518N(new RunnableC2265ur(pn3VarM4567o, zzbgVar, str3, zzcuVar, 7));
/* 785 */                       return;
                            }
/* 753 */                   uh3 uh3Var = ij3Var.f9655f;
/* 755 */                   ij3.m4555l(uh3Var);
/* 762 */                   uh3Var.f17541w.m8510a("Not bundling data. Service unavailable or out of date");
/* 765 */                   up3 up3Var2 = ij3Var.f9668w;
/* 767 */                   ij3.m4553j(up3Var2);
/* 772 */                   up3Var2.m9108k0(zzcuVar, new byte[0]);
/* 785 */                   return;
                        case 4:
/* 409 */                   zzjc zzjcVar2 = (zzjc) this.f17674b;
/* 414 */                   Bundle bundle2 = (Bundle) this.f17675c;
/* 419 */                   String str4 = (String) this.f17676d;
/* 424 */                   zzr zzrVar = (zzr) this.f17677e;
/* 426 */                   mp3 mp3Var2 = zzjcVar2.f4212a;
/* 434 */                   boolean zM7406J = mp3Var2.m6753d0().m7406J(null, vg3.f18106V0);
/* 442 */                   if (bundle2.isEmpty() && zM7406J) {
/* 446 */                       ae3 ae3Var2 = mp3Var2.f13913c;
/* 448 */                       mp3.m6728S(ae3Var2);
/* 451 */                       ae3Var2.mo1375y();
/* 454 */                       ae3Var2.m9593A();
                                try {
/* 467 */                           ae3Var2.m261q0().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
/* 695 */                           return;
                                } catch (SQLiteException e3) {
/* 477 */                           uh3 uh3Var2 = ((ij3) ae3Var2.f16749a).f9655f;
/* 479 */                           ij3.m4555l(uh3Var2);
/* 486 */                           uh3Var2.f17538f.m8511b(e3, "Error clearing default event params");
/* 695 */                           return;
                                }
                            }
/* 491 */                   ae3 ae3Var3 = mp3Var2.f13913c;
/* 493 */                   mp3.m6728S(ae3Var3);
/* 499 */                   ij3 ij3Var2 = (ij3) ae3Var3.f16749a;
/* 501 */                   ae3Var3.mo1375y();
/* 504 */                   ae3Var3.m9593A();
/* 522 */                   oe3 oe3Var = new oe3((ij3) ae3Var3.f16749a, HttpUrl.FRAGMENT_ENCODE_SET, str4, "dep", 0L, 0L, bundle2);
/* 527 */                   ci3 ci3Var3 = ae3Var3.f15676b.f13923i;
/* 529 */                   mp3.m6728S(ci3Var3);
/* 536 */                   byte[] bArrZzcc = ci3Var3.m1688b0(oe3Var).zzcc();
/* 540 */                   uh3 uh3Var3 = ij3Var2.f9655f;
/* 542 */                   ij3.m4555l(uh3Var3);
/* 554 */                   uh3Var3.f17534Y.m8512c(str4, "Saving default event parameters, appId, data size", Integer.valueOf(bArrZzcc.length));
/* 559 */                   ContentValues contentValues = new ContentValues();
/* 564 */                   contentValues.put("app_id", str4);
/* 569 */                   contentValues.put("parameters", bArrZzcc);
                            try {
/* 587 */                       if (ae3Var3.m261q0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
/* 589 */                           ij3.m4555l(uh3Var3);
/* 600 */                           uh3Var3.f17538f.m8511b(uh3.m9013H(str4), "Failed to insert default event parameters (got -1). appId");
                                }
                            } catch (SQLiteException e4) {
/* 605 */                       ij3.m4555l(uh3Var3);
/* 616 */                       uh3Var3.f17538f.m8512c(uh3.m9013H(str4), "Error storing default event parameters. appId", e4);
                            }
/* 619 */                   ae3 ae3Var4 = mp3Var2.f13913c;
/* 621 */                   mp3.m6728S(ae3Var4);
/* 624 */                   long j5 = zzrVar.f4261o0;
                            try {
/* 644 */                       if (ae3Var4.m243W("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j5)}, 0L) <= 0 && ae3Var4.m243W("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j5)}, 0L) > 0) {
/* 665 */                           ae3 ae3Var5 = mp3Var2.f13913c;
/* 667 */                           mp3.m6728S(ae3Var5);
/* 674 */                           ae3Var5.m240T(str4, Long.valueOf(j5), null, bundle2);
/* 695 */                           return;
                                }
/* 695 */                       return;
                            } catch (SQLiteException e5) {
/* 683 */                       uh3 uh3Var4 = ((ij3) ae3Var4.f16749a).f9655f;
/* 685 */                       ij3.m4555l(uh3Var4);
/* 692 */                       uh3Var4.f17538f.m8511b(e5, "Error checking backfill conditions");
/* 695 */                       return;
                            }
                        case 5:
/* 364 */                   String str5 = (String) this.f17675c;
/* 369 */                   String str6 = (String) this.f17676d;
/* 379 */                   pn3 pn3VarM4567o2 = ((ij3) ((sl3) this.f17677e).f16749a).m4567o();
/* 386 */                   AtomicReference atomicReference = (AtomicReference) this.f17674b;
/* 388 */                   pn3VarM4567o2.mo1375y();
/* 391 */                   pn3VarM4567o2.m9576A();
/* 403 */                   pn3VarM4567o2.m7518N(new ck3(pn3VarM4567o2, atomicReference, str5, str6, pn3VarM4567o2.m7520P(false)));
/* 406 */                   return;
                        case 6:
/* 323 */                   pn3 pn3VarM4567o3 = ((AppMeasurementDynamiteService) this.f17677e).f4190a.m4567o();
/* 330 */                   zzcu zzcuVar2 = (zzcu) this.f17674b;
/* 335 */                   String str7 = (String) this.f17675c;
/* 340 */                   String str8 = (String) this.f17676d;
/* 342 */                   pn3VarM4567o3.mo1375y();
/* 345 */                   pn3VarM4567o3.m9576A();
/* 357 */                   pn3VarM4567o3.m7518N(new ck3(pn3VarM4567o3, str7, str8, pn3VarM4567o3.m7520P(false), zzcuVar2));
/* 360 */                   return;
                        case 7:
/* 221 */                   zzcu zzcuVar3 = (zzcu) this.f17676d;
/* 225 */                   pn3 pn3Var = (pn3) this.f17677e;
                            try {
                                try {
/* 227 */                           zzga zzgaVar = pn3Var.f15188d;
/* 229 */                           if (zzgaVar != null) {
/* 264 */                               bArrMo2174N = zzgaVar.mo2174N((zzbg) this.f17674b, (String) this.f17675c);
/* 268 */                               pn3Var.m7517M();
/* 295 */                               up3 up3Var3 = ((ij3) pn3Var.f16749a).f9668w;
/* 297 */                               ij3.m4553j(up3Var3);
/* 300 */                               up3Var3.m9108k0(zzcuVar3, bArrMo2174N);
/* 303 */                               return;
                                    }
/* 233 */                           ij3 ij3Var3 = (ij3) pn3Var.f16749a;
/* 235 */                           uh3 uh3Var5 = ij3Var3.f9655f;
/* 237 */                           ij3.m4555l(uh3Var5);
/* 244 */                           uh3Var5.f17538f.m8510a("Discarding data. Failed to send event to service to bundle");
/* 247 */                           up3 up3Var4 = ij3Var3.f9668w;
/* 249 */                           ij3.m4553j(up3Var4);
/* 252 */                           up3Var4.m9108k0(zzcuVar3, null);
/* 303 */                           return;
                                } catch (RemoteException e6) {
/* 279 */                           uh3 uh3Var6 = ((ij3) pn3Var.f16749a).f9655f;
/* 281 */                           ij3.m4555l(uh3Var6);
/* 288 */                           uh3Var6.f17538f.m8511b(e6, "Failed to send event to the service to bundle");
                                }
                            } catch (Throwable th) {
/* 308 */                       up3 up3Var5 = ((ij3) pn3Var.f16749a).f9668w;
/* 310 */                       ij3.m4553j(up3Var5);
/* 313 */                       up3Var5.m9108k0(zzcuVar3, null);
/* 316 */                       throw th;
                            }
                            break;
                        case 8:
/* 143 */                   pn3 pn3Var2 = (pn3) this.f17674b;
/* 147 */                   AtomicReference atomicReference2 = (AtomicReference) this.f17675c;
/* 151 */                   zzr zzrVar2 = (zzr) this.f17676d;
/* 155 */                   Bundle bundle3 = (Bundle) this.f17677e;
                            synchronized (atomicReference2) {
                                try {
/* 158 */                           zzga zzgaVar2 = pn3Var2.f15188d;
/* 160 */                           if (zzgaVar2 != null) {
/* 189 */                               zzgaVar2.mo2189z(zzrVar2, bundle3, new om3(pn3Var2, atomicReference2));
/* 192 */                               pn3Var2.m7517M();
/* 216 */                               return;
                                    } else {
/* 166 */                               uh3 uh3Var7 = ((ij3) pn3Var2.f16749a).f9655f;
/* 168 */                               ij3.m4555l(uh3Var7);
/* 175 */                               uh3Var7.f17538f.m8510a("Failed to request trigger URIs; not connected to service");
/* 216 */                               return;
                                    }
                                } catch (RemoteException e7) {
/* 200 */                           uh3 uh3Var8 = ((ij3) pn3Var2.f16749a).f9655f;
/* 202 */                           ij3.m4555l(uh3Var8);
/* 209 */                           uh3Var8.f17538f.m8511b(e7, "Failed to request trigger URIs; remote exception");
/* 212 */                           atomicReference2.notifyAll();
                                }
                            }
                            break;
                        case 9:
/* 65 */                    pn3 pn3Var3 = (pn3) this.f17674b;
/* 69 */                    AtomicReference atomicReference3 = (AtomicReference) this.f17675c;
/* 73 */                    zzr zzrVar3 = (zzr) this.f17676d;
/* 77 */                    zzon zzonVar2 = (zzon) this.f17677e;
                            synchronized (atomicReference3) {
                                try {
/* 80 */                            zzga zzgaVar3 = pn3Var3.f15188d;
/* 82 */                            if (zzgaVar3 != null) {
/* 111 */                               zzgaVar3.mo2178Y(zzrVar3, zzonVar2, new pm3(pn3Var3, atomicReference3));
/* 114 */                               pn3Var3.m7517M();
/* 138 */                               return;
                                    } else {
/* 88 */                                uh3 uh3Var9 = ((ij3) pn3Var3.f16749a).f9655f;
/* 90 */                                ij3.m4555l(uh3Var9);
/* 97 */                                uh3Var9.f17538f.m8510a("[sgtm] Failed to get upload batches; not connected to service");
/* 138 */                               return;
                                    }
                                } catch (RemoteException e8) {
/* 122 */                           uh3 uh3Var10 = ((ij3) pn3Var3.f16749a).f9655f;
/* 124 */                           ij3.m4555l(uh3Var10);
/* 131 */                           uh3Var10.f17538f.m8511b(e8, "[sgtm] Failed to get upload batches; remote exception");
/* 134 */                           atomicReference3.notifyAll();
                                }
                            }
                            break;
                        default:
/* 16 */                    mp3 mp3Var3 = (mp3) ((ac3) this.f17677e).f184b;
/* 18 */                    up3 up3VarM6763j0 = mp3Var3.m6763j0();
/* 28 */                    ((xt0) mp3Var3.mo4562f()).getClass();
/* 31 */                    long jCurrentTimeMillis = System.currentTimeMillis();
/* 38 */                    String str9 = (String) this.f17674b;
/* 52 */                    zzbg zzbgVarM9100b0 = up3VarM6763j0.m9100b0((String) this.f17675c, (Bundle) this.f17676d, "auto", jCurrentTimeMillis, false);
/* 56 */                    kb1.m6061n(zzbgVarM9100b0);
/* 59 */                    mp3Var3.m6758h(zzbgVarM9100b0, str9);
/* 62 */                    return;
                    }
                }

/* 18 */        public /* synthetic */ RunnableC2265ur(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
/* 19 */            this.f17673a = i;
                    this.f17674b = obj;
                    this.f17675c = obj2;
                    this.f17676d = obj3;
                    this.f17677e = obj4;
                }

/* 19 */        public /* synthetic */ RunnableC2265ur(Object obj, Object obj2, Object obj3, Object obj4, int i) {
/* 20 */            this.f17673a = i;
                    this.f17677e = obj;
                    this.f17674b = obj2;
                    this.f17675c = obj3;
                    this.f17676d = obj4;
                }
            }
