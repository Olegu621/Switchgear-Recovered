            package p000;

            import android.app.Application;
            import android.content.Context;
            import android.content.SharedPreferences;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.internal.measurement.zzdf;
            import com.google.android.gms.internal.measurement.zzql;
            import com.google.android.gms.measurement.internal.zzbe;
            import com.google.android.gms.measurement.internal.zzbg;
            import com.google.android.gms.measurement.internal.zzog;
            import com.google.android.gms.measurement.internal.zzpk;
            import com.google.android.gms.measurement.internal.zzr;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.android.core.internal.tombstone.C1212b;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.EnumMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Objects;
            import java.util.PriorityQueue;
            import java.util.concurrent.CopyOnWriteArraySet;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sl3 extends wg3 {

                /* JADX INFO: renamed from: U */
                public int f16676U;

                /* JADX INFO: renamed from: V */
                public wk3 f16677V;

                /* JADX INFO: renamed from: W */
                public wk3 f16678W;

                /* JADX INFO: renamed from: X */
                public PriorityQueue f16679X;

                /* JADX INFO: renamed from: Y */
                public boolean f16680Y;

                /* JADX INFO: renamed from: Z */
                public ok3 f16681Z;

                /* JADX INFO: renamed from: a0 */
                public final AtomicLong f16682a0;

                /* JADX INFO: renamed from: b0 */
                public long f16683b0;

                /* JADX INFO: renamed from: c */
                public dh0 f16684c;

                /* JADX INFO: renamed from: c0 */
                public final oi3 f16685c0;

                /* JADX INFO: renamed from: d */
                public qk3 f16686d;

                /* JADX INFO: renamed from: d0 */
                public boolean f16687d0;

                /* JADX INFO: renamed from: e */
                public final CopyOnWriteArraySet f16688e;

                /* JADX INFO: renamed from: e0 */
                public wk3 f16689e0;

                /* JADX INFO: renamed from: f */
                public boolean f16690f;

                /* JADX INFO: renamed from: f0 */
                public rl3 f16691f0;

                /* JADX INFO: renamed from: g0 */
                public wk3 f16692g0;

                /* JADX INFO: renamed from: h0 */
                public final ac3 f16693h0;

                /* JADX INFO: renamed from: i */
                public final AtomicReference f16694i;

                /* JADX INFO: renamed from: v */
                public final Object f16695v;

                /* JADX INFO: renamed from: w */
                public boolean f16696w;

                public sl3(ij3 ij3Var) {
/* 1 */             super(ij3Var);
/* 9 */             this.f16688e = new CopyOnWriteArraySet();
/* 16 */            this.f16695v = new Object();
/* 19 */            this.f16696w = false;
/* 22 */            this.f16676U = 1;
/* 24 */            this.f16687d0 = true;
/* 32 */            this.f16693h0 = new ac3(this, 7);
/* 39 */            this.f16694i = new AtomicReference();
/* 43 */            this.f16681Z = ok3.f14791c;
/* 47 */            this.f16683b0 = -1L;
/* 56 */            this.f16682a0 = new AtomicLong(0L);
/* 63 */            this.f16685c0 = new oi3(ij3Var);
                }

                @Override // p000.wg3
                /* JADX INFO: renamed from: C */
                public final boolean mo4531C() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: D */
                public final void m8553D(ok3 ok3Var) {
/* 1 */             mo1375y();
/* 40 */            boolean z = (ok3Var.m7189i(nk3.ANALYTICS_STORAGE) && ok3Var.m7189i(nk3.AD_STORAGE)) || ((ij3) this.f16749a).m4567o().m7513I();
/* 43 */            ij3 ij3Var = (ij3) this.f16749a;
/* 45 */            bj3 bj3Var = ij3Var.f9659i;
/* 47 */            ij3.m4555l(bj3Var);
/* 50 */            bj3Var.mo1375y();
/* 55 */            if (z != ij3Var.f9662k0) {
/* 57 */                bj3 bj3Var2 = ij3Var.f9659i;
/* 59 */                ij3.m4555l(bj3Var2);
/* 62 */                bj3Var2.mo1375y();
/* 65 */                ij3Var.f9662k0 = z;
/* 71 */                ki3 ki3Var = ((ij3) this.f16749a).f9653e;
/* 73 */                ij3.m4553j(ki3Var);
/* 76 */                ki3Var.mo1375y();
/* 104 */               Boolean boolValueOf = ki3Var.m6113D().contains("measurement_enabled_from_api") ? Boolean.valueOf(ki3Var.m6113D().getBoolean("measurement_enabled_from_api", true)) : null;
/* 105 */               if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
/* 119 */                   m8565P(Boolean.valueOf(z), false);
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
                
                    if (r14 > 500) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
                
                    if (r3 > 500) goto L31;
                 */
                /* JADX INFO: renamed from: E */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void m8554E(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
/* 9 */             Bundle bundle2 = bundle == null ? new Bundle() : bundle;
/* 17 */            if (!Objects.equals(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
/* 331 */               boolean z3 = !z2 || this.f16686d == null || up3.m9067X(str2);
/* 332 */               if (str == null) {
/* 334 */                   str = "app";
                        }
/* 336 */               String str3 = str;
/* 339 */               Bundle bundle3 = new Bundle(bundle2);
/* 354 */               for (String str4 : bundle3.keySet()) {
/* 362 */                   Object obj = bundle3.get(str4);
/* 368 */                   if (obj instanceof Bundle) {
/* 377 */                       bundle3.putBundle(str4, new Bundle((Bundle) obj));
                            } else if (obj instanceof Parcelable[]) {
/* 385 */                       Parcelable[] parcelableArr = (Parcelable[]) obj;
/* 389 */                       for (int i = 0; i < parcelableArr.length; i++) {
/* 391 */                           Parcelable parcelable = parcelableArr[i];
/* 395 */                           if (parcelable instanceof Bundle) {
/* 404 */                               parcelableArr[i] = new Bundle((Bundle) parcelable);
                                    }
                                }
                            } else if (obj instanceof List) {
/* 413 */                       List list = (List) obj;
/* 420 */                       for (int i2 = 0; i2 < list.size(); i2++) {
/* 422 */                           Object obj2 = list.get(i2);
/* 428 */                           if (obj2 instanceof Bundle) {
/* 437 */                               list.set(i2, new Bundle((Bundle) obj2));
                                    }
                                }
                            }
                        }
/* 447 */               bj3 bj3Var = ((ij3) this.f16749a).f9659i;
/* 449 */               ij3.m4555l(bj3Var);
/* 465 */               bj3Var.m1370I(new el3(this, str3, str2, j, bundle3, z2, z3, z));
/* 468 */               return;
                    }
/* 23 */            lm3 lm3Var = ((ij3) this.f16749a).f9641W;
/* 25 */            ij3.m4554k(lm3Var);
                    synchronized (lm3Var.f13413W) {
                        try {
/* 33 */                    if (!lm3Var.f13412V) {
/* 39 */                        uh3 uh3Var = ((ij3) lm3Var.f16749a).f9655f;
/* 41 */                        ij3.m4555l(uh3Var);
/* 48 */                        uh3Var.f17531V.m8510a("Cannot log screen view event when the app is in the background.");
/* 52 */                        return;
                            }
/* 59 */                    String string = bundle2.getString(FirebaseAnalytics.Param.SCREEN_NAME);
/* 65 */                    if (string != null) {
/* 71 */                        if (string.length() > 0) {
/* 73 */                            int length = string.length();
/* 83 */                            ((ij3) lm3Var.f16749a).f9651d.getClass();
                                }
/* 92 */                        uh3 uh3Var2 = ((ij3) lm3Var.f16749a).f9655f;
/* 94 */                        ij3.m4555l(uh3Var2);
/* 109 */                       uh3Var2.f17531V.m8511b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
/* 113 */                       return;
                            }
/* 116 */                   String string2 = bundle2.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
/* 120 */                   if (string2 != null) {
/* 126 */                       if (string2.length() > 0) {
/* 128 */                           int length2 = string2.length();
/* 138 */                           ((ij3) lm3Var.f16749a).f9651d.getClass();
                                }
/* 147 */                       uh3 uh3Var3 = ((ij3) lm3Var.f16749a).f9655f;
/* 149 */                       ij3.m4555l(uh3Var3);
/* 164 */                       uh3Var3.f17531V.m8511b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
/* 168 */                       return;
                            }
/* 169 */                   if (string2 == null) {
/* 171 */                       zzdf zzdfVar = lm3Var.f13418i;
/* 183 */                       string2 = zzdfVar != null ? lm3Var.m6504G(zzdfVar.zzb) : "Activity";
                            }
/* 181 */                   String str5 = string2;
/* 186 */                   bm3 bm3Var = lm3Var.f13414c;
/* 190 */                   if (lm3Var.f13419v && bm3Var != null) {
/* 194 */                       lm3Var.f13419v = false;
/* 198 */                       boolean zEquals = Objects.equals(bm3Var.f2539b, str5);
/* 204 */                       boolean zEquals2 = Objects.equals(bm3Var.f2538a, string);
/* 208 */                       if (zEquals && zEquals2) {
/* 216 */                           uh3 uh3Var4 = ((ij3) lm3Var.f16749a).f9655f;
/* 218 */                           ij3.m4555l(uh3Var4);
/* 225 */                           uh3Var4.f17531V.m8510a("Ignoring call to log screen view event with duplicate parameters.");
/* 229 */                           return;
                                }
                            }
/* 233 */                   ij3 ij3Var = (ij3) lm3Var.f16749a;
/* 235 */                   uh3 uh3Var5 = ij3Var.f9655f;
/* 237 */                   ij3.m4555l(uh3Var5);
/* 250 */                   uh3Var5.f17534Y.m8512c(string == null ? "null" : string, "Logging screen view with name, class", str5);
/* 260 */                   bm3 bm3Var2 = lm3Var.f13414c == null ? lm3Var.f13415d : lm3Var.f13414c;
/* 264 */                   up3 up3Var = ij3Var.f9668w;
/* 266 */                   ij3.m4553j(up3Var);
/* 276 */                   bm3 bm3Var3 = new bm3(string, str5, up3Var.m9115v0(), true, j);
/* 279 */                   lm3Var.f13414c = bm3Var3;
/* 281 */                   lm3Var.f13415d = bm3Var2;
/* 283 */                   lm3Var.f13420w = bm3Var3;
/* 287 */                   ij3Var.f9640V.getClass();
/* 290 */                   long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 294 */                   bj3 bj3Var2 = ij3Var.f9659i;
/* 296 */                   ij3.m4555l(bj3Var2);
/* 310 */                   bj3Var2.m1370I(new kq2(lm3Var, bundle2, bm3Var3, bm3Var2, jElapsedRealtime));
                        } catch (Throwable th) {
/* 315 */                   throw th;
                        }
                    }
                }

                /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                    	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                    	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                    	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                    	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                    	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                    */
                /* JADX INFO: renamed from: F */
                public final void m8555F() {
                    /*
                        Method dump skipped, instruction units count: 1453
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.sl3.m8555F():void");
                }

                /* JADX INFO: renamed from: G */
                public final void m8556G(String str, String str2, Bundle bundle) {
/* 1 */             mo1375y();
/* 10 */            ((ij3) this.f16749a).f9640V.getClass();
/* 21 */            m8557H(str, str2, bundle, System.currentTimeMillis());
                }

                /* JADX INFO: renamed from: H */
                public final void m8557H(String str, String str2, Bundle bundle, long j) {
/* 1 */             mo1375y();
/* 6 */             boolean z = true;
/* 7 */             if (this.f16686d != null && !up3.m9067X(str2)) {
/* 17 */                z = false;
                    }
/* 26 */            m8558I(str, str2, j, bundle, true, z, true);
                }

                /* JADX WARN: Code duplicated, block: B:118:0x02c4  */
                /* JADX WARN: Code duplicated, block: B:120:0x02cc  */
                /* JADX WARN: Code duplicated, block: B:122:0x02dd  */
                /* JADX WARN: Code duplicated, block: B:125:0x02f3  */
                /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
                /* JADX WARN: Code duplicated, block: B:133:0x0362  */
                /* JADX WARN: Code duplicated, block: B:136:0x0376  */
                /* JADX WARN: Code duplicated, block: B:137:0x038b  */
                /* JADX WARN: Code duplicated, block: B:140:0x03a1  */
                /* JADX WARN: Code duplicated, block: B:142:0x03a9  */
                /* JADX WARN: Code duplicated, block: B:144:0x03b4  */
                /* JADX WARN: Code duplicated, block: B:145:0x03bd  */
                /* JADX WARN: Code duplicated, block: B:147:0x03c1  */
                /* JADX WARN: Code duplicated, block: B:148:0x03cd  */
                /* JADX WARN: Code duplicated, block: B:150:0x03d1  */
                /* JADX WARN: Code duplicated, block: B:151:0x03e0  */
                /* JADX WARN: Code duplicated, block: B:153:0x03e3  */
                /* JADX WARN: Code duplicated, block: B:158:0x03f1  */
                /* JADX WARN: Code duplicated, block: B:160:0x03f9  */
                /* JADX WARN: Code duplicated, block: B:162:0x03fe  */
                /* JADX WARN: Code duplicated, block: B:165:0x0406  */
                /* JADX WARN: Code duplicated, block: B:168:0x0448  */
                /* JADX WARN: Code duplicated, block: B:170:0x045c  */
                /* JADX WARN: Code duplicated, block: B:173:0x047c  */
                /* JADX WARN: Code duplicated, block: B:176:0x0488 A[LOOP:2: B:174:0x0482->B:176:0x0488, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:192:0x03e6 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:193:0x03e6 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:195:0x049d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:199:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:84:0x01cf  */
                /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
                /* JADX WARN: Code duplicated, block: B:88:0x01f3  */
                /* JADX WARN: Code duplicated, block: B:89:0x01f8  */
                /* JADX WARN: Code duplicated, block: B:92:0x020f  */
                /* JADX WARN: Code duplicated, block: B:99:0x0266  */
                /* JADX INFO: renamed from: I */
                public final void m8558I(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
                    ki3 ki3Var;
                    ki3 ki3Var2;
                    ac3 ac3Var;
                    boolean z4;
                    ij3 ij3Var;
                    int iM9079D0;
                    Bundle bundleM9085H;
                    String str3;
                    long j2;
                    String strM8805m;
                    ArrayList arrayList;
                    boolean zM4238a;
                    sl3 sl3Var;
                    long j3;
                    int i;
                    long j4;
                    ArrayList arrayList2;
                    int size;
                    int i2;
                    int i3;
                    Bundle bundleM9099a0;
                    String str4;
                    Bundle bundle2;
                    lh3 lh3VarM4566n;
                    byte[] bArrMarshall;
                    boolean zM6452G;
                    Iterator it;
                    String str5;
                    Object obj;
                    Bundle[] bundleArr;
                    int length;
/* 3 */             String str6 = str;
/* 11 */            kb1.m6058k(str6);
/* 14 */            kb1.m6061n(bundle);
/* 17 */            mo1375y();
/* 20 */            m9576A();
/* 26 */            ij3 ij3Var2 = (ij3) this.f16749a;
/* 28 */            boolean zM4560d = ij3Var2.m4560d();
/* 32 */            lo3 lo3Var = ij3Var2.f9667v;
/* 34 */            pd3 pd3Var = ij3Var2.f9651d;
/* 36 */            Context context = ij3Var2.f9645a;
/* 38 */            up3 up3Var = ij3Var2.f9668w;
/* 40 */            uh3 uh3Var = ij3Var2.f9655f;
/* 42 */            if (!zM4560d) {
/* 1233 */              ij3.m4555l(uh3Var);
/* 1240 */              uh3Var.f17533X.m8510a("Event not sent since app measurement is disabled");
/* 1243 */              return;
                    }
/* 48 */            List list = ij3Var2.m4569q().f9590V;
/* 50 */            if (list != null && !list.contains(str2)) {
/* 59 */                ij3.m4555l(uh3Var);
/* 66 */                uh3Var.f17533X.m8512c(str2, "Dropping non-safelisted event. event name, origin", str6);
/* 69 */                return;
                    }
/* 74 */            if (!this.f16690f) {
/* 76 */                this.f16690f = true;
                        try {
                            try {
/* 113 */                       (!ij3Var2.f9647b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                            } catch (Exception e) {
/* 118 */                       ij3.m4555l(uh3Var);
/* 125 */                       uh3Var.f17541w.m8511b(e, "Failed to invoke Tag Manager's initialize() method");
                            }
                        } catch (ClassNotFoundException unused) {
/* 129 */                   ij3.m4555l(uh3Var);
/* 136 */                   uh3Var.f17532W.m8510a("Tag Manager is not found and thus will not be used");
                        }
                    }
/* 139 */           mh3 mh3Var = ij3Var2.f9639U;
/* 141 */           ki3 ki3Var3 = ij3Var2.f9653e;
/* 143 */           xt0 xt0Var = ij3Var2.f9640V;
/* 151 */           if (!pd3Var.m7406J(null, vg3.f18135g1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
/* 169 */               String string = bundle.getString("gclid");
/* 173 */               xt0Var.getClass();
/* 193 */               ki3Var = ki3Var3;
/* 199 */               m8560K(System.currentTimeMillis(), string, "auto", "_lgclid");
                    } else {
/* 203 */               ki3Var = ki3Var3;
                    }
/* 211 */           if (!z || up3.f17623U[0].equals(str2)) {
/* 241 */               ki3Var2 = ki3Var;
                    } else {
/* 223 */               ij3.m4553j(up3Var);
/* 226 */               ij3.m4553j(ki3Var);
/* 229 */               ki3Var2 = ki3Var;
/* 237 */               up3Var.m9090K(bundle, ki3Var2.f12815j0.m8119x());
                    }
/* 243 */           ac3 ac3Var2 = this.f16693h0;
/* 247 */           if (!z3 && !"_iap".equals(str2)) {
/* 257 */               ij3.m4553j(up3Var);
/* 266 */               int i4 = 2;
/* 268 */               if (up3Var.m9118z0(NotificationCompat.CATEGORY_EVENT, str2)) {
/* 279 */                   if (up3Var.m9076B0(NotificationCompat.CATEGORY_EVENT, i13.f9403f, i13.f9404g, str2)) {
/* 288 */                       ((ij3) up3Var.f16749a).getClass();
/* 295 */                       if (up3Var.m9077C0(40, NotificationCompat.CATEGORY_EVENT, str2)) {
/* 298 */                           i4 = 0;
                                }
                            } else {
/* 281 */                       i4 = 13;
                            }
                        }
/* 300 */               if (i4 != 0) {
/* 302 */                   ij3.m4555l(uh3Var);
/* 313 */                   uh3Var.f17540v.m8511b(mh3Var.m6656a(str2), "Invalid public event name. Event will not be logged (FE)");
/* 316 */                   ij3.m4553j(up3Var);
/* 347 */                   up3.m9062P(ac3Var2, null, i4, "_ev", up3.m9060E(40, str2, true), str2 != null ? str2.length() : 0);
/* 350 */                   return;
                        }
                    }
/* 352 */           lm3 lm3Var = ij3Var2.f9641W;
/* 354 */           ij3.m4554k(lm3Var);
/* 358 */           bm3 bm3VarM6503F = lm3Var.m6503F(false);
/* 364 */           if (bm3VarM6503F != null && !bundle.containsKey("_sc")) {
/* 373 */               bm3VarM6503F.f2541d = true;
                    }
/* 382 */           up3.m9072q0(bm3VarM6503F, bundle, z && !z3);
/* 387 */           boolean zEquals = "am".equals(str6);
/* 391 */           boolean zM9067X = up3.m9067X(str2);
/* 395 */           if (z) {
/* 397 */               ac3Var = ac3Var2;
/* 401 */               if (this.f16686d != null && !zM9067X) {
/* 405 */                   if (!zEquals) {
/* 412 */                       ij3.m4555l(uh3Var);
/* 427 */                       uh3Var.f17533X.m8512c(mh3Var.m6656a(str2), "Passing event to registered event handler (FE)", mh3Var.m6660e(bundle));
/* 432 */                       kb1.m6061n(this.f16686d);
/* 444 */                       ((we2) this.f16686d).m9561l(str6, str2, bundle, j);
/* 447 */                       return;
                            }
/* 409 */                   z4 = true;
                        }
/* 460 */               if (ij3Var2.m4564h()) {
/* 464 */                   ij3.m4553j(up3Var);
/* 469 */                   ij3Var = (ij3) up3Var.f16749a;
/* 471 */                   iM9079D0 = up3Var.m9079D0(str2);
/* 475 */                   if (iM9079D0 != 0) {
/* 477 */                       ij3.m4555l(uh3Var);
/* 488 */                       uh3Var.f17540v.m8511b(mh3Var.m6656a(str2), "Invalid event name. Event will not be logged (FE)");
/* 494 */                       String strM9060E = up3.m9060E(40, str2, true);
/* 498 */                       if (str2 != null) {
/* 500 */                           length = str2.length();
                                } else {
/* 505 */                           length = 0;
                                }
/* 506 */                       ij3.m4553j(up3Var);
/* 524 */                       up3.m9062P(ac3Var, null, iM9079D0, "_ev", strM9060E, length);
/* 527 */                       return;
                            }
/* 548 */                   bundleM9085H = up3Var.m9085H(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z3);
/* 552 */                   kb1.m6061n(bundleM9085H);
/* 555 */                   ij3.m4554k(lm3Var);
/* 567 */                   if (lm3Var.m6503F(false) == null && "_ae".equals(str2)) {
/* 575 */                       ij3.m4554k(lo3Var);
/* 578 */                       C1212b c1212b = lo3Var.f13438f;
/* 590 */                       ((ij3) ((lo3) c1212b.f10130d).f16749a).f9640V.getClass();
/* 593 */                       j2 = 0;
/* 595 */                       long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 534 */                       str3 = "_o";
/* 603 */                       long j5 = jElapsedRealtime - c1212b.f10128b;
/* 605 */                       c1212b.f10128b = jElapsedRealtime;
/* 609 */                       if (j5 > 0) {
/* 611 */                           up3Var.m9104g0(bundleM9085H, j5);
                                }
                            } else {
/* 534 */                       str3 = "_o";
/* 617 */                       j2 = 0;
                            }
/* 627 */                   if ("auto".equals(str6) && "_ssr".equals(str2)) {
/* 637 */                       String string2 = bundleM9085H.getString("_ffr");
/* 641 */                       int i5 = xh2.f19096a;
/* 643 */                       if (string2 == null || string2.trim().isEmpty()) {
/* 667 */                           string2 = null;
                                } else if (string2 != null) {
/* 658 */                           string2 = string2.trim();
                                }
/* 668 */                       ki3 ki3Var4 = r34.f9653e;
/* 670 */                       ij3.m4553j(ki3Var4);
/* 683 */                       if (Objects.equals(string2, ki3Var4.f12811g0.m8805m())) {
/* 696 */                           uh3 uh3Var2 = r34.f9655f;
/* 698 */                           ij3.m4555l(uh3Var2);
/* 705 */                           uh3Var2.f17533X.m8510a("Not logging duplicate session_start_with_rollout event");
/* 708 */                           return;
                                } else {
/* 685 */                           ki3 ki3Var5 = ij3Var.f9653e;
/* 687 */                           ij3.m4553j(ki3Var5);
/* 692 */                           ki3Var5.f12811g0.m8806n(string2);
                                }
                            } else if ("_ae".equals(str2)) {
/* 717 */                       ki3 ki3Var6 = ij3Var.f9653e;
/* 719 */                       ij3.m4553j(ki3Var6);
/* 724 */                       strM8805m = ki3Var6.f12811g0.m8805m();
/* 732 */                       if (!TextUtils.isEmpty(strM8805m)) {
/* 734 */                           bundleM9085H.putString("_ffr", strM8805m);
                                }
                            }
/* 739 */                   arrayList = new ArrayList();
/* 742 */                   arrayList.add(bundleM9085H);
/* 754 */                   if (pd3Var.m7406J(null, vg3.f18104U0)) {
/* 756 */                       ij3.m4554k(lo3Var);
/* 759 */                       lo3Var.mo1375y();
/* 762 */                       zM4238a = lo3Var.f13436d;
                            } else {
/* 765 */                       ij3.m4553j(ki3Var2);
/* 770 */                       zM4238a = ki3Var2.f12806d0.m4238a();
                            }
/* 774 */                   ij3.m4553j(ki3Var2);
/* 785 */                   if (ki3Var2.f12801a0.m4932a() <= j2 && ki3Var2.m6119J(j) && zM4238a) {
/* 795 */                       ij3.m4555l(uh3Var);
/* 802 */                       uh3Var.f17534Y.m8510a("Current session is expired, remove the session number, ID, and engagement time");
/* 805 */                       xt0Var.getClass();
/* 819 */                       i = 0;
/* 827 */                       j3 = j2;
/* 829 */                       m8560K(System.currentTimeMillis(), null, "auto", "_sid");
/* 832 */                       xt0Var.getClass();
/* 843 */                       m8560K(System.currentTimeMillis(), null, "auto", "_sno");
/* 846 */                       xt0Var.getClass();
/* 857 */                       m8560K(System.currentTimeMillis(), null, "auto", "_se");
/* 860 */                       sl3Var = this;
/* 863 */                       ki3Var2.f12802b0.m4933b(j3);
                            } else {
/* 867 */                       sl3Var = this;
/* 871 */                       j3 = j2;
/* 873 */                       i = 0;
                            }
/* 885 */                   if (bundleM9085H.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j3) == 1) {
/* 887 */                       ij3.m4555l(uh3Var);
/* 894 */                       uh3Var.f17534Y.m8510a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
/* 897 */                       ij3.m4554k(lo3Var);
/* 902 */                       j4 = j;
/* 904 */                       lo3Var.f13437e.m7456c(j4);
                            } else {
/* 908 */                       j4 = j;
                            }
/* 916 */                   arrayList2 = new ArrayList(bundleM9085H.keySet());
/* 919 */                   Collections.sort(arrayList2);
/* 922 */                   size = arrayList2.size();
/* 928 */                   for (i2 = i; i2 < size; i2++) {
/* 934 */                       str5 = (String) arrayList2.get(i2);
/* 936 */                       if (str5 != null) {
/* 938 */                           ij3.m4553j(up3Var);
/* 941 */                           obj = bundleM9085H.get(str5);
/* 947 */                           if (obj instanceof Bundle) {
/* 950 */                               Bundle[] bundleArr2 = new Bundle[1];
/* 954 */                               bundleArr2[i] = (Bundle) obj;
/* 956 */                               bundleArr = bundleArr2;
                                    } else if (obj instanceof Parcelable[]) {
/* 962 */                               Parcelable[] parcelableArr = (Parcelable[]) obj;
/* 971 */                               bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                                    } else if (obj instanceof ArrayList) {
/* 978 */                               ArrayList arrayList3 = (ArrayList) obj;
/* 990 */                               bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                                    } else {
/* 993 */                               bundleArr = null;
                                    }
/* 994 */                           if (bundleArr != null) {
/* 996 */                               bundleM9085H.putParcelableArray(str5, bundleArr);
                                    }
                                }
                            }
/* 1002 */                  i3 = i;
/* 1008 */                  while (i3 < arrayList.size()) {
/* 1014 */                      bundleM9099a0 = (Bundle) arrayList.get(i3);
/* 1016 */                      if (i3 != 0) {
/* 1018 */                          str4 = "_ep";
                                } else {
/* 1023 */                          str4 = str2;
                                }
/* 1020 */                      String str7 = str3;
/* 1026 */                      bundleM9099a0.putString(str7, str6);
/* 1029 */                      if (z2) {
/* 1031 */                          bundleM9099a0 = up3Var.m9099a0(bundleM9099a0);
                                }
/* 1035 */                      bundle2 = bundleM9099a0;
/* 1046 */                      zzbg zzbgVar = new zzbg(str4, new zzbe(bundle2), str6, j4);
/* 1049 */                      pn3 pn3VarM4567o = ij3Var2.m4567o();
/* 1053 */                      pn3VarM4567o.getClass();
/* 1056 */                      pn3VarM4567o.mo1375y();
/* 1059 */                      pn3VarM4567o.m9576A();
/* 1062 */                      pn3VarM4567o.m7516L();
/* 1069 */                      lh3VarM4566n = ((ij3) pn3VarM4567o.f16749a).m4566n();
/* 1073 */                      lh3VarM4566n.getClass();
/* 1076 */                      Parcel parcelObtain = Parcel.obtain();
/* 1082 */                      re3.m8151a(zzbgVar, parcelObtain, i);
/* 1085 */                      bArrMarshall = parcelObtain.marshall();
/* 1089 */                      parcelObtain.recycle();
/* 1095 */                      if (bArrMarshall.length > 131072) {
/* 1101 */                          uh3 uh3Var3 = ((ij3) lh3VarM4566n.f16749a).f9655f;
/* 1103 */                          ij3.m4555l(uh3Var3);
/* 1110 */                          uh3Var3.f17539i.m8510a("Event is too long for local database. Sending event directly to service");
/* 1113 */                          zM6452G = false;
                                } else {
/* 1118 */                          zM6452G = lh3VarM4566n.m6452G(bArrMarshall, 0);
                                }
/* 1144 */                      pn3VarM4567o.m7518N(new rm3(pn3VarM4567o, pn3VarM4567o.m7520P(true), zM6452G, zzbgVar, 1));
/* 1147 */                      if (!z4) {
/* 1151 */                          it = sl3Var.f16688e.iterator();
/* 1159 */                          while (it.hasNext()) {
/* 1178 */                              ((rk3) it.next()).onEvent(str, str2, new Bundle(bundle2), j);
                                    }
                                }
/* 1184 */                      i3++;
/* 1186 */                      str6 = str;
/* 1188 */                      j4 = j;
/* 1190 */                      str3 = str7;
/* 1192 */                      i = 0;
                            }
/* 1198 */                  ij3.m4554k(lm3Var);
/* 1206 */                  if (lm3Var.m6503F(false) == null && "_ae".equals(str2)) {
/* 1216 */                      ij3.m4554k(lo3Var);
/* 1219 */                      xt0Var.getClass();
/* 1229 */                      lo3Var.f13438f.m4822b(SystemClock.elapsedRealtime(), true, true);
/* 1232 */                      return;
                            }
                        }
/* 1232 */              return;
                    }
/* 451 */           ac3Var = ac3Var2;
/* 454 */           z4 = zEquals;
/* 460 */           if (ij3Var2.m4564h()) {
/* 1232 */              return;
                    }
/* 464 */           ij3.m4553j(up3Var);
/* 469 */           ij3Var = (ij3) up3Var.f16749a;
/* 471 */           iM9079D0 = up3Var.m9079D0(str2);
/* 475 */           if (iM9079D0 != 0) {
/* 477 */               ij3.m4555l(uh3Var);
/* 488 */               uh3Var.f17540v.m8511b(mh3Var.m6656a(str2), "Invalid event name. Event will not be logged (FE)");
/* 494 */               String strM9060E2 = up3.m9060E(40, str2, true);
/* 498 */               if (str2 != null) {
/* 500 */                   length = str2.length();
                        } else {
/* 505 */                   length = 0;
                        }
/* 506 */               ij3.m4553j(up3Var);
/* 524 */               up3.m9062P(ac3Var, null, iM9079D0, "_ev", strM9060E2, length);
/* 527 */               return;
                    }
/* 548 */           bundleM9085H = up3Var.m9085H(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z3);
/* 552 */           kb1.m6061n(bundleM9085H);
/* 555 */           ij3.m4554k(lm3Var);
/* 567 */           if (lm3Var.m6503F(false) == null) {
/* 534 */               str3 = "_o";
/* 617 */               j2 = 0;
                    } else {
/* 534 */               str3 = "_o";
/* 617 */               j2 = 0;
                    }
/* 627 */           if ("auto".equals(str6)) {
/* 715 */               if ("_ae".equals(str2)) {
/* 717 */                   ki3 ki3Var7 = ij3Var.f9653e;
/* 719 */                   ij3.m4553j(ki3Var7);
/* 724 */                   strM8805m = ki3Var7.f12811g0.m8805m();
/* 732 */                   if (!TextUtils.isEmpty(strM8805m)) {
/* 734 */                       bundleM9085H.putString("_ffr", strM8805m);
                            }
                        }
                    } else if ("_ae".equals(str2)) {
/* 717 */               ki3 ki3Var8 = ij3Var.f9653e;
/* 719 */               ij3.m4553j(ki3Var8);
/* 724 */               strM8805m = ki3Var8.f12811g0.m8805m();
/* 732 */               if (!TextUtils.isEmpty(strM8805m)) {
/* 734 */                   bundleM9085H.putString("_ffr", strM8805m);
                        }
                    }
/* 739 */           arrayList = new ArrayList();
/* 742 */           arrayList.add(bundleM9085H);
/* 754 */           if (pd3Var.m7406J(null, vg3.f18104U0)) {
/* 756 */               ij3.m4554k(lo3Var);
/* 759 */               lo3Var.mo1375y();
/* 762 */               zM4238a = lo3Var.f13436d;
                    } else {
/* 765 */               ij3.m4553j(ki3Var2);
/* 770 */               zM4238a = ki3Var2.f12806d0.m4238a();
                    }
/* 774 */           ij3.m4553j(ki3Var2);
/* 785 */           if (ki3Var2.f12801a0.m4932a() <= j2) {
/* 867 */               sl3Var = this;
/* 871 */               j3 = j2;
/* 873 */               i = 0;
                    } else {
/* 867 */               sl3Var = this;
/* 871 */               j3 = j2;
/* 873 */               i = 0;
                    }
/* 885 */           if (bundleM9085H.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j3) == 1) {
/* 887 */               ij3.m4555l(uh3Var);
/* 894 */               uh3Var.f17534Y.m8510a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
/* 897 */               ij3.m4554k(lo3Var);
/* 902 */               j4 = j;
/* 904 */               lo3Var.f13437e.m7456c(j4);
                    } else {
/* 908 */               j4 = j;
                    }
/* 916 */           arrayList2 = new ArrayList(bundleM9085H.keySet());
/* 919 */           Collections.sort(arrayList2);
/* 922 */           size = arrayList2.size();
/* 928 */           while (i2 < size) {
/* 934 */               str5 = (String) arrayList2.get(i2);
/* 936 */               if (str5 != null) {
/* 938 */                   ij3.m4553j(up3Var);
/* 941 */                   obj = bundleM9085H.get(str5);
/* 947 */                   if (obj instanceof Bundle) {
/* 950 */                       Bundle[] bundleArr3 = new Bundle[1];
/* 954 */                       bundleArr3[i] = (Bundle) obj;
/* 956 */                       bundleArr = bundleArr3;
                            } else if (obj instanceof Parcelable[]) {
/* 962 */                       Parcelable[] parcelableArr2 = (Parcelable[]) obj;
/* 971 */                       bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr2, parcelableArr2.length, Bundle[].class);
                            } else if (obj instanceof ArrayList) {
/* 978 */                       ArrayList arrayList4 = (ArrayList) obj;
/* 990 */                       bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                            } else {
/* 993 */                       bundleArr = null;
                            }
/* 994 */                   if (bundleArr != null) {
/* 996 */                       bundleM9085H.putParcelableArray(str5, bundleArr);
                            }
                        }
                    }
/* 1002 */          i3 = i;
/* 1008 */          while (i3 < arrayList.size()) {
/* 1014 */              bundleM9099a0 = (Bundle) arrayList.get(i3);
/* 1016 */              if (i3 != 0) {
/* 1018 */                  str4 = "_ep";
                        } else {
/* 1023 */                  str4 = str2;
                        }
/* 1020 */              String str8 = str3;
/* 1026 */              bundleM9099a0.putString(str8, str6);
/* 1029 */              if (z2) {
/* 1031 */                  bundleM9099a0 = up3Var.m9099a0(bundleM9099a0);
                        }
/* 1035 */              bundle2 = bundleM9099a0;
/* 1046 */              zzbg zzbgVar2 = new zzbg(str4, new zzbe(bundle2), str6, j4);
/* 1049 */              pn3 pn3VarM4567o2 = ij3Var2.m4567o();
/* 1053 */              pn3VarM4567o2.getClass();
/* 1056 */              pn3VarM4567o2.mo1375y();
/* 1059 */              pn3VarM4567o2.m9576A();
/* 1062 */              pn3VarM4567o2.m7516L();
/* 1069 */              lh3VarM4566n = ((ij3) pn3VarM4567o2.f16749a).m4566n();
/* 1073 */              lh3VarM4566n.getClass();
/* 1076 */              Parcel parcelObtain2 = Parcel.obtain();
/* 1082 */              re3.m8151a(zzbgVar2, parcelObtain2, i);
/* 1085 */              bArrMarshall = parcelObtain2.marshall();
/* 1089 */              parcelObtain2.recycle();
/* 1095 */              if (bArrMarshall.length > 131072) {
/* 1101 */                  uh3 uh3Var4 = ((ij3) lh3VarM4566n.f16749a).f9655f;
/* 1103 */                  ij3.m4555l(uh3Var4);
/* 1110 */                  uh3Var4.f17539i.m8510a("Event is too long for local database. Sending event directly to service");
/* 1113 */                  zM6452G = false;
                        } else {
/* 1118 */                  zM6452G = lh3VarM4566n.m6452G(bArrMarshall, 0);
                        }
/* 1144 */              pn3VarM4567o2.m7518N(new rm3(pn3VarM4567o2, pn3VarM4567o2.m7520P(true), zM6452G, zzbgVar2, 1));
/* 1147 */              if (!z4) {
/* 1151 */                  it = sl3Var.f16688e.iterator();
/* 1159 */                  while (it.hasNext()) {
/* 1178 */                      ((rk3) it.next()).onEvent(str, str2, new Bundle(bundle2), j);
                            }
                        }
/* 1184 */              i3++;
/* 1186 */              str6 = str;
/* 1188 */              j4 = j;
/* 1190 */              str3 = str8;
/* 1192 */              i = 0;
                    }
/* 1198 */          ij3.m4554k(lm3Var);
/* 1206 */          if (lm3Var.m6503F(false) == null) {
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0021  */
                /* JADX INFO: renamed from: J */
                public final void m8559J(String str, String str2, Object obj, boolean z, long j) {
                    int iM9080E0;
                    int length;
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 8 */             if (z) {
/* 10 */                up3 up3Var = ij3Var.f9668w;
/* 12 */                ij3.m4553j(up3Var);
/* 15 */                iM9080E0 = up3Var.m9080E0(str2);
                    } else {
/* 20 */                up3 up3Var2 = ij3Var.f9668w;
/* 22 */                ij3.m4553j(up3Var2);
/* 32 */                if (!up3Var2.m9118z0("user property", str2)) {
/* 34 */                    iM9080E0 = 6;
                        } else if (up3Var2.m9076B0("user property", mn0.f13873h, null, str2)) {
/* 52 */                    ((ij3) up3Var2.f16749a).getClass();
/* 59 */                    if (up3Var2.m9077C0(24, "user property", str2)) {
/* 62 */                        iM9080E0 = 0;
                            } else {
/* 34 */                        iM9080E0 = 6;
                            }
                        } else {
/* 45 */                    iM9080E0 = 15;
                        }
                    }
/* 63 */            ac3 ac3Var = this.f16693h0;
/* 66 */            if (iM9080E0 != 0) {
/* 70 */                ij3.m4553j(ij3Var.f9668w);
/* 73 */                String strM9060E = up3.m9060E(24, str2, true);
/* 79 */                length = str2 != null ? str2.length() : 0;
/* 85 */                ij3.m4553j(ij3Var.f9668w);
/* 98 */                up3.m9062P(ac3Var, null, iM9080E0, "_ev", strM9060E, length);
/* 101 */               return;
                    }
/* 108 */           String str3 = str == null ? "app" : str;
/* 109 */           if (obj == null) {
/* 193 */               bj3 bj3Var = ij3Var.f9659i;
/* 195 */               ij3.m4555l(bj3Var);
/* 210 */               bj3Var.m1370I(new kq2(this, str3, str2, null, j, 2));
/* 213 */               return;
                    }
/* 111 */           up3 up3Var3 = ij3Var.f9668w;
/* 113 */           up3 up3Var4 = ij3Var.f9668w;
/* 115 */           ij3.m4553j(up3Var3);
/* 118 */           int iM9092M = up3Var3.m9092M(obj, str2);
/* 122 */           if (iM9092M != 0) {
/* 124 */               ij3.m4553j(up3Var4);
/* 127 */               String strM9060E2 = up3.m9060E(24, str2, true);
/* 143 */               length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
/* 147 */               ij3.m4553j(up3Var4);
/* 160 */               up3.m9062P(ac3Var, null, iM9092M, "_ev", strM9060E2, length);
/* 163 */               return;
                    }
/* 164 */           ij3.m4553j(up3Var4);
/* 167 */           Object objM9093N = up3Var4.m9093N(obj, str2);
/* 171 */           if (objM9093N != null) {
/* 173 */               bj3 bj3Var2 = ij3Var.f9659i;
/* 175 */               ij3.m4555l(bj3Var2);
/* 189 */               bj3Var2.m1370I(new kq2(this, str3, str2, objM9093N, j, 2));
                    }
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:17:0x0057  */
                /* JADX WARN: Code duplicated, block: B:18:0x0064  */
                /* JADX INFO: renamed from: K */
                public final void m8560K(long j, Object obj, String str, String str2) {
                    String str3;
                    boolean zM6452G;
/* 1 */             Object objValueOf = obj;
/* 5 */             ij3 ij3Var = (ij3) this.f16749a;
/* 7 */             kb1.m6058k(str);
/* 10 */            kb1.m6058k(str2);
/* 13 */            mo1375y();
/* 16 */            m9576A();
/* 28 */            if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
/* 32 */                String str4 = "_npa";
/* 34 */                if (objValueOf instanceof String) {
/* 37 */                    String str5 = (String) objValueOf;
/* 43 */                    if (!TextUtils.isEmpty(str5)) {
/* 64 */                        long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
/* 65 */                        objValueOf = Long.valueOf(j2);
/* 69 */                        ki3 ki3Var = ij3Var.f9653e;
/* 71 */                        ij3.m4553j(ki3Var);
/* 82 */                        ki3Var.f12798X.m8806n(j2 == 1 ? "true" : "false");
                            } else if (objValueOf == null) {
/* 88 */                        ki3 ki3Var2 = ij3Var.f9653e;
/* 90 */                        ij3.m4553j(ki3Var2);
/* 97 */                        ki3Var2.f12798X.m8806n("unset");
                            } else {
/* 101 */                       str4 = str2;
                            }
                        } else if (objValueOf == null) {
/* 88 */                    ki3 ki3Var3 = ij3Var.f9653e;
/* 90 */                    ij3.m4553j(ki3Var3);
/* 97 */                    ki3Var3.f12798X.m8806n("unset");
                        } else {
/* 101 */                   str4 = str2;
                        }
/* 102 */               uh3 uh3Var = ij3Var.f9655f;
/* 104 */               ij3.m4555l(uh3Var);
/* 113 */               uh3Var.f17534Y.m8512c("non_personalized_ads(_npa)", "Setting user property(FE)", objValueOf);
/* 116 */               str3 = str4;
                    } else {
/* 119 */               str3 = str2;
                    }
/* 117 */           Object obj2 = objValueOf;
/* 125 */           if (!ij3Var.m4560d()) {
/* 127 */               uh3 uh3Var2 = ij3Var.f9655f;
/* 129 */               ij3.m4555l(uh3Var2);
/* 136 */               uh3Var2.f17534Y.m8510a("User property not set since app measurement is disabled");
/* 139 */               return;
                    }
/* 144 */           if (ij3Var.m4564h()) {
/* 152 */               zzpk zzpkVar = new zzpk(j, obj2, str3, str);
/* 155 */               pn3 pn3VarM4567o = ij3Var.m4567o();
/* 159 */               pn3VarM4567o.mo1375y();
/* 162 */               pn3VarM4567o.m9576A();
/* 165 */               pn3VarM4567o.m7516L();
/* 172 */               lh3 lh3VarM4566n = ((ij3) pn3VarM4567o.f16749a).m4566n();
/* 176 */               lh3VarM4566n.getClass();
/* 179 */               Parcel parcelObtain = Parcel.obtain();
/* 183 */               cl3.m1723b(zzpkVar, parcelObtain);
/* 186 */               byte[] bArrMarshall = parcelObtain.marshall();
/* 190 */               parcelObtain.recycle();
/* 196 */               if (bArrMarshall.length > 131072) {
/* 202 */                   uh3 uh3Var3 = ((ij3) lh3VarM4566n.f16749a).f9655f;
/* 204 */                   ij3.m4555l(uh3Var3);
/* 211 */                   uh3Var3.f17539i.m8510a("User property too long for local database. Sending directly to service");
/* 214 */                   zM6452G = false;
                        } else {
/* 216 */                   zM6452G = lh3VarM4566n.m6452G(bArrMarshall, 1);
                        }
/* 240 */               pn3VarM4567o.m7518N(new rm3(pn3VarM4567o, pn3VarM4567o.m7520P(true), zM6452G, zzpkVar, 0));
                    }
                }

                /* JADX INFO: renamed from: L */
                public final void m8561L() {
/* 1 */             mo1375y();
/* 4 */             m9576A();
/* 9 */             ij3 ij3Var = (ij3) this.f16749a;
/* 15 */            if (ij3Var.m4564h()) {
/* 19 */                pd3 pd3Var = ij3Var.f9651d;
/* 25 */                ((ij3) pd3Var.f16749a).getClass();
/* 30 */                Boolean boolM7408L = pd3Var.m7408L("google_analytics_deferred_deep_link_enabled");
/* 34 */                if (boolM7408L != null && boolM7408L.booleanValue()) {
/* 42 */                    uh3 uh3Var = ij3Var.f9655f;
/* 44 */                    ij3.m4555l(uh3Var);
/* 51 */                    uh3Var.f17533X.m8510a("Deferred Deep Link feature enabled.");
/* 54 */                    bj3 bj3Var = ij3Var.f9659i;
/* 56 */                    ij3.m4555l(bj3Var);
/* 65 */                    bj3Var.m1370I(new uk3(this, 2));
                        }
/* 68 */                pn3 pn3VarM4567o = ij3Var.m4567o();
/* 72 */                pn3VarM4567o.mo1375y();
/* 75 */                pn3VarM4567o.m9576A();
/* 79 */                zzr zzrVarM7520P = pn3VarM4567o.m7520P(true);
/* 83 */                pn3VarM4567o.m7516L();
/* 88 */                ij3 ij3Var2 = (ij3) pn3VarM4567o.f16749a;
/* 95 */                ij3Var2.f9651d.m7406J(null, vg3.f18123c1);
/* 106 */               ij3Var2.m4566n().m6452G(new byte[0], 3);
/* 114 */               pn3VarM4567o.m7518N(new um3(pn3VarM4567o, zzrVarM7520P, 0));
/* 117 */               this.f16687d0 = false;
/* 119 */               ki3 ki3Var = ij3Var.f9653e;
/* 121 */               ij3.m4553j(ki3Var);
/* 124 */               ki3Var.mo1375y();
/* 133 */               String string = ki3Var.m6113D().getString("previous_os_version", null);
/* 145 */               ((ij3) ki3Var.f16749a).m4568p().m4240B();
/* 148 */               String str = Build.VERSION.RELEASE;
/* 154 */               if (!TextUtils.isEmpty(str) && !str.equals(string)) {
/* 166 */                   SharedPreferences.Editor editorEdit = ki3Var.m6113D().edit();
/* 170 */                   editorEdit.putString("previous_os_version", str);
/* 173 */                   editorEdit.apply();
                        }
/* 180 */               if (TextUtils.isEmpty(string)) {
/* 212 */                   return;
                        }
/* 186 */               ij3Var.m4568p().m4240B();
/* 193 */               if (string.equals(str)) {
/* 212 */                   return;
                        }
/* 197 */               Bundle bundle = new Bundle();
/* 202 */               bundle.putString("_po", string);
/* 209 */               m8556G("auto", "_ou", bundle);
                    }
                }

                /* JADX INFO: renamed from: M */
                public final void m8562M(Bundle bundle, long j) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 7 */             Bundle bundle2 = new Bundle(bundle);
/* 20 */            if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
/* 22 */                uh3 uh3Var = ij3Var.f9655f;
/* 24 */                ij3.m4555l(uh3Var);
/* 31 */                uh3Var.f17541w.m8510a("Package name should be null when calling setConditionalUserProperty");
                    }
/* 34 */            bundle2.remove("app_id");
/* 40 */            he3.m4179A(bundle2, "app_id", String.class, null);
/* 45 */            he3.m4179A(bundle2, FirebaseAnalytics.Param.ORIGIN, String.class, null);
/* 50 */            he3.m4179A(bundle2, "name", String.class, null);
/* 57 */            he3.m4179A(bundle2, FirebaseAnalytics.Param.VALUE, Object.class, null);
/* 62 */            he3.m4179A(bundle2, "trigger_event_name", String.class, null);
/* 75 */            he3.m4179A(bundle2, "trigger_timeout", Long.class, 0L);
/* 80 */            he3.m4179A(bundle2, "timed_out_event_name", String.class, null);
/* 87 */            he3.m4179A(bundle2, "timed_out_event_params", Bundle.class, null);
/* 92 */            he3.m4179A(bundle2, "triggered_event_name", String.class, null);
/* 97 */            he3.m4179A(bundle2, "triggered_event_params", Bundle.class, null);
/* 102 */           he3.m4179A(bundle2, "time_to_live", Long.class, 0L);
/* 107 */           he3.m4179A(bundle2, "expired_event_name", String.class, null);
/* 112 */           he3.m4179A(bundle2, "expired_event_params", Bundle.class, null);
/* 119 */           kb1.m6058k(bundle2.getString("name"));
/* 126 */           kb1.m6058k(bundle2.getString(FirebaseAnalytics.Param.ORIGIN));
/* 133 */           kb1.m6061n(bundle2.get(FirebaseAnalytics.Param.VALUE));
/* 138 */           bundle2.putLong("creation_timestamp", j);
/* 141 */           String string = bundle2.getString("name");
/* 145 */           Object obj = bundle2.get(FirebaseAnalytics.Param.VALUE);
/* 149 */           up3 up3Var = ij3Var.f9668w;
/* 151 */           mh3 mh3Var = ij3Var.f9639U;
/* 153 */           uh3 uh3Var2 = ij3Var.f9655f;
/* 155 */           ij3.m4553j(up3Var);
/* 162 */           if (up3Var.m9080E0(string) != 0) {
/* 307 */               ij3.m4555l(uh3Var2);
/* 318 */               uh3Var2.f17538f.m8511b(mh3Var.m6658c(string), "Invalid conditional user property name");
/* 321 */               return;
                    }
/* 164 */           ij3.m4553j(up3Var);
/* 171 */           if (up3Var.m9092M(obj, string) != 0) {
/* 292 */               ij3.m4555l(uh3Var2);
/* 303 */               uh3Var2.f17538f.m8512c(mh3Var.m6658c(string), "Invalid conditional user property value", obj);
/* 306 */               return;
                    }
/* 173 */           Object objM9093N = up3Var.m9093N(obj, string);
/* 177 */           if (objM9093N == null) {
/* 179 */               ij3.m4555l(uh3Var2);
/* 190 */               uh3Var2.f17538f.m8512c(mh3Var.m6658c(string), "Unable to normalize conditional user property value", obj);
/* 193 */               return;
                    }
/* 194 */           he3.m4203z(bundle2, objM9093N);
/* 197 */           long j2 = bundle2.getLong("trigger_timeout");
/* 216 */           if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
/* 226 */               ij3.m4555l(uh3Var2);
/* 241 */               uh3Var2.f17538f.m8512c(mh3Var.m6658c(string), "Invalid conditional user property timeout", Long.valueOf(j2));
/* 244 */               return;
                    }
/* 245 */           long j3 = bundle2.getLong("time_to_live");
/* 251 */           if (j3 > 15552000000L || j3 < 1) {
/* 273 */               ij3.m4555l(uh3Var2);
/* 288 */               uh3Var2.f17538f.m8512c(mh3Var.m6658c(string), "Invalid conditional user property time to live", Long.valueOf(j3));
                    } else {
/* 258 */               bj3 bj3Var = ij3Var.f9659i;
/* 260 */               ij3.m4555l(bj3Var);
/* 269 */               bj3Var.m1370I(new hl3(this, bundle2, 0));
                    }
                }

                /* JADX INFO: renamed from: N */
                public final void m8563N(String str, String str2, Bundle bundle) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 7 */             ij3Var.f9640V.getClass();
/* 10 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 14 */            kb1.m6058k(str);
/* 19 */            Bundle bundle2 = new Bundle();
/* 24 */            bundle2.putString("name", str);
/* 29 */            bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
/* 32 */            if (str2 != null) {
/* 36 */                bundle2.putString("expired_event_name", str2);
/* 41 */                bundle2.putBundle("expired_event_params", bundle);
                    }
/* 44 */            bj3 bj3Var = ij3Var.f9659i;
/* 46 */            ij3.m4555l(bj3Var);
/* 57 */            bj3Var.m1370I(new cp0(this, bundle2, 28, false));
                }

                /* JADX INFO: renamed from: O */
                public final void m8564O(ok3 ok3Var, long j, boolean z) {
/* 1 */             int i = ok3Var.f14793b;
/* 3 */             mo1375y();
/* 6 */             m9576A();
/* 11 */            ij3 ij3Var = (ij3) this.f16749a;
/* 13 */            ki3 ki3Var = ij3Var.f9653e;
/* 15 */            uh3 uh3Var = ij3Var.f9655f;
/* 17 */            ij3.m4553j(ki3Var);
/* 20 */            ok3 ok3VarM6116G = ki3Var.m6116G();
/* 28 */            if (j <= this.f16683b0 && ok3.m7186l(ok3VarM6116G.f14793b, i)) {
/* 39 */                ij3.m4555l(uh3Var);
/* 46 */                uh3Var.f17532W.m8511b(ok3Var, "Dropped out-of-date consent setting, proposed settings");
/* 49 */                return;
                    }
/* 50 */            ki3 ki3Var2 = ij3Var.f9653e;
/* 52 */            ij3.m4553j(ki3Var2);
/* 55 */            ki3Var2.mo1375y();
/* 74 */            if (!ok3.m7186l(i, ki3Var2.m6113D().getInt("consent_source", 100))) {
/* 186 */               ij3.m4555l(uh3Var);
/* 197 */               uh3Var.f17532W.m8511b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
/* 200 */               return;
                    }
/* 80 */            SharedPreferences.Editor editorEdit = ki3Var2.m6113D().edit();
/* 90 */            editorEdit.putString("consent_settings", ok3Var.m7188g());
/* 93 */            editorEdit.putInt("consent_source", i);
/* 96 */            editorEdit.apply();
/* 99 */            ij3.m4555l(uh3Var);
/* 106 */           uh3Var.f17534Y.m8511b(ok3Var, "Setting storage consent(FE)");
/* 109 */           this.f16683b0 = j;
/* 119 */           if (ij3Var.m4567o().m7514J()) {
/* 121 */               pn3 pn3VarM4567o = ij3Var.m4567o();
/* 125 */               pn3VarM4567o.mo1375y();
/* 128 */               pn3VarM4567o.m9576A();
/* 137 */               pn3VarM4567o.m7518N(new ln3(pn3VarM4567o, 2));
                    } else {
/* 141 */               pn3 pn3VarM4567o2 = ij3Var.m4567o();
/* 145 */               pn3VarM4567o2.mo1375y();
/* 148 */               pn3VarM4567o2.m9576A();
/* 155 */               if (pn3VarM4567o2.m7513I()) {
/* 168 */                   pn3VarM4567o2.m7518N(new um3(pn3VarM4567o2, pn3VarM4567o2.m7520P(false), 1));
                        }
                    }
/* 171 */           if (z) {
/* 182 */               ij3Var.m4567o().m7508D(new AtomicReference());
                    }
                }

                /* JADX INFO: renamed from: P */
                public final void m8565P(Boolean bool, boolean z) {
/* 1 */             mo1375y();
/* 4 */             m9576A();
/* 9 */             ij3 ij3Var = (ij3) this.f16749a;
/* 11 */            uh3 uh3Var = ij3Var.f9655f;
/* 13 */            ij3.m4555l(uh3Var);
/* 20 */            uh3Var.f17533X.m8511b(bool, "Setting app measurement enabled (FE)");
/* 23 */            ki3 ki3Var = ij3Var.f9653e;
/* 25 */            ij3.m4553j(ki3Var);
/* 28 */            ki3Var.mo1375y();
/* 35 */            SharedPreferences.Editor editorEdit = ki3Var.m6113D().edit();
/* 41 */            if (bool != null) {
/* 47 */                editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
                    } else {
/* 51 */                editorEdit.remove("measurement_enabled");
                    }
/* 54 */            editorEdit.apply();
/* 57 */            if (z) {
/* 59 */                ki3Var.mo1375y();
/* 66 */                SharedPreferences.Editor editorEdit2 = ki3Var.m6113D().edit();
/* 72 */                if (bool != null) {
/* 78 */                    editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
                        } else {
/* 82 */                    editorEdit2.remove("measurement_enabled_from_api");
                        }
/* 85 */                editorEdit2.apply();
                    }
/* 88 */            bj3 bj3Var = ij3Var.f9659i;
/* 90 */            ij3.m4555l(bj3Var);
/* 93 */            bj3Var.mo1375y();
/* 98 */            if (ij3Var.f9662k0 || !(bool == null || bool.booleanValue())) {
/* 110 */               m8566Q();
                    }
                }

                /* JADX INFO: renamed from: Q */
                public final void m8566Q() {
/* 1 */             mo1375y();
/* 7 */             ij3 ij3Var = (ij3) this.f16749a;
/* 9 */             ki3 ki3Var = ij3Var.f9653e;
/* 11 */            uh3 uh3Var = ij3Var.f9655f;
/* 13 */            xt0 xt0Var = ij3Var.f9640V;
/* 15 */            ij3.m4553j(ki3Var);
/* 20 */            String strM8805m = ki3Var.f12798X.m8805m();
/* 24 */            int i = 1;
/* 25 */            if (strM8805m != null) {
/* 33 */                if ("unset".equals(strM8805m)) {
/* 35 */                    xt0Var.getClass();
/* 48 */                    m8560K(System.currentTimeMillis(), null, "app", "_npa");
                        } else {
/* 65 */                    Long lValueOf = Long.valueOf(true != "true".equals(strM8805m) ? 0L : 1L);
/* 69 */                    xt0Var.getClass();
/* 81 */                    m8560K(System.currentTimeMillis(), lValueOf, "app", "_npa");
                        }
                    }
/* 88 */            if (!ij3Var.m4560d() || !this.f16687d0) {
/* 131 */               ij3.m4555l(uh3Var);
/* 138 */               uh3Var.f17533X.m8510a("Updating Scion state (FE)");
/* 141 */               pn3 pn3VarM4567o = ij3Var.m4567o();
/* 145 */               pn3VarM4567o.mo1375y();
/* 148 */               pn3VarM4567o.m9576A();
/* 161 */               pn3VarM4567o.m7518N(new sm3(pn3VarM4567o, pn3VarM4567o.m7520P(true), 2));
/* 164 */               return;
                    }
/* 94 */            ij3.m4555l(uh3Var);
/* 101 */           uh3Var.f17533X.m8510a("Recording app launch after enabling measurement for the first time (FE)");
/* 104 */           m8561L();
/* 107 */           lo3 lo3Var = ij3Var.f9667v;
/* 109 */           ij3.m4554k(lo3Var);
/* 114 */           lo3Var.f13437e.m7455a();
/* 117 */           bj3 bj3Var = ij3Var.f9659i;
/* 119 */           ij3.m4555l(bj3Var);
/* 127 */           bj3Var.m1370I(new uk3(this, i));
                }

                /* JADX INFO: renamed from: R */
                public final void m8567R() {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 13 */            if (!(ij3Var.f9645a.getApplicationContext() instanceof Application) || this.f16684c == null) {
/* 32 */                return;
                    }
/* 29 */            ((Application) ij3Var.f9645a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f16684c);
                }

                /* JADX INFO: renamed from: S */
                public final void m8568S(Bundle bundle, int i, long j) {
                    Boolean bool;
                    String string;
                    lk3 lk3Var;
                    Boolean bool2;
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             m9576A();
/* 8 */             ok3 ok3Var = ok3.f14791c;
/* 12 */            nk3[] nk3VarArr = mk3.STORAGE.f13844a;
/* 14 */            int length = nk3VarArr.length;
/* 15 */            int i2 = 0;
                    while (true) {
/* 16 */                bool = null;
/* 17 */                if (i2 >= length) {
/* 64 */                    string = null;
                            break;
                        }
/* 21 */                String str = nk3VarArr[i2].f14353a;
/* 27 */                if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
/* 41 */                    if (string.equals("granted")) {
/* 43 */                        bool2 = Boolean.TRUE;
                            } else {
/* 57 */                        bool2 = string.equals("denied") ? Boolean.FALSE : null;
                            }
/* 58 */                    if (bool2 == null) {
                                break;
                            }
                        }
/* 61 */                i2++;
                    }
/* 65 */            if (string != null) {
/* 67 */                uh3 uh3Var = ij3Var.f9655f;
/* 69 */                ij3.m4555l(uh3Var);
/* 76 */                uh3Var.f17531V.m8511b(string, "Ignoring invalid consent setting");
/* 79 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 81 */                ij3.m4555l(uh3Var2);
/* 88 */                uh3Var2.f17531V.m8510a("Valid consent values are 'granted', 'denied'");
                    }
/* 91 */            bj3 bj3Var = ij3Var.f9659i;
/* 93 */            ij3.m4555l(bj3Var);
/* 96 */            boolean zM1367F = bj3Var.m1367F();
/* 100 */           ok3 ok3VarM7181b = ok3.m7181b(i, bundle);
/* 110 */           Iterator it = ok3VarM7181b.f14792a.values().iterator();
                    while (true) {
/* 114 */               boolean zHasNext = it.hasNext();
/* 118 */               lk3Var = lk3.UNINITIALIZED;
/* 120 */               if (!zHasNext) {
                            break;
                        } else if (((lk3) it.next()) != lk3Var) {
/* 130 */                   m8570U(ok3VarM7181b, zM1367F);
                            break;
                        }
                    }
/* 133 */           ce3 ce3VarM1647c = ce3.m1647c(i, bundle);
/* 143 */           Iterator it2 = ce3VarM1647c.f2870e.values().iterator();
/* 151 */           while (it2.hasNext()) {
/* 159 */               if (((lk3) it2.next()) != lk3Var) {
/* 161 */                   m8569T(ce3VarM1647c, zM1367F);
                            break;
                        }
                    }
/* 164 */           if (bundle != null) {
/* 177 */               int iOrdinal = ok3.m7183d(bundle.getString("ad_personalization")).ordinal();
/* 182 */               if (iOrdinal == 2) {
/* 191 */                   bool = Boolean.FALSE;
                        } else if (iOrdinal == 3) {
/* 188 */                   bool = Boolean.TRUE;
                        }
                    }
/* 193 */           if (bool != null) {
/* 202 */               String str2 = i == -30 ? "tcf" : "app";
/* 204 */               if (zM1367F) {
/* 215 */                   m8560K(j, bool.toString(), str2, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS);
                        } else {
/* 228 */                   m8559J(str2, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, bool.toString(), false, j);
                        }
                    }
                }

                /* JADX INFO: renamed from: T */
                public final void m8569T(ce3 ce3Var, boolean z) {
/* 6 */             dp0 dp0Var = new dp0(this, ce3Var, 29, false);
/* 9 */             if (z) {
/* 11 */                mo1375y();
/* 14 */                dp0Var.run();
                    } else {
/* 22 */                bj3 bj3Var = ((ij3) this.f16749a).f9659i;
/* 24 */                ij3.m4555l(bj3Var);
/* 27 */                bj3Var.m1370I(dp0Var);
                    }
                }

                /* JADX INFO: renamed from: U */
                public final void m8570U(ok3 ok3Var, boolean z) {
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    ok3 ok3Var2;
/* 1 */             m9576A();
/* 4 */             int i = ok3Var.f14793b;
/* 8 */             if (i != -10) {
/* 18 */                lk3 lk3Var = (lk3) ok3Var.f14792a.get(nk3.AD_STORAGE);
/* 20 */                if (lk3Var == null) {
/* 22 */                    lk3Var = lk3.UNINITIALIZED;
                        }
/* 24 */                lk3 lk3Var2 = lk3.UNINITIALIZED;
/* 26 */                if (lk3Var == lk3Var2) {
/* 36 */                    lk3 lk3Var3 = (lk3) ok3Var.f14792a.get(nk3.ANALYTICS_STORAGE);
/* 38 */                    if (lk3Var3 == null) {
/* 40 */                        lk3Var3 = lk3Var2;
                            }
/* 41 */                    if (lk3Var3 == lk3Var2) {
/* 48 */                        uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 50 */                        ij3.m4555l(uh3Var);
/* 57 */                        uh3Var.f17531V.m8510a("Ignoring empty consent settings");
/* 60 */                        return;
                            }
                        }
                    }
                    synchronized (this.f16695v) {
                        try {
/* 72 */                    z2 = false;
/* 73 */                    if (ok3.m7186l(i, this.f16681Z.f14793b)) {
/* 75 */                        ok3 ok3Var3 = this.f16681Z;
/* 77 */                        EnumMap enumMap = ok3Var.f14792a;
/* 89 */                        nk3[] nk3VarArr = (nk3[]) enumMap.keySet().toArray(new nk3[0]);
/* 91 */                        int length = nk3VarArr.length;
/* 92 */                        int i2 = 0;
                                while (true) {
/* 94 */                            if (i2 >= length) {
/* 123 */                               z3 = false;
                                        break;
                                    }
/* 96 */                            nk3 nk3Var = nk3VarArr[i2];
/* 102 */                           lk3 lk3Var4 = (lk3) enumMap.get(nk3Var);
/* 110 */                           lk3 lk3Var5 = (lk3) ok3Var3.f14792a.get(nk3Var);
/* 112 */                           lk3 lk3Var6 = lk3.DENIED;
/* 114 */                           if (lk3Var4 == lk3Var6 && lk3Var5 != lk3Var6) {
/* 118 */                               z3 = true;
                                        break;
                                    }
/* 120 */                           i2++;
                                }
/* 124 */                       nk3 nk3Var2 = nk3.ANALYTICS_STORAGE;
/* 130 */                       if (ok3Var.m7189i(nk3Var2) && !this.f16681Z.m7189i(nk3Var2)) {
/* 140 */                           z2 = true;
                                }
/* 148 */                       ok3Var = ok3Var.m7191k(this.f16681Z);
/* 152 */                       this.f16681Z = ok3Var;
/* 154 */                       z4 = z2;
/* 155 */                       z2 = true;
                            } else {
/* 158 */                       z3 = false;
/* 159 */                       z4 = false;
                            }
/* 156 */                   ok3Var2 = ok3Var;
                        } catch (Throwable th) {
/* 274 */                   throw th;
                        }
                    }
/* 162 */           if (!z2) {
/* 168 */               uh3 uh3Var2 = ((ij3) this.f16749a).f9655f;
/* 170 */               ij3.m4555l(uh3Var2);
/* 177 */               uh3Var2.f17532W.m8511b(ok3Var2, "Ignoring lower-priority consent settings, proposed settings");
/* 180 */               return;
                    }
/* 183 */           long andIncrement = this.f16682a0.getAndIncrement();
/* 187 */           if (z3) {
/* 192 */               this.f16694i.set(null);
/* 199 */               jl3 jl3Var = new jl3(this, ok3Var2, andIncrement, z4, 0);
/* 202 */               if (z) {
/* 204 */                   mo1375y();
/* 207 */                   jl3Var.run();
/* 210 */                   return;
                        } else {
/* 215 */                   bj3 bj3Var = ((ij3) this.f16749a).f9659i;
/* 217 */                   ij3.m4555l(bj3Var);
/* 220 */                   bj3Var.m1372K(jl3Var);
/* 223 */                   return;
                        }
                    }
/* 228 */           jl3 jl3Var2 = new jl3(this, ok3Var2, andIncrement, z4, 1);
/* 231 */           if (z) {
/* 233 */               mo1375y();
/* 236 */               jl3Var2.run();
                    } else if (i == 30 || i == -10) {
/* 264 */               bj3 bj3Var2 = ((ij3) this.f16749a).f9659i;
/* 266 */               ij3.m4555l(bj3Var2);
/* 269 */               bj3Var2.m1372K(jl3Var2);
                    } else {
/* 251 */               bj3 bj3Var3 = ((ij3) this.f16749a).f9659i;
/* 253 */               ij3.m4555l(bj3Var3);
/* 256 */               bj3Var3.m1370I(jl3Var2);
                    }
                }

                /* JADX INFO: renamed from: V */
                public final void m8571V() {
/* 1 */             zzql.zza();
/* 6 */             ij3 ij3Var = (ij3) this.f16749a;
/* 8 */             pd3 pd3Var = ij3Var.f9651d;
/* 10 */            bj3 bj3Var = ij3Var.f9659i;
/* 12 */            uh3 uh3Var = ij3Var.f9655f;
/* 21 */            if (pd3Var.m7406J(null, vg3.f18096Q0)) {
/* 23 */                ij3.m4555l(bj3Var);
/* 30 */                if (bj3Var.m1367F()) {
/* 115 */                   ij3.m4555l(uh3Var);
/* 122 */                   uh3Var.f17538f.m8510a("Cannot get trigger URIs from analytics worker thread");
/* 125 */                   return;
                        }
/* 36 */                if (q62.m7734g()) {
/* 104 */                   ij3.m4555l(uh3Var);
/* 111 */                   uh3Var.f17538f.m8510a("Cannot get trigger URIs from main thread");
/* 114 */                   return;
                        }
/* 38 */                m9576A();
/* 41 */                ij3.m4555l(uh3Var);
/* 48 */                uh3Var.f17534Y.m8510a("Getting trigger URIs (FE)");
/* 53 */                AtomicReference atomicReference = new AtomicReference();
/* 56 */                ij3.m4555l(bj3Var);
/* 69 */                bj3Var.m1371J(atomicReference, 10000L, "get trigger URIs", new gl3(this, atomicReference, 3));
/* 76 */                List list = (List) atomicReference.get();
/* 78 */                if (list == null) {
/* 80 */                    ij3.m4555l(uh3Var);
/* 87 */                    uh3Var.f17540v.m8510a("Timed out waiting for get trigger URIs");
                        } else {
/* 91 */                    ij3.m4555l(bj3Var);
/* 100 */                   bj3Var.m1370I(new pl3(0, this, list));
                        }
                    }
                }

                /* JADX INFO: renamed from: W */
                public final PriorityQueue m8572W() {
/* 3 */             if (this.f16679X == null) {
/* 18 */                this.f16679X = new PriorityQueue(Comparator.comparing(ql3.f15648a, wa3.f18545c));
                    }
/* 20 */            return this.f16679X;
                }

                /* JADX INFO: renamed from: X */
                public final void m8573X() {
                    zzog zzogVar;
/* 1 */             mo1375y();
/* 4 */             int i = 0;
/* 5 */             this.f16680Y = false;
/* 15 */            if (m8572W().isEmpty() || this.f16696w || (zzogVar = (zzog) m8572W().poll()) == null) {
/* 107 */               return;
                    }
/* 36 */            ij3 ij3Var = (ij3) this.f16749a;
/* 38 */            up3 up3Var = ij3Var.f9668w;
/* 40 */            ij3.m4553j(up3Var);
/* 43 */            pd1 pd1VarM9095T = up3Var.m9095T();
/* 47 */            if (pd1VarM9095T != null) {
/* 50 */                this.f16696w = true;
/* 52 */                uh3 uh3Var = ij3Var.f9655f;
/* 54 */                ij3.m4555l(uh3Var);
/* 57 */                sh3 sh3Var = uh3Var.f17534Y;
/* 59 */                String str = zzogVar.f4215a;
/* 63 */                sh3Var.m8511b(str, "Registering trigger URI");
/* 70 */                s81 s81VarM7394e = pd1VarM9095T.m7394e(Uri.parse(str));
/* 74 */                if (s81VarM7394e != null) {
/* 104 */                   s81VarM7394e.mo3676a(new cp0(i, s81VarM7394e, new we2(21, this, zzogVar)), new ku0(this, 3));
                        } else {
/* 76 */                    this.f16696w = false;
/* 82 */                    m8572W().add(zzogVar);
                        }
                    }
                }
            }
