            package com.google.android.recaptcha.internal;

            import android.content.Context;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzkz implements zzlb {
                private final Context zza;

                public zzkz(Context context) {
/* 4 */             this.zza = context;
                }

                @Override // com.google.android.recaptcha.internal.zzlb
                /* JADX INFO: renamed from: cs */
                public final /* synthetic */ Object mo2512cs(Object[] objArr) {
/* 1 */             return zzla.zza(this, objArr);
                }

                @Override // com.google.android.recaptcha.internal.zzlb
                public final Object zza(Object... objArr) {
/* 6 */             return this.zza.getSharedPreferences("_GRECAPTCHA", 0);
                }
            }
