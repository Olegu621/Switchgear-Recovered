            package com.google.android.gms.internal.play_billing;

            import java.io.Serializable;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zzce implements Comparable, Serializable {
                final Comparable zza = HttpUrl.FRAGMENT_ENCODE_SET;

                public zzce(Comparable comparable) {
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof zzce) {
                        try {
/* 12 */                    if (compareTo((zzce) obj) == 0) {
/* 14 */                        return true;
                            }
                        } catch (ClassCastException unused) {
                        }
                    }
/* 3 */             return false;
                }

                public abstract int hashCode();

                @Override // java.lang.Comparable
                /* JADX INFO: renamed from: zza */
                public int compareTo(zzce zzceVar) {
/* 5 */             if (zzceVar == zzcd.zzb) {
/* 37 */                return 1;
                    }
/* 11 */            if (zzceVar == zzcb.zzb) {
/* 13 */                return -1;
                    }
/* 15 */            Comparable comparable = zzceVar.zza;
/* 17 */            int i = zzdh.zzc;
/* 21 */            int iCompareTo = HttpUrl.FRAGMENT_ENCODE_SET.compareTo(HttpUrl.FRAGMENT_ENCODE_SET);
                    return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof zzcc, zzceVar instanceof zzcc);
                }

                public abstract void zzc(StringBuilder sb);

                public abstract void zzd(StringBuilder sb);
            }
