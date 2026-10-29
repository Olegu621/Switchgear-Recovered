            package p000;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.util.ArrayList;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vs0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18337a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f18338b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ra2 f18339c;

                public /* synthetic */ vs0(ra2 ra2Var, String str, int i) {
/* 1 */             this.f18337a = i;
/* 3 */             this.f18339c = ra2Var;
/* 5 */             this.f18338b = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f18337a;
/* 3 */             int i2 = 0;
/* 4 */             String str = this.f18338b;
/* 6 */             ra2 ra2Var = this.f18339c;
                    switch (i) {
                        case 0:
                            try {
/* 118 */                       JSONArray jSONArray = new JSONArray(str);
/* 125 */                       while (i2 < jSONArray.length()) {
/* 133 */                           String string = jSONArray.getJSONObject(i2).getString("actionType");
/* 155 */                           xe2.m9775m("HSHelpcenterEventsHandler", "Received action type " + string, null);
/* 164 */                           if ("clearUserTrail".equalsIgnoreCase(string)) {
/* 174 */                               ((ArrayList) ((C1773iy) ra2Var.f15956b).f11961i).clear();
                                    }
/* 177 */                           i2++;
                                }
                            } catch (JSONException e) {
/* 183 */                       xe2.m9777o("HSHelpcenterEventsHandler", "Error in reading action type content ", e);
/* 186 */                       return;
                            }
                            break;
                        case 1:
/* 27 */                    er0 er0Var = (er0) ((C1773iy) ra2Var.f15956b).f11955a;
/* 33 */                    if (!b40.m1232p(str) && b40.m1236t(str)) {
/* 48 */                        String strM3589r = ((er0) er0Var.f7853b).m3589r("additional_hc_data");
/* 56 */                        if (!b40.m1232p(strM3589r)) {
                                    try {
/* 66 */                                JSONArray jSONArray2 = new JSONObject(str).getJSONArray(SharedDataContentProvider.BASE_PATH);
/* 72 */                                JSONObject jSONObject = new JSONObject(strM3589r);
/* 79 */                                while (i2 < jSONArray2.length()) {
/* 81 */                                    String string2 = jSONArray2.getString(i2);
/* 89 */                                    if (jSONObject.has(string2)) {
/* 91 */                                        jSONObject.remove(string2);
                                            }
/* 94 */                                    i2++;
                                        }
/* 101 */                               er0Var.m3595y("additional_hc_data", jSONObject.toString());
                                    } catch (Exception e2) {
/* 110 */                               xe2.m9777o("ConfigMangr", "error in deleting helpcenter data", e2);
/* 113 */                               return;
                                    }
                                    break;
                                }
                            }
                            break;
                        default:
/* 17 */                    ((C1773iy) ra2Var.f15956b).m5625u("helpcenter", str);
                            break;
                    }
                }
            }
