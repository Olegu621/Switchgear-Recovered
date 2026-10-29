            package p000;

            import android.content.Context;
            import com.google.android.gms.internal.playcore_age_signals.zzd;
            import com.google.android.gms.internal.playcore_age_signals.zzo;
            import com.google.android.gms.internal.playcore_age_signals.zzr;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xg3 {

                /* JADX INFO: renamed from: c */
                public static final zzd f19088c = new zzd("AgeSignalsService");

                /* JADX INFO: renamed from: a */
                public final Context f19089a;

                /* JADX INFO: renamed from: b */
                public final zzo f19090b;

                public xg3(Context context) {
/* 4 */             this.f19089a = context;
/* 10 */            if (!zzr.zzb(context)) {
/* 34 */                this.f19090b = null;
/* 36 */                return;
                    }
/* 30 */            this.f19090b = new zzo(context, f19088c, "AgeSignalsService", wc3.f18583a, new pf3(), null);
                }
            }
