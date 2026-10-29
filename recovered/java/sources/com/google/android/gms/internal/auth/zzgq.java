            package com.google.android.gms.internal.auth;

            import java.util.Iterator;
            import java.util.Map;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzgq implements Iterator {
                final /* synthetic */ zzgu zza;
                private int zzb = -1;
                private boolean zzc;
                private Iterator zzd;

                private final Iterator zza() {
/* 3 */             if (this.zzd == null) {
/* 19 */                this.zzd = this.zza.zzc.entrySet().iterator();
                    }
/* 21 */            return this.zzd;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 15 */            if (this.zzb + 1 >= this.zza.zzb.size()) {
                        return !this.zza.zzc.isEmpty() && zza().hasNext();
                    }
/* 3 */             return true;
                }

                @Override // java.util.Iterator
                public final /* bridge */ /* synthetic */ Object next() {
/* 2 */             this.zzc = true;
/* 6 */             int i = this.zzb + 1;
/* 7 */             this.zzb = i;
                    return i < this.zza.zzb.size() ? (Map.Entry) this.zza.zzb.get(this.zzb) : (Map.Entry) zza().next();
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 3 */             if (!this.zzc) {
/* 49 */                f42.m3656l("remove() was called before next()");
/* 52 */                return;
                    }
/* 6 */             this.zzc = false;
/* 1 */             this.zza.zzn();
/* 25 */            if (this.zzb >= this.zza.zzb.size()) {
/* 43 */                zza().remove();
/* 46 */                return;
                    }
/* 27 */            zzgu zzguVar = this.zza;
/* 29 */            int i = this.zzb;
/* 33 */            this.zzb = i - 1;
/* 1 */             zzguVar.zzl(i);
                }
            }
