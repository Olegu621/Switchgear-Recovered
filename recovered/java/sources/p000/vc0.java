            package p000;

            import android.content.SharedPreferences;
            import android.os.Trace;
            import com.google.android.gms.internal.measurement.zzkl;
            import com.supercell.titan.VirtualKeyboardHandler;
            import io.sentry.android.core.AbstractC1245n0;
            import org.json.JSONArray;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vc0 implements Runnable {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ vc0 f17978b = new vc0(6);

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17979a;

                public /* synthetic */ vc0(int i) {
/* 1 */             this.f17979a = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 3 */             boolean z = true;
/* 4 */             boolean z2 = false;
                    switch (this.f17979a) {
                        case 0:
                            try {
/* 293 */                       int i = oq2.f14866a;
/* 295 */                       Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
/* 300 */                       if (sc0.f16512k == null) {
/* 303 */                           z = false;
                                }
/* 304 */                       if (z) {
/* 310 */                           sc0.m8471a().m8473c();
                                    break;
                                }
/* 316 */                       return;
                            } finally {
/* 319 */                       int i2 = oq2.f14866a;
/* 321 */                       Trace.endSection();
                            }
                        case 1:
/* 68 */                    rs0 rs0Var = rs0.f16254y;
/* 70 */                    xy1 xy1Var = rs0Var.f16265j;
                            synchronized (xy1Var) {
/* 83 */                        long jM3587p = ((er0) ((er0) xy1Var.f19395c).f7853b).m3587p("app_launch_last_sync_timestamp");
/* 87 */                        long jCurrentTimeMillis = System.currentTimeMillis();
/* 91 */                        xy1Var.m10039b(jCurrentTimeMillis);
/* 101 */                       if (jCurrentTimeMillis > jM3587p + 86400000 && jM3587p / 86400000 != System.currentTimeMillis() / 86400000) {
/* 114 */                           JSONArray jSONArrayM10043f = xy1Var.m10043f();
/* 122 */                           if (jSONArrayM10043f.length() != 0) {
/* 138 */                               ((fs0) ((ra2) xy1Var.f19397e).f15955a).m3826w(new es0(xy1Var, jSONArrayM10043f, jCurrentTimeMillis));
                                        break;
                                    }
                                }
                            }
/* 142 */                   xy1 xy1Var2 = rs0Var.f16265j;
/* 148 */                   JSONArray jSONArrayM3585n = ((er0) xy1Var2.f19395c).m3585n();
/* 156 */                   if (jSONArrayM3585n.length() != 0) {
/* 174 */                       ((fs0) ((ra2) xy1Var2.f19397e).f15955a).m3826w(new dp0(xy1Var2, jSONArrayM3585n, 9, z2));
                            }
/* 189 */                   wi1 wi1Var = new wi1(rs0Var.f16279x, rs0Var.f16262g, rs0Var.f16269n, rs0Var.f16273r, rs0Var.f16271p);
/* 192 */                   SharedPreferences sharedPreferences = wi1Var.f18648a;
/* 196 */                   int i3 = sharedPreferences.getInt("migration_state", 0);
/* 200 */                   if (i3 != 1 && i3 != 0 && !sharedPreferences.getBoolean("failure_logs_synced", false)) {
/* 227 */                       ((fs0) wi1Var.f18652e.f15955a).m3826w(new RunnableC2495ye(wi1Var, 16));
                            }
/* 230 */                   C1969nm c1969nm = rs0Var.f16261f;
/* 234 */                   er0 er0Var = (er0) c1969nm.f14373a;
/* 240 */                   if (c1969nm.m7010m() || !c1969nm.m7013p() || b40.m1232p(er0Var.m3584m())) {
/* 283 */                       rs0Var.f16274s.m1576K();
/* 286 */                       return;
                            } else {
/* 277 */                       ((qi1) c1969nm.f14375c).m7862i(er0Var.m3584m(), c1969nm.m7002e(), false, new er0(c1969nm, 22));
/* 286 */                       return;
                            }
                        case 2:
/* 64 */                    rs0.f16254y.f16274s.m1577L();
/* 67 */                    return;
                        case 3:
                            try {
/* 24 */                        if (rs0.m8239b()) {
/* 32 */                            xe2.m9775m("Helpshift", "requestUnreadMessageCount is called with shouldFetchFromServer = true", null);
/* 35 */                            rs0 rs0Var2 = rs0.f16254y;
/* 46 */                            rs0Var2.f16271p.m8116u(new RunnableC2495ye(rs0Var2, 12));
/* 59 */                            return;
                                }
/* 59 */                        return;
                            } catch (Exception e) {
/* 56 */                        AbstractC1245n0.m4877e("HelpshiftTitan", "HelpshiftTitan.requestNotificationCount", e);
/* 59 */                        return;
                            }
                        case 4:
/* 16 */                    VirtualKeyboardHandler.inputOkPressed();
/* 19 */                    return;
                        case 5:
/* 12 */                    VirtualKeyboardHandler.inputOkPressed();
/* 15 */                    return;
                        default:
/* 8 */                     zzkl.zzc();
/* 11 */                    return;
                    }
                }
            }
