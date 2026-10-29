            package com.google.android.recaptcha.internal;

            import androidx.core.app.NotificationCompat;
            import java.io.IOException;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzpp {
                private static final zzpp zza = new zzpm("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
                private static final zzpp zzb = new zzpm("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

                static {
/* 35 */            new zzpo("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
/* 44 */            new zzpo("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
/* 47 */            int i = zzpl.zza;
/* 60 */            zzpk zzpkVar = new zzpk("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'});
/* 66 */            new zzpo(zzpkVar, null);
/* 71 */            char[] cArr = new char[NotificationCompat.FLAG_GROUP_SUMMARY];
/* 84 */            zzmd.zza(zzpkVar.zzf.length == 16);
/* 89 */            for (int i2 = 0; i2 < 256; i2++) {
/* 97 */                cArr[i2] = zzpkVar.zza(i2 >>> 4);
/* 107 */               cArr[i2 | NotificationCompat.FLAG_LOCAL_ONLY] = zzpkVar.zza(i2 & 15);
                    }
                }

                public static zzpp zzg() {
/* 1 */             return zza;
                }

                public static zzpp zzh() {
/* 1 */             return zzb;
                }

                public abstract int zza(byte[] bArr, CharSequence charSequence) throws zzpn;

                public abstract void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

                public abstract int zzc(int i);

                public abstract int zzd(int i);

                public CharSequence zze(CharSequence charSequence) {
/* 2 */             throw null;
                }

                public final String zzi(byte[] bArr, int i, int i2) {
/* 3 */             zzmd.zzd(0, i2, bArr.length);
/* 12 */            StringBuilder sb = new StringBuilder(zzd(i2));
                    try {
/* 15 */                zzb(sb, bArr, 0, i2);
/* 18 */                return sb.toString();
                    } catch (IOException e) {
/* 24 */                C1951n4.m6856g(e);
/* 27 */                return null;
                    }
                }

                public final byte[] zzj(CharSequence charSequence) {
                    try {
/* 1 */                 CharSequence charSequenceZze = zze(charSequence);
/* 9 */                 int iZzc = zzc(charSequenceZze.length());
/* 13 */                byte[] bArr = new byte[iZzc];
/* 15 */                int iZza = zza(bArr, charSequenceZze);
/* 19 */                if (iZza == iZzc) {
/* 21 */                    return bArr;
                        }
/* 22 */                byte[] bArr2 = new byte[iZza];
/* 25 */                System.arraycopy(bArr, 0, bArr2, 0, iZza);
/* 28 */                return bArr2;
                    } catch (zzpn e) {
/* 30 */                C1951n4.m6863n(e);
/* 33 */                return null;
                    }
                }
            }
