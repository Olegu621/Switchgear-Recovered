            package p000;

            import android.app.NotificationManager;
            import android.content.Context;
            import android.content.SharedPreferences;
            import com.helpshift.activities.HSMainActivity;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.util.HashMap;
            import okhttp3.HttpUrl;
            import org.json.JSONArray;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gs0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8791a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ eq2 f8792b;

                public /* synthetic */ gs0(eq2 eq2Var, int i) {
/* 1 */             this.f8791a = i;
/* 3 */             this.f8792b = eq2Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i;
/* 1 */             int i2 = this.f8791a;
/* 9 */             eq2 eq2Var = this.f8792b;
                    switch (i2) {
                        case 0:
/* 414 */                   ls0 ls0Var = (ls0) ((WeakReference) eq2Var.f7838i).get();
/* 416 */                   if (ls0Var != null) {
/* 420 */                       xe2.m9777o("HSChatFragment", "Received onUserAuthenticationFailure event", null);
/* 425 */                       ls0Var.f13482i.setVisibility(0);
/* 430 */                       ls0Var.f13481f.setVisibility(8);
                            }
                            break;
                        case 1:
/* 370 */                   C1969nm c1969nm = (C1969nm) eq2Var.f7835d;
/* 376 */                   yy1.m10218m(c1969nm.m7005h());
/* 395 */                   ((SharedPreferences) ((er0) c1969nm.f14378f).f7853b).edit().clear().commit();
/* 402 */                   ((HashMap) c1969nm.f14380h).clear();
                            break;
                        case 2:
/* 364 */                   ((C1969nm) eq2Var.f7834c).m7011n(Boolean.TRUE, "push_token_synced");
                            break;
                        case 3:
/* 337 */                   er0 er0Var = (er0) ((C1969nm) eq2Var.f7834c).f14373a;
/* 345 */                   ((er0) er0Var.f7853b).m3596z("anon_user_id_map");
/* 352 */                   er0Var.m3595y("anon_user_data", "{}");
                            break;
                        case 4:
/* 314 */                   ls0 ls0Var2 = (ls0) ((WeakReference) eq2Var.f7838i).get();
/* 316 */                   if (ls0Var2 != null) {
/* 320 */                       xe2.m9775m("HSChatFragment", "onWebchatClosed", null);
/* 323 */                       HSMainActivity hSMainActivity = ls0Var2.f13484w;
/* 325 */                       if (hSMainActivity != null) {
/* 327 */                           hSMainActivity.onBackPressed();
                                }
                            }
                            break;
                        case 5:
/* 54 */                    ls0 ls0Var3 = (ls0) ((WeakReference) eq2Var.f7838i).get();
/* 56 */                    if (ls0Var3 != null) {
/* 60 */                        xe2.m9775m("HSChatFragment", "onWebchatLoaded", null);
/* 65 */                        ls0Var3.f13481f.setVisibility(8);
/* 70 */                        ls0Var3.f13482i.setVisibility(8);
/* 73 */                        Context context = ls0Var3.getContext();
/* 77 */                        if (context != null) {
/* 83 */                            xe2.m9775m("AppUtil", "Cancelling notification", null);
/* 86 */                            NotificationManager notificationManagerM1230n = b40.m1230n(context);
/* 90 */                            if (notificationManagerM1230n != null) {
/* 96 */                                notificationManagerM1230n.cancel("hsft_notification_tag", 121);
                                    }
                                }
/* 105 */                       rs0.f16254y.f16261f.m7011n(0, "unread_count");
/* 114 */                       rs0.f16254y.f16261f.m7011n(0, "push_unread_count");
/* 119 */                       ll1 ll1Var = rs0.f16254y.f16278w;
/* 121 */                       SharedPreferences sharedPreferences = ll1Var.f13382a;
/* 125 */                       boolean z = sharedPreferences.getBoolean("mig_log_synced_with_webchat", false);
/* 129 */                       String string = HttpUrl.FRAGMENT_ENCODE_SET;
/* 131 */                       if (!z && (i = sharedPreferences.getInt("migration_state", 0)) != 1 && i != 0) {
                                    try {
/* 148 */                               String string2 = sharedPreferences.getString("error_logs", HttpUrl.FRAGMENT_ENCODE_SET);
/* 156 */                               if (b40.m1232p(string2)) {
/* 158 */                                   string2 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                                        }
/* 162 */                               JSONArray jSONArray = new JSONArray(string2);
/* 167 */                               JSONObject jSONObject = new JSONObject();
/* 172 */                               jSONObject.put("migration_state", "FAILED");
/* 189 */                               jSONObject.put("did", ((er0) ll1Var.f13384c.f7853b).m3589r("hs_did"));
/* 194 */                               jSONObject.put("logs", jSONArray);
/* 197 */                               string = jSONObject.toString();
                                    } catch (Exception unused) {
/* 206 */                               AbstractC1245n0.m4876d("Helpshift_Migrator", "Error getting error logs for migration");
                                    }
                                }
/* 213 */                       if (b40.m1234r(string)) {
/* 234 */                           ls0Var3.m6529g("Helpshift('sdkxMigrationLog', '" + string + "' ) ", null);
                                }
/* 239 */                       ls0Var3.m6530h(ls0Var3.f13472V);
/* 252 */                       ls0Var3.m6532j(ls0Var3.getResources().getConfiguration().orientation);
/* 270 */                       ls0Var3.m6531i(rs0.f16254y.f16273r.m1567A() ? w20.ONLINE_EXTRAS_KEY : "offline");
/* 279 */                       if (b40.m1234r(ls0Var3.f13471U)) {
/* 302 */                           ls0Var3.m6529g("Helpshift('nativeLoadTime','" + ls0Var3.f13471U + "');", null);
                                }
                            }
                            break;
                        default:
/* 22 */                    ls0 ls0Var4 = (ls0) ((WeakReference) eq2Var.f7838i).get();
/* 24 */                    if (ls0Var4 != null) {
/* 28 */                        xe2.m9777o("HSChatFragment", "Received onWebchatError event", null);
/* 33 */                        ls0Var4.f13482i.setVisibility(0);
/* 38 */                        ls0Var4.f13481f.setVisibility(8);
                            }
                            break;
                    }
                }
            }
