            package com.google.android.gms.internal.measurement;

            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzob implements Iterator {
                final /* synthetic */ zzod zza;
                private int zzb;
                private boolean zzc;
                private Iterator zzd;

                public /* synthetic */ zzob(zzod zzodVar, byte[] bArr) {
/* 1 */             Objects.requireNonNull(zzodVar);
/* 4 */             this.zza = zzodVar;
/* 10 */            this.zzb = -1;
                }

                private final Iterator zza() {
/* 3 */             if (this.zzd == null) {
/* 19 */                this.zzd = this.zza.zzk().entrySet().iterator();
                    }
/* 21 */            return this.zzd;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 4 */             int i = this.zzb + 1;
/* 5 */             zzod zzodVar = this.zza;
/* 11 */            if (i >= zzodVar.zzj()) {
                        return !zzodVar.zzk().isEmpty() && zza().hasNext();
                    }
/* 3 */             return true;
                }

                @Override // java.util.Iterator
                public final /* bridge */ /* synthetic */ Object next() {
/* 2 */             this.zzc = true;
/* 6 */             int i = this.zzb + 1;
/* 7 */             this.zzb = i;
/* 9 */             zzod zzodVar = this.zza;
                    return i < zzodVar.zzj() ? (zzoa) zzodVar.zzi()[i] : (Map.Entry) zza().next();
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 3 */             if (!this.zzc) {
/* 39 */                f42.m3656l("remove() was called before next()");
/* 42 */                return;
                    }
/* 6 */             this.zzc = false;
/* 8 */             zzod zzodVar = this.zza;
/* 10 */            zzodVar.zzh();
/* 13 */            int i = this.zzb;
/* 19 */            if (i >= zzodVar.zzj()) {
/* 33 */                zza().remove();
                    } else {
/* 23 */                this.zzb = i - 1;
/* 25 */                zzodVar.zzg(i);
                    }
                }
            }
