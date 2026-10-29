            package p000;

            import android.util.Log;
            import com.google.android.gms.internal.measurement.zzff;
            import com.google.android.gms.internal.measurement.zzfh;
            import com.google.android.gms.internal.measurement.zzfl;
            import com.google.android.gms.internal.measurement.zzfn;
            import com.google.android.gms.internal.measurement.zzfr;
            import com.google.android.gms.internal.measurement.zzhs;
            import com.google.android.gms.internal.measurement.zzhw;
            import com.google.android.gms.internal.measurement.zziu;
            import com.google.android.gms.internal.measurement.zzme;
            import com.google.android.gms.internal.measurement.zzpq;
            import java.math.BigDecimal;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.regex.Pattern;
            import java.util.regex.PatternSyntaxException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cd3 {

                /* JADX INFO: renamed from: a */
                public final String f2849a;

                /* JADX INFO: renamed from: b */
                public final int f2850b;

                /* JADX INFO: renamed from: c */
                public Boolean f2851c;

                /* JADX INFO: renamed from: d */
                public Boolean f2852d;

                /* JADX INFO: renamed from: e */
                public Long f2853e;

                /* JADX INFO: renamed from: f */
                public Long f2854f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ int f2855g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ fd3 f2856h;

                /* JADX INFO: renamed from: i */
                public final zzme f2857i;

                public cd3(fd3 fd3Var, String str, int i, zzme zzmeVar, int i2) {
/* 1 */             this.f2855g = i2;
/* 3 */             this.f2856h = fd3Var;
/* 8 */             this.f2849a = str;
/* 10 */            this.f2850b = i;
/* 12 */            this.f2857i = zzmeVar;
                }

                /* JADX INFO: renamed from: c */
                public static Boolean m1636c(Boolean bool, boolean z) {
/* 1 */             if (bool == null) {
/* 3 */                 return null;
                    }
/* 14 */            return Boolean.valueOf(bool.booleanValue() != z);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX INFO: renamed from: d */
                public static Boolean m1637d(String str, zzfr zzfrVar, uh3 uh3Var) {
                    List listZzf;
/* 1 */             kb1.m6061n(zzfrVar);
/* 5 */             if (str != null && zzfrVar.zza() && zzfrVar.zzj() != 1 && (zzfrVar.zzj() != 7 ? zzfrVar.zzb() : zzfrVar.zzg() != 0)) {
/* 44 */                int iZzj = zzfrVar.zzj();
/* 48 */                boolean zZze = zzfrVar.zze();
/* 71 */                String strZzc = (zZze || iZzj == 2 || iZzj == 7) ? zzfrVar.zzc() : zzfrVar.zzc().toUpperCase(Locale.ENGLISH);
/* 79 */                if (zzfrVar.zzg() == 0) {
/* 81 */                    listZzf = null;
                        } else {
/* 83 */                    listZzf = zzfrVar.zzf();
/* 87 */                    if (!zZze) {
/* 95 */                        ArrayList arrayList = new ArrayList(listZzf.size());
/* 98 */                        Iterator it = listZzf.iterator();
/* 106 */                       while (it.hasNext()) {
/* 120 */                           arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                                }
/* 124 */                       listZzf = Collections.unmodifiableList(arrayList);
                            }
                        }
/* 132 */               String str2 = iZzj == 2 ? strZzc : null;
/* 133 */               if (iZzj != 7 ? strZzc != null : listZzf != null && !listZzf.isEmpty()) {
/* 147 */                   if (!zZze && iZzj != 2) {
/* 153 */                       str = str.toUpperCase(Locale.ENGLISH);
                            }
                            switch (iZzj - 1) {
                                case 1:
/* 211 */                           if (str2 != null) {
                                        try {
/* 232 */                                   return Boolean.valueOf(Pattern.compile(str2, true != zZze ? 66 : 0).matcher(str).matches());
                                        } catch (PatternSyntaxException unused) {
/* 237 */                                   if (uh3Var != null) {
/* 243 */                                       uh3Var.f17541w.m8511b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                            }
                                        }
                                    }
                                    break;
                                case 2:
/* 206 */                           return Boolean.valueOf(str.startsWith(strZzc));
                                case 3:
/* 197 */                           return Boolean.valueOf(str.endsWith(strZzc));
                                case 4:
/* 188 */                           return Boolean.valueOf(str.contains(strZzc));
                                case 5:
/* 179 */                           return Boolean.valueOf(str.equals(strZzc));
                                case 6:
/* 163 */                           if (listZzf != null) {
/* 170 */                               return Boolean.valueOf(listZzf.contains(str));
                                    }
                                    break;
                            }
                        }
                    }
/* 4 */             return null;
                }

                /* JADX WARN: Code duplicated, block: B:38:0x0089  */
                /* JADX WARN: Code duplicated, block: B:40:0x008c  */
                /* JADX WARN: Code duplicated, block: B:42:0x008f  */
                /* JADX WARN: Code duplicated, block: B:45:0x0094 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:48:0x009c  */
                /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
                /* JADX WARN: Code duplicated, block: B:54:0x00a9 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
                /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
                /* JADX WARN: Code duplicated, block: B:60:0x00cb  */
                /* JADX WARN: Code duplicated, block: B:63:0x00e4  */
                /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
                /* JADX WARN: Code duplicated, block: B:69:0x00f1  */
                /* JADX WARN: Code duplicated, block: B:72:0x00f7 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
                /* JADX WARN: Code duplicated, block: B:77:0x0101  */
                /* JADX WARN: Code duplicated, block: B:80:0x0107 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:82:0x010a  */
                /* JADX WARN: Code duplicated, block: B:85:0x0111  */
                /* JADX INFO: renamed from: e */
                public static Boolean m1638e(BigDecimal bigDecimal, zzfl zzflVar, double d) {
                    BigDecimal bigDecimal2;
                    BigDecimal bigDecimal3;
                    BigDecimal bigDecimal4;
                    int i;
/* 1 */             kb1.m6061n(zzflVar);
/* 9 */             if (zzflVar.zza()) {
/* 16 */                if (zzflVar.zzm() != 1 && (zzflVar.zzm() != 5 ? zzflVar.zzd() : zzflVar.zzf() && zzflVar.zzh())) {
/* 48 */                    int iZzm = zzflVar.zzm();
                            try {
/* 56 */                        if (zzflVar.zzm() == 5) {
/* 66 */                            if (ci3.m1674f0(zzflVar.zzg()) && ci3.m1674f0(zzflVar.zzi())) {
/* 86 */                                BigDecimal bigDecimal5 = new BigDecimal(zzflVar.zzg());
/* 95 */                                bigDecimal4 = new BigDecimal(zzflVar.zzi());
/* 98 */                                bigDecimal3 = bigDecimal5;
/* 99 */                                bigDecimal2 = null;
/* 124 */                               if (iZzm == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
/* 133 */                                   i = iZzm - 1;
/* 136 */                                   if (i != 1) {
/* 139 */                                       if (i != 2) {
/* 142 */                                           if (i != 3) {
/* 145 */                                               if (i == 4 && bigDecimal3 != null) {
/* 165 */                                                   return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                                        }
                                                    } else if (bigDecimal2 != null) {
/* 178 */                                               if (d != 0.0d) {
/* 230 */                                                   return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                                        }
/* 243 */                                               return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                                    }
                                                } else if (bigDecimal2 != null) {
/* 259 */                                           return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                                }
                                            } else if (bigDecimal2 != null) {
/* 275 */                                       return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                            }
                                        }
                                    }
                                } else if (ci3.m1674f0(zzflVar.zze())) {
/* 119 */                           bigDecimal2 = new BigDecimal(zzflVar.zze());
/* 122 */                           bigDecimal3 = null;
/* 123 */                           bigDecimal4 = null;
/* 124 */                           if (iZzm == 5) {
/* 133 */                               i = iZzm - 1;
/* 136 */                               if (i != 1) {
/* 139 */                                   if (i != 2) {
/* 142 */                                       if (i != 3) {
/* 145 */                                           if (i == 4) {
/* 165 */                                               return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                                    }
                                                } else if (bigDecimal2 != null) {
/* 178 */                                           if (d != 0.0d) {
/* 230 */                                               return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                                    }
/* 243 */                                           return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                                }
                                            } else if (bigDecimal2 != null) {
/* 259 */                                       return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                            }
                                        } else if (bigDecimal2 != null) {
/* 275 */                                   return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                        }
                                    } else {
/* 133 */                               i = iZzm - 1;
/* 136 */                               if (i != 1) {
/* 139 */                                   if (i != 2) {
/* 142 */                                       if (i != 3) {
/* 145 */                                           if (i == 4) {
/* 165 */                                               return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                                    }
                                                } else if (bigDecimal2 != null) {
/* 178 */                                           if (d != 0.0d) {
/* 230 */                                               return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                                    }
/* 243 */                                           return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                                }
                                            } else if (bigDecimal2 != null) {
/* 259 */                                       return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                            }
                                        } else if (bigDecimal2 != null) {
/* 275 */                                   return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                        }
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
/* 8 */             return null;
                }

                /* JADX WARN: Code duplicated, block: B:103:0x0278  */
                /* JADX WARN: Code duplicated, block: B:108:0x0299  */
                /* JADX WARN: Code duplicated, block: B:114:0x02b4  */
                /* JADX WARN: Code duplicated, block: B:118:0x02c1  */
                /* JADX WARN: Code duplicated, block: B:123:0x02dd  */
                /* JADX WARN: Code duplicated, block: B:129:0x02fa  */
                /* JADX WARN: Code duplicated, block: B:134:0x0308  */
                /* JADX WARN: Code duplicated, block: B:136:0x030e  */
                /* JADX WARN: Code duplicated, block: B:137:0x0322  */
                /* JADX WARN: Code duplicated, block: B:139:0x0328  */
                /* JADX WARN: Code duplicated, block: B:141:0x0330  */
                /* JADX WARN: Code duplicated, block: B:143:0x033a  */
                /* JADX WARN: Code duplicated, block: B:150:0x0355  */
                /* JADX WARN: Code duplicated, block: B:153:0x035e  */
                /* JADX WARN: Code duplicated, block: B:158:0x0397  */
                /* JADX WARN: Code duplicated, block: B:159:0x03aa  */
                /* JADX WARN: Code duplicated, block: B:207:0x0342 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:210:0x01a1 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:211:0x01b6 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:212:0x023d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:213:0x01d9 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:214:0x01f7 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:215:0x01df A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:216:0x0215 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:217:0x01fd A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:218:0x0227 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:220:0x01c3 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:224:0x0300 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:225:0x03bc A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:226:0x026a A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:227:0x0287 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:228:0x0169 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:229:0x02ba A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:230:0x0304 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:231:0x02cb A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:232:0x0169 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:233:0x0391 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:234:0x037b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:235:0x0365 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:236:0x016d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:237:0x035b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:238:0x0281 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:239:0x02c5 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:61:0x017e  */
                /* JADX WARN: Code duplicated, block: B:64:0x0191  */
                /* JADX WARN: Code duplicated, block: B:67:0x01ae A[LOOP:1: B:62:0x018b->B:67:0x01ae, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:71:0x01c9  */
                /* JADX WARN: Code duplicated, block: B:77:0x01e9  */
                /* JADX WARN: Code duplicated, block: B:78:0x01f2  */
                /* JADX WARN: Code duplicated, block: B:84:0x0207  */
                /* JADX WARN: Code duplicated, block: B:85:0x0210  */
                /* JADX WARN: Code duplicated, block: B:89:0x021b  */
                /* JADX WARN: Code duplicated, block: B:94:0x024b  */
                /* JADX WARN: Code duplicated, block: B:99:0x025f  */
                /* JADX INFO: renamed from: a */
                public boolean m1639a(Long l, Long l2, zzhs zzhsVar, long j, pe3 pe3Var, boolean z) {
                    HashSet hashSet;
                    Iterator it;
                    C1024id c1024id;
                    Iterator it2;
                    Iterator it3;
                    boolean z2;
                    uh3 uh3Var;
                    Boolean bool;
                    zzfh zzfhVar;
                    boolean z3;
                    String strZzh;
                    Object orDefault;
                    Boolean boolM1638e;
                    Boolean boolM1638e2;
                    String str;
                    zzfl zzflVarZzd;
                    long j2;
                    Boolean boolM1638e3;
                    zzhw zzhwVar;
                    Long lValueOf;
                    Double dValueOf;
                    zzfh zzfhVar2;
                    Boolean boolM1638e4;
                    int i;
/* 1 */             zzpq.zza();
                    fd3 fd3Var = this.f2856h;
                    ij3 ij3Var = (ij3) fd3Var.f16749a;
/* 2 */             pd3 pd3Var = ij3Var.f9651d;
                    uh3 uh3Var2 = ij3Var.f9655f;
                    mh3 mh3Var = ij3Var.f9639U;
/* 3 */             ug3 ug3Var = vg3.f18074F0;
/* 4 */             String str2 = this.f2849a;
                    boolean zM7406J = pd3Var.m7406J(str2, ug3Var);
                    zzff zzffVar = (zzff) this.f2857i;
/* 5 */             long j3 = zzffVar.zzm() ? pe3Var.f15084e : j;
/* 6 */             ij3.m4555l(uh3Var2);
                    sh3 sh3Var = uh3Var2.f17534Y;
                    sh3 sh3Var2 = uh3Var2.f17541w;
/* 7 */             boolean zIsLoggable = Log.isLoggable(uh3Var2.m9021J(), 2);
                    int i2 = this.f2850b;
                    if (zIsLoggable) {
/* 8 */                 ij3.m4555l(uh3Var2);
/* 12 */                sh3Var.m8513d("Evaluating filter. audience, filter, event", Integer.valueOf(i2), zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null, mh3Var.m6656a(zzffVar.zzc()));
/* 13 */                ij3.m4555l(uh3Var2);
/* 15 */                ci3 ci3Var = fd3Var.f15676b.f13923i;
/* 16 */                mp3.m6728S(ci3Var);
/* 17 */                StringBuilder sb = new StringBuilder();
/* 18 */                sb.append("\nevent_filter {\n");
                        if (zzffVar.zza()) {
                            i = 0;
/* 19 */                    ci3.m1669R(sb, 0, "filter_id", Integer.valueOf(zzffVar.zzb()));
                        } else {
                            i = 0;
                        }
/* 23 */                ci3.m1669R(sb, i, "event_name", ((ij3) ci3Var.f16749a).f9639U.m6656a(zzffVar.zzc()));
/* 24 */                String strM1665N = ci3.m1665N(zzffVar.zzi(), zzffVar.zzj(), zzffVar.zzm());
/* 25 */                if (!strM1665N.isEmpty()) {
/* 26 */                    ci3.m1669R(sb, 0, "filter_type", strM1665N);
                        }
                        if (zzffVar.zzg()) {
/* 27 */                    ci3.m1670S(sb, 1, "event_count_filter", zzffVar.zzh());
                        }
/* 28 */                if (zzffVar.zze() > 0) {
/* 29 */                    sb.append("  filters {\n");
/* 30 */                    Iterator it4 = zzffVar.zzd().iterator();
                            while (it4.hasNext()) {
/* 31 */                        ci3Var.m1682K(sb, 2, (zzfh) it4.next());
                            }
                        }
/* 32 */                ci3.m1663L(1, sb);
/* 33 */                sb.append("}\n}\n");
/* 34 */                sh3Var.m8511b(sb.toString(), "Filter definition");
                    }
/* 35 */            if (!zzffVar.zza() || zzffVar.zzb() > 256) {
/* 137 */               ij3.m4555l(uh3Var2);
/* 140 */               sh3Var2.m8512c(uh3.m9013H(str2), "Invalid event filter ID. appId, id", String.valueOf(zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null));
                        return false;
                    }
                    boolean z4 = zzffVar.zzi() || zzffVar.zzj() || zzffVar.zzm();
                    if (z && !z4) {
/* 39 */                ij3.m4555l(uh3Var2);
/* 42 */                sh3Var.m8512c(Integer.valueOf(i2), "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null);
                        return true;
                    }
                    String strZzd = zzhsVar.zzd();
/* 43 */            if (zzffVar.zzg()) {
                        try {
/* 45 */                    boolM1638e4 = m1638e(new BigDecimal(j3), zzffVar.zzh(), 0.0d);
                        } catch (NumberFormatException unused) {
                            boolM1638e4 = null;
                        }
                        if (boolM1638e4 != null) {
/* 46 */                    if (boolM1638e4.booleanValue()) {
/* 48 */                        hashSet = new HashSet();
/* 49 */                        it = zzffVar.zzd().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        zzfhVar2 = (zzfh) it.next();
/* 50 */                                if (zzfhVar2.zzh().isEmpty()) {
/* 51 */                                    ij3.m4555l(uh3Var2);
/* 53 */                                    sh3Var2.m8511b(mh3Var.m6656a(strZzd), "null or empty param name in filter. event");
                                        } else {
/* 54 */                                    hashSet.add(zzfhVar2.zzh());
                                        }
                                    } else {
/* 56 */                                c1024id = new C1024id();
/* 58 */                                it2 = zzhsVar.zza().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                zzhwVar = (zzhw) it2.next();
/* 59 */                                        if (!hashSet.contains(zzhwVar.zzb())) {
/* 60 */                                            if (zzhwVar.zze()) {
/* 61 */                                                String strZzb = zzhwVar.zzb();
                                                        if (zzhwVar.zze()) {
                                                            lValueOf = Long.valueOf(zzhwVar.zzf());
                                                        } else {
                                                            lValueOf = null;
                                                        }
                                                        c1024id.put(strZzb, lValueOf);
                                                    } else if (zzhwVar.zzi()) {
/* 63 */                                                String strZzb2 = zzhwVar.zzb();
                                                        if (zzhwVar.zzi()) {
                                                            dValueOf = Double.valueOf(zzhwVar.zzj());
                                                        } else {
                                                            dValueOf = null;
                                                        }
/* 64 */                                                c1024id.put(strZzb2, dValueOf);
                                                    } else if (zzhwVar.zzc()) {
/* 66 */                                                c1024id.put(zzhwVar.zzb(), zzhwVar.zzd());
                                                    } else {
/* 67 */                                                ij3.m4555l(uh3Var2);
/* 70 */                                                sh3Var2.m8512c(mh3Var.m6656a(strZzd), "Unknown value for param. event, param", mh3Var.m6657b(zzhwVar.zzb()));
                                                    }
                                                }
                                            } else {
/* 71 */                                        it3 = zzffVar.zzd().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        zzfhVar = (zzfh) it3.next();
/* 72 */                                                if (zzfhVar.zze() || !zzfhVar.zzf()) {
                                                            z3 = false;
                                                        } else {
                                                            z3 = true;
                                                        }
/* 73 */                                                strZzh = zzfhVar.zzh();
/* 74 */                                                if (strZzh.isEmpty()) {
/* 75 */                                                    ij3.m4555l(uh3Var2);
/* 77 */                                                    sh3Var2.m8511b(mh3Var.m6656a(strZzd), "Event has empty param name. event");
                                                        } else {
/* 78 */                                                    orDefault = c1024id.getOrDefault(strZzh, null);
/* 79 */                                                    if (orDefault instanceof Long) {
/* 80 */                                                        if (zzfhVar.zzc()) {
                                                                    try {
/* 86 */                                                                boolM1638e = m1638e(new BigDecimal(((Long) orDefault).longValue()), zzfhVar.zzd(), 0.0d);
                                                                    } catch (NumberFormatException unused2) {
                                                                        boolM1638e = null;
                                                                    }
                                                                    if (boolM1638e == null) {
/* 87 */                                                                if (boolM1638e.booleanValue() == z3) {
/* 88 */                                                                    bool = Boolean.FALSE;
                                                                        }
                                                                    }
                                                                } else {
/* 81 */                                                            ij3.m4555l(uh3Var2);
/* 84 */                                                            sh3Var2.m8512c(mh3Var.m6656a(strZzd), "No number filter for long param. event, param", mh3Var.m6657b(strZzh));
                                                                }
                                                            } else if (orDefault instanceof Double) {
/* 90 */                                                        if (zzfhVar.zzc()) {
/* 95 */                                                            double dDoubleValue = ((Double) orDefault).doubleValue();
                                                                    try {
/* 96 */                                                                boolM1638e2 = m1638e(new BigDecimal(dDoubleValue), zzfhVar.zzd(), Math.ulp(dDoubleValue));
                                                                    } catch (NumberFormatException unused3) {
                                                                        boolM1638e2 = null;
                                                                    }
                                                                    if (boolM1638e2 == null) {
/* 97 */                                                                if (boolM1638e2.booleanValue() == z3) {
/* 98 */                                                                    bool = Boolean.FALSE;
                                                                        }
                                                                    }
                                                                } else {
/* 91 */                                                            ij3.m4555l(uh3Var2);
/* 94 */                                                            sh3Var2.m8512c(mh3Var.m6656a(strZzd), "No number filter for double param. event, param", mh3Var.m6657b(strZzh));
                                                                }
                                                            } else if (orDefault instanceof String) {
/* 100 */                                                       if (zzfhVar.zza()) {
                                                                    zzfr zzfrVarZzb = zzfhVar.zzb();
/* 102 */                                                           ij3.m4555l(uh3Var2);
/* 103 */                                                           boolM1638e3 = m1637d((String) orDefault, zzfrVarZzb, uh3Var2);
                                                                    z2 = zM7406J;
                                                                    uh3Var = uh3Var2;
                                                                    j2 = 0;
                                                                } else if (zzfhVar.zzc()) {
/* 105 */                                                           str = (String) orDefault;
                                                                    if (ci3.m1674f0(str)) {
/* 106 */                                                               zzflVarZzd = zzfhVar.zzd();
/* 107 */                                                               if (ci3.m1674f0(str)) {
                                                                            try {
                                                                                z2 = zM7406J;
                                                                                uh3Var = uh3Var2;
                                                                                j2 = 0;
                                                                                try {
/* 108 */                                                                           boolM1638e3 = m1638e(new BigDecimal(str), zzflVarZzd, 0.0d);
                                                                                } catch (NumberFormatException unused4) {
                                                                                    boolM1638e3 = null;
                                                                                }
                                                                            } catch (NumberFormatException unused5) {
                                                                                z2 = zM7406J;
                                                                                uh3Var = uh3Var2;
                                                                                j2 = 0;
                                                                            }
                                                                        } else {
                                                                            z2 = zM7406J;
                                                                            uh3Var = uh3Var2;
                                                                            j2 = 0;
                                                                            boolM1638e3 = null;
                                                                        }
                                                                    } else {
                                                                        z2 = zM7406J;
                                                                        uh3Var = uh3Var2;
/* 111 */                                                               ij3.m4555l(uh3Var);
/* 114 */                                                               sh3Var2.m8512c(mh3Var.m6656a(strZzd), "Invalid param value for number filter. event, param", mh3Var.m6657b(strZzh));
                                                                    }
                                                                } else {
                                                                    z2 = zM7406J;
                                                                    uh3Var = uh3Var2;
/* 115 */                                                           ij3.m4555l(uh3Var);
/* 118 */                                                           sh3Var2.m8512c(mh3Var.m6656a(strZzd), "No filter for String param. event, param", mh3Var.m6657b(strZzh));
                                                                }
                                                                if (boolM1638e3 != null) {
/* 109 */                                                           if (boolM1638e3.booleanValue() == z3) {
/* 110 */                                                               bool = Boolean.FALSE;
                                                                    } else {
                                                                        uh3Var2 = uh3Var;
                                                                        zM7406J = z2;
                                                                    }
                                                                }
                                                            } else {
                                                                z2 = zM7406J;
                                                                uh3Var = uh3Var2;
                                                                if (orDefault == null) {
/* 119 */                                                           ij3.m4555l(uh3Var);
/* 122 */                                                           sh3Var.m8512c(mh3Var.m6656a(strZzd), "Missing param for filter. event, param", mh3Var.m6657b(strZzh));
/* 123 */                                                           bool = Boolean.FALSE;
                                                                } else {
/* 124 */                                                           ij3.m4555l(uh3Var);
/* 127 */                                                           sh3Var2.m8512c(mh3Var.m6656a(strZzd), "Unknown param type. event, param", mh3Var.m6657b(strZzh));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        z2 = zM7406J;
                                                        uh3Var = uh3Var2;
/* 128 */                                               bool = Boolean.TRUE;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z2 = zM7406J;
                                    uh3Var = uh3Var2;
                                }
                            } else {
/* 47 */                        bool = Boolean.FALSE;
                            }
                            z2 = zM7406J;
                            uh3Var = uh3Var2;
                        } else {
                            z2 = zM7406J;
                            uh3Var = uh3Var2;
                        }
                        bool = null;
                    } else {
/* 48 */                hashSet = new HashSet();
/* 49 */                it = zzffVar.zzd().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                zzfhVar2 = (zzfh) it.next();
/* 50 */                        if (zzfhVar2.zzh().isEmpty()) {
/* 51 */                            ij3.m4555l(uh3Var2);
/* 53 */                            sh3Var2.m8511b(mh3Var.m6656a(strZzd), "null or empty param name in filter. event");
                                } else {
/* 54 */                            hashSet.add(zzfhVar2.zzh());
                                }
                            } else {
/* 56 */                        c1024id = new C1024id();
/* 58 */                        it2 = zzhsVar.zza().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        zzhwVar = (zzhw) it2.next();
/* 59 */                                if (!hashSet.contains(zzhwVar.zzb())) {
/* 60 */                                    if (zzhwVar.zze()) {
/* 61 */                                        String strZzb3 = zzhwVar.zzb();
                                                if (zzhwVar.zze()) {
                                                    lValueOf = Long.valueOf(zzhwVar.zzf());
                                                } else {
                                                    lValueOf = null;
                                                }
                                                c1024id.put(strZzb3, lValueOf);
                                            } else if (zzhwVar.zzi()) {
/* 63 */                                        String strZzb4 = zzhwVar.zzb();
                                                if (zzhwVar.zzi()) {
                                                    dValueOf = Double.valueOf(zzhwVar.zzj());
                                                } else {
                                                    dValueOf = null;
                                                }
/* 64 */                                        c1024id.put(strZzb4, dValueOf);
                                            } else if (zzhwVar.zzc()) {
/* 66 */                                        c1024id.put(zzhwVar.zzb(), zzhwVar.zzd());
                                            } else {
/* 67 */                                        ij3.m4555l(uh3Var2);
/* 70 */                                        sh3Var2.m8512c(mh3Var.m6656a(strZzd), "Unknown value for param. event, param", mh3Var.m6657b(zzhwVar.zzb()));
                                            }
                                        }
                                    } else {
/* 71 */                                it3 = zzffVar.zzd().iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                zzfhVar = (zzfh) it3.next();
/* 72 */                                        if (zzfhVar.zze()) {
                                                    z3 = false;
                                                } else {
                                                    z3 = false;
                                                }
/* 73 */                                        strZzh = zzfhVar.zzh();
/* 74 */                                        if (strZzh.isEmpty()) {
/* 75 */                                            ij3.m4555l(uh3Var2);
/* 77 */                                            sh3Var2.m8511b(mh3Var.m6656a(strZzd), "Event has empty param name. event");
                                                } else {
/* 78 */                                            orDefault = c1024id.getOrDefault(strZzh, null);
/* 79 */                                            if (orDefault instanceof Long) {
/* 80 */                                                if (zzfhVar.zzc()) {
/* 81 */                                                    ij3.m4555l(uh3Var2);
/* 84 */                                                    sh3Var2.m8512c(mh3Var.m6656a(strZzd), "No number filter for long param. event, param", mh3Var.m6657b(strZzh));
                                                        } else {
/* 86 */                                                    boolM1638e = m1638e(new BigDecimal(((Long) orDefault).longValue()), zzfhVar.zzd(), 0.0d);
                                                            if (boolM1638e == null) {
/* 87 */                                                        if (boolM1638e.booleanValue() == z3) {
/* 88 */                                                            bool = Boolean.FALSE;
                                                                    z2 = zM7406J;
                                                                    uh3Var = uh3Var2;
                                                                }
                                                            }
                                                        }
                                                    } else if (orDefault instanceof Double) {
/* 90 */                                                if (zzfhVar.zzc()) {
/* 91 */                                                    ij3.m4555l(uh3Var2);
/* 94 */                                                    sh3Var2.m8512c(mh3Var.m6656a(strZzd), "No number filter for double param. event, param", mh3Var.m6657b(strZzh));
                                                        } else {
/* 95 */                                                    double dDoubleValue2 = ((Double) orDefault).doubleValue();
/* 96 */                                                    boolM1638e2 = m1638e(new BigDecimal(dDoubleValue2), zzfhVar.zzd(), Math.ulp(dDoubleValue2));
                                                            if (boolM1638e2 == null) {
/* 97 */                                                        if (boolM1638e2.booleanValue() == z3) {
/* 98 */                                                            bool = Boolean.FALSE;
                                                                    z2 = zM7406J;
                                                                    uh3Var = uh3Var2;
                                                                }
                                                            }
                                                        }
                                                    } else if (orDefault instanceof String) {
/* 100 */                                               if (zzfhVar.zza()) {
                                                            zzfr zzfrVarZzb2 = zzfhVar.zzb();
/* 102 */                                                   ij3.m4555l(uh3Var2);
/* 103 */                                                   boolM1638e3 = m1637d((String) orDefault, zzfrVarZzb2, uh3Var2);
                                                            z2 = zM7406J;
                                                            uh3Var = uh3Var2;
                                                            j2 = 0;
                                                        } else {
/* 104 */                                                   if (zzfhVar.zzc()) {
/* 105 */                                                       str = (String) orDefault;
                                                                if (ci3.m1674f0(str)) {
/* 106 */                                                           zzflVarZzd = zzfhVar.zzd();
/* 107 */                                                           if (ci3.m1674f0(str)) {
                                                                        z2 = zM7406J;
                                                                        uh3Var = uh3Var2;
                                                                        j2 = 0;
                                                                        boolM1638e3 = null;
                                                                    } else {
                                                                        z2 = zM7406J;
                                                                        uh3Var = uh3Var2;
                                                                        j2 = 0;
/* 108 */                                                               boolM1638e3 = m1638e(new BigDecimal(str), zzflVarZzd, 0.0d);
                                                                    }
                                                                } else {
                                                                    z2 = zM7406J;
                                                                    uh3Var = uh3Var2;
/* 111 */                                                           ij3.m4555l(uh3Var);
/* 114 */                                                           sh3Var2.m8512c(mh3Var.m6656a(strZzd), "Invalid param value for number filter. event, param", mh3Var.m6657b(strZzh));
                                                                }
                                                            } else {
                                                                z2 = zM7406J;
                                                                uh3Var = uh3Var2;
/* 115 */                                                       ij3.m4555l(uh3Var);
/* 118 */                                                       sh3Var2.m8512c(mh3Var.m6656a(strZzd), "No filter for String param. event, param", mh3Var.m6657b(strZzh));
                                                            }
                                                            bool = null;
                                                        }
                                                        if (boolM1638e3 != null) {
                                                            bool = null;
                                                        } else if (boolM1638e3.booleanValue() == z3) {
/* 110 */                                                   bool = Boolean.FALSE;
                                                        } else {
                                                            uh3Var2 = uh3Var;
                                                            zM7406J = z2;
                                                        }
                                                    } else {
                                                        z2 = zM7406J;
                                                        uh3Var = uh3Var2;
                                                        if (orDefault == null) {
/* 119 */                                                   ij3.m4555l(uh3Var);
/* 122 */                                                   sh3Var.m8512c(mh3Var.m6656a(strZzd), "Missing param for filter. event, param", mh3Var.m6657b(strZzh));
/* 123 */                                                   bool = Boolean.FALSE;
                                                        } else {
/* 124 */                                                   ij3.m4555l(uh3Var);
/* 127 */                                                   sh3Var2.m8512c(mh3Var.m6656a(strZzd), "Unknown param type. event, param", mh3Var.m6657b(strZzh));
                                                            bool = null;
                                                        }
                                                    }
                                                }
                                            } else {
                                                z2 = zM7406J;
                                                uh3Var = uh3Var2;
/* 128 */                                       bool = Boolean.TRUE;
                                            }
                                        }
                                    }
                                }
                            }
                            z2 = zM7406J;
                            uh3Var = uh3Var2;
                            bool = null;
                        }
                    }
/* 129 */           ij3.m4555l(uh3Var);
/* 130 */           sh3Var.m8511b(bool == null ? "null" : bool, "Event filter result");
                    if (bool == null) {
                        return false;
                    }
/* 131 */           Boolean bool2 = Boolean.TRUE;
                    this.f2851c = bool2;
/* 132 */           if (!bool.booleanValue()) {
                        return true;
                    }
                    this.f2852d = bool2;
                    if (!z4 || !zzhsVar.zze()) {
                        return true;
                    }
/* 133 */           Long lValueOf2 = Long.valueOf(zzhsVar.zzf());
/* 134 */           if (zzffVar.zzj()) {
/* 135 */               if (z2 && zzffVar.zzg()) {
                            lValueOf2 = l;
                        }
                        this.f2854f = lValueOf2;
                        return true;
                    }
/* 136 */           if (z2 && zzffVar.zzg()) {
                        lValueOf2 = l2;
                    }
                    this.f2853e = lValueOf2;
                    return true;
                }

                /* JADX INFO: renamed from: b */
                public boolean m1640b(Long l, Long l2, zziu zziuVar, boolean z) {
                    boolean z2;
                    Boolean boolM1636c;
                    Boolean boolM1638e;
                    Boolean boolM1638e2;
                    Boolean boolM1638e3;
/* 1 */             zzpq.zza();
/* 8 */             ij3 ij3Var = (ij3) this.f2856h.f16749a;
/* 10 */            pd3 pd3Var = ij3Var.f9651d;
/* 12 */            mh3 mh3Var = ij3Var.f9639U;
/* 14 */            uh3 uh3Var = ij3Var.f9655f;
/* 20 */            boolean zM7406J = pd3Var.m7406J(this.f2849a, vg3.f18070D0);
/* 26 */            zzfn zzfnVar = (zzfn) this.f2857i;
/* 28 */            boolean zZze = zzfnVar.zze();
/* 32 */            boolean zZzf = zzfnVar.zzf();
/* 36 */            boolean zZzh = zzfnVar.zzh();
/* 50 */            boolean z3 = zZze || zZzf || zZzh;
/* 51 */            if (z && !z3) {
/* 55 */                ij3.m4555l(uh3Var);
/* 84 */                uh3Var.f17534Y.m8512c(Integer.valueOf(this.f2850b), "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null);
/* 41 */                return true;
                    }
/* 88 */            zzfh zzfhVarZzd = zzfnVar.zzd();
/* 92 */            boolean zZzf2 = zzfhVarZzd.zzf();
/* 102 */           if (!zziuVar.zzf()) {
/* 158 */               z2 = zZzh;
/* 163 */               if (!zziuVar.zzj()) {
/* 223 */                   if (!zziuVar.zzd()) {
/* 340 */                       ij3.m4555l(uh3Var);
/* 355 */                       uh3Var.f17541w.m8511b(mh3Var.m6658c(zziuVar.zzc()), "User property has no value, property");
                            } else if (zzfhVarZzd.zza()) {
/* 320 */                       String strZze = zziuVar.zze();
/* 324 */                       zzfr zzfrVarZzb = zzfhVarZzd.zzb();
/* 328 */                       ij3.m4555l(uh3Var);
/* 335 */                       boolM1636c = m1636c(m1637d(strZze, zzfrVarZzb, uh3Var), zZzf2);
                            } else if (!zzfhVarZzd.zzc()) {
/* 237 */                       ij3.m4555l(uh3Var);
/* 252 */                       uh3Var.f17541w.m8511b(mh3Var.m6658c(zziuVar.zzc()), "No string or number filter defined. property");
                            } else if (ci3.m1674f0(zziuVar.zze())) {
/* 266 */                       String strZze2 = zziuVar.zze();
/* 270 */                       zzfl zzflVarZzd = zzfhVarZzd.zzd();
/* 278 */                       if (ci3.m1674f0(strZze2)) {
                                    try {
/* 287 */                               boolM1638e = m1638e(new BigDecimal(strZze2), zzflVarZzd, 0.0d);
                                    } catch (NumberFormatException unused) {
/* 280 */                               boolM1638e = null;
                                    }
                                } else {
/* 280 */                           boolM1638e = null;
                                }
/* 291 */                       boolM1636c = m1636c(boolM1638e, zZzf2);
                            } else {
/* 296 */                       ij3.m4555l(uh3Var);
/* 315 */                       uh3Var.f17541w.m8512c(mh3Var.m6658c(zziuVar.zzc()), "Invalid user property value for Numeric number filter. property, value", zziuVar.zze());
                            }
/* 129 */                   boolM1636c = null;
                        } else if (zzfhVarZzd.zzc()) {
/* 190 */                   double dZzk = zziuVar.zzk();
                            try {
/* 207 */                       boolM1638e2 = m1638e(new BigDecimal(dZzk), zzfhVarZzd.zzd(), Math.ulp(dZzk));
                            } catch (NumberFormatException unused2) {
/* 212 */                       boolM1638e2 = null;
                            }
/* 213 */                   boolM1636c = m1636c(boolM1638e2, zZzf2);
                        } else {
/* 171 */                   ij3.m4555l(uh3Var);
/* 186 */                   uh3Var.f17541w.m8511b(mh3Var.m6658c(zziuVar.zzc()), "No number filter for double property. property");
/* 129 */                   boolM1636c = null;
                        }
                    } else if (zzfhVarZzd.zzc()) {
/* 132 */               z2 = zZzh;
                        try {
/* 146 */                   boolM1638e3 = m1638e(new BigDecimal(zziuVar.zzg()), zzfhVarZzd.zzd(), 0.0d);
                        } catch (NumberFormatException unused3) {
/* 151 */                   boolM1638e3 = null;
                        }
/* 152 */               boolM1636c = m1636c(boolM1638e3, zZzf2);
                    } else {
/* 110 */               ij3.m4555l(uh3Var);
/* 125 */               uh3Var.f17541w.m8511b(mh3Var.m6658c(zziuVar.zzc()), "No number filter for long property. property");
/* 128 */               z2 = zZzh;
/* 129 */               boolM1636c = null;
                    }
/* 360 */           ij3.m4555l(uh3Var);
/* 373 */           uh3Var.f17534Y.m8511b(boolM1636c == null ? "null" : boolM1636c, "Property filter result");
/* 376 */           if (boolM1636c == null) {
/* 40 */                return false;
                    }
/* 381 */           this.f2851c = Boolean.TRUE;
/* 383 */           if (!z2 || boolM1636c.booleanValue()) {
/* 391 */               if (!z || zzfnVar.zze()) {
/* 399 */                   this.f2852d = boolM1636c;
                        }
/* 405 */               if (boolM1636c.booleanValue() && z3 && zziuVar.zza()) {
/* 415 */                   long jZzb = zziuVar.zzb();
/* 419 */                   if (l != null) {
/* 421 */                       jZzb = l.longValue();
                            }
/* 425 */                   if (zM7406J && zzfnVar.zze() && !zzfnVar.zzf() && l2 != null) {
/* 441 */                       jZzb = l2.longValue();
                            }
/* 449 */                   if (zzfnVar.zzf()) {
/* 455 */                       this.f2854f = Long.valueOf(jZzb);
                            } else {
/* 462 */                       this.f2853e = Long.valueOf(jZzb);
                            }
                        }
                    }
/* 41 */            return true;
                }
            }
