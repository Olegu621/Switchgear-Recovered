            package p000;

            import android.os.Bundle;
            import com.google.android.gms.measurement.internal.zzah;
            import com.google.android.gms.measurement.internal.zzbg;
            import com.google.android.gms.measurement.internal.zzpk;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.TreeSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hl3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9137a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ sl3 f9138b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Bundle f9139c;

                public /* synthetic */ hl3(sl3 sl3Var, Bundle bundle, int i) {
/* 1 */             this.f9137a = i;
/* 3 */             this.f9139c = bundle;
/* 5 */             this.f9138b = sl3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Bundle bundle;
/* 3 */             int i = this.f9137a;
/* 5 */             Bundle bundle2 = this.f9139c;
/* 7 */             sl3 sl3Var = this.f9138b;
                    switch (i) {
                        case 0:
/* 286 */                   sl3Var.mo1375y();
/* 289 */                   sl3Var.m9576A();
/* 294 */                   String string = bundle2.getString("name");
/* 300 */                   String string2 = bundle2.getString(FirebaseAnalytics.Param.ORIGIN);
/* 304 */                   kb1.m6058k(string);
/* 307 */                   kb1.m6058k(string2);
/* 316 */                   kb1.m6061n(bundle2.get(FirebaseAnalytics.Param.VALUE));
/* 321 */                   ij3 ij3Var = (ij3) sl3Var.f16749a;
/* 327 */                   if (!ij3Var.m4560d()) {
/* 329 */                       uh3 uh3Var = ij3Var.f9655f;
/* 331 */                       ij3.m4555l(uh3Var);
/* 338 */                       uh3Var.f17534Y.m8510a("Conditional property not set since app measurement is disabled");
                            } else {
/* 356 */                       zzpk zzpkVar = new zzpk(bundle2.getLong("triggered_timestamp"), bundle2.get(FirebaseAnalytics.Param.VALUE), string, string2);
                                try {
/* 359 */                           up3 up3Var = ij3Var.f9668w;
/* 361 */                           ij3.m4553j(up3Var);
/* 364 */                           bundle2.getString("app_id");
/* 382 */                           zzbg zzbgVarM9100b0 = up3Var.m9100b0(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
/* 386 */                           ij3.m4553j(up3Var);
/* 389 */                           bundle2.getString("app_id");
/* 407 */                           zzbg zzbgVarM9100b1 = up3Var.m9100b0(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
/* 411 */                           bundle2.getString("app_id");
/* 473 */                           ij3Var.m4567o().m7523S(new zzah(bundle2.getString("app_id"), string2, zzpkVar, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), zzbgVarM9100b1, bundle2.getLong("trigger_timeout"), zzbgVarM9100b0, bundle2.getLong("time_to_live"), up3Var.m9100b0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                                } catch (IllegalArgumentException unused) {
/* 476 */                           return;
                                }
                            }
                            break;
                        default:
/* 12 */                    ac3 ac3Var = sl3Var.f16693h0;
/* 16 */                    ij3 ij3Var2 = (ij3) sl3Var.f16749a;
/* 22 */                    if (bundle2.isEmpty()) {
/* 24 */                        bundle = bundle2;
                            } else {
/* 29 */                        ki3 ki3Var = ij3Var2.f9653e;
/* 31 */                        up3 up3Var2 = ij3Var2.f9668w;
/* 33 */                        pd3 pd3Var = ij3Var2.f9651d;
/* 35 */                        uh3 uh3Var2 = ij3Var2.f9655f;
/* 37 */                        ij3.m4553j(ki3Var);
/* 46 */                        bundle = new Bundle(ki3Var.f12815j0.m8119x());
/* 61 */                        for (String str : bundle2.keySet()) {
/* 70 */                            Object obj = bundle2.get(str);
/* 74 */                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
/* 88 */                                ij3.m4553j(up3Var2);
/* 95 */                                if (up3.m9061H0(obj)) {
/* 103 */                                   up3.m9062P(ac3Var, null, 27, null, null, 0);
                                        }
/* 106 */                               ij3.m4555l(uh3Var2);
/* 113 */                               uh3Var2.f17531V.m8512c(str, "Invalid default event parameter type. Name, value", obj);
                                    } else if (up3.m9067X(str)) {
/* 123 */                               ij3.m4555l(uh3Var2);
/* 130 */                               uh3Var2.f17531V.m8511b(str, "Invalid default event parameter name. Name");
                                    } else if (obj == null) {
/* 136 */                               bundle.remove(str);
                                    } else {
/* 140 */                               ij3.m4553j(up3Var2);
/* 143 */                               pd3Var.getClass();
/* 154 */                               if (up3Var2.m9087I0("param", str, 500, obj)) {
/* 156 */                                   up3Var2.m9094O(obj, str, bundle);
                                        }
                                    }
                                }
/* 160 */                       ij3.m4553j(up3Var2);
/* 167 */                       up3 up3Var3 = ((ij3) pd3Var.f16749a).f9668w;
/* 169 */                       ij3.m4553j(up3Var3);
/* 184 */                       int i2 = up3Var3.m9102e0(201500000) ? 100 : 25;
/* 190 */                       if (bundle.size() > i2) {
/* 206 */                           int i3 = 0;
/* 211 */                           for (String str2 : new TreeSet(bundle.keySet())) {
/* 219 */                               i3++;
/* 221 */                               if (i3 > i2) {
/* 223 */                                   bundle.remove(str2);
                                        }
                                    }
/* 227 */                           ij3.m4553j(up3Var2);
/* 236 */                           up3.m9062P(ac3Var, null, 26, null, null, 0);
/* 239 */                           ij3.m4555l(uh3Var2);
/* 246 */                           uh3Var2.f17531V.m8510a("Too many default event parameters set. Discarding beyond event parameter limit");
                                }
                            }
/* 249 */                   ki3 ki3Var2 = ij3Var2.f9653e;
/* 251 */                   ij3.m4553j(ki3Var2);
/* 256 */                   ki3Var2.f12815j0.m8120y(bundle);
/* 263 */                   if (!bundle2.isEmpty() || ij3Var2.f9651d.m7406J(null, vg3.f18108W0)) {
/* 280 */                       ij3Var2.m4567o().m7509E(bundle);
                            }
                            break;
                    }
                }
            }
