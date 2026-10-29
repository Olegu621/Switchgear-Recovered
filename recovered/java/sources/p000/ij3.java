            package p000;

            import android.app.Application;
            import android.content.Context;
            import android.os.Bundle;
            import android.os.SystemClock;
            import com.google.android.gms.internal.measurement.zzdd;
            import com.google.android.gms.internal.measurement.zzkl;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ij3 implements jk3 {

                /* JADX INFO: renamed from: p0 */
                public static volatile ij3 f9638p0;

                /* JADX INFO: renamed from: U */
                public final mh3 f9639U;

                /* JADX INFO: renamed from: V */
                public final xt0 f9640V;

                /* JADX INFO: renamed from: W */
                public final lm3 f9641W;

                /* JADX INFO: renamed from: X */
                public final sl3 f9642X;

                /* JADX INFO: renamed from: Y */
                public final of3 f9643Y;

                /* JADX INFO: renamed from: Z */
                public final wl3 f9644Z;

                /* JADX INFO: renamed from: a */
                public final Context f9645a;

                /* JADX INFO: renamed from: a0 */
                public final String f9646a0;

                /* JADX INFO: renamed from: b */
                public final boolean f9647b;

                /* JADX INFO: renamed from: b0 */
                public lh3 f9648b0;

                /* JADX INFO: renamed from: c */
                public final q62 f9649c;

                /* JADX INFO: renamed from: c0 */
                public pn3 f9650c0;

                /* JADX INFO: renamed from: d */
                public final pd3 f9651d;

                /* JADX INFO: renamed from: d0 */
                public me3 f9652d0;

                /* JADX INFO: renamed from: e */
                public final ki3 f9653e;

                /* JADX INFO: renamed from: e0 */
                public ih3 f9654e0;

                /* JADX INFO: renamed from: f */
                public final uh3 f9655f;

                /* JADX INFO: renamed from: f0 */
                public xl3 f9656f0;

                /* JADX INFO: renamed from: h0 */
                public Boolean f9658h0;

                /* JADX INFO: renamed from: i */
                public final bj3 f9659i;

                /* JADX INFO: renamed from: i0 */
                public long f9660i0;

                /* JADX INFO: renamed from: j0 */
                public volatile Boolean f9661j0;

                /* JADX INFO: renamed from: k0 */
                public volatile boolean f9662k0;

                /* JADX INFO: renamed from: l0 */
                public int f9663l0;

                /* JADX INFO: renamed from: m0 */
                public int f9664m0;

                /* JADX INFO: renamed from: o0 */
                public final long f9666o0;

                /* JADX INFO: renamed from: v */
                public final lo3 f9667v;

                /* JADX INFO: renamed from: w */
                public final up3 f9668w;

                /* JADX INFO: renamed from: g0 */
                public boolean f9657g0 = false;

                /* JADX INFO: renamed from: n0 */
                public final AtomicInteger f9665n0 = new AtomicInteger(0);

                public ij3(sk3 sk3Var) {
/* 4 */             boolean z = false;
/* 14 */            Context context = sk3Var.f16663a;
/* 20 */            q62 q62Var = new q62(11);
/* 23 */            this.f9649c = q62Var;
/* 25 */            jb1.f12173e = q62Var;
/* 27 */            this.f9645a = context;
/* 31 */            this.f9647b = sk3Var.f16667e;
/* 35 */            this.f9661j0 = sk3Var.f16664b;
/* 39 */            this.f9646a0 = sk3Var.f16669g;
/* 41 */            boolean z2 = true;
/* 42 */            this.f9662k0 = true;
/* 44 */            zzkl.zzb(context);
/* 49 */            this.f9640V = xt0.f19362c;
/* 51 */            Long l = sk3Var.f16668f;
/* 64 */            this.f9666o0 = l != null ? l.longValue() : System.currentTimeMillis();
/* 68 */            pd3 pd3Var = new pd3(this);
/* 73 */            pd3Var.f15075d = p62.f14992c;
/* 75 */            this.f9651d = pd3Var;
/* 79 */            ki3 ki3Var = new ki3(this);
/* 82 */            ki3Var.m4241C();
/* 85 */            this.f9653e = ki3Var;
/* 89 */            uh3 uh3Var = new uh3(this);
/* 92 */            uh3Var.m4241C();
/* 95 */            this.f9655f = uh3Var;
/* 99 */            up3 up3Var = new up3(this);
/* 102 */           up3Var.m4241C();
/* 105 */           this.f9668w = up3Var;
/* 117 */           this.f9639U = new mh3(new oi3(sk3Var, this));
/* 124 */           this.f9643Y = new of3(this);
/* 128 */           lm3 lm3Var = new lm3(this);
/* 131 */           lm3Var.m9577B();
/* 134 */           this.f9641W = lm3Var;
/* 138 */           sl3 sl3Var = new sl3(this);
/* 141 */           sl3Var.m9577B();
/* 144 */           this.f9642X = sl3Var;
/* 148 */           lo3 lo3Var = new lo3(this);
/* 151 */           lo3Var.m9577B();
/* 154 */           this.f9667v = lo3Var;
/* 158 */           wl3 wl3Var = new wl3(this);
/* 161 */           wl3Var.m4241C();
/* 164 */           this.f9644Z = wl3Var;
/* 168 */           bj3 bj3Var = new bj3(this);
/* 171 */           bj3Var.m4241C();
/* 174 */           this.f9659i = bj3Var;
/* 176 */           zzdd zzddVar = sk3Var.f16666d;
/* 178 */           if (zzddVar != null && zzddVar.zzb != 0) {
/* 188 */               z2 = false;
                    }
/* 195 */           if (context.getApplicationContext() instanceof Application) {
/* 197 */               m4554k(sl3Var);
/* 212 */               if (((ij3) sl3Var.f16749a).f9645a.getApplicationContext() instanceof Application) {
/* 224 */                   Application application = (Application) ((ij3) sl3Var.f16749a).f9645a.getApplicationContext();
/* 228 */                   if (sl3Var.f16684c == null) {
/* 236 */                       sl3Var.f16684c = new dh0(sl3Var, 2);
                            }
/* 238 */                   if (z2) {
/* 242 */                       application.unregisterActivityLifecycleCallbacks(sl3Var.f16684c);
/* 247 */                       application.registerActivityLifecycleCallbacks(sl3Var.f16684c);
/* 254 */                       uh3 uh3Var2 = ((ij3) sl3Var.f16749a).f9655f;
/* 256 */                       m4555l(uh3Var2);
/* 263 */                       uh3Var2.f17534Y.m8510a("Registered activity lifecycle callback");
                            }
                        }
                    } else {
/* 267 */               m4555l(uh3Var);
/* 274 */               uh3Var.f17541w.m8510a("Application context is not an Application");
                    }
/* 284 */           bj3Var.m1370I(new dp0(this, sk3Var, 26, z));
                }

                /* JADX INFO: renamed from: i */
                public static final void m4552i(eg3 eg3Var) {
/* 1 */             if (eg3Var != null) {
/* 3 */                 return;
                    }
/* 6 */             f42.m3656l("Component not created");
                }

                /* JADX INFO: renamed from: j */
                public static final void m4553j(sq3 sq3Var) {
/* 1 */             if (sq3Var != null) {
/* 3 */                 return;
                    }
/* 6 */             f42.m3656l("Component not created");
                }

                /* JADX INFO: renamed from: k */
                public static final void m4554k(wg3 wg3Var) {
/* 1 */             if (wg3Var == null) {
/* 28 */                f42.m3656l("Component not created");
                    } else {
/* 5 */                 if (wg3Var.f18620b) {
/* 7 */                     return;
                        }
/* 22 */                f42.m3656l("Component not initialized: ".concat(String.valueOf(wg3Var.getClass())));
                    }
                }

                /* JADX INFO: renamed from: l */
                public static final void m4555l(hk3 hk3Var) {
/* 1 */             if (hk3Var == null) {
/* 28 */                f42.m3656l("Component not created");
                    } else {
/* 5 */                 if (hk3Var.f9127b) {
/* 7 */                     return;
                        }
/* 22 */                f42.m3656l("Component not initialized: ".concat(String.valueOf(hk3Var.getClass())));
                    }
                }

                /* JADX INFO: renamed from: r */
                public static ij3 m4556r(Context context, zzdd zzddVar, Long l) {
                    Bundle bundle;
/* 1 */             if (zzddVar != null) {
/* 3 */                 Bundle bundle2 = zzddVar.zzd;
/* 14 */                zzddVar = new zzdd(zzddVar.zza, zzddVar.zzb, zzddVar.zzc, bundle2, null);
                    }
/* 18 */            kb1.m6061n(context);
/* 25 */            kb1.m6061n(context.getApplicationContext());
/* 30 */            if (f9638p0 == null) {
                        synchronized (ij3.class) {
                            try {
/* 37 */                        if (f9638p0 == null) {
/* 49 */                            f9638p0 = new ij3(new sk3(context, zzddVar, l));
                                }
                            } catch (Throwable th) {
/* 58 */                        throw th;
                            }
                        }
                    } else if (zzddVar != null && (bundle = zzddVar.zzd) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
/* 75 */                kb1.m6061n(f9638p0);
/* 90 */                f9638p0.f9661j0 = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
                    }
/* 94 */            kb1.m6061n(f9638p0);
/* 97 */            return f9638p0;
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: a */
                public final uh3 mo4557a() {
/* 1 */             uh3 uh3Var = this.f9655f;
/* 3 */             m4555l(uh3Var);
/* 6 */             return uh3Var;
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: b */
                public final bj3 mo4558b() {
/* 1 */             bj3 bj3Var = this.f9659i;
/* 3 */             m4555l(bj3Var);
/* 6 */             return bj3Var;
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: c */
                public final q62 mo4559c() {
/* 1 */             return this.f9649c;
                }

                /* JADX INFO: renamed from: d */
                public final boolean m4560d() {
                    return m4563g() == 0;
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: e */
                public final Context mo4561e() {
/* 1 */             return this.f9645a;
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: f */
                public final InterfaceC2475xv mo4562f() {
/* 1 */             return this.f9640V;
                }

                /* JADX INFO: renamed from: g */
                public final int m4563g() {
/* 1 */             bj3 bj3Var = this.f9659i;
/* 3 */             m4555l(bj3Var);
/* 6 */             bj3Var.mo1375y();
/* 9 */             pd3 pd3Var = this.f9651d;
/* 16 */            if (pd3Var.m7409M()) {
/* 15 */                return 1;
                    }
/* 18 */            m4555l(bj3Var);
/* 21 */            bj3Var.mo1375y();
/* 26 */            if (!this.f9662k0) {
/* 113 */               return 8;
                    }
/* 28 */            ki3 ki3Var = this.f9653e;
/* 30 */            m4553j(ki3Var);
/* 33 */            ki3Var.mo1375y();
/* 61 */            Boolean boolValueOf = ki3Var.m6113D().contains("measurement_enabled") ? Boolean.valueOf(ki3Var.m6113D().getBoolean("measurement_enabled", true)) : null;
/* 62 */            if (boolValueOf != null) {
                        return boolValueOf.booleanValue() ? 0 : 3;
                    }
/* 77 */            q62 q62Var = ((ij3) pd3Var.f16749a).f9649c;
/* 81 */            Boolean boolM7408L = pd3Var.m7408L("firebase_analytics_collection_enabled");
/* 85 */            if (boolM7408L != null) {
                        return boolM7408L.booleanValue() ? 0 : 4;
                    }
                    return (this.f9661j0 == null || this.f9661j0.booleanValue()) ? 0 : 7;
                }

                /* JADX WARN: Code duplicated, block: B:12:0x0035  */
                /* JADX WARN: Code duplicated, block: B:24:0x0074  */
                /* JADX WARN: Code duplicated, block: B:27:0x007d  */
                /* JADX INFO: renamed from: h */
                public final boolean m4564h() {
                    up3 up3Var;
                    Context context;
/* 3 */             boolean z = false;
/* 4 */             if (!this.f9657g0) {
/* 153 */               f42.m3656l("AppMeasurement is not initialized");
/* 3 */                 return false;
                    }
/* 6 */             bj3 bj3Var = this.f9659i;
/* 8 */             m4555l(bj3Var);
/* 11 */            bj3Var.mo1375y();
/* 14 */            Boolean bool = this.f9658h0;
/* 16 */            xt0 xt0Var = this.f9640V;
/* 18 */            if (bool == null || this.f9660i0 == 0) {
/* 54 */                xt0Var.getClass();
/* 61 */                this.f9660i0 = SystemClock.elapsedRealtime();
/* 63 */                up3Var = this.f9668w;
/* 65 */                m4553j(up3Var);
/* 74 */                if (up3Var.m9097W("android.permission.INTERNET") && up3Var.m9097W("android.permission.ACCESS_NETWORK_STATE")) {
/* 84 */                    context = this.f9645a;
/* 95 */                    if (g93.m3898a(context).m9215d() || this.f9651d.m7399C() || (up3.m9071p0(context) && up3.m9065S(context))) {
/* 117 */                       z = true;
                            }
                        }
/* 122 */               this.f9658h0 = Boolean.valueOf(z);
/* 124 */               if (z) {
/* 142 */                   this.f9658h0 = Boolean.valueOf(up3Var.m9078D(m4569q().m4535G()));
                        }
                    } else if (!bool.booleanValue()) {
/* 34 */                xt0Var.getClass();
/* 52 */                if (Math.abs(SystemClock.elapsedRealtime() - this.f9660i0) > 1000) {
/* 54 */                    xt0Var.getClass();
/* 61 */                    this.f9660i0 = SystemClock.elapsedRealtime();
/* 63 */                    up3Var = this.f9668w;
/* 65 */                    m4553j(up3Var);
/* 74 */                    if (up3Var.m9097W("android.permission.INTERNET")) {
/* 84 */                        context = this.f9645a;
/* 95 */                        if (g93.m3898a(context).m9215d()) {
/* 117 */                           z = true;
                                } else {
/* 117 */                           z = true;
                                }
                            }
/* 122 */                   this.f9658h0 = Boolean.valueOf(z);
/* 124 */                   if (z) {
/* 142 */                       this.f9658h0 = Boolean.valueOf(up3Var.m9078D(m4569q().m4535G()));
                            }
                        }
                    }
/* 146 */           return this.f9658h0.booleanValue();
                }

                /* JADX INFO: renamed from: m */
                public final mh3 m4565m() {
/* 1 */             return this.f9639U;
                }

                /* JADX INFO: renamed from: n */
                public final lh3 m4566n() {
/* 3 */             m4554k(this.f9648b0);
/* 6 */             return this.f9648b0;
                }

                /* JADX INFO: renamed from: o */
                public final pn3 m4567o() {
/* 3 */             m4554k(this.f9650c0);
/* 6 */             return this.f9650c0;
                }

                /* JADX INFO: renamed from: p */
                public final me3 m4568p() {
/* 3 */             m4555l(this.f9652d0);
/* 6 */             return this.f9652d0;
                }

                /* JADX INFO: renamed from: q */
                public final ih3 m4569q() {
/* 3 */             m4554k(this.f9654e0);
/* 6 */             return this.f9654e0;
                }
            }
