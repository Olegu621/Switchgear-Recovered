            package p000;

            import com.helpshift.activities.HSMainActivity;
            import java.lang.ref.WeakReference;
            import java.util.Iterator;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ws0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18796a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f18797b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ra2 f18798c;

                public /* synthetic */ ws0(ra2 ra2Var, String str, int i) {
/* 1 */             this.f18796a = i;
/* 3 */             this.f18798c = ra2Var;
/* 5 */             this.f18797b = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f18796a;
/* 3 */             String str = this.f18797b;
/* 5 */             ra2 ra2Var = this.f18798c;
                    switch (i) {
                        case 0:
/* 53 */                    er0 er0Var = (er0) ((C1773iy) ra2Var.f15956b).f11955a;
/* 59 */                    if (!b40.m1232p(str) && b40.m1236t(str)) {
                                try {
/* 72 */                            String strM3589r = ((er0) er0Var.f7853b).m3589r("additional_hc_data");
/* 80 */                            if (!b40.m1234r(strM3589r)) {
/* 124 */                               er0Var.m3595y("additional_hc_data", str);
                                    } else {
/* 84 */                                JSONObject jSONObject = new JSONObject(str);
/* 89 */                                JSONObject jSONObject2 = new JSONObject(strM3589r);
/* 92 */                                Iterator<String> itKeys = jSONObject.keys();
/* 100 */                               while (itKeys.hasNext()) {
/* 102 */                                   String next = itKeys.next();
/* 112 */                                   jSONObject2.put(next, jSONObject.get(next));
                                        }
/* 120 */                               er0Var.m3595y("additional_hc_data", jSONObject2.toString());
                                    }
                                } catch (Exception e) {
/* 133 */                           xe2.m9777o("ConfigMangr", "error in storing additional Helpcenter data", e);
/* 136 */                           return;
                                }
                                break;
                            }
                            break;
                        default:
/* 18 */                    xs0 xs0Var = (xs0) ((WeakReference) ra2Var.f15955a).get();
/* 20 */                    if (xs0Var != null) {
/* 26 */                        xs0Var.f19346b.setVisibility(8);
/* 31 */                        xs0Var.f19347c.setVisibility(8);
/* 34 */                        HSMainActivity hSMainActivity = xs0Var.f19349e;
/* 36 */                        if (hSMainActivity != null) {
/* 38 */                            hSMainActivity.m2538e(str);
                                }
/* 41 */                        xs0Var.m10023i();
                            }
                            break;
                    }
                }
            }
