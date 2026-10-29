            package p000;

            import android.content.Context;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.collections.C1839a;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yv2 {
                public static final xv2 Companion = new xv2();

                /* JADX INFO: renamed from: a */
                public final Context f19822a;

                /* JADX INFO: renamed from: b */
                public final ac1 f19823b;

                /* JADX INFO: renamed from: c */
                public final ac1 f19824c;

                /* JADX INFO: renamed from: d */
                public final er0 f19825d;

                /* JADX INFO: renamed from: e */
                public ac1 f19826e;

                /* JADX INFO: renamed from: f */
                public final String f19827f;

                /* JADX INFO: renamed from: g */
                public final m82 f19828g;

                /* JADX INFO: renamed from: h */
                public final l82 f19829h;

                /* JADX INFO: renamed from: i */
                public final yz2 f19830i;

                /* JADX INFO: renamed from: j */
                public ra2 f19831j;

                /* JADX INFO: renamed from: k */
                public final ew2 f19832k;

                /* JADX INFO: renamed from: l */
                public final boolean f19833l;

                /* JADX INFO: renamed from: m */
                public final ts0 f19834m;

                /* JADX INFO: renamed from: n */
                public final o61 f19835n;

                /* JADX INFO: renamed from: o */
                public final er0 f19836o;

                /* JADX INFO: renamed from: p */
                public uv2 f19837p;

                /* JADX INFO: renamed from: q */
                public boolean f19838q;

                public yv2(Context context, ac1 ac1Var, ac1 ac1Var2, er0 er0Var, ac1 ac1Var3, String str, m82 m82Var, l82 l82Var, yz2 yz2Var, ra2 ra2Var, ew2 ew2Var, boolean z, ts0 ts0Var, o61 o61Var, Integer num) {
/* 5 */             ac1Var.getClass();
/* 8 */             str.getClass();
/* 11 */            o61Var.getClass();
/* 19 */            this.f19822a = context;
/* 23 */            this.f19823b = ac1Var;
/* 27 */            this.f19824c = ac1Var2;
/* 31 */            this.f19825d = er0Var;
/* 35 */            this.f19826e = ac1Var3;
/* 39 */            this.f19827f = str;
/* 43 */            this.f19828g = m82Var;
/* 45 */            this.f19829h = l82Var;
/* 49 */            this.f19830i = yz2Var;
/* 53 */            this.f19831j = ra2Var;
/* 57 */            this.f19832k = ew2Var;
/* 61 */            this.f19833l = z;
/* 65 */            this.f19834m = ts0Var;
/* 69 */            this.f19835n = o61Var;
/* 111 */           this.f19836o = new er0(new n01(1, context, mn0.class, "openUrl", "openUrl(Landroid/content/Context;Ljava/lang/String;)V", 1, 8), new n01(1, this, yv2.class, "showCookiesDialog", "showCookiesDialog(Lcom/usercentrics/sdk/models/settings/PredefinedUIStorageInformationButtonInfo;)V", 0, 9));
/* 113 */           Boolean bool = l82Var.f13151a;
/* 130 */           this.f19838q = bool != null ? bool.booleanValue() : ((C1029ij) this.f19826e.f178c).f9628a;
                }

                /* JADX WARN: Code duplicated, block: B:119:0x0360  */
                /* JADX WARN: Code duplicated, block: B:120:0x0368  */
                /* JADX WARN: Code duplicated, block: B:123:0x036e  */
                /* JADX WARN: Code duplicated, block: B:126:0x0383 A[LOOP:4: B:124:0x037d->B:126:0x0383, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:128:0x039b  */
                /* JADX INFO: renamed from: a */
                public final void m10184a(uv2 uv2Var) {
                    Iterator it;
                    ArrayList arrayList;
                    dv2 dv2Var;
                    int i;
                    ArrayList arrayList2;
                    String str;
                    st2 st2Var;
                    zt2 zt2Var;
                    zt2 zt2Var2;
                    ArrayList arrayListM7773h;
                    vv1 vv1Var;
                    fw2 fw2Var;
                    List<vv1> list;
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    zt2 zt2VarM9566q;
/* 7 */             List list2 = (List) this.f19826e.f179d;
/* 11 */            int i2 = 10;
/* 17 */            ArrayList arrayList5 = new ArrayList(C2122qw.m8020h(list2, 10));
/* 20 */            Iterator it2 = list2.iterator();
                    while (true) {
/* 24 */                boolean zHasNext = it2.hasNext();
/* 28 */                ac1 ac1Var = this.f19823b;
/* 30 */                if (!zHasNext) {
/* 1207 */                  ArrayList arrayList6 = arrayList5;
/* 1212 */                  Integer num = this.f19829h.f13152b;
/* 1225 */                  cv2 cv2Var = new cv2(num != null ? num.intValue() : 0, arrayList6);
/* 1238 */                  qv2 qv2Var = new qv2((qi1) this.f19826e.f177b, this.f19835n, this);
/* 1246 */                  C1029ij c1029ij = (C1029ij) this.f19826e.f178c;
/* 1248 */                  m82 m82Var = this.f19828g;
/* 1276 */                  uv2Var.mo4450a(cv2Var, qv2Var, new nv2(c1029ij, this.f19833l, m82Var != null ? m82Var.f13658a : null, (ec0) this.f19831j.f15957c, this.f19832k, this));
/* 1279 */                  ac1Var.m176e();
/* 1282 */                  return;
                        }
/* 36 */                xv1 xv1Var = (xv1) it2.next();
/* 38 */                wv1 wv1Var = xv1Var.f19384b;
/* 40 */                String str2 = xv1Var.f19383a;
/* 44 */                if (wv1Var instanceof pv1) {
/* 50 */                    List list3 = ((pv1) wv1Var).f15297a;
/* 58 */                    ArrayList arrayList7 = new ArrayList(C2122qw.m8020h(list3, i2));
/* 61 */                    Iterator it3 = list3.iterator();
/* 69 */                    while (it3.hasNext()) {
/* 75 */                        du1 du1Var = (du1) it3.next();
/* 77 */                        String str3 = du1Var.f7410a;
/* 79 */                        List list4 = du1Var.f7411b;
/* 87 */                        ArrayList arrayList8 = new ArrayList(C2122qw.m8020h(list4, i2));
/* 90 */                        Iterator it4 = list4.iterator();
/* 98 */                        while (it4.hasNext()) {
/* 104 */                           cu1 cu1Var = (cu1) it4.next();
/* 108 */                           yv1 yv1VarM187q = ac1Var.m187q(cu1Var);
/* 112 */                           ra2 ra2Var = this.f19831j;
/* 114 */                           er0 er0Var = this.f19836o;
/* 116 */                           er0Var.getClass();
/* 119 */                           Iterator it5 = it2;
/* 121 */                           pg3 pg3Var = cu1Var.f6912e;
/* 123 */                           Iterator it6 = it3;
/* 127 */                           if (pg3Var instanceof sv1) {
/* 131 */                               mv1 mv1Var = ((sv1) pg3Var).f16826i;
/* 133 */                               List list5 = mv1Var.f14034c;
/* 137 */                               we2 we2Var = (we2) er0Var.f7853b;
/* 141 */                               if (list5 != null) {
/* 151 */                                   arrayListM7773h = new ArrayList(C2122qw.m8020h(list5, 10));
/* 154 */                                   Iterator it7 = list5.iterator();
/* 162 */                                   while (it7.hasNext()) {
/* 168 */                                       lv1 lv1Var = (lv1) it7.next();
/* 170 */                                       w11 w11Var = lv1Var.f13501b;
/* 172 */                                       Iterator it8 = it7;
/* 176 */                                       if (w11Var instanceof rv1) {
/* 196 */                                           zt2VarM9566q = new zt2(lv1Var.f13500a, ((rv1) w11Var).f16322f, null, null, 12);
                                                } else if (w11Var instanceof zu1) {
/* 210 */                                           String str4 = ((zu1) w11Var).f20334f;
/* 214 */                                           String str5 = lv1Var.f13500a;
/* 218 */                                           we2Var.getClass();
/* 221 */                                           str4.getClass();
/* 246 */                                           zt2VarM9566q = new zt2(str5, null, new we2(str4, new C1908lz(9, we2Var, str4)), null, 10);
                                                } else {
/* 254 */                                           if (!(w11Var instanceof uv1)) {
/* 269 */                                               ds0.m3187b();
/* 272 */                                               return;
                                                    }
/* 256 */                                           zt2VarM9566q = we2Var.m9566q(lv1Var);
                                                }
/* 261 */                                       arrayListM7773h.add(zt2VarM9566q);
/* 264 */                                       it7 = it8;
/* 266 */                                       arrayList5 = arrayList5;
                                            }
/* 273 */                                   arrayList2 = arrayList5;
/* 275 */                                   str = str2;
                                        } else {
/* 287 */                                   arrayList2 = arrayList5;
/* 289 */                                   lv1 lv1Var2 = mv1Var.f14047p;
/* 291 */                                   mu1 mu1Var = mv1Var.f14037f;
/* 293 */                                   aw1 aw1Var = mv1Var.f14044m;
/* 304 */                                   zt2 zt2VarM9566q2 = lv1Var2 != null ? we2Var.m9566q(lv1Var2) : null;
/* 306 */                                   q90 q90Var = mv1Var.f14048q;
/* 318 */                                   str = str2;
/* 320 */                                   if (q90Var == null || q90Var != q90.f15447a) {
/* 373 */                                       we2Var.getClass();
/* 376 */                                       zt2 zt2VarM9556i = we2.m9556i(mv1Var, ra2Var);
/* 382 */                                       nv1 nv1Var = (nv1) ra2Var.f15956b;
/* 386 */                                       ac1 ac1Var2 = nv1Var.f14466b;
/* 390 */                                       C2216tf c2216tf = nv1Var.f14475k;
/* 392 */                                       zt2 zt2VarM9555h = we2.m9555h(mv1Var, ra2Var);
/* 396 */                                       zt2 zt2VarM9552e = we2.m9552e(mv1Var, ra2Var);
/* 404 */                                       ArrayList arrayListM10223r = yy1.m10223r(mv1Var.f14043l);
/* 412 */                                       if (arrayListM10223r.isEmpty()) {
/* 438 */                                           zt2Var = null;
                                                } else {
/* 416 */                                           ru1 ru1Var = nv1Var.f14474j;
/* 432 */                                           zt2Var = new zt2(ru1Var.f16298b, ru1Var.f16297a, null, arrayListM10223r, 4);
                                                }
/* 440 */                                       zt2 zt2VarM9551d = we2.m9551d(mv1Var, ra2Var);
/* 453 */                                       ArrayList arrayListM10223r2 = yy1.m10223r(mv1Var.f14050s ? nd0.f14189a : mv1Var.f14049r);
/* 461 */                                       if (arrayListM10223r2.isEmpty()) {
/* 487 */                                           zt2Var2 = null;
                                                } else {
/* 465 */                                           ru1 ru1Var2 = nv1Var.f14471g;
/* 481 */                                           zt2Var2 = new zt2(ru1Var2.f16298b, ru1Var2.f16297a, null, arrayListM10223r2, 4);
                                                }
/* 496 */                                       String str6 = mu1Var != null ? mu1Var.f14027a : null;
/* 525 */                                       zt2 zt2Var3 = (str6 == null || StringsKt.m6228D(str6)) ? null : new zt2((String) ac1Var2.f177b, str6, null, null, 12);
/* 555 */                                       zt2 zt2Var4 = !StringsKt.m6228D(mv1Var.f14042k) ? new zt2(nv1Var.f14473i, mv1Var.f14042k, null, null, 12) : null;
/* 562 */                                       String str7 = mu1Var != null ? mu1Var.f14028b : null;
/* 598 */                                       zt2 zt2Var5 = (str7 == null || StringsKt.m6228D(str7)) ? null : new zt2((String) ac1Var2.f178c, (String) ac1Var2.f179d, null, C1839a.m6210b(str7), 4);
/* 600 */                                       zt2 zt2VarM9553f = we2.m9553f(mv1Var, ra2Var);
/* 609 */                                       String str8 = aw1Var != null ? aw1Var.f2129d : null;
/* 653 */                                       zt2 zt2Var6 = (str8 == null || StringsKt.m6228D(str8)) ? null : new zt2(c2216tf.f17064d, null, new we2(str8, new C1908lz(9, we2Var, str8)), null, 10);
/* 660 */                                       String str9 = aw1Var != null ? aw1Var.f2126a : null;
/* 700 */                                       zt2 zt2Var7 = (str9 == null || StringsKt.m6228D(str9)) ? null : new zt2(c2216tf.f17061a, null, new we2(str9, new C1908lz(9, we2Var, str9)), null, 10);
/* 707 */                                       String str10 = aw1Var != null ? aw1Var.f2128c : null;
/* 747 */                                       zt2 zt2Var8 = (str10 == null || StringsKt.m6228D(str10)) ? null : new zt2(c2216tf.f17063c, null, new we2(str10, new C1908lz(9, we2Var, str10)), null, 10);
/* 754 */                                       String str11 = aw1Var != null ? aw1Var.f2127b : null;
/* 855 */                                       arrayListM7773h = C2103qd.m7773h(new yt2[]{zt2VarM9556i, zt2VarM9555h, zt2VarM9552e, zt2Var, zt2VarM9551d, zt2Var2, zt2Var3, zt2Var4, zt2Var5, zt2VarM9553f, zt2Var6, zt2Var7, zt2Var8, (str11 == null || StringsKt.m6228D(str11)) ? null : new zt2(c2216tf.f17062b, null, new we2(str11, new C1908lz(9, we2Var, str11)), null, 10), zt2VarM9566q2, we2.m9554g(mv1Var, ra2Var)});
                                            } else {
/* 326 */                                       we2Var.getClass();
/* 368 */                                       arrayListM7773h = C2103qd.m7773h(new yt2[]{we2.m9556i(mv1Var, ra2Var), we2.m9555h(mv1Var, ra2Var), we2.m9552e(mv1Var, ra2Var), we2.m9551d(mv1Var, ra2Var), we2.m9553f(mv1Var, ra2Var), we2.m9554g(mv1Var, ra2Var)});
                                            }
/* 283 */                                   ArrayList arrayList9 = arrayListM7773h;
/* 861 */                                   vv1Var = cu1Var.f6911d;
/* 863 */                                   if (vv1Var != null) {
/* 867 */                                       fw2Var = new fw2(vv1Var, yv1VarM187q);
                                            } else {
/* 873 */                                       fw2Var = null;
                                            }
/* 875 */                                   list = cu1Var.f6913f;
/* 877 */                                   if (list != null) {
/* 887 */                                       arrayList4 = new ArrayList(C2122qw.m8020h(list, 10));
/* 898 */                                       for (vv1 vv1Var2 : list) {
/* 917 */                                           arrayList4.add(new fw2(vv1Var2, ac1Var.m190u(cu1Var.f6908a, vv1Var2)));
                                                }
/* 921 */                                       arrayList3 = arrayList4;
                                            } else {
/* 924 */                                       arrayList3 = null;
                                            }
/* 940 */                                   st2Var = new st2(cu1Var.f6908a, cu1Var.f6909b, cu1Var.f6910c, fw2Var, arrayList9, arrayList3);
                                        }
/* 281 */                               str3 = str3;
/* 283 */                               ArrayList arrayList10 = arrayListM7773h;
/* 861 */                               vv1Var = cu1Var.f6911d;
/* 863 */                               if (vv1Var != null) {
/* 867 */                                   fw2Var = new fw2(vv1Var, yv1VarM187q);
                                        } else {
/* 873 */                                   fw2Var = null;
                                        }
/* 875 */                               list = cu1Var.f6913f;
/* 877 */                               if (list != null) {
/* 887 */                                   arrayList4 = new ArrayList(C2122qw.m8020h(list, 10));
/* 898 */                                   while (r0.hasNext()) {
/* 917 */                                       arrayList4.add(new fw2(vv1Var2, ac1Var.m190u(cu1Var.f6908a, vv1Var2)));
                                            }
/* 921 */                                   arrayList3 = arrayList4;
                                        } else {
/* 924 */                                   arrayList3 = null;
                                        }
/* 940 */                               st2Var = new st2(cu1Var.f6908a, cu1Var.f6909b, cu1Var.f6910c, fw2Var, arrayList10, arrayList3);
                                    } else {
/* 946 */                               arrayList2 = arrayList5;
/* 948 */                               str = str2;
/* 950 */                               dv2Var = dv2Var;
/* 952 */                               arrayList7 = arrayList7;
/* 954 */                               str3 = str3;
/* 960 */                               if (!(pg3Var instanceof qv1)) {
/* 1037 */                                  throw new vn1("Not supported card content");
                                        }
/* 1003 */                              st2Var = new st2(cu1Var.f6908a, cu1Var.f6909b, cu1Var.f6910c, null, C1839a.m6210b(new zt2(null, ((qv1) pg3Var).f15779v, null, null, 12)), null);
                                    }
/* 1007 */                          arrayList8.add(st2Var);
/* 1010 */                          it2 = it5;
/* 1012 */                          it3 = it6;
/* 1014 */                          it4 = it4;
/* 1016 */                          str2 = str;
/* 1018 */                          arrayList5 = arrayList2;
/* 1020 */                          dv2Var = dv2Var;
/* 1022 */                          arrayList7 = arrayList7;
/* 1024 */                          str3 = str3;
                                }
/* 1048 */                      ArrayList arrayList11 = arrayList7;
/* 1067 */                      arrayList11.add(new ut2(str3, arrayList8, m10185b(du1Var)));
/* 1070 */                      arrayList7 = arrayList11;
/* 1071 */                      it2 = it2;
/* 1073 */                      arrayList5 = arrayList5;
/* 1075 */                      i2 = 10;
                            }
/* 1079 */                  it = it2;
/* 1081 */                  arrayList = arrayList5;
/* 1086 */                  new dv2(str2, arrayList7);
/* 1089 */                  i = 10;
                        } else {
/* 1094 */                  it = it2;
/* 1096 */                  arrayList = arrayList5;
/* 1101 */                  if (!(wv1Var instanceof eu1)) {
/* 1203 */                      ds0.m3187b();
/* 1206 */                      return;
                            }
/* 1107 */                  List<du1> list6 = ((eu1) wv1Var).f7884a;
/* 1111 */                  i = 10;
/* 1117 */                  ArrayList arrayList12 = new ArrayList(C2122qw.m8020h(list6, 10));
/* 1128 */                  for (du1 du1Var2 : list6) {
/* 1136 */                      String str12 = du1Var2.f7410a;
/* 1138 */                      List<cu1> list7 = du1Var2.f7411b;
/* 1146 */                      ArrayList arrayList13 = new ArrayList(C2122qw.m8020h(list7, 10));
/* 1157 */                      for (cu1 cu1Var2 : list7) {
/* 1173 */                          arrayList13.add(q62.m7732d(cu1Var2, ac1Var.m187q(cu1Var2), ac1Var));
                                }
/* 1186 */                      arrayList12.add(new ut2(str12, arrayList13, m10185b(du1Var2)));
                            }
/* 1190 */                  dv2Var = new dv2(str2, arrayList12);
                        }
/* 1091 */              ArrayList arrayList14 = arrayList;
/* 1194 */              arrayList14.add(dv2Var);
/* 1197 */              arrayList5 = arrayList14;
/* 1198 */              i2 = i;
/* 1199 */              it2 = it;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final du2 m10185b(du1 du1Var) {
/* 1 */             fu1 fu1Var = du1Var.f7412c;
/* 3 */             if (fu1Var == null) {
/* 5 */                 return null;
                    }
/* 9 */             String str = fu1Var.f8357a;
/* 11 */            String str2 = fu1Var.f8358b;
/* 19 */            String str3 = ((au1) this.f19831j.f15958d).f2096c;
/* 21 */            if (str3 == null) {
/* 23 */                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 40 */            return new du2(str, str2, str3, new v11(0, this, yv2.class, "onCopyControllerId", "onCopyControllerId()V", 0, 6));
                }

                /* JADX INFO: renamed from: c */
                public final void m10186c(kt2 kt2Var) {
/* 1 */             int iOrdinal = kt2Var.ordinal();
/* 5 */             ts0 ts0Var = this.f19834m;
/* 7 */             ac1 ac1Var = this.f19824c;
/* 9 */             if (iOrdinal == 0) {
/* 101 */               ts0Var.m8898g(he3.m4198u(ac1Var.m174c(wk2.SECOND_LAYER)));
/* 104 */               return;
                    }
/* 12 */            ac1 ac1Var2 = this.f19823b;
/* 14 */            if (iOrdinal == 1) {
/* 87 */                ts0Var.m8898g(he3.m4198u(ac1Var.m178g(wk2.SECOND_LAYER, ac1Var2.m192y())));
/* 90 */                return;
                    }
/* 17 */            if (iOrdinal == 2) {
/* 69 */                ts0Var.m8898g(he3.m4198u(ac1Var.m169L(wk2.SECOND_LAYER, ac1Var2.m192y())));
                    } else {
/* 20 */                if (iOrdinal == 3 || iOrdinal != 4) {
/* 54 */                    return;
                        }
/* 51 */                ts0Var.m8898g(he3.m4198u(this.f19838q ? ac1Var.m178g(wk2.SECOND_LAYER, ac1Var2.m192y()) : ac1Var.m174c(wk2.SECOND_LAYER)));
                    }
                }
            }
