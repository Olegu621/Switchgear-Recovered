            package com.google.android.recaptcha.internal;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.C2085pw;
            import p000.C2122qw;
            import p000.c10;
            import p000.ds0;
            import p000.nc1;
            import p000.od0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 60 */    public final class zzaj extends zzg {
                private final List zza;
                private zzqm zzb;
                private final Map zzc;

                public /* synthetic */ zzaj(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 52 */            this.zza = C2085pw.m7566e(new zzav(), new zzad(), new zzx(), new zzz(), new zzba(null, null, 3, null));
/* 59 */            this.zzc = new LinkedHashMap();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final zzxx zzp(String str) {
                    Map linkedHashMap;
/* 7 */             List<zzat> list = (List) this.zzc.remove(str);
/* 9 */             if (list != null) {
/* 17 */                int iM6962c = nc1.m6962c(C2122qw.m8020h(list, 10));
/* 23 */                if (iM6962c < 16) {
/* 25 */                    iM6962c = 16;
                        }
/* 28 */                linkedHashMap = new LinkedHashMap(iM6962c);
/* 39 */                for (zzat zzatVar : list) {
/* 55 */                    linkedHashMap.put(Integer.valueOf(zzatVar.zzb()), zzatVar);
                        }
                    } else {
/* 59 */                linkedHashMap = od0.f14715a;
/* 61 */                linkedHashMap.getClass();
                    }
/* 64 */            zzyo zzyoVarZzr = zzr(linkedHashMap, str);
/* 68 */            zzxw zzxwVarZzf = zzxx.zzf();
/* 72 */            zzxwVarZzf.zze(str);
/* 75 */            zzxq zzxqVarZzf = zzxr.zzf();
/* 79 */            byte[] bArrZzd = zzyoVarZzr.zzd();
/* 93 */            zzxqVarZzf.zze(zzpp.zzh().zzi(bArrZzd, 0, bArrZzd.length));
/* 96 */            zzxwVarZzf.zzq(zzxqVarZzf);
/* 103 */           return (zzxx) zzxwVarZzf.zzk();
                }

                private final zzym zzq(zzat zzatVar) {
                    zzqm zzqmVar;
/* 1 */             zzyk zzykVarZzf = zzym.zzf();
/* 6 */             zzykVarZzf.zzq(3);
/* 13 */            if (zzatVar instanceof zzal) {
/* 17 */                zzyx zzyxVarZza = ((zzal) zzatVar).zza();
/* 21 */                zzqm zzqmVar2 = this.zzb;
/* 23 */                zzqmVar = zzqmVar2 != null ? zzqmVar2 : null;
/* 27 */                byte[] bArrZzd = zzyxVarZza.zzd();
/* 44 */                zzykVarZzf.zzf(zzdn.zza(zzpp.zzh().zzi(bArrZzd, 0, bArrZzd.length), zzqmVar));
                    } else {
/* 50 */                if (!(zzatVar instanceof zzak)) {
/* 91 */                    ds0.m3187b();
/* 12 */                    return null;
                        }
/* 54 */                zzyt zzytVarZza = ((zzak) zzatVar).zza();
/* 58 */                zzqm zzqmVar3 = this.zzb;
/* 60 */                zzqmVar = zzqmVar3 != null ? zzqmVar3 : null;
/* 64 */                byte[] bArrZzd2 = zzytVarZza.zzd();
/* 81 */                zzykVarZzf.zze(zzdn.zza(zzpp.zzh().zzi(bArrZzd2, 0, bArrZzd2.length), zzqmVar));
                    }
/* 88 */            return (zzym) zzykVarZzf.zzk();
                }

                private final zzyo zzr(Map map, String str) {
/* 1 */             zzyn zzynVarZzf = zzyo.zzf();
/* 5 */             zzynVarZzf.zzq(str);
/* 8 */             List list = this.zza;
/* 12 */            ArrayList<zzar> arrayList = new ArrayList();
/* 23 */            for (Object obj : list) {
/* 36 */                if (((zzar) obj).zzi()) {
/* 38 */                    arrayList.add(obj);
                        }
                    }
/* 50 */            for (zzar zzarVar : arrayList) {
/* 70 */                if (!map.containsKey(Integer.valueOf(zzarVar.zza()))) {
/* 72 */                    int iZza = zzarVar.zza();
/* 78 */                    zzys zzysVarZzf = zzyt.zzf();
/* 82 */                    zzysVarZzf.zzf(iZza);
/* 87 */                    zzysVarZzf.zzr(13);
/* 92 */                    zzysVarZzf.zzq(27);
/* 108 */                   zzynVarZzf.zzf(zzq(new zzak(iZza, (zzyt) zzysVarZzf.zzk())));
                        }
                    }
/* 112 */           Collection collectionValues = map.values();
/* 124 */           ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(collectionValues, 10));
/* 127 */           Iterator it = collectionValues.iterator();
/* 135 */           while (it.hasNext()) {
/* 147 */               arrayList2.add(zzq((zzat) it.next()));
                    }
/* 151 */           zzynVarZzf.zze(arrayList2);
/* 158 */           return (zzyo) zzynVarZzf.zzk();
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final Object zza(String str, c10 c10Var) {
/* 1 */             return zzp(str);
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final Object zzb(String str, c10 c10Var) {
/* 9 */             return new zzhg(new zzag(this, str, null));
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final Object zzd(zzxn zzxnVar, c10 c10Var) {
/* 9 */             return new zzhg(new zzai(zzxnVar, this, null));
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final void zzh(zzyg zzygVar) {
/* 3 */             Iterator it = this.zza.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((zzar) it.next()).zzh(zzygVar);
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final int zzj() {
/* 1 */             return 35;
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final int zzk() {
/* 1 */             return 34;
                }

                public final Map zzn() {
/* 1 */             return this.zzc;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 61 */        public zzaj() {
/* 62 */            this(null, 1, 0 == true ? 1 : 0);
                }
            }
