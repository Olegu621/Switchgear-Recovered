            package com.google.android.recaptcha.internal;

            import java.util.Set;
            import java.util.logging.Level;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 19 */    public final class zzob implements zznu {
                private final String zza;
                private final Level zzb;
                private final Set zzc;
                private final zznl zzd;
                private final int zze;

                private zzob() {
/* 17 */            this(HttpUrl.FRAGMENT_ENCODE_SET, true, 2, Level.ALL, false, zzoe.zzb, zzoe.zzc);
                }

                @Override // com.google.android.recaptcha.internal.zznu
                public final zznb zza(String str) {
/* 15 */            return new zzoe(this.zza, str, true, 2, this.zzb, this.zzc, this.zzd, null);
                }

                public final zzob zzb(boolean z) {
/* 3 */             Set set = this.zzc;
/* 5 */             zznl zznlVar = this.zzd;
/* 14 */            return new zzob(this.zza, true, 2, Level.OFF, false, set, zznlVar);
                }

/* 20 */        private zzob(String str, boolean z, int i, Level level, boolean z2, Set set, zznl zznlVar) {
                    this.zza = HttpUrl.FRAGMENT_ENCODE_SET;
                    this.zze = 2;
                    this.zzb = level;
                    this.zzc = set;
                    this.zzd = zznlVar;
                }
            }
