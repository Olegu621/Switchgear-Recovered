            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import com.google.android.gms.internal.measurement.zzdd;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sk3 {

                /* JADX INFO: renamed from: a */
                public final Context f16663a;

                /* JADX INFO: renamed from: b */
                public final Boolean f16664b;

                /* JADX INFO: renamed from: c */
                public final long f16665c;

                /* JADX INFO: renamed from: d */
                public final zzdd f16666d;

                /* JADX INFO: renamed from: e */
                public final boolean f16667e;

                /* JADX INFO: renamed from: f */
                public final Long f16668f;

                /* JADX INFO: renamed from: g */
                public final String f16669g;

                public sk3(Context context, zzdd zzddVar, Long l) {
/* 5 */             this.f16667e = true;
/* 7 */             kb1.m6061n(context);
/* 10 */            Context applicationContext = context.getApplicationContext();
/* 14 */            kb1.m6061n(applicationContext);
/* 17 */            this.f16663a = applicationContext;
/* 19 */            this.f16668f = l;
/* 21 */            if (zzddVar != null) {
/* 23 */                this.f16666d = zzddVar;
/* 27 */                this.f16667e = zzddVar.zzc;
/* 31 */                this.f16665c = zzddVar.zzb;
/* 35 */                this.f16669g = zzddVar.zze;
/* 37 */                Bundle bundle = zzddVar.zzd;
/* 39 */                if (bundle != null) {
/* 51 */                    this.f16664b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
                        }
                    }
                }
            }
