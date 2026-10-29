            package p000;

            import android.content.ContentValues;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteException;
            import android.text.TextUtils;
            import com.google.android.gms.internal.measurement.zzc;
            import com.google.android.gms.internal.measurement.zzd;
            import com.google.android.gms.internal.measurement.zzfc;
            import com.google.android.gms.internal.measurement.zzfd;
            import com.google.android.gms.internal.measurement.zzfe;
            import com.google.android.gms.internal.measurement.zzff;
            import com.google.android.gms.internal.measurement.zzfg;
            import com.google.android.gms.internal.measurement.zzfh;
            import com.google.android.gms.internal.measurement.zzfm;
            import com.google.android.gms.internal.measurement.zzfn;
            import com.google.android.gms.internal.measurement.zzfu;
            import com.google.android.gms.internal.measurement.zzgf;
            import com.google.android.gms.internal.measurement.zzgh;
            import com.google.android.gms.internal.measurement.zzgi;
            import com.google.android.gms.internal.measurement.zzgk;
            import com.google.android.gms.internal.measurement.zzgl;
            import com.google.android.gms.internal.measurement.zzgt;
            import com.google.android.gms.internal.measurement.zziy;
            import com.google.android.gms.internal.measurement.zzja;
            import com.google.android.gms.internal.measurement.zzmq;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vi3 extends wo3 implements od3 {

                /* JADX INFO: renamed from: U */
                public final ri3 f18206U;

                /* JADX INFO: renamed from: V */
                public final ac3 f18207V;

                /* JADX INFO: renamed from: W */
                public final C1024id f18208W;

                /* JADX INFO: renamed from: X */
                public final C1024id f18209X;

                /* JADX INFO: renamed from: Y */
                public final C1024id f18210Y;

                /* JADX INFO: renamed from: d */
                public final C1024id f18211d;

                /* JADX INFO: renamed from: e */
                public final C1024id f18212e;

                /* JADX INFO: renamed from: f */
                public final C1024id f18213f;

                /* JADX INFO: renamed from: i */
                public final C1024id f18214i;

                /* JADX INFO: renamed from: v */
                public final C1024id f18215v;

                /* JADX INFO: renamed from: w */
                public final C1024id f18216w;

                public vi3(mp3 mp3Var) {
/* 1 */             super(mp3Var);
/* 9 */             this.f18211d = new C1024id();
/* 16 */            this.f18212e = new C1024id();
/* 23 */            this.f18213f = new C1024id();
/* 30 */            this.f18214i = new C1024id();
/* 37 */            this.f18215v = new C1024id();
/* 44 */            this.f18208W = new C1024id();
/* 51 */            this.f18209X = new C1024id();
/* 58 */            this.f18210Y = new C1024id();
/* 65 */            this.f18216w = new C1024id();
/* 72 */            this.f18206U = new ri3(this);
/* 80 */            this.f18207V = new ac3(this, 5);
                }

                /* JADX INFO: renamed from: J */
                public static final C1024id m9278J(zzgl zzglVar) {
/* 3 */             C1024id c1024id = new C1024id();
/* 6 */             if (zzglVar != null) {
/* 20 */                for (zzgt zzgtVar : zzglVar.zze()) {
/* 36 */                    c1024id.put(zzgtVar.zza(), zzgtVar.zzb());
                        }
                    }
/* 40 */            return c1024id;
                }

                /* JADX INFO: renamed from: K */
                public static final nk3 m9279K(int i) {
/* 1 */             int i2 = i - 1;
/* 4 */             if (i2 == 1) {
/* 26 */                return nk3.AD_STORAGE;
                    }
/* 7 */             if (i2 == 2) {
/* 23 */                return nk3.ANALYTICS_STORAGE;
                    }
/* 10 */            if (i2 == 3) {
/* 20 */                return nk3.AD_USER_DATA;
                    }
/* 13 */            if (i2 != 4) {
/* 15 */                return null;
                    }
/* 17 */            return nk3.AD_PERSONALIZATION;
                }

                @Override // p000.wo3
                /* JADX INFO: renamed from: C */
                public final void mo216C() {
                }

                /* JADX INFO: renamed from: D */
                public final lk3 m9280D(String str, nk3 nk3Var) {
/* 1 */             mo1375y();
/* 4 */             m9282F(str);
/* 7 */             zzgf zzgfVarM9295U = m9295U(str);
/* 11 */            if (zzgfVarM9295U != null) {
/* 26 */                for (zzfu zzfuVar : zzgfVarM9295U.zzf()) {
/* 42 */                    if (m9279K(zzfuVar.zzb()) == nk3Var) {
/* 48 */                        int iZzc = zzfuVar.zzc() - 1;
/* 51 */                        if (iZzc == 1) {
/* 60 */                            return lk3.GRANTED;
                                }
/* 54 */                        if (iZzc != 2) {
                                    break;
                                }
/* 57 */                        return lk3.DENIED;
                            }
                        }
                    }
/* 63 */            return lk3.UNINITIALIZED;
                }

                /* JADX INFO: renamed from: E */
                public final boolean m9281E(String str) {
/* 1 */             mo1375y();
/* 4 */             m9282F(str);
/* 7 */             zzgf zzgfVarM9295U = m9295U(str);
/* 12 */            if (zzgfVarM9295U == null) {
/* 11 */                return false;
                    }
/* 27 */            for (zzfu zzfuVar : zzgfVarM9295U.zza()) {
/* 40 */                if (zzfuVar.zzb() == 3 && zzfuVar.zzd() == 3) {
/* 48 */                    return true;
                        }
                    }
/* 11 */            return false;
                }

                /* JADX INFO: renamed from: F */
                public final void m9282F(String str) {
/* 1 */             m9593A();
/* 4 */             mo1375y();
/* 7 */             kb1.m6058k(str);
/* 10 */            C1024id c1024id = this.f18215v;
/* 17 */            if (c1024id.getOrDefault(str, null) == null) {
/* 21 */                ae3 ae3Var = this.f15676b.f13913c;
/* 23 */                mp3.m6728S(ae3Var);
/* 26 */                ac1 ac1VarM227H0 = ae3Var.m227H0(str);
/* 30 */                C1024id c1024id2 = this.f18210Y;
/* 32 */                C1024id c1024id3 = this.f18209X;
/* 34 */                C1024id c1024id4 = this.f18208W;
/* 36 */                C1024id c1024id5 = this.f18211d;
/* 38 */                if (ac1VarM227H0 != null) {
/* 88 */                    zzgk zzgkVar = (zzgk) m9285I(str, (byte[]) ac1VarM227H0.f177b).zzcl();
/* 90 */                    m9283G(str, zzgkVar);
/* 103 */                   c1024id5.put(str, m9278J((zzgl) zzgkVar.zzbc()));
/* 112 */                   c1024id.put(str, (zzgl) zzgkVar.zzbc());
/* 121 */                   m9284H(str, (zzgl) zzgkVar.zzbc());
/* 128 */                   c1024id4.put(str, zzgkVar.zzh());
/* 135 */                   c1024id3.put(str, (String) ac1VarM227H0.f178c);
/* 142 */                   c1024id2.put(str, (String) ac1VarM227H0.f179d);
/* 145 */                   return;
                        }
/* 40 */                c1024id5.put(str, null);
/* 45 */                this.f18213f.put(str, null);
/* 50 */                this.f18212e.put(str, null);
/* 55 */                this.f18214i.put(str, null);
/* 58 */                c1024id.put(str, null);
/* 61 */                c1024id4.put(str, null);
/* 64 */                c1024id3.put(str, null);
/* 67 */                c1024id2.put(str, null);
/* 72 */                this.f18216w.put(str, null);
                    }
                }

                /* JADX INFO: renamed from: G */
                public final void m9283G(String str, zzgk zzgkVar) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 7 */             HashSet hashSet = new HashSet();
/* 12 */            C1024id c1024id = new C1024id();
/* 17 */            C1024id c1024id2 = new C1024id();
/* 22 */            C1024id c1024id3 = new C1024id();
/* 29 */            Iterator it = zzgkVar.zzg().iterator();
/* 37 */            while (it.hasNext()) {
/* 49 */                hashSet.add(((zzgh) it.next()).zza());
                    }
/* 58 */            for (int i = 0; i < zzgkVar.zza(); i++) {
/* 68 */                zzgi zzgiVar = (zzgi) zzgkVar.zzb(i).zzcl();
/* 78 */                if (zzgiVar.zza().isEmpty()) {
/* 80 */                    uh3 uh3Var = ij3Var.f9655f;
/* 82 */                    ij3.m4555l(uh3Var);
/* 89 */                    uh3Var.f17541w.m8510a("EventConfig contained null event name");
                        } else {
/* 94 */                    String strZza = zzgiVar.zza();
/* 106 */                   String strM7889V = qj3.m7889V(zzgiVar.zza(), i13.f9403f, i13.f9405h);
/* 114 */                   if (!TextUtils.isEmpty(strM7889V)) {
/* 116 */                       zzgiVar.zzb(strM7889V);
/* 119 */                       zzgkVar.zzc(i, zzgiVar);
                            }
/* 126 */                   if (zzgiVar.zzc() && zzgiVar.zzd()) {
/* 136 */                       c1024id.put(strZza, Boolean.TRUE);
                            }
/* 143 */                   if (zzgiVar.zze() && zzgiVar.zzf()) {
/* 157 */                       c1024id2.put(zzgiVar.zza(), Boolean.TRUE);
                            }
/* 164 */                   if (zzgiVar.zzg()) {
/* 171 */                       if (zzgiVar.zzh() < 2 || zzgiVar.zzh() > 65535) {
/* 199 */                           uh3 uh3Var2 = ij3Var.f9655f;
/* 201 */                           ij3.m4555l(uh3Var2);
/* 220 */                           uh3Var2.f17541w.m8512c(zzgiVar.zza(), "Invalid sampling rate. Event name, sample rate", Integer.valueOf(zzgiVar.zzh()));
                                } else {
/* 195 */                           c1024id3.put(zzgiVar.zza(), Integer.valueOf(zzgiVar.zzh()));
                                }
                            }
                        }
                    }
/* 229 */           this.f18212e.put(str, hashSet);
/* 234 */           this.f18213f.put(str, c1024id);
/* 239 */           this.f18214i.put(str, c1024id2);
/* 244 */           this.f18216w.put(str, c1024id3);
                }

                /* JADX INFO: renamed from: H */
                public final void m9284H(String str, zzgl zzglVar) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             int iZzj = zzglVar.zzj();
/* 9 */             ri3 ri3Var = this.f18206U;
/* 11 */            if (iZzj == 0) {
/* 160 */               ri3Var.remove(str);
/* 163 */               return;
                    }
/* 13 */            uh3 uh3Var = ij3Var.f9655f;
/* 15 */            ij3.m4555l(uh3Var);
/* 30 */            uh3Var.f17534Y.m8511b(Integer.valueOf(zzglVar.zzj()), "EES programs found");
/* 37 */            int i = 0;
/* 42 */            zzja zzjaVar = (zzja) zzglVar.zzi().get(0);
                    try {
/* 46 */                zzc zzcVar = new zzc();
/* 57 */                zzcVar.zza("internal.remoteConfig", new ui3(this, str, 2));
/* 67 */                zzcVar.zza("internal.appMetadata", new ui3(this, str, i));
/* 78 */                zzcVar.zza("internal.logger", new CallableC2139rc(this, 7));
/* 81 */                zzcVar.zzf(zzjaVar);
/* 84 */                ri3Var.put(str, zzcVar);
/* 87 */                ij3.m4555l(uh3Var);
/* 90 */                sh3 sh3Var = uh3Var.f17534Y;
/* 106 */               sh3Var.m8512c(str, "EES program loaded for appId, activities", Integer.valueOf(zzjaVar.zzb().zzb()));
/* 125 */               for (zziy zziyVar : zzjaVar.zzb().zza()) {
/* 133 */                   ij3.m4555l(uh3Var);
/* 142 */                   sh3Var.m8511b(zziyVar.zza(), "EES program activity");
                        }
                    } catch (zzd unused) {
/* 147 */               uh3 uh3Var2 = ij3Var.f9655f;
/* 149 */               ij3.m4555l(uh3Var2);
/* 156 */               uh3Var2.f17538f.m8511b(str, "Failed to load EES program. appId");
                    }
                }

                /* JADX INFO: renamed from: I */
                public final zzgl m9285I(String str, byte[] bArr) {
/* 5 */             ij3 ij3Var = (ij3) this.f16749a;
/* 7 */             if (bArr == null) {
/* 9 */                 return zzgl.zzs();
                    }
                    try {
/* 28 */                zzgl zzglVar = (zzgl) ((zzgk) ci3.m1677m0(zzgl.zzr(), bArr)).zzbc();
/* 30 */                uh3 uh3Var = ij3Var.f9655f;
/* 32 */                ij3.m4555l(uh3Var);
/* 70 */                uh3Var.f17534Y.m8512c(zzglVar.zza() ? Long.valueOf(zzglVar.zzb()) : null, "Parsed config. version, gmp_app_id", zzglVar.zzc() ? zzglVar.zzd() : null);
/* 73 */                return zzglVar;
                    } catch (zzmq e) {
/* 93 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 95 */                ij3.m4555l(uh3Var2);
/* 104 */               uh3Var2.f17541w.m8512c(uh3.m9013H(str), "Unable to merge remote config. appId", e);
/* 107 */               return zzgl.zzs();
                    } catch (RuntimeException e2) {
/* 74 */                uh3 uh3Var3 = ij3Var.f9655f;
/* 76 */                ij3.m4555l(uh3Var3);
/* 85 */                uh3Var3.f17541w.m8512c(uh3.m9013H(str), "Unable to merge remote config. appId", e2);
/* 88 */                return zzgl.zzs();
                    }
                }

                /* JADX INFO: renamed from: L */
                public final zzgl m9286L(String str) {
/* 1 */             m9593A();
/* 4 */             mo1375y();
/* 7 */             kb1.m6058k(str);
/* 10 */            m9282F(str);
/* 20 */            return (zzgl) this.f18215v.getOrDefault(str, null);
                }

                /* JADX INFO: renamed from: M */
                public final String m9287M(String str) {
/* 1 */             mo1375y();
/* 4 */             m9282F(str);
/* 14 */            return (String) this.f18208W.getOrDefault(str, null);
                }

                /* JADX INFO: renamed from: N */
                public final void m9288N(String str, String str2, String str3, byte[] bArr) throws Throwable {
                    SQLiteDatabase sQLiteDatabase;
                    byte[] bArrZzcc;
                    Iterator it;
                    int i;
                    boolean z;
/* 9 */             m9593A();
/* 12 */            mo1375y();
/* 15 */            kb1.m6058k(str);
/* 29 */            zzgk zzgkVar = (zzgk) m9285I(str, bArr).zzcl();
/* 31 */            m9283G(str, zzgkVar);
/* 40 */            m9284H(str, (zzgl) zzgkVar.zzbc());
/* 47 */            zzgl zzglVar = (zzgl) zzgkVar.zzbc();
/* 49 */            C1024id c1024id = this.f18215v;
/* 51 */            c1024id.put(str, zzglVar);
/* 60 */            this.f18208W.put(str, zzgkVar.zzh());
/* 65 */            this.f18209X.put(str, str2);
/* 70 */            this.f18210Y.put(str, str3);
/* 85 */            this.f18211d.put(str, m9278J((zzgl) zzgkVar.zzbc()));
/* 88 */            mp3 mp3Var = this.f15676b;
/* 90 */            ae3 ae3Var = mp3Var.f13913c;
/* 92 */            mp3.m6728S(ae3Var);
/* 101 */           ArrayList<zzfd> arrayList = new ArrayList(zzgkVar.zzd());
/* 114 */           ij3 ij3Var = (ij3) ae3Var.f16749a;
/* 116 */           int i2 = 0;
/* 121 */           while (i2 < arrayList.size()) {
/* 133 */               zzfc zzfcVar = (zzfc) ((zzfd) arrayList.get(i2)).zzcl();
/* 139 */               if (zzfcVar.zzd() != 0) {
/* 145 */                   int i3 = 0;
/* 150 */                   while (i3 < zzfcVar.zzd()) {
/* 160 */                       zzfe zzfeVar = (zzfe) zzfcVar.zze(i3).zzcl();
/* 168 */                       zzfe zzfeVar2 = (zzfe) zzfeVar.clone();
/* 174 */                       mp3 mp3Var2 = mp3Var;
/* 180 */                       String strM7889V = qj3.m7889V(zzfeVar.zza(), i13.f9403f, i13.f9405h);
/* 184 */                       if (strM7889V != null) {
/* 186 */                           zzfeVar2.zzb(strM7889V);
/* 189 */                           z = true;
                                } else {
/* 191 */                           z = false;
                                }
/* 192 */                       int i4 = 0;
/* 197 */                       while (i4 < zzfeVar.zzc()) {
/* 199 */                           zzfh zzfhVarZzd = zzfeVar.zzd(i4);
/* 203 */                           boolean z2 = z;
/* 213 */                           zzfe zzfeVar3 = zzfeVar;
/* 217 */                           String strM7889V2 = qj3.m7889V(zzfhVarZzd.zzh(), j13.f12006p, j13.f12007q);
/* 221 */                           if (strM7889V2 != null) {
/* 227 */                               zzfg zzfgVar = (zzfg) zzfhVarZzd.zzcl();
/* 229 */                               zzfgVar.zza(strM7889V2);
/* 238 */                               zzfeVar2.zze(i4, (zzfh) zzfgVar.zzbc());
/* 241 */                               z = true;
                                    } else {
/* 243 */                               z = z2;
                                    }
/* 245 */                           i4++;
/* 247 */                           zzfeVar = zzfeVar3;
                                }
/* 252 */                       if (z) {
/* 254 */                           zzfcVar.zzf(i3, zzfeVar2);
/* 263 */                           arrayList.set(i2, (zzfd) zzfcVar.zzbc());
                                }
/* 266 */                       i3++;
/* 274 */                       mp3Var = mp3Var2;
                            }
                        }
/* 278 */               mp3 mp3Var3 = mp3Var;
/* 290 */               if (zzfcVar.zza() != 0) {
/* 297 */                   for (int i5 = 0; i5 < zzfcVar.zza(); i5++) {
/* 299 */                       zzfn zzfnVarZzb = zzfcVar.zzb(i5);
/* 311 */                       String strM7889V3 = qj3.m7889V(zzfnVarZzb.zzc(), mn0.f13873h, mn0.f13874i);
/* 315 */                       if (strM7889V3 != null) {
/* 321 */                           zzfm zzfmVar = (zzfm) zzfnVarZzb.zzcl();
/* 323 */                           zzfmVar.zza(strM7889V3);
/* 326 */                           zzfcVar.zzc(i5, zzfmVar);
/* 335 */                           arrayList.set(i2, (zzfd) zzfcVar.zzbc());
                                }
                            }
                        }
/* 341 */               i2++;
/* 349 */               zzgkVar = zzgkVar;
/* 351 */               c1024id = c1024id;
/* 353 */               mp3Var = mp3Var3;
                    }
/* 357 */           zzgk zzgkVar2 = zzgkVar;
/* 359 */           C1024id c1024id2 = c1024id;
/* 361 */           mp3 mp3Var4 = mp3Var;
/* 363 */           ae3Var.m9593A();
/* 366 */           ae3Var.mo1375y();
/* 369 */           kb1.m6058k(str);
/* 372 */           SQLiteDatabase sQLiteDatabaseM261q0 = ae3Var.m261q0();
/* 376 */           sQLiteDatabaseM261q0.beginTransaction();
                    try {
/* 379 */               ae3Var.m9593A();
/* 382 */               ae3Var.mo1375y();
/* 385 */               kb1.m6058k(str);
/* 388 */               SQLiteDatabase sQLiteDatabaseM261q1 = ae3Var.m261q0();
/* 396 */               sQLiteDatabaseM261q1.delete("property_filters", "app_id=?", new String[]{str});
/* 403 */               sQLiteDatabaseM261q1.delete("event_filters", "app_id=?", new String[]{str});
/* 406 */               Iterator it2 = arrayList.iterator();
/* 414 */               while (it2.hasNext()) {
/* 420 */                   zzfd zzfdVar = (zzfd) it2.next();
/* 422 */                   ae3Var.m9593A();
/* 425 */                   ae3Var.mo1375y();
/* 428 */                   kb1.m6058k(str);
/* 431 */                   kb1.m6061n(zzfdVar);
/* 438 */                   if (zzfdVar.zza()) {
/* 462 */                       int iZzb = zzfdVar.zzb();
/* 470 */                       Iterator it3 = zzfdVar.zzf().iterator();
                                while (true) {
/* 478 */                           if (it3.hasNext()) {
/* 490 */                               if (!((zzff) it3.next()).zza()) {
/* 492 */                                   uh3 uh3Var = ij3Var.f9655f;
/* 494 */                                   ij3.m4555l(uh3Var);
/* 509 */                                   uh3Var.f17541w.m8512c(uh3.m9013H(str), "Event filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iZzb));
                                            break;
                                        }
                                    } else {
/* 517 */                               Iterator it4 = zzfdVar.zzc().iterator();
                                        while (true) {
/* 525 */                                   if (!it4.hasNext()) {
/* 565 */                                       Iterator it5 = zzfdVar.zzf().iterator();
                                                while (true) {
/* 581 */                                           zzfd zzfdVar2 = zzfdVar;
/* 583 */                                           String str4 = "audience_id";
/* 585 */                                           sQLiteDatabase = sQLiteDatabaseM261q0;
/* 587 */                                           String str5 = "app_id";
/* 589 */                                           if (!it5.hasNext()) {
/* 803 */                                               it = it2;
/* 805 */                                               i = iZzb;
/* 819 */                                               for (zzfn zzfnVar : zzfdVar2.zzc()) {
/* 827 */                                                   ae3Var.m9593A();
/* 830 */                                                   ae3Var.mo1375y();
/* 833 */                                                   kb1.m6058k(str);
/* 836 */                                                   kb1.m6061n(zzfnVar);
/* 847 */                                                   if (zzfnVar.zzc().isEmpty()) {
/* 849 */                                                       uh3 uh3Var2 = ij3Var.f9655f;
/* 851 */                                                       ij3.m4555l(uh3Var2);
/* 886 */                                                       uh3Var2.f17541w.m8513d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", uh3.m9013H(str), Integer.valueOf(i), String.valueOf(zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null));
                                                            } else {
/* 891 */                                                       byte[] bArrZzcc2 = zzfnVar.zzcc();
/* 897 */                                                       ContentValues contentValues = new ContentValues();
/* 900 */                                                       contentValues.put(str5, str);
/* 903 */                                                       String str6 = str5;
/* 909 */                                                       contentValues.put(str4, Integer.valueOf(i));
/* 928 */                                                       contentValues.put("filter_id", zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null);
/* 933 */                                                       String str7 = str4;
/* 939 */                                                       contentValues.put("property_name", zzfnVar.zzc());
/* 958 */                                                       contentValues.put("session_scoped", zzfnVar.zzg() ? Boolean.valueOf(zzfnVar.zzh()) : null);
/* 961 */                                                       contentValues.put(SharedDataContentProvider.BASE_PATH, bArrZzcc2);
                                                                try {
/* 976 */                                                           if (ae3Var.m261q0().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
/* 978 */                                                               uh3 uh3Var3 = ij3Var.f9655f;
/* 980 */                                                               ij3.m4555l(uh3Var3);
/* 991 */                                                               uh3Var3.f17538f.m8511b(uh3.m9013H(str), "Failed to insert property filter (got -1). appId");
                                                                    } else {
/* 997 */                                                               str5 = str6;
/* 999 */                                                               str4 = str7;
                                                                    }
                                                                } catch (SQLiteException e) {
/* 1003 */                                                          uh3 uh3Var4 = ij3Var.f9655f;
/* 1005 */                                                          ij3.m4555l(uh3Var4);
/* 1016 */                                                          uh3Var4.f17538f.m8512c(uh3.m9013H(str), "Error storing property filter. appId", e);
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    try {
/* 595 */                                               zzff zzffVar = (zzff) it5.next();
/* 597 */                                               ae3Var.m9593A();
/* 600 */                                               ae3Var.mo1375y();
/* 603 */                                               kb1.m6058k(str);
/* 606 */                                               kb1.m6061n(zzffVar);
/* 617 */                                               if (zzffVar.zzc().isEmpty()) {
/* 619 */                                                   uh3 uh3Var5 = ij3Var.f9655f;
/* 621 */                                                   ij3.m4555l(uh3Var5);
/* 662 */                                                   uh3Var5.f17541w.m8513d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", uh3.m9013H(str), Integer.valueOf(iZzb), String.valueOf(zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null));
/* 665 */                                                   it = it2;
/* 667 */                                                   i = iZzb;
                                                        } else {
/* 671 */                                                   it = it2;
/* 673 */                                                   byte[] bArrZzcc3 = zzffVar.zzcc();
/* 677 */                                                   i = iZzb;
/* 681 */                                                   ContentValues contentValues2 = new ContentValues();
/* 684 */                                                   contentValues2.put("app_id", str);
/* 691 */                                                   contentValues2.put("audience_id", Integer.valueOf(i));
/* 710 */                                                   contentValues2.put("filter_id", zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null);
/* 719 */                                                   contentValues2.put("event_name", zzffVar.zzc());
/* 738 */                                                   contentValues2.put("session_scoped", zzffVar.zzk() ? Boolean.valueOf(zzffVar.zzm()) : null);
/* 741 */                                                   contentValues2.put(SharedDataContentProvider.BASE_PATH, bArrZzcc3);
                                                            try {
/* 756 */                                                       if (ae3Var.m261q0().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
/* 758 */                                                           uh3 uh3Var6 = ij3Var.f9655f;
/* 760 */                                                           ij3.m4555l(uh3Var6);
/* 771 */                                                           uh3Var6.f17538f.m8511b(uh3.m9013H(str), "Failed to insert event filter (got -1). appId");
                                                                }
/* 774 */                                                       zzfdVar = zzfdVar2;
/* 776 */                                                       sQLiteDatabaseM261q0 = sQLiteDatabase;
/* 778 */                                                       it2 = it;
/* 780 */                                                       iZzb = i;
                                                            } catch (SQLiteException e2) {
/* 785 */                                                       uh3 uh3Var7 = ij3Var.f9655f;
/* 787 */                                                       ij3.m4555l(uh3Var7);
/* 798 */                                                       uh3Var7.f17538f.m8512c(uh3.m9013H(str), "Error storing event filter. appId", e2);
                                                            }
                                                        }
                                                    } catch (Throwable th) {
/* 653 */                                               th = th;
/* 1446 */                                              sQLiteDatabase.endTransaction();
/* 1449 */                                              throw th;
                                                    }
/* 1019 */                                          ae3Var.m9593A();
/* 1022 */                                          ae3Var.mo1375y();
/* 1025 */                                          kb1.m6058k(str);
/* 1028 */                                          SQLiteDatabase sQLiteDatabaseM261q2 = ae3Var.m261q0();
/* 1040 */                                          sQLiteDatabaseM261q2.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
/* 1051 */                                          sQLiteDatabaseM261q2.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                                    break;
                                                }
/* 1054 */                                      sQLiteDatabaseM261q0 = sQLiteDatabase;
/* 1056 */                                      it2 = it;
                                                break;
                                            }
/* 537 */                                   if (!((zzfn) it4.next()).zza()) {
/* 539 */                                       uh3 uh3Var8 = ij3Var.f9655f;
/* 541 */                                       ij3.m4555l(uh3Var8);
/* 556 */                                       uh3Var8.f17541w.m8512c(uh3.m9013H(str), "Property filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iZzb));
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
/* 440 */                       uh3 uh3Var9 = ij3Var.f9655f;
/* 442 */                       ij3.m4555l(uh3Var9);
/* 453 */                       uh3Var9.f17541w.m8511b(uh3.m9013H(str), "Audience with no ID. appId");
                            }
                        }
/* 1060 */              sQLiteDatabase = sQLiteDatabaseM261q0;
/* 1065 */              ArrayList arrayList2 = new ArrayList();
/* 1076 */              for (zzfd zzfdVar3 : arrayList) {
/* 1100 */                  arrayList2.add(zzfdVar3.zza() ? Integer.valueOf(zzfdVar3.zzb()) : null);
                        }
/* 1112 */              kb1.m6058k(str);
/* 1115 */              ae3Var.m9593A();
/* 1118 */              ae3Var.mo1375y();
/* 1121 */              SQLiteDatabase sQLiteDatabaseM261q3 = ae3Var.m261q0();
                        try {
/* 1131 */                  long jM242V = ae3Var.m242V("select count(1) from audience_filter_values where app_id=?", new String[]{str});
/* 1150 */                  int iMax = Math.max(0, Math.min(2000, ij3Var.f9651d.m7404H(str, vg3.f18103U)));
/* 1157 */                  if (jM242V > iMax) {
/* 1163 */                      ArrayList arrayList3 = new ArrayList();
/* 1166 */                      int i6 = 0;
                                while (true) {
/* 1171 */                          if (i6 >= arrayList2.size()) {
/* 1197 */                              String strJoin = TextUtils.join(",", arrayList3);
/* 1213 */                              StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
/* 1216 */                              sb.append("(");
/* 1219 */                              sb.append(strJoin);
/* 1222 */                              sb.append(")");
/* 1225 */                              String string = sb.toString();
/* 1239 */                              StringBuilder sb2 = new StringBuilder(string.length() + 140);
/* 1242 */                              sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
/* 1245 */                              sb2.append(string);
/* 1248 */                              sb2.append(" order by rowid desc limit -1 offset ?)");
/* 1263 */                              sQLiteDatabaseM261q3.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                                        break;
                                    }
/* 1177 */                          Integer num = (Integer) arrayList2.get(i6);
/* 1179 */                          if (num == null) {
                                        break;
                                    }
/* 1189 */                          arrayList3.add(Integer.toString(num.intValue()));
/* 1192 */                          i6++;
                                }
                            }
                        } catch (SQLiteException e3) {
/* 1268 */                  uh3 uh3Var10 = ij3Var.f9655f;
/* 1270 */                  ij3.m4555l(uh3Var10);
/* 1281 */                  uh3Var10.f17538f.m8512c(uh3.m9013H(str), "Database error querying filters. appId", e3);
                        }
/* 1284 */              sQLiteDatabase.setTransactionSuccessful();
/* 1287 */              sQLiteDatabase.endTransaction();
                        try {
/* 1290 */                  zzgkVar2.zze();
/* 1299 */                  bArrZzcc = ((zzgl) zzgkVar2.zzbc()).zzcc();
                        } catch (RuntimeException e4) {
/* 1313 */                  uh3 uh3Var11 = ((ij3) this.f16749a).f9655f;
/* 1315 */                  ij3.m4555l(uh3Var11);
/* 1326 */                  uh3Var11.f17541w.m8512c(uh3.m9013H(str), "Unable to serialize reduced-size config. Storing full config instead. appId", e4);
/* 1329 */                  bArrZzcc = bArr;
                        }
/* 1332 */              ae3 ae3Var2 = mp3Var4.f13913c;
/* 1334 */              mp3.m6728S(ae3Var2);
/* 1339 */              ij3 ij3Var2 = (ij3) ae3Var2.f16749a;
/* 1341 */              kb1.m6058k(str);
/* 1344 */              ae3Var2.mo1375y();
/* 1347 */              ae3Var2.m9593A();
/* 1352 */              ContentValues contentValues3 = new ContentValues();
/* 1357 */              contentValues3.put("remote_config", bArrZzcc);
/* 1364 */              contentValues3.put("config_last_modified_time", str2);
/* 1371 */              contentValues3.put("e_tag", str3);
                        try {
/* 1395 */                  if (ae3Var2.m261q0().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
/* 1397 */                      uh3 uh3Var12 = ij3Var2.f9655f;
/* 1399 */                      ij3.m4555l(uh3Var12);
/* 1410 */                      uh3Var12.f17538f.m8511b(uh3.m9013H(str), "Failed to update remote config (got 0). appId");
                            }
                        } catch (SQLiteException e5) {
/* 1415 */                  uh3 uh3Var13 = ij3Var2.f9655f;
/* 1417 */                  ij3.m4555l(uh3Var13);
/* 1428 */                  uh3Var13.f17538f.m8512c(uh3.m9013H(str), "Error storing remote config. appId", e5);
                        }
/* 1431 */              zzgkVar2.zzf();
/* 1442 */              c1024id2.put(str, (zzgl) zzgkVar2.zzbc());
                    } catch (Throwable th2) {
/* 457 */               th = th2;
/* 458 */               sQLiteDatabase = sQLiteDatabaseM261q0;
                    }
                }

                /* JADX INFO: renamed from: O */
                public final boolean m9289O(String str, String str2) {
                    Boolean bool;
/* 1 */             mo1375y();
/* 4 */             m9282F(str);
/* 19 */            if ("1".equals(mo7139d(str, "measurement.upload.blacklist_internal")) && up3.m9067X(str2)) {
/* 46 */                return true;
                    }
/* 37 */            if ("1".equals(mo7139d(str, "measurement.upload.blacklist_public")) && up3.m9074x0(str2)) {
/* 46 */                return true;
                    }
/* 55 */            Map map = (Map) this.f18213f.getOrDefault(str, null);
/* 57 */            if (map == null || (bool = (Boolean) map.get(str2)) == null) {
/* 73 */                return false;
                    }
/* 68 */            return bool.booleanValue();
                }

                /* JADX INFO: renamed from: P */
                public final boolean m9290P(String str, String str2) {
                    Boolean bool;
/* 1 */             mo1375y();
/* 4 */             m9282F(str);
/* 13 */            if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
/* 60 */                return true;
                    }
/* 40 */            Map map = (Map) this.f18214i.getOrDefault(str, null);
/* 42 */            if (map == null || (bool = (Boolean) map.get(str2)) == null) {
/* 58 */                return false;
                    }
/* 53 */            return bool.booleanValue();
                }

                /* JADX INFO: renamed from: Q */
                public final int m9291Q(String str, String str2) {
                    Integer num;
/* 1 */             mo1375y();
/* 4 */             m9282F(str);
/* 14 */            Map map = (Map) this.f18216w.getOrDefault(str, null);
/* 16 */            if (map == null || (num = (Integer) map.get(str2)) == null) {
/* 32 */                return 1;
                    }
/* 27 */            return num.intValue();
                }

                /* JADX INFO: renamed from: R */
                public final boolean m9292R(String str) {
/* 1 */             mo1375y();
/* 4 */             m9282F(str);
/* 7 */             C1024id c1024id = this.f18212e;
/* 14 */            if (c1024id.getOrDefault(str, null) != null) {
                        return ((Set) c1024id.getOrDefault(str, null)).contains("os_version") || ((Set) c1024id.getOrDefault(str, null)).contains("device_info");
                    }
/* 47 */            return false;
                }

                /* JADX INFO: renamed from: S */
                public final boolean m9293S(String str) {
/* 1 */             mo1375y();
/* 4 */             m9282F(str);
/* 7 */             C1024id c1024id = this.f18212e;
                    return c1024id.getOrDefault(str, null) != null && ((Set) c1024id.getOrDefault(str, null)).contains("app_instance_id");
                }

                /* JADX INFO: renamed from: T */
                public final boolean m9294T(String str, nk3 nk3Var) {
/* 1 */             mo1375y();
/* 4 */             m9282F(str);
/* 7 */             zzgf zzgfVarM9295U = m9295U(str);
/* 11 */            if (zzgfVarM9295U == null) {
/* 53 */                return false;
                    }
/* 26 */            for (zzfu zzfuVar : zzgfVarM9295U.zza()) {
/* 42 */                if (nk3Var == m9279K(zzfuVar.zzb())) {
                            return zzfuVar.zzc() == 2;
                        }
                    }
/* 53 */            return false;
                }

                /* JADX INFO: renamed from: U */
                public final zzgf m9295U(String str) {
/* 1 */             mo1375y();
/* 4 */             m9282F(str);
/* 7 */             zzgl zzglVarM9286L = m9286L(str);
/* 11 */            if (zzglVarM9286L == null || !zzglVarM9286L.zzn()) {
/* 25 */                return null;
                    }
/* 20 */            return zzglVarM9286L.zzo();
                }

                @Override // p000.od3
                /* JADX INFO: renamed from: d */
                public final String mo7139d(String str, String str2) {
/* 1 */             mo1375y();
/* 4 */             m9282F(str);
/* 14 */            Map map = (Map) this.f18211d.getOrDefault(str, null);
/* 16 */            if (map != null) {
/* 22 */                return (String) map.get(str2);
                    }
/* 9 */             return null;
                }
            }
