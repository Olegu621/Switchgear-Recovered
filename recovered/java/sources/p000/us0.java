            package p000;

            import android.content.SharedPreferences;
            import com.helpshift.activities.HSMainActivity;
            import java.lang.ref.WeakReference;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class us0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17710a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ra2 f17711b;

                public /* synthetic */ us0(ra2 ra2Var, int i) {
/* 1 */             this.f17710a = i;
/* 3 */             this.f17711b = ra2Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    HSMainActivity hSMainActivity;
                    HSMainActivity hSMainActivity2;
/* 1 */             int i = this.f17710a;
/* 3 */             ra2 ra2Var = this.f17711b;
                    switch (i) {
                        case 0:
/* 133 */                   C1969nm c1969nm = (C1969nm) ra2Var.f15958d;
/* 139 */                   yy1.m10218m(c1969nm.m7005h());
/* 158 */                   ((SharedPreferences) ((er0) c1969nm.f14378f).f7853b).edit().clear().commit();
/* 165 */                   ((HashMap) c1969nm.f14380h).clear();
                            break;
                        case 1:
/* 89 */                    xs0 xs0Var = (xs0) ((WeakReference) ra2Var.f15955a).get();
/* 91 */                    if (xs0Var != null) {
/* 107 */                       String strM3589r = ((er0) ((er0) rs0.f16254y.f16260e.f11955a).f7853b).m3589r("local_storage_data");
/* 115 */                       if (b40.m1232p(strM3589r)) {
/* 117 */                           strM3589r = "{}";
                                }
/* 127 */                       xs0Var.m10022g("Helpcenter( JSON.stringify({ \"eventType\": \"setWebchatData\", \"config\": %data }));".replace("%data", strM3589r));
                            }
                            break;
                        case 2:
/* 69 */                    xs0 xs0Var2 = (xs0) ((WeakReference) ra2Var.f15955a).get();
/* 71 */                    if (xs0Var2 != null && (hSMainActivity = xs0Var2.f19349e) != null) {
/* 77 */                        hSMainActivity.onBackPressed();
                                break;
                            }
                            break;
                        case 3:
/* 42 */                    xs0 xs0Var3 = (xs0) ((WeakReference) ra2Var.f15955a).get();
/* 44 */                    if (xs0Var3 != null && (hSMainActivity2 = xs0Var3.f19349e) != null) {
/* 53 */                        rs0.f16254y.f16258c = true;
/* 57 */                        hSMainActivity2.m2542i("helpcenter", true);
                                break;
                            }
                            break;
                        default:
/* 16 */                    xs0 xs0Var4 = (xs0) ((WeakReference) ra2Var.f15955a).get();
/* 18 */                    if (xs0Var4 != null) {
/* 23 */                        xs0Var4.f19347c.setVisibility(0);
/* 30 */                        xs0Var4.f19346b.setVisibility(8);
                            }
                            break;
                    }
                }
            }
