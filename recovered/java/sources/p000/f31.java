            package p000;

            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.util.Log;
            import com.appsflyer.AdRevenueScheme;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.net.URL;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class f31 {

                /* JADX INFO: renamed from: a */
                public Object f7983a;

                /* JADX INFO: renamed from: b */
                public Object f7984b;

                /* JADX INFO: renamed from: c */
                public Object f7985c;

                /* JADX INFO: renamed from: d */
                public Object f7986d;

                /* JADX INFO: renamed from: e */
                public Object f7987e;

                /* JADX INFO: renamed from: f */
                public Object f7988f;

                /* JADX INFO: renamed from: g */
                public Object f7989g;

                /* JADX INFO: renamed from: h */
                public Object f7990h;

                /* JADX INFO: renamed from: i */
                public Object f7991i;

                public f31(String str, String str2, String str3, ArrayList arrayList, ej0 ej0Var, String str4, String str5, Boolean bool, String str6) {
/* 1 */             str.getClass();
/* 4 */             ej0Var.getClass();
/* 7 */             str6.getClass();
/* 13 */            this.f7983a = str;
/* 15 */            this.f7984b = str2;
/* 17 */            this.f7985c = str3;
/* 19 */            this.f7986d = arrayList;
/* 21 */            this.f7987e = ej0Var;
/* 23 */            this.f7988f = str4;
/* 25 */            this.f7989g = str5;
/* 27 */            this.f7990h = bool;
/* 29 */            this.f7991i = str6;
                }

                /* JADX INFO: renamed from: a */
                public static void m3639a(Map map, List list, q50 q50Var) {
/* 1 */             Iterator it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 15 */                String str = (String) it.next();
/* 21 */                List linkedList = (List) map.get(str);
/* 23 */                if (linkedList == null) {
/* 27 */                    linkedList = new LinkedList();
/* 30 */                    map.put(str, linkedList);
                        }
/* 33 */                linkedList.add(q50Var);
                    }
                }

                /* JADX INFO: renamed from: d */
                public static void m3640d(HashMap map, List list, q50 q50Var) {
/* 1 */             Iterator it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 21 */                List list2 = (List) map.get((String) it.next());
/* 23 */                if (list2 != null) {
/* 25 */                    list2.remove(q50Var);
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public synchronized void m3641b(yq2 yq2Var) {
                    try {
/* 2 */                 yq2Var.getClass();
/* 5 */                 String str = yq2Var.f19756a;
/* 7 */                 if (str == null) {
/* 9 */                     str = yq2Var.f19757b;
                        }
/* 16 */                LinkedList linkedList = new LinkedList();
/* 27 */                List list = (List) ((HashMap) this.f7988f).get(str);
/* 29 */                if (list != null) {
/* 31 */                    linkedList.addAll(list);
                        }
/* 44 */                List list2 = (List) ((HashMap) this.f7988f).get("*");
/* 46 */                if (list2 != null) {
/* 48 */                    linkedList.addAll(list2);
                        }
/* 55 */                if (!linkedList.isEmpty()) {
/* 67 */                    mf0.m6643a("f31", false, new ji1(9, linkedList, yq2Var));
                        }
                    } catch (Throwable th) {
/* 73 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: c */
                public void m3642c(C2497yg c2497yg, int i) {
                    byte[] bArr;
                    long j;
                    C0178bf c0178bf;
                    String str;
                    C0178bf c0178bf2;
                    int i2;
                    C0176bd c0176bdM9712c;
                    String str2;
                    Integer numValueOf;
                    eq2 eq2Var;
/* 1 */             final f31 f31Var = this;
/* 3 */             final C2497yg c2497yg2 = c2497yg;
/* 5 */             byte[] bArr2 = c2497yg2.f19601b;
/* 10 */            s52 s52Var = (s52) f31Var.f7988f;
/* 18 */            vr2 vr2VarM3446a = ((ei1) f31Var.f7984b).m3446a(c2497yg2.f19600a);
/* 23 */            long jMax = 0;
                    while (true) {
/* 27 */                final int i3 = 0;
/* 41 */                if (!((Boolean) s52Var.m8408k(new bk2(f31Var) { // from class: uy2

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ f31 f17742b;

                            {
/* 3 */                         this.f17742b = f31Var;
                            }

                            @Override // p000.bk2
                            public final Object execute() {
                                Boolean bool;
/* 1 */                         int i4 = i3;
/* 3 */                         C2497yg c2497yg3 = c2497yg2;
/* 5 */                         f31 f31Var2 = this.f17742b;
                                switch (i4) {
                                    case 0:
/* 33 */                                s52 s52Var2 = (s52) f31Var2.f7985c;
/* 35 */                                SQLiteDatabase sQLiteDatabaseM8404c = s52Var2.m8404c();
/* 39 */                                sQLiteDatabaseM8404c.beginTransaction();
                                        try {
/* 42 */                                    Long lM8401f = s52.m8401f(sQLiteDatabaseM8404c, c2497yg3);
/* 46 */                                    if (lM8401f == null) {
/* 48 */                                        bool = Boolean.FALSE;
                                            } else {
/* 65 */                                        Cursor cursorRawQuery = s52Var2.m8404c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM8401f.toString()});
                                                try {
/* 73 */                                            Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
/* 77 */                                            cursorRawQuery.close();
/* 80 */                                            bool = boolValueOf;
                                                } catch (Throwable th) {
/* 91 */                                            cursorRawQuery.close();
/* 94 */                                            throw th;
                                                }
                                            }
/* 81 */                                    sQLiteDatabaseM8404c.setTransactionSuccessful();
/* 84 */                                    sQLiteDatabaseM8404c.endTransaction();
/* 87 */                                    return bool;
                                        } catch (Throwable th2) {
/* 95 */                                    sQLiteDatabaseM8404c.endTransaction();
/* 98 */                                    throw th2;
                                        }
                                    default:
/* 12 */                                s52 s52Var3 = (s52) f31Var2.f7985c;
/* 14 */                                s52Var3.getClass();
/* 28 */                                return (Iterable) s52Var3.m8405g(new C2076pn(12, s52Var3, c2497yg3));
                                }
                            }
                        })).booleanValue()) {
/* 1140 */                  s52Var.m8408k(new bp0(f31Var, jMax, c2497yg2));
/* 1143 */                  return;
                        }
/* 45 */                final int i4 = 1;
/* 54 */                Iterable iterable = (Iterable) s52Var.m8408k(new bk2(f31Var) { // from class: uy2

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ f31 f17742b;

                            {
/* 3 */                         this.f17742b = f31Var;
                            }

                            @Override // p000.bk2
                            public final Object execute() {
                                Boolean bool;
/* 1 */                         int i5 = i4;
/* 3 */                         C2497yg c2497yg3 = c2497yg2;
/* 5 */                         f31 f31Var2 = this.f17742b;
                                switch (i5) {
                                    case 0:
/* 33 */                                s52 s52Var2 = (s52) f31Var2.f7985c;
/* 35 */                                SQLiteDatabase sQLiteDatabaseM8404c = s52Var2.m8404c();
/* 39 */                                sQLiteDatabaseM8404c.beginTransaction();
                                        try {
/* 42 */                                    Long lM8401f = s52.m8401f(sQLiteDatabaseM8404c, c2497yg3);
/* 46 */                                    if (lM8401f == null) {
/* 48 */                                        bool = Boolean.FALSE;
                                            } else {
/* 65 */                                        Cursor cursorRawQuery = s52Var2.m8404c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM8401f.toString()});
                                                try {
/* 73 */                                            Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
/* 77 */                                            cursorRawQuery.close();
/* 80 */                                            bool = boolValueOf;
                                                } catch (Throwable th) {
/* 91 */                                            cursorRawQuery.close();
/* 94 */                                            throw th;
                                                }
                                            }
/* 81 */                                    sQLiteDatabaseM8404c.setTransactionSuccessful();
/* 84 */                                    sQLiteDatabaseM8404c.endTransaction();
/* 87 */                                    return bool;
                                        } catch (Throwable th2) {
/* 95 */                                    sQLiteDatabaseM8404c.endTransaction();
/* 98 */                                    throw th2;
                                        }
                                    default:
/* 12 */                                s52 s52Var3 = (s52) f31Var2.f7985c;
/* 14 */                                s52Var3.getClass();
/* 28 */                                return (Iterable) s52Var3.m8405g(new C2076pn(12, s52Var3, c2497yg3));
                                }
                            }
                        });
/* 64 */                if (!iterable.iterator().hasNext()) {
/* 66 */                    return;
                        }
/* 70 */                if (vr2VarM3446a == null) {
/* 76 */                    py0.m7593P("Uploader", "Unknown backend for %s, deleting event batch for it...", c2497yg2);
/* 81 */                    c0178bf2 = new C0178bf(3, -1L);
/* 84 */                    bArr = bArr2;
/* 86 */                    j = jMax;
                        } else {
/* 93 */                    ArrayList<C2142rf> arrayList = new ArrayList();
/* 96 */                    Iterator it = iterable.iterator();
/* 104 */                   while (it.hasNext()) {
/* 116 */                       arrayList.add(((C0990hg) it.next()).f9065c);
                            }
/* 122 */                   if (bArr2 != null) {
/* 126 */                       s52 s52Var2 = (s52) f31Var.f7991i;
/* 128 */                       Objects.requireNonNull(s52Var2);
/* 140 */                       C2232tv c2232tv = (C2232tv) s52Var.m8408k(new ty2(s52Var2, i3));
/* 144 */                       xy1 xy1Var = new xy1();
/* 152 */                       xy1Var.f19398f = new HashMap();
/* 166 */                       xy1Var.f19396d = Long.valueOf(((InterfaceC2512yv) f31Var.f7989g).mo7340a());
/* 180 */                       xy1Var.f19397e = Long.valueOf(((InterfaceC2512yv) f31Var.f7990h).mo7340a());
/* 184 */                       xy1Var.f19393a = "GDT_CLIENT_METRICS";
/* 190 */                       vd0 vd0Var = new vd0("proto");
/* 193 */                       c2232tv.getClass();
/* 196 */                       ac1 ac1Var = vy1.f18387a;
/* 198 */                       ac1Var.getClass();
/* 203 */                       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
/* 206 */                           ac1Var.m180j(byteArrayOutputStream, c2232tv);
                                } catch (IOException unused) {
                                }
/* 216 */                       xy1Var.f19395c = new sd0(vd0Var, byteArrayOutputStream.toByteArray());
/* 229 */                       arrayList.add(((C0154as) vr2VarM3446a).m1152a(xy1Var.m10041d()));
                            }
/* 233 */                   C0154as c0154as = (C0154as) vr2VarM3446a;
/* 237 */                   HashMap map = new HashMap();
/* 248 */                   for (C2142rf c2142rf : arrayList) {
/* 256 */                       String str3 = c2142rf.f16030a;
/* 262 */                       if (map.containsKey(str3)) {
/* 282 */                           ((List) map.get(str3)).add(c2142rf);
                                } else {
/* 266 */                           ArrayList arrayList2 = new ArrayList();
/* 269 */                           arrayList2.add(c2142rf);
/* 272 */                           map.put(str3, arrayList2);
                                }
                            }
/* 288 */                   ArrayList arrayList3 = new ArrayList();
/* 305 */                   for (Map.Entry entry : map.entrySet()) {
/* 326 */                       C2142rf c2142rf2 = (C2142rf) ((List) entry.getValue()).get(0);
/* 328 */                       b02 b02Var = b02.f2153a;
/* 332 */                       long jMo7340a = c0154as.f2070f.mo7340a();
/* 338 */                       long jMo7340a2 = c0154as.f2069e.mo7340a();
/* 427 */                       C1829kf c1829kf = new C1829kf(new C2548ze(Integer.valueOf(c2142rf2.m8153b("sdk-version")), c2142rf2.m8152a("model"), c2142rf2.m8152a("hardware"), c2142rf2.m8152a("device"), c2142rf2.m8152a("product"), c2142rf2.m8152a("os-uild"), c2142rf2.m8152a("manufacturer"), c2142rf2.m8152a("fingerprint"), c2142rf2.m8152a("locale"), c2142rf2.m8152a(AdRevenueScheme.COUNTRY), c2142rf2.m8152a("mcc_mnc"), c2142rf2.m8152a("application_build")));
                                try {
/* 440 */                           numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
/* 446 */                           str2 = null;
                                } catch (NumberFormatException unused2) {
/* 453 */                           str2 = (String) entry.getKey();
/* 457 */                           numValueOf = null;
                                }
/* 461 */                       ArrayList arrayList4 = new ArrayList();
/* 478 */                       for (C2142rf c2142rf3 : (List) entry.getValue()) {
/* 488 */                           byte[] bArr3 = bArr2;
/* 490 */                           sd0 sd0Var = c2142rf3.f16032c;
/* 492 */                           vd0 vd0Var2 = sd0Var.f16539a;
/* 494 */                           byte[] bArr4 = sd0Var.f16540b;
/* 496 */                           long j2 = jMax;
/* 507 */                           if (vd0Var2.equals(new vd0("proto"))) {
/* 511 */                               eq2Var = new eq2();
/* 514 */                               eq2Var.f7835d = bArr4;
                                    } else {
/* 528 */                               if (vd0Var2.equals(new vd0("json"))) {
/* 538 */                                   String str4 = new String(bArr4, Charset.forName("UTF-8"));
/* 543 */                                   eq2 eq2Var2 = new eq2();
/* 546 */                                   eq2Var2.f7836e = str4;
/* 548 */                                   eq2Var = eq2Var2;
                                        } else {
/* 754 */                                   String strM7607l0 = py0.m7607l0("CctTransportBackend");
/* 763 */                                   if (Log.isLoggable(strM7607l0, 5)) {
/* 784 */                                       AbstractC1245n0.m4889q(strM7607l0, "Received event of unsupported encoding " + vd0Var2 + ". Skipping...");
                                            }
                                        }
/* 738 */                               bArr2 = bArr3;
/* 740 */                               jMax = j2;
                                    }
/* 555 */                           eq2Var.f7832a = Long.valueOf(c2142rf3.f16033d);
/* 563 */                           eq2Var.f7834c = Long.valueOf(c2142rf3.f16034e);
/* 573 */                           String str5 = (String) c2142rf3.f16035f.get("tz-offset");
/* 592 */                           eq2Var.f7837f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
/* 627 */                           eq2Var.f7838i = new C0879eg((wm1) wm1.f18687a.get(c2142rf3.m8153b("net-type")), (vm1) vm1.f18248a.get(c2142rf3.m8153b("mobile-subtype")));
/* 629 */                           Integer num = c2142rf3.f16031b;
/* 631 */                           if (num != null) {
/* 633 */                               eq2Var.f7833b = num;
                                    }
/* 644 */                           String strConcat = ((Long) eq2Var.f7832a) == null ? " eventTimeMs" : HttpUrl.FRAGMENT_ENCODE_SET;
/* 650 */                           if (((Long) eq2Var.f7834c) == null) {
/* 654 */                               strConcat = strConcat.concat(" eventUptimeMs");
                                    }
/* 662 */                           if (((Long) eq2Var.f7837f) == null) {
/* 666 */                               strConcat = strConcat.concat(" timezoneOffsetSeconds");
                                    }
/* 674 */                           if (!strConcat.isEmpty()) {
/* 750 */                               f42.m3656l("Missing required properties:".concat(strConcat));
/* 753 */                               return;
                                    } else {
/* 731 */                               arrayList4.add(new C0179bg(((Long) eq2Var.f7832a).longValue(), (Integer) eq2Var.f7833b, ((Long) eq2Var.f7834c).longValue(), (byte[]) eq2Var.f7835d, (String) eq2Var.f7836e, ((Long) eq2Var.f7837f).longValue(), (C0879eg) eq2Var.f7838i));
/* 738 */                               bArr2 = bArr3;
/* 740 */                               jMax = j2;
                                    }
                                }
/* 803 */                       arrayList3.add(new C0215cg(jMo7340a, jMo7340a2, c1829kf, numValueOf, str2, arrayList4));
                            }
/* 812 */                   bArr = bArr2;
/* 814 */                   j = jMax;
/* 819 */                   C0214cf c0214cf = new C0214cf(arrayList3);
/* 822 */                   URL urlM1151b = c0154as.f2068d;
/* 824 */                   if (bArr != null) {
                                try {
/* 826 */                           C0959gm c0959gmM3973a = C0959gm.m3973a(bArr);
/* 830 */                           String str6 = c0959gmM3973a.f8711b;
/* 832 */                           if (str6 == null) {
/* 835 */                               str6 = null;
                                    }
/* 838 */                           urlM1151b = C0154as.m1151b(c0959gmM3973a.f8710a);
/* 842 */                           str = str6;
                                } catch (IllegalArgumentException unused3) {
/* 850 */                           c0178bf = new C0178bf(3, -1L);
                                }
                            } else {
/* 856 */                       str = null;
                            }
/* 843 */                   int i5 = 3;
                            try {
/* 860 */                       int i6 = 15;
/* 862 */                       C0875ec c0875ec = new C0875ec(i6, urlM1151b, c0214cf, str);
/* 867 */                       C2357x6 c2357x6 = new C2357x6(c0154as, i5);
/* 870 */                       int i7 = 5;
/* 907 */                       do {
/* 871 */                           c0176bdM9712c = c2357x6.m9712c(c0875ec);
/* 877 */                           URL url = (URL) c0176bdM9712c.f2372c;
/* 879 */                           if (url != null) {
/* 883 */                               py0.m7593P("CctTransportBackend", "Following redirect to: %s", url);
/* 896 */                               c0875ec = new C0875ec(i6, url, (C0214cf) c0875ec.f7614c, (String) c0875ec.f7615d);
                                    } else {
/* 901 */                               c0875ec = null;
                                    }
/* 902 */                           if (c0875ec == null) {
                                        break;
                                    } else {
/* 904 */                               i7--;
                                    }
/* 907 */                       } while (i7 >= 1);
/* 909 */                       int i8 = c0176bdM9712c.f2370a;
/* 913 */                       if (i8 == 200) {
/* 920 */                           c0178bf2 = new C0178bf(1, c0176bdM9712c.f2371b);
                                } else {
/* 930 */                           if (i8 >= 500 || i8 == 404) {
/* 968 */                               c0178bf = new C0178bf(2, -1L);
                                    } else if (i8 == 400) {
                                        try {
/* 948 */                                   c0178bf = new C0178bf(4, -1L);
                                        } catch (IOException e) {
/* 952 */                                   e = e;
/* 974 */                                   py0.m7595R("CctTransportBackend", "Could not make request to the backend", e);
/* 981 */                                   i2 = 2;
/* 982 */                                   c0178bf2 = new C0178bf(2, -1L);
                                        }
                                    } else {
/* 961 */                               c0178bf = new C0178bf(3, -1L);
                                    }
/* 853 */                           c0178bf2 = c0178bf;
                                }
                            } catch (IOException e2) {
/* 926 */                       e = e2;
                            }
                        }
/* 88 */                i2 = 2;
/* 986 */               int i9 = c0178bf2.f2396a;
/* 988 */               if (i9 == i2) {
/* 1002 */                  s52Var.m8408k(new h70(this, iterable, c2497yg, j));
/* 1012 */                  ((C0875ec) this.f7986d).m3372K(c2497yg, i + 1, true);
/* 1015 */                  return;
                        }
/* 1016 */              f31Var = this;
/* 1018 */              c2497yg2 = c2497yg;
/* 1021 */              jMax = j;
/* 1031 */              s52Var.m8408k(new C2076pn(17, f31Var, iterable));
/* 1034 */              if (i9 == 1) {
/* 1038 */                  jMax = Math.max(jMax, c0178bf2.f2397b);
/* 1042 */                  if (bArr != null) {
/* 1051 */                      s52Var.m8408k(new C2357x6(f31Var, 16));
                            }
                        } else if (i9 == 4) {
/* 1060 */                  HashMap map2 = new HashMap();
/* 1063 */                  Iterator it2 = iterable.iterator();
/* 1071 */                  while (it2.hasNext()) {
/* 1081 */                      String str7 = ((C0990hg) it2.next()).f9065c.f16030a;
/* 1087 */                      if (map2.containsKey(str7)) {
/* 1117 */                          map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                                } else {
/* 1095 */                          map2.put(str7, 1);
                                }
                            }
/* 1128 */                  s52Var.m8408k(new C2076pn(18, f31Var, map2));
                        }
/* 1131 */              bArr2 = bArr;
                    }
                }

                /* JADX INFO: renamed from: e */
                public synchronized void m3643e(String str) {
/* 2 */             str.getClass();
/* 13 */            q50 q50Var = (q50) ((HashMap) this.f7983a).remove(str);
/* 15 */            if (q50Var == null) {
/* 18 */                return;
                    }
/* 23 */            ((HashMap) this.f7984b).remove(q50Var);
/* 28 */            fs0 fs0Var = (fs0) this.f7991i;
/* 30 */            fs0Var.getClass();
/* 37 */            ((HashMap) fs0Var.f8339b).remove(str);
/* 48 */            m3640d((HashMap) this.f7985c, q50Var.m7722h(), q50Var);
/* 59 */            m3640d((HashMap) this.f7986d, q50Var.m7718d(), q50Var);
/* 70 */            m3640d((HashMap) this.f7987e, q50Var.m7721g(), q50Var);
/* 81 */            m3640d((HashMap) this.f7988f, q50Var.m7717c(), q50Var);
/* 92 */            m3640d((HashMap) this.f7989g, q50Var.m7720f(), q50Var);
/* 103 */           m3640d((HashMap) this.f7990h, q50Var.m7719e(), q50Var);
                }

                /* JADX INFO: renamed from: f */
                public synchronized fs0 m3644f(AbstractC1812k abstractC1812k) {
                    fs0 fs0Var;
                    tg2 tg2Var;
                    try {
/* 2 */                 abstractC1812k.getClass();
/* 7 */                 if (abstractC1812k instanceof AbstractC1910m0) {
/* 11 */                    LinkedList<q50> linkedList = new LinkedList();
/* 29 */                    List list = (List) ((HashMap) this.f7985c).get(((AbstractC1910m0) abstractC1812k).mo105d());
/* 31 */                    if (list != null) {
/* 33 */                        linkedList.addAll(list);
                            }
/* 50 */                    List list2 = (List) ((HashMap) this.f7985c).get("*");
/* 52 */                    if (list2 != null) {
/* 54 */                        linkedList.addAll(list2);
                            }
/* 65 */                    for (q50 q50Var : linkedList) {
/* 81 */                        String str = (String) ((HashMap) this.f7984b).get(q50Var);
/* 83 */                        if (str != null) {
/* 87 */                            fs0 fs0Var2 = (fs0) this.f7991i;
                                    synchronized (fs0Var2) {
/* 98 */                                tg2Var = (tg2) ((HashMap) fs0Var2.f8339b).get(str);
                                    }
                                } else {
/* 105 */                           tg2Var = null;
                                }
/* 108 */                       q50Var.getClass();
/* 111 */                       tg2 tg2Var2 = new tg2();
/* 114 */                       tg2Var2.f17089a = abstractC1812k;
/* 116 */                       tg2Var2.f17090b = tg2Var;
/* 118 */                       tg2Var2.f17091c = q50Var;
/* 120 */                       if (str != null) {
/* 124 */                           fs0 fs0Var3 = (fs0) this.f7991i;
                                    synchronized (fs0Var3) {
/* 131 */                               ((HashMap) fs0Var3.f8339b).put(str, tg2Var2);
                                    }
                                }
/* 139 */                       tg2Var2.m8788a();
                            }
                        }
/* 145 */               fs0 fs0Var4 = (fs0) this.f7991i;
                        synchronized (fs0Var4) {
/* 152 */                   fs0Var = new fs0(18);
/* 164 */                   fs0Var.f8339b = new HashMap((HashMap) fs0Var4.f8339b);
                        }
                    } catch (Throwable th) {
/* 173 */               throw th;
                    }
/* 168 */           return fs0Var;
                }
            }
