            package p000;

            import android.content.Context;
            import android.content.Intent;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.helpshift.activities.HSMainActivity;
            import com.supercell.titan.GameApp;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gu0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8817a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ HashMap f8818b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ rs0 f8819c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Context f8820d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ String f8821e;

                public /* synthetic */ gu0(HashMap map, rs0 rs0Var, GameApp gameApp, String str, int i) {
/* 1 */             this.f8817a = i;
/* 3 */             this.f8818b = map;
/* 5 */             this.f8819c = rs0Var;
/* 7 */             this.f8820d = gameApp;
/* 9 */             this.f8821e = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f8817a;
/* 7 */             String str = this.f8821e;
/* 17 */            Context context = this.f8820d;
/* 19 */            rs0 rs0Var = this.f8819c;
/* 23 */            HashMap map = this.f8818b;
                    switch (i) {
                        case 0:
/* 71 */                    map.put("enableLogging", Boolean.valueOf(rs0Var.f16259d));
/* 74 */                    hu0.m4313G(map);
/* 79 */                    Intent intent = new Intent(context, (Class<?>) HSMainActivity.class);
/* 82 */                    intent.putExtra("SERVICE_MODE", "HELP_CENTER_SERVICE_FLAG");
/* 87 */                    intent.putExtra("HELPCENTER_MODE", "FAQ_SECTION");
/* 92 */                    intent.putExtra("FAQ_SECTION_ID", str);
/* 95 */                    intent.putExtra(FirebaseAnalytics.Param.SOURCE, "api");
/* 98 */                    context.startActivity(intent);
                            break;
                        default:
/* 34 */                    map.put("enableLogging", Boolean.valueOf(rs0Var.f16259d));
/* 37 */                    hu0.m4313G(map);
/* 42 */                    Intent intent2 = new Intent(context, (Class<?>) HSMainActivity.class);
/* 45 */                    intent2.putExtra("SERVICE_MODE", "HELP_CENTER_SERVICE_FLAG");
/* 50 */                    intent2.putExtra("HELPCENTER_MODE", "SINGLE_FAQ");
/* 55 */                    intent2.putExtra("SINGLE_FAQ_PUBLISH_ID", str);
/* 58 */                    intent2.putExtra(FirebaseAnalytics.Param.SOURCE, "api");
/* 61 */                    context.startActivity(intent2);
                            break;
                    }
                }
            }
