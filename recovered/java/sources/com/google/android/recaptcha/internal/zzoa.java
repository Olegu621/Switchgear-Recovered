            package com.google.android.recaptcha.internal;

            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzoa extends zzof {
                private static final zzoa zza = new zzoa(zzof.zze());
                private final AtomicReference zzb;

                public zzoa(zzof zzofVar) {
/* 9 */             this.zzb = new AtomicReference(zzofVar);
                }

                public static final zzoa zzb() {
/* 1 */             return zza;
                }

                @Override // com.google.android.recaptcha.internal.zzof
                public final zznd zza() {
/* 9 */             return ((zzof) this.zzb.get()).zza();
                }

                @Override // com.google.android.recaptcha.internal.zzof
                public final zzor zzc() {
/* 9 */             return ((zzof) this.zzb.get()).zzc();
                }

                @Override // com.google.android.recaptcha.internal.zzof
                public final boolean zzd(String str, Level level, boolean z) {
/* 9 */             ((zzof) this.zzb.get()).zzd(str, level, z);
/* 12 */            return false;
                }
            }
