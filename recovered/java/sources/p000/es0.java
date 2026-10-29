            package p000;

            import android.content.SharedPreferences;
            import java.util.Objects;
            import org.json.JSONArray;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class es0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7859a = 1;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f7860b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f7861c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f7862d;

                public es0(lm3 lm3Var, bm3 bm3Var, long j) {
/* 7 */             this.f7861c = bm3Var;
/* 9 */             this.f7860b = j;
/* 11 */            Objects.requireNonNull(lm3Var);
/* 14 */            this.f7862d = lm3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f7859a;
/* 4 */             long j = this.f7860b;
/* 6 */             Object obj = this.f7861c;
/* 8 */             Object obj2 = this.f7862d;
                    switch (i) {
                        case 0:
/* 46 */                    xy1 xy1Var = (xy1) obj2;
                            try {
/* 50 */                        int iM10036a = xy1.m10036a(xy1Var, (JSONArray) obj, false);
/* 56 */                        if (iM10036a >= 200 && iM10036a < 300) {
/* 76 */                            SharedPreferences.Editor editorEdit = ((SharedPreferences) ((er0) ((er0) xy1Var.f19395c).f7853b).f7853b).edit();
/* 80 */                            editorEdit.putLong("app_launch_last_sync_timestamp", j);
/* 87 */                            if (!editorEdit.commit()) {
/* 89 */                                editorEdit.commit();
                                    }
                                    break;
                                }
                            } catch (gt0 e) {
/* 98 */                        xe2.m9777o("analyticsMngr", "Failed to send the app launch events", e);
/* 101 */                       return;
                            }
                            break;
                        default:
/* 13 */                    lm3 lm3Var = (lm3) obj2;
/* 17 */                    lm3Var.m6501D((bm3) obj, false, j);
/* 21 */                    lm3Var.f13416e = null;
/* 27 */                    pn3 pn3VarM4567o = ((ij3) lm3Var.f16749a).m4567o();
/* 31 */                    pn3VarM4567o.mo1375y();
/* 34 */                    pn3VarM4567o.m9576A();
/* 42 */                    pn3VarM4567o.m7518N(new ol3(pn3VarM4567o, null));
                            break;
                    }
                }

/* 16 */        public es0(xy1 xy1Var, JSONArray jSONArray, long j) {
                    this.f7862d = xy1Var;
                    this.f7861c = jSONArray;
                    this.f7860b = j;
                }
            }
