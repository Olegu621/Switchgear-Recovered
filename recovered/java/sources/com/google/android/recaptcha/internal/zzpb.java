            package com.google.android.recaptcha.internal;

            import java.io.Serializable;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzpb extends zzpc implements Serializable {
                final byte[] zza;

                public zzpb(byte[] bArr) {
/* 4 */             bArr.getClass();
/* 7 */             this.zza = bArr;
                }

                @Override // com.google.android.recaptcha.internal.zzpc
                public final int zza() {
/* 1 */             byte[] bArr = this.zza;
/* 3 */             int length = bArr.length;
/* 6 */             if (length < 4) {
/* 51 */                f42.m3656l(zzmg.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
/* 5 */                 return 0;
                    }
/* 10 */            int i = bArr[0] & 255;
/* 15 */            int i2 = bArr[1] & 255;
/* 20 */            int i3 = bArr[2] & 255;
/* 35 */            return ((bArr[3] & 255) << 24) | i | (i2 << 8) | (i3 << 16);
                }

                @Override // com.google.android.recaptcha.internal.zzpc
                public final int zzb() {
/* 4 */             return this.zza.length * 8;
                }

                @Override // com.google.android.recaptcha.internal.zzpc
                public final boolean zzc(zzpc zzpcVar) {
/* 5 */             int length = zzpcVar.zze().length;
/* 6 */             byte[] bArr = this.zza;
/* 10 */            if (bArr.length != length) {
/* 9 */                 return false;
                    }
/* 13 */            boolean z = true;
/* 16 */            for (int i = 0; i < bArr.length; i++) {
/* 31 */                z &= bArr[i] == zzpcVar.zze()[i];
                    }
/* 35 */            return z;
                }

                @Override // com.google.android.recaptcha.internal.zzpc
                public final byte[] zzd() {
/* 7 */             return (byte[]) this.zza.clone();
                }

                @Override // com.google.android.recaptcha.internal.zzpc
                public final byte[] zze() {
/* 1 */             return this.zza;
                }
            }
