            package com.google.android.recaptcha.internal;

            import android.content.Context;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            import java.util.Timer;
            import p000.cf2;
            import p000.ds0;
            import p000.i13;
            import p000.md0;
            import p000.mz0;
            import p000.q92;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgz implements zzgs {
                private static Timer zza;
                private final Context zzb;
                private final zzgo zzc;

                public zzgz(Context context) {
/* 4 */             this.zzb = context;
/* 6 */             zzgo zzgoVar = null;
                    try {
/* 1 */                 zzgo zzgoVar2 = zzgo.zzd;
/* 15 */                zzgoVar2 = zzgoVar2 == null ? new zzgo(context, null) : zzgoVar2;
/* 1 */                 zzgo.zzd = zzgoVar2;
/* 21 */                zzgoVar = zzgoVar2;
                    } catch (Exception unused) {
                    }
/* 22 */            this.zzc = zzgoVar;
/* 24 */            zzh();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void zzf() {
                    ArrayList arrayList;
                    Iterator it;
/* 1 */             zzgo zzgoVar = this.zzc;
/* 3 */             if (zzgoVar != null) {
/* 5 */                 List listZzd = zzgoVar.zzd();
/* 9 */                 listZzd.getClass();
/* 14 */                if (listZzd instanceof RandomAccess) {
/* 16 */                    int size = listZzd.size();
/* 33 */                    arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
/* 37 */                    for (int i = 0; i >= 0 && i < size; i += 20) {
/* 41 */                        int i2 = size - i;
/* 45 */                        if (20 <= i2) {
/* 48 */                            i2 = 20;
                                }
/* 51 */                        ArrayList arrayList2 = new ArrayList(i2);
/* 55 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 63 */                            arrayList2.add(listZzd.get(i3 + i));
                                }
/* 69 */                        arrayList.add(arrayList2);
                            }
                        } else {
/* 77 */                    arrayList = new ArrayList();
/* 80 */                    Iterator it2 = listZzd.iterator();
/* 84 */                    it2.getClass();
/* 91 */                    if (it2.hasNext()) {
/* 99 */                        cf2 cf2Var = new cf2(it2, null);
/* 104 */                       q92 q92Var = new q92();
/* 111 */                       q92Var.f15452c = mz0.m6833a(q92Var, q92Var, cf2Var);
                                it = q92Var;
                            } else {
/* 93 */                        it = md0.f13701a;
                            }
/* 117 */                   while (it.hasNext()) {
/* 125 */                       arrayList.add((List) it.next());
                            }
                        }
/* 129 */               Iterator it3 = arrayList.iterator();
/* 137 */               while (it3.hasNext()) {
/* 145 */                   zzg((List) it3.next());
                        }
                    }
                }

                private final void zzg(List list) {
                    zzgo zzgoVar;
/* 1 */             zzwo zzwoVarZzi = zzwq.zzi();
/* 7 */             ArrayList arrayList = new ArrayList();
/* 10 */            Iterator it = list.iterator();
/* 18 */            while (it.hasNext()) {
/* 24 */                zzgp zzgpVar = (zzgp) it.next();
                        try {
/* 38 */                    zzzm zzzmVarZzk = zzzm.zzk(zzpp.zzg().zzj(zzgpVar.zzc()));
/* 42 */                    int iZzN = zzzmVarZzk.zzN();
/* 46 */                    int i = iZzN - 1;
/* 48 */                    if (iZzN == 0) {
/* 83 */                        throw null;
                            }
/* 50 */                    if (i == 0) {
/* 75 */                        zzwoVarZzi.zzq(zzzmVarZzk.zzf());
                            } else if (i == 1) {
/* 67 */                        zzwoVarZzi.zzr(zzzmVarZzk.zzg());
                            } else if (i != 2) {
/* 59 */                        ds0.m3187b();
/* 62 */                        return;
                            }
/* 78 */                    arrayList.add(zzgpVar);
                        } catch (Exception unused) {
/* 84 */                    zzgo zzgoVar2 = this.zzc;
/* 86 */                    if (zzgoVar2 != null) {
/* 88 */                        zzgoVar2.zzf(zzgpVar);
                            }
                        }
                    }
/* 101 */           if (zzwoVarZzi.zzf() + zzwoVarZzi.zze() == 0) {
/* 141 */               return;
                    }
/* 110 */           byte[] bArrZzd = ((zzwq) zzwoVarZzi.zzk()).zzd();
                    try {
/* 114 */               int i2 = zzby.zza;
/* 132 */               if (!((zzha) r51.m8065b(zzgt.zza).getValue()).zza(bArrZzd) || (zzgoVar = this.zzc) == null) {
/* 141 */                   return;
                        }
/* 138 */               zzgoVar.zza(arrayList);
                    } catch (Exception unused2) {
                    }
                }

                private final void zzh() {
/* 3 */             if (zza == null) {
/* 7 */                 Timer timer = new Timer();
/* 10 */                zza = timer;
/* 21 */                timer.schedule(new zzgu(this), 120000L, 120000L);
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzgs
                public final void zza(zzzm zzzmVar) {
                    try {
/* 1 */                 int i = zzby.zza;
/* 26 */                i13.m4443w(((zzcr) r51.m8065b(zzgx.zza).getValue()).zza(), null, new zzgy(this, zzzmVar, null), 3);
                    } catch (Exception unused) {
                    }
/* 29 */            zzh();
                }
            }
