            package com.google.android.gms.internal.play_billing;

            import java.util.Map;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzjb implements Map.Entry, Comparable {
                final /* synthetic */ zzjf zza;
                private final Comparable zzb;
                private Object zzc;

                public zzjb(zzjf zzjfVar, Comparable comparable, Object obj) {
/* 1 */             this.zza = zzjfVar;
/* 6 */             this.zzb = comparable;
/* 8 */             this.zzc = obj;
                }

                private static final boolean zzb(Object obj, Object obj2) {
/* 1 */             if (obj == null) {
                        return obj2 == null;
                    }
/* 9 */             return obj.equals(obj2);
                }

                @Override // java.lang.Comparable
                public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
/* 7 */             return this.zzb.compareTo(((zzjb) obj).zzb);
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
/* 1 */             this.zza.zzo();
/* 6 */             Object obj2 = this.zzc;
/* 8 */             this.zzc = obj;
/* 10 */            return obj2;
                }

                public final String toString() {
/* 15 */            return AbstractC0886en.m3508l(String.valueOf(this.zzb), "=", String.valueOf(this.zzc));
                }

                public final Comparable zza() {
/* 1 */             return this.zzb;
                }
            }
