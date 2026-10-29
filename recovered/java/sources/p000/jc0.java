            package p000;

            import android.content.Context;
            import android.database.Cursor;
            import android.database.DatabaseUtils;
            import android.database.sqlite.SQLiteDatabase;
            import android.net.Uri;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.io.ObjectInputStream;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.EnumSet;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.text.C1850c;
            import kotlin.text.C1852e;
            import okhttp3.CookieJar;
            import okhttp3.OkHttpClient;
            import okhttp3.Request;
            import okhttp3.RequestBody;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jc0 {

                /* JADX INFO: renamed from: A */
                public long f12178A;

                /* JADX INFO: renamed from: B */
                public long f12179B;

                /* JADX INFO: renamed from: C */
                public int f12180C;

                /* JADX INFO: renamed from: D */
                public int f12181D;

                /* JADX INFO: renamed from: E */
                public int f12182E;

                /* JADX INFO: renamed from: a */
                public final String f12183a;

                /* JADX INFO: renamed from: b */
                public final boolean f12184b;

                /* JADX INFO: renamed from: c */
                public final AtomicBoolean f12185c;

                /* JADX INFO: renamed from: d */
                public final AtomicBoolean f12186d;

                /* JADX INFO: renamed from: e */
                public final boolean f12187e;

                /* JADX INFO: renamed from: f */
                public final Context f12188f;

                /* JADX INFO: renamed from: g */
                public final String f12189g;

                /* JADX INFO: renamed from: h */
                public int f12190h;

                /* JADX INFO: renamed from: i */
                public final TimeUnit f12191i;

                /* JADX INFO: renamed from: j */
                public CookieJar f12192j;

                /* JADX INFO: renamed from: k */
                public int f12193k;

                /* JADX INFO: renamed from: l */
                public OkHttpClient f12194l;

                /* JADX INFO: renamed from: m */
                public final C0168b5 f12195m;

                /* JADX INFO: renamed from: n */
                public final EnumSet f12196n;

                /* JADX INFO: renamed from: o */
                public final int f12197o;

                /* JADX INFO: renamed from: p */
                public final int f12198p;

                /* JADX INFO: renamed from: q */
                public int f12199q;

                /* JADX INFO: renamed from: r */
                public long f12200r;

                /* JADX INFO: renamed from: s */
                public long f12201s;

                /* JADX INFO: renamed from: t */
                public Integer f12202t;

                /* JADX INFO: renamed from: u */
                public String f12203u;

                /* JADX INFO: renamed from: v */
                public final AtomicReference f12204v;

                /* JADX INFO: renamed from: w */
                public boolean f12205w;

                /* JADX INFO: renamed from: x */
                public final AtomicReference f12206x;

                /* JADX INFO: renamed from: y */
                public final AtomicReference f12207y;

                /* JADX INFO: renamed from: z */
                public Map f12208z;

                public jc0(String str, C0168b5 c0168b5, Context context, String str2, C1983o c1983o) throws Exception {
/* 1 */             context.getClass();
/* 9 */             String simpleName = jc0.class.getSimpleName();
/* 13 */            this.f12183a = simpleName;
/* 21 */            this.f12185c = new AtomicBoolean(false);
/* 28 */            this.f12186d = new AtomicBoolean(false);
/* 32 */            this.f12191i = mc0.f13690j;
/* 36 */            this.f12193k = mc0.f13688h;
/* 45 */            this.f12195m = c0168b5 == null ? new C0168b5(context, str) : c0168b5;
/* 47 */            EnumSet enumSet = mc0.f13681a;
/* 49 */            this.f12196n = enumSet;
/* 53 */            this.f12197o = mc0.f13683c;
/* 57 */            this.f12198p = mc0.f13684d;
/* 61 */            this.f12199q = mc0.f13682b;
/* 65 */            this.f12200r = mc0.f13685e;
/* 69 */            this.f12201s = mc0.f13686f;
/* 72 */            this.f12180C = 2;
/* 75 */            this.f12181D = 1;
/* 77 */            this.f12182E = 2;
/* 85 */            this.f12202t = Integer.valueOf(mc0.f13687g);
/* 89 */            AtomicReference atomicReference = new AtomicReference();
/* 92 */            this.f12204v = atomicReference;
/* 94 */            this.f12205w = false;
/* 101 */           this.f12206x = new AtomicReference();
/* 114 */           this.f12207y = new AtomicReference(Boolean.valueOf(mc0.f13689i));
/* 118 */           this.f12178A = mc0.f13692l;
/* 122 */           this.f12179B = mc0.f13691k;
/* 124 */           this.f12188f = context;
/* 126 */           c1983o.invoke(this);
/* 135 */           if (((um1) atomicReference.get()) == null) {
/* 137 */               this.f12187e = false;
/* 145 */               if (!C1852e.m6263m(str2, "http", false)) {
/* 156 */                   str2 = (this.f12182E == 2 ? "https://" : "http://").concat(str2);
                        }
/* 160 */               this.f12189g = str2;
/* 162 */               Integer num = this.f12202t;
/* 164 */               ip1 ip1Var = null;
/* 165 */               if (num != null) {
/* 167 */                   int iIntValue = num.intValue();
/* 173 */                   hp1 hp1Var = new hp1(context, str2);
/* 176 */                   int i = this.f12180C;
/* 178 */                   if (i == 0) {
/* 215 */                       throw null;
                            }
/* 180 */                   hp1Var.f9175c = i;
/* 182 */                   enumSet.getClass();
/* 185 */                   hp1Var.f9176d = enumSet;
/* 187 */                   hp1Var.f9177e = iIntValue;
/* 191 */                   hp1Var.f9180h = this.f12203u;
/* 195 */                   hp1Var.f9178f = this.f12194l;
/* 199 */                   hp1Var.f9179g = this.f12192j;
/* 203 */                   hp1Var.f9181i = this.f12205w;
/* 207 */                   hp1Var.f9182j = this.f12208z;
/* 211 */                   ip1Var = new ip1(hp1Var);
                        }
/* 216 */               m5773d(ip1Var);
                    } else {
/* 220 */               this.f12187e = true;
                    }
/* 222 */           int i2 = this.f12193k;
/* 224 */           if (i2 > 2) {
/* 226 */               if (i2 >= 2) {
/* 228 */                   mf0.f13716b = i2;
                        } else {
/* 231 */                   ScheduledExecutorService scheduledExecutorService = mf0.f13715a;
                        }
                    }
/* 233 */           this.f12184b = true;
/* 239 */           k50.m5958L(simpleName, "Emitter created successfully!", new Object[0]);
                }

                /* JADX INFO: renamed from: a */
                public final void m5770a(um1 um1Var) throws Throwable {
                    long size;
                    Object obj;
                    Object obj2;
                    List<nc0> list;
                    SQLiteDatabase sQLiteDatabase;
                    Cursor cursor;
                    HashMap map;
                    Context context;
                    C0168b5 c0168b5;
                    String str;
                    AtomicBoolean atomicBoolean;
                    String str2;
                    AtomicBoolean atomicBoolean2;
                    String str3;
                    String str4;
                    int iDelete;
                    SQLiteDatabase sQLiteDatabase2;
                    boolean zBooleanValue;
                    int iIntValue;
                    int i;
                    Request requestBuild;
/* 5 */             boolean z = this.f12186d.get();
/* 10 */            AtomicBoolean atomicBoolean3 = this.f12185c;
/* 12 */            String str5 = this.f12183a;
/* 14 */            int i2 = 0;
/* 15 */            if (z) {
/* 21 */                k50.m5968e(str5, "Emitter paused.", new Object[0]);
/* 24 */                atomicBoolean3.compareAndSet(true, false);
/* 27 */                return;
                    }
/* 28 */            Context context2 = this.f12188f;
/* 34 */            if (!mn0.m6706v(context2)) {
/* 40 */                k50.m5968e(str5, "Emitter loop stopping: emitter offline.", new Object[0]);
/* 43 */                atomicBoolean3.compareAndSet(true, false);
/* 46 */                return;
                    }
/* 47 */            if (um1Var == null) {
/* 53 */                k50.m5968e(str5, "No networkConnection set.", new Object[0]);
/* 56 */                atomicBoolean3.compareAndSet(true, false);
/* 59 */                return;
                    }
/* 60 */            C0168b5 c0168b6 = this.f12195m;
/* 66 */            String str6 = "events";
/* 68 */            if (c0168b6.m1270p()) {
/* 70 */                c0168b6.m1276w();
/* 77 */                size = DatabaseUtils.queryNumEntries((SQLiteDatabase) c0168b6.f2213d, "events");
                    } else {
/* 86 */                size = ((ArrayList) c0168b6.f2212c).size();
                    }
/* 95 */            if (size <= 0) {
/* 97 */                int i3 = this.f12190h;
/* 101 */               if (i3 >= this.f12198p) {
/* 107 */                   k50.m5968e(str5, "Emitter loop stopping: empty limit reached.", new Object[0]);
/* 110 */                   atomicBoolean3.compareAndSet(true, false);
/* 113 */                   return;
                        }
/* 115 */               this.f12190h = i3 + 1;
/* 135 */               k50.m5980q(str5, "Emitter database empty: " + this.f12190h, new Object[0]);
                        try {
/* 143 */                   this.f12191i.sleep(this.f12197o);
                        } catch (InterruptedException e) {
/* 164 */                   k50.m5980q(str5, "Emitter thread sleep interrupted: " + e, new Object[0]);
                        }
/* 167 */               m5770a(um1Var);
/* 170 */               return;
                    }
/* 171 */           this.f12190h = 0;
/* 173 */           int i4 = this.f12199q;
/* 181 */           if (c0168b6.m1270p()) {
/* 187 */               c0168b6.m1276w();
/* 192 */               ArrayList arrayList = new ArrayList();
/* 197 */               String strM3781g = fm0.m3781g(i4, "id DESC LIMIT ");
/* 203 */               ArrayList<Map> arrayList2 = new ArrayList();
/* 214 */               if (!c0168b6.m1270p() || (sQLiteDatabase = (SQLiteDatabase) c0168b6.f2213d) == null) {
/* 210 */                   obj = "eventData";
/* 212 */                   obj2 = "id";
                        } else {
                            try {
/* 212 */                       obj2 = "id";
/* 210 */                       obj = "eventData";
/* 245 */                       Cursor cursorQuery = sQLiteDatabase.query("events", (String[]) c0168b6.f2215f, null, null, null, null, strM3781g);
                                try {
/* 249 */                           cursorQuery.moveToFirst();
/* 256 */                           while (!cursorQuery.isAfterLast()) {
/* 260 */                               HashMap map2 = new HashMap();
/* 271 */                               map2.put(obj2, Long.valueOf(cursorQuery.getLong(i2)));
/* 275 */                               byte[] blob = cursorQuery.getBlob(1);
/* 279 */                               blob.getClass();
/* 282 */                               int i5 = mn0.f13881p;
                                        try {
                                            try {
                                                try {
/* 286 */                                           ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
/* 291 */                                           ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
/* 294 */                                           Object object = objectInputStream.readObject();
/* 313 */                                           map = object instanceof HashMap ? (HashMap) object : null;
/* 314 */                                           objectInputStream.close();
/* 317 */                                           byteArrayInputStream.close();
                                                } catch (ClassNotFoundException e2) {
/* 325 */                                           e2.printStackTrace();
/* 332 */                                           map = null;
                                                }
                                            } catch (NullPointerException e3) {
/* 329 */                                       e3.printStackTrace();
/* 332 */                                       map = null;
                                            }
                                        } catch (IOException e4) {
/* 321 */                                   e4.printStackTrace();
/* 332 */                                   map = null;
                                        }
/* 333 */                               map2.put(obj, map);
/* 343 */                               map2.put("dateCreated", cursorQuery.getString(2));
/* 346 */                               cursorQuery.moveToNext();
/* 349 */                               arrayList2.add(map2);
/* 352 */                               i2 = 0;
                                    }
/* 357 */                           cursorQuery.close();
                                } catch (Throwable th) {
/* 354 */                           th = th;
/* 355 */                           cursor = cursorQuery;
/* 363 */                           if (cursor != null) {
/* 365 */                               cursor.close();
                                    }
/* 368 */                           throw th;
                                }
                            } catch (Throwable th2) {
/* 361 */                       th = th2;
/* 362 */                       cursor = null;
                            }
                        }
/* 377 */               for (Map map3 : arrayList2) {
/* 387 */                   zq2 zq2Var = new zq2();
/* 390 */                   Object obj3 = map3.get(obj);
/* 401 */                   Map map4 = obj3 instanceof Map ? (Map) obj3 : null;
/* 402 */                   if (map4 != null) {
/* 404 */                       zq2Var.m10422c(map4);
                            }
/* 407 */                   Object obj4 = map3.get(obj2);
/* 418 */                   Long l = obj4 instanceof Long ? (Long) obj4 : null;
/* 419 */                   if (l == null) {
/* 426 */                       k50.m5980q("b5", "Unable to get ID of an event extracted from the database.", new Object[0]);
                            } else {
/* 439 */                       arrayList.add(new nc0(zq2Var, l.longValue()));
                            }
                        }
/* 443 */               list = arrayList;
                    } else {
/* 183 */               list = nd0.f14189a;
                    }
/* 446 */           ip1 ip1Var = (ip1) um1Var;
/* 448 */           Uri.Builder builder = ip1Var.f11890h;
/* 450 */           int i6 = ip1Var.f11885c;
/* 454 */           ArrayList arrayList3 = new ArrayList();
/* 457 */           int i7 = mn0.f13881p;
/* 463 */           String strValueOf = String.valueOf(System.currentTimeMillis());
/* 470 */           if (i6 == 1) {
/* 472 */               Iterator it = list.iterator();
/* 480 */               while (it.hasNext()) {
/* 486 */                   nc0 nc0Var = (nc0) it.next();
/* 493 */                   zq2 zq2Var2 = nc0Var != null ? nc0Var.f14180a : null;
/* 494 */                   if (zq2Var2 != null) {
/* 496 */                       zq2Var2.m10420a("stm", strValueOf);
/* 523 */                       arrayList3.add(new l32(zq2Var2, nc0Var.f14181b, m5771b(zq2Var2, new ArrayList(), i6)));
/* 526 */                       it = it;
/* 528 */                       context2 = context2;
/* 530 */                       c0168b6 = c0168b6;
/* 532 */                       str6 = str6;
                            }
                        }
/* 535 */               context = context2;
/* 537 */               c0168b5 = c0168b6;
/* 539 */               str = str6;
/* 541 */               atomicBoolean = atomicBoolean3;
/* 543 */               str2 = str5;
                    } else {
/* 546 */               context = context2;
/* 548 */               c0168b5 = c0168b6;
/* 66 */                str = "events";
/* 554 */               ArrayList arrayList4 = new ArrayList();
/* 559 */               ArrayList arrayList5 = new ArrayList();
/* 570 */               for (nc0 nc0Var2 : list) {
/* 578 */                   if (nc0Var2 != null) {
/* 580 */                       zq2 zq2Var3 = nc0Var2.f14180a;
/* 582 */                       atomicBoolean2 = atomicBoolean3;
/* 584 */                       str3 = str5;
/* 585 */                       long j = nc0Var2.f14181b;
/* 587 */                       zq2Var3.m10420a("stm", strValueOf);
/* 599 */                       if (m5771b(zq2Var3, new ArrayList(), i6)) {
/* 603 */                           str4 = strValueOf;
/* 609 */                           arrayList3.add(new l32(zq2Var3, j, true));
                                } else {
/* 613 */                           str4 = strValueOf;
/* 619 */                           if (m5771b(zq2Var3, arrayList5, i6)) {
/* 626 */                               arrayList3.add(new l32(arrayList5, arrayList4));
/* 631 */                               arrayList5 = new ArrayList();
/* 636 */                               arrayList4 = new ArrayList();
/* 639 */                               arrayList5.add(zq2Var3);
/* 646 */                               arrayList4.add(Long.valueOf(j));
                                    } else {
/* 655 */                               arrayList5.add(zq2Var3);
/* 662 */                               arrayList4.add(Long.valueOf(j));
                                    }
                                }
                            } else {
/* 666 */                       atomicBoolean2 = atomicBoolean3;
/* 668 */                       str3 = str5;
/* 669 */                       str4 = strValueOf;
                            }
/* 649 */                   str5 = str3;
/* 650 */                   atomicBoolean3 = atomicBoolean2;
/* 652 */                   strValueOf = str4;
                        }
/* 672 */               atomicBoolean = atomicBoolean3;
/* 674 */               str2 = str5;
/* 679 */               if (!arrayList5.isEmpty()) {
/* 686 */                   arrayList3.add(new l32(arrayList5, arrayList4));
                        }
                    }
/* 689 */           Map map5 = ip1Var.f11888f;
/* 691 */           String str7 = ip1Var.f11883a;
/* 695 */           ArrayList arrayList6 = new ArrayList();
/* 700 */           ArrayList<n32> arrayList7 = new ArrayList();
/* 703 */           Iterator it2 = arrayList3.iterator();
/* 711 */           while (it2.hasNext()) {
/* 717 */               l32 l32Var = (l32) it2.next();
/* 719 */               String str8 = l32Var.f13092d;
/* 721 */               zq2 zq2Var4 = l32Var.f13089a;
/* 723 */               if (str8 == null) {
/* 725 */                   str8 = ip1.f11882i;
                        }
/* 731 */               Map map6 = map5;
/* 735 */               Iterator it3 = it2;
/* 738 */               if (i6 == 1) {
/* 740 */                   builder.clearQuery();
/* 743 */                   HashMap map7 = zq2Var4.f20294b;
/* 749 */                   Iterator it4 = map7.keySet().iterator();
/* 757 */                   while (it4.hasNext()) {
/* 763 */                       Iterator it5 = it4;
/* 767 */                       String str9 = (String) it4.next();
/* 769 */                       int i8 = i6;
/* 771 */                       Object obj5 = map7.get(str9);
/* 775 */                       HashMap map8 = map7;
/* 785 */                       builder.appendQueryParameter(str9, obj5 instanceof String ? (String) obj5 : null);
/* 788 */                       i6 = i8;
/* 790 */                       it4 = it5;
/* 792 */                       map7 = map8;
                            }
/* 795 */                   i = i6;
/* 801 */                   String string = builder.build().toString();
/* 805 */                   string.getClass();
/* 821 */                   Request.Builder builder2 = new Request.Builder().url(string).header("User-Agent", str8).get();
/* 827 */                   if (ip1Var.f11887e) {
/* 829 */                       builder2.header("SP-Anonymous", "*");
                            }
/* 832 */                   if (map6 != null) {
/* 846 */                       for (Map.Entry entry : map6.entrySet()) {
/* 866 */                           builder2.header((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
/* 870 */                   requestBuild = builder2.build();
                        } else {
/* 877 */                   i = i6;
/* 883 */                   String string2 = builder.build().toString();
/* 887 */                   string2.getClass();
/* 917 */                   Request.Builder builderPost = new Request.Builder().url(string2).header("User-Agent", str8).post(RequestBody.INSTANCE.create(zq2Var4.toString(), ip1Var.f11884b));
/* 923 */                   if (ip1Var.f11887e) {
/* 925 */                       builderPost.header("SP-Anonymous", "*");
                            }
/* 928 */                   if (map6 != null) {
/* 942 */                       for (Map.Entry entry2 : map6.entrySet()) {
/* 962 */                           builderPost.header((String) entry2.getKey(), (String) entry2.getValue());
                                }
                            }
/* 966 */                   requestBuild = builderPost.build();
                        }
/* 976 */               Future futureM6644b = mf0.m6644b(new bh0(1, ip1Var, requestBuild));
/* 980 */               if (futureM6644b != null) {
/* 982 */                   arrayList6.add(futureM6644b);
                        }
/* 985 */               map5 = map6;
/* 987 */               it2 = it3;
/* 989 */               i6 = i;
/* 991 */               builder = builder;
                    }
/* 995 */           Uri.Builder builder3 = builder;
/* 1011 */          k50.m5968e(str7, "Request Futures: %s", Integer.valueOf(arrayList6.size()));
/* 1014 */          int size2 = arrayList6.size();
/* 1019 */          for (int i9 = 0; i9 < size2; i9++) {
                        try {
/* 1032 */                  Object obj6 = ((Future) arrayList6.get(i9)).get(ip1Var.f11886d, TimeUnit.SECONDS);
/* 1049 */                  Integer num = obj6 instanceof Integer ? (Integer) obj6 : null;
/* 1098 */                  iIntValue = num != null ? num.intValue() : -1;
                        } catch (InterruptedException e5) {
/* 1095 */                  k50.m5980q(str7, "Request Future was interrupted: %s", e5.getMessage());
                        } catch (ExecutionException e6) {
/* 1081 */                  k50.m5980q(str7, "Request Future failed: %s", e6.getMessage());
                        } catch (TimeoutException e7) {
/* 1067 */                  k50.m5980q(str7, "Request Future had a timeout: %s", e7.getMessage());
                        }
/* 1103 */              l32 l32Var2 = (l32) arrayList3.get(i9);
/* 1105 */              ArrayList arrayList8 = l32Var2.f13090b;
/* 1107 */              boolean z2 = l32Var2.f13091c;
/* 1114 */              arrayList7.add(new n32(iIntValue, z2, arrayList8));
/* 1117 */              if (z2) {
/* 1129 */                  k50.m5957K(str7, "Request is oversized for emitter event IDs: %s", arrayList8.toString());
                        }
                    }
/* 1140 */          k50.m5958L(str2, "Processing emitter results.", new Object[0]);
/* 1145 */          ArrayList arrayList9 = new ArrayList();
/* 1152 */          int size3 = 0;
/* 1153 */          int size4 = 0;
/* 1154 */          int size5 = 0;
/* 1159 */          for (n32 n32Var : arrayList7) {
/* 1167 */              int i10 = n32Var.f14111a;
/* 1179 */              boolean z3 = 200 <= i10 && i10 < 300;
/* 1180 */              List list2 = n32Var.f14113c;
/* 1182 */              if (z3) {
/* 1184 */                  arrayList9.addAll(list2);
/* 1191 */                  size4 += list2.size();
                        } else {
/* 1199 */                  Map map9 = (Map) this.f12206x.get();
/* 1203 */                  Object obj7 = this.f12207y.get();
/* 1207 */                  obj7.getClass();
/* 1212 */                  boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
/* 1216 */                  int i11 = n32Var.f14111a;
/* 1218 */                  if ((200 <= i11 && i11 < 300) || !zBooleanValue2 || n32Var.f14112b) {
/* 1222 */                      zBooleanValue = false;
                            } else if (map9 == null || !map9.containsKey(Integer.valueOf(i10))) {
/* 1316 */                      zBooleanValue = !new HashSet(C2085pw.m7566e(400, 401, 403, 410, 422)).contains(Integer.valueOf(i10));
                            } else {
/* 1249 */                      Object obj8 = map9.get(Integer.valueOf(i10));
/* 1253 */                      obj8.getClass();
/* 1258 */                      zBooleanValue = ((Boolean) obj8).booleanValue();
                            }
/* 1318 */                  if (zBooleanValue) {
/* 1324 */                      size5 += list2.size();
/* 1330 */                      k50.m5980q(str2, "Request sending failed but we will retry later.", new Object[0]);
                            } else {
/* 1340 */                      size3 += list2.size();
/* 1341 */                      arrayList9.addAll(list2);
/* 1365 */                      k50.m5980q(str2, String.format("Sending events to Collector failed with status %d. Events will be dropped.", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1)), new Object[0]);
                            }
                        }
                    }
/* 1374 */          if (!arrayList9.isEmpty()) {
/* 1382 */              if (!c0168b5.m1270p() || (sQLiteDatabase2 = (SQLiteDatabase) c0168b5.f2213d) == null) {
/* 1499 */                  iDelete = -1;
                        } else {
/* 1396 */                  StringBuilder sb = new StringBuilder("id in (");
/* 1399 */                  int i12 = mn0.f13881p;
/* 1403 */                  StringBuilder sb2 = new StringBuilder();
/* 1406 */                  int size6 = arrayList9.size();
/* 1413 */                  for (int i13 = 0; i13 < size6; i13++) {
/* 1421 */                      if (((Long) arrayList9.get(i13)) != null) {
/* 1427 */                          sb2.append(arrayList9.get(i13));
/* 1438 */                          if (i13 < arrayList9.size() - 1) {
/* 1440 */                              sb2.append(",");
                                    }
                                }
                            }
/* 1455 */                  if (C1852e.m6257g(sb2.toString(), ",", false)) {
/* 1471 */                      sb2 = new StringBuilder(sb2.substring(0, sb2.length() - 1));
                            }
/* 1479 */                  sb.append(sb2.toString());
/* 1484 */                  sb.append(')');
/* 1494 */                  iDelete = sQLiteDatabase2.delete(str, sb.toString(), null);
                        }
/* 1510 */              k50.m5968e("b5", "Removed events from database: %s", Integer.valueOf(iDelete));
/* 1513 */              arrayList9.size();
                    }
/* 1527 */          k50.m5968e(str2, "Success Count: %s", Integer.valueOf(size4));
/* 1540 */          k50.m5968e(str2, "Failure Count: %s", Integer.valueOf(size3 + size5));
/* 1543 */          if (size5 <= 0 || size4 != 0) {
/* 1588 */              m5770a(um1Var);
/* 1591 */              return;
                    }
/* 1551 */          if (mn0.m6706v(context)) {
/* 1557 */              Uri uriBuild = builder3.clearQuery().build();
/* 1561 */              uriBuild.getClass();
/* 1570 */              k50.m5980q(str2, "Ensure collector path is valid: %s", uriBuild);
                    }
/* 1578 */          k50.m5980q(str2, "Emitter loop stopping: failures.", new Object[0]);
/* 1584 */          atomicBoolean.compareAndSet(true, false);
                }

                /* JADX INFO: renamed from: b */
                public final boolean m5771b(zq2 zq2Var, ArrayList arrayList, int i) {
/* 7 */             long j = i == 1 ? this.f12200r : this.f12201s;
/* 9 */             long jM10423d = zq2Var.m10423d();
/* 13 */            Iterator it = arrayList.iterator();
/* 21 */            while (it.hasNext()) {
/* 33 */                jM10423d += ((zq2) it.next()).m10423d();
                    }
                    return jM10423d + ((long) (!arrayList.isEmpty() ? arrayList.size() + 88 : 0)) > j;
                }

                /* JADX INFO: renamed from: c */
                public final void m5772c() {
/* 1 */             long j = this.f12178A;
/* 3 */             long j2 = this.f12179B;
/* 5 */             C0168b5 c0168b5 = this.f12195m;
/* 11 */            if (c0168b5.m1270p()) {
/* 13 */                c0168b5.m1276w();
/* 18 */                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) c0168b5.f2213d;
/* 20 */                if (sQLiteDatabase != null) {
/* 26 */                    StringBuilder sb = new StringBuilder("\n                DELETE FROM events\n                WHERE id NOT IN (\n                    SELECT id\n                    FROM events\n                    WHERE dateCreated >= datetime('now','-");
/* 29 */                    eb0 eb0Var = fb0.f8059b;
/* 37 */                    sb.append(fb0.m3694j(j2, ib0.SECONDS));
/* 42 */                    sb.append(" seconds')\n                    ORDER BY dateCreated DESC, id DESC\n                    LIMIT ");
/* 45 */                    sb.append(j);
/* 50 */                    sb.append("\n                )\n                ");
/* 61 */                    sQLiteDatabase.execSQL(C1850c.m6253b(sb.toString()));
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m5773d(um1 um1Var) {
/* 3 */             this.f12204v.set(um1Var);
                }

                /* JADX INFO: renamed from: e */
                public final void m5774e() {
/* 8 */             k50.m5968e(this.f12183a, "Shutting down emitter.", new Object[0]);
/* 14 */            this.f12185c.compareAndSet(true, false);
/* 17 */            ScheduledExecutorService scheduledExecutorService = mf0.f13715a;
/* 19 */            if (scheduledExecutorService != null) {
                        try {
/* 21 */                    scheduledExecutorService.shutdown();
                        } catch (Exception e) {
/* 26 */                    String message = e.getMessage();
/* 30 */                    if (message == null) {
/* 32 */                        message = "Failed to shutdown";
                            }
/* 38 */                    k50.m5980q("Executor", message, new Object[0]);
                        }
/* 42 */                mf0.f13715a = null;
                    }
                }
            }
