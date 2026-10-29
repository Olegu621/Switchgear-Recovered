            package com.google.android.gms.internal.play_billing;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcs {
                private final List zza = new ArrayList();

                public final zzcs zza(zzdh zzdhVar) {
/* 5 */             if (zzdhVar.zzd()) {
/* 23 */                C1951n4.m6859j(zzbf.zza("range must not be empty, but was %s", zzdhVar));
/* 26 */                return null;
                    }
/* 9 */             this.zza.add(zzdhVar);
/* 12 */            return this;
                }

                public final zzcs zzb(zzcs zzcsVar) {
/* 3 */             Iterator it = zzcsVar.zza.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                zza((zzdh) it.next());
                    }
/* 23 */            return this;
                }

                public final zzct zzc() {
/* 9 */             zzck zzckVar = new zzck(this.zza.size());
/* 16 */            Collections.sort(this.zza, zzdg.zza);
/* 21 */            Iterator it = this.zza.iterator();
/* 34 */            zzcy zzcyVar = it instanceof zzcy ? (zzcy) it : new zzcy(it);
/* 42 */            while (zzcyVar.hasNext()) {
/* 48 */                zzdh zzdhVarZzc = (zzdh) zzcyVar.next();
/* 54 */                while (zzcyVar.hasNext()) {
/* 60 */                    zzdh zzdhVar = (zzdh) zzcyVar.zza();
/* 70 */                    if (zzdhVarZzc.zza.compareTo(zzdhVar.zzb) > 0 || zzdhVar.zza.compareTo(zzdhVarZzc.zzb) > 0) {
                                break;
                            }
/* 92 */                    zzbe.zzd(zzdhVarZzc.zzb(zzdhVar).zzd(), "Overlapping ranges not permitted but found %s overlapping %s", zzdhVarZzc, zzdhVar);
/* 101 */                   zzdhVarZzc = zzdhVarZzc.zzc((zzdh) zzcyVar.next());
                        }
/* 106 */               zzckVar.zzd(zzdhVarZzc);
                    }
/* 110 */           zzco zzcoVarZze = zzckVar.zze();
/* 118 */           if (zzcoVarZze.isEmpty()) {
/* 120 */               return zzct.zzb();
                    }
/* 130 */           if (zzcoVarZze.size() == 1) {
/* 133 */               zzdx zzdxVarListIterator = zzcoVarZze.listIterator(0);
/* 137 */               Object next = zzdxVarListIterator.next();
/* 145 */               if (zzdxVarListIterator.hasNext()) {
/* 168 */                   StringBuilder sb = new StringBuilder("expected one element but was: <");
/* 171 */                   sb.append(next);
/* 175 */                   for (int i = 0; i < 4 && zzdxVarListIterator.hasNext(); i++) {
/* 185 */                       sb.append(", ");
/* 192 */                       sb.append(zzdxVarListIterator.next());
                            }
/* 202 */                   if (zzdxVarListIterator.hasNext()) {
/* 207 */                       sb.append(", ...");
                            }
/* 212 */                   sb.append('>');
/* 224 */                   throw new IllegalArgumentException(sb.toString());
                        }
/* 157 */               if (((zzdh) next).equals(zzdh.zza())) {
/* 159 */                   return zzct.zza();
                        }
                    }
/* 227 */           return new zzct(zzcoVarZze);
                }
            }
