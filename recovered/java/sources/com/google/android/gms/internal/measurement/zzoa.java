            package com.google.android.gms.internal.measurement;

            import java.util.Map;
            import java.util.Objects;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzoa implements Map.Entry, Comparable {
                final /* synthetic */ zzod zza;
                private final Comparable zzb;
                private Object zzc;

                public zzoa(zzod zzodVar, Comparable comparable, Object obj) {
/* 1 */             Objects.requireNonNull(zzodVar);
/* 4 */             this.zza = zzodVar;
/* 9 */             this.zzb = comparable;
/* 11 */            this.zzc = obj;
                }

                private static final boolean zzb(Object obj, Object obj2) {
/* 1 */             if (obj == null) {
                        return obj2 == null;
                    }
/* 9 */             return obj.equals(obj2);
                }

                @Override // java.lang.Comparable
                public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
/* 7 */             return this.zzb.compareTo(((zzoa) obj).zzb);
                }

                @Override // java.util.Map.Entry
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Map.Entry)) {
/* 7 */                 return false;
                    }
/* 11 */            Map.Entry entry = (Map.Entry) obj;
                    return zzb(this.zzb, entry.getKey()) && zzb(this.zzc, entry.getValue());
                }

                @Override // java.util.Map.Entry
                public final /* synthetic */ Object getKey() {
/* 1 */             return this.zzb;
                }

                @Override // java.util.Map.Entry
                public final Object getValue() {
/* 1 */             return this.zzc;
                }

                @Override // java.util.Map.Entry
                public final int hashCode() {
/* 1 */             Comparable comparable = this.zzb;
/* 8 */             int iHashCode = comparable == null ? 0 : comparable.hashCode();
/* 12 */            Object obj = this.zzc;
/* 21 */            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
                }

                @Override // java.util.Map.Entry
                public final Object setValue(Object obj) {
/* 3 */             this.zza.zzh();
/* 6 */             Object obj2 = this.zzc;
/* 8 */             this.zzc = obj;
/* 10 */            return obj2;
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.zzb);
/* 9 */             String strValueOf2 = String.valueOf(this.zzc);
/* 31 */            return fm0.m3790p(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
                }

                public final Comparable zza() {
/* 1 */             return this.zzb;
                }
            }
