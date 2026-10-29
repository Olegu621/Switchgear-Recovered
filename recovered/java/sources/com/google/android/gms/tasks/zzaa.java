            package com.google.android.gms.tasks;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzaa implements Continuation {
                final /* synthetic */ Collection zza;

                public zzaa(Collection collection) {
/* 1 */             this.zza = collection;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final /* bridge */ /* synthetic */ Object then(Task task) throws Exception {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             Iterator it = this.zza.iterator();
/* 16 */            while (it.hasNext()) {
/* 28 */                arrayList.add(((Task) it.next()).getResult());
                    }
/* 32 */            return arrayList;
                }
            }
