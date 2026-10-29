            package p000;

            import android.content.Context;
            import android.content.Intent;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.helpshift.activities.HSMainActivity;
            import com.supercell.titan.GameApp;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fu0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8353a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ HashMap f8354b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ rs0 f8355c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Context f8356d;

                public /* synthetic */ fu0(HashMap map, rs0 rs0Var, GameApp gameApp, int i) {
/* 1 */             this.f8353a = i;
/* 3 */             this.f8354b = map;
/* 5 */             this.f8355c = rs0Var;
/* 7 */             this.f8356d = gameApp;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f8353a;
/* 11 */            Context context = this.f8356d;
/* 13 */            rs0 rs0Var = this.f8355c;
/* 17 */            HashMap map = this.f8354b;
                    switch (i) {
                        case 0:
/* 64 */                    map.put("enableLogging", Boolean.valueOf(rs0Var.f16259d));
/* 67 */                    hu0.m4313G(map);
/* 72 */                    Intent intent = new Intent(context, (Class<?>) HSMainActivity.class);
/* 77 */                    intent.putExtra("SERVICE_MODE", "WEBCHAT_SERVICE_FLAG");
/* 80 */                    intent.putExtra(FirebaseAnalytics.Param.SOURCE, "api");
/* 83 */                    context.startActivity(intent);
                            break;
                        default:
/* 28 */                    map.put("enableLogging", Boolean.valueOf(rs0Var.f16259d));
/* 31 */                    hu0.m4313G(map);
/* 36 */                    Intent intent2 = new Intent(context, (Class<?>) HSMainActivity.class);
/* 41 */                    intent2.putExtra("SERVICE_MODE", "HELP_CENTER_SERVICE_FLAG");
/* 48 */                    intent2.putExtra("HELPCENTER_MODE", "APP_MAIN_PAGE");
/* 51 */                    intent2.putExtra(FirebaseAnalytics.Param.SOURCE, "api");
/* 54 */                    context.startActivity(intent2);
                            break;
                    }
                }
            }
