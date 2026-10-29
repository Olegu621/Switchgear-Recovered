            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.content.pm.ResolveInfo;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteDatabaseLockedException;
            import android.database.sqlite.SQLiteException;
            import android.database.sqlite.SQLiteFullException;
            import android.os.Bundle;
            import android.os.Looper;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.util.Pair;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.measurement.internal.zzah;
            import com.google.android.gms.measurement.internal.zzbe;
            import com.google.android.gms.measurement.internal.zzbg;
            import com.google.android.gms.measurement.internal.zzga;
            import com.google.android.gms.measurement.internal.zzpk;
            import com.google.android.gms.measurement.internal.zzr;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pn3 extends wg3 {

                /* JADX INFO: renamed from: U */
                public final xm3 f15186U;

                /* JADX INFO: renamed from: c */
                public final mn3 f15187c;

                /* JADX INFO: renamed from: d */
                public zzga f15188d;

                /* JADX INFO: renamed from: e */
                public volatile Boolean f15189e;

                /* JADX INFO: renamed from: f */
                public final xm3 f15190f;

                /* JADX INFO: renamed from: i */
                public ScheduledExecutorService f15191i;

                /* JADX INFO: renamed from: v */
                public final C0193bu f15192v;

                /* JADX INFO: renamed from: w */
                public final ArrayList f15193w;

                public pn3(ij3 ij3Var) {
/* 1 */             super(ij3Var);
/* 9 */             this.f15193w = new ArrayList();
/* 18 */            this.f15192v = new C0193bu(ij3Var.f9640V);
/* 25 */            this.f15187c = new mn3(this);
/* 33 */            this.f15190f = new xm3(this, ij3Var, 0);
/* 41 */            this.f15186U = new xm3(this, ij3Var, 1);
                }

                @Override // p000.wg3
                /* JADX INFO: renamed from: C */
                public final boolean mo4531C() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: D */
                public final void m7508D(AtomicReference atomicReference) {
/* 1 */             mo1375y();
/* 4 */             m9576A();
/* 17 */            m7518N(new js0(this, atomicReference, m7520P(false)));
                }

                /* JADX WARN: Code duplicated, block: B:13:0x0056  */
                /* JADX WARN: Code duplicated, block: B:14:0x0059  */
                /* JADX INFO: renamed from: E */
                public final void m7509E(Bundle bundle) {
                    boolean z;
                    boolean zM6452G;
/* 1 */             mo1375y();
/* 4 */             m9576A();
/* 9 */             zzbe zzbeVar = new zzbe(bundle);
/* 12 */            m7516L();
/* 17 */            ij3 ij3Var = (ij3) this.f16749a;
/* 29 */            if (ij3Var.f9651d.m7406J(null, vg3.f18123c1)) {
/* 31 */                lh3 lh3VarM4566n = ij3Var.m4566n();
/* 37 */                ij3 ij3Var2 = (ij3) lh3VarM4566n.f16749a;
/* 39 */                up3 up3Var = ij3Var2.f9668w;
/* 41 */                uh3 uh3Var = ij3Var2.f9655f;
/* 43 */                ij3.m4553j(up3Var);
/* 46 */                byte[] bArrM9069d0 = up3.m9069d0(zzbeVar);
/* 50 */                if (bArrM9069d0 == null) {
/* 52 */                    ij3.m4555l(uh3Var);
/* 59 */                    uh3Var.f17539i.m8510a("Null default event parameters; not writing to database");
                        } else {
/* 67 */                    if (bArrM9069d0.length > 131072) {
/* 69 */                        ij3.m4555l(uh3Var);
/* 76 */                        uh3Var.f17539i.m8510a("Default event parameters too long for local database. Sending directly to service");
                            } else {
/* 81 */                        zM6452G = lh3VarM4566n.m6452G(bArrM9069d0, 4);
                            }
/* 85 */                    if (zM6452G) {
/* 88 */                        z = true;
                            } else {
/* 90 */                        z = false;
                            }
                        }
/* 62 */                zM6452G = false;
/* 85 */                if (zM6452G) {
/* 88 */                    z = true;
                        } else {
/* 90 */                    z = false;
                        }
                    } else {
/* 90 */                z = false;
                    }
/* 102 */           m7518N(new ft0(this, m7520P(false), z, zzbeVar, bundle));
                }

                /* JADX INFO: renamed from: F */
                public final void m7510F() {
/* 1 */             mo1375y();
/* 4 */             m9576A();
/* 11 */            if (m7521Q()) {
/* 171 */               return;
                    }
/* 20 */            if (m7511G()) {
/* 172 */               mn3 mn3Var = this.f15187c;
/* 174 */               pn3 pn3Var = mn3Var.f13886c;
/* 176 */               pn3Var.mo1375y();
/* 183 */               Context context = ((ij3) pn3Var.f16749a).f9645a;
                        synchronized (mn3Var) {
                            try {
/* 188 */                       if (mn3Var.f13884a) {
/* 196 */                           uh3 uh3Var = ((ij3) mn3Var.f13886c.f16749a).f9655f;
/* 198 */                           ij3.m4555l(uh3Var);
/* 205 */                           uh3Var.f17534Y.m8510a("Connection attempt already in progress");
/* 209 */                           return;
                                } else {
/* 215 */                           if (mn3Var.f13885b != null && (mn3Var.f13885b.isConnecting() || mn3Var.f13885b.isConnected())) {
/* 239 */                               uh3 uh3Var2 = ((ij3) mn3Var.f13886c.f16749a).f9655f;
/* 241 */                               ij3.m4555l(uh3Var2);
/* 248 */                               uh3Var2.f17534Y.m8510a("Already awaiting connection attempt");
/* 252 */                               return;
                                    }
/* 272 */                           mn3Var.f13885b = new oh3(context, Looper.getMainLooper(), lr0.m6523a(context), qr0.f15712b, 93, mn3Var, mn3Var, null);
/* 280 */                           uh3 uh3Var3 = ((ij3) mn3Var.f13886c.f16749a).f9655f;
/* 282 */                           ij3.m4555l(uh3Var3);
/* 289 */                           uh3Var3.f17534Y.m8510a("Connecting to remote service");
/* 292 */                           mn3Var.f13884a = true;
/* 296 */                           kb1.m6061n(mn3Var.f13885b);
/* 301 */                           mn3Var.f13885b.checkAvailabilityAndConnect();
/* 305 */                           return;
                                }
                            } catch (Throwable th) {
/* 307 */                       throw th;
                            }
                        }
                    }
/* 24 */            ij3 ij3Var = (ij3) this.f16749a;
/* 32 */            if (ij3Var.f9651d.m7399C()) {
/* 171 */               return;
                    }
/* 55 */            List<ResolveInfo> listQueryIntentServices = ij3Var.f9645a.getPackageManager().queryIntentServices(new Intent().setClassName(ij3Var.f9645a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
/* 59 */            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
/* 159 */               uh3 uh3Var4 = ij3Var.f9655f;
/* 161 */               ij3.m4555l(uh3Var4);
/* 168 */               uh3Var4.f17538f.m8510a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
/* 171 */               return;
                    }
/* 71 */            Intent intent = new Intent("com.google.android.gms.measurement.START");
/* 83 */            intent.setComponent(new ComponentName(ij3Var.f9645a, "com.google.android.gms.measurement.AppMeasurementService"));
/* 86 */            mn3 mn3Var2 = this.f15187c;
/* 88 */            pn3 pn3Var2 = mn3Var2.f13886c;
/* 90 */            pn3Var2.mo1375y();
/* 97 */            Context context2 = ((ij3) pn3Var2.f16749a).f9645a;
/* 99 */            C2515yy c2515yyM10190b = C2515yy.m10190b();
                    synchronized (mn3Var2) {
                        try {
/* 104 */                   boolean z = mn3Var2.f13884a;
/* 106 */                   pn3 pn3Var3 = mn3Var2.f13886c;
/* 108 */                   if (z) {
/* 114 */                       uh3 uh3Var5 = ((ij3) pn3Var3.f16749a).f9655f;
/* 116 */                       ij3.m4555l(uh3Var5);
/* 123 */                       uh3Var5.f17534Y.m8510a("Connection attempt already in progress");
                            } else {
/* 134 */                       uh3 uh3Var6 = ((ij3) pn3Var3.f16749a).f9655f;
/* 136 */                       ij3.m4555l(uh3Var6);
/* 143 */                       uh3Var6.f17534Y.m8510a("Using local app measurement service");
/* 146 */                       mn3Var2.f13884a = true;
/* 152 */                       c2515yyM10190b.m10191a(context2, intent, pn3Var3.f15187c, 129);
                            }
                        } catch (Throwable th2) {
/* 158 */                   throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: G */
                public final boolean m7511G() {
/* 1 */             mo1375y();
/* 4 */             m9576A();
/* 9 */             if (this.f15189e == null) {
/* 11 */                mo1375y();
/* 14 */                m9576A();
/* 19 */                ij3 ij3Var = (ij3) this.f16749a;
/* 21 */                ki3 ki3Var = ij3Var.f9653e;
/* 23 */                ij3.m4553j(ki3Var);
/* 26 */                ki3Var.mo1375y();
/* 39 */                boolean z = false;
/* 52 */                Boolean boolValueOf = !ki3Var.m6113D().contains("use_service") ? null : Boolean.valueOf(ki3Var.m6113D().getBoolean("use_service", false));
/* 56 */                boolean z2 = true;
/* 57 */                if (boolValueOf == null || !boolValueOf.booleanValue()) {
/* 71 */                    ih3 ih3VarM4569q = ((ij3) this.f16749a).m4569q();
/* 75 */                    ih3VarM4569q.m9576A();
/* 80 */                    if (ih3VarM4569q.f9592X == 1) {
/* 82 */                        z = true;
                            } else {
/* 85 */                        uh3 uh3Var = ij3Var.f9655f;
/* 87 */                        ij3.m4555l(uh3Var);
/* 94 */                        uh3Var.f17534Y.m8510a("Checking service availability");
/* 97 */                        up3 up3Var = ij3Var.f9668w;
/* 99 */                        ij3.m4553j(up3Var);
/* 113 */                       int iM8004c = qr0.f15712b.m8004c(((ij3) up3Var.f16749a).f9645a, 12451000);
/* 117 */                       if (iM8004c == 0) {
/* 235 */                           uh3 uh3Var2 = ij3Var.f9655f;
/* 237 */                           ij3.m4555l(uh3Var2);
/* 244 */                           uh3Var2.f17534Y.m8510a("Service available");
                                } else if (iM8004c == 1) {
/* 222 */                           uh3 uh3Var3 = ij3Var.f9655f;
/* 224 */                           ij3.m4555l(uh3Var3);
/* 231 */                           uh3Var3.f17534Y.m8510a("Service missing");
                                } else if (iM8004c != 2) {
/* 125 */                           if (iM8004c != 3) {
/* 127 */                               uh3 uh3Var4 = ij3Var.f9655f;
/* 131 */                               if (iM8004c == 9) {
/* 164 */                                   ij3.m4555l(uh3Var4);
/* 171 */                                   uh3Var4.f17541w.m8510a("Service invalid");
                                        } else if (iM8004c != 18) {
/* 137 */                                   ij3.m4555l(uh3Var4);
/* 148 */                                   uh3Var4.f17541w.m8511b(Integer.valueOf(iM8004c), "Unexpected service status");
                                        } else {
/* 153 */                                   ij3.m4555l(uh3Var4);
/* 160 */                                   uh3Var4.f17541w.m8510a("Service updating");
                                        }
                                    } else {
/* 175 */                               uh3 uh3Var5 = ij3Var.f9655f;
/* 177 */                               ij3.m4555l(uh3Var5);
/* 184 */                               uh3Var5.f17541w.m8510a("Service disabled");
                                    }
/* 151 */                           z2 = false;
                                } else {
/* 188 */                           uh3 uh3Var6 = ij3Var.f9655f;
/* 190 */                           ij3.m4555l(uh3Var6);
/* 197 */                           uh3Var6.f17533X.m8510a("Service container out of date");
/* 200 */                           up3 up3Var2 = ij3Var.f9668w;
/* 202 */                           ij3.m4553j(up3Var2);
/* 211 */                           if (up3Var2.m9103f0() >= 17443) {
/* 214 */                               z = boolValueOf == null;
/* 220 */                               z2 = false;
                                    }
                                }
/* 82 */                        z = true;
                            }
/* 249 */                   if (!z && ij3Var.f9651d.m7399C()) {
/* 259 */                       uh3 uh3Var7 = ij3Var.f9655f;
/* 261 */                       ij3.m4555l(uh3Var7);
/* 268 */                       uh3Var7.f17538f.m8510a("No way to upload. Consider using the full version of Analytics");
                            } else if (z2) {
/* 274 */                       ki3 ki3Var2 = ij3Var.f9653e;
/* 276 */                       ij3.m4553j(ki3Var2);
/* 279 */                       ki3Var2.mo1375y();
/* 286 */                       SharedPreferences.Editor editorEdit = ki3Var2.m6113D().edit();
/* 290 */                       editorEdit.putBoolean("use_service", z);
/* 293 */                       editorEdit.apply();
                            }
/* 296 */                   z2 = z;
                        }
/* 301 */               this.f15189e = Boolean.valueOf(z2);
                    }
/* 305 */           return this.f15189e.booleanValue();
                }

                /* JADX INFO: renamed from: H */
                public final void m7512H() {
/* 1 */             mo1375y();
/* 4 */             m9576A();
/* 7 */             mn3 mn3Var = this.f15187c;
/* 11 */            if (mn3Var.f13885b != null && (mn3Var.f13885b.isConnected() || mn3Var.f13885b.isConnecting())) {
/* 31 */                mn3Var.f13885b.disconnect();
                    }
/* 35 */            mn3Var.f13885b = null;
                    try {
/* 47 */                C2515yy.m10190b().m10193d(((ij3) this.f16749a).f9645a, mn3Var);
                    } catch (IllegalArgumentException | IllegalStateException unused) {
                    }
/* 50 */            this.f15188d = null;
                }

                /* JADX INFO: renamed from: I */
                public final boolean m7513I() {
/* 1 */             mo1375y();
/* 4 */             m9576A();
/* 11 */            if (!m7511G()) {
/* 44 */                return true;
                    }
/* 17 */            up3 up3Var = ((ij3) this.f16749a).f9668w;
/* 19 */            ij3.m4553j(up3Var);
                    return up3Var.m9103f0() >= ((Integer) vg3.f18082J0.m9011a(null)).intValue();
                }

                /* JADX INFO: renamed from: J */
                public final boolean m7514J() {
/* 1 */             mo1375y();
/* 4 */             m9576A();
/* 11 */            if (!m7511G()) {
/* 34 */                return true;
                    }
/* 17 */            up3 up3Var = ((ij3) this.f16749a).f9668w;
/* 19 */            ij3.m4553j(up3Var);
                    return up3Var.m9103f0() >= 241200;
                }

                /* JADX INFO: renamed from: K */
                public final void m7515K(ComponentName componentName) {
/* 1 */             mo1375y();
/* 6 */             if (this.f15188d != null) {
/* 9 */                 this.f15188d = null;
/* 15 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 17 */                ij3.m4555l(uh3Var);
/* 24 */                uh3Var.f17534Y.m8511b(componentName, "Disconnected from device MeasurementService");
/* 27 */                mo1375y();
/* 30 */                m7510F();
                    }
                }

                /* JADX INFO: renamed from: L */
                public final void m7516L() {
/* 5 */             ((ij3) this.f16749a).getClass();
                }

                /* JADX INFO: renamed from: M */
                public final void m7517M() {
/* 1 */             mo1375y();
/* 4 */             C0193bu c0193bu = this.f15192v;
/* 12 */            ((xt0) ((InterfaceC2475xv) c0193bu.f2606c)).getClass();
/* 19 */            c0193bu.f2605b = SystemClock.elapsedRealtime();
/* 25 */            ((ij3) this.f16749a).getClass();
/* 43 */            this.f15190f.m1348b(((Long) vg3.f18111Y.m9011a(null)).longValue());
                }

                /* JADX INFO: renamed from: N */
                public final void m7518N(Runnable runnable) {
/* 1 */             mo1375y();
/* 8 */             if (m7521Q()) {
/* 10 */                runnable.run();
/* 13 */                return;
                    }
/* 14 */            ArrayList arrayList = this.f15193w;
/* 16 */            long size = arrayList.size();
/* 23 */            ij3 ij3Var = (ij3) this.f16749a;
/* 25 */            ij3Var.getClass();
/* 32 */            if (size >= 1000) {
/* 34 */                uh3 uh3Var = ij3Var.f9655f;
/* 36 */                ij3.m4555l(uh3Var);
/* 43 */                uh3Var.f17538f.m8510a("Discarding data. Max runnable queue size reached");
                    } else {
/* 47 */                arrayList.add(runnable);
/* 55 */                this.f15186U.m1348b(60000L);
/* 58 */                m7510F();
                    }
                }

                /* JADX INFO: renamed from: O */
                public final void m7519O() {
/* 1 */             mo1375y();
/* 6 */             ij3 ij3Var = (ij3) this.f16749a;
/* 8 */             uh3 uh3Var = ij3Var.f9655f;
/* 10 */            ij3.m4555l(uh3Var);
/* 13 */            sh3 sh3Var = uh3Var.f17534Y;
/* 15 */            ArrayList arrayList = this.f15193w;
/* 27 */            sh3Var.m8511b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
/* 30 */            Iterator it = arrayList.iterator();
/* 38 */            while (it.hasNext()) {
                        try {
/* 46 */                    ((Runnable) it.next()).run();
                        } catch (RuntimeException e) {
/* 51 */                    uh3 uh3Var2 = ij3Var.f9655f;
/* 53 */                    ij3.m4555l(uh3Var2);
/* 60 */                    uh3Var2.f17538f.m8511b(e, "Task exception while flushing queue");
                        }
                    }
/* 64 */            arrayList.clear();
/* 69 */            this.f15186U.m1349c();
                }

                /* JADX INFO: renamed from: P */
                public final zzr m7520P(boolean z) {
                    long jAbs;
                    Pair pair;
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             ij3Var.getClass();
/* 8 */             ih3 ih3VarM4569q = ij3Var.m4569q();
/* 12 */            String strM3790p = null;
/* 13 */            if (z) {
/* 15 */                uh3 uh3Var = ij3Var.f9655f;
/* 17 */                ij3.m4555l(uh3Var);
/* 22 */                ij3 ij3Var2 = (ij3) uh3Var.f16749a;
/* 24 */                ki3 ki3Var = ij3Var2.f9653e;
/* 26 */                ij3.m4553j(ki3Var);
/* 31 */                if (ki3Var.f12807e != null) {
/* 35 */                    ki3 ki3Var2 = ij3Var2.f9653e;
/* 37 */                    ij3.m4553j(ki3Var2);
/* 40 */                    ji3 ji3Var = ki3Var2.f12807e;
/* 44 */                    ki3 ki3Var3 = (ki3) ji3Var.f12323e;
/* 46 */                    ki3Var3.mo1375y();
/* 49 */                    ki3Var3.mo1375y();
/* 66 */                    long j = ((ki3) ji3Var.f12323e).m6113D().getLong((String) ji3Var.f12320b, 0L);
/* 72 */                    if (j == 0) {
/* 74 */                        ji3Var.m5840b();
/* 77 */                        jAbs = 0;
                            } else {
/* 85 */                        ((ij3) ki3Var3.f16749a).f9640V.getClass();
/* 93 */                        jAbs = Math.abs(j - System.currentTimeMillis());
                            }
/* 97 */                    long j2 = ji3Var.f12319a;
/* 101 */                   if (jAbs < j2) {
/* 103 */                       pair = null;
                            } else if (jAbs > j2 + j2) {
/* 110 */                       ji3Var.m5840b();
/* 103 */                       pair = null;
                            } else {
/* 122 */                       String string = ki3Var3.m6113D().getString((String) ji3Var.f12322d, null);
/* 134 */                       long j3 = ki3Var3.m6113D().getLong((String) ji3Var.f12321c, 0L);
/* 138 */                       ji3Var.m5840b();
/* 158 */                       pair = (string == null || j3 <= 0) ? ki3.f12794k0 : new Pair(string, Long.valueOf(j3));
                            }
/* 160 */                   if (pair != null && pair != ki3.f12794k0) {
/* 169 */                       String strValueOf = String.valueOf(pair.second);
/* 175 */                       String str = (String) pair.first;
/* 199 */                       strM3790p = fm0.m3790p(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                            }
                        }
                    }
/* 203 */           return ih3VarM4569q.m4532D(strM3790p);
                }

                /* JADX INFO: renamed from: Q */
                public final boolean m7521Q() {
/* 1 */             mo1375y();
/* 4 */             m9576A();
                    return this.f15188d != null;
                }

                /* JADX WARN: Code duplicated, block: B:258:0x043a A[Catch: all -> 0x0476, TRY_ENTER, TryCatch #53 {all -> 0x0476, blocks: (B:268:0x0466, B:258:0x043a, B:260:0x0440, B:261:0x0443, B:278:0x0487, B:207:0x0371, B:209:0x037b, B:214:0x038c), top: B:417:0x0466 }] */
                /* JADX WARN: Code duplicated, block: B:263:0x0452  */
                /* JADX WARN: Code duplicated, block: B:271:0x046d  */
                /* JADX WARN: Code duplicated, block: B:273:0x0472 A[PHI: r4 r5 r23 r24 r26 r36 r37
  0x0472: PHI (r4v15 android.database.sqlite.SQLiteDatabase) = 
  (r4v12 android.database.sqlite.SQLiteDatabase)
  (r4v13 android.database.sqlite.SQLiteDatabase)
  (r4v16 android.database.sqlite.SQLiteDatabase)
 binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
  0x0472: PHI (r5v5 int) = (r5v3 int), (r5v3 int), (r5v6 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
  0x0472: PHI (r23v9 int) = (r23v6 int), (r23v7 int), (r23v10 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
  0x0472: PHI (r24v9 java.lang.String) = (r24v6 java.lang.String), (r24v7 java.lang.String), (r24v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
  0x0472: PHI (r26v9 java.lang.String) = (r26v6 java.lang.String), (r26v7 java.lang.String), (r26v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
  0x0472: PHI (r36v9 int) = (r36v6 int), (r36v7 int), (r36v10 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
  0x0472: PHI (r37v9 java.lang.String) = (r37v6 java.lang.String), (r37v7 java.lang.String), (r37v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:280:0x0496  */
                /* JADX WARN: Code duplicated, block: B:285:0x04aa  */
                /* JADX WARN: Code duplicated, block: B:287:0x04af  */
                /* JADX WARN: Code duplicated, block: B:292:0x04c9  */
                /* JADX WARN: Code duplicated, block: B:293:0x04d2  */
                /* JADX WARN: Code duplicated, block: B:300:0x04f3  */
                /* JADX WARN: Code duplicated, block: B:302:0x0503  */
                /* JADX WARN: Code duplicated, block: B:304:0x050b  */
                /* JADX WARN: Code duplicated, block: B:305:0x058f  */
                /* JADX WARN: Code duplicated, block: B:308:0x0595 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:317:0x05c6  */
                /* JADX WARN: Code duplicated, block: B:322:0x05d3 A[Catch: RemoteException -> 0x062c, TRY_LEAVE, TryCatch #15 {RemoteException -> 0x062c, blocks: (B:320:0x05ce, B:322:0x05d3), top: B:397:0x05ce }] */
                /* JADX WARN: Code duplicated, block: B:331:0x05f5  */
                /* JADX WARN: Code duplicated, block: B:344:0x0630  */
                /* JADX WARN: Code duplicated, block: B:349:0x064b  */
                /* JADX WARN: Code duplicated, block: B:353:0x0653  */
                /* JADX WARN: Code duplicated, block: B:355:0x0674  */
                /* JADX WARN: Code duplicated, block: B:361:0x0696  */
                /* JADX WARN: Code duplicated, block: B:367:0x06ae  */
                /* JADX WARN: Code duplicated, block: B:375:0x06cf  */
                /* JADX WARN: Code duplicated, block: B:387:0x069a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:407:0x0597 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:419:0x05e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:430:0x0684 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:474:0x049c A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:475:0x049c A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:477:0x049c A[SYNTHETIC] */
                /* JADX INFO: renamed from: R */
                public final void m7522R(zzga zzgaVar, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) throws Throwable {
                    ArrayList arrayList;
                    ij3 ij3Var;
                    Context context;
                    uh3 uh3Var;
                    int i;
                    SQLiteDatabase sQLiteDatabaseM6451F;
                    int i2;
                    int i3;
                    Cursor cursor;
                    Cursor cursorQuery;
                    Cursor cursorQuery2;
                    long j;
                    String str;
                    String[] strArr;
                    int i4;
                    long j2;
                    String string;
                    zzbe zzbeVarCreateFromParcel;
                    int i5;
                    zzah zzahVarCreateFromParcel;
                    zzpk zzpkVarCreateFromParcel;
                    int size;
                    String str2;
                    boolean zM7406J;
                    int size2;
                    int i6;
                    kh3 kh3Var;
                    AbstractSafeParcelable abstractSafeParcelable2;
                    ug3 ug3Var;
                    ij3 ij3Var2;
                    Context context2;
                    uh3 uh3Var2;
                    boolean z;
                    String str3;
                    long jElapsedRealtime;
                    long j3;
                    long jCurrentTimeMillis;
                    String str4;
/* 3 */             mo1375y();
/* 6 */             m9576A();
/* 9 */             m7516L();
/* 17 */            ij3 ij3Var3 = (ij3) this.f16749a;
/* 19 */            ij3Var3.getClass();
/* 22 */            Context context3 = ij3Var3.f9645a;
/* 24 */            uh3 uh3Var3 = ij3Var3.f9655f;
/* 26 */            xt0 xt0Var = ij3Var3.f9640V;
/* 28 */            pd3 pd3Var = ij3Var3.f9651d;
/* 32 */            zzr zzrVar2 = zzrVar;
/* 34 */            int i7 = 100;
/* 35 */            int i8 = 0;
/* 38 */            for (int i9 = 100; i8 < 1001 && i7 == i9; i9 = 100) {
/* 44 */                ArrayList arrayList2 = new ArrayList();
/* 47 */                lh3 lh3VarM4566n = ij3Var3.m4566n();
/* 53 */                String str5 = "entry";
/* 55 */                int i10 = i9;
/* 57 */                String str6 = "type";
/* 59 */                String str7 = "rowid";
/* 63 */                xt0 xt0Var2 = xt0Var;
/* 66 */                ij3 ij3Var4 = (ij3) lh3VarM4566n.f16749a;
/* 68 */                lh3VarM4566n.mo1375y();
/* 73 */                int i11 = i8;
/* 77 */                if (lh3VarM4566n.f13296d) {
/* 79 */                    ij3Var = ij3Var3;
/* 81 */                    context = context3;
/* 83 */                    uh3Var = uh3Var3;
                        } else {
/* 91 */                    arrayList = new ArrayList();
/* 100 */                   ij3Var = ij3Var3;
/* 112 */                   if (((ij3) lh3VarM4566n.f16749a).f9645a.getDatabasePath("google_app_measurement_local.db").exists()) {
/* 114 */                       int i12 = 5;
/* 115 */                       context = context3;
/* 117 */                       uh3Var = uh3Var3;
/* 119 */                       int i13 = 0;
/* 120 */                       int i14 = 5;
                                while (true) {
/* 121 */                           if (i13 < i12) {
                                        try {
/* 124 */                                   sQLiteDatabaseM6451F = lh3VarM4566n.m6451F();
/* 128 */                                   if (sQLiteDatabaseM6451F == null) {
                                                try {
                                                    try {
/* 130 */                                               lh3VarM4566n.f13296d = true;
                                                    } catch (Throwable th) {
/* 133 */                                               th = th;
/* 134 */                                               sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 1051 */                                              cursor = null;
/* 1193 */                                              if (cursor != null) {
/* 1195 */                                                  cursor.close();
                                                        }
/* 1198 */                                              if (sQLiteDatabaseM6451F != null) {
/* 1200 */                                                  sQLiteDatabaseM6451F.close();
                                                        }
/* 1203 */                                              throw th;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused) {
/* 154 */                                           i2 = i13;
/* 156 */                                           str7 = str7;
/* 163 */                                           i3 = 5;
/* 165 */                                           str6 = str6;
/* 1057 */                                          cursorQuery = null;
                                                    try {
/* 1127 */                                              SystemClock.sleep(i14);
/* 1130 */                                              i14 += 20;
/* 1132 */                                              if (cursorQuery != null) {
/* 1134 */                                                  cursorQuery.close();
                                                        }
/* 1137 */                                              if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                  sQLiteDatabaseM6451F.close();
                                                        }
/* 1181 */                                              i13 = i2 + 1;
/* 1183 */                                              i12 = i3;
/* 1185 */                                              str6 = str6;
/* 1187 */                                              str5 = str5;
/* 1189 */                                              str7 = str7;
                                                    } catch (Throwable th2) {
/* 1143 */                                              th = th2;
/* 923 */                                               cursor = cursorQuery;
/* 1193 */                                              if (cursor != null) {
/* 1195 */                                                  cursor.close();
                                                        }
/* 1198 */                                              if (sQLiteDatabaseM6451F != null) {
/* 1200 */                                                  sQLiteDatabaseM6451F.close();
                                                        }
/* 1203 */                                              throw th;
                                                    }
                                                } catch (SQLiteFullException e) {
/* 169 */                                           e = e;
/* 170 */                                           i2 = i13;
/* 172 */                                           str7 = str7;
/* 179 */                                           i3 = 5;
/* 181 */                                           str6 = str6;
/* 1060 */                                          cursorQuery = null;
/* 1160 */                                          uh3 uh3Var4 = ij3Var4.f9655f;
/* 1162 */                                          ij3.m4555l(uh3Var4);
/* 1167 */                                          uh3Var4.f17538f.m8511b(e, "Error reading entries from local database");
/* 1171 */                                          lh3VarM4566n.f13296d = true;
/* 1173 */                                          if (cursorQuery != null) {
/* 1175 */                                              cursorQuery.close();
                                                    }
/* 1178 */                                          if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                              sQLiteDatabaseM6451F.close();
                                                    }
/* 1181 */                                          i13 = i2 + 1;
/* 1183 */                                          i12 = i3;
/* 1185 */                                          str6 = str6;
/* 1187 */                                          str5 = str5;
/* 1189 */                                          str7 = str7;
                                                } catch (SQLiteException e2) {
/* 138 */                                           e = e2;
/* 139 */                                           i2 = i13;
/* 141 */                                           str7 = str7;
/* 148 */                                           i3 = 5;
/* 150 */                                           str6 = str6;
/* 1054 */                                          cursorQuery = null;
/* 1081 */                                          if (sQLiteDatabaseM6451F != null) {
/* 1089 */                                              sQLiteDatabaseM6451F.endTransaction();
                                                    }
/* 1092 */                                          uh3 uh3Var5 = ij3Var4.f9655f;
/* 1094 */                                          ij3.m4555l(uh3Var5);
/* 1099 */                                          uh3Var5.f17538f.m8511b(e, "Error reading entries from local database");
/* 1103 */                                          lh3VarM4566n.f13296d = true;
/* 1105 */                                          if (cursorQuery != null) {
/* 1107 */                                              cursorQuery.close();
                                                    }
/* 1110 */                                          if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                              sQLiteDatabaseM6451F.close();
                                                    }
/* 1181 */                                          i13 = i2 + 1;
/* 1183 */                                          i12 = i3;
/* 1185 */                                          str6 = str6;
/* 1187 */                                          str5 = str5;
/* 1189 */                                          str7 = str7;
                                                }
                                            } else {
/* 185 */                                       sQLiteDatabaseM6451F.beginTransaction();
                                                try {
/* 210 */                                           cursorQuery2 = sQLiteDatabaseM6451F.query("messages", new String[]{str7}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                                    try {
/* 218 */                                               long j4 = -1;
/* 220 */                                               if (cursorQuery2.moveToFirst()) {
/* 222 */                                                   i2 = i13;
                                                            try {
/* 225 */                                                       j = cursorQuery2.getLong(0);
                                                                try {
/* 229 */                                                           cursorQuery2.close();
                                                                } catch (SQLiteDatabaseLockedException unused2) {
/* 156 */                                                           str7 = str7;
/* 163 */                                                           i3 = 5;
/* 165 */                                                           str6 = str6;
/* 1057 */                                                          cursorQuery = null;
/* 1127 */                                                          SystemClock.sleep(i14);
/* 1130 */                                                          i14 += 20;
/* 1132 */                                                          if (cursorQuery != null) {
/* 1134 */                                                              cursorQuery.close();
                                                                    }
/* 1137 */                                                          if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                              sQLiteDatabaseM6451F.close();
                                                                    }
/* 1181 */                                                          i13 = i2 + 1;
/* 1183 */                                                          i12 = i3;
/* 1185 */                                                          str6 = str6;
/* 1187 */                                                          str5 = str5;
/* 1189 */                                                          str7 = str7;
                                                                } catch (SQLiteFullException e3) {
/* 235 */                                                           e = e3;
/* 172 */                                                           str7 = str7;
/* 179 */                                                           i3 = 5;
/* 181 */                                                           str6 = str6;
/* 1060 */                                                          cursorQuery = null;
/* 1160 */                                                          uh3 uh3Var6 = ij3Var4.f9655f;
/* 1162 */                                                          ij3.m4555l(uh3Var6);
/* 1167 */                                                          uh3Var6.f17538f.m8511b(e, "Error reading entries from local database");
/* 1171 */                                                          lh3VarM4566n.f13296d = true;
/* 1173 */                                                          if (cursorQuery != null) {
/* 1175 */                                                              cursorQuery.close();
                                                                    }
/* 1178 */                                                          if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                              sQLiteDatabaseM6451F.close();
                                                                    }
/* 1181 */                                                          i13 = i2 + 1;
/* 1183 */                                                          i12 = i3;
/* 1185 */                                                          str6 = str6;
/* 1187 */                                                          str5 = str5;
/* 1189 */                                                          str7 = str7;
                                                                } catch (SQLiteException e4) {
/* 233 */                                                           e = e4;
/* 141 */                                                           str7 = str7;
/* 148 */                                                           i3 = 5;
/* 150 */                                                           str6 = str6;
/* 1054 */                                                          cursorQuery = null;
/* 1081 */                                                          if (sQLiteDatabaseM6451F != null && sQLiteDatabaseM6451F.inTransaction()) {
/* 1089 */                                                              sQLiteDatabaseM6451F.endTransaction();
                                                                    }
/* 1092 */                                                          uh3 uh3Var7 = ij3Var4.f9655f;
/* 1094 */                                                          ij3.m4555l(uh3Var7);
/* 1099 */                                                          uh3Var7.f17538f.m8511b(e, "Error reading entries from local database");
/* 1103 */                                                          lh3VarM4566n.f13296d = true;
/* 1105 */                                                          if (cursorQuery != null) {
/* 1107 */                                                              cursorQuery.close();
                                                                    }
/* 1110 */                                                          if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                              sQLiteDatabaseM6451F.close();
                                                                    }
/* 1181 */                                                          i13 = i2 + 1;
/* 1183 */                                                          i12 = i3;
/* 1185 */                                                          str6 = str6;
/* 1187 */                                                          str5 = str5;
/* 1189 */                                                          str7 = str7;
                                                                }
                                                            } catch (Throwable th3) {
/* 237 */                                                       th = th3;
/* 245 */                                                       i3 = 5;
/* 1038 */                                                      if (cursorQuery2 != null) {
                                                                    try {
/* 1040 */                                                              cursorQuery2.close();
                                                                    } catch (SQLiteDatabaseLockedException unused3) {
/* 1057 */                                                              cursorQuery = null;
/* 1127 */                                                              SystemClock.sleep(i14);
/* 1130 */                                                              i14 += 20;
/* 1132 */                                                              if (cursorQuery != null) {
/* 1134 */                                                                  cursorQuery.close();
                                                                        }
/* 1137 */                                                              if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                  sQLiteDatabaseM6451F.close();
                                                                        }
/* 1181 */                                                              i13 = i2 + 1;
/* 1183 */                                                              i12 = i3;
/* 1185 */                                                              str6 = str6;
/* 1187 */                                                              str5 = str5;
/* 1189 */                                                              str7 = str7;
                                                                    } catch (SQLiteFullException e5) {
/* 1048 */                                                              e = e5;
/* 1060 */                                                              cursorQuery = null;
/* 1160 */                                                              uh3 uh3Var8 = ij3Var4.f9655f;
/* 1162 */                                                              ij3.m4555l(uh3Var8);
/* 1167 */                                                              uh3Var8.f17538f.m8511b(e, "Error reading entries from local database");
/* 1171 */                                                              lh3VarM4566n.f13296d = true;
/* 1173 */                                                              if (cursorQuery != null) {
/* 1175 */                                                                  cursorQuery.close();
                                                                        }
/* 1178 */                                                              if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                  sQLiteDatabaseM6451F.close();
                                                                        }
/* 1181 */                                                              i13 = i2 + 1;
/* 1183 */                                                              i12 = i3;
/* 1185 */                                                              str6 = str6;
/* 1187 */                                                              str5 = str5;
/* 1189 */                                                              str7 = str7;
                                                                    } catch (SQLiteException e6) {
/* 1046 */                                                              e = e6;
/* 1054 */                                                              cursorQuery = null;
/* 1081 */                                                              if (sQLiteDatabaseM6451F != null) {
/* 1089 */                                                                  sQLiteDatabaseM6451F.endTransaction();
                                                                        }
/* 1092 */                                                              uh3 uh3Var9 = ij3Var4.f9655f;
/* 1094 */                                                              ij3.m4555l(uh3Var9);
/* 1099 */                                                              uh3Var9.f17538f.m8511b(e, "Error reading entries from local database");
/* 1103 */                                                              lh3VarM4566n.f13296d = true;
/* 1105 */                                                              if (cursorQuery != null) {
/* 1107 */                                                                  cursorQuery.close();
                                                                        }
/* 1110 */                                                              if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                  sQLiteDatabaseM6451F.close();
                                                                        }
/* 1181 */                                                              i13 = i2 + 1;
/* 1183 */                                                              i12 = i3;
/* 1185 */                                                              str6 = str6;
/* 1187 */                                                              str5 = str5;
/* 1189 */                                                              str7 = str7;
                                                                    } catch (Throwable th4) {
/* 1044 */                                                              th = th4;
/* 1051 */                                                              cursor = null;
/* 1193 */                                                              if (cursor != null) {
/* 1195 */                                                                  cursor.close();
                                                                        }
/* 1198 */                                                              if (sQLiteDatabaseM6451F != null) {
/* 1200 */                                                                  sQLiteDatabaseM6451F.close();
                                                                        }
/* 1203 */                                                              throw th;
                                                                    }
                                                                }
/* 1050 */                                                      throw th;
                                                            }
                                                        } else {
/* 251 */                                                   i2 = i13;
/* 253 */                                                   cursorQuery2.close();
/* 256 */                                                   j = -1;
                                                        }
/* 260 */                                               if (j != -1) {
/* 262 */                                                   str = "rowid<?";
/* 265 */                                                   strArr = new String[]{String.valueOf(j)};
                                                        } else {
/* 280 */                                                   str = null;
/* 282 */                                                   strArr = null;
                                                        }
                                                        try {
/* 284 */                                                   String[] strArr2 = {str7, str6, str5};
/* 288 */                                                   pd3 pd3Var2 = ij3Var4.f9651d;
/* 290 */                                                   ug3 ug3Var2 = vg3.f18123c1;
/* 292 */                                                   str7 = str7;
                                                            try {
                                                                try {
/* 299 */                                                           int i15 = 4;
/* 301 */                                                           int i16 = 3;
/* 304 */                                                           if (pd3Var2.m7406J(null, ug3Var2)) {
/* 306 */                                                               i4 = 5;
                                                                        try {
/* 307 */                                                                   strArr2 = new String[]{str7, str6, str5, "app_version", "app_version_int"};
                                                                        } catch (SQLiteDatabaseLockedException unused4) {
/* 340 */                                                                   i3 = 5;
/* 165 */                                                                   str6 = str6;
/* 1057 */                                                                  cursorQuery = null;
/* 1127 */                                                                  SystemClock.sleep(i14);
/* 1130 */                                                                  i14 += 20;
/* 1132 */                                                                  if (cursorQuery != null) {
/* 1134 */                                                                      cursorQuery.close();
                                                                            }
/* 1137 */                                                                  if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                      sQLiteDatabaseM6451F.close();
                                                                            }
/* 1181 */                                                                  i13 = i2 + 1;
/* 1183 */                                                                  i12 = i3;
/* 1185 */                                                                  str6 = str6;
/* 1187 */                                                                  str5 = str5;
/* 1189 */                                                                  str7 = str7;
                                                                        } catch (SQLiteFullException e7) {
/* 349 */                                                                   e = e7;
/* 350 */                                                                   i3 = 5;
/* 181 */                                                                   str6 = str6;
/* 1060 */                                                                  cursorQuery = null;
/* 1160 */                                                                  uh3 uh3Var10 = ij3Var4.f9655f;
/* 1162 */                                                                  ij3.m4555l(uh3Var10);
/* 1167 */                                                                  uh3Var10.f17538f.m8511b(e, "Error reading entries from local database");
/* 1171 */                                                                  lh3VarM4566n.f13296d = true;
/* 1173 */                                                                  if (cursorQuery != null) {
/* 1175 */                                                                      cursorQuery.close();
                                                                            }
/* 1178 */                                                                  if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                      sQLiteDatabaseM6451F.close();
                                                                            }
/* 1181 */                                                                  i13 = i2 + 1;
/* 1183 */                                                                  i12 = i3;
/* 1185 */                                                                  str6 = str6;
/* 1187 */                                                                  str5 = str5;
/* 1189 */                                                                  str7 = str7;
                                                                        } catch (SQLiteException e8) {
/* 330 */                                                                   e = e8;
/* 331 */                                                                   i3 = 5;
/* 150 */                                                                   str6 = str6;
/* 1054 */                                                                  cursorQuery = null;
/* 1081 */                                                                  if (sQLiteDatabaseM6451F != null) {
/* 1089 */                                                                      sQLiteDatabaseM6451F.endTransaction();
                                                                            }
/* 1092 */                                                                  uh3 uh3Var11 = ij3Var4.f9655f;
/* 1094 */                                                                  ij3.m4555l(uh3Var11);
/* 1099 */                                                                  uh3Var11.f17538f.m8511b(e, "Error reading entries from local database");
/* 1103 */                                                                  lh3VarM4566n.f13296d = true;
/* 1105 */                                                                  if (cursorQuery != null) {
/* 1107 */                                                                      cursorQuery.close();
                                                                            }
/* 1110 */                                                                  if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                      sQLiteDatabaseM6451F.close();
                                                                            }
/* 1181 */                                                                  i13 = i2 + 1;
/* 1183 */                                                                  i12 = i3;
/* 1185 */                                                                  str6 = str6;
/* 1187 */                                                                  str5 = str5;
/* 1189 */                                                                  str7 = str7;
                                                                        }
                                                                    } else {
/* 359 */                                                               i4 = 5;
                                                                    }
                                                                    try {
/* 373 */                                                               cursorQuery = sQLiteDatabaseM6451F.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i10));
/* 383 */                                                               while (cursorQuery.moveToNext()) {
                                                                            try {
                                                                                try {
                                                                                    try {
/* 386 */                                                                               j4 = cursorQuery.getLong(0);
                                                                                        try {
/* 391 */                                                                                   int i17 = cursorQuery.getInt(1);
/* 395 */                                                                                   str6 = str6;
                                                                                            try {
/* 398 */                                                                                       byte[] blob = cursorQuery.getBlob(2);
/* 404 */                                                                                       str5 = str5;
                                                                                                try {
/* 411 */                                                                                           if (ij3Var4.f9651d.m7406J(null, ug3Var2)) {
                                                                                                        try {
/* 415 */                                                                                                   string = cursorQuery.getString(i16);
/* 421 */                                                                                                   j2 = cursorQuery.getLong(i15);
                                                                                                        } catch (SQLiteDatabaseLockedException unused5) {
/* 448 */                                                                                                   cursorQuery = cursorQuery;
/* 450 */                                                                                                   sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 948 */                                                                                                   i3 = 5;
/* 1127 */                                                                                                  SystemClock.sleep(i14);
/* 1130 */                                                                                                  i14 += 20;
/* 1132 */                                                                                                  if (cursorQuery != null) {
/* 1134 */                                                                                                      cursorQuery.close();
                                                                                                            }
/* 1137 */                                                                                                  if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                                      sQLiteDatabaseM6451F.close();
                                                                                                            }
/* 1181 */                                                                                                  i13 = i2 + 1;
/* 1183 */                                                                                                  i12 = i3;
/* 1185 */                                                                                                  str6 = str6;
/* 1187 */                                                                                                  str5 = str5;
/* 1189 */                                                                                                  str7 = str7;
                                                                                                        } catch (SQLiteFullException e9) {
/* 455 */                                                                                                   e = e9;
/* 456 */                                                                                                   cursorQuery = cursorQuery;
/* 458 */                                                                                                   sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 961 */                                                                                                   i3 = 5;
/* 1160 */                                                                                                  uh3 uh3Var12 = ij3Var4.f9655f;
/* 1162 */                                                                                                  ij3.m4555l(uh3Var12);
/* 1167 */                                                                                                  uh3Var12.f17538f.m8511b(e, "Error reading entries from local database");
/* 1171 */                                                                                                  lh3VarM4566n.f13296d = true;
/* 1173 */                                                                                                  if (cursorQuery != null) {
/* 1175 */                                                                                                      cursorQuery.close();
                                                                                                            }
/* 1178 */                                                                                                  if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                                      sQLiteDatabaseM6451F.close();
                                                                                                            }
/* 1181 */                                                                                                  i13 = i2 + 1;
/* 1183 */                                                                                                  i12 = i3;
/* 1185 */                                                                                                  str6 = str6;
/* 1187 */                                                                                                  str5 = str5;
/* 1189 */                                                                                                  str7 = str7;
                                                                                                        } catch (SQLiteException e10) {
/* 440 */                                                                                                   e = e10;
/* 441 */                                                                                                   cursorQuery = cursorQuery;
/* 443 */                                                                                                   sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 936 */                                                                                                   i3 = 5;
/* 1081 */                                                                                                  if (sQLiteDatabaseM6451F != null) {
/* 1089 */                                                                                                      sQLiteDatabaseM6451F.endTransaction();
                                                                                                            }
/* 1092 */                                                                                                  uh3 uh3Var13 = ij3Var4.f9655f;
/* 1094 */                                                                                                  ij3.m4555l(uh3Var13);
/* 1099 */                                                                                                  uh3Var13.f17538f.m8511b(e, "Error reading entries from local database");
/* 1103 */                                                                                                  lh3VarM4566n.f13296d = true;
/* 1105 */                                                                                                  if (cursorQuery != null) {
/* 1107 */                                                                                                      cursorQuery.close();
                                                                                                            }
/* 1110 */                                                                                                  if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                                      sQLiteDatabaseM6451F.close();
                                                                                                            }
/* 1181 */                                                                                                  i13 = i2 + 1;
/* 1183 */                                                                                                  i12 = i3;
/* 1185 */                                                                                                  str6 = str6;
/* 1187 */                                                                                                  str5 = str5;
/* 1189 */                                                                                                  str7 = str7;
                                                                                                        }
                                                                                                    } else {
/* 466 */                                                                                               j2 = 0;
/* 468 */                                                                                               string = null;
                                                                                                    }
/* 469 */                                                                                           if (i17 == 0) {
/* 471 */                                                                                               cursorQuery = cursorQuery;
                                                                                                        try {
                                                                                                            try {
/* 473 */                                                                                                       Parcel parcelObtain = Parcel.obtain();
                                                                                                                try {
                                                                                                                    try {
/* 479 */                                                                                                               parcelObtain.unmarshall(blob, 0, blob.length);
/* 482 */                                                                                                               parcelObtain.setDataPosition(0);
/* 487 */                                                                                                               zzbg zzbgVarCreateFromParcel = zzbg.CREATOR.createFromParcel(parcelObtain);
/* 493 */                                                                                                               parcelObtain.recycle();
/* 496 */                                                                                                               if (zzbgVarCreateFromParcel != null) {
/* 503 */                                                                                                                   arrayList.add(new kh3(zzbgVarCreateFromParcel, string, j2));
                                                                                                                        }
                                                                                                                    } catch (Throwable th5) {
/* 534 */                                                                                                               parcelObtain.recycle();
/* 537 */                                                                                                               throw th5;
                                                                                                                    }
                                                                                                                } catch (g62 unused6) {
/* 518 */                                                                                                           uh3 uh3Var14 = ij3Var4.f9655f;
/* 520 */                                                                                                           ij3.m4555l(uh3Var14);
/* 527 */                                                                                                           uh3Var14.f17538f.m8510a("Failed to load event from local database");
/* 530 */                                                                                                           parcelObtain.recycle();
                                                                                                                }
                                                                                                            } catch (SQLiteDatabaseLockedException unused7) {
/* 450 */                                                                                                       sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 948 */                                                                                                       i3 = 5;
/* 1127 */                                                                                                      SystemClock.sleep(i14);
/* 1130 */                                                                                                      i14 += 20;
/* 1132 */                                                                                                      if (cursorQuery != null) {
/* 1134 */                                                                                                          cursorQuery.close();
                                                                                                                }
/* 1137 */                                                                                                      if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                                          sQLiteDatabaseM6451F.close();
                                                                                                                }
/* 1181 */                                                                                                      i13 = i2 + 1;
/* 1183 */                                                                                                      i12 = i3;
/* 1185 */                                                                                                      str6 = str6;
/* 1187 */                                                                                                      str5 = str5;
/* 1189 */                                                                                                      str7 = str7;
                                                                                                            } catch (SQLiteFullException e11) {
/* 514 */                                                                                                       e = e11;
/* 458 */                                                                                                       sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 961 */                                                                                                       i3 = 5;
/* 1160 */                                                                                                      uh3 uh3Var15 = ij3Var4.f9655f;
/* 1162 */                                                                                                      ij3.m4555l(uh3Var15);
/* 1167 */                                                                                                      uh3Var15.f17538f.m8511b(e, "Error reading entries from local database");
/* 1171 */                                                                                                      lh3VarM4566n.f13296d = true;
/* 1173 */                                                                                                      if (cursorQuery != null) {
/* 1175 */                                                                                                          cursorQuery.close();
                                                                                                                }
/* 1178 */                                                                                                      if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                                          sQLiteDatabaseM6451F.close();
                                                                                                                }
/* 1181 */                                                                                                      i13 = i2 + 1;
/* 1183 */                                                                                                      i12 = i3;
/* 1185 */                                                                                                      str6 = str6;
/* 1187 */                                                                                                      str5 = str5;
/* 1189 */                                                                                                      str7 = str7;
                                                                                                            } catch (SQLiteException e12) {
/* 512 */                                                                                                       e = e12;
/* 443 */                                                                                                       sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 936 */                                                                                                       i3 = 5;
/* 1081 */                                                                                                      if (sQLiteDatabaseM6451F != null) {
/* 1089 */                                                                                                          sQLiteDatabaseM6451F.endTransaction();
                                                                                                                }
/* 1092 */                                                                                                      uh3 uh3Var16 = ij3Var4.f9655f;
/* 1094 */                                                                                                      ij3.m4555l(uh3Var16);
/* 1099 */                                                                                                      uh3Var16.f17538f.m8511b(e, "Error reading entries from local database");
/* 1103 */                                                                                                      lh3VarM4566n.f13296d = true;
/* 1105 */                                                                                                      if (cursorQuery != null) {
/* 1107 */                                                                                                          cursorQuery.close();
                                                                                                                }
/* 1110 */                                                                                                      if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                                          sQLiteDatabaseM6451F.close();
                                                                                                                }
/* 1181 */                                                                                                      i13 = i2 + 1;
/* 1183 */                                                                                                      i12 = i3;
/* 1185 */                                                                                                      str6 = str6;
/* 1187 */                                                                                                      str5 = str5;
/* 1189 */                                                                                                      str7 = str7;
                                                                                                            }
                                                                                                        } catch (Throwable th6) {
/* 510 */                                                                                                   th = th6;
/* 436 */                                                                                                   sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 923 */                                                                                                   cursor = cursorQuery;
/* 1193 */                                                                                                  if (cursor != null) {
/* 1195 */                                                                                                      cursor.close();
                                                                                                            }
/* 1198 */                                                                                                  if (sQLiteDatabaseM6451F != null) {
/* 1200 */                                                                                                      sQLiteDatabaseM6451F.close();
                                                                                                            }
/* 1203 */                                                                                                  throw th;
                                                                                                        }
                                                                                                    } else {
/* 538 */                                                                                               cursorQuery = cursorQuery;
/* 541 */                                                                                               if (i17 == 1) {
/* 543 */                                                                                                   Parcel parcelObtain2 = Parcel.obtain();
                                                                                                            try {
                                                                                                                try {
/* 549 */                                                                                                           parcelObtain2.unmarshall(blob, 0, blob.length);
/* 552 */                                                                                                           parcelObtain2.setDataPosition(0);
/* 557 */                                                                                                           zzpkVarCreateFromParcel = zzpk.CREATOR.createFromParcel(parcelObtain2);
/* 563 */                                                                                                           parcelObtain2.recycle();
                                                                                                                } catch (g62 unused8) {
/* 569 */                                                                                                           uh3 uh3Var17 = ij3Var4.f9655f;
/* 571 */                                                                                                           ij3.m4555l(uh3Var17);
/* 578 */                                                                                                           uh3Var17.f17538f.m8510a("Failed to load user property from local database");
/* 581 */                                                                                                           parcelObtain2.recycle();
/* 584 */                                                                                                           zzpkVarCreateFromParcel = null;
                                                                                                                }
/* 585 */                                                                                                       if (zzpkVarCreateFromParcel != null) {
/* 592 */                                                                                                           arrayList.add(new kh3(zzpkVarCreateFromParcel, string, j2));
                                                                                                                }
                                                                                                            } catch (Throwable th7) {
/* 596 */                                                                                                       parcelObtain2.recycle();
/* 599 */                                                                                                       throw th7;
                                                                                                            }
                                                                                                        } else {
/* 601 */                                                                                                   if (i17 == 2) {
/* 603 */                                                                                                       Parcel parcelObtain3 = Parcel.obtain();
                                                                                                                try {
                                                                                                                    try {
/* 609 */                                                                                                               parcelObtain3.unmarshall(blob, 0, blob.length);
/* 612 */                                                                                                               parcelObtain3.setDataPosition(0);
/* 617 */                                                                                                               zzahVarCreateFromParcel = zzah.CREATOR.createFromParcel(parcelObtain3);
/* 623 */                                                                                                               parcelObtain3.recycle();
                                                                                                                    } catch (Throwable th8) {
/* 657 */                                                                                                               parcelObtain3.recycle();
/* 660 */                                                                                                               throw th8;
                                                                                                                    }
                                                                                                                } catch (g62 unused9) {
/* 629 */                                                                                                           uh3 uh3Var18 = ij3Var4.f9655f;
/* 631 */                                                                                                           ij3.m4555l(uh3Var18);
/* 638 */                                                                                                           uh3Var18.f17538f.m8510a("Failed to load conditional user property from local database");
/* 641 */                                                                                                           parcelObtain3.recycle();
/* 644 */                                                                                                           zzahVarCreateFromParcel = null;
                                                                                                                }
/* 645 */                                                                                                       if (zzahVarCreateFromParcel != null) {
/* 652 */                                                                                                           arrayList.add(new kh3(zzahVarCreateFromParcel, string, j2));
                                                                                                                }
                                                                                                            } else if (i17 == 4) {
                                                                                                                try {
/* 664 */                                                                                                           Parcel parcelObtain4 = Parcel.obtain();
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
/* 670 */                                                                                                                       parcelObtain4.unmarshall(blob, 0, blob.length);
/* 673 */                                                                                                                       parcelObtain4.setDataPosition(0);
/* 678 */                                                                                                                       zzbeVarCreateFromParcel = zzbe.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                                try {
/* 684 */                                                                                                                           parcelObtain4.recycle();
/* 724 */                                                                                                                           if (zzbeVarCreateFromParcel != null) {
/* 731 */                                                                                                                               arrayList.add(new kh3(zzbeVarCreateFromParcel, string, j2));
                                                                                                                                    }
/* 734 */                                                                                                                           i5 = 3;
                                                                                                                                } catch (SQLiteDatabaseLockedException unused10) {
/* 693 */                                                                                                                           sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 948 */                                                                                                                           i3 = 5;
/* 1127 */                                                                                                                          SystemClock.sleep(i14);
/* 1130 */                                                                                                                          i14 += 20;
/* 1132 */                                                                                                                          if (cursorQuery != null) {
/* 1134 */                                                                                                                              cursorQuery.close();
                                                                                                                                    }
/* 1137 */                                                                                                                          if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                                                              sQLiteDatabaseM6451F.close();
                                                                                                                                    }
/* 1181 */                                                                                                                          i13 = i2 + 1;
/* 1183 */                                                                                                                          i12 = i3;
/* 1185 */                                                                                                                          str6 = str6;
/* 1187 */                                                                                                                          str5 = str5;
/* 1189 */                                                                                                                          str7 = str7;
                                                                                                                                } catch (SQLiteFullException e13) {
/* 697 */                                                                                                                           e = e13;
/* 698 */                                                                                                                           sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 961 */                                                                                                                           i3 = 5;
/* 1160 */                                                                                                                          uh3 uh3Var19 = ij3Var4.f9655f;
/* 1162 */                                                                                                                          ij3.m4555l(uh3Var19);
/* 1167 */                                                                                                                          uh3Var19.f17538f.m8511b(e, "Error reading entries from local database");
/* 1171 */                                                                                                                          lh3VarM4566n.f13296d = true;
/* 1173 */                                                                                                                          if (cursorQuery != null) {
/* 1175 */                                                                                                                              cursorQuery.close();
                                                                                                                                    }
/* 1178 */                                                                                                                          if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                                                              sQLiteDatabaseM6451F.close();
                                                                                                                                    }
/* 1181 */                                                                                                                          i13 = i2 + 1;
/* 1183 */                                                                                                                          i12 = i3;
/* 1185 */                                                                                                                          str6 = str6;
/* 1187 */                                                                                                                          str5 = str5;
/* 1189 */                                                                                                                          str7 = str7;
                                                                                                                                } catch (SQLiteException e14) {
/* 688 */                                                                                                                           e = e14;
/* 689 */                                                                                                                           sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 936 */                                                                                                                           i3 = 5;
/* 1081 */                                                                                                                          if (sQLiteDatabaseM6451F != null) {
/* 1089 */                                                                                                                              sQLiteDatabaseM6451F.endTransaction();
                                                                                                                                    }
/* 1092 */                                                                                                                          uh3 uh3Var110 = ij3Var4.f9655f;
/* 1094 */                                                                                                                          ij3.m4555l(uh3Var110);
/* 1099 */                                                                                                                          uh3Var110.f17538f.m8511b(e, "Error reading entries from local database");
/* 1103 */                                                                                                                          lh3VarM4566n.f13296d = true;
/* 1105 */                                                                                                                          if (cursorQuery != null) {
/* 1107 */                                                                                                                              cursorQuery.close();
                                                                                                                                    }
/* 1110 */                                                                                                                          if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                                                              sQLiteDatabaseM6451F.close();
                                                                                                                                    }
/* 1181 */                                                                                                                          i13 = i2 + 1;
/* 1183 */                                                                                                                          i12 = i3;
/* 1185 */                                                                                                                          str6 = str6;
/* 1187 */                                                                                                                          str5 = str5;
/* 1189 */                                                                                                                          str7 = str7;
                                                                                                                                }
                                                                                                                            } catch (g62 unused11) {
/* 708 */                                                                                                                       uh3 uh3Var20 = ij3Var4.f9655f;
/* 710 */                                                                                                                       ij3.m4555l(uh3Var20);
/* 717 */                                                                                                                       uh3Var20.f17538f.m8510a("Failed to load default event parameters from local database");
/* 720 */                                                                                                                       parcelObtain4.recycle();
/* 723 */                                                                                                                       zzbeVarCreateFromParcel = null;
                                                                                                                            }
                                                                                                                        } catch (Throwable th9) {
/* 702 */                                                                                                                   th = th9;
/* 736 */                                                                                                                   parcelObtain4.recycle();
/* 739 */                                                                                                                   throw th;
                                                                                                                        }
                                                                                                                    } catch (g62 unused12) {
                                                                                                                    } catch (Throwable th10) {
/* 704 */                                                                                                               th = th10;
                                                                                                                    }
                                                                                                                } catch (SQLiteDatabaseLockedException unused13) {
/* 693 */                                                                                                           sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 948 */                                                                                                           i3 = 5;
/* 1127 */                                                                                                          SystemClock.sleep(i14);
/* 1130 */                                                                                                          i14 += 20;
/* 1132 */                                                                                                          if (cursorQuery != null) {
/* 1134 */                                                                                                              cursorQuery.close();
                                                                                                                    }
/* 1137 */                                                                                                          if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                                              sQLiteDatabaseM6451F.close();
                                                                                                                    }
/* 1181 */                                                                                                          i13 = i2 + 1;
/* 1183 */                                                                                                          i12 = i3;
/* 1185 */                                                                                                          str6 = str6;
/* 1187 */                                                                                                          str5 = str5;
/* 1189 */                                                                                                          str7 = str7;
                                                                                                                } catch (SQLiteFullException e15) {
/* 745 */                                                                                                           e = e15;
/* 698 */                                                                                                           sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 961 */                                                                                                           i3 = 5;
/* 1160 */                                                                                                          uh3 uh3Var111 = ij3Var4.f9655f;
/* 1162 */                                                                                                          ij3.m4555l(uh3Var111);
/* 1167 */                                                                                                          uh3Var111.f17538f.m8511b(e, "Error reading entries from local database");
/* 1171 */                                                                                                          lh3VarM4566n.f13296d = true;
/* 1173 */                                                                                                          if (cursorQuery != null) {
/* 1175 */                                                                                                              cursorQuery.close();
                                                                                                                    }
/* 1178 */                                                                                                          if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                                              sQLiteDatabaseM6451F.close();
                                                                                                                    }
/* 1181 */                                                                                                          i13 = i2 + 1;
/* 1183 */                                                                                                          i12 = i3;
/* 1185 */                                                                                                          str6 = str6;
/* 1187 */                                                                                                          str5 = str5;
/* 1189 */                                                                                                          str7 = str7;
                                                                                                                } catch (SQLiteException e16) {
/* 740 */                                                                                                           e = e16;
/* 689 */                                                                                                           sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 936 */                                                                                                           i3 = 5;
/* 1081 */                                                                                                          if (sQLiteDatabaseM6451F != null) {
/* 1089 */                                                                                                              sQLiteDatabaseM6451F.endTransaction();
                                                                                                                    }
/* 1092 */                                                                                                          uh3 uh3Var112 = ij3Var4.f9655f;
/* 1094 */                                                                                                          ij3.m4555l(uh3Var112);
/* 1099 */                                                                                                          uh3Var112.f17538f.m8511b(e, "Error reading entries from local database");
/* 1103 */                                                                                                          lh3VarM4566n.f13296d = true;
/* 1105 */                                                                                                          if (cursorQuery != null) {
/* 1107 */                                                                                                              cursorQuery.close();
                                                                                                                    }
/* 1110 */                                                                                                          if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                                              sQLiteDatabaseM6451F.close();
                                                                                                                    }
/* 1181 */                                                                                                          i13 = i2 + 1;
/* 1183 */                                                                                                          i12 = i3;
/* 1185 */                                                                                                          str6 = str6;
/* 1187 */                                                                                                          str5 = str5;
/* 1189 */                                                                                                          str7 = str7;
                                                                                                                }
                                                                                                            } else {
/* 749 */                                                                                                       uh3 uh3Var21 = ij3Var4.f9655f;
/* 751 */                                                                                                       i5 = 3;
/* 752 */                                                                                                       if (i17 == 3) {
/* 754 */                                                                                                           ij3.m4555l(uh3Var21);
/* 761 */                                                                                                           uh3Var21.f17534Y.m8510a("Skipping app launch break");
                                                                                                                } else {
/* 765 */                                                                                                           ij3.m4555l(uh3Var21);
/* 772 */                                                                                                           uh3Var21.f17538f.m8510a("Unknown record type in local database");
                                                                                                                }
                                                                                                            }
/* 775 */                                                                                                   i16 = i5;
/* 777 */                                                                                                   str6 = str6;
/* 779 */                                                                                                   str5 = str5;
/* 781 */                                                                                                   ug3Var2 = ug3Var2;
/* 783 */                                                                                                   cursorQuery = cursorQuery;
/* 786 */                                                                                                   i15 = 4;
                                                                                                        }
                                                                                                    }
/* 506 */                                                                                           i5 = 3;
/* 775 */                                                                                           i16 = i5;
/* 777 */                                                                                           str6 = str6;
/* 779 */                                                                                           str5 = str5;
/* 781 */                                                                                           ug3Var2 = ug3Var2;
/* 783 */                                                                                           cursorQuery = cursorQuery;
/* 786 */                                                                                           i15 = 4;
                                                                                                } catch (SQLiteDatabaseLockedException unused14) {
/* 794 */                                                                                           cursorQuery = cursorQuery;
                                                                                                } catch (SQLiteFullException e17) {
/* 797 */                                                                                           e = e17;
/* 798 */                                                                                           cursorQuery = cursorQuery;
                                                                                                } catch (SQLiteException e18) {
/* 790 */                                                                                           e = e18;
/* 791 */                                                                                           cursorQuery = cursorQuery;
                                                                                                }
                                                                                            } catch (SQLiteDatabaseLockedException unused15) {
/* 809 */                                                                                       str5 = str5;
/* 693 */                                                                                       sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 948 */                                                                                       i3 = 5;
/* 1127 */                                                                                      SystemClock.sleep(i14);
/* 1130 */                                                                                      i14 += 20;
/* 1132 */                                                                                      if (cursorQuery != null) {
/* 1134 */                                                                                          cursorQuery.close();
                                                                                                }
/* 1137 */                                                                                      if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                          sQLiteDatabaseM6451F.close();
                                                                                                }
/* 1181 */                                                                                      i13 = i2 + 1;
/* 1183 */                                                                                      i12 = i3;
/* 1185 */                                                                                      str6 = str6;
/* 1187 */                                                                                      str5 = str5;
/* 1189 */                                                                                      str7 = str7;
                                                                                            } catch (SQLiteFullException e19) {
/* 812 */                                                                                       e = e19;
/* 815 */                                                                                       str5 = str5;
/* 698 */                                                                                       sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 961 */                                                                                       i3 = 5;
/* 1160 */                                                                                      uh3 uh3Var113 = ij3Var4.f9655f;
/* 1162 */                                                                                      ij3.m4555l(uh3Var113);
/* 1167 */                                                                                      uh3Var113.f17538f.m8511b(e, "Error reading entries from local database");
/* 1171 */                                                                                      lh3VarM4566n.f13296d = true;
/* 1173 */                                                                                      if (cursorQuery != null) {
/* 1175 */                                                                                          cursorQuery.close();
                                                                                                }
/* 1178 */                                                                                      if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                          sQLiteDatabaseM6451F.close();
                                                                                                }
/* 1181 */                                                                                      i13 = i2 + 1;
/* 1183 */                                                                                      i12 = i3;
/* 1185 */                                                                                      str6 = str6;
/* 1187 */                                                                                      str5 = str5;
/* 1189 */                                                                                      str7 = str7;
                                                                                            } catch (SQLiteException e20) {
/* 801 */                                                                                       e = e20;
/* 804 */                                                                                       str5 = str5;
/* 689 */                                                                                       sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 936 */                                                                                       i3 = 5;
/* 1081 */                                                                                      if (sQLiteDatabaseM6451F != null) {
/* 1089 */                                                                                          sQLiteDatabaseM6451F.endTransaction();
                                                                                                }
/* 1092 */                                                                                      uh3 uh3Var114 = ij3Var4.f9655f;
/* 1094 */                                                                                      ij3.m4555l(uh3Var114);
/* 1099 */                                                                                      uh3Var114.f17538f.m8511b(e, "Error reading entries from local database");
/* 1103 */                                                                                      lh3VarM4566n.f13296d = true;
/* 1105 */                                                                                      if (cursorQuery != null) {
/* 1107 */                                                                                          cursorQuery.close();
                                                                                                }
/* 1110 */                                                                                      if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                                          sQLiteDatabaseM6451F.close();
                                                                                                }
/* 1181 */                                                                                      i13 = i2 + 1;
/* 1183 */                                                                                      i12 = i3;
/* 1185 */                                                                                      str6 = str6;
/* 1187 */                                                                                      str5 = str5;
/* 1189 */                                                                                      str7 = str7;
                                                                                            }
                                                                                        } catch (SQLiteDatabaseLockedException unused16) {
/* 826 */                                                                                   str6 = str6;
                                                                                        } catch (SQLiteFullException e21) {
/* 829 */                                                                                   e = e21;
/* 832 */                                                                                   str6 = str6;
                                                                                        } catch (SQLiteException e22) {
/* 818 */                                                                                   e = e22;
/* 821 */                                                                                   str6 = str6;
                                                                                        }
                                                                                    } catch (SQLiteDatabaseLockedException unused17) {
/* 844 */                                                                               cursorQuery = cursorQuery;
/* 846 */                                                                               str6 = str6;
/* 848 */                                                                               str5 = str5;
                                                                                    } catch (SQLiteFullException e23) {
/* 852 */                                                                               e = e23;
/* 853 */                                                                               cursorQuery = cursorQuery;
/* 855 */                                                                               str6 = str6;
/* 857 */                                                                               str5 = str5;
                                                                                    } catch (SQLiteException e24) {
/* 835 */                                                                               e = e24;
/* 836 */                                                                               cursorQuery = cursorQuery;
/* 838 */                                                                               str6 = str6;
/* 840 */                                                                               str5 = str5;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused18) {
/* 940 */                                                                           cursorQuery = cursorQuery;
/* 942 */                                                                           str6 = str6;
/* 944 */                                                                           str5 = str5;
                                                                                } catch (SQLiteFullException e25) {
/* 952 */                                                                           e = e25;
/* 953 */                                                                           cursorQuery = cursorQuery;
/* 955 */                                                                           str6 = str6;
/* 957 */                                                                           str5 = str5;
                                                                                } catch (SQLiteException e26) {
/* 927 */                                                                           e = e26;
/* 928 */                                                                           cursorQuery = cursorQuery;
/* 930 */                                                                           str6 = str6;
/* 932 */                                                                           str5 = str5;
                                                                                }
                                                                            } catch (Throwable th11) {
/* 433 */                                                                       th = th11;
/* 434 */                                                                       cursorQuery = cursorQuery;
                                                                            }
                                                                        }
/* 861 */                                                               cursorQuery = cursorQuery;
/* 863 */                                                               str6 = str6;
/* 865 */                                                               str5 = str5;
/* 867 */                                                               i = 0;
/* 880 */                                                               sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
                                                                        try {
/* 890 */                                                                   if (sQLiteDatabaseM6451F.delete("messages", "rowid <= ?", new String[]{Long.toString(j4)}) < arrayList.size()) {
/* 892 */                                                                       uh3 uh3Var22 = ij3Var4.f9655f;
/* 894 */                                                                       ij3.m4555l(uh3Var22);
/* 901 */                                                                       uh3Var22.f17538f.m8510a("Fewer entries removed from local database than expected");
                                                                            }
/* 909 */                                                                   sQLiteDatabaseM6451F.setTransactionSuccessful();
/* 912 */                                                                   sQLiteDatabaseM6451F.endTransaction();
/* 915 */                                                                   cursorQuery.close();
/* 918 */                                                                   sQLiteDatabaseM6451F.close();
                                                                        } catch (SQLiteDatabaseLockedException unused19) {
/* 948 */                                                                   i3 = 5;
/* 1127 */                                                                  SystemClock.sleep(i14);
/* 1130 */                                                                  i14 += 20;
/* 1132 */                                                                  if (cursorQuery != null) {
/* 1134 */                                                                      cursorQuery.close();
                                                                            }
/* 1137 */                                                                  if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                      sQLiteDatabaseM6451F.close();
                                                                            }
/* 1181 */                                                                  i13 = i2 + 1;
/* 1183 */                                                                  i12 = i3;
/* 1185 */                                                                  str6 = str6;
/* 1187 */                                                                  str5 = str5;
/* 1189 */                                                                  str7 = str7;
                                                                        } catch (SQLiteFullException e27) {
/* 907 */                                                                   e = e27;
/* 961 */                                                                   i3 = 5;
/* 1160 */                                                                  uh3 uh3Var115 = ij3Var4.f9655f;
/* 1162 */                                                                  ij3.m4555l(uh3Var115);
/* 1167 */                                                                  uh3Var115.f17538f.m8511b(e, "Error reading entries from local database");
/* 1171 */                                                                  lh3VarM4566n.f13296d = true;
/* 1173 */                                                                  if (cursorQuery != null) {
/* 1175 */                                                                      cursorQuery.close();
                                                                            }
/* 1178 */                                                                  if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                      sQLiteDatabaseM6451F.close();
                                                                            }
/* 1181 */                                                                  i13 = i2 + 1;
/* 1183 */                                                                  i12 = i3;
/* 1185 */                                                                  str6 = str6;
/* 1187 */                                                                  str5 = str5;
/* 1189 */                                                                  str7 = str7;
                                                                        } catch (SQLiteException e28) {
/* 905 */                                                                   e = e28;
/* 936 */                                                                   i3 = 5;
/* 1081 */                                                                  if (sQLiteDatabaseM6451F != null) {
/* 1089 */                                                                      sQLiteDatabaseM6451F.endTransaction();
                                                                            }
/* 1092 */                                                                  uh3 uh3Var116 = ij3Var4.f9655f;
/* 1094 */                                                                  ij3.m4555l(uh3Var116);
/* 1099 */                                                                  uh3Var116.f17538f.m8511b(e, "Error reading entries from local database");
/* 1103 */                                                                  lh3VarM4566n.f13296d = true;
/* 1105 */                                                                  if (cursorQuery != null) {
/* 1107 */                                                                      cursorQuery.close();
                                                                            }
/* 1110 */                                                                  if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                      sQLiteDatabaseM6451F.close();
                                                                            }
/* 1181 */                                                                  i13 = i2 + 1;
/* 1183 */                                                                  i12 = i3;
/* 1185 */                                                                  str6 = str6;
/* 1187 */                                                                  str5 = str5;
/* 1189 */                                                                  str7 = str7;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused20) {
/* 997 */                                                               str5 = str5;
/* 999 */                                                               sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 1002 */                                                              str6 = str6;
/* 1004 */                                                              i3 = i4;
/* 1057 */                                                              cursorQuery = null;
/* 1127 */                                                              SystemClock.sleep(i14);
/* 1130 */                                                              i14 += 20;
/* 1132 */                                                              if (cursorQuery != null) {
/* 1134 */                                                                  cursorQuery.close();
                                                                        }
/* 1137 */                                                              if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                                  sQLiteDatabaseM6451F.close();
                                                                        }
/* 1181 */                                                              i13 = i2 + 1;
/* 1183 */                                                              i12 = i3;
/* 1185 */                                                              str6 = str6;
/* 1187 */                                                              str5 = str5;
/* 1189 */                                                              str7 = str7;
                                                                    }
                                                                } catch (SQLiteFullException e29) {
/* 986 */                                                           e = e29;
/* 987 */                                                           str5 = str5;
/* 989 */                                                           sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 992 */                                                           str6 = str6;
/* 994 */                                                           i3 = 5;
/* 1060 */                                                          cursorQuery = null;
/* 1160 */                                                          uh3 uh3Var117 = ij3Var4.f9655f;
/* 1162 */                                                          ij3.m4555l(uh3Var117);
/* 1167 */                                                          uh3Var117.f17538f.m8511b(e, "Error reading entries from local database");
/* 1171 */                                                          lh3VarM4566n.f13296d = true;
/* 1173 */                                                          if (cursorQuery != null) {
/* 1175 */                                                              cursorQuery.close();
                                                                    }
/* 1178 */                                                          if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                              sQLiteDatabaseM6451F.close();
                                                                    }
/* 1181 */                                                          i13 = i2 + 1;
/* 1183 */                                                          i12 = i3;
/* 1185 */                                                          str6 = str6;
/* 1187 */                                                          str5 = str5;
/* 1189 */                                                          str7 = str7;
                                                                } catch (SQLiteException e30) {
/* 965 */                                                           e = e30;
/* 966 */                                                           str5 = str5;
/* 968 */                                                           sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 971 */                                                           str6 = str6;
/* 973 */                                                           i3 = 5;
/* 1054 */                                                          cursorQuery = null;
/* 1081 */                                                          if (sQLiteDatabaseM6451F != null) {
/* 1089 */                                                              sQLiteDatabaseM6451F.endTransaction();
                                                                    }
/* 1092 */                                                          uh3 uh3Var118 = ij3Var4.f9655f;
/* 1094 */                                                          ij3.m4555l(uh3Var118);
/* 1099 */                                                          uh3Var118.f17538f.m8511b(e, "Error reading entries from local database");
/* 1103 */                                                          lh3VarM4566n.f13296d = true;
/* 1105 */                                                          if (cursorQuery != null) {
/* 1107 */                                                              cursorQuery.close();
                                                                    }
/* 1110 */                                                          if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                              sQLiteDatabaseM6451F.close();
                                                                    }
/* 1181 */                                                          i13 = i2 + 1;
/* 1183 */                                                          i12 = i3;
/* 1185 */                                                          str6 = str6;
/* 1187 */                                                          str5 = str5;
/* 1189 */                                                          str7 = str7;
                                                                }
                                                            } catch (SQLiteDatabaseLockedException unused21) {
/* 976 */                                                       str5 = str5;
/* 978 */                                                       sQLiteDatabaseM6451F = sQLiteDatabaseM6451F;
/* 981 */                                                       str6 = str6;
/* 983 */                                                       i3 = 5;
/* 1057 */                                                      cursorQuery = null;
/* 1127 */                                                      SystemClock.sleep(i14);
/* 1130 */                                                      i14 += 20;
/* 1132 */                                                      if (cursorQuery != null) {
/* 1134 */                                                          cursorQuery.close();
                                                                }
/* 1137 */                                                      if (sQLiteDatabaseM6451F != null) {
/* 1139 */                                                          sQLiteDatabaseM6451F.close();
                                                                }
/* 1181 */                                                      i13 = i2 + 1;
/* 1183 */                                                      i12 = i3;
/* 1185 */                                                      str6 = str6;
/* 1187 */                                                      str5 = str5;
/* 1189 */                                                      str7 = str7;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused22) {
/* 1011 */                                                  str7 = str7;
                                                        } catch (SQLiteFullException e31) {
/* 1014 */                                                  e = e31;
/* 1015 */                                                  str7 = str7;
                                                        } catch (SQLiteException e32) {
/* 1007 */                                                  e = e32;
/* 1008 */                                                  str7 = str7;
                                                        }
                                                    } catch (Throwable th12) {
/* 1018 */                                              th = th12;
/* 1019 */                                              i2 = i13;
                                                    }
                                                } catch (Throwable th13) {
/* 1023 */                                          th = th13;
/* 1024 */                                          i2 = i13;
/* 1033 */                                          i3 = 5;
/* 1037 */                                          cursorQuery2 = null;
                                                }
                                            }
                                        } catch (SQLiteDatabaseLockedException unused23) {
/* 1113 */                                  i2 = i13;
/* 1115 */                                  str7 = str7;
/* 1117 */                                  str6 = str6;
/* 1119 */                                  str5 = str5;
/* 1122 */                                  i3 = 5;
/* 1124 */                                  sQLiteDatabaseM6451F = null;
                                        } catch (SQLiteFullException e33) {
/* 1146 */                                  e = e33;
/* 1147 */                                  i2 = i13;
/* 1149 */                                  str7 = str7;
/* 1151 */                                  str6 = str6;
/* 1153 */                                  str5 = str5;
/* 1156 */                                  i3 = 5;
/* 1158 */                                  sQLiteDatabaseM6451F = null;
                                        } catch (SQLiteException e34) {
/* 1067 */                                  e = e34;
/* 1068 */                                  i2 = i13;
/* 1070 */                                  str7 = str7;
/* 1072 */                                  str6 = str6;
/* 1074 */                                  str5 = str5;
/* 1077 */                                  i3 = 5;
/* 1079 */                                  sQLiteDatabaseM6451F = null;
                                        } catch (Throwable th14) {
/* 1064 */                                  th = th14;
/* 1065 */                                  sQLiteDatabaseM6451F = null;
                                        }
                                    } else {
/* 1204 */                              i = 0;
/* 1205 */                              uh3 uh3Var23 = ij3Var4.f9655f;
/* 1207 */                              ij3.m4555l(uh3Var23);
/* 1214 */                              uh3Var23.f17541w.m8510a("Failed to read events from database in reasonable time");
/* 86 */                                arrayList = null;
                                    }
/* 1181 */                          i13 = i2 + 1;
/* 1183 */                          i12 = i3;
/* 1185 */                          str6 = str6;
/* 1187 */                          str5 = str5;
/* 1189 */                          str7 = str7;
                                }
                            } else {
/* 1219 */                      context = context3;
/* 1221 */                      uh3Var = uh3Var3;
/* 1223 */                      i = 0;
                            }
/* 1224 */                  if (arrayList != null) {
/* 1226 */                      arrayList2.addAll(arrayList);
/* 1229 */                      size = arrayList.size();
                            } else {
/* 1235 */                      size = i;
                            }
/* 1238 */                  if (abstractSafeParcelable != null && size < i10) {
/* 1251 */                      arrayList2.add(new kh3(abstractSafeParcelable, zzrVar2.f4244c, zzrVar2.f4234U));
                            }
/* 1256 */                  str2 = null;
/* 1257 */                  zM7406J = pd3Var.m7406J(null, vg3.f18092O0);
/* 1261 */                  size2 = arrayList2.size();
/* 1265 */                  i6 = i;
/* 1266 */                  while (i6 < size2) {
/* 1272 */                      kh3Var = (kh3) arrayList2.get(i6);
/* 1274 */                      abstractSafeParcelable2 = kh3Var.f12775a;
/* 1276 */                      ug3Var = vg3.f18123c1;
/* 1282 */                      if (pd3Var.m7406J(str2, ug3Var)) {
/* 1284 */                          str4 = kh3Var.f12776b;
/* 1290 */                          if (!TextUtils.isEmpty(str4)) {
/* 1418 */                              zzrVar2 = new zzr(zzrVar2.f4240a, zzrVar2.f4242b, str4, kh3Var.f12777c, zzrVar2.f4246d, zzrVar2.f4248e, zzrVar2.f4250f, zzrVar2.f4254i, zzrVar2.f4263v, zzrVar2.f4264w, zzrVar2.f4235V, zzrVar2.f4236W, zzrVar2.f4237X, zzrVar2.f4238Y, zzrVar2.f4239Z, zzrVar2.f4241a0, zzrVar2.f4243b0, zzrVar2.f4245c0, zzrVar2.f4247d0, zzrVar2.f4249e0, zzrVar2.f4251f0, zzrVar2.f4252g0, zzrVar2.f4253h0, zzrVar2.f4255i0, zzrVar2.f4256j0, zzrVar2.f4257k0, zzrVar2.f4258l0, zzrVar2.f4259m0, zzrVar2.f4260n0, zzrVar2.f4261o0, zzrVar2.f4262p0);
                                    }
                                }
/* 1428 */                      if (abstractSafeParcelable2 instanceof zzbg) {
/* 1430 */                          if (zM7406J) {
                                        try {
/* 1432 */                                  xt0Var2.getClass();
/* 1435 */                                  jCurrentTimeMillis = System.currentTimeMillis();
                                            try {
/* 1439 */                                      xt0Var2.getClass();
/* 1446 */                                      j3 = jCurrentTimeMillis;
/* 1442 */                                      jElapsedRealtime = SystemClock.elapsedRealtime();
                                            } catch (RemoteException e35) {
/* 1450 */                                      e = e35;
/* 1455 */                                      j3 = jCurrentTimeMillis;
/* 1457 */                                      jElapsedRealtime = 0;
/* 1459 */                                      ij3Var2 = ij3Var;
/* 1461 */                                      context2 = context;
/* 1463 */                                      uh3Var2 = uh3Var;
/* 1465 */                                      z = zM7406J;
/* 1600 */                                      ij3.m4555l(uh3Var2);
/* 1607 */                                      uh3Var2.f17538f.m8511b(e, "Failed to send event to the service");
/* 1610 */                                      if (z) {
/* 1618 */                                          if (ac1.f175f == null) {
/* 1625 */                                              ac1.f175f = new ac1(context2, ij3Var2);
                                                    }
/* 1627 */                                          ac1 ac1Var = ac1.f175f;
/* 1629 */                                          xt0Var2.getClass();
/* 1632 */                                          long jCurrentTimeMillis2 = System.currentTimeMillis();
/* 1636 */                                          xt0Var2.getClass();
/* 1649 */                                          ac1Var.m171P(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis2);
                                                }
/* 1560 */                                      str3 = null;
/* 1754 */                                      i6++;
/* 1756 */                                      ij3Var = ij3Var2;
/* 1758 */                                      context = context2;
/* 1760 */                                      size2 = size2;
/* 1762 */                                      size = size;
/* 1765 */                                      str2 = str3;
/* 1766 */                                      zM7406J = z;
/* 1768 */                                      uh3Var = uh3Var2;
                                            }
                                        } catch (RemoteException e36) {
/* 1469 */                                  e = e36;
/* 1474 */                                  jElapsedRealtime = 0;
/* 1476 */                                  j3 = 0;
                                        }
                                    } else {
/* 1479 */                              jElapsedRealtime = 0;
/* 1481 */                              j3 = 0;
                                    }
                                    try {
                                        try {
/* 1487 */                                  zzgaVar.mo2170F((zzbg) abstractSafeParcelable2, zzrVar2);
/* 1490 */                                  if (zM7406J) {
/* 1492 */                                      ij3.m4555l(uh3Var);
/* 1495 */                                      uh3Var2 = uh3Var;
                                                try {
/* 1501 */                                          uh3Var2.f17534Y.m8510a("Logging telemetry for logEvent from database");
/* 1506 */                                          if (ac1.f175f == null) {
                                                        try {
/* 1510 */                                                  ij3Var2 = ij3Var;
/* 1512 */                                                  context2 = context;
                                                            try {
/* 1517 */                                                      ac1.f175f = new ac1(context2, ij3Var2);
                                                            } catch (RemoteException e37) {
/* 1565 */                                                      e = e37;
/* 1566 */                                                      z = zM7406J;
/* 1568 */                                                      size2 = size2;
/* 1600 */                                                      ij3.m4555l(uh3Var2);
/* 1607 */                                                      uh3Var2.f17538f.m8511b(e, "Failed to send event to the service");
/* 1610 */                                                      if (z && j3 != 0) {
/* 1618 */                                                          if (ac1.f175f == null) {
/* 1625 */                                                              ac1.f175f = new ac1(context2, ij3Var2);
                                                                    }
/* 1627 */                                                          ac1 ac1Var2 = ac1.f175f;
/* 1629 */                                                          xt0Var2.getClass();
/* 1632 */                                                          long jCurrentTimeMillis3 = System.currentTimeMillis();
/* 1636 */                                                          xt0Var2.getClass();
/* 1649 */                                                          ac1Var2.m171P(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis3);
                                                                }
/* 1560 */                                                      str3 = null;
/* 1754 */                                                      i6++;
/* 1756 */                                                      ij3Var = ij3Var2;
/* 1758 */                                                      context = context2;
/* 1760 */                                                      size2 = size2;
/* 1762 */                                                      size = size;
/* 1765 */                                                      str2 = str3;
/* 1766 */                                                      zM7406J = z;
/* 1768 */                                                      uh3Var = uh3Var2;
                                                            }
                                                        } catch (RemoteException e38) {
/* 1520 */                                                  e = e38;
/* 1521 */                                                  ij3Var2 = ij3Var;
/* 1523 */                                                  context2 = context;
                                                        }
                                                    } else {
/* 1526 */                                              ij3Var2 = ij3Var;
/* 1528 */                                              context2 = context;
                                                    }
/* 1530 */                                          ac1 ac1Var3 = ac1.f175f;
/* 1532 */                                          xt0Var2.getClass();
/* 1535 */                                          long jCurrentTimeMillis4 = System.currentTimeMillis();
/* 1539 */                                          xt0Var2.getClass();
/* 1546 */                                          z = zM7406J;
/* 1548 */                                          size2 = size2;
                                                    try {
/* 1557 */                                              ac1Var3.m171P(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis4);
                                                    } catch (RemoteException e39) {
/* 1563 */                                              e = e39;
/* 1600 */                                              ij3.m4555l(uh3Var2);
/* 1607 */                                              uh3Var2.f17538f.m8511b(e, "Failed to send event to the service");
/* 1610 */                                              if (z) {
/* 1618 */                                                  if (ac1.f175f == null) {
/* 1625 */                                                      ac1.f175f = new ac1(context2, ij3Var2);
                                                            }
/* 1627 */                                                  ac1 ac1Var4 = ac1.f175f;
/* 1629 */                                                  xt0Var2.getClass();
/* 1632 */                                                  long jCurrentTimeMillis5 = System.currentTimeMillis();
/* 1636 */                                                  xt0Var2.getClass();
/* 1649 */                                                  ac1Var4.m171P(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis5);
                                                        }
                                                    }
                                                } catch (RemoteException e40) {
/* 1571 */                                          e = e40;
/* 1572 */                                          z = zM7406J;
/* 1574 */                                          size2 = size2;
/* 1576 */                                          ij3Var2 = ij3Var;
/* 1578 */                                          context2 = context;
                                                }
                                            } else {
/* 1585 */                                      size2 = size2;
/* 1587 */                                      ij3Var2 = ij3Var;
/* 1589 */                                      context2 = context;
/* 1591 */                                      uh3Var2 = uh3Var;
/* 1593 */                                      z = zM7406J;
                                            }
                                        } catch (RemoteException e41) {
/* 1581 */                                  e = e41;
/* 1459 */                                  ij3Var2 = ij3Var;
/* 1461 */                                  context2 = context;
/* 1463 */                                  uh3Var2 = uh3Var;
/* 1465 */                                  z = zM7406J;
/* 1600 */                                  ij3.m4555l(uh3Var2);
/* 1607 */                                  uh3Var2.f17538f.m8511b(e, "Failed to send event to the service");
/* 1610 */                                  if (z) {
/* 1618 */                                      if (ac1.f175f == null) {
/* 1625 */                                          ac1.f175f = new ac1(context2, ij3Var2);
                                                }
/* 1627 */                                      ac1 ac1Var5 = ac1.f175f;
/* 1629 */                                      xt0Var2.getClass();
/* 1632 */                                      long jCurrentTimeMillis6 = System.currentTimeMillis();
/* 1636 */                                      xt0Var2.getClass();
/* 1649 */                                      ac1Var5.m171P(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis6);
                                            }
/* 1560 */                                  str3 = null;
/* 1754 */                                  i6++;
/* 1756 */                                  ij3Var = ij3Var2;
/* 1758 */                                  context = context2;
/* 1760 */                                  size2 = size2;
/* 1762 */                                  size = size;
/* 1765 */                                  str2 = str3;
/* 1766 */                                  zM7406J = z;
/* 1768 */                                  uh3Var = uh3Var2;
                                        }
                                    } catch (RemoteException e42) {
/* 1596 */                              e = e42;
                                    }
                                } else {
/* 1655 */                          size2 = size2;
/* 1657 */                          ij3Var2 = ij3Var;
/* 1659 */                          context2 = context;
/* 1661 */                          uh3Var2 = uh3Var;
/* 1663 */                          z = zM7406J;
/* 1667 */                          if (abstractSafeParcelable2 instanceof zzpk) {
                                        try {
/* 1671 */                                  zzgaVar.mo2169D((zzpk) abstractSafeParcelable2, zzrVar2);
                                        } catch (RemoteException e43) {
/* 1676 */                                  ij3.m4555l(uh3Var2);
/* 1683 */                                  uh3Var2.f17538f.m8511b(e43, "Failed to send user property to the service");
                                        }
                                    } else {
/* 1689 */                              if (abstractSafeParcelable2 instanceof zzah) {
                                            try {
/* 1693 */                                      zzgaVar.mo2181f((zzah) abstractSafeParcelable2, zzrVar2);
                                            } catch (RemoteException e44) {
/* 1699 */                                      ij3.m4555l(uh3Var2);
/* 1706 */                                      uh3Var2.f17538f.m8511b(e44, "Failed to send conditional user property to the service");
                                            }
                                        } else {
/* 1711 */                                  str3 = null;
/* 1716 */                                  if (pd3Var.m7406J(null, ug3Var) || !(abstractSafeParcelable2 instanceof zzbe)) {
/* 1744 */                                      ij3.m4555l(uh3Var2);
/* 1751 */                                      uh3Var2.f17538f.m8510a("Discarding data. Unrecognized parcel type.");
                                            } else {
                                                try {
/* 1728 */                                          zzgaVar.mo2176Q(((zzbe) abstractSafeParcelable2).m2167G1(), zzrVar2);
                                                } catch (RemoteException e45) {
/* 1733 */                                          ij3.m4555l(uh3Var2);
/* 1740 */                                          uh3Var2.f17538f.m8511b(e45, "Failed to send default event parameters to the service");
                                                }
                                            }
                                        }
/* 1754 */                              i6++;
/* 1756 */                              ij3Var = ij3Var2;
/* 1758 */                              context = context2;
/* 1760 */                              size2 = size2;
/* 1762 */                              size = size;
/* 1765 */                              str2 = str3;
/* 1766 */                              zM7406J = z;
/* 1768 */                              uh3Var = uh3Var2;
                                    }
                                }
/* 1560 */                      str3 = null;
/* 1754 */                      i6++;
/* 1756 */                      ij3Var = ij3Var2;
/* 1758 */                      context = context2;
/* 1760 */                      size2 = size2;
/* 1762 */                      size = size;
/* 1765 */                      str2 = str3;
/* 1766 */                      zM7406J = z;
/* 1768 */                      uh3Var = uh3Var2;
                            }
/* 1784 */                  i8 = i11 + 1;
/* 1786 */                  uh3Var3 = uh3Var;
/* 1787 */                  ij3Var3 = ij3Var;
/* 1788 */                  context3 = context;
/* 1789 */                  xt0Var = xt0Var2;
/* 1791 */                  i7 = size;
                        }
/* 85 */                i = 0;
/* 86 */                arrayList = null;
/* 1224 */              if (arrayList != null) {
/* 1226 */                  arrayList2.addAll(arrayList);
/* 1229 */                  size = arrayList.size();
                        } else {
/* 1235 */                  size = i;
                        }
/* 1238 */              if (abstractSafeParcelable != null) {
/* 1251 */                  arrayList2.add(new kh3(abstractSafeParcelable, zzrVar2.f4244c, zzrVar2.f4234U));
                        }
/* 1256 */              str2 = null;
/* 1257 */              zM7406J = pd3Var.m7406J(null, vg3.f18092O0);
/* 1261 */              size2 = arrayList2.size();
/* 1265 */              i6 = i;
/* 1266 */              while (i6 < size2) {
/* 1272 */                  kh3Var = (kh3) arrayList2.get(i6);
/* 1274 */                  abstractSafeParcelable2 = kh3Var.f12775a;
/* 1276 */                  ug3Var = vg3.f18123c1;
/* 1282 */                  if (pd3Var.m7406J(str2, ug3Var)) {
/* 1284 */                      str4 = kh3Var.f12776b;
/* 1290 */                      if (!TextUtils.isEmpty(str4)) {
/* 1418 */                          zzrVar2 = new zzr(zzrVar2.f4240a, zzrVar2.f4242b, str4, kh3Var.f12777c, zzrVar2.f4246d, zzrVar2.f4248e, zzrVar2.f4250f, zzrVar2.f4254i, zzrVar2.f4263v, zzrVar2.f4264w, zzrVar2.f4235V, zzrVar2.f4236W, zzrVar2.f4237X, zzrVar2.f4238Y, zzrVar2.f4239Z, zzrVar2.f4241a0, zzrVar2.f4243b0, zzrVar2.f4245c0, zzrVar2.f4247d0, zzrVar2.f4249e0, zzrVar2.f4251f0, zzrVar2.f4252g0, zzrVar2.f4253h0, zzrVar2.f4255i0, zzrVar2.f4256j0, zzrVar2.f4257k0, zzrVar2.f4258l0, zzrVar2.f4259m0, zzrVar2.f4260n0, zzrVar2.f4261o0, zzrVar2.f4262p0);
                                }
                            }
/* 1428 */                  if (abstractSafeParcelable2 instanceof zzbg) {
/* 1430 */                      if (zM7406J) {
/* 1432 */                          xt0Var2.getClass();
/* 1435 */                          jCurrentTimeMillis = System.currentTimeMillis();
/* 1439 */                          xt0Var2.getClass();
/* 1446 */                          j3 = jCurrentTimeMillis;
/* 1442 */                          jElapsedRealtime = SystemClock.elapsedRealtime();
                                } else {
/* 1479 */                          jElapsedRealtime = 0;
/* 1481 */                          j3 = 0;
                                }
/* 1487 */                      zzgaVar.mo2170F((zzbg) abstractSafeParcelable2, zzrVar2);
/* 1490 */                      if (zM7406J) {
/* 1492 */                          ij3.m4555l(uh3Var);
/* 1495 */                          uh3Var2 = uh3Var;
/* 1501 */                          uh3Var2.f17534Y.m8510a("Logging telemetry for logEvent from database");
/* 1506 */                          if (ac1.f175f == null) {
/* 1510 */                              ij3Var2 = ij3Var;
/* 1512 */                              context2 = context;
/* 1517 */                              ac1.f175f = new ac1(context2, ij3Var2);
                                    } else {
/* 1526 */                              ij3Var2 = ij3Var;
/* 1528 */                              context2 = context;
                                    }
/* 1530 */                          ac1 ac1Var6 = ac1.f175f;
/* 1532 */                          xt0Var2.getClass();
/* 1535 */                          long jCurrentTimeMillis7 = System.currentTimeMillis();
/* 1539 */                          xt0Var2.getClass();
/* 1546 */                          z = zM7406J;
/* 1548 */                          size2 = size2;
/* 1557 */                          ac1Var6.m171P(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis7);
                                } else {
/* 1585 */                          size2 = size2;
/* 1587 */                          ij3Var2 = ij3Var;
/* 1589 */                          context2 = context;
/* 1591 */                          uh3Var2 = uh3Var;
/* 1593 */                          z = zM7406J;
                                }
                            } else {
/* 1655 */                      size2 = size2;
/* 1657 */                      ij3Var2 = ij3Var;
/* 1659 */                      context2 = context;
/* 1661 */                      uh3Var2 = uh3Var;
/* 1663 */                      z = zM7406J;
/* 1667 */                      if (abstractSafeParcelable2 instanceof zzpk) {
/* 1671 */                          zzgaVar.mo2169D((zzpk) abstractSafeParcelable2, zzrVar2);
                                } else {
/* 1689 */                          if (abstractSafeParcelable2 instanceof zzah) {
/* 1693 */                              zzgaVar.mo2181f((zzah) abstractSafeParcelable2, zzrVar2);
                                    } else {
/* 1711 */                              str3 = null;
/* 1716 */                              if (pd3Var.m7406J(null, ug3Var)) {
/* 1744 */                                  ij3.m4555l(uh3Var2);
/* 1751 */                                  uh3Var2.f17538f.m8510a("Discarding data. Unrecognized parcel type.");
                                        } else {
/* 1744 */                                  ij3.m4555l(uh3Var2);
/* 1751 */                                  uh3Var2.f17538f.m8510a("Discarding data. Unrecognized parcel type.");
                                        }
                                    }
/* 1754 */                          i6++;
/* 1756 */                          ij3Var = ij3Var2;
/* 1758 */                          context = context2;
/* 1760 */                          size2 = size2;
/* 1762 */                          size = size;
/* 1765 */                          str2 = str3;
/* 1766 */                          zM7406J = z;
/* 1768 */                          uh3Var = uh3Var2;
                                }
                            }
/* 1560 */                  str3 = null;
/* 1754 */                  i6++;
/* 1756 */                  ij3Var = ij3Var2;
/* 1758 */                  context = context2;
/* 1760 */                  size2 = size2;
/* 1762 */                  size = size;
/* 1765 */                  str2 = str3;
/* 1766 */                  zM7406J = z;
/* 1768 */                  uh3Var = uh3Var2;
                        }
/* 1784 */              i8 = i11 + 1;
/* 1786 */              uh3Var3 = uh3Var;
/* 1787 */              ij3Var3 = ij3Var;
/* 1788 */              context3 = context;
/* 1789 */              xt0Var = xt0Var2;
/* 1791 */              i7 = size;
                    }
                }

                /* JADX INFO: renamed from: S */
                public final void m7523S(zzah zzahVar) {
                    boolean zM6452G;
/* 1 */             mo1375y();
/* 4 */             m9576A();
/* 9 */             ij3 ij3Var = (ij3) this.f16749a;
/* 11 */            ij3Var.getClass();
/* 14 */            lh3 lh3VarM4566n = ij3Var.m4566n();
/* 20 */            ij3 ij3Var2 = (ij3) lh3VarM4566n.f16749a;
/* 24 */            ij3.m4553j(ij3Var2.f9668w);
/* 27 */            byte[] bArrM9069d0 = up3.m9069d0(zzahVar);
/* 34 */            if (bArrM9069d0.length > 131072) {
/* 36 */                uh3 uh3Var = ij3Var2.f9655f;
/* 38 */                ij3.m4555l(uh3Var);
/* 45 */                uh3Var.f17539i.m8510a("Conditional user property too long for local database. Sending directly to service");
/* 48 */                zM6452G = false;
                    } else {
/* 51 */                zM6452G = lh3VarM4566n.m6452G(bArrM9069d0, 2);
                    }
/* 70 */            m7518N(new rm3(this, m7520P(true), zM6452G, new zzah(zzahVar)));
                }
            }
