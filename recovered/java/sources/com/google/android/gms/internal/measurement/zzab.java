            package com.google.android.gms.internal.measurement;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 29 */    public final class zzab {
                private zzaa zza;
                private zzaa zzb;
                private final List zzc;

                public zzab() {
/* 14 */            this.zza = new zzaa(HttpUrl.FRAGMENT_ENCODE_SET, 0L, null);
/* 21 */            this.zzb = new zzaa(HttpUrl.FRAGMENT_ENCODE_SET, 0L, null);
/* 28 */            this.zzc = new ArrayList();
                }

                public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
/* 9 */             zzab zzabVar = new zzab(this.zza.clone());
/* 14 */            Iterator it = this.zzc.iterator();
/* 22 */            while (it.hasNext()) {
/* 36 */                zzabVar.zzc.add(((zzaa) it.next()).clone());
                    }
/* 40 */            return zzabVar;
                }

                public final zzaa zza() {
/* 1 */             return this.zza;
                }

                public final void zzb(zzaa zzaaVar) {
/* 1 */             this.zza = zzaaVar;
/* 7 */             this.zzb = zzaaVar.clone();
/* 11 */            this.zzc.clear();
                }

                public final zzaa zzc() {
/* 1 */             return this.zzb;
                }

                public final void zzd(zzaa zzaaVar) {
/* 1 */             this.zzb = zzaaVar;
                }

                public final void zze(String str, long j, Map map) {
/* 3 */             HashMap map2 = new HashMap();
/* 18 */            for (String str2 : map.keySet()) {
/* 40 */                map2.put(str2, zzaa.zzh(str2, this.zza.zze(str2), map.get(str2)));
                    }
/* 51 */            this.zzc.add(new zzaa(str, j, map2));
                }

                public final List zzf() {
/* 1 */             return this.zzc;
                }

/* 30 */        public zzab(zzaa zzaaVar) {
                    this.zza = zzaaVar;
                    this.zzb = zzaaVar.clone();
/* 32 */            this.zzc = new ArrayList();
                }
            }
