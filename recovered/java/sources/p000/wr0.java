            package p000;

            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageInstaller;
            import android.content.pm.PackageManager;
            import android.os.Build;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Iterator;
            import java.util.concurrent.atomic.AtomicBoolean;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class wr0 {

                /* JADX INFO: renamed from: b */
                public static boolean f18784b;

                /* JADX INFO: renamed from: c */
                public static boolean f18785c;

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ int f18787e = 0;

                /* JADX INFO: renamed from: a */
                public static final AtomicBoolean f18783a = new AtomicBoolean();

                /* JADX INFO: renamed from: d */
                public static final AtomicBoolean f18786d = new AtomicBoolean();

                /* JADX INFO: renamed from: a */
                public static boolean m9606a(Context context) {
                    try {
/* 5 */                 if (!f18785c) {
/* 25 */                    PackageInfo packageInfoM9214c = g93.m3898a(context).m9214c(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
/* 29 */                    as0.m1153b(context);
/* 32 */                    if (packageInfoM9214c == null || as0.m1154e(packageInfoM9214c, false) || !as0.m1154e(packageInfoM9214c, true)) {
/* 53 */                        f18784b = false;
                            } else {
/* 46 */                        f18784b = true;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
/* 62 */                AbstractC1245n0.m4891s("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                    } finally {
/* 68 */                f18785c = true;
                    }
                    return f18784b || !"user".equals(Build.TYPE);
                }

                /* JADX INFO: renamed from: b */
                public static boolean m9607b(Context context) {
                    try {
/* 13 */                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
/* 23 */                while (it.hasNext()) {
/* 39 */                    if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
/* 41 */                        return true;
                            }
                        }
/* 53 */                return context.getPackageManager().getApplicationInfo("com.google.android.gms", Segment.SIZE).enabled;
                    } catch (PackageManager.NameNotFoundException | Exception unused) {
/* 56 */                return false;
                    }
                }
            }
