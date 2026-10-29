            package com.google.android.recaptcha.internal;

            import com.google.android.recaptcha.internal.zzpv;
            import com.google.android.recaptcha.internal.zzpw;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.List;
            import java.util.RandomAccess;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzpv<MessageType extends zzpw<MessageType, BuilderType>, BuilderType extends zzpv<MessageType, BuilderType>> implements zztr {
                public static void zzd(Iterable iterable, List list) {
/* 1 */             byte[] bArr = zzsv.zzb;
/* 3 */             iterable.getClass();
/* 9 */             if (iterable instanceof zzte) {
/* 13 */                List listZza = ((zzte) iterable).zza();
/* 18 */                zzte zzteVar = (zzte) list;
/* 20 */                int size = list.size();
/* 32 */                for (Object obj : listZza) {
/* 38 */                    if (obj == null) {
/* 49 */                        String strM3505i = AbstractC0886en.m3505i(zzteVar.size() - size, "Element at index ", " is null.");
/* 53 */                        int size2 = zzteVar.size();
                                while (true) {
/* 57 */                            size2--;
/* 59 */                            if (size2 < size) {
/* 65 */                                C1951n4.m6868s(strM3505i);
/* 68 */                                return;
                                    }
/* 61 */                            zzteVar.remove(size2);
                                }
                            } else if (obj instanceof zzqm) {
/* 75 */                        zzteVar.zzb();
                            } else if (obj instanceof byte[]) {
/* 83 */                        byte[] bArr2 = (byte[]) obj;
/* 86 */                        zzqm.zzl(bArr2, 0, bArr2.length);
/* 89 */                        zzteVar.zzb();
                            } else {
/* 95 */                        zzteVar.add((String) obj);
                            }
                        }
/* 203 */               return;
                    }
/* 101 */           if (iterable instanceof zzub) {
/* 206 */               list.addAll((Collection) iterable);
/* 209 */               return;
                    }
/* 105 */           if (iterable instanceof Collection) {
/* 110 */               int size3 = ((Collection) iterable).size();
/* 116 */               if (list instanceof ArrayList) {
/* 126 */                   ((ArrayList) list).ensureCapacity(list.size() + size3);
                        } else if (list instanceof zzud) {
/* 142 */                   ((zzud) list).zzf(list.size() + size3);
                        }
                    }
/* 145 */           int size4 = list.size();
/* 151 */           if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
/* 188 */               for (Object obj2 : iterable) {
/* 194 */                   if (obj2 == null) {
/* 196 */                       zze(list, size4);
                            }
/* 199 */                   list.add(obj2);
                        }
/* 203 */               return;
                    }
/* 157 */           List list2 = (List) iterable;
/* 159 */           int size5 = list2.size();
/* 163 */           for (int i = 0; i < size5; i++) {
/* 165 */               Object obj3 = list2.get(i);
/* 169 */               if (obj3 == null) {
/* 171 */                   zze(list, size4);
                        }
/* 174 */               list.add(obj3);
                    }
                }

                private static void zze(List list, int i) {
/* 10 */            String strM3505i = AbstractC0886en.m3505i(list.size() - i, "Element at index ", " is null.");
/* 14 */            int size = list.size();
                    while (true) {
/* 18 */                size--;
/* 20 */                if (size < i) {
/* 31 */                    throw new NullPointerException(strM3505i);
                        }
/* 22 */                list.remove(size);
                    }
                }

                @Override // 
                public abstract zzpv zza();

                public abstract zzpv zzb(zzpw zzpwVar);

                @Override // com.google.android.recaptcha.internal.zztr
                public final /* bridge */ /* synthetic */ zztr zzc(zzts zztsVar) {
/* 13 */            if (zzm().getClass().isInstance(zztsVar)) {
/* 17 */                return zzb((zzpw) zztsVar);
                    }
/* 24 */            C1951n4.m6859j("mergeFrom(MessageLite) can only merge messages of the same type.");
/* 27 */            return null;
                }
            }
