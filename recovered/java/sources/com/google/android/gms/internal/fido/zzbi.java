            package com.google.android.gms.internal.fido;

            import androidx.core.app.NotificationCompat;
            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbi extends zzbk {
                final char[] zza;

                public zzbi(String str, String str2) {
/* 12 */            zzbh zzbhVar = new zzbh("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'});
/* 16 */            super(zzbhVar, null);
/* 23 */            this.zza = new char[NotificationCompat.FLAG_GROUP_SUMMARY];
/* 36 */            zzas.zzc(zzbhVar.zzf.length == 16);
/* 41 */            for (int i = 0; i < 256; i++) {
/* 51 */                this.zza[i] = zzbhVar.zza(i >>> 4);
/* 63 */                this.zza[i | NotificationCompat.FLAG_LOCAL_ONLY] = zzbhVar.zza(i & 15);
                    }
                }

                @Override // com.google.android.gms.internal.fido.zzbk, com.google.android.gms.internal.fido.zzbl
                public final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
/* 3 */             zzas.zze(0, i2, bArr.length);
/* 6 */             for (int i3 = 0; i3 < i2; i3++) {
/* 10 */                int i4 = bArr[i3] & 255;
/* 16 */                appendable.append(this.zza[i4]);
/* 25 */                appendable.append(this.zza[i4 | NotificationCompat.FLAG_LOCAL_ONLY]);
                    }
                }
            }
