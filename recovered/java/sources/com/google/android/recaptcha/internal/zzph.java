            package com.google.android.recaptcha.internal;

            import java.security.MessageDigest;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzph extends zzoy {
                private final MessageDigest zza;
                private final int zzb;
                private boolean zzc;

                public /* synthetic */ zzph(MessageDigest messageDigest, int i, zzpi zzpiVar) {
/* 4 */             this.zza = messageDigest;
/* 6 */             this.zzb = i;
                }

                private final void zzc() {
/* 7 */             zzmd.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
                }

                @Override // com.google.android.recaptcha.internal.zzoy
                public final void zza(byte[] bArr, int i, int i2) {
/* 1 */             zzc();
/* 7 */             this.zza.update(bArr, 0, i2);
                }

                @Override // com.google.android.recaptcha.internal.zzpe
                public final zzpc zzb() {
/* 1 */             zzc();
/* 5 */             this.zzc = true;
/* 7 */             int i = this.zzb;
/* 9 */             MessageDigest messageDigest = this.zza;
                    return i == messageDigest.getDigestLength() ? new zzpb(messageDigest.digest()) : new zzpb(Arrays.copyOf(messageDigest.digest(), i));
                }
            }
