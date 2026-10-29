            package com.google.android.gms.internal.fido;

            import java.io.IOException;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzbl {
                private static final zzbl zza = new zzbj("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
                private static final zzbl zzb = new zzbj("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
                private static final zzbl zzc = new zzbk("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
                private static final zzbl zzd = new zzbk("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
                private static final zzbl zze = new zzbi("base16()", "0123456789ABCDEF");

                public static zzbl zzd() {
/* 1 */             return zze;
                }

                public abstract void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

                public abstract int zzb(int i);

                public final String zze(byte[] bArr, int i, int i2) {
/* 3 */             zzas.zze(0, i2, bArr.length);
/* 12 */            StringBuilder sb = new StringBuilder(zzb(i2));
                    try {
/* 15 */                zza(sb, bArr, 0, i2);
/* 18 */                return sb.toString();
                    } catch (IOException e) {
/* 24 */                C1951n4.m6856g(e);
/* 27 */                return null;
                    }
                }
            }
