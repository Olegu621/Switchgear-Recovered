            package com.google.android.gms.internal.auth;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 4 */     final class zzfg extends zzfk {
                private static final Class zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

                public /* synthetic */ zzfg(zzff zzffVar) {
/* 2 */             super(null);
                }

                @Override // com.google.android.gms.internal.auth.zzfk
                public final void zza(Object obj, long j) {
                    Object objUnmodifiableList;
/* 5 */             List list = (List) zzhi.zzf(obj, j);
/* 9 */             if (list instanceof zzfe) {
/* 13 */                objUnmodifiableList = ((zzfe) list).zze();
                    } else {
/* 28 */                if (zza.isAssignableFrom(list.getClass())) {
/* 50 */                    return;
                        }
/* 33 */                if ((list instanceof zzgd) && (list instanceof zzey)) {
/* 39 */                    zzey zzeyVar = (zzey) list;
/* 45 */                    if (zzeyVar.zzc()) {
/* 47 */                        zzeyVar.zzb();
/* 50 */                        return;
                            }
/* 50 */                    return;
                        }
/* 51 */                objUnmodifiableList = Collections.unmodifiableList(list);
                    }
/* 55 */            zzhi.zzp(obj, j, objUnmodifiableList);
                }

                @Override // com.google.android.gms.internal.auth.zzfk
                public final void zzb(Object obj, Object obj2, long j) {
                    List list;
                    List list2;
                    List listZzd;
/* 5 */             List list3 = (List) zzhi.zzf(obj2, j);
/* 7 */             int size = list3.size();
/* 15 */            List list4 = (List) zzhi.zzf(obj, j);
/* 21 */            if (list4.isEmpty()) {
/* 25 */                if (list4 instanceof zzfe) {
/* 29 */                    listZzd = new zzfd(size);
                        } else {
/* 51 */                    listZzd = ((list4 instanceof zzgd) && (list4 instanceof zzey)) ? ((zzey) list4).zzd(size) : new ArrayList(size);
                        }
/* 54 */                zzhi.zzp(obj, j, listZzd);
                        list2 = listZzd;
                    } else {
/* 68 */                if (zza.isAssignableFrom(list4.getClass())) {
/* 77 */                    ArrayList arrayList = new ArrayList(list4.size() + size);
/* 80 */                    arrayList.addAll(list4);
/* 83 */                    zzhi.zzp(obj, j, arrayList);
                            list = arrayList;
                        } else if (list4 instanceof zzhd) {
/* 99 */                    zzfd zzfdVar = new zzfd(list4.size() + size);
/* 108 */                   zzfdVar.addAll(zzfdVar.size(), (zzhd) list4);
/* 111 */                   zzhi.zzp(obj, j, zzfdVar);
                            list = zzfdVar;
                        } else if ((list4 instanceof zzgd) && (list4 instanceof zzey)) {
/* 124 */                   zzey zzeyVar = (zzey) list4;
/* 130 */                   if (!zzeyVar.zzc()) {
                                list2 = list4;
                                list2 = list4;
                                list2 = list4;
/* 137 */                       zzey zzeyVarZzd = zzeyVar.zzd(list4.size() + size);
/* 141 */                       zzhi.zzp(obj, j, zzeyVarZzd);
                                list2 = zzeyVarZzd;
                            }
                        }
/* 86 */                list2 = list;
                    }
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
/* 144 */           int size2 = list2.size();
/* 148 */           int size3 = list3.size();
/* 152 */           if (size2 > 0 && size3 > 0) {
/* 156 */               list2.addAll(list3);
                    }
/* 159 */           if (size2 > 0) {
/* 162 */               list3 = list2;
                    }
/* 163 */           zzhi.zzp(obj, j, list3);
                }

/* 5 */         private zzfg() {
/* 6 */             super(null);
                }
            }
