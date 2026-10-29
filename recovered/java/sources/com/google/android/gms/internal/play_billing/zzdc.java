            package com.google.android.gms.internal.play_billing;

            import java.io.Serializable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdc extends zzde implements Serializable {
                static final zzdc zza = new zzdc();

                private zzdc() {
                }

                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
/* 1 */             Comparable comparable = (Comparable) obj;
/* 3 */             Comparable comparable2 = (Comparable) obj2;
/* 5 */             comparable.getClass();
/* 8 */             comparable2.getClass();
/* 11 */            return comparable.compareTo(comparable2);
                }

                public final String toString() {
/* 1 */             return "Ordering.natural()";
                }
            }
