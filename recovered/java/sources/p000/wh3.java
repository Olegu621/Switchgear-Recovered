            package p000;

            import android.database.Cursor;
            import android.database.sqlite.SQLiteException;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.Pair;
            import com.google.android.gms.internal.measurement.zzhr;
            import com.google.android.gms.internal.measurement.zzhs;
            import com.google.android.gms.internal.measurement.zzhw;
            import com.google.android.gms.measurement.internal.zzbe;
            import com.google.android.gms.measurement.internal.zzbg;
            import java.io.IOException;
            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final class wh3 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18632a = 1;

                /* JADX INFO: renamed from: b */
                public long f18633b;

                /* JADX INFO: renamed from: c */
                public Object f18634c;

                /* JADX INFO: renamed from: d */
                public Object f18635d;

                /* JADX INFO: renamed from: e */
                public final Object f18636e;

                public wh3(String str, String str2, Bundle bundle, long j) {
/* 7 */             this.f18634c = str;
/* 9 */             this.f18635d = str2;
/* 11 */            this.f18636e = bundle;
/* 13 */            this.f18633b = j;
                }

                /* JADX INFO: renamed from: b */
                public static wh3 m9578b(zzbg zzbgVar) {
/* 15 */            return new wh3(zzbgVar.f4208a, zzbgVar.f4210c, zzbgVar.f4209b.m2167G1(), zzbgVar.f4211d);
                }

                /* JADX WARN: Code duplicated, block: B:47:0x0100 A[PHI: r6 r16 r17
  0x0100: PHI (r6v3 android.database.Cursor) = (r6v4 android.database.Cursor), (r6v6 android.database.Cursor) binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r16v3 com.google.android.gms.internal.measurement.zzhs) = (r16v5 com.google.android.gms.internal.measurement.zzhs), (r16v10 com.google.android.gms.internal.measurement.zzhs) binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public zzhs m9579a(zzhs zzhsVar, String str) {
                    Cursor cursor;
                    zzhs zzhsVar2;
                    long j;
                    Cursor cursorRawQuery;
                    Pair pair;
                    Object obj;
                    Pair pair2;
/* 7 */             String strZzd = zzhsVar.zzd();
/* 11 */            List listZza = zzhsVar.zza();
/* 17 */            fd3 fd3Var = (fd3) this.f18636e;
/* 19 */            mp3 mp3Var = fd3Var.f15676b;
/* 21 */            mp3 mp3Var2 = fd3Var.f15676b;
/* 26 */            ij3 ij3Var = (ij3) fd3Var.f16749a;
/* 28 */            mp3Var.m6761i0();
/* 33 */            zzhw zzhwVarM1661H = ci3.m1661H(zzhsVar, "_eid");
/* 47 */            Long l = (Long) (zzhwVarM1661H == null ? null : ci3.m1666O(zzhwVarM1661H));
/* 49 */            if (l != null) {
/* 57 */                if (strZzd.equals("_ep")) {
/* 59 */                    mp3Var.m6761i0();
/* 64 */                    zzhw zzhwVarM1661H2 = ci3.m1661H(zzhsVar, "_en");
/* 77 */                    String str2 = (String) (zzhwVarM1661H2 == null ? null : ci3.m1666O(zzhwVarM1661H2));
/* 83 */                    if (TextUtils.isEmpty(str2)) {
/* 85 */                        uh3 uh3Var = ij3Var.f9655f;
/* 87 */                        ij3.m4555l(uh3Var);
/* 94 */                        uh3Var.f17539i.m8511b(l, "Extra parameter without an event name. eventId");
/* 37 */                        return null;
                            }
/* 102 */                   if (((zzhs) this.f18634c) == null || ((Long) this.f18635d) == null || l.longValue() != ((Long) this.f18635d).longValue()) {
/* 131 */                       ae3 ae3Var = mp3Var.f13913c;
/* 133 */                       mp3.m6728S(ae3Var);
/* 138 */                       ij3 ij3Var2 = (ij3) ae3Var.f16749a;
/* 140 */                       ae3Var.mo1375y();
/* 143 */                       ae3Var.m9593A();
                                try {
/* 160 */                           cursorRawQuery = ae3Var.m261q0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                                    try {
                                        try {
/* 168 */                                   if (cursorRawQuery.moveToFirst()) {
/* 212 */                                       zzhsVar2 = null;
                                                try {
                                                    try {
/* 230 */                                               Pair pairCreate = Pair.create((zzhs) ((zzhr) ci3.m1677m0(zzhs.zzk(), cursorRawQuery.getBlob(0))).zzbc(), Long.valueOf(cursorRawQuery.getLong(1)));
/* 234 */                                               cursorRawQuery.close();
                                                        pair2 = pairCreate;
                                                    } catch (SQLiteException e) {
/* 265 */                                               e = e;
/* 266 */                                               j = 0;
/* 288 */                                               uh3 uh3Var2 = ij3Var2.f9655f;
/* 290 */                                               ij3.m4555l(uh3Var2);
/* 297 */                                               uh3Var2.f17538f.m8511b(e, "Error selecting main event");
/* 300 */                                               if (cursorRawQuery != null) {
/* 257 */                                                   cursorRawQuery.close();
                                                        }
/* 260 */                                               pair = zzhsVar2;
                                                    }
                                                } catch (IOException e2) {
/* 239 */                                           uh3 uh3Var3 = ij3Var2.f9655f;
/* 241 */                                           ij3.m4555l(uh3Var3);
/* 248 */                                           j = 0;
                                                    try {
/* 254 */                                               uh3Var3.f17538f.m8513d("Failed to merge main event. appId, eventId", uh3.m9013H(str), l, e2);
                                                    } catch (SQLiteException e3) {
/* 263 */                                               e = e3;
/* 288 */                                               uh3 uh3Var4 = ij3Var2.f9655f;
/* 290 */                                               ij3.m4555l(uh3Var4);
/* 297 */                                               uh3Var4.f17538f.m8511b(e, "Error selecting main event");
/* 300 */                                               if (cursorRawQuery != null) {
/* 257 */                                                   cursorRawQuery.close();
                                                        }
/* 260 */                                               pair = zzhsVar2;
/* 303 */                                               if (pair != 0) {
                                                        }
/* 492 */                                               uh3 uh3Var5 = ij3Var.f9655f;
/* 494 */                                               ij3.m4555l(uh3Var5);
/* 501 */                                               uh3Var5.f17539i.m8512c(str2, "Extra parameter without existing main event. eventName, eventId", l);
/* 504 */                                               return zzhsVar2;
                                                    }
/* 257 */                                           cursorRawQuery.close();
/* 260 */                                           pair = zzhsVar2;
                                                }
                                            } else {
/* 170 */                                       uh3 uh3Var6 = ij3Var2.f9655f;
/* 172 */                                       ij3.m4555l(uh3Var6);
/* 179 */                                       uh3Var6.f17534Y.m8510a("Main event not found");
/* 182 */                                       cursorRawQuery.close();
/* 185 */                                       pair2 = null;
/* 186 */                                       zzhsVar2 = null;
                                            }
/* 188 */                                   j = 0;
                                            pair = pair2;
                                        } catch (SQLiteException e4) {
/* 194 */                                   e = e4;
/* 195 */                                   zzhsVar2 = null;
                                        }
                                    } catch (Throwable th) {
/* 192 */                               th = th;
/* 269 */                               cursor = cursorRawQuery;
/* 505 */                               if (cursor != null) {
/* 507 */                                   cursor.close();
                                        }
/* 510 */                               throw th;
                                    }
                                } catch (SQLiteException e5) {
/* 276 */                           e = e5;
/* 277 */                           zzhsVar2 = null;
/* 279 */                           j = 0;
/* 286 */                           cursorRawQuery = null;
                                } catch (Throwable th2) {
/* 272 */                           th = th2;
/* 282 */                           cursor = null;
                                }
/* 303 */                       if (pair != 0 || (obj = pair.first) == null) {
/* 492 */                           uh3 uh3Var7 = ij3Var.f9655f;
/* 494 */                           ij3.m4555l(uh3Var7);
/* 501 */                           uh3Var7.f17539i.m8512c(str2, "Extra parameter without existing main event. eventName, eventId", l);
/* 504 */                           return zzhsVar2;
                                }
/* 314 */                       this.f18634c = (zzhs) obj;
/* 324 */                       this.f18633b = ((Long) pair.second).longValue();
/* 326 */                       mp3Var2.m6761i0();
/* 339 */                       this.f18635d = (Long) ci3.m1662I((zzhs) this.f18634c, "_eid");
                            } else {
/* 127 */                       j = 0;
                            }
/* 345 */                   long j2 = this.f18633b - 1;
/* 346 */                   this.f18633b = j2;
/* 350 */                   if (j2 <= j) {
/* 352 */                       ae3 ae3Var2 = mp3Var2.f13913c;
/* 354 */                       mp3.m6728S(ae3Var2);
/* 359 */                       ij3 ij3Var3 = (ij3) ae3Var2.f16749a;
/* 361 */                       ae3Var2.mo1375y();
/* 364 */                       uh3 uh3Var8 = ij3Var3.f9655f;
/* 366 */                       ij3.m4555l(uh3Var8);
/* 373 */                       uh3Var8.f17534Y.m8511b(str, "Clearing complex main event info. appId");
                                try {
/* 386 */                           ae3Var2.m261q0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                                } catch (SQLiteException e6) {
/* 391 */                           uh3 uh3Var9 = ij3Var3.f9655f;
/* 393 */                           ij3.m4555l(uh3Var9);
/* 400 */                           uh3Var9.f17538f.m8511b(e6, "Error clearing complex main event");
                                }
                            } else {
/* 404 */                       ae3 ae3Var3 = mp3Var2.f13913c;
/* 406 */                       mp3.m6728S(ae3Var3);
/* 418 */                       ae3Var3.m239S(str, l, this.f18633b, (zzhs) this.f18634c);
                            }
/* 423 */                   ArrayList arrayList = new ArrayList();
/* 442 */                   for (zzhw zzhwVar : ((zzhs) this.f18634c).zza()) {
/* 450 */                       mp3Var2.m6761i0();
/* 461 */                       if (ci3.m1661H(zzhsVar, zzhwVar.zzb()) == null) {
/* 463 */                           arrayList.add(zzhwVar);
                                }
                            }
/* 471 */                   if (arrayList.isEmpty()) {
/* 478 */                       uh3 uh3Var10 = ij3Var.f9655f;
/* 480 */                       ij3.m4555l(uh3Var10);
/* 487 */                       uh3Var10.f17539i.m8511b(str2, "No unique parameters in main event. eventName");
                            } else {
/* 473 */                       arrayList.addAll(listZza);
/* 476 */                       listZza = arrayList;
                            }
/* 490 */                   strZzd = str2;
                        } else {
/* 516 */                   this.f18635d = l;
/* 518 */                   this.f18634c = zzhsVar;
/* 520 */                   mp3Var.m6761i0();
/* 529 */                   zzhw zzhwVarM1661H3 = ci3.m1661H(zzhsVar, "_epc");
/* 538 */                   Serializable serializableM1666O = zzhwVarM1661H3 == null ? null : ci3.m1666O(zzhwVarM1661H3);
/* 548 */                   long jLongValue = ((Long) (serializableM1666O != null ? serializableM1666O : 0L)).longValue();
/* 552 */                   this.f18633b = jLongValue;
/* 556 */                   if (jLongValue <= 0) {
/* 558 */                       uh3 uh3Var11 = ij3Var.f9655f;
/* 560 */                       ij3.m4555l(uh3Var11);
/* 567 */                       uh3Var11.f17539i.m8511b(strZzd, "Complex event with zero extra param count. eventName");
                            } else {
/* 571 */                       ae3 ae3Var4 = mp3Var.f13913c;
/* 573 */                       mp3.m6728S(ae3Var4);
/* 581 */                       ae3Var4.m239S(str, l, this.f18633b, zzhsVar);
                            }
                        }
                    }
/* 588 */           zzhr zzhrVar = (zzhr) zzhsVar.zzcl();
/* 590 */           zzhrVar.zzl(strZzd);
/* 593 */           zzhrVar.zzi();
/* 596 */           zzhrVar.zzh(listZza);
/* 603 */           return (zzhs) zzhrVar.zzbc();
                }

                /* JADX INFO: renamed from: c */
                public zzbg m9580c() {
/* 28 */            return new zzbg((String) this.f18634c, new zzbe(new Bundle((Bundle) this.f18636e)), (String) this.f18635d, this.f18633b);
                }

                public String toString() {
                    switch (this.f18632a) {
                        case 0:
/* 13 */                    String str = (String) this.f18635d;
/* 19 */                    String string = ((Bundle) this.f18636e).toString();
/* 27 */                    int length = String.valueOf(str).length();
/* 33 */                    String str2 = (String) this.f18634c;
/* 55 */                    StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
/* 62 */                    fm0.m3796v(sb, "origin=", str, ",name=", str2);
/* 67 */                    return fm0.m3789o(sb, ",params=", string);
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 15 */        public /* synthetic */ wh3(fd3 fd3Var) {
                    this.f18636e = fd3Var;
                }
            }
