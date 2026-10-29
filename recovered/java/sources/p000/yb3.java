            package p000;

            import android.app.Activity;
            import android.content.ActivityNotFoundException;
            import android.content.DialogInterface;
            import android.content.Intent;
            import android.os.Build;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class yb3 implements DialogInterface.OnClickListener {
                /* JADX INFO: renamed from: b */
                public static yb3 m10140b(Activity activity, Intent intent, int i) {
/* 3 */             return new ob3(activity, intent, i);
                }

                /* JADX INFO: renamed from: c */
                public static yb3 m10141c(e71 e71Var, Intent intent, int i) {
/* 3 */             return new vb3(intent, e71Var);
                }

                /* JADX INFO: renamed from: a */
                public abstract void mo7130a();

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    try {
                        try {
/* 1 */                     mo7130a();
                        } catch (ActivityNotFoundException e) {
/* 26 */                    AbstractC1245n0.m4877e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
                        }
                    } finally {
/* 33 */                dialogInterface.dismiss();
                    }
                }
            }
