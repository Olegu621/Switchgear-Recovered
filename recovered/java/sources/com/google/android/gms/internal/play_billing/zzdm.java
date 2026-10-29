            package com.google.android.gms.internal.play_billing;

            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdm extends zzcv {
                private final transient zzcr zza;
                private final transient Object[] zzb;
                private final transient int zzc;

                public zzdm(zzcr zzcrVar, Object[] objArr, int i, int i2) {
/* 4 */             this.zza = zzcrVar;
/* 6 */             this.zzb = objArr;
/* 8 */             this.zzc = i2;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
                public final boolean contains(Object obj) {
/* 4 */             if (obj instanceof Map.Entry) {
/* 6 */                 Map.Entry entry = (Map.Entry) obj;
/* 8 */                 Object key = entry.getKey();
/* 12 */                Object value = entry.getValue();
/* 16 */                if (value != null && value.equals(this.zza.get(key))) {
/* 30 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final /* synthetic */ Iterator iterator() {
/* 6 */             return zzd().listIterator(0);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final int zza(Object[] objArr, int i) {
/* 6 */             return zzd().zza(objArr, 0);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
                /* JADX INFO: renamed from: zze */
                public final zzdw iterator() {
/* 6 */             return zzd().listIterator(0);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final boolean zzf() {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv
                public final zzco zzi() {
/* 3 */             return new zzdl(this);
                }
            }
