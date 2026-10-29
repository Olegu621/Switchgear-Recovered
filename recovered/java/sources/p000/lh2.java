            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraDevice;
            import android.util.Pair;
            import android.util.Rational;
            import android.util.Size;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lh2 extends wy2 {

                /* JADX INFO: renamed from: A */
                public cb2 f13281A;

                /* JADX INFO: renamed from: o */
                public final mh2 f13282o;

                /* JADX INFO: renamed from: p */
                public final s53 f13283p;

                /* JADX INFO: renamed from: q */
                public final xt0 f13284q;

                /* JADX INFO: renamed from: r */
                public final xt0 f13285r;

                /* JADX INFO: renamed from: s */
                public ac1 f13286s;

                /* JADX INFO: renamed from: t */
                public C0168b5 f13287t;

                /* JADX INFO: renamed from: u */
                public lj2 f13288u;

                /* JADX INFO: renamed from: v */
                public lj2 f13289v;

                /* JADX INFO: renamed from: w */
                public lj2 f13290w;

                /* JADX INFO: renamed from: x */
                public lj2 f13291x;

                /* JADX INFO: renamed from: y */
                public bb2 f13292y;

                /* JADX INFO: renamed from: z */
                public bb2 f13293z;

                public lh2(InterfaceC2559zp interfaceC2559zp, InterfaceC2559zp interfaceC2559zp2, xt0 xt0Var, xt0 xt0Var2, HashSet hashSet, cz2 cz2Var) {
/* 5 */             super(m6434G(hashSet));
/* 12 */            this.f13282o = m6434G(hashSet);
/* 14 */            this.f13284q = xt0Var;
/* 16 */            this.f13285r = xt0Var2;
/* 34 */            this.f13283p = new s53(interfaceC2559zp, interfaceC2559zp2, hashSet, cz2Var, new f42(8));
                }

                /* JADX INFO: renamed from: F */
                public static ArrayList m6433F(wy2 wy2Var) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             if (!(wy2Var instanceof lh2)) {
/* 49 */                arrayList.add(wy2Var.f18861f.mo7453t());
/* 52 */                return arrayList;
                    }
/* 16 */            Iterator it = ((lh2) wy2Var).f13283p.f16439a.iterator();
/* 24 */            while (it.hasNext()) {
/* 38 */                arrayList.add(((wy2) it.next()).f18861f.mo7453t());
                    }
/* 42 */            return arrayList;
                }

                /* JADX INFO: renamed from: G */
                public static mh2 m6434G(HashSet hashSet) {
/* 3 */             uk1 uk1VarM9034j = uk1.m9034j();
/* 7 */             new C2340wq(uk1VarM9034j);
/* 18 */            uk1VarM9034j.m9037p(hw0.f9338o, 34);
/* 23 */            ArrayList arrayList = new ArrayList();
/* 26 */            Iterator it = hashSet.iterator();
/* 34 */            while (it.hasNext()) {
/* 40 */                wy2 wy2Var = (wy2) it.next();
/* 50 */                if (wy2Var.f18861f.mo7028h(zy2.f20392O)) {
/* 58 */                    arrayList.add(wy2Var.f18861f.mo7453t());
                        } else {
/* 66 */                    AbstractC1245n0.m4876d("StreamSharing", "A child does not have capture type.");
                        }
                    }
/* 72 */            uk1VarM9034j.m9037p(mh2.f13782b, arrayList);
/* 82 */            uk1VarM9034j.m9037p(jw0.f12522t, 2);
/* 91 */            return new mh2(nq1.m7021d(uk1VarM9034j));
                }

                /* JADX INFO: renamed from: B */
                public final void m6435B() {
/* 1 */             cb2 cb2Var = this.f13281A;
/* 4 */             if (cb2Var != null) {
/* 6 */                 cb2Var.m1609b();
/* 9 */                 this.f13281A = null;
                    }
/* 11 */            lj2 lj2Var = this.f13288u;
/* 13 */            if (lj2Var != null) {
/* 15 */                lj2Var.m6462b();
/* 18 */                this.f13288u = null;
                    }
/* 20 */            lj2 lj2Var2 = this.f13289v;
/* 22 */            if (lj2Var2 != null) {
/* 24 */                lj2Var2.m6462b();
/* 27 */                this.f13289v = null;
                    }
/* 29 */            lj2 lj2Var3 = this.f13290w;
/* 31 */            if (lj2Var3 != null) {
/* 33 */                lj2Var3.m6462b();
/* 36 */                this.f13290w = null;
                    }
/* 38 */            lj2 lj2Var4 = this.f13291x;
/* 40 */            if (lj2Var4 != null) {
/* 42 */                lj2Var4.m6462b();
/* 45 */                this.f13291x = null;
                    }
/* 47 */            ac1 ac1Var = this.f13286s;
/* 49 */            if (ac1Var != null) {
/* 55 */                ((x60) ac1Var.f177b).m9720f();
/* 64 */                pg3.m7443w(new f72(ac1Var, 2));
/* 67 */                this.f13286s = null;
                    }
/* 69 */            C0168b5 c0168b5 = this.f13287t;
/* 71 */            if (c0168b5 != null) {
/* 77 */                ((cb0) c0168b5.f2211b).m1607e();
/* 87 */                pg3.m7443w(new RunnableC2166s2(c0168b5, 18));
/* 90 */                this.f13287t = null;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: C */
                public final List m6436C(String str, String str2, zy2 zy2Var, C2069pg c2069pg, C2069pg c2069pg2) {
                    boolean z;
/* 5 */             pg3.m7423a();
/* 8 */             s53 s53Var = this.f13283p;
/* 10 */            if (c2069pg2 == null) {
/* 21 */                m6437D(str, str2, zy2Var, c2069pg, null);
/* 26 */                InterfaceC2559zp interfaceC2559zpM9655b = m9655b();
/* 30 */                Objects.requireNonNull(interfaceC2559zpM9655b);
/* 45 */                this.f13286s = new ac1(interfaceC2559zpM9655b, new x60(c2069pg.f15103b));
/* 53 */                boolean z2 = this.f18864i != null;
/* 54 */                lj2 lj2Var = this.f13290w;
/* 60 */                int iM5923s = ((jw0) this.f18861f).m5923s();
/* 64 */                s53Var.getClass();
/* 69 */                HashMap map = new HashMap();
/* 82 */                for (wy2 wy2Var : s53Var.f16439a) {
/* 90 */                    s32 s32Var = s53Var.f16437V;
/* 92 */                    InterfaceC2559zp interfaceC2559zp = s53Var.f16444f;
/* 94 */                    s53 s53Var2 = s53Var;
/* 96 */                    boolean z3 = z2;
/* 104 */                   map.put(wy2Var, s53Var2.m8411o(wy2Var, s32Var, interfaceC2559zp, lj2Var, iM5923s, z3));
/* 107 */                   z2 = z3;
/* 108 */                   s53Var = s53Var2;
                        }
/* 110 */               s53 s53Var3 = s53Var;
/* 111 */               ac1 ac1Var = this.f13286s;
/* 113 */               lj2 lj2Var2 = this.f13290w;
/* 121 */               ArrayList arrayList = new ArrayList(map.values());
/* 124 */               if (lj2Var2 == null) {
/* 482 */                   C1951n4.m6868s("Null surfaceEdge");
/* 485 */                   return null;
                        }
/* 126 */               ac1Var.getClass();
/* 129 */               pg3.m7423a();
/* 137 */               ac1Var.f179d = new db0();
/* 139 */               Iterator it = arrayList.iterator();
/* 147 */               while (it.hasNext()) {
/* 153 */                   C0916fg c0916fg = (C0916fg) it.next();
/* 157 */                   db0 db0Var = (db0) ac1Var.f179d;
/* 159 */                   Rect rect = c0916fg.f8195d;
/* 161 */                   int i = c0916fg.f8197f;
/* 163 */                   boolean z4 = c0916fg.f8198g;
/* 169 */                   Matrix matrix = new Matrix(lj2Var2.f13319b);
/* 174 */                   RectF rectF = new RectF(rect);
/* 177 */                   Size size = c0916fg.f8196e;
/* 179 */                   RectF rectF2 = cr2.f6893a;
/* 188 */                   Iterator it2 = it;
/* 205 */                   matrix.postConcat(cr2.m2871a(rectF, new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), i, z4));
/* 220 */                   de3.m3024f(cr2.m2873c(cr2.m2875e(cr2.m2874d(rect), i), size));
/* 234 */                   Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
/* 239 */                   C0168b5 c0168b5M7414a = lj2Var2.f13324g.m7414a();
/* 243 */                   c0168b5M7414a.f2211b = size;
/* 283 */                   db0Var.put(c0916fg, new lj2(c0916fg.f8193b, c0916fg.f8194c, c0168b5M7414a.m1266k(), matrix, false, rect2, lj2Var2.f13326i - i, -1, lj2Var2.f13322e != z4));
/* 286 */                   it = it2;
                        }
/* 292 */               x60 x60Var = (x60) ac1Var.f177b;
/* 295 */               rj2 rj2VarM6463c = lj2Var2.m6463c(true);
/* 305 */               if (x60Var.f18966e.get()) {
/* 307 */                   rj2VarM6463c.m8191b();
                        } else {
/* 324 */                   x60Var.m9716b(new RunnableC1784j8(16, x60Var, rj2VarM6463c), new v60(rj2VarM6463c, 0));
                        }
/* 343 */               for (Map.Entry entry : ((db0) ac1Var.f179d).entrySet()) {
/* 351 */                   ac1Var.m177f(lj2Var2, entry);
/* 358 */                   lj2 lj2Var3 = (lj2) entry.getValue();
/* 364 */                   RunnableC2558zo runnableC2558zo = new RunnableC2558zo(12, ac1Var, lj2Var2, entry);
/* 367 */                   lj2Var3.getClass();
/* 370 */                   pg3.m7423a();
/* 373 */                   lj2Var3.m6461a();
/* 378 */                   lj2Var3.f13330m.add(runnableC2558zo);
                        }
/* 394 */               lj2Var2.f13332o.add(new dl0((db0) ac1Var.f179d, 1));
/* 399 */               db0 db0Var2 = (db0) ac1Var.f179d;
/* 403 */               HashMap map2 = new HashMap();
/* 418 */               for (Map.Entry entry2 : map.entrySet()) {
/* 442 */                   map2.put((wy2) entry2.getKey(), (lj2) db0Var2.get(entry2.getValue()));
                        }
/* 446 */               s53Var3.m8413s(map2);
/* 455 */               Object[] objArr = {this.f13292y.m1318c()};
/* 462 */               ArrayList arrayList2 = new ArrayList(1);
/* 467 */               Object obj = objArr[0];
/* 469 */               Objects.requireNonNull(obj);
/* 472 */               arrayList2.add(obj);
/* 475 */               return Collections.unmodifiableList(arrayList2);
                    }
/* 491 */           m6437D(str, str2, zy2Var, c2069pg, c2069pg2);
/* 496 */           Matrix matrix2 = this.f18865j;
/* 498 */           InterfaceC2559zp interfaceC2559zpM9660h = m9660h();
/* 502 */           Objects.requireNonNull(interfaceC2559zpM9660h);
/* 505 */           boolean zMo8072k = interfaceC2559zpM9660h.mo8072k();
/* 509 */           Size size2 = c2069pg2.f15102a;
/* 511 */           Rect rect3 = this.f18864i;
/* 513 */           if (rect3 != null) {
/* 515 */               z = false;
                    } else {
/* 528 */               z = false;
/* 529 */               rect3 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
                    }
/* 516 */           Rect rect4 = rect3;
/* 533 */           InterfaceC2559zp interfaceC2559zpM9660h2 = m9660h();
/* 537 */           Objects.requireNonNull(interfaceC2559zpM9660h2);
/* 540 */           int iM9659g = m9659g(interfaceC2559zpM9660h2, z);
/* 544 */           InterfaceC2559zp interfaceC2559zpM9660h3 = m9660h();
/* 548 */           Objects.requireNonNull(interfaceC2559zpM9660h3);
/* 559 */           lj2 lj2Var4 = new lj2(3, 34, c2069pg2, matrix2, zMo8072k, rect4, iM9659g, -1, m9661k(interfaceC2559zpM9660h3));
/* 562 */           this.f13289v = lj2Var4;
/* 568 */           Objects.requireNonNull(m9660h());
/* 571 */           this.f13291x = lj2Var4;
/* 577 */           bb2 bb2VarM6438E = m6438E(this.f13289v, zy2Var, c2069pg2);
/* 581 */           this.f13293z = bb2VarM6438E;
/* 583 */           cb2 cb2Var = this.f13281A;
/* 585 */           if (cb2Var != null) {
/* 587 */               cb2Var.m1609b();
                    }
/* 604 */           cb2 cb2Var2 = new cb2(new kh2(this, str, str2, zy2Var, c2069pg, c2069pg2));
/* 607 */           this.f13281A = cb2Var2;
/* 609 */           bb2VarM6438E.f168f = cb2Var2;
/* 635 */           this.f13287t = new C0168b5(m9655b(), m9660h(), new cb0(c2069pg.f15103b, this.f13284q, this.f13285r));
/* 643 */           boolean z5 = this.f18864i != null;
/* 644 */           lj2 lj2Var5 = this.f13290w;
/* 646 */           lj2 lj2Var6 = this.f13291x;
/* 652 */           int iM5923s2 = ((jw0) this.f18861f).m5923s();
/* 656 */           s53Var.getClass();
/* 661 */           HashMap map3 = new HashMap();
/* 674 */           for (wy2 wy2Var2 : s53Var.f16439a) {
/* 688 */               C0916fg c0916fgM8411o = s53Var.m8411o(wy2Var2, s53Var.f16437V, s53Var.f16444f, lj2Var5, iM5923s2, z5);
/* 693 */               s32 s32Var2 = s53Var.f16438W;
/* 695 */               InterfaceC2559zp interfaceC2559zp2 = s53Var.f16445i;
/* 697 */               Objects.requireNonNull(interfaceC2559zp2);
/* 710 */               map3.put(wy2Var2, new C1999of(c0916fgM8411o, s53Var.m8411o(wy2Var2, s32Var2, interfaceC2559zp2, lj2Var6, iM5923s2, z5)));
/* 713 */               lj2Var5 = lj2Var5;
                    }
/* 716 */           C0168b5 c0168b5 = this.f13287t;
/* 733 */           C2068pf c2068pf = new C2068pf(this.f13290w, this.f13291x, new ArrayList(map3.values()));
/* 736 */           c0168b5.getClass();
/* 741 */           cb0 cb0Var = (cb0) c0168b5.f2211b;
/* 743 */           pg3.m7423a();
/* 746 */           c0168b5.f2215f = c2068pf;
/* 753 */           c0168b5.f2214e = new db0();
/* 757 */           C2068pf c2068pf2 = (C2068pf) c0168b5.f2215f;
/* 759 */           lj2 lj2Var7 = c2068pf2.f15091a;
/* 761 */           lj2 lj2Var8 = c2068pf2.f15092b;
/* 765 */           Iterator it3 = c2068pf2.f15093c.iterator();
/* 773 */           while (it3.hasNext()) {
/* 779 */               C1999of c1999of = (C1999of) it3.next();
/* 783 */               db0 db0Var3 = (db0) c0168b5.f2214e;
/* 785 */               C0916fg c0916fg2 = c1999of.f14733a;
/* 787 */               Rect rect5 = c0916fg2.f8195d;
/* 789 */               int i2 = c0916fg2.f8197f;
/* 791 */               boolean z6 = c0916fg2.f8198g;
/* 795 */               Matrix matrix3 = new Matrix();
/* 802 */               Size sizeM2875e = cr2.m2875e(cr2.m2874d(rect5), i2);
/* 806 */               Size size3 = c0916fg2.f8196e;
/* 812 */               de3.m3024f(cr2.m2873c(sizeM2875e, size3));
/* 821 */               Iterator it4 = it3;
/* 827 */               HashMap map4 = map3;
/* 830 */               Rect rect6 = new Rect(0, 0, size3.getWidth(), size3.getHeight());
/* 835 */               C0168b5 c0168b5M7414a2 = lj2Var7.f13324g.m7414a();
/* 839 */               c0168b5M7414a2.f2211b = size3;
/* 875 */               db0Var3.put(c1999of, new lj2(c0916fg2.f8193b, c0916fg2.f8194c, c0168b5M7414a2.m1266k(), matrix3, false, rect6, lj2Var7.f13326i - i2, -1, lj2Var7.f13322e != z6));
/* 878 */               it3 = it4;
/* 880 */               map3 = map4;
                    }
/* 883 */           HashMap map5 = map3;
/* 890 */           cb0Var.m1606d(lj2Var7.m6463c(true));
/* 898 */           cb0Var.m1606d(lj2Var8.m6463c(false));
/* 904 */           InterfaceC2559zp interfaceC2559zp3 = (InterfaceC2559zp) c0168b5.f2212c;
/* 909 */           InterfaceC2559zp interfaceC2559zp4 = (InterfaceC2559zp) c0168b5.f2213d;
/* 927 */           for (Map.Entry entry3 : ((db0) c0168b5.f2214e).entrySet()) {
/* 937 */               lj2 lj2Var9 = lj2Var7;
/* 939 */               lj2 lj2Var10 = lj2Var8;
/* 941 */               c0168b5.m1267l(interfaceC2559zp3, interfaceC2559zp4, lj2Var9, lj2Var10, entry3);
/* 948 */               lj2 lj2Var11 = (lj2) entry3.getValue();
/* 956 */               InterfaceC2559zp interfaceC2559zp5 = interfaceC2559zp4;
/* 958 */               InterfaceC2559zp interfaceC2559zp6 = interfaceC2559zp3;
/* 959 */               C0168b5 c0168b6 = c0168b5;
/* 964 */               RunnableC2039on runnableC2039on = new RunnableC2039on(c0168b6, interfaceC2559zp6, interfaceC2559zp5, lj2Var9, lj2Var10, entry3, 3);
/* 968 */               c0168b5 = c0168b6;
/* 969 */               interfaceC2559zp3 = interfaceC2559zp6;
/* 970 */               interfaceC2559zp4 = interfaceC2559zp5;
/* 976 */               lj2Var11.getClass();
/* 979 */               pg3.m7423a();
/* 982 */               lj2Var11.m6461a();
/* 987 */               lj2Var11.f13330m.add(runnableC2039on);
/* 990 */               lj2Var7 = lj2Var9;
/* 992 */               lj2Var8 = lj2Var10;
                    }
/* 997 */           db0 db0Var4 = (db0) c0168b5.f2214e;
/* 1001 */          HashMap map6 = new HashMap();
/* 1016 */          for (Map.Entry entry4 : map5.entrySet()) {
/* 1040 */              map6.put((wy2) entry4.getKey(), (lj2) db0Var4.get(entry4.getValue()));
                    }
/* 1044 */          s53Var.m8413s(map6);
/* 1059 */          Object[] objArr2 = {this.f13292y.m1318c(), this.f13293z.m1318c()};
/* 1066 */          ArrayList arrayList3 = new ArrayList(2);
/* 1069 */          for (int i3 = 0; i3 < 2; i3++) {
/* 1071 */              Object obj2 = objArr2[i3];
/* 1073 */              Objects.requireNonNull(obj2);
/* 1076 */              arrayList3.add(obj2);
                    }
/* 1082 */          return Collections.unmodifiableList(arrayList3);
                }

                /* JADX INFO: renamed from: D */
                public final void m6437D(String str, String str2, zy2 zy2Var, C2069pg c2069pg, C2069pg c2069pg2) {
/* 3 */             Matrix matrix = this.f18865j;
/* 5 */             InterfaceC2559zp interfaceC2559zpM9655b = m9655b();
/* 9 */             Objects.requireNonNull(interfaceC2559zpM9655b);
/* 12 */            boolean zMo8072k = interfaceC2559zpM9655b.mo8072k();
/* 16 */            Size size = c2069pg.f15102a;
/* 18 */            Rect rect = this.f18864i;
/* 21 */            if (rect == null) {
/* 34 */                rect = new Rect(0, 0, size.getWidth(), size.getHeight());
                    }
/* 37 */            InterfaceC2559zp interfaceC2559zpM9655b2 = m9655b();
/* 41 */            Objects.requireNonNull(interfaceC2559zpM9655b2);
/* 44 */            int iM9659g = m9659g(interfaceC2559zpM9655b2, false);
/* 48 */            InterfaceC2559zp interfaceC2559zpM9655b3 = m9655b();
/* 52 */            Objects.requireNonNull(interfaceC2559zpM9655b3);
/* 65 */            lj2 lj2Var = new lj2(3, 34, c2069pg, matrix, zMo8072k, rect, iM9659g, -1, m9661k(interfaceC2559zpM9655b3));
/* 68 */            this.f13288u = lj2Var;
/* 74 */            Objects.requireNonNull(m9655b());
/* 77 */            this.f13290w = lj2Var;
/* 81 */            bb2 bb2VarM6438E = m6438E(this.f13288u, zy2Var, c2069pg);
/* 85 */            this.f13292y = bb2VarM6438E;
/* 87 */            cb2 cb2Var = this.f13281A;
/* 89 */            if (cb2Var != null) {
/* 91 */                cb2Var.m1609b();
                    }
/* 107 */           cb2 cb2Var2 = new cb2(new kh2(this, str, str2, zy2Var, c2069pg, c2069pg2));
/* 110 */           this.f13281A = cb2Var2;
/* 112 */           bb2VarM6438E.f168f = cb2Var2;
                }

                /* JADX INFO: renamed from: E */
                public final bb2 m6438E(lj2 lj2Var, zy2 zy2Var, C2069pg c2069pg) {
/* 3 */             bb2 bb2VarM1315d = bb2.m1315d(zy2Var, c2069pg.f15102a);
/* 7 */             C1767ir c1767ir = bb2VarM1315d.f164b;
/* 9 */             s53 s53Var = this.f13283p;
/* 13 */            Iterator it = s53Var.f16439a.iterator();
/* 18 */            int i = -1;
/* 23 */            while (it.hasNext()) {
/* 43 */                int i2 = ((fb2) ((wy2) it.next()).f18861f.mo7025e(zy2.f20384G)).f8120g.f12443c;
/* 45 */                List list = fb2.f8113i;
/* 63 */                if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
/* 66 */                    i = i2;
                        }
                    }
/* 68 */            if (i != -1) {
/* 70 */                c1767ir.f11908a = i;
                    }
/* 72 */            Size size = c2069pg.f15102a;
/* 76 */            Iterator it2 = s53Var.f16439a.iterator();
/* 84 */            while (it2.hasNext()) {
/* 98 */                fb2 fb2VarM1318c = bb2.m1315d(((wy2) it2.next()).f18861f, size).m1318c();
/* 102 */               C1803jr c1803jr = fb2VarM1318c.f8120g;
/* 106 */               c1767ir.m5543b(c1803jr.f12444d);
/* 109 */               List<AbstractC1934mo> list2 = fb2VarM1318c.f8118e;
/* 111 */               ArrayList arrayList = bb2VarM1315d.f167e;
/* 121 */               for (AbstractC1934mo abstractC1934mo : list2) {
/* 129 */                   c1767ir.m5544c(abstractC1934mo);
/* 136 */                   if (!arrayList.contains(abstractC1934mo)) {
/* 138 */                       arrayList.add(abstractC1934mo);
                            }
                        }
/* 152 */               for (CameraCaptureSession.StateCallback stateCallback : fb2VarM1318c.f8117d) {
/* 160 */                   ArrayList arrayList2 = bb2VarM1315d.f166d;
/* 166 */                   if (!arrayList2.contains(stateCallback)) {
/* 169 */                       arrayList2.add(stateCallback);
                            }
                        }
/* 183 */               for (CameraDevice.StateCallback stateCallback2 : fb2VarM1318c.f8116c) {
/* 191 */                   ArrayList arrayList3 = bb2VarM1315d.f165c;
/* 197 */                   if (!arrayList3.contains(stateCallback2)) {
/* 200 */                       arrayList3.add(stateCallback2);
                            }
                        }
/* 206 */               c1767ir.m5545e(c1803jr.f12442b);
                    }
/* 211 */           lj2Var.getClass();
/* 214 */           pg3.m7423a();
/* 217 */           lj2Var.m6461a();
/* 226 */           de3.m3028j("Consumer can only be linked once.", !lj2Var.f13327j);
/* 229 */           lj2Var.f13327j = true;
/* 235 */           bb2VarM1315d.m1317b(lj2Var.f13329l, c2069pg.f15103b, -1);
/* 240 */           c1767ir.m5544c(s53Var.f16446v);
/* 243 */           InterfaceC2235ty interfaceC2235ty = c2069pg.f15105d;
/* 245 */           if (interfaceC2235ty != null) {
/* 247 */               c1767ir.m5545e(interfaceC2235ty);
                    }
/* 250 */           return bb2VarM1315d;
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: e */
                public final zy2 mo6439e(boolean z, cz2 cz2Var) {
/* 1 */             mh2 mh2Var = this.f13282o;
/* 8 */             InterfaceC2235ty interfaceC2235tyMo1183a = cz2Var.mo1183a(mh2Var.mo7453t(), 1);
/* 12 */            if (z) {
/* 16 */                interfaceC2235tyMo1183a = InterfaceC2235ty.m8924q(interfaceC2235tyMo1183a, mh2Var.f13783a);
                    }
/* 20 */            if (interfaceC2235tyMo1183a == null) {
/* 22 */                return null;
                    }
/* 30 */            return ((C2340wq) mo6441j(interfaceC2235tyMo1183a)).mo7036o();
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: i */
                public final Set mo6440i() {
/* 3 */             HashSet hashSet = new HashSet();
/* 11 */            hashSet.add(3);
/* 14 */            return hashSet;
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: j */
                public final yy2 mo6441j(InterfaceC2235ty interfaceC2235ty) {
/* 7 */             return new C2340wq(uk1.m9035m(interfaceC2235ty));
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: p */
                public final void mo6442p() {
/* 1 */             s53 s53Var = this.f13283p;
/* 13 */            for (wy2 wy2Var : s53Var.f16439a) {
/* 27 */                r53 r53Var = (r53) s53Var.f16441c.get(wy2Var);
/* 29 */                Objects.requireNonNull(r53Var);
/* 40 */                wy2Var.m9654a(r53Var, null, null, wy2Var.mo6439e(true, s53Var.f16443e));
                    }
                }

                /* JADX WARN: Code duplicated, block: B:53:0x0183  */
                @Override // p000.wy2
                /* JADX INFO: renamed from: r */
                public final zy2 mo6443r(InterfaceC2469xp interfaceC2469xp, yy2 yy2Var) {
                    Object objMo7025e;
                    mb0 mb0Var;
/* 1 */             uk1 uk1VarMo2939m = yy2Var.mo2939m();
/* 5 */             s53 s53Var = this.f13283p;
/* 7 */             HashSet hashSet = s53Var.f16447w;
/* 9 */             s32 s32Var = s53Var.f16437V;
/* 15 */            List listMo315g = s32Var.f16412f.mo315g(34);
/* 24 */            HashSet<zy2> hashSet2 = s32Var.f16410d;
/* 35 */            for (zy2 zy2Var : hashSet2) {
/* 57 */                if (!((Boolean) zy2Var.mo7023b(zy2.f20391N, Boolean.FALSE)).booleanValue() && (zy2Var instanceof jw0)) {
                        }
                    }
/* 75 */            C1888lf c1888lf = jw0.f12526z;
/* 77 */            uk1VarMo2939m.getClass();
                    try {
/* 80 */                objMo7025e = uk1VarMo2939m.mo7025e(c1888lf);
                    } catch (IllegalArgumentException unused) {
/* 85 */                objMo7025e = null;
                    }
/* 86 */            List list = (List) objMo7025e;
/* 88 */            if (list != null) {
/* 90 */                Iterator it = list.iterator();
                        while (true) {
/* 98 */                    if (!it.hasNext()) {
/* 131 */                       listMo315g = new ArrayList();
                                break;
                            }
/* 104 */                   Pair pair = (Pair) it.next();
/* 118 */                   if (((Integer) pair.first).equals(34)) {
/* 124 */                       listMo315g = Arrays.asList((Size[]) pair.second);
                                break;
                            }
                        }
                    }
/* 134 */           Rational rational = s32Var.f16409c;
/* 138 */           ArrayList arrayList = new ArrayList();
/* 143 */           HashSet hashSet3 = new HashSet();
/* 146 */           Iterator it2 = hashSet2.iterator();
/* 154 */           while (it2.hasNext()) {
/* 166 */               hashSet3.addAll(s32Var.m8394b((zy2) it2.next()));
                    }
/* 170 */           Iterator it3 = hashSet3.iterator();
/* 178 */           while (it3.hasNext()) {
/* 190 */               if (!AbstractC2177sd.m8480a(rational, (Size) it3.next())) {
/* 198 */                   arrayList.addAll(s32Var.m8397f(s32Var.f16408b, listMo315g, false));
                            break;
                        }
                    }
/* 205 */           arrayList.addAll(s32Var.m8397f(rational, listMo315g, false));
/* 212 */           arrayList.addAll(s32Var.m8396e(listMo315g, false));
/* 222 */           if (arrayList.isEmpty()) {
/* 226 */               hu0.m4315H0("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
/* 233 */               arrayList.addAll(s32Var.m8396e(listMo315g, true));
                    }
/* 236 */           arrayList.toString();
/* 239 */           hu0.m4312F0("ResolutionsMerger");
/* 244 */           uk1VarMo2939m.m9037p(jw0.f12518B, arrayList);
/* 247 */           C1888lf c1888lf2 = zy2.f20388K;
/* 249 */           Iterator it4 = hashSet.iterator();
/* 253 */           int iMax = 0;
/* 258 */           while (it4.hasNext()) {
/* 278 */               iMax = Math.max(iMax, ((Integer) ((zy2) it4.next()).mo7023b(zy2.f20388K, 0)).intValue());
                    }
/* 287 */           uk1VarMo2939m.m9037p(c1888lf2, Integer.valueOf(iMax));
/* 292 */           ArrayList arrayList2 = new ArrayList();
/* 295 */           Iterator it5 = hashSet.iterator();
/* 303 */           while (it5.hasNext()) {
/* 319 */               mb0 mb0Var2 = (mb0) ((zy2) it5.next()).mo7023b(hw0.f9339p, mb0.f13670c);
/* 321 */               mb0Var2.getClass();
/* 324 */               arrayList2.add(mb0Var2);
                    }
/* 332 */           if (arrayList2.isEmpty()) {
/* 468 */               mb0Var = null;
                        break;
                    }
/* 340 */           mb0 mb0Var3 = (mb0) arrayList2.get(0);
/* 344 */           Integer numValueOf = Integer.valueOf(mb0Var3.f13677a);
/* 350 */           Integer numValueOf2 = Integer.valueOf(mb0Var3.f13678b);
/* 354 */           int i = 1;
                    while (true) {
/* 359 */               if (i >= arrayList2.size()) {
/* 480 */                   mb0Var = new mb0(numValueOf.intValue(), numValueOf2.intValue());
                            break;
                        }
/* 365 */               mb0 mb0Var4 = (mb0) arrayList2.get(i);
/* 369 */               Integer numValueOf3 = Integer.valueOf(mb0Var4.f13677a);
/* 386 */               if (numValueOf.equals(0)) {
/* 388 */                   numValueOf = numValueOf3;
                        } else if (!numValueOf3.equals(0)) {
/* 401 */                   if (numValueOf.equals(2) && !numValueOf3.equals(1)) {
/* 388 */                       numValueOf = numValueOf3;
                            } else if ((!numValueOf3.equals(2) || numValueOf.equals(1)) && !numValueOf.equals(numValueOf3)) {
/* 430 */                       numValueOf = null;
                            }
                        }
/* 433 */               Integer numValueOf4 = Integer.valueOf(mb0Var4.f13678b);
/* 441 */               if (numValueOf2.equals(0)) {
/* 443 */                   numValueOf2 = numValueOf4;
                        } else if (!numValueOf4.equals(0) && !numValueOf2.equals(numValueOf4)) {
/* 459 */                   numValueOf2 = null;
                        }
/* 460 */               if (numValueOf == null || numValueOf2 == null) {
/* 468 */                   mb0Var = null;
                            break;
                        }
/* 465 */               i++;
                    }
/* 483 */           if (mb0Var == null) {
/* 569 */               C1951n4.m6859j("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
/* 34 */                return null;
                    }
/* 487 */           uk1VarMo2939m.m9037p(hw0.f9339p, mb0Var);
/* 500 */           for (wy2 wy2Var : s53Var.f16439a) {
/* 508 */               zy2 zy2Var2 = wy2Var.f18861f;
/* 510 */               C1888lf c1888lf3 = zy2.f20394Q;
/* 522 */               if (((Integer) zy2Var2.mo7023b(c1888lf3, 0)).intValue() != 0) {
/* 530 */                   Integer num = (Integer) wy2Var.f18861f.mo7023b(c1888lf3, 0);
/* 532 */                   num.intValue();
/* 535 */                   uk1VarMo2939m.m9037p(c1888lf3, num);
                        }
/* 544 */               if (wy2Var.f18861f.m10450v() != 0) {
/* 558 */                   uk1VarMo2939m.m9037p(zy2.f20393P, Integer.valueOf(wy2Var.f18861f.m10450v()));
                        }
                    }
/* 562 */           return yy2Var.mo7036o();
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: s */
                public final void mo6444s() {
/* 13 */            for (wy2 wy2Var : this.f13283p.f16439a) {
/* 21 */                wy2Var.mo6444s();
/* 24 */                wy2Var.mo9666q();
                    }
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: t */
                public final void mo6445t() {
/* 5 */             Iterator it = this.f13283p.f16439a.iterator();
/* 13 */            while (it.hasNext()) {
/* 21 */                ((wy2) it.next()).mo6445t();
                    }
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: u */
                public final C2069pg mo6446u(InterfaceC2235ty interfaceC2235ty) {
/* 3 */             this.f13292y.m1316a(interfaceC2235ty);
/* 12 */            Object[] objArr = {this.f13292y.m1318c()};
/* 19 */            ArrayList arrayList = new ArrayList(1);
/* 23 */            Object obj = objArr[0];
/* 25 */            Objects.requireNonNull(obj);
/* 28 */            arrayList.add(obj);
/* 35 */            m9653A(Collections.unmodifiableList(arrayList));
/* 40 */            C0168b5 c0168b5M7414a = this.f18862g.m7414a();
/* 44 */            c0168b5M7414a.f2214e = interfaceC2235ty;
/* 46 */            return c0168b5M7414a.m1266k();
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: v */
                public final C2069pg mo6447v(C2069pg c2069pg, C2069pg c2069pg2) {
/* 36 */            m9653A(m6436C(m9657d(), m9660h() == null ? null : m9660h().mo8073m().mo310b(), this.f18861f, c2069pg, c2069pg2));
/* 39 */            m9663m();
/* 30 */            return c2069pg;
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: w */
                public final void mo6448w() {
/* 1 */             m6435B();
/* 4 */             s53 s53Var = this.f13283p;
/* 16 */            for (wy2 wy2Var : s53Var.f16439a) {
/* 30 */                r53 r53Var = (r53) s53Var.f16441c.get(wy2Var);
/* 32 */                Objects.requireNonNull(r53Var);
/* 35 */                wy2Var.m9667z(r53Var);
                    }
                }
            }
