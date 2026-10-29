            package com.google.android.recaptcha.internal;

            import java.util.Comparator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzok implements Comparator {
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
/* 1 */             zzoq zzoqVarZza = zzoq.zza(obj);
/* 5 */             zzoq zzoqVarZza2 = zzoq.zza(obj2);
/* 9 */             if (zzoqVarZza != zzoqVarZza2) {
/* 64 */                return zzoqVarZza.compareTo(zzoqVarZza2);
                    }
/* 11 */            int iOrdinal = zzoqVarZza.ordinal();
/* 15 */            if (iOrdinal == 0) {
/* 59 */                return ((Boolean) obj).compareTo((Boolean) obj2);
                    }
/* 18 */            if (iOrdinal == 1) {
/* 50 */                return ((String) obj).compareTo((String) obj2);
                    }
/* 21 */            if (iOrdinal == 2) {
/* 41 */                return ((Long) obj).compareTo((Long) obj2);
                    }
/* 24 */            if (iOrdinal == 3) {
/* 30 */                return ((Double) obj).compareTo((Double) obj2);
                    }
/* 36 */            throw null;
                }
            }
