            package p000;

            import android.content.res.Resources;
            import android.os.Build;
            import android.os.SystemClock;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: renamed from: gx */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0970gx {

                /* JADX INFO: renamed from: a */
                public static final AtomicInteger f8835a = new AtomicInteger((int) SystemClock.elapsedRealtime());

                /* JADX INFO: renamed from: a */
                public static boolean m4038a(Resources resources, int i) {
/* 9 */             if (Build.VERSION.SDK_INT != 26) {
/* 40 */                return true;
                    }
                    try {
/* 22 */                if (!AbstractC2053p0.m7283x(resources.getDrawable(i, null))) {
/* 40 */                    return true;
                        }
/* 36 */                AbstractC1245n0.m4876d("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
/* 13 */                return false;
                    } catch (Resources.NotFoundException unused) {
/* 61 */                AbstractC1245n0.m4876d("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
/* 13 */                return false;
                    }
                }
            }
