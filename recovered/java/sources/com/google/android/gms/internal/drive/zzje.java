            package com.google.android.gms.internal.drive;

            import java.util.Comparator;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzje implements Comparator<zzjc> {
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(zzjc zzjcVar, zzjc zzjcVar2) {
/* 1 */             zzjc zzjcVar3 = zzjcVar;
/* 3 */             zzjc zzjcVar4 = zzjcVar2;
/* 9 */             zzjj zzjjVar = (zzjj) zzjcVar3.iterator();
/* 15 */            zzjj zzjjVar2 = (zzjj) zzjcVar4.iterator();
/* 21 */            while (zzjjVar.hasNext() && zzjjVar2.hasNext()) {
/* 45 */                int iCompare = Integer.compare(zzjc.zza(zzjjVar.nextByte()), zzjc.zza(zzjjVar2.nextByte()));
/* 49 */                if (iCompare != 0) {
/* 51 */                    return iCompare;
                        }
                    }
/* 60 */            return Integer.compare(zzjcVar3.size(), zzjcVar4.size());
                }
            }
