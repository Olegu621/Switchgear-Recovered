            package com.google.android.gms.internal.play_billing;

            import java.util.Comparator;
            import java.util.SortedSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdv {
                public static boolean zza(Comparator comparator, Iterable iterable) {
                    Comparator comparator2;
/* 1 */             comparator.getClass();
/* 4 */             iterable.getClass();
/* 9 */             if (iterable instanceof SortedSet) {
/* 13 */                comparator2 = ((SortedSet) iterable).comparator();
/* 17 */                if (comparator2 == null) {
/* 19 */                    comparator2 = zzdc.zza;
                        }
                    } else {
/* 24 */                if (!(iterable instanceof zzdu)) {
/* 37 */                    return false;
                        }
/* 28 */                comparator2 = ((zzdu) iterable).comparator();
                    }
/* 32 */            return comparator.equals(comparator2);
                }
            }
