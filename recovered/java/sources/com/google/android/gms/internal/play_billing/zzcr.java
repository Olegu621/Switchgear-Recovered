            package com.google.android.gms.internal.play_billing;

            import java.io.Serializable;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzcr implements Map, Serializable {
                private transient zzcv zza;
                private transient zzcv zzb;
                private transient zzcj zzc;

                public static zzcr zzc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
/* 3 */             zzbw.zzb("com.android.vending.billing.PURCHASES_UPDATED", obj2);
/* 8 */             zzbw.zzb("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
/* 13 */            zzbw.zzb("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
/* 22 */            return zzdp.zzg(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
                }

                @Override // java.util.Map
                @Deprecated
                public final void clear() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.Map
                public final boolean containsKey(Object obj) {
                    return get(obj) != null;
                }

                @Override // java.util.Map
                public final boolean containsValue(Object obj) {
/* 5 */             return values().contains(obj);
                }

                @Override // java.util.Map
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof Map) {
/* 21 */                return entrySet().equals(((Map) obj).entrySet());
                    }
/* 9 */             return false;
                }

                @Override // java.util.Map
                public abstract Object get(Object obj);

                @Override // java.util.Map
                public final Object getOrDefault(Object obj, Object obj2) {
/* 1 */             Object obj3 = get(obj);
                    return obj3 != null ? obj3 : obj2;
                }

                @Override // java.util.Map
                public final int hashCode() {
/* 5 */             return zzds.zza(entrySet());
                }

                @Override // java.util.Map
                public final boolean isEmpty() {
                    return size() == 0;
                }

                @Override // java.util.Map
                public final /* bridge */ /* synthetic */ Set keySet() {
/* 1 */             zzcv zzcvVar = this.zzb;
/* 3 */             if (zzcvVar != null) {
/* 11 */                return zzcvVar;
                    }
/* 5 */             zzcv zzcvVarZze = zze();
/* 9 */             this.zzb = zzcvVarZze;
/* 11 */            return zzcvVarZze;
                }

                @Override // java.util.Map
                @Deprecated
                public final Object put(Object obj, Object obj2) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.Map
                @Deprecated
                public final void putAll(Map map) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.Map
                @Deprecated
                public final Object remove(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                public final String toString() {
/* 1 */             int size = size();
/* 7 */             zzbw.zza(size, "size");
/* 24 */            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
/* 29 */            sb.append('{');
/* 40 */            boolean z = true;
/* 45 */            for (Map.Entry entry : entrySet()) {
/* 53 */                if (!z) {
/* 57 */                    sb.append(", ");
                        }
/* 64 */                sb.append(entry.getKey());
/* 69 */                sb.append('=');
/* 76 */                sb.append(entry.getValue());
/* 79 */                z = false;
                    }
/* 83 */            sb.append('}');
/* 86 */            return sb.toString();
                }

                public abstract zzcj zza();

                @Override // java.util.Map
                /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
                public final zzcj values() {
/* 1 */             zzcj zzcjVar = this.zzc;
/* 3 */             if (zzcjVar != null) {
/* 11 */                return zzcjVar;
                    }
/* 5 */             zzcj zzcjVarZza = zza();
/* 9 */             this.zzc = zzcjVarZza;
/* 11 */            return zzcjVarZza;
                }

                public abstract zzcv zzd();

                public abstract zzcv zze();

                @Override // java.util.Map
                /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
                public final zzcv entrySet() {
/* 1 */             zzcv zzcvVar = this.zza;
/* 3 */             if (zzcvVar != null) {
/* 11 */                return zzcvVar;
                    }
/* 5 */             zzcv zzcvVarZzd = zzd();
/* 9 */             this.zza = zzcvVarZzd;
/* 11 */            return zzcvVarZzd;
                }
            }
