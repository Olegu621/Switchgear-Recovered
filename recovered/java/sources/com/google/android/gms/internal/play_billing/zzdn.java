            package com.google.android.gms.internal.play_billing;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdn extends zzcv {
                private final transient zzcr zza;
                private final transient zzco zzb;

                public zzdn(zzcr zzcrVar, zzco zzcoVar) {
/* 4 */             this.zza = zzcrVar;
/* 6 */             this.zzb = zzcoVar;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
                public final boolean contains(Object obj) {
                    return this.zza.get(obj) != null;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final /* synthetic */ Iterator iterator() {
/* 4 */             return this.zzb.listIterator(0);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 3 */             return this.zza.size();
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final int zza(Object[] objArr, int i) {
/* 4 */             return this.zzb.zza(objArr, 0);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
                public final zzco zzd() {
/* 1 */             return this.zzb;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
                /* JADX INFO: renamed from: zze */
                public final zzdw iterator() {
/* 4 */             return this.zzb.listIterator(0);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final boolean zzf() {
/* 2 */             throw null;
                }
            }
