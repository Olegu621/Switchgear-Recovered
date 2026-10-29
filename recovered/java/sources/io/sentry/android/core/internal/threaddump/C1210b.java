            package io.sentry.android.core.internal.threaddump;

            import io.sentry.C1554m6;
            import io.sentry.C1566n5;
            import io.sentry.C1666s6;
            import io.sentry.EnumC1553m5;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.protocol.C1590a0;
            import io.sentry.protocol.C1593c;
            import io.sentry.protocol.C1594c0;
            import io.sentry.protocol.C1598e0;
            import io.sentry.protocol.DebugImage;
            import io.sentry.util.AbstractC1704c;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.cd1;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.threaddump.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1210b {

                /* JADX INFO: renamed from: h */
                public static final Pattern f10106h = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

                /* JADX INFO: renamed from: i */
                public static final Pattern f10107i = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

                /* JADX INFO: renamed from: j */
                public static final Pattern f10108j = Pattern.compile("----- pid (\\d+) at .*");

                /* JADX INFO: renamed from: k */
                public static final Pattern f10109k = Pattern.compile("\\s*\\|\\s*sysTid=(\\d+).*");

                /* JADX INFO: renamed from: l */
                public static final Pattern f10110l = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");

                /* JADX INFO: renamed from: m */
                public static final Pattern f10111m = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

                /* JADX INFO: renamed from: n */
                public static final Pattern f10112n = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

                /* JADX INFO: renamed from: o */
                public static final Pattern f10113o = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

                /* JADX INFO: renamed from: p */
                public static final Pattern f10114p = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

                /* JADX INFO: renamed from: q */
                public static final Pattern f10115q = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

                /* JADX INFO: renamed from: r */
                public static final Pattern f10116r = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

                /* JADX INFO: renamed from: s */
                public static final Pattern f10117s = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

                /* JADX INFO: renamed from: t */
                public static final Pattern f10118t = Pattern.compile(" *- waiting to lock an unknown object");

                /* JADX INFO: renamed from: u */
                public static final Pattern f10119u = Pattern.compile("\\s+");

                /* JADX INFO: renamed from: a */
                public final C1554m6 f10120a;

                /* JADX INFO: renamed from: b */
                public final boolean f10121b;

                /* JADX INFO: renamed from: c */
                public Long f10122c;

                /* JADX INFO: renamed from: d */
                public final C1666s6 f10123d;

                /* JADX INFO: renamed from: g */
                public final C1666s6 f10126g = new C1666s6(1);

                /* JADX INFO: renamed from: e */
                public final HashMap f10124e = new HashMap();

                /* JADX INFO: renamed from: f */
                public final ArrayList f10125f = new ArrayList();

                public C1210b(C1554m6 c1554m6, boolean z) {
/* 12 */            this.f10120a = c1554m6;
/* 14 */            this.f10121b = z;
/* 22 */            this.f10123d = new C1666s6(c1554m6, 0);
                }

                /* JADX INFO: renamed from: a */
                public static void m4817a(C1598e0 c1598e0, C1566n5 c1566n5) {
/* 1 */             Map map = c1598e0.f11296U;
/* 3 */             if (map == null) {
/* 7 */                 map = new HashMap();
                    }
/* 16 */            C1566n5 c1566n6 = (C1566n5) map.get(c1566n5.f11178b);
/* 18 */            if (c1566n6 != null) {
/* 28 */                c1566n6.f11177a = Math.max(c1566n6.f11177a, c1566n5.f11177a);
                    } else {
/* 31 */                String str = c1566n5.f11178b;
/* 35 */                C1566n5 c1566n7 = new C1566n5();
/* 40 */                c1566n7.f11177a = c1566n5.f11177a;
/* 42 */                c1566n7.f11178b = str;
/* 46 */                c1566n7.f11179c = c1566n5.f11179c;
/* 50 */                c1566n7.f11180d = c1566n5.f11180d;
/* 54 */                c1566n7.f11181e = c1566n5.f11181e;
/* 62 */                c1566n7.f11182f = AbstractC1704c.m5459n(c1566n5.f11182f);
/* 64 */                map.put(str, c1566n7);
                    }
/* 67 */            c1598e0.f11296U = map;
                }

                /* JADX INFO: renamed from: b */
                public static Long m4818b(Matcher matcher, int i) {
/* 1 */             String strGroup = matcher.group(i);
/* 5 */             if (strGroup == null || strGroup.length() == 0) {
/* 23 */                return null;
                    }
/* 18 */            return Long.valueOf(Long.parseLong(strGroup));
                }

                /* JADX INFO: renamed from: c */
                public static boolean m4819c(Matcher matcher, String str) {
/* 1 */             matcher.reset(str);
/* 4 */             return matcher.matches();
                }

                /* JADX WARN: Code duplicated, block: B:103:0x0301  */
                /* JADX WARN: Code duplicated, block: B:105:0x030e  */
                /* JADX WARN: Code duplicated, block: B:113:0x034b  */
                /* JADX WARN: Code duplicated, block: B:117:0x036e  */
                /* JADX WARN: Code duplicated, block: B:119:0x0379  */
                /* JADX WARN: Code duplicated, block: B:125:0x03a3  */
                /* JADX WARN: Code duplicated, block: B:128:0x03c5  */
                /* JADX WARN: Code duplicated, block: B:129:0x03c8  */
                /* JADX WARN: Code duplicated, block: B:131:0x03ce  */
                /* JADX WARN: Code duplicated, block: B:133:0x03d6  */
                /* JADX WARN: Code duplicated, block: B:134:0x03f6  */
                /* JADX WARN: Code duplicated, block: B:136:0x0403  */
                /* JADX WARN: Code duplicated, block: B:138:0x040e  */
                /* JADX WARN: Code duplicated, block: B:140:0x0418  */
                /* JADX WARN: Code duplicated, block: B:141:0x044a  */
                /* JADX WARN: Code duplicated, block: B:143:0x0450 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:144:0x0452  */
                /* JADX WARN: Code duplicated, block: B:145:0x0474  */
                /* JADX WARN: Code duplicated, block: B:147:0x047a A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:148:0x047c  */
                /* JADX WARN: Code duplicated, block: B:149:0x049e  */
                /* JADX WARN: Code duplicated, block: B:151:0x04a4 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:152:0x04a6  */
                /* JADX WARN: Code duplicated, block: B:153:0x04c9  */
                /* JADX WARN: Code duplicated, block: B:155:0x04cf A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:156:0x04d1  */
                /* JADX WARN: Code duplicated, block: B:158:0x0500  */
                /* JADX WARN: Code duplicated, block: B:159:0x0502  */
                /* JADX WARN: Code duplicated, block: B:161:0x050b A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:162:0x050d  */
                /* JADX WARN: Code duplicated, block: B:165:0x0532  */
                /* JADX WARN: Code duplicated, block: B:166:0x0534  */
                /* JADX WARN: Code duplicated, block: B:168:0x053d A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:169:0x053f  */
                /* JADX WARN: Code duplicated, block: B:170:0x054c  */
                /* JADX WARN: Code duplicated, block: B:172:0x0552  */
                /* JADX WARN: Code duplicated, block: B:179:0x0581  */
                /* JADX WARN: Code duplicated, block: B:205:0x056d A[EDGE_INSN: B:205:0x056d->B:176:0x056d BREAK  A[LOOP:1: B:89:0x02c5->B:175:0x055b], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:206:0x056d A[EDGE_INSN: B:206:0x056d->B:176:0x056d BREAK  A[LOOP:1: B:89:0x02c5->B:175:0x055b], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:207:0x02db A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:208:0x02cf A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:212:0x055b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:64:0x01d8 A[PHI: r21 r23 r25 r26 r28 r31 r34
  0x01d8: PHI (r21v2 java.util.regex.Matcher) = (r21v3 java.util.regex.Matcher), (r21v4 java.util.regex.Matcher) binds: [B:63:0x01d2, B:177:0x057d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r23v2 java.util.regex.Pattern) = (r23v3 java.util.regex.Pattern), (r23v4 java.util.regex.Pattern) binds: [B:63:0x01d2, B:177:0x057d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r25v1 java.util.regex.Matcher) = (r25v2 java.util.regex.Matcher), (r25v3 java.util.regex.Matcher) binds: [B:63:0x01d2, B:177:0x057d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r26v1 java.util.regex.Matcher) = (r26v2 java.util.regex.Matcher), (r26v3 java.util.regex.Matcher) binds: [B:63:0x01d2, B:177:0x057d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r28v1 java.util.ArrayList) = (r28v2 java.util.ArrayList), (r28v3 java.util.ArrayList) binds: [B:63:0x01d2, B:177:0x057d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r31v2 java.lang.String) = (r4v1 java.lang.String), (r31v4 java.lang.String) binds: [B:63:0x01d2, B:177:0x057d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r34v2 int) = (r2v1 int), (r34v5 int) binds: [B:63:0x01d2, B:177:0x057d] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:91:0x02c9  */
                /* JADX WARN: Code duplicated, block: B:95:0x02df  */
                /* JADX WARN: Code duplicated, block: B:97:0x02e9  */
                /* JADX INFO: renamed from: d */
                public final void m4820d(cd1 cd1Var) {
                    Pattern pattern;
                    Matcher matcher;
                    Pattern pattern2;
                    ArrayList arrayList;
                    Matcher matcher2;
                    Matcher matcher3;
                    C1554m6 c1554m6;
                    ArrayList arrayList2;
                    Matcher matcher4;
                    Matcher matcher5;
                    Matcher matcher6;
                    Matcher matcher7;
                    Matcher matcher8;
                    Matcher matcher9;
                    Matcher matcher10;
                    Matcher matcher11;
                    Matcher matcher12;
                    Matcher matcher13;
                    Matcher matcher14;
                    C1590a0 c1590a0;
                    C1594c0 c1594c0;
                    C1209a c1209aM1631a;
                    String str;
                    Matcher matcher15;
                    Matcher matcher16;
                    Matcher matcher17;
                    C1590a0 c1590a1;
                    String strGroup;
                    Integer numValueOf;
                    String strGroup2;
                    String strM5163a;
                    HashMap map;
                    String strGroup3;
                    Integer numValueOf2;
                    Long lM4818b;
/* 3 */             cd1 cd1Var2 = cd1Var;
/* 5 */             int i = cd1Var2.f2845a;
/* 7 */             Pattern pattern3 = f10106h;
/* 9 */             String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 11 */            Matcher matcher18 = pattern3.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
/* 15 */            Pattern pattern4 = f10107i;
/* 17 */            Matcher matcher19 = pattern4.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
/* 23 */            Matcher matcher20 = f10108j.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
                    while (true) {
/* 27 */                int i2 = cd1Var2.f2846b;
/* 29 */                ArrayList<C1598e0> arrayList3 = this.f10125f;
/* 34 */                if (i2 >= i) {
/* 1446 */                  for (C1598e0 c1598e0 : arrayList3) {
/* 1454 */                      Boolean bool = Boolean.TRUE;
/* 1462 */                      if (bool.equals(c1598e0.f11305v)) {
/* 1464 */                          c1598e0.f11300c = "main";
/* 1466 */                          c1598e0.f11302e = bool;
/* 1478 */                          c1598e0.f11303f = Boolean.valueOf(!this.f10121b);
                                } else {
/* 1483 */                          Boolean bool2 = Boolean.FALSE;
/* 1485 */                          c1598e0.f11302e = bool2;
/* 1487 */                          c1598e0.f11303f = bool2;
/* 1489 */                          c1598e0.f11305v = bool2;
                                }
                            }
/* 1492 */                  return;
                        }
/* 36 */                C1209a c1209aM1631a2 = cd1Var2.m1631a();
/* 41 */                String str3 = "Internal error while parsing thread dump.";
/* 43 */                C1554m6 c1554m7 = this.f10120a;
/* 45 */                if (c1209aM1631a2 == null) {
/* 55 */                    c1554m7.getLogger().mo4672k(EnumC1553m5.WARNING, "Internal error while parsing thread dump.", new Object[0]);
/* 58 */                    return;
                        }
/* 59 */                String str4 = c1209aM1631a2.f10105a;
/* 65 */                Long lValueOf = null;
/* 67 */                if (m4819c(matcher18, str4) || m4819c(matcher19, str4)) {
/* 420 */                   cd1Var2.f2846b--;
/* 424 */                   C1598e0 c1598e1 = new C1598e0();
/* 427 */                   Matcher matcher21 = pattern3.matcher(str2);
/* 431 */                   Matcher matcher22 = pattern4.matcher(str2);
/* 435 */                   pattern = pattern3;
/* 439 */                   if (cd1Var2.f2846b >= i) {
/* 463 */                       matcher = matcher18;
/* 465 */                       pattern2 = pattern4;
/* 467 */                       matcher3 = matcher19;
/* 469 */                       matcher2 = matcher20;
/* 471 */                       arrayList = arrayList3;
/* 473 */                       c1598e1 = null;
                            } else {
/* 441 */                       C1209a c1209aM1631a3 = cd1Var2.m1631a();
/* 445 */                       if (c1209aM1631a3 == null) {
/* 456 */                           c1554m7.getLogger().mo4672k(EnumC1553m5.WARNING, "Internal error while parsing thread dump.", new Object[0]);
/* 463 */                           matcher = matcher18;
/* 465 */                           pattern2 = pattern4;
/* 467 */                           matcher3 = matcher19;
/* 469 */                           matcher2 = matcher20;
/* 471 */                           arrayList = arrayList3;
/* 473 */                           c1598e1 = null;
                                } else {
/* 477 */                           String str5 = c1209aM1631a3.f10105a;
/* 483 */                           matcher = matcher18;
/* 487 */                           pattern2 = pattern4;
/* 490 */                           if (m4819c(matcher21, str5)) {
/* 492 */                               Long lM4818b2 = m4818b(matcher21, 4);
/* 496 */                               if (lM4818b2 == null) {
/* 507 */                                   c1554m7.getLogger().mo4672k(EnumC1553m5.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
/* 467 */                                   matcher3 = matcher19;
/* 469 */                                   matcher2 = matcher20;
/* 471 */                                   arrayList = arrayList3;
/* 473 */                                   c1598e1 = null;
                                        } else {
/* 515 */                                   c1598e1.f11298a = lM4818b2;
/* 518 */                                   String strGroup4 = matcher21.group(1);
/* 522 */                                   c1598e1.f11300c = strGroup4;
/* 528 */                                   if ("main".equals(strGroup4)) {
/* 532 */                                       c1598e1.f11305v = Boolean.TRUE;
                                            }
/* 535 */                                   String strGroup5 = matcher21.group(5);
/* 539 */                                   if (strGroup5 != null) {
/* 547 */                                       if (strGroup5.contains(" ")) {
/* 560 */                                           c1598e1.f11301d = strGroup5.substring(0, strGroup5.indexOf(32));
                                                } else {
/* 563 */                                           c1598e1.f11301d = strGroup5;
                                                }
                                            }
/* 617 */                                   c1554m6 = (C1554m6) this.f10123d.f11662b;
/* 621 */                                   arrayList2 = new ArrayList();
/* 626 */                                   matcher4 = f10110l.matcher(str2);
/* 632 */                                   matcher5 = f10111m.matcher(str2);
/* 638 */                                   matcher6 = f10112n.matcher(str2);
/* 644 */                                   matcher7 = f10113o.matcher(str2);
/* 652 */                                   matcher8 = f10115q.matcher(str2);
/* 656 */                                   matcher3 = matcher19;
/* 660 */                                   matcher9 = f10114p.matcher(str2);
/* 664 */                                   matcher2 = matcher20;
/* 668 */                                   matcher10 = f10117s.matcher(str2);
/* 676 */                                   Matcher matcher23 = f10116r.matcher(str2);
/* 680 */                                   arrayList = arrayList3;
/* 684 */                                   matcher11 = f10118t.matcher(str2);
/* 692 */                                   matcher12 = f10119u.matcher(str2);
/* 700 */                                   matcher13 = f10109k.matcher(str2);
/* 704 */                                   str2 = str2;
/* 706 */                                   matcher14 = matcher23;
/* 708 */                                   c1590a0 = null;
                                            while (true) {
/* 712 */                                       if (cd1Var2.f2846b >= i) {
/* 714 */                                           c1209aM1631a = cd1Var2.m1631a();
/* 718 */                                           if (c1209aM1631a == null) {
/* 729 */                                               c1554m7.getLogger().mo4672k(EnumC1553m5.WARNING, str3, new Object[0]);
                                                    } else {
/* 738 */                                               str = c1209aM1631a.f10105a;
/* 744 */                                               if (m4819c(matcher13, str)) {
/* 747 */                                                   lM4818b = m4818b(matcher13, 1);
/* 751 */                                                   if (lM4818b != null && lM4818b.equals(this.f10122c)) {
/* 763 */                                                       c1598e1.f11305v = Boolean.TRUE;
                                                            }
/* 765 */                                                   i = i;
                                                        } else {
/* 778 */                                                   i = i;
/* 781 */                                                   if (m4819c(matcher5, str)) {
/* 785 */                                                       c1590a0 = new C1590a0();
/* 799 */                                                       String strM3508l = AbstractC0886en.m3508l(matcher5.group(1), ".", matcher5.group(2));
/* 803 */                                                       c1590a0.f11267f = strM3508l;
/* 810 */                                                       c1590a0.f11265e = matcher5.group(3);
/* 817 */                                                       c1590a0.f11263d = matcher5.group(4);
/* 820 */                                                       strGroup3 = matcher5.group(5);
/* 824 */                                                       if (strGroup3 != null || strGroup3.length() == 0) {
/* 844 */                                                           numValueOf2 = null;
                                                                } else {
/* 833 */                                                           int i3 = Integer.parseInt(strGroup3);
/* 837 */                                                           numValueOf2 = Integer.valueOf(i3);
/* 841 */                                                           if (i3 < 0) {
/* 844 */                                                               numValueOf2 = null;
                                                                    }
                                                                }
/* 846 */                                                       c1590a0.f11270i = numValueOf2;
/* 860 */                                                       c1590a0.f11252V = C1666s6.m5404n(strM3508l, c1554m6.getInAppIncludes(), c1554m6.getInAppExcludes());
/* 862 */                                                       arrayList2.add(c1590a0);
                                                            } else {
/* 879 */                                                       matcher13 = matcher13;
/* 888 */                                                       if (m4819c(matcher4, str)) {
/* 892 */                                                           c1590a1 = new C1590a0();
/* 900 */                                                           c1590a1.f11253W = matcher4.group(3);
/* 907 */                                                           c1590a1.f11265e = matcher4.group(6);
/* 910 */                                                           strGroup = matcher4.group(7);
/* 914 */                                                           if (strGroup != null || strGroup.length() == 0) {
/* 932 */                                                               numValueOf = null;
                                                                    } else {
/* 927 */                                                               numValueOf = Integer.valueOf(Integer.parseInt(strGroup));
                                                                    }
/* 934 */                                                           c1590a1.f11270i = numValueOf;
/* 954 */                                                           c1590a1.f11260b0 = "0x" + matcher4.group(2);
/* 958 */                                                           c1590a1.f11255Y = "native";
/* 960 */                                                           strGroup2 = matcher4.group(8);
/* 964 */                                                           if (strGroup2 == null) {
/* 966 */                                                               strM5163a = null;
                                                                    } else {
/* 969 */                                                               strM5163a = AbstractC1417a.m5163a(strGroup2);
                                                                    }
/* 973 */                                                           if (strM5163a != null) {
/* 975 */                                                               map = this.f10124e;
/* 981 */                                                               if (!map.containsKey(strM5163a)) {
/* 985 */                                                                   DebugImage debugImage = new DebugImage();
/* 988 */                                                                   debugImage.setDebugId(strM5163a);
/* 995 */                                                                   debugImage.setType("elf");
/* 1005 */                                                                  debugImage.setCodeFile(matcher4.group(4));
/* 1008 */                                                                  debugImage.setCodeId(strGroup2);
/* 1011 */                                                                  map.put(strM5163a, debugImage);
                                                                        }
/* 1025 */                                                              c1590a1.f11262c0 = "rel:".concat(strM5163a);
                                                                    } else {
/* 1028 */                                                              matcher5 = matcher5;
/* 1030 */                                                              str3 = str3;
                                                                    }
/* 1032 */                                                          arrayList2.add(c1590a1);
/* 1035 */                                                          c1590a0 = null;
                                                                } else {
/* 1039 */                                                          matcher5 = matcher5;
/* 1041 */                                                          str3 = str3;
/* 1047 */                                                          if (m4819c(matcher6, str)) {
/* 1051 */                                                              c1590a0 = new C1590a0();
/* 1063 */                                                              String strM3508l2 = AbstractC0886en.m3508l(matcher6.group(1), ".", matcher6.group(2));
/* 1067 */                                                              c1590a0.f11267f = strM3508l2;
/* 1074 */                                                              c1590a0.f11265e = matcher6.group(3);
/* 1088 */                                                              c1590a0.f11252V = C1666s6.m5404n(strM3508l2, c1554m6.getInAppIncludes(), c1554m6.getInAppExcludes());
/* 1092 */                                                              c1590a0.f11254X = Boolean.TRUE;
/* 1094 */                                                              arrayList2.add(c1590a0);
                                                                    } else if (m4819c(matcher7, str)) {
/* 1105 */                                                              if (c1590a0 != null) {
/* 1109 */                                                                  C1566n5 c1566n5 = new C1566n5();
/* 1113 */                                                                  c1566n5.f11177a = 1;
/* 1119 */                                                                  c1566n5.f11178b = matcher7.group(1);
/* 1125 */                                                                  c1566n5.f11179c = matcher7.group(2);
/* 1132 */                                                                  c1566n5.f11180d = matcher7.group(3);
/* 1134 */                                                                  c1590a0.f11269g0 = c1566n5;
/* 1136 */                                                                  m4817a(c1598e1, c1566n5);
                                                                        }
                                                                    } else if (m4819c(matcher8, str)) {
/* 1147 */                                                              if (c1590a0 != null) {
/* 1151 */                                                                  C1566n5 c1566n6 = new C1566n5();
/* 1154 */                                                                  c1566n6.f11177a = 2;
/* 1161 */                                                                  c1566n6.f11178b = matcher8.group(1);
/* 1167 */                                                                  c1566n6.f11179c = matcher8.group(2);
/* 1174 */                                                                  c1566n6.f11180d = matcher8.group(3);
/* 1176 */                                                                  c1590a0.f11269g0 = c1566n6;
/* 1178 */                                                                  m4817a(c1598e1, c1566n6);
                                                                        }
                                                                    } else if (m4819c(matcher9, str)) {
/* 1189 */                                                              if (c1590a0 != null) {
/* 1193 */                                                                  C1566n5 c1566n7 = new C1566n5();
/* 1197 */                                                                  c1566n7.f11177a = 4;
/* 1204 */                                                                  c1566n7.f11178b = matcher9.group(1);
/* 1210 */                                                                  c1566n7.f11179c = matcher9.group(2);
/* 1217 */                                                                  c1566n7.f11180d = matcher9.group(3);
/* 1219 */                                                                  c1590a0.f11269g0 = c1566n7;
/* 1221 */                                                                  m4817a(c1598e1, c1566n7);
                                                                        }
                                                                    } else if (m4819c(matcher10, str)) {
/* 1232 */                                                              if (c1590a0 != null) {
/* 1236 */                                                                  C1566n5 c1566n8 = new C1566n5();
/* 1239 */                                                                  c1566n8.f11177a = 8;
/* 1246 */                                                                  c1566n8.f11178b = matcher10.group(1);
/* 1252 */                                                                  c1566n8.f11179c = matcher10.group(2);
/* 1259 */                                                                  c1566n8.f11180d = matcher10.group(3);
/* 1266 */                                                                  c1566n8.f11181e = m4818b(matcher10, 4);
/* 1268 */                                                                  c1590a0.f11269g0 = c1566n8;
/* 1270 */                                                                  m4817a(c1598e1, c1566n8);
                                                                        }
/* 1273 */                                                              matcher16 = matcher11;
/* 1275 */                                                              matcher17 = matcher12;
/* 1277 */                                                              matcher15 = matcher14;
                                                                    } else {
/* 1283 */                                                              matcher15 = matcher14;
/* 1290 */                                                              if (m4819c(matcher15, str)) {
/* 1333 */                                                                  matcher16 = matcher11;
/* 1340 */                                                                  if (m4819c(matcher16, str)) {
/* 1361 */                                                                      if (str.length() != 0) {
                                                                                    break;
                                                                                }
/* 1363 */                                                                      matcher17 = matcher12;
/* 1369 */                                                                      if (m4819c(matcher17, str)) {
                                                                                    break;
                                                                                }
                                                                            } else if (c1590a0 != null) {
/* 1346 */                                                                      C1566n5 c1566n9 = new C1566n5();
/* 1349 */                                                                      c1566n9.f11177a = 8;
/* 1351 */                                                                      c1590a0.f11269g0 = c1566n9;
/* 1353 */                                                                      m4817a(c1598e1, c1566n9);
                                                                            }
                                                                        } else {
/* 1292 */                                                                  if (c1590a0 != null) {
/* 1296 */                                                                      C1566n5 c1566n10 = new C1566n5();
/* 1299 */                                                                      c1566n10.f11177a = 8;
/* 1306 */                                                                      c1566n10.f11178b = matcher15.group(1);
/* 1312 */                                                                      c1566n10.f11179c = matcher15.group(2);
/* 1319 */                                                                      c1566n10.f11180d = matcher15.group(3);
/* 1321 */                                                                      c1590a0.f11269g0 = c1566n10;
/* 1323 */                                                                      m4817a(c1598e1, c1566n10);
                                                                            }
/* 1326 */                                                                  matcher16 = matcher11;
                                                                        }
/* 1328 */                                                              matcher17 = matcher12;
                                                                    }
                                                                }
/* 869 */                                                       matcher16 = matcher11;
/* 871 */                                                       matcher17 = matcher12;
/* 873 */                                                       matcher15 = matcher14;
                                                            }
/* 1372 */                                                  matcher14 = matcher15;
/* 1374 */                                                  matcher12 = matcher17;
/* 1376 */                                                  matcher11 = matcher16;
/* 1378 */                                                  matcher5 = matcher5;
/* 1380 */                                                  matcher13 = matcher13;
/* 1382 */                                                  i = i;
/* 1384 */                                                  str3 = str3;
/* 1386 */                                                  cd1Var2 = cd1Var;
                                                        }
/* 865 */                                               matcher5 = matcher5;
/* 867 */                                               str3 = str3;
/* 869 */                                               matcher16 = matcher11;
/* 871 */                                               matcher17 = matcher12;
/* 873 */                                               matcher15 = matcher14;
/* 1372 */                                              matcher14 = matcher15;
/* 1374 */                                              matcher12 = matcher17;
/* 1376 */                                              matcher11 = matcher16;
/* 1378 */                                              matcher5 = matcher5;
/* 1380 */                                              matcher13 = matcher13;
/* 1382 */                                              i = i;
/* 1384 */                                              str3 = str3;
/* 1386 */                                              cd1Var2 = cd1Var;
                                                    }
                                                }
/* 732 */                                       i = i;
                                                break;
                                            }
/* 1390 */                                  Collections.reverse(arrayList2);
/* 1395 */                                  c1594c0 = new C1594c0(arrayList2);
/* 1400 */                                  c1594c0.f11287c = Boolean.TRUE;
/* 1406 */                                  if (arrayList2.isEmpty()) {
/* 473 */                                       c1598e1 = null;
                                            } else {
/* 1410 */                                      c1598e1.f11306w = c1594c0;
                                            }
                                        }
                                    } else {
/* 570 */                               if (m4819c(matcher22, str5)) {
/* 573 */                                   Long lM4818b3 = m4818b(matcher22, 3);
/* 577 */                                   if (lM4818b3 == null) {
/* 588 */                                       c1554m7.getLogger().mo4672k(EnumC1553m5.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
/* 467 */                                       matcher3 = matcher19;
/* 469 */                                       matcher2 = matcher20;
/* 471 */                                       arrayList = arrayList3;
/* 473 */                                       c1598e1 = null;
                                            } else {
/* 592 */                                       c1598e1.f11298a = lM4818b3;
/* 599 */                                       c1598e1.f11300c = matcher22.group(1);
/* 607 */                                       if (lM4818b3.equals(this.f10122c)) {
/* 611 */                                           c1598e1.f11305v = Boolean.TRUE;
                                                }
                                            }
                                        }
/* 617 */                               c1554m6 = (C1554m6) this.f10123d.f11662b;
/* 621 */                               arrayList2 = new ArrayList();
/* 626 */                               matcher4 = f10110l.matcher(str2);
/* 632 */                               matcher5 = f10111m.matcher(str2);
/* 638 */                               matcher6 = f10112n.matcher(str2);
/* 644 */                               matcher7 = f10113o.matcher(str2);
/* 652 */                               matcher8 = f10115q.matcher(str2);
/* 656 */                               matcher3 = matcher19;
/* 660 */                               matcher9 = f10114p.matcher(str2);
/* 664 */                               matcher2 = matcher20;
/* 668 */                               matcher10 = f10117s.matcher(str2);
/* 676 */                               Matcher matcher24 = f10116r.matcher(str2);
/* 680 */                               arrayList = arrayList3;
/* 684 */                               matcher11 = f10118t.matcher(str2);
/* 692 */                               matcher12 = f10119u.matcher(str2);
/* 700 */                               matcher13 = f10109k.matcher(str2);
/* 704 */                               str2 = str2;
/* 706 */                               matcher14 = matcher24;
/* 708 */                               c1590a0 = null;
                                        while (true) {
/* 712 */                                   if (cd1Var2.f2846b >= i) {
/* 714 */                                       c1209aM1631a = cd1Var2.m1631a();
/* 718 */                                       if (c1209aM1631a == null) {
/* 729 */                                           c1554m7.getLogger().mo4672k(EnumC1553m5.WARNING, str3, new Object[0]);
                                                } else {
/* 738 */                                           str = c1209aM1631a.f10105a;
/* 744 */                                           if (m4819c(matcher13, str)) {
/* 747 */                                               lM4818b = m4818b(matcher13, 1);
/* 751 */                                               if (lM4818b != null) {
/* 763 */                                                   c1598e1.f11305v = Boolean.TRUE;
                                                        }
/* 765 */                                               i = i;
                                                    } else {
/* 778 */                                               i = i;
/* 781 */                                               if (m4819c(matcher5, str)) {
/* 785 */                                                   c1590a0 = new C1590a0();
/* 799 */                                                   String strM3508l3 = AbstractC0886en.m3508l(matcher5.group(1), ".", matcher5.group(2));
/* 803 */                                                   c1590a0.f11267f = strM3508l3;
/* 810 */                                                   c1590a0.f11265e = matcher5.group(3);
/* 817 */                                                   c1590a0.f11263d = matcher5.group(4);
/* 820 */                                                   strGroup3 = matcher5.group(5);
/* 824 */                                                   if (strGroup3 != null) {
/* 844 */                                                       numValueOf2 = null;
                                                            } else {
/* 844 */                                                       numValueOf2 = null;
                                                            }
/* 846 */                                                   c1590a0.f11270i = numValueOf2;
/* 860 */                                                   c1590a0.f11252V = C1666s6.m5404n(strM3508l3, c1554m6.getInAppIncludes(), c1554m6.getInAppExcludes());
/* 862 */                                                   arrayList2.add(c1590a0);
                                                        } else {
/* 879 */                                                   matcher13 = matcher13;
/* 888 */                                                   if (m4819c(matcher4, str)) {
/* 892 */                                                       c1590a1 = new C1590a0();
/* 900 */                                                       c1590a1.f11253W = matcher4.group(3);
/* 907 */                                                       c1590a1.f11265e = matcher4.group(6);
/* 910 */                                                       strGroup = matcher4.group(7);
/* 914 */                                                       if (strGroup != null) {
/* 932 */                                                           numValueOf = null;
                                                                } else {
/* 932 */                                                           numValueOf = null;
                                                                }
/* 934 */                                                       c1590a1.f11270i = numValueOf;
/* 954 */                                                       c1590a1.f11260b0 = "0x" + matcher4.group(2);
/* 958 */                                                       c1590a1.f11255Y = "native";
/* 960 */                                                       strGroup2 = matcher4.group(8);
/* 964 */                                                       if (strGroup2 == null) {
/* 966 */                                                           strM5163a = null;
                                                                } else {
/* 969 */                                                           strM5163a = AbstractC1417a.m5163a(strGroup2);
                                                                }
/* 973 */                                                       if (strM5163a != null) {
/* 975 */                                                           map = this.f10124e;
/* 981 */                                                           if (!map.containsKey(strM5163a)) {
/* 985 */                                                               DebugImage debugImage2 = new DebugImage();
/* 988 */                                                               debugImage2.setDebugId(strM5163a);
/* 995 */                                                               debugImage2.setType("elf");
/* 1005 */                                                              debugImage2.setCodeFile(matcher4.group(4));
/* 1008 */                                                              debugImage2.setCodeId(strGroup2);
/* 1011 */                                                              map.put(strM5163a, debugImage2);
                                                                    }
/* 1025 */                                                          c1590a1.f11262c0 = "rel:".concat(strM5163a);
                                                                } else {
/* 1028 */                                                          matcher5 = matcher5;
/* 1030 */                                                          str3 = str3;
                                                                }
/* 1032 */                                                      arrayList2.add(c1590a1);
/* 1035 */                                                      c1590a0 = null;
                                                            } else {
/* 1039 */                                                      matcher5 = matcher5;
/* 1041 */                                                      str3 = str3;
/* 1047 */                                                      if (m4819c(matcher6, str)) {
/* 1051 */                                                          c1590a0 = new C1590a0();
/* 1063 */                                                          String strM3508l4 = AbstractC0886en.m3508l(matcher6.group(1), ".", matcher6.group(2));
/* 1067 */                                                          c1590a0.f11267f = strM3508l4;
/* 1074 */                                                          c1590a0.f11265e = matcher6.group(3);
/* 1088 */                                                          c1590a0.f11252V = C1666s6.m5404n(strM3508l4, c1554m6.getInAppIncludes(), c1554m6.getInAppExcludes());
/* 1092 */                                                          c1590a0.f11254X = Boolean.TRUE;
/* 1094 */                                                          arrayList2.add(c1590a0);
                                                                } else if (m4819c(matcher7, str)) {
/* 1105 */                                                          if (c1590a0 != null) {
/* 1109 */                                                              C1566n5 c1566n11 = new C1566n5();
/* 1113 */                                                              c1566n11.f11177a = 1;
/* 1119 */                                                              c1566n11.f11178b = matcher7.group(1);
/* 1125 */                                                              c1566n11.f11179c = matcher7.group(2);
/* 1132 */                                                              c1566n11.f11180d = matcher7.group(3);
/* 1134 */                                                              c1590a0.f11269g0 = c1566n11;
/* 1136 */                                                              m4817a(c1598e1, c1566n11);
                                                                    }
                                                                } else if (m4819c(matcher8, str)) {
/* 1147 */                                                          if (c1590a0 != null) {
/* 1151 */                                                              C1566n5 c1566n12 = new C1566n5();
/* 1154 */                                                              c1566n12.f11177a = 2;
/* 1161 */                                                              c1566n12.f11178b = matcher8.group(1);
/* 1167 */                                                              c1566n12.f11179c = matcher8.group(2);
/* 1174 */                                                              c1566n12.f11180d = matcher8.group(3);
/* 1176 */                                                              c1590a0.f11269g0 = c1566n12;
/* 1178 */                                                              m4817a(c1598e1, c1566n12);
                                                                    }
                                                                } else if (m4819c(matcher9, str)) {
/* 1189 */                                                          if (c1590a0 != null) {
/* 1193 */                                                              C1566n5 c1566n13 = new C1566n5();
/* 1197 */                                                              c1566n13.f11177a = 4;
/* 1204 */                                                              c1566n13.f11178b = matcher9.group(1);
/* 1210 */                                                              c1566n13.f11179c = matcher9.group(2);
/* 1217 */                                                              c1566n13.f11180d = matcher9.group(3);
/* 1219 */                                                              c1590a0.f11269g0 = c1566n13;
/* 1221 */                                                              m4817a(c1598e1, c1566n13);
                                                                    }
                                                                } else if (m4819c(matcher10, str)) {
/* 1232 */                                                          if (c1590a0 != null) {
/* 1236 */                                                              C1566n5 c1566n14 = new C1566n5();
/* 1239 */                                                              c1566n14.f11177a = 8;
/* 1246 */                                                              c1566n14.f11178b = matcher10.group(1);
/* 1252 */                                                              c1566n14.f11179c = matcher10.group(2);
/* 1259 */                                                              c1566n14.f11180d = matcher10.group(3);
/* 1266 */                                                              c1566n14.f11181e = m4818b(matcher10, 4);
/* 1268 */                                                              c1590a0.f11269g0 = c1566n14;
/* 1270 */                                                              m4817a(c1598e1, c1566n14);
                                                                    }
/* 1273 */                                                          matcher16 = matcher11;
/* 1275 */                                                          matcher17 = matcher12;
/* 1277 */                                                          matcher15 = matcher14;
                                                                } else {
/* 1283 */                                                          matcher15 = matcher14;
/* 1290 */                                                          if (m4819c(matcher15, str)) {
/* 1333 */                                                              matcher16 = matcher11;
/* 1340 */                                                              if (m4819c(matcher16, str)) {
/* 1361 */                                                                  if (str.length() != 0) {
                                                                                break;
                                                                                break;
                                                                            }
/* 1363 */                                                                  matcher17 = matcher12;
/* 1369 */                                                                  if (m4819c(matcher17, str)) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                        } else if (c1590a0 != null) {
/* 1346 */                                                                  C1566n5 c1566n15 = new C1566n5();
/* 1349 */                                                                  c1566n15.f11177a = 8;
/* 1351 */                                                                  c1590a0.f11269g0 = c1566n15;
/* 1353 */                                                                  m4817a(c1598e1, c1566n15);
                                                                        }
                                                                    } else {
/* 1292 */                                                              if (c1590a0 != null) {
/* 1296 */                                                                  C1566n5 c1566n16 = new C1566n5();
/* 1299 */                                                                  c1566n16.f11177a = 8;
/* 1306 */                                                                  c1566n16.f11178b = matcher15.group(1);
/* 1312 */                                                                  c1566n16.f11179c = matcher15.group(2);
/* 1319 */                                                                  c1566n16.f11180d = matcher15.group(3);
/* 1321 */                                                                  c1590a0.f11269g0 = c1566n16;
/* 1323 */                                                                  m4817a(c1598e1, c1566n16);
                                                                        }
/* 1326 */                                                              matcher16 = matcher11;
                                                                    }
/* 1328 */                                                          matcher17 = matcher12;
                                                                }
                                                            }
/* 869 */                                                   matcher16 = matcher11;
/* 871 */                                                   matcher17 = matcher12;
/* 873 */                                                   matcher15 = matcher14;
                                                        }
/* 1372 */                                              matcher14 = matcher15;
/* 1374 */                                              matcher12 = matcher17;
/* 1376 */                                              matcher11 = matcher16;
/* 1378 */                                              matcher5 = matcher5;
/* 1380 */                                              matcher13 = matcher13;
/* 1382 */                                              i = i;
/* 1384 */                                              str3 = str3;
/* 1386 */                                              cd1Var2 = cd1Var;
                                                    }
/* 865 */                                           matcher5 = matcher5;
/* 867 */                                           str3 = str3;
/* 869 */                                           matcher16 = matcher11;
/* 871 */                                           matcher17 = matcher12;
/* 873 */                                           matcher15 = matcher14;
/* 1372 */                                          matcher14 = matcher15;
/* 1374 */                                          matcher12 = matcher17;
/* 1376 */                                          matcher11 = matcher16;
/* 1378 */                                          matcher5 = matcher5;
/* 1380 */                                          matcher13 = matcher13;
/* 1382 */                                          i = i;
/* 1384 */                                          str3 = str3;
/* 1386 */                                          cd1Var2 = cd1Var;
                                                }
                                            }
/* 732 */                                   i = i;
                                            break;
                                        }
/* 1390 */                              Collections.reverse(arrayList2);
/* 1395 */                              c1594c0 = new C1594c0(arrayList2);
/* 1400 */                              c1594c0.f11287c = Boolean.TRUE;
/* 1406 */                              if (arrayList2.isEmpty()) {
/* 473 */                                   c1598e1 = null;
                                        } else {
/* 1410 */                                  c1598e1.f11306w = c1594c0;
                                        }
                                    }
                                }
                            }
/* 1412 */                  if (c1598e1 != null) {
/* 1416 */                      arrayList.add(c1598e1);
                            }
                        } else {
/* 81 */                    if (m4819c(matcher20, str4)) {
/* 87 */                        this.f10122c = m4818b(matcher20, 1);
                            } else {
/* 107 */                       boolean zStartsWith = str4.startsWith("Free memory until OOME ");
/* 111 */                       C1666s6 c1666s6 = this.f10126g;
/* 113 */                       if (zStartsWith) {
/* 129 */                           c1666s6.m5408l().f11284w = C1666s6.m5405o(str4.substring(23));
                                } else if (str4.startsWith("Free memory until GC ")) {
/* 154 */                           c1666s6.m5408l().f11283v = C1666s6.m5405o(str4.substring(21));
                                } else if (str4.startsWith("Free memory ")) {
/* 179 */                           c1666s6.m5408l().f11282i = C1666s6.m5405o(str4.substring(12));
                                } else if (str4.startsWith("Total memory ")) {
/* 204 */                           c1666s6.m5408l().f11273U = C1666s6.m5405o(str4.substring(13));
                                } else if (str4.startsWith("Max memory ")) {
/* 229 */                           c1666s6.m5408l().f11274V = C1666s6.m5405o(str4.substring(11));
                                } else if (str4.startsWith("Total time waiting for GC to complete: ")) {
/* 255 */                           c1666s6.m5408l().f11281f = C1666s6.m5406p(str4.substring(39));
                                } else if (str4.startsWith("Total GC time: ")) {
/* 281 */                           c1666s6.m5408l().f11277b = C1666s6.m5406p(str4.substring(15));
                                } else if (str4.startsWith("Total GC count: ")) {
/* 293 */                           C1593c c1593cM5408l = c1666s6.m5408l();
                                    try {
/* 311 */                               lValueOf = Long.valueOf(Long.parseLong(str4.substring(16).trim()));
                                    } catch (NumberFormatException unused) {
                                    }
/* 317 */                           c1593cM5408l.f11276a = lValueOf;
                                } else if (str4.startsWith("Total blocking GC time: ")) {
/* 343 */                           c1666s6.m5408l().f11279d = C1666s6.m5406p(str4.substring(24));
                                } else if (str4.startsWith("Total blocking GC count: ")) {
/* 357 */                           C1593c c1593cM5408l2 = c1666s6.m5408l();
                                    try {
/* 373 */                               lValueOf = Long.valueOf(Long.parseLong(str4.substring(25).trim()));
                                    } catch (NumberFormatException unused2) {
                                    }
/* 379 */                           c1593cM5408l2.f11278c = lValueOf;
                                } else if (str4.startsWith("Total pre-OOME GC count: ")) {
/* 391 */                           C1593c c1593cM5408l3 = c1666s6.m5408l();
                                    try {
/* 407 */                               lValueOf = Long.valueOf(Long.parseLong(str4.substring(25).trim()));
                                    } catch (NumberFormatException unused3) {
                                    }
/* 413 */                           c1593cM5408l3.f11280e = lValueOf;
                                }
                            }
/* 89 */                    i = i;
/* 91 */                    pattern = pattern3;
/* 93 */                    str2 = str2;
/* 95 */                    matcher = matcher18;
/* 97 */                    pattern2 = pattern4;
/* 99 */                    matcher3 = matcher19;
/* 101 */                   matcher2 = matcher20;
                        }
/* 1419 */              cd1Var2 = cd1Var;
/* 1421 */              pattern3 = pattern;
/* 1423 */              matcher18 = matcher;
/* 1425 */              pattern4 = pattern2;
/* 1427 */              matcher19 = matcher3;
/* 1429 */              matcher20 = matcher2;
/* 1431 */              str2 = str2;
/* 1433 */              i = i;
                    }
                }
            }
