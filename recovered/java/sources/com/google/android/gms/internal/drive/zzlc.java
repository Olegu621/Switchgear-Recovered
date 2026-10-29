            package com.google.android.gms.internal.drive;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 156 */   final class zzlc extends zzla {
                private static final Class<?> zzto = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

                private zzlc() {
/* 2 */             super();
                }

                private static <E> List<E> zzb(Object obj, long j) {
/* 5 */             return (List) zznd.zzo(obj, j);
                }

                @Override // com.google.android.gms.internal.drive.zzla
                public final <E> void zza(Object obj, Object obj2, long j) {
                    List list;
                    List list2;
                    List listZzr;
/* 1 */             List listZzb = zzb(obj2, j);
/* 5 */             int size = listZzb.size();
/* 9 */             List listZzb2 = zzb(obj, j);
/* 17 */            if (listZzb2.isEmpty()) {
/* 21 */                if (listZzb2 instanceof zzkz) {
/* 25 */                    listZzr = new zzky(size);
                        } else {
/* 47 */                    listZzr = ((listZzb2 instanceof zzmc) && (listZzb2 instanceof zzkp)) ? ((zzkp) listZzb2).zzr(size) : new ArrayList(size);
                        }
/* 50 */                zznd.zza(obj, j, listZzr);
                        list2 = listZzr;
                    } else {
/* 64 */                if (zzto.isAssignableFrom(listZzb2.getClass())) {
/* 73 */                    ArrayList arrayList = new ArrayList(listZzb2.size() + size);
/* 76 */                    arrayList.addAll(listZzb2);
/* 79 */                    zznd.zza(obj, j, arrayList);
                            list = arrayList;
                        } else if (listZzb2 instanceof zzna) {
/* 95 */                    zzky zzkyVar = new zzky(listZzb2.size() + size);
/* 100 */                   zzkyVar.addAll((zzna) listZzb2);
/* 103 */                   zznd.zza(obj, j, zzkyVar);
                            list = zzkyVar;
                        } else if ((listZzb2 instanceof zzmc) && (listZzb2 instanceof zzkp)) {
/* 116 */                   zzkp zzkpVar = (zzkp) listZzb2;
/* 122 */                   if (!zzkpVar.zzbo()) {
                                list2 = listZzb2;
                                list2 = listZzb2;
                                list2 = listZzb2;
/* 129 */                       zzkp<E> zzkpVarZzr = zzkpVar.zzr(listZzb2.size() + size);
/* 133 */                       zznd.zza(obj, j, zzkpVarZzr);
                                list2 = zzkpVarZzr;
                            }
                        }
/* 82 */                list2 = list;
                    }
                    list2 = listZzb2;
                    list2 = listZzb2;
                    list2 = listZzb2;
                    list2 = listZzb2;
                    list2 = listZzb2;
                    list2 = listZzb2;
/* 136 */           int size2 = list2.size();
/* 140 */           int size3 = listZzb.size();
/* 144 */           if (size2 > 0 && size3 > 0) {
/* 148 */               list2.addAll(listZzb);
                    }
/* 151 */           if (size2 > 0) {
/* 153 */               listZzb = list2;
                    }
/* 154 */           zznd.zza(obj, j, listZzb);
                }

                @Override // com.google.android.gms.internal.drive.zzla
/* 157 */       public final void zza(Object obj, long j) {
                    Object objUnmodifiableList;
/* 158 */           List list = (List) zznd.zzo(obj, j);
/* 159 */           if (list instanceof zzkz) {
/* 160 */               objUnmodifiableList = ((zzkz) list).zzds();
                    } else {
/* 161 */               if (zzto.isAssignableFrom(list.getClass())) {
                            return;
                        }
/* 162 */               if ((list instanceof zzmc) && (list instanceof zzkp)) {
/* 163 */                   zzkp zzkpVar = (zzkp) list;
                            if (zzkpVar.zzbo()) {
/* 164 */                       zzkpVar.zzbp();
                                return;
                            }
                            return;
                        }
/* 165 */               objUnmodifiableList = Collections.unmodifiableList(list);
                    }
/* 166 */           zznd.zza(obj, j, objUnmodifiableList);
                }
            }
