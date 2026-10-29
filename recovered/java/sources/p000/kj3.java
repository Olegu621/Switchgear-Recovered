            package p000;

            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteException;
            import com.google.android.gms.internal.measurement.zzpk;
            import com.google.android.gms.measurement.internal.zzjc;
            import com.google.android.gms.measurement.internal.zzr;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kj3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12829a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ zzr f12830b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ zzjc f12831c;

                public /* synthetic */ kj3(zzjc zzjcVar, zzr zzrVar, int i) {
/* 1 */             this.f12829a = i;
/* 3 */             this.f12830b = zzrVar;
/* 5 */             this.f12831c = zzjcVar;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
/* 1 */             int i = this.f12829a;
/* 3 */             zzr zzrVar = this.f12830b;
/* 5 */             zzjc zzjcVar = this.f12831c;
                    switch (i) {
                        case 0:
/* 234 */                   zzjcVar.f4212a.m6731A();
/* 239 */                   zzjcVar.f4212a.m6746W(zzrVar);
                            break;
                        case 1:
/* 21 */                    zzjcVar.f4212a.m6731A();
/* 24 */                    mp3 mp3Var = zzjcVar.f4212a;
/* 30 */                    if (mp3Var.f13925j0 != null) {
/* 34 */                        ArrayList arrayList = new ArrayList();
/* 37 */                        mp3Var.f13926k0 = arrayList;
/* 41 */                        arrayList.addAll(mp3Var.f13925j0);
                            }
/* 44 */                    ae3 ae3Var = mp3Var.f13913c;
/* 46 */                    mp3.m6728S(ae3Var);
/* 51 */                    ij3 ij3Var = (ij3) ae3Var.f16749a;
/* 53 */                    String str = zzrVar.f4240a;
/* 55 */                    kb1.m6061n(str);
/* 58 */                    kb1.m6058k(str);
/* 61 */                    ae3Var.mo1375y();
/* 64 */                    ae3Var.m9593A();
                            try {
/* 67 */                        SQLiteDatabase sQLiteDatabaseM261q0 = ae3Var.m261q0();
/* 71 */                        String[] strArr = {str};
/* 164 */                       int iDelete = sQLiteDatabaseM261q0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("events", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("upload_queue", "app_id=?", strArr);
/* 165 */                       zzpk.zza();
/* 177 */                       if (ij3Var.f9651d.m7406J(null, vg3.f18141i1)) {
/* 185 */                           iDelete += sQLiteDatabaseM261q0.delete("no_data_mode_events", "app_id=?", strArr);
                                }
/* 189 */                       if (iDelete > 0) {
/* 191 */                           uh3 uh3Var = ij3Var.f9655f;
/* 193 */                           ij3.m4555l(uh3Var);
/* 204 */                           uh3Var.f17534Y.m8512c(str, "Reset analytics data. app, records", Integer.valueOf(iDelete));
                                }
                            } catch (SQLiteException e) {
/* 208 */                       uh3 uh3Var2 = ij3Var.f9655f;
/* 210 */                       ij3.m4555l(uh3Var2);
/* 221 */                       uh3Var2.f17538f.m8512c(uh3.m9013H(str), "Error resetting analytics data. appId, error", e);
                            }
/* 226 */                   if (zzrVar.f4263v) {
/* 228 */                       mp3Var.m6746W(zzrVar);
                            }
                            break;
                        default:
/* 10 */                    mp3 mp3Var2 = zzjcVar.f4212a;
/* 12 */                    mp3Var2.m6731A();
/* 15 */                    mp3Var2.m6769m0(zzrVar);
                            break;
                    }
                }
            }
