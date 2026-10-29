            package com.google.android.recaptcha.internal;

            import p000.AbstractC0886en;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzqh extends zzqk {
                private final int zzc;

                public zzqh(byte[] bArr, int i, int i2) {
/* 1 */             super(bArr);
/* 6 */             zzqm.zzj(0, i2, bArr.length);
/* 9 */             this.zzc = i2;
                }

                @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
                public final byte zza(int i) {
/* 1 */             int i2 = this.zzc;
/* 8 */             if (((i2 - (i + 1)) | i) >= 0) {
/* 38 */                return ((zzqk) this).zza[i];
                    }
/* 12 */            if (i < 0) {
/* 23 */                throw new ArrayIndexOutOfBoundsException(fm0.m3781g(i, "Index < 0: "));
                    }
/* 35 */            throw new ArrayIndexOutOfBoundsException(AbstractC0886en.m3506j("Index > length: ", i, i2, ", "));
                }

                @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
                public final byte zzb(int i) {
/* 3 */             return ((zzqk) this).zza[i];
                }

                @Override // com.google.android.recaptcha.internal.zzqk
                public final int zzc() {
/* 1 */             return 0;
                }

                @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
                public final int zzd() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
                public final void zze(byte[] bArr, int i, int i2, int i3) {
/* 4 */             System.arraycopy(((zzqk) this).zza, 0, bArr, 0, i3);
                }
            }
