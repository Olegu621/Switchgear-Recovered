            package com.google.android.gms.internal.fido;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbe extends zzba {
                final transient Object zza;

                public zzbe(Object obj) {
/* 4 */             obj.getClass();
/* 7 */             this.zza = obj;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
/* 3 */             return this.zza.equals(obj);
                }

                @Override // com.google.android.gms.internal.fido.zzba, java.util.Collection, java.util.Set
                public final int hashCode() {
/* 3 */             return this.zza.hashCode();
                }

                @Override // com.google.android.gms.internal.fido.zzba, com.google.android.gms.internal.fido.zzaw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final /* synthetic */ Iterator iterator() {
/* 5 */             return new zzbb(this.zza);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 1 */             return 1;
                }

                @Override // java.util.AbstractCollection
                public final String toString() {
/* 22 */            return "[" + this.zza.toString() + ']';
                }

                @Override // com.google.android.gms.internal.fido.zzaw
                public final int zza(Object[] objArr, int i) {
/* 4 */             objArr[0] = this.zza;
/* 6 */             return 1;
                }

                @Override // com.google.android.gms.internal.fido.zzba, com.google.android.gms.internal.fido.zzaw
                /* JADX INFO: renamed from: zzd */
                public final zzbf iterator() {
/* 5 */             return new zzbb(this.zza);
                }
            }
