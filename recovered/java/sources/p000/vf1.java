            package p000;

            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Timer;
            import kotlin.Pair;
            import kotlin.collections.CollectionsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vf1 {

                /* JADX INFO: renamed from: a */
                public final ht1 f18030a;

                /* JADX INFO: renamed from: b */
                public final wc0 f18031b;

                /* JADX INFO: renamed from: c */
                public final ef1 f18032c;

                /* JADX INFO: renamed from: d */
                public final List f18033d;

                /* JADX INFO: renamed from: e */
                public final List f18034e;

                /* JADX INFO: renamed from: f */
                public final if1 f18035f;

                /* JADX INFO: renamed from: g */
                public final bx0 f18036g;

                /* JADX INFO: renamed from: h */
                public final ArrayList f18037h;

                /* JADX INFO: renamed from: i */
                public boolean f18038i;

                public vf1(String str, ht1 ht1Var, if1 if1Var, wc0 wc0Var, ef1 ef1Var, List list, List list2) {
/* 7 */             str.getClass();
/* 15 */            this.f18030a = ht1Var;
/* 19 */            this.f18031b = wc0Var;
/* 21 */            this.f18032c = ef1Var;
/* 25 */            this.f18033d = list;
/* 29 */            this.f18034e = list2;
/* 51 */            if1 if1Var2 = new if1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
/* 54 */            this.f18035f = if1Var2;
/* 59 */            int i = 3;
/* 63 */            this.f18036g = new bx0((byte) 0, 3);
/* 70 */            this.f18037h = new ArrayList();
/* 72 */            if (if1Var != null) {
/* 74 */                if1Var2.m4522b(if1Var);
                    }
/* 77 */            if (ef1Var != null) {
/* 81 */                C0908f8 c0908f8 = new C0908f8(this, i);
/* 86 */                ts0 ts0Var = new ts0();
/* 89 */                ef1Var.f7670e = ts0Var;
/* 93 */                df1 df1Var = new df1(ef1Var, c0908f8);
/* 101 */               long j = ((long) ef1Var.f7666a) * 1000;
/* 104 */               Timer timer = new Timer();
/* 107 */               ts0Var.f17248a = timer;
/* 118 */               timer.schedule(df1Var, j, j);
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m9261a(AbstractC1812k abstractC1812k) {
                    b92 b92Var;
                    b92 b92Var2;
                    b92 b92Var3;
/* 9 */             if (abstractC1812k instanceof of1) {
/* 13 */                if (this.f18038i) {
/* 15 */                    return;
                        } else {
/* 16 */                    this.f18038i = true;
                        }
                    } else if (abstractC1812k instanceof nf1) {
/* 23 */                this.f18038i = false;
                    }
/* 25 */            ArrayList arrayList = abstractC1812k.f12550a;
/* 27 */            if1 if1Var = this.f18035f;
/* 29 */            Double d = if1Var.f9565a;
/* 48 */            Pair pair = new Pair("currentTime", Double.valueOf(d != null ? d.doubleValue() : 0.0d));
/* 57 */            Pair pair2 = new Pair("duration", if1Var.f9566b);
/* 60 */            Boolean bool = if1Var.f9567c;
/* 77 */            Pair pair3 = new Pair("ended", Boolean.valueOf(bool != null ? bool.booleanValue() : false));
/* 86 */            Pair pair4 = new Pair("fullscreen", if1Var.f9568d);
/* 95 */            Pair pair5 = new Pair("livestream", if1Var.f9569e);
/* 104 */           Pair pair6 = new Pair("label", if1Var.f9570f);
/* 113 */           Pair pair7 = new Pair("loop", if1Var.f9571g);
/* 116 */           wf1 wf1Var = if1Var.f9572h;
/* 133 */           Pair pair8 = new Pair("mediaType", wf1Var != null ? wf1Var.toString() : null);
/* 142 */           Pair pair9 = new Pair("muted", if1Var.f9573i);
/* 145 */           Boolean bool2 = if1Var.f9574j;
/* 239 */           Map mapM7131e = oc1.m7131e(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair("paused", Boolean.valueOf(bool2 != null ? bool2.booleanValue() : true)), new Pair("pictureInPicture", if1Var.f9575k), new Pair("playerType", if1Var.f9576l), new Pair("playbackRate", if1Var.f9577m), new Pair("quality", if1Var.f9578n), new Pair("volume", if1Var.f9579o));
/* 245 */           LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 260 */           for (Map.Entry entry : mapM7131e.entrySet()) {
/* 272 */               if (entry.getValue() != null) {
/* 282 */                   linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
/* 290 */           b92 b92Var4 = new b92("iglu:com.snowplowanalytics.snowplow/media_player/jsonschema/2-0-0", linkedHashMap);
/* 293 */           wc0 wc0Var = this.f18031b;
/* 295 */           if (wc0Var != null) {
/* 299 */               ac1 ac1Var = (ac1) wc0Var.f18577b;
/* 303 */               tf1 tf1Var = (tf1) wc0Var.f18578c;
/* 305 */               ac1Var.getClass();
/* 308 */               tf1Var.getClass();
/* 311 */               String str = mn0.f13875j;
/* 321 */               Pair pair10 = new Pair("mediaSessionId", (String) ac1Var.f177b);
/* 336 */               Pair pair11 = new Pair("startedAt", mn0.m6699o((Date) ac1Var.f178c));
/* 347 */               Pair pair12 = new Pair("pingInterval", (Integer) ac1Var.f179d);
/* 360 */               Pair pair13 = new Pair("timePlayed", ac1.m157K(tf1Var.f17073i));
/* 373 */               Pair pair14 = new Pair("timePaused", ac1.m157K(tf1Var.f17075k));
/* 386 */               Pair pair15 = new Pair("timePlayedMuted", ac1.m157K(tf1Var.f17074j));
/* 399 */               Pair pair16 = new Pair("timeSpentAds", ac1.m157K(tf1Var.f17072h));
/* 416 */               Pair pair17 = new Pair("timeBuffering", ac1.m157K(tf1Var.f17076l));
/* 419 */               int i = tf1Var.f17078n;
/* 434 */               Pair pair18 = new Pair("ads", i > 0 ? Integer.valueOf(i) : null);
/* 437 */               int i2 = tf1Var.f17077m;
/* 454 */               Pair pair19 = new Pair("adBreaks", i2 > 0 ? Integer.valueOf(i2) : null);
/* 457 */               int i3 = tf1Var.f17079o;
/* 474 */               Pair pair20 = new Pair("adsSkipped", i3 > 0 ? Integer.valueOf(i3) : null);
/* 477 */               int i4 = tf1Var.f17080p;
/* 583 */               Map mapM7131e2 = oc1.m7131e(pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, new Pair("adsClicked", i4 > 0 ? Integer.valueOf(i4) : null), new Pair("avgPlaybackRate", tf1Var.m8787a() == 1.0d ? null : Double.valueOf(((double) ((int) (tf1Var.m8787a() * 1000.0d))) / 1000.0d)), new Pair("contentWatched", ac1.m157K(mn0.m6680D(tf1Var.f17070f.size(), ib0.SECONDS))));
/* 589 */               LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 604 */               for (Map.Entry entry2 : mapM7131e2.entrySet()) {
/* 616 */                   if (entry2.getValue() != null) {
/* 626 */                       linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                            }
                        }
/* 632 */               b92Var = new b92(str, linkedHashMap2);
                    } else {
/* 636 */               b92Var = null;
                    }
/* 642 */           ArrayList arrayListM7773h = C2103qd.m7773h(new b92[]{b92Var4, b92Var});
/* 646 */           bx0 bx0Var = this.f18036g;
/* 650 */           zd1 zd1Var = (zd1) bx0Var.f2630b;
/* 654 */           if (zd1Var != null) {
/* 656 */               String str2 = mn0.f13876k;
/* 712 */               Map mapM7131e3 = oc1.m7131e(new Pair("adId", zd1Var.f20100a), new Pair("name", zd1Var.f20101b), new Pair("creativeId", zd1Var.f20102c), new Pair("podPosition", zd1Var.f20103d), new Pair("duration", zd1Var.f20104e), new Pair("skippable", zd1Var.f20105f));
/* 718 */               LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 733 */               for (Map.Entry entry3 : mapM7131e3.entrySet()) {
/* 745 */                   if (entry3.getValue() != null) {
/* 755 */                       linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                            }
                        }
/* 761 */               b92Var2 = new b92(str2, linkedHashMap3);
                    } else {
/* 765 */               b92Var2 = null;
                    }
/* 769 */           td1 td1Var = (td1) bx0Var.f2632d;
/* 771 */           if (td1Var != null) {
/* 773 */               String str3 = mn0.f13877l;
/* 781 */               Pair pair21 = new Pair("breakId", td1Var.f17046a);
/* 788 */               Pair pair22 = new Pair("name", td1Var.f17047b);
/* 797 */               Pair pair23 = new Pair("startTime", td1Var.f17050e);
/* 800 */               wd1 wd1Var = td1Var.f17048c;
/* 830 */               Map mapM7131e4 = oc1.m7131e(pair21, pair22, pair23, new Pair("breakType", wd1Var != null ? wd1Var.toString() : null), new Pair("podSize", td1Var.f17049d));
/* 836 */               LinkedHashMap linkedHashMap4 = new LinkedHashMap();
/* 851 */               for (Map.Entry entry4 : mapM7131e4.entrySet()) {
/* 863 */                   if (entry4.getValue() != null) {
/* 873 */                       linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                            }
                        }
/* 879 */               b92Var3 = new b92(str3, linkedHashMap4);
                    } else {
/* 883 */               b92Var3 = null;
                    }
/* 893 */           ArrayList arrayListM6183B = CollectionsKt.m6183B(arrayListM7773h, C2103qd.m7773h(new b92[]{b92Var2, b92Var3}));
/* 897 */           Iterable iterable = this.f18034e;
/* 899 */           if (iterable == null) {
/* 902 */               iterable = nd0.f14189a;
                    }
/* 908 */           arrayList.addAll(CollectionsKt.m6183B(arrayListM6183B, iterable));
/* 915 */           qa2 qa2Var = (qa2) this.f18030a.f16749a;
/* 919 */           if (qa2Var.f15463c == null) {
/* 922 */               int i5 = k50.f12587b;
/* 928 */               AbstractC1245n0.m4876d("ht1", "Recreating tracker instance after it was removed. This will not be supported in future versions.");
                    }
/* 935 */           qa2Var.m7750d().m9121c(abstractC1812k);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: b */
                public final boolean m9262b() {
                    List list;
                    Integer numM4521a;
/* 1 */             if1 if1Var = this.f18035f;
/* 3 */             Boolean bool = if1Var.f9574j;
/* 15 */            if (!(bool != null ? bool.booleanValue() : true) && (list = this.f18033d) != null && (numM4521a = if1Var.m4521a()) != null) {
/* 31 */                int iIntValue = numM4521a.intValue();
/* 37 */                ArrayList arrayList = new ArrayList();
/* 48 */                for (Object obj : list) {
/* 61 */                    if (((Number) obj).intValue() <= iIntValue) {
/* 63 */                        arrayList.add(obj);
                            }
                        }
/* 71 */                if (!arrayList.isEmpty()) {
/* 74 */                    Iterator it = arrayList.iterator();
/* 82 */                    if (it.hasNext()) {
/* 88 */                        Comparable comparable = (Comparable) it.next();
/* 94 */                        while (it.hasNext()) {
/* 100 */                           Comparable comparable2 = (Comparable) it.next();
/* 106 */                           if (comparable.compareTo(comparable2) < 0) {
/* 108 */                               comparable = comparable2;
                                    }
                                }
/* 112 */                       int iIntValue2 = ((Number) comparable).intValue();
/* 116 */                       Integer numValueOf = Integer.valueOf(iIntValue2);
/* 120 */                       ArrayList arrayList2 = this.f18037h;
/* 126 */                       if (!arrayList2.contains(numValueOf)) {
/* 133 */                           arrayList2.add(Integer.valueOf(iIntValue2));
/* 5 */                             return true;
                                }
                            } else {
/* 137 */                       C1951n4.m6864o();
                            }
                        }
                    }
/* 14 */            return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: c */
                public final void m9263c(AbstractC1812k abstractC1812k, if1 if1Var, zd1 zd1Var, td1 td1Var) {
                    synchronized (this) {
/* 2 */                 if (if1Var != null) {
                            try {
/* 6 */                         this.f18035f.m4522b(if1Var);
                            } catch (Throwable th) {
/* 122 */                       throw th;
                            }
                        }
/* 22 */                kf1 kf1Var = abstractC1812k instanceof kf1 ? (kf1) abstractC1812k : null;
/* 23 */                if (kf1Var != null) {
/* 27 */                    kf1Var.mo3758a(this.f18035f);
                        }
/* 34 */                this.f18036g.m1460f(abstractC1812k, this.f18035f, zd1Var, td1Var);
/* 37 */                wc0 wc0Var = this.f18031b;
/* 39 */                if (wc0Var != null) {
/* 43 */                    wc0Var.m9528E(abstractC1812k, this.f18035f, td1Var);
                        }
/* 46 */                ef1 ef1Var = this.f18032c;
/* 49 */                if (ef1Var != null) {
/* 53 */                    Boolean bool = this.f18035f.f9574j;
/* 55 */                    if (bool == null) {
/* 57 */                        bool = Boolean.TRUE;
                            }
/* 59 */                    ef1Var.f7667b = bool;
/* 67 */                    if (bool.equals(Boolean.FALSE)) {
/* 69 */                        ef1Var.f7668c = 0;
                            }
                        }
/* 71 */                if (abstractC1812k != 0) {
/* 73 */                    m9261a(abstractC1812k);
                        }
/* 80 */                if (m9262b()) {
/* 93 */                    m9261a(new bf1(this.f18035f.m4521a()));
                        }
/* 96 */                bx0 bx0Var = this.f18036g;
/* 100 */               if (abstractC1812k instanceof sd1) {
/* 102 */                   bx0Var.f2632d = null;
/* 104 */                   bx0Var.f2631c = 0;
                        } else {
/* 115 */                   if (abstractC1812k instanceof yd1 ? true : abstractC1812k instanceof ge1) {
/* 117 */                       bx0Var.f2630b = null;
                            }
                        }
                    }
                }
            }
