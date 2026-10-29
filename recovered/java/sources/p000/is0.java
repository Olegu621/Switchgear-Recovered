            package p000;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class is0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11917a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f11918b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ eq2 f11919c;

                public /* synthetic */ is0(eq2 eq2Var, String str, int i) {
/* 1 */             this.f11917a = i;
/* 3 */             this.f11919c = eq2Var;
/* 5 */             this.f11918b = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f11917a;
/* 4 */             eq2 eq2Var = this.f11919c;
/* 6 */             String str = this.f11918b;
                    switch (i) {
                        case 0:
/* 144 */                   ((C1773iy) eq2Var.f7833b).m5625u("webchat", str);
                            break;
                        case 1:
/* 51 */                    er0 er0Var = (er0) ((C1773iy) eq2Var.f7833b).f11955a;
/* 57 */                    if (!b40.m1232p(str) && b40.m1236t(str)) {
/* 72 */                        String strM3589r = ((er0) er0Var.f7853b).m3589r("local_storage_data");
/* 80 */                        if (!b40.m1232p(strM3589r)) {
                                    try {
/* 90 */                                JSONArray jSONArray = new JSONObject(str).getJSONArray(SharedDataContentProvider.BASE_PATH);
/* 96 */                                JSONObject jSONObject = new JSONObject(strM3589r);
/* 103 */                               for (int i2 = 0; i2 < jSONArray.length(); i2++) {
/* 105 */                                   String string = jSONArray.getString(i2);
/* 113 */                                   if (jSONObject.has(string)) {
/* 115 */                                       jSONObject.remove(string);
                                            }
                                        }
/* 125 */                               er0Var.m3595y("local_storage_data", jSONObject.toString());
                                    } catch (JSONException e) {
/* 134 */                               xe2.m9777o("ConfigMangr", "error in deleting local storage data", e);
                                    }
                                    break;
                                }
                            }
                            break;
                        default:
                            try {
/* 32 */                        ((C1969nm) eq2Var.f7834c).m7011n(Boolean.valueOf(new JSONObject(str).optBoolean("issueExists", false)), "show_chat_icon_in_helpcenter");
                            } catch (Exception e2) {
/* 41 */                        xe2.m9777o("wbEvntHndlr", "error in getting the issue exist flag", e2);
/* 44 */                        return;
                            }
                            break;
                    }
                }
            }
