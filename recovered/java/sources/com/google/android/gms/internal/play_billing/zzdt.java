            package com.google.android.gms.internal.play_billing;

            import java.util.Iterator;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdt extends zzcv {
                final transient Object zza;

                public zzdt(Object obj) {
/* 4 */             obj.getClass();
/* 7 */             this.zza = obj;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
                public final boolean contains(Object obj) {
/* 3 */             return this.zza.equals(obj);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, java.util.Collection, java.util.Set
                public final int hashCode() {
/* 3 */             return this.zza.hashCode();
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final /* synthetic */ Iterator iterator() {
/* 5 */             return new zzcz(this.zza);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 1 */             return 1;
                }

                @Override // java.util.AbstractCollection
                public final String toString() {
/* 11 */            return fm0.m3784j("[", this.zza.toString(), "]");
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final int zza(Object[] objArr, int i) {
/* 4 */             objArr[0] = this.zza;
/* 6 */             return 1;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
                public final zzco zzd() {
/* 3 */             return zzco.zzm(this.zza);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
                /* JADX INFO: renamed from: zze */
                public final zzdw iterator() {
/* 5 */             return new zzcz(this.zza);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final boolean zzf() {
/* 2 */             throw null;
                }
            }
