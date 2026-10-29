            package p000;

            import com.helpshift.activities.HSMainActivity;
            import java.lang.ref.WeakReference;
            import java.util.Iterator;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hs0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9221a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f9222b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ eq2 f9223c;

                public /* synthetic */ hs0(eq2 eq2Var, String str, int i) {
/* 1 */             this.f9221a = i;
/* 3 */             this.f9223c = eq2Var;
/* 5 */             this.f9222b = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    HSMainActivity hSMainActivity;
                    String string;
/* 1 */             int i = this.f9221a;
/* 3 */             String str = this.f9222b;
/* 5 */             eq2 eq2Var = this.f9223c;
                    switch (i) {
                        case 0:
/* 244 */                   ls0 ls0Var = (ls0) ((WeakReference) eq2Var.f7838i).get();
/* 246 */                   if (ls0Var != null && (hSMainActivity = ls0Var.f13484w) != null) {
/* 252 */                       hSMainActivity.m2538e(str);
                                break;
                            }
                            break;
                        case 1:
/* 152 */                   er0 er0Var = (er0) ((C1773iy) eq2Var.f7833b).f11955a;
/* 158 */                   if (!b40.m1232p(str) && b40.m1236t(str)) {
                                try {
/* 171 */                           String strM3589r = ((er0) er0Var.f7853b).m3589r("local_storage_data");
/* 179 */                           if (!b40.m1234r(strM3589r)) {
/* 223 */                               er0Var.m3595y("local_storage_data", str);
                                    } else {
/* 183 */                               JSONObject jSONObject = new JSONObject(str);
/* 188 */                               JSONObject jSONObject2 = new JSONObject(strM3589r);
/* 191 */                               Iterator<String> itKeys = jSONObject.keys();
/* 199 */                               while (itKeys.hasNext()) {
/* 201 */                                   String next = itKeys.next();
/* 211 */                                   jSONObject2.put(next, jSONObject.get(next));
                                        }
/* 219 */                               er0Var.m3595y("local_storage_data", jSONObject2.toString());
                                    }
                                } catch (JSONException e) {
/* 232 */                           xe2.m9777o("ConfigMangr", "error in storing local storage data", e);
/* 235 */                           return;
                                }
                                break;
                            }
                            break;
                        default:
/* 10 */                    String string2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 32 */                    er0 er0Var2 = (er0) ((ts0) eq2Var.f7836e).f17248a;
/* 38 */                    if (!b40.m1232p(str) && b40.m1236t(str)) {
                                try {
/* 49 */                            JSONObject jSONObject3 = new JSONObject(str);
                                    try {
/* 52 */                                string = jSONObject3.getString("polling_route");
                                    } catch (JSONException e2) {
/* 62 */                                xe2.m9777o("genricDataMngr", "Error in reading the json value for key ".concat("polling_route"), e2);
/* 65 */                                string = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 70 */                            if (b40.m1234r(string)) {
/* 72 */                                er0Var2.m3595y("polling_route", string);
                                    }
                                    try {
/* 75 */                                string2 = jSONObject3.getString("push_token_sync_route");
                                    } catch (JSONException e3) {
/* 85 */                                xe2.m9777o("genricDataMngr", "Error in reading the json value for key ".concat("push_token_sync_route"), e3);
                                    }
/* 92 */                            if (b40.m1234r(string2)) {
/* 94 */                                er0Var2.m3595y("push_token_sync_route", string2);
                                    }
/* 97 */                            JSONObject jSONObjectM8886f = ts0.m8886f("network_headers", jSONObject3);
/* 101 */                           if (jSONObjectM8886f != null) {
/* 107 */                               er0Var2.m3595y("network_headers", jSONObjectM8886f.toString());
                                    }
/* 110 */                           JSONObject jSONObjectM8886f2 = ts0.m8886f("notification_content", jSONObject3);
/* 114 */                           if (jSONObjectM8886f2 != null) {
/* 120 */                               er0Var2.m3595y("notification_content", jSONObjectM8886f2.toString());
                                    }
/* 123 */                           JSONObject jSONObjectM8886f3 = ts0.m8886f("user_data_key_mapping", jSONObject3);
/* 127 */                           if (jSONObjectM8886f3 != null) {
/* 133 */                               er0Var2.m3595y("user_data_key_mapping", jSONObjectM8886f3.toString());
                                    }
                                } catch (Exception e4) {
/* 140 */                           xe2.m9777o("genricDataMngr", "Unable to parse the generic sdk data", e4);
                                }
                                break;
                            }
                            break;
                    }
                }
            }
