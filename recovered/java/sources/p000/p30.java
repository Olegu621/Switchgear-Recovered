            package p000;

            import android.app.NotificationChannel;
            import android.view.autofill.AutofillManager;
            import android.view.autofill.AutofillValue;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract /* synthetic */ class p30 {
                /* JADX INFO: renamed from: a */
                public static /* synthetic */ NotificationChannel m7295a() {
/* 6 */             return new NotificationChannel("In-app Support", "In-app Support", 3);
                }

                /* JADX INFO: renamed from: c */
                public static /* synthetic */ NotificationChannel m7297c(String str) {
/* 6 */             return new NotificationChannel("com.google.android.gms.availability", str, 4);
                }

                /* JADX INFO: renamed from: g */
                public static /* bridge */ /* synthetic */ AutofillManager m7301g(Object obj) {
/* 1 */             return (AutofillManager) obj;
                }

                /* JADX INFO: renamed from: i */
                public static /* bridge */ /* synthetic */ AutofillValue m7303i(Object obj) {
/* 1 */             return (AutofillValue) obj;
                }
            }
