            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzpc {
                private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                public static final /* synthetic */ int zzb = 0;

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof zzpc) {
/* 6 */                 zzpc zzpcVar = (zzpc) obj;
/* 16 */                if (zzb() == zzpcVar.zzb() && zzc(zzpcVar)) {
/* 24 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 7 */             if (zzb() >= 32) {
/* 9 */                 return zza();
                    }
/* 14 */            byte[] bArrZze = zze();
/* 21 */            int i = bArrZze[0] & 255;
/* 25 */            for (int i2 = 1; i2 < bArrZze.length; i2++) {
/* 34 */                i |= (bArrZze[i2] & 255) << (i2 * 8);
                    }
/* 38 */            return i;
                }

                public final String toString() {
/* 1 */             byte[] bArrZze = zze();
/* 5 */             int length = bArrZze.length;
/* 10 */            StringBuilder sb = new StringBuilder(length + length);
/* 14 */            for (byte b : bArrZze) {
/* 20 */                char[] cArr = zza;
/* 26 */                sb.append(cArr[(b >> 4) & 15]);
/* 33 */                sb.append(cArr[b & 15]);
                    }
/* 39 */            return sb.toString();
                }

                public abstract int zza();

                public abstract int zzb();

                public abstract boolean zzc(zzpc zzpcVar);

                public abstract byte[] zzd();

                public byte[] zze() {
/* 2 */             throw null;
                }
            }
