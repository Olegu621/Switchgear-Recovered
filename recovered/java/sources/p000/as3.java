            package p000;

            import com.google.android.gms.internal.measurement.zzff;
            import com.google.android.gms.internal.measurement.zzfn;
            import com.google.android.gms.internal.measurement.zzhf;
            import com.google.android.gms.internal.measurement.zzhg;
            import com.google.android.gms.internal.measurement.zzhp;
            import com.google.android.gms.internal.measurement.zzhq;
            import com.google.android.gms.internal.measurement.zzih;
            import com.google.android.gms.internal.measurement.zzii;
            import com.google.android.gms.internal.measurement.zzij;
            import com.google.android.gms.internal.measurement.zzik;
            import com.google.android.gms.internal.measurement.zzpq;
            import java.util.ArrayList;
            import java.util.BitSet;
            import java.util.Collections;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 68 */    public final class as3 {

                /* JADX INFO: renamed from: a */
                public final String f2078a;

                /* JADX INFO: renamed from: b */
                public final boolean f2079b;

                /* JADX INFO: renamed from: c */
                public final zzii f2080c;

                /* JADX INFO: renamed from: d */
                public final BitSet f2081d;

                /* JADX INFO: renamed from: e */
                public final BitSet f2082e;

                /* JADX INFO: renamed from: f */
                public final C1024id f2083f;

                /* JADX INFO: renamed from: g */
                public final C1024id f2084g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ fd3 f2085h;

                public as3(fd3 fd3Var, String str, zzii zziiVar, BitSet bitSet, BitSet bitSet2, C1024id c1024id, C1024id c1024id2) {
/* 4 */             this.f2085h = fd3Var;
/* 6 */             this.f2078a = str;
/* 8 */             this.f2081d = bitSet;
/* 10 */            this.f2082e = bitSet2;
/* 12 */            this.f2083f = c1024id;
/* 19 */            this.f2084g = new C1024id();
/* 35 */            for (Integer num : (xb1) c1024id2.keySet()) {
/* 45 */                ArrayList arrayList = new ArrayList();
/* 55 */                arrayList.add((Long) c1024id2.getOrDefault(num, null));
/* 60 */                this.f2084g.put(num, arrayList);
                    }
/* 65 */            this.f2079b = false;
/* 67 */            this.f2080c = zziiVar;
                }

                /* JADX INFO: renamed from: a */
                public final void m1160a(cd3 cd3Var) {
                    int iZzb;
                    switch (cd3Var.f2855g) {
                        case 0:
/* 19 */                    iZzb = ((zzff) cd3Var.f2857i).zzb();
                            break;
                        default:
/* 10 */                    iZzb = ((zzfn) cd3Var.f2857i).zzb();
                            break;
                    }
/* 25 */            boolean z = true;
/* 26 */            if (cd3Var.f2851c != null) {
/* 30 */                this.f2082e.set(iZzb, true);
                    }
/* 33 */            Boolean bool = cd3Var.f2852d;
/* 35 */            if (bool != null) {
/* 43 */                this.f2081d.set(iZzb, bool.booleanValue());
                    }
/* 51 */            if (cd3Var.f2853e != null) {
/* 53 */                Integer numValueOf = Integer.valueOf(iZzb);
/* 57 */                C1024id c1024id = this.f2083f;
/* 63 */                Long l = (Long) c1024id.getOrDefault(numValueOf, null);
/* 71 */                long jLongValue = cd3Var.f2853e.longValue() / 1000;
/* 72 */                if (l == null || jLongValue > l.longValue()) {
/* 86 */                    c1024id.put(numValueOf, Long.valueOf(jLongValue));
                        }
                    }
/* 91 */            if (cd3Var.f2854f != null) {
/* 93 */                Integer numValueOf2 = Integer.valueOf(iZzb);
/* 97 */                C1024id c1024id2 = this.f2084g;
/* 103 */               List arrayList = (List) c1024id2.getOrDefault(numValueOf2, null);
/* 105 */               if (arrayList == null) {
/* 109 */                   arrayList = new ArrayList();
/* 112 */                   c1024id2.put(numValueOf2, arrayList);
                        }
/* 117 */               boolean zZzg = false;
                        switch (cd3Var.f2855g) {
                            case 0:
/* 122 */                       z = false;
                                break;
                        }
/* 123 */               if (z) {
/* 125 */                   arrayList.clear();
                        }
/* 128 */               zzpq.zza();
/* 135 */               ij3 ij3Var = (ij3) this.f2085h.f16749a;
/* 137 */               pd3 pd3Var = ij3Var.f9651d;
/* 139 */               ug3 ug3Var = vg3.f18074F0;
/* 141 */               String str = this.f2078a;
/* 147 */               if (pd3Var.m7406J(str, ug3Var)) {
                            switch (cd3Var.f2855g) {
                                case 0:
/* 159 */                           zZzg = ((zzff) cd3Var.f2857i).zzg();
                                    break;
                            }
/* 163 */                   if (zZzg) {
/* 165 */                       arrayList.clear();
                            }
                        }
/* 168 */               zzpq.zza();
/* 173 */               boolean zM7406J = ij3Var.f9651d.m7406J(str, ug3Var);
/* 177 */               Long l2 = cd3Var.f2854f;
/* 179 */               if (!zM7406J) {
/* 209 */                   arrayList.add(Long.valueOf(l2.longValue() / 1000));
/* 212 */                   return;
                        }
/* 186 */               Long lValueOf = Long.valueOf(l2.longValue() / 1000);
/* 194 */               if (arrayList.contains(lValueOf)) {
/* 212 */                   return;
                        }
/* 196 */               arrayList.add(lValueOf);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final zzhg m1161b(int i) {
                    ArrayList arrayList;
                    List list;
/* 1 */             zzhf zzhfVarZzh = zzhg.zzh();
/* 5 */             zzhfVarZzh.zza(i);
/* 10 */            zzhfVarZzh.zzd(this.f2079b);
/* 13 */            zzii zziiVar = this.f2080c;
/* 15 */            if (zziiVar != null) {
/* 17 */                zzhfVarZzh.zzc(zziiVar);
                    }
/* 20 */            zzih zzihVarZzi = zzii.zzi();
/* 30 */            zzihVarZzi.zzc(ci3.m1676h0(this.f2081d));
/* 39 */            zzihVarZzi.zza(ci3.m1676h0(this.f2082e));
/* 43 */            C1024id c1024id = this.f2083f;
/* 45 */            if (c1024id == null) {
/* 47 */                arrayList = null;
                    } else {
/* 53 */                arrayList = new ArrayList(c1024id.f13213c);
/* 70 */                for (Integer num : (xb1) c1024id.keySet()) {
/* 78 */                    int iIntValue = num.intValue();
/* 86 */                    Long l = (Long) c1024id.getOrDefault(num, null);
/* 88 */                    if (l != null) {
/* 90 */                        zzhp zzhpVarZze = zzhq.zze();
/* 94 */                        zzhpVarZze.zza(iIntValue);
/* 101 */                       zzhpVarZze.zzb(l.longValue());
/* 110 */                       arrayList.add((zzhq) zzhpVarZze.zzbc());
                            }
                        }
                    }
/* 114 */           if (arrayList != null) {
/* 116 */               zzihVarZzi.zze(arrayList);
                    }
/* 119 */           C1024id c1024id2 = this.f2084g;
/* 121 */           if (c1024id2 == null) {
/* 123 */               list = Collections.EMPTY_LIST;
                    } else {
/* 130 */               ArrayList arrayList2 = new ArrayList(c1024id2.f13213c);
/* 147 */               for (Integer num2 : (xb1) c1024id2.keySet()) {
/* 155 */                   zzij zzijVarZzf = zzik.zzf();
/* 163 */                   zzijVarZzf.zza(num2.intValue());
/* 170 */                   List list2 = (List) c1024id2.getOrDefault(num2, null);
/* 172 */                   if (list2 != null) {
/* 174 */                       Collections.sort(list2);
/* 177 */                       zzijVarZzf.zzb(list2);
                            }
/* 186 */                   arrayList2.add((zzik) zzijVarZzf.zzbc());
                        }
/* 190 */               list = arrayList2;
                    }
/* 191 */           zzihVarZzi.zzg(list);
/* 194 */           zzhfVarZzh.zzb(zzihVarZzi);
/* 201 */           return (zzhg) zzhfVarZzh.zzbc();
                }

/* 69 */        public as3(fd3 fd3Var, String str) {
                    this.f2085h = fd3Var;
                    this.f2078a = str;
                    this.f2079b = true;
/* 71 */            this.f2081d = new BitSet();
/* 72 */            this.f2082e = new BitSet();
/* 75 */            this.f2083f = new C1024id();
/* 77 */            this.f2084g = new C1024id();
                }
            }
