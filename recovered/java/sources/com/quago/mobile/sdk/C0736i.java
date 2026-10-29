            package com.quago.mobile.sdk;

            import android.hardware.Sensor;
            import android.os.SystemClock;
            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 1246 */  public final class C0736i {

                /* JADX INFO: renamed from: a */
                public final C0740j0 f5463a = AbstractC0743k0.m2619a("DataManager");

                /* JADX INFO: renamed from: b */
                public final C0742k f5464b;

                /* JADX INFO: renamed from: c */
                public final C0742k f5465c;

                /* JADX INFO: renamed from: d */
                public final C0742k f5466d;

                /* JADX INFO: renamed from: e */
                public final C0742k f5467e;

                /* JADX INFO: renamed from: f */
                public final C0742k f5468f;

                /* JADX INFO: renamed from: g */
                public final C0742k f5469g;

                /* JADX INFO: renamed from: h */
                public final C0742k f5470h;

                /* JADX INFO: renamed from: i */
                public final C0742k f5471i;

                /* JADX INFO: renamed from: j */
                public final C0742k f5472j;

                /* JADX INFO: renamed from: k */
                public final C0742k f5473k;

                /* JADX INFO: renamed from: l */
                public final C0742k f5474l;

                /* JADX INFO: renamed from: m */
                public final C0742k f5475m;

                /* JADX INFO: renamed from: n */
                public final C0742k f5476n;

                /* JADX INFO: renamed from: o */
                public final C0742k f5477o;

                /* JADX INFO: renamed from: p */
                public final C0760t f5478p;

                /* JADX INFO: renamed from: q */
                public final QuagoSettings f5479q;

                public C0736i(C0724e c0724e, C0760t c0760t, QuagoSettings quagoSettings) {
                    List list;
/* 12 */            this.f5478p = c0760t;
/* 14 */            this.f5479q = quagoSettings;
/* 39 */            this.f5464b = new C0742k("LifeCycle", C0766w.class, Math.max(100, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.LIFECYCLE) * 2));
/* 61 */            this.f5477o = new C0742k("Resolution", C0732g1.class, Math.max(100, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.RESOLUTION) * 2));
/* 65 */            EnumC0727f enumC0727f = EnumC0727f.ON_RESUME;
/* 87 */            this.f5465c = new C0742k("Motion", C0768x.class, Math.max(20000, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.MOTION) * 2));
/* 111 */           this.f5466d = new C0742k("Keys", C0764v.class, Math.max(10000, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.KEYS) * 2));
/* 133 */           this.f5475m = new C0742k("BatteryChange", C0753p.class, Math.max(100, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.BATTERY) * 2));
/* 135 */           if (c0724e == null || (list = c0724e.f5407d) == null || list.isEmpty()) {
/* 419 */               return;
                    }
/* 151 */           Iterator it = c0724e.f5407d.iterator();
/* 159 */           while (it.hasNext()) {
/* 167 */               int type = ((Sensor) it.next()).getType();
/* 174 */               if (type == 1) {
/* 397 */                   EnumC0727f enumC0727f2 = EnumC0727f.ON_RESUME;
/* 415 */                   this.f5467e = new C0742k("Accelerometer", C0751o.class, Math.max(100, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.ACCELEROMETER) * 2));
                        } else if (type == 2) {
/* 373 */                   EnumC0727f enumC0727f3 = EnumC0727f.ON_RESUME;
/* 391 */                   this.f5468f = new C0742k("MagneticField", C0751o.class, Math.max(100, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.MAGNETIC_FIELD) * 2));
                        } else if (type == 8) {
/* 349 */                   EnumC0727f enumC0727f4 = EnumC0727f.ON_RESUME;
/* 367 */                   this.f5471i = new C0742k("Proximity", C0753p.class, Math.max(100, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.PROXIMITY) * 2));
                        } else if (type == 13) {
/* 325 */                   EnumC0727f enumC0727f5 = EnumC0727f.ON_RESUME;
/* 343 */                   this.f5474l = new C0742k("AmbientTemperature", C0753p.class, Math.max(100, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.AMBIENT_TEMPERATURE) * 2));
                        } else if (type == 18) {
/* 299 */                   EnumC0727f enumC0727f6 = EnumC0727f.ON_RESUME;
/* 319 */                   this.f5476n = new C0742k("StepDetector", C0744k1.class, Math.max(100, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.STEP_DETECTOR) * 2));
                        } else if (type == 20) {
/* 275 */                   EnumC0727f enumC0727f7 = EnumC0727f.ON_RESUME;
/* 293 */                   this.f5470h = new C0742k("GeomagneticRotationVector", C0751o.class, Math.max(100, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.GEOMAGNETIC_ROTATION_VECTOR) * 2));
                        } else if (type == 4) {
/* 252 */                   EnumC0727f enumC0727f8 = EnumC0727f.ON_RESUME;
/* 270 */                   this.f5469g = new C0742k("Gyroscope", C0751o.class, Math.max(100, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.GYROSCOPE) * 2));
                        } else if (type == 5) {
/* 229 */                   EnumC0727f enumC0727f9 = EnumC0727f.ON_RESUME;
/* 247 */                   this.f5472j = new C0742k("Light", C0753p.class, Math.max(100, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.LIGHT) * 2));
                        } else if (type == 6) {
/* 206 */                   EnumC0727f enumC0727f10 = EnumC0727f.ON_RESUME;
/* 224 */                   this.f5473k = new C0742k("Pressure", C0753p.class, Math.max(100, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.PRESSURE) * 2));
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public final C0745l m2600a(C0714a1 c0714a1, long j, long j2) {
                    int i;
                    HashMap map;
                    HashMap map2;
                    long j3;
                    long j4;
                    long j5;
                    long j6;
                    long j7;
                    long j8;
                    long j9;
                    long j10;
                    long j11;
                    long j12;
                    long j13;
                    long j14;
                    long j15;
                    long j16;
                    long j17;
                    long j18;
                    long j19;
                    long j20;
                    long j21;
                    long j22;
/* 5 */             QuagoSettings quagoSettings = this.f5479q;
/* 7 */             C0740j0 c0740j0 = AbstractC0729f1.f5436a;
/* 11 */            C0745l c0745l = new C0745l();
/* 19 */            c0745l.f5514C = new LinkedList();
/* 26 */            c0745l.f5515D = new LinkedList();
/* 33 */            c0745l.f5516E = new LinkedList();
/* 40 */            c0745l.f5517F = new LinkedList();
/* 47 */            c0745l.f5518G = new LinkedList();
/* 54 */            c0745l.f5519H = new LinkedList();
/* 61 */            c0745l.f5520I = new LinkedList();
/* 68 */            c0745l.f5521J = new LinkedList();
/* 75 */            c0745l.f5522K = new LinkedList();
/* 82 */            c0745l.f5523L = new LinkedList();
/* 89 */            c0745l.f5524M = new LinkedList();
/* 96 */            c0745l.f5525N = new LinkedList();
/* 103 */           c0745l.f5526O = new LinkedList();
/* 110 */           c0745l.f5527P = new LinkedList();
/* 112 */           C0742k c0742k = this.f5465c;
/* 116 */           int queryMaxCount = quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.MOTION);
/* 122 */           LinkedList<C0768x> linkedList = new LinkedList();
/* 125 */           int length = c0742k.f5507c;
/* 128 */           int i2 = 1;
/* 129 */           if (length != -1) {
/* 139 */               int length2 = ((C0768x[]) c0742k.f5508d).length;
/* 142 */               C0768x c0768x = new C0768x();
/* 147 */               HashMap map3 = new HashMap();
/* 152 */               HashMap map4 = new HashMap();
/* 157 */               HashMap map5 = new HashMap();
/* 162 */               HashMap map6 = new HashMap();
/* 167 */               HashMap map7 = new HashMap();
/* 172 */               HashMap map8 = new HashMap();
/* 177 */               HashMap map9 = new HashMap();
/* 182 */               HashMap map10 = new HashMap();
/* 187 */               HashMap map11 = new HashMap();
/* 192 */               HashMap map12 = new HashMap();
/* 195 */               int iM2567a = 0;
/* 196 */               while (length2 > 0) {
                            synchronized (((C0768x[]) c0742k.f5508d)[length]) {
/* 211 */                       ((C0768x[]) c0742k.f5508d)[length].mo2578a(c0768x);
                            }
/* 217 */                   if (c0768x.f5670h == 0) {
                                break;
                            }
/* 223 */                   int i3 = length;
/* 224 */                   int i4 = length2;
/* 226 */                   long j23 = c0768x.f5494a;
/* 230 */                   if (j23 < j || j23 > j2 || (queryMaxCount != 0 && iM2567a >= queryMaxCount)) {
/* 243 */                       i = i2;
/* 245 */                       map8 = map8;
/* 246 */                       map7 = map7;
/* 247 */                       map = map5;
/* 249 */                       map2 = map6;
                            } else {
/* 255 */                       C0768x c0768x2 = new C0768x();
/* 258 */                       c0768x.mo2578a(c0768x2);
/* 273 */                       EnumC0727f enumC0727f = (EnumC0727f) EnumC0727f.f5430e.get(Integer.valueOf(c0768x.f5670h));
/* 275 */                       int iOrdinal = enumC0727f.ordinal();
/* 282 */                       if (iOrdinal != 0) {
/* 284 */                           if (iOrdinal != i2) {
/* 286 */                               i = i2;
/* 289 */                               if (iOrdinal == 2) {
/* 331 */                                   iM2567a = AbstractC0729f1.m2567a(map4, map3, c0768x2, linkedList, iM2567a, true);
                                        } else if (iOrdinal == 3) {
/* 318 */                                   iM2567a = AbstractC0729f1.m2567a(map12, map11, c0768x2, linkedList, iM2567a, false);
                                        } else if (iOrdinal == 4) {
/* 305 */                                   iM2567a = AbstractC0729f1.m2567a(map8, map7, c0768x2, linkedList, iM2567a, false);
                                        }
                                    } else {
/* 336 */                               i = i2;
/* 346 */                               iM2567a = AbstractC0729f1.m2567a(map10, map9, c0768x2, linkedList, iM2567a, false);
                                    }
/* 298 */                           map = map5;
/* 300 */                           map2 = map6;
                                } else {
/* 351 */                           i = i2;
/* 353 */                           map8 = map8;
/* 354 */                           map7 = map7;
/* 357 */                           map = map5;
/* 359 */                           map2 = map6;
/* 361 */                           iM2567a = AbstractC0729f1.m2567a(map2, map, c0768x2, linkedList, iM2567a, false);
                                }
/* 365 */                       int iOrdinal2 = enumC0727f.ordinal();
/* 369 */                       if (iOrdinal2 == 0 || iOrdinal2 == 4) {
/* 374 */                           map4.clear();
/* 377 */                           map3.clear();
                                }
/* 380 */                       linkedList.add(c0768x2);
/* 383 */                       iM2567a++;
                            }
/* 385 */                   length = i3 - 1;
/* 387 */                   if (length < 0) {
/* 394 */                       length = ((C0768x[]) c0742k.f5508d).length - 1;
                            }
/* 399 */                   map6 = map2;
/* 401 */                   map5 = map;
/* 403 */                   map7 = map7;
/* 404 */                   map8 = map8;
/* 405 */                   i2 = i;
/* 397 */                   length2 = i4 - 1;
/* 408 */                   queryMaxCount = queryMaxCount;
                        }
/* 420 */               linkedList.removeAll(Collections.singleton(null));
                    }
/* 444 */           long j24 = linkedList.isEmpty() ? j : ((C0768x) linkedList.get(linkedList.size() - 1)).f5494a;
/* 464 */           long j25 = linkedList.isEmpty() ? j2 : ((C0768x) linkedList.get(0)).f5494a;
/* 477 */           LinkedList<C0764v> linkedListM2572b = AbstractC0729f1.m2572b(this.f5466d, j24, j2, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.KEYS));
                    try {
/* 483 */               if (this.f5478p != null) {
/* 487 */                   HashMap map13 = new HashMap();
/* 492 */                   HashMap map14 = new HashMap();
/* 503 */                   for (C0768x c0768x3 : linkedList) {
/* 521 */                       C0762u c0762u = (C0762u) map13.get(Integer.valueOf(c0768x3.f5674l));
/* 523 */                       if (c0762u == null) {
/* 527 */                           c0762u = new C0762u(c0768x3);
/* 536 */                           map13.put(Integer.valueOf(c0768x3.f5674l), c0762u);
                                }
/* 547 */                       c0762u.f5645c++;
                            }
/* 558 */                   for (C0764v c0764v : linkedListM2572b) {
/* 576 */                       C0758s c0758s = (C0758s) map14.get(Integer.valueOf(c0764v.f5650e));
/* 578 */                       if (c0758s == null) {
/* 582 */                           c0758s = new C0758s(c0764v);
/* 591 */                           map14.put(Integer.valueOf(c0764v.f5650e), c0758s);
                                }
/* 598 */                       c0758s.f5624b++;
                            }
/* 603 */                   LinkedList linkedList2 = new LinkedList();
/* 608 */                   LinkedList linkedList3 = new LinkedList();
/* 613 */                   LinkedList linkedList4 = new LinkedList();
/* 620 */                   Iterator it = map13.entrySet().iterator();
/* 628 */                   while (it.hasNext()) {
/* 634 */                       Map.Entry entry = (Map.Entry) it.next();
/* 640 */                       Integer num = (Integer) entry.getKey();
/* 646 */                       Iterator it2 = it;
/* 650 */                       C0737i0 c0737i0M2658a = this.f5478p.m2658a(num.intValue());
/* 654 */                       if (c0737i0M2658a != null) {
/* 656 */                           linkedList2.add(c0737i0M2658a);
                                }
/* 663 */                       C0762u c0762u2 = (C0762u) entry.getValue();
/* 665 */                       c0762u2.getClass();
/* 690 */                       linkedList3.add(new Integer[]{num, Integer.valueOf(c0762u2.f5643a), Integer.valueOf(c0762u2.f5644b), Integer.valueOf(c0762u2.f5645c)});
/* 693 */                       it = it2;
                            }
/* 708 */                   for (Map.Entry entry2 : map14.entrySet()) {
/* 720 */                       Integer num2 = (Integer) entry2.getKey();
/* 728 */                       C0737i0 c0737i0M2658a2 = this.f5478p.m2658a(num2.intValue());
/* 732 */                       if (c0737i0M2658a2 != null) {
/* 734 */                           linkedList2.add(c0737i0M2658a2);
                                }
/* 741 */                       C0758s c0758s2 = (C0758s) entry2.getValue();
/* 743 */                       c0758s2.getClass();
/* 762 */                       linkedList4.add(new Integer[]{num2, Integer.valueOf(c0758s2.f5623a), Integer.valueOf(c0758s2.f5624b)});
                            }
/* 766 */                   C0754p0 c0754p0 = c0714a1.f5353h;
/* 768 */                   c0754p0.getClass();
/* 776 */                   c0745l.f5546s = new C0754p0(c0754p0, linkedList2, linkedList3, linkedList4);
                        } else if (c0714a1 != null) {
/* 783 */                   c0745l.f5546s = c0714a1.f5353h;
                        }
                    } catch (Exception e) {
/* 790 */               AbstractC0729f1.f5436a.m2612a("queryDataSegment-input_devices", e);
                    }
/* 795 */           AbstractC0729f1.m2571a(linkedList, c0745l.f5515D);
/* 800 */           AbstractC0729f1.m2571a(linkedListM2572b, c0745l.f5516E);
/* 809 */           if (quagoSettings.getSegmentQueryFullRange(QuagoSettings.SensoryType.ACCELEROMETER)) {
/* 811 */               j4 = j;
/* 813 */               j3 = j2;
                    } else {
/* 816 */               j3 = j25;
/* 818 */               j4 = j24;
                    }
/* 834 */           AbstractC0729f1.m2570a(this.f5467e, c0745l.f5517F, j4, j3, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.ACCELEROMETER));
/* 843 */           if (quagoSettings.getSegmentQueryFullRange(QuagoSettings.SensoryType.MAGNETIC_FIELD)) {
/* 845 */               j6 = j;
/* 847 */               j5 = j2;
                    } else {
/* 850 */               j5 = j25;
/* 852 */               j6 = j24;
                    }
/* 868 */           AbstractC0729f1.m2570a(this.f5468f, c0745l.f5518G, j6, j5, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.MAGNETIC_FIELD));
/* 877 */           if (quagoSettings.getSegmentQueryFullRange(QuagoSettings.SensoryType.GYROSCOPE)) {
/* 879 */               j8 = j;
/* 881 */               j7 = j2;
                    } else {
/* 884 */               j7 = j25;
/* 886 */               j8 = j24;
                    }
/* 902 */           AbstractC0729f1.m2570a(this.f5469g, c0745l.f5519H, j8, j7, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.GYROSCOPE));
/* 911 */           if (quagoSettings.getSegmentQueryFullRange(QuagoSettings.SensoryType.GEOMAGNETIC_ROTATION_VECTOR)) {
/* 913 */               j10 = j;
/* 915 */               j9 = j2;
                    } else {
/* 918 */               j9 = j25;
/* 920 */               j10 = j24;
                    }
/* 936 */           AbstractC0729f1.m2570a(this.f5470h, c0745l.f5520I, j10, j9, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.GEOMAGNETIC_ROTATION_VECTOR));
/* 945 */           if (quagoSettings.getSegmentQueryFullRange(QuagoSettings.SensoryType.PROXIMITY)) {
/* 947 */               j12 = j;
/* 949 */               j11 = j2;
                    } else {
/* 952 */               j11 = j25;
/* 954 */               j12 = j24;
                    }
/* 970 */           AbstractC0729f1.m2570a(this.f5471i, c0745l.f5521J, j12, j11, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.PROXIMITY));
/* 979 */           if (quagoSettings.getSegmentQueryFullRange(QuagoSettings.SensoryType.LIGHT)) {
/* 981 */               j14 = j;
/* 983 */               j13 = j2;
                    } else {
/* 986 */               j13 = j25;
/* 988 */               j14 = j24;
                    }
/* 1004 */          AbstractC0729f1.m2570a(this.f5472j, c0745l.f5522K, j14, j13, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.LIGHT));
/* 1013 */          if (quagoSettings.getSegmentQueryFullRange(QuagoSettings.SensoryType.PRESSURE)) {
/* 1015 */              j16 = j;
/* 1017 */              j15 = j2;
                    } else {
/* 1020 */              j15 = j25;
/* 1022 */              j16 = j24;
                    }
/* 1038 */          AbstractC0729f1.m2570a(this.f5473k, c0745l.f5523L, j16, j15, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.PRESSURE));
/* 1047 */          if (quagoSettings.getSegmentQueryFullRange(QuagoSettings.SensoryType.AMBIENT_TEMPERATURE)) {
/* 1049 */              j18 = j;
/* 1051 */              j17 = j2;
                    } else {
/* 1054 */              j17 = j25;
/* 1056 */              j18 = j24;
                    }
/* 1072 */          AbstractC0729f1.m2570a(this.f5474l, c0745l.f5524M, j18, j17, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.AMBIENT_TEMPERATURE));
/* 1081 */          if (quagoSettings.getSegmentQueryFullRange(QuagoSettings.SensoryType.STEP_DETECTOR)) {
/* 1083 */              j20 = j;
/* 1085 */              j19 = j2;
                    } else {
/* 1088 */              j19 = j25;
/* 1090 */              j20 = j24;
                    }
/* 1106 */          AbstractC0729f1.m2570a(this.f5476n, c0745l.f5525N, j20, j19, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.STEP_DETECTOR));
/* 1115 */          if (quagoSettings.getSegmentQueryFullRange(QuagoSettings.SensoryType.BATTERY)) {
/* 1117 */              j22 = j;
/* 1119 */              j21 = j2;
                    } else {
/* 1122 */              j21 = j25;
/* 1124 */              j22 = j24;
                    }
/* 1140 */          AbstractC0729f1.m2570a(this.f5475m, c0745l.f5527P, j22, j21, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.BATTERY));
/* 1155 */          AbstractC0729f1.m2570a(this.f5477o, c0745l.f5526O, j, j25, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.RESOLUTION));
/* 1174 */          AbstractC0729f1.m2570a(this.f5464b, c0745l.f5514C, j24, j25, quagoSettings.getQueryMaxCount(QuagoSettings.QuagoQueryMaxCount.LIFECYCLE));
/* 1179 */          AbstractC0729f1.m2569a(j, c0745l.f5515D);
/* 1184 */          AbstractC0729f1.m2569a(j, c0745l.f5516E);
/* 1189 */          AbstractC0729f1.m2573b(j, c0745l.f5514C);
/* 1194 */          AbstractC0729f1.m2573b(j, c0745l.f5517F);
/* 1199 */          AbstractC0729f1.m2573b(j, c0745l.f5518G);
/* 1204 */          AbstractC0729f1.m2573b(j, c0745l.f5519H);
/* 1209 */          AbstractC0729f1.m2573b(j, c0745l.f5520I);
/* 1214 */          AbstractC0729f1.m2573b(j, c0745l.f5521J);
/* 1219 */          AbstractC0729f1.m2573b(j, c0745l.f5522K);
/* 1224 */          AbstractC0729f1.m2573b(j, c0745l.f5523L);
/* 1229 */          AbstractC0729f1.m2573b(j, c0745l.f5524M);
/* 1234 */          AbstractC0729f1.m2573b(j, c0745l.f5525N);
/* 1239 */          AbstractC0729f1.m2573b(j, c0745l.f5526O);
/* 1244 */          AbstractC0729f1.m2573b(j, c0745l.f5527P);
/* 1247 */          return c0745l;
                }

                /* JADX INFO: renamed from: a */
/* 1247 */      public final void m2606a(C0766w c0766w) {
/* 1248 */          C0742k c0742k = this.f5464b;
                    int i = c0742k.f5507c + 1;
                    C0766w[] c0766wArr = (C0766w[]) c0742k.f5508d;
                    int length = i % c0766wArr.length;
                    synchronized (c0766wArr[length]) {
                        try {
/* 1250 */                  c0766w.mo2578a(((C0766w[]) this.f5464b.f5508d)[length]);
/* 1251 */                  this.f5464b.f5507c = length;
/* 1252 */                  QuagoSettings.LogLevel logLevel = QuagoSettings.LogLevel.VERBOSE;
                            Locale locale = AbstractC0743k0.f5509a;
/* 1253 */                  if (AbstractC0743k0.m2621a(logLevel.priority)) {
/* 1254 */                      C0740j0 c0740j0 = this.f5463a;
                                C0742k c0742k2 = this.f5464b;
/* 1257 */                      c0740j0.m2615d("onLifeCycleChanged", "%s%s(%s)", c0742k2.f5506b, ((C0766w[]) c0742k2.f5508d)[length].toString(), Integer.valueOf(this.f5464b.f5507c));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
/* 1259 */      public final void m2601a(KeyEvent keyEvent) {
                    int i;
                    if (keyEvent == null) {
                        return;
                    }
/* 1260 */          int action = keyEvent.getAction();
                    if (action == 0) {
/* 1262 */              EnumC0727f enumC0727f = EnumC0727f.ON_RESUME;
                        i = 1;
                    } else {
                        if (action != 1) {
                            return;
                        }
/* 1261 */              EnumC0727f enumC0727f2 = EnumC0727f.ON_RESUME;
                        i = 2;
                    }
/* 1263 */          int source = keyEvent.getSource();
/* 1264 */          int deviceId = keyEvent.getDeviceId();
/* 1265 */          C0742k c0742k = this.f5466d;
                    int i2 = c0742k.f5507c + 1;
                    C0764v[] c0764vArr = (C0764v[]) c0742k.f5508d;
                    int length = i2 % c0764vArr.length;
                    synchronized (c0764vArr[length]) {
                        try {
/* 1267 */                  Object[] objArr = this.f5466d.f5508d;
                            ((C0764v[]) objArr)[length].f5648c = i;
/* 1268 */                  ((C0764v[]) objArr)[length].f5647b = keyEvent.getDownTime();
/* 1269 */                  ((C0764v[]) this.f5466d.f5508d)[length].f5494a = keyEvent.getEventTime();
/* 1270 */                  C0742k c0742k2 = this.f5466d;
                            Object[] objArr2 = c0742k2.f5508d;
                            ((C0764v[]) objArr2)[length].f5649d = source;
/* 1271 */                  ((C0764v[]) objArr2)[length].f5650e = deviceId;
/* 1272 */                  c0742k2.f5507c = length;
/* 1273 */                  QuagoSettings.LogLevel logLevel = QuagoSettings.LogLevel.VERBOSE;
                            Locale locale = AbstractC0743k0.f5509a;
/* 1274 */                  if (AbstractC0743k0.m2621a(logLevel.priority)) {
/* 1275 */                      C0740j0 c0740j0 = this.f5463a;
                                C0742k c0742k3 = this.f5466d;
/* 1278 */                      c0740j0.m2615d("dispatchKey", "%s%s(%s)", c0742k3.f5506b, ((C0764v[]) c0742k3.f5508d)[length].toString(), Integer.valueOf(this.f5466d.f5507c));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
/* 1280 */      public final void m2602a(MotionEvent motionEvent) {
                    int i;
/* 1281 */          int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0) {
                        i = 5;
                        if (actionMasked == 1) {
/* 1285 */                  EnumC0727f enumC0727f = EnumC0727f.ON_RESUME;
                        } else if (actionMasked == 2 || actionMasked == 4) {
/* 1284 */                  EnumC0727f enumC0727f2 = EnumC0727f.ON_RESUME;
                            i = 3;
                        } else if (actionMasked != 5) {
                            if (actionMasked != 6) {
                                return;
                            }
/* 1282 */                  EnumC0727f enumC0727f3 = EnumC0727f.ON_RESUME;
                            i = 4;
                        } else {
/* 1283 */                  EnumC0727f enumC0727f4 = EnumC0727f.ON_RESUME;
                            i = 2;
                        }
                    } else {
/* 1286 */              EnumC0727f enumC0727f5 = EnumC0727f.ON_RESUME;
                        i = 1;
                    }
/* 1287 */          int deviceId = motionEvent.getDeviceId();
/* 1288 */          int source = motionEvent.getSource();
                    if (i == 3) {
/* 1289 */              for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
/* 1290 */                  C0742k c0742k = this.f5465c;
                            int i3 = c0742k.f5507c + 1;
                            C0768x[] c0768xArr = (C0768x[]) c0742k.f5508d;
                            int length = i3 % c0768xArr.length;
                            synchronized (c0768xArr[length]) {
                                try {
/* 1292 */                          Object[] objArr = this.f5465c.f5508d;
                                    ((C0768x[]) objArr)[length].f5670h = i;
/* 1293 */                          ((C0768x[]) objArr)[length].f5664b = motionEvent.getDownTime();
/* 1294 */                          ((C0768x[]) this.f5465c.f5508d)[length].f5494a = motionEvent.getEventTime();
/* 1295 */                          ((C0768x[]) this.f5465c.f5508d)[length].f5665c = motionEvent.getX(i2);
/* 1296 */                          ((C0768x[]) this.f5465c.f5508d)[length].f5666d = motionEvent.getY(i2);
/* 1297 */                          ((C0768x[]) this.f5465c.f5508d)[length].f5667e = motionEvent.getSize(i2);
/* 1298 */                          ((C0768x[]) this.f5465c.f5508d)[length].f5668f = Math.min(motionEvent.getPressure(i2), 1.0f);
/* 1299 */                          ((C0768x[]) this.f5465c.f5508d)[length].f5669g = motionEvent.getOrientation(i2);
/* 1300 */                          ((C0768x[]) this.f5465c.f5508d)[length].f5671i = motionEvent.getPointerId(i2);
/* 1301 */                          Object[] objArr2 = this.f5465c.f5508d;
                                    ((C0768x[]) objArr2)[length].f5672j = source;
/* 1302 */                          ((C0768x[]) objArr2)[length].f5673k = motionEvent.getToolType(i2);
/* 1303 */                          C0742k c0742k2 = this.f5465c;
                                    ((C0768x[]) c0742k2.f5508d)[length].f5674l = deviceId;
/* 1304 */                          c0742k2.f5507c = length;
/* 1305 */                          QuagoSettings.LogLevel logLevel = QuagoSettings.LogLevel.VERBOSE;
                                    Locale locale = AbstractC0743k0.f5509a;
/* 1306 */                          if (AbstractC0743k0.m2621a(logLevel.priority)) {
/* 1307 */                              C0740j0 c0740j0 = this.f5463a;
                                        C0742k c0742k3 = this.f5465c;
/* 1310 */                              c0740j0.m2615d("dispatchTouch", "%s%s(%s)", c0742k3.f5506b, ((C0768x[]) c0742k3.f5508d)[length].toString(), Integer.valueOf(this.f5465c.f5507c));
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return;
                    }
/* 1313 */          int actionIndex = motionEvent.getActionIndex();
/* 1314 */          C0742k c0742k4 = this.f5465c;
                    int i4 = c0742k4.f5507c + 1;
                    C0768x[] c0768xArr2 = (C0768x[]) c0742k4.f5508d;
                    int length2 = i4 % c0768xArr2.length;
                    synchronized (c0768xArr2[length2]) {
                        try {
/* 1316 */                  Object[] objArr3 = this.f5465c.f5508d;
                            ((C0768x[]) objArr3)[length2].f5670h = i;
/* 1317 */                  ((C0768x[]) objArr3)[length2].f5664b = motionEvent.getDownTime();
/* 1318 */                  ((C0768x[]) this.f5465c.f5508d)[length2].f5494a = motionEvent.getEventTime();
/* 1319 */                  ((C0768x[]) this.f5465c.f5508d)[length2].f5665c = motionEvent.getX(actionIndex);
/* 1320 */                  ((C0768x[]) this.f5465c.f5508d)[length2].f5666d = motionEvent.getY(actionIndex);
/* 1321 */                  ((C0768x[]) this.f5465c.f5508d)[length2].f5667e = motionEvent.getSize(actionIndex);
/* 1322 */                  ((C0768x[]) this.f5465c.f5508d)[length2].f5668f = Math.min(motionEvent.getPressure(actionIndex), 1.0f);
/* 1323 */                  ((C0768x[]) this.f5465c.f5508d)[length2].f5669g = motionEvent.getOrientation(actionIndex);
/* 1324 */                  ((C0768x[]) this.f5465c.f5508d)[length2].f5671i = motionEvent.getPointerId(actionIndex);
/* 1325 */                  Object[] objArr4 = this.f5465c.f5508d;
                            ((C0768x[]) objArr4)[length2].f5672j = source;
/* 1326 */                  ((C0768x[]) objArr4)[length2].f5673k = motionEvent.getToolType(actionIndex);
/* 1327 */                  C0742k c0742k5 = this.f5465c;
                            ((C0768x[]) c0742k5.f5508d)[length2].f5674l = deviceId;
/* 1328 */                  c0742k5.f5507c = length2;
/* 1329 */                  QuagoSettings.LogLevel logLevel2 = QuagoSettings.LogLevel.VERBOSE;
                            Locale locale2 = AbstractC0743k0.f5509a;
/* 1330 */                  if (AbstractC0743k0.m2621a(logLevel2.priority)) {
/* 1331 */                      C0740j0 c0740j1 = this.f5463a;
                                C0742k c0742k6 = this.f5465c;
/* 1334 */                      c0740j1.m2615d("dispatchTouch", "%s%s(%s)", c0742k6.f5506b, ((C0768x[]) c0742k6.f5508d)[length2].toString(), Integer.valueOf(this.f5465c.f5507c));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
/* 1336 */      public final void m2603a(C0742k c0742k) {
/* 1337 */          int i = c0742k.f5507c + 1;
                    C0744k1[] c0744k1Arr = (C0744k1[]) c0742k.f5508d;
                    int length = i % c0744k1Arr.length;
                    synchronized (c0744k1Arr[length]) {
                        try {
/* 1339 */                  ((C0744k1[]) c0742k.f5508d)[length].f5494a = SystemClock.uptimeMillis();
/* 1340 */                  c0742k.f5507c = length;
/* 1341 */                  QuagoSettings.LogLevel logLevel = QuagoSettings.LogLevel.VERBOSE;
                            Locale locale = AbstractC0743k0.f5509a;
/* 1342 */                  if (AbstractC0743k0.m2621a(logLevel.priority)) {
/* 1346 */                      this.f5463a.m2615d("onSensorChanged", "%s%s(%s)", c0742k.f5506b, ((C0744k1[]) c0742k.f5508d)[length].toString(), Integer.valueOf(length));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
/* 1348 */      public final void m2604a(C0742k c0742k, float f) {
/* 1349 */          int i = c0742k.f5507c + 1;
                    C0753p[] c0753pArr = (C0753p[]) c0742k.f5508d;
                    int length = i % c0753pArr.length;
                    synchronized (c0753pArr[length]) {
                        try {
/* 1351 */                  ((C0753p[]) c0742k.f5508d)[length].f5494a = SystemClock.uptimeMillis();
/* 1352 */                  ((C0753p[]) c0742k.f5508d)[length].f5606b = f;
/* 1353 */                  c0742k.f5507c = length;
/* 1354 */                  QuagoSettings.LogLevel logLevel = QuagoSettings.LogLevel.VERBOSE;
                            Locale locale = AbstractC0743k0.f5509a;
/* 1355 */                  if (AbstractC0743k0.m2621a(logLevel.priority)) {
/* 1359 */                      this.f5463a.m2615d("onSensorChanged", "%s%s(%s)", c0742k.f5506b, ((C0753p[]) c0742k.f5508d)[length].toString(), Integer.valueOf(length));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
/* 1361 */      public final void m2605a(C0742k c0742k, float f, float f2, float f3) {
/* 1362 */          int i = c0742k.f5507c + 1;
                    C0751o[] c0751oArr = (C0751o[]) c0742k.f5508d;
                    int length = i % c0751oArr.length;
                    synchronized (c0751oArr[length]) {
                        try {
/* 1364 */                  ((C0751o[]) c0742k.f5508d)[length].f5494a = SystemClock.uptimeMillis();
/* 1365 */                  Object[] objArr = c0742k.f5508d;
                            ((C0751o[]) objArr)[length].f5569b = f;
/* 1366 */                  ((C0751o[]) objArr)[length].f5570c = f2;
/* 1367 */                  ((C0751o[]) objArr)[length].f5571d = f3;
/* 1368 */                  c0742k.f5507c = length;
/* 1369 */                  QuagoSettings.LogLevel logLevel = QuagoSettings.LogLevel.VERBOSE;
                            Locale locale = AbstractC0743k0.f5509a;
/* 1370 */                  if (AbstractC0743k0.m2621a(logLevel.priority)) {
/* 1374 */                      this.f5463a.m2615d("onSensorChanged", "%s%s(%s)", c0742k.f5506b, ((C0751o[]) c0742k.f5508d)[length].toString(), Integer.valueOf(length));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
