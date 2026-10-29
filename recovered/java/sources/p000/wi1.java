            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wi1 {

                /* JADX INFO: renamed from: f */
                public static final AtomicBoolean f18647f = new AtomicBoolean(false);

                /* JADX INFO: renamed from: a */
                public final SharedPreferences f18648a;

                /* JADX INFO: renamed from: b */
                public final ec0 f18649b;

                /* JADX INFO: renamed from: c */
                public final er0 f18650c;

                /* JADX INFO: renamed from: d */
                public final C0210cb f18651d;

                /* JADX INFO: renamed from: e */
                public final ra2 f18652e;

                public wi1(Context context, ec0 ec0Var, er0 er0Var, C0210cb c0210cb, ra2 ra2Var) {
/* 11 */            this.f18648a = context.getSharedPreferences("__hs_migration_prefs", 0);
/* 13 */            this.f18649b = ec0Var;
/* 15 */            this.f18650c = er0Var;
/* 17 */            this.f18651d = c0210cb;
/* 19 */            this.f18652e = ra2Var;
                }

                /* JADX INFO: renamed from: a */
                public static String m9581a(wi1 wi1Var) {
/* 5 */             StringBuilder sb = new StringBuilder("https://api.");
/* 8 */             er0 er0Var = wi1Var.f18650c;
/* 20 */            sb.append(((er0) er0Var.f7853b).m3589r(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST));
/* 25 */            sb.append("/events/v1/");
/* 38 */            sb.append(((er0) er0Var.f7853b).m3589r("domain"));
/* 43 */            sb.append("/sdkx/crash-log");
/* 46 */            return sb.toString();
                }
            }
