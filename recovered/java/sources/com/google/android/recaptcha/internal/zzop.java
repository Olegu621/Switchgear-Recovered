            package com.google.android.recaptcha.internal;

            import java.util.AbstractMap;
            import java.util.Arrays;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzop extends AbstractMap {
                private static final Comparator zza = new zzom();
                private final Object[] zzb;
                private final int[] zzc;
                private final Set zzd = new zzoo(this, -1);
                private Integer zze = null;
                private String zzf = null;

                public zzop(List list) {
/* 17 */            Iterator it = list.iterator();
/* 25 */            if (it.hasNext()) {
/* 81 */                zzol.zza((zzol) it.next());
/* 84 */                throw null;
                    }
/* 27 */            int size = list.size();
/* 31 */            Object[] objArrCopyOf = new Object[size];
/* 33 */            Iterator it2 = list.iterator();
/* 41 */            if (it2.hasNext()) {
/* 71 */                zzol.zza((zzol) it2.next());
/* 74 */                throw null;
                    }
/* 44 */            int[] iArr = {0};
/* 50 */            if (size > 16 && size * 9 > 0) {
/* 56 */                objArrCopyOf = Arrays.copyOf(objArrCopyOf, 0);
                    }
/* 60 */            this.zzb = objArrCopyOf;
/* 62 */            this.zzc = iArr;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final Set entrySet() {
/* 1 */             return this.zzd;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final int hashCode() {
/* 3 */             if (this.zze == null) {
/* 13 */                this.zze = Integer.valueOf(super.hashCode());
                    }
/* 17 */            return this.zze.intValue();
                }

                @Override // java.util.AbstractMap
                public final String toString() {
/* 3 */             if (this.zzf == null) {
/* 9 */                 this.zzf = super.toString();
                    }
/* 11 */            return this.zzf;
                }
            }
