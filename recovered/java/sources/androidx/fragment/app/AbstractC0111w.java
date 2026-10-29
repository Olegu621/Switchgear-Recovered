            package androidx.fragment.app;

            import android.content.res.Configuration;
            import android.os.Bundle;
            import android.os.Looper;
            import android.util.Log;
            import android.view.Menu;
            import android.view.MenuInflater;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.fragment.R$id;
            import androidx.fragment.app.AbstractC0111w;
            import com.helpshift.activities.HSMainActivity;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.FileDescriptor;
            import java.io.PrintWriter;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.atomic.AtomicInteger;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.AbstractC1816k3;
            import p000.C0866e3;
            import p000.C0977h3;
            import p000.C1951n4;
            import p000.C2234tx;
            import p000.InterfaceC1876l3;
            import p000.RunnableC2495ye;
            import p000.ac1;
            import p000.aq1;
            import p000.bn0;
            import p000.bq1;
            import p000.bt0;
            import p000.c00;
            import p000.dn0;
            import p000.ds0;
            import p000.ec0;
            import p000.eq1;
            import p000.f42;
            import p000.fm0;
            import p000.g71;
            import p000.ga1;
            import p000.lg1;
            import p000.ls0;
            import p000.mm0;
            import p000.om0;
            import p000.pm0;
            import p000.qm0;
            import p000.rm0;
            import p000.s80;
            import p000.sm0;
            import p000.sp1;
            import p000.tm0;
            import p000.tp1;
            import p000.u33;
            import p000.u61;
            import p000.vp1;
            import p000.wc0;
            import p000.x62;
            import p000.xm0;
            import p000.xs0;
            import p000.z62;
            
            /* JADX INFO: renamed from: androidx.fragment.app.w */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0111w {

                /* JADX INFO: renamed from: A */
                public final ec0 f1476A;

                /* JADX INFO: renamed from: B */
                public C0977h3 f1477B;

                /* JADX INFO: renamed from: C */
                public C0977h3 f1478C;

                /* JADX INFO: renamed from: D */
                public C0977h3 f1479D;

                /* JADX INFO: renamed from: E */
                public ArrayDeque f1480E;

                /* JADX INFO: renamed from: F */
                public boolean f1481F;

                /* JADX INFO: renamed from: G */
                public boolean f1482G;

                /* JADX INFO: renamed from: H */
                public boolean f1483H;

                /* JADX INFO: renamed from: I */
                public boolean f1484I;

                /* JADX INFO: renamed from: J */
                public boolean f1485J;

                /* JADX INFO: renamed from: K */
                public ArrayList f1486K;

                /* JADX INFO: renamed from: L */
                public ArrayList f1487L;

                /* JADX INFO: renamed from: M */
                public ArrayList f1488M;

                /* JADX INFO: renamed from: N */
                public C0112x f1489N;

                /* JADX INFO: renamed from: O */
                public final RunnableC2495ye f1490O;

                /* JADX INFO: renamed from: b */
                public boolean f1492b;

                /* JADX INFO: renamed from: e */
                public ArrayList f1495e;

                /* JADX INFO: renamed from: g */
                public sp1 f1497g;

                /* JADX INFO: renamed from: m */
                public final ArrayList f1503m;

                /* JADX INFO: renamed from: n */
                public final wc0 f1504n;

                /* JADX INFO: renamed from: o */
                public final CopyOnWriteArrayList f1505o;

                /* JADX INFO: renamed from: p */
                public final pm0 f1506p;

                /* JADX INFO: renamed from: q */
                public final pm0 f1507q;

                /* JADX INFO: renamed from: r */
                public final pm0 f1508r;

                /* JADX INFO: renamed from: s */
                public final pm0 f1509s;

                /* JADX INFO: renamed from: t */
                public final qm0 f1510t;

                /* JADX INFO: renamed from: u */
                public int f1511u;

                /* JADX INFO: renamed from: v */
                public om0 f1512v;

                /* JADX INFO: renamed from: w */
                public mm0 f1513w;

                /* JADX INFO: renamed from: x */
                public Fragment f1514x;

                /* JADX INFO: renamed from: y */
                public Fragment f1515y;

                /* JADX INFO: renamed from: z */
                public final rm0 f1516z;

                /* JADX INFO: renamed from: a */
                public final ArrayList f1491a = new ArrayList();

                /* JADX INFO: renamed from: c */
                public final C0114z f1493c = new C0114z();

                /* JADX INFO: renamed from: d */
                public ArrayList f1494d = new ArrayList();

                /* JADX INFO: renamed from: f */
                public final LayoutInflaterFactory2C0107s f1496f = new LayoutInflaterFactory2C0107s(this);

                /* JADX INFO: renamed from: h */
                public C0086a f1498h = null;

                /* JADX INFO: renamed from: i */
                public final C0109u f1499i = new C0109u(this);

                /* JADX INFO: renamed from: j */
                public final AtomicInteger f1500j = new AtomicInteger();

                /* JADX INFO: renamed from: k */
                public final Map f1501k = Collections.synchronizedMap(new HashMap());

                /* JADX INFO: renamed from: l */
                public final Map f1502l = Collections.synchronizedMap(new HashMap());

                /* JADX WARN: Type inference failed for: r0v15, types: [pm0] */
                /* JADX WARN: Type inference failed for: r0v16, types: [pm0] */
                /* JADX WARN: Type inference failed for: r0v17, types: [pm0] */
                /* JADX WARN: Type inference failed for: r0v18, types: [pm0] */
                public AbstractC0111w() {
/* 76 */            Collections.synchronizedMap(new HashMap());
/* 84 */            this.f1503m = new ArrayList();
/* 91 */            this.f1504n = new wc0(this);
/* 98 */            this.f1505o = new CopyOnWriteArrayList();
/* 102 */           final int i = 0;
/* 106 */           this.f1506p = new c00(this) { // from class: pm0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ AbstractC0111w f15178b;

                        {
/* 3 */                     this.f15178b = this;
                        }

                        @Override // p000.c00
                        public final void accept(Object obj) {
/* 1 */                     int i2 = i;
/* 4 */                     AbstractC0111w abstractC0111w = this.f15178b;
                            switch (i2) {
                                case 0:
/* 57 */                            Configuration configuration = (Configuration) obj;
/* 63 */                            if (abstractC0111w.m686M()) {
/* 65 */                                abstractC0111w.m711i(false, configuration);
                                    }
                                    break;
                                case 1:
/* 37 */                            Integer num = (Integer) obj;
/* 43 */                            if (abstractC0111w.m686M() && num.intValue() == 80) {
/* 53 */                                abstractC0111w.m715m(false);
                                        break;
                                    }
                                    break;
                                case 2:
/* 23 */                            ok1 ok1Var = (ok1) obj;
/* 29 */                            if (abstractC0111w.m686M()) {
/* 33 */                                abstractC0111w.m716n(ok1Var.f14788a, false);
                                    }
                                    break;
                                default:
/* 9 */                             as1 as1Var = (as1) obj;
/* 15 */                            if (abstractC0111w.m686M()) {
/* 19 */                                abstractC0111w.m721s(as1Var.f2075a, false);
                                    }
                                    break;
                            }
                        }
                    };
/* 110 */           final int i2 = 1;
/* 114 */           this.f1507q = new c00(this) { // from class: pm0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ AbstractC0111w f15178b;

                        {
/* 3 */                     this.f15178b = this;
                        }

                        @Override // p000.c00
                        public final void accept(Object obj) {
/* 1 */                     int i3 = i2;
/* 4 */                     AbstractC0111w abstractC0111w = this.f15178b;
                            switch (i3) {
                                case 0:
/* 57 */                            Configuration configuration = (Configuration) obj;
/* 63 */                            if (abstractC0111w.m686M()) {
/* 65 */                                abstractC0111w.m711i(false, configuration);
                                    }
                                    break;
                                case 1:
/* 37 */                            Integer num = (Integer) obj;
/* 43 */                            if (abstractC0111w.m686M() && num.intValue() == 80) {
/* 53 */                                abstractC0111w.m715m(false);
                                        break;
                                    }
                                    break;
                                case 2:
/* 23 */                            ok1 ok1Var = (ok1) obj;
/* 29 */                            if (abstractC0111w.m686M()) {
/* 33 */                                abstractC0111w.m716n(ok1Var.f14788a, false);
                                    }
                                    break;
                                default:
/* 9 */                             as1 as1Var = (as1) obj;
/* 15 */                            if (abstractC0111w.m686M()) {
/* 19 */                                abstractC0111w.m721s(as1Var.f2075a, false);
                                    }
                                    break;
                            }
                        }
                    };
/* 118 */           final int i3 = 2;
/* 122 */           this.f1508r = new c00(this) { // from class: pm0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ AbstractC0111w f15178b;

                        {
/* 3 */                     this.f15178b = this;
                        }

                        @Override // p000.c00
                        public final void accept(Object obj) {
/* 1 */                     int i4 = i3;
/* 4 */                     AbstractC0111w abstractC0111w = this.f15178b;
                            switch (i4) {
                                case 0:
/* 57 */                            Configuration configuration = (Configuration) obj;
/* 63 */                            if (abstractC0111w.m686M()) {
/* 65 */                                abstractC0111w.m711i(false, configuration);
                                    }
                                    break;
                                case 1:
/* 37 */                            Integer num = (Integer) obj;
/* 43 */                            if (abstractC0111w.m686M() && num.intValue() == 80) {
/* 53 */                                abstractC0111w.m715m(false);
                                        break;
                                    }
                                    break;
                                case 2:
/* 23 */                            ok1 ok1Var = (ok1) obj;
/* 29 */                            if (abstractC0111w.m686M()) {
/* 33 */                                abstractC0111w.m716n(ok1Var.f14788a, false);
                                    }
                                    break;
                                default:
/* 9 */                             as1 as1Var = (as1) obj;
/* 15 */                            if (abstractC0111w.m686M()) {
/* 19 */                                abstractC0111w.m721s(as1Var.f2075a, false);
                                    }
                                    break;
                            }
                        }
                    };
/* 126 */           final int i4 = 3;
/* 130 */           this.f1509s = new c00(this) { // from class: pm0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ AbstractC0111w f15178b;

                        {
/* 3 */                     this.f15178b = this;
                        }

                        @Override // p000.c00
                        public final void accept(Object obj) {
/* 1 */                     int i5 = i4;
/* 4 */                     AbstractC0111w abstractC0111w = this.f15178b;
                            switch (i5) {
                                case 0:
/* 57 */                            Configuration configuration = (Configuration) obj;
/* 63 */                            if (abstractC0111w.m686M()) {
/* 65 */                                abstractC0111w.m711i(false, configuration);
                                    }
                                    break;
                                case 1:
/* 37 */                            Integer num = (Integer) obj;
/* 43 */                            if (abstractC0111w.m686M() && num.intValue() == 80) {
/* 53 */                                abstractC0111w.m715m(false);
                                        break;
                                    }
                                    break;
                                case 2:
/* 23 */                            ok1 ok1Var = (ok1) obj;
/* 29 */                            if (abstractC0111w.m686M()) {
/* 33 */                                abstractC0111w.m716n(ok1Var.f14788a, false);
                                    }
                                    break;
                                default:
/* 9 */                             as1 as1Var = (as1) obj;
/* 15 */                            if (abstractC0111w.m686M()) {
/* 19 */                                abstractC0111w.m721s(as1Var.f2075a, false);
                                    }
                                    break;
                            }
                        }
                    };
/* 137 */           this.f1510t = new qm0(this);
/* 140 */           this.f1511u = -1;
/* 147 */           this.f1516z = new rm0(this);
/* 151 */           int i5 = 9;
/* 156 */           this.f1476A = new ec0(i5);
/* 163 */           this.f1480E = new ArrayDeque();
/* 170 */           this.f1490O = new RunnableC2495ye(this, i5);
                }

                /* JADX INFO: renamed from: F */
                public static HashSet m673F(C0086a c0086a) {
/* 3 */             HashSet hashSet = new HashSet();
/* 13 */            for (int i = 0; i < c0086a.f1385a.size(); i++) {
/* 23 */                Fragment fragment = ((dn0) c0086a.f1385a.get(i)).f7326b;
/* 25 */                if (fragment != null && c0086a.f1391g) {
/* 31 */                    hashSet.add(fragment);
                        }
                    }
/* 37 */            return hashSet;
                }

                /* JADX INFO: renamed from: K */
                public static boolean m674K(int i) {
                    return Log.isLoggable("FragmentManager", i);
                }

                /* JADX INFO: renamed from: L */
                public static boolean m675L(Fragment fragment) {
/* 3 */             if (fragment.mHasMenu && fragment.mMenuVisible) {
/* 43 */                return true;
                    }
/* 22 */            boolean zM675L = false;
/* 27 */            for (Fragment fragment2 : fragment.mChildFragmentManager.f1493c.m750e()) {
/* 35 */                if (fragment2 != null) {
/* 37 */                    zM675L = m675L(fragment2);
                        }
/* 41 */                if (zM675L) {
/* 43 */                    return true;
                        }
                    }
/* 21 */            return false;
                }

                /* JADX INFO: renamed from: N */
                public static boolean m676N(Fragment fragment) {
/* 1 */             if (fragment == null) {
/* 22 */                return true;
                    }
/* 4 */             AbstractC0111w abstractC0111w = fragment.mFragmentManager;
                    return fragment.equals(abstractC0111w.f1515y) && m676N(abstractC0111w.f1514x);
                }

                /* JADX INFO: renamed from: A */
                public final void m677A(C0086a c0086a, boolean z) {
/* 1 */             if (z && (this.f1512v == null || this.f1484I)) {
/* 11 */                return;
                    }
/* 12 */            m727y(z);
/* 19 */            c0086a.mo635a(this.f1486K, this.f1487L);
/* 23 */            this.f1492b = true;
                    try {
/* 29 */                m693U(this.f1486K, this.f1487L);
/* 32 */                m705d();
/* 35 */                m706d0();
/* 38 */                boolean z2 = this.f1485J;
/* 40 */                C0114z c0114z = this.f1493c;
/* 42 */                if (z2) {
/* 45 */                    this.f1485J = false;
/* 59 */                    for (C0113y c0113y : c0114z.m749d()) {
/* 67 */                        Fragment fragment = c0113y.f1526c;
/* 71 */                        if (fragment.mDeferStart) {
/* 75 */                            if (this.f1492b) {
/* 77 */                                this.f1485J = true;
                                    } else {
/* 80 */                                fragment.mDeferStart = false;
/* 82 */                                c0113y.m741i();
                                    }
                                }
                            }
                        }
/* 97 */                c0114z.f1530b.values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
/* 102 */               m705d();
/* 105 */               throw th;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:109:0x0222 A[PHI: r15
  0x0222: PHI (r15v14 int) = (r15v13 int), (r15v16 int) binds: [B:101:0x020f, B:105:0x0219] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:65:0x0173  */
                /* JADX WARN: Code duplicated, block: B:66:0x0179  */
                /* JADX INFO: renamed from: B */
                public final void m678B(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
                    int i3;
                    boolean z;
                    int i4;
                    boolean z2;
                    int i5;
                    int i6;
/* 7 */             int i7 = i;
/* 17 */            boolean z3 = ((C0086a) arrayList.get(i7)).f1400p;
/* 19 */            ArrayList arrayList3 = this.f1488M;
/* 21 */            if (arrayList3 == null) {
/* 28 */                this.f1488M = new ArrayList();
                    } else {
/* 31 */                arrayList3.clear();
                    }
/* 34 */            ArrayList arrayList4 = this.f1488M;
/* 36 */            C0114z c0114z = this.f1493c;
/* 42 */            arrayList4.addAll(c0114z.m751f());
/* 45 */            Fragment fragment = this.f1515y;
/* 47 */            int i8 = i7;
/* 48 */            boolean z4 = false;
                    while (true) {
/* 49 */                int i9 = 1;
/* 50 */                if (i8 >= i2) {
/* 403 */                   boolean z5 = z3;
/* 405 */                   boolean z6 = z4;
/* 409 */                   this.f1488M.clear();
/* 412 */                   if (!z5 && this.f1511u >= 1) {
/* 420 */                       for (int i10 = i7; i10 < i2; i10++) {
/* 430 */                           Iterator it = ((C0086a) arrayList.get(i10)).f1385a.iterator();
/* 438 */                           while (it.hasNext()) {
/* 446 */                               Fragment fragment2 = ((dn0) it.next()).f7326b;
/* 448 */                               if (fragment2 != null && fragment2.mFragmentManager != null) {
/* 458 */                                   c0114z.m752g(m709g(fragment2));
                                        }
                                    }
                                }
                            }
/* 465 */                   int i11 = i7;
/* 467 */                   while (i11 < i2) {
/* 473 */                       C0086a c0086a = (C0086a) arrayList.get(i11);
/* 487 */                       if (!((Boolean) arrayList2.get(i11)).booleanValue()) {
/* 747 */                           c0086a.m637c(1);
/* 750 */                           AbstractC0111w abstractC0111w = c0086a.f1401q;
/* 752 */                           ArrayList arrayList5 = c0086a.f1385a;
/* 754 */                           int size = arrayList5.size();
/* 758 */                           int i12 = 0;
/* 759 */                           while (i12 < size) {
/* 765 */                               dn0 dn0Var = (dn0) arrayList5.get(i12);
/* 767 */                               Fragment fragment3 = dn0Var.f7326b;
/* 769 */                               if (fragment3 != null) {
/* 772 */                                   fragment3.mBeingSaved = false;
/* 774 */                                   fragment3.setPopDirection(false);
/* 779 */                                   fragment3.setNextTransition(c0086a.f1390f);
/* 786 */                                   fragment3.setSharedElementNames(c0086a.f1398n, c0086a.f1399o);
                                        }
                                        switch (dn0Var.f7325a) {
                                            case 1:
/* 965 */                                       i3 = i11;
/* 977 */                                       fragment3.setAnimations(dn0Var.f7328d, dn0Var.f7329e, dn0Var.f7330f, dn0Var.f7331g);
/* 981 */                                       abstractC0111w.m697Y(fragment3, false);
/* 984 */                                       abstractC0111w.m699a(fragment3);
/* 987 */                                       i12++;
/* 989 */                                       i11 = i3;
                                                break;
                                            case 2:
                                            default:
/* 796 */                                       s80.m8429j(dn0Var.f7325a, "Unknown cmd: ");
                                                break;
                                            case 3:
/* 946 */                                       i3 = i11;
/* 958 */                                       fragment3.setAnimations(dn0Var.f7328d, dn0Var.f7329e, dn0Var.f7330f, dn0Var.f7331g);
/* 961 */                                       abstractC0111w.m692T(fragment3);
/* 987 */                                       i12++;
/* 989 */                                       i11 = i3;
                                                break;
                                            case 4:
/* 903 */                                       i3 = i11;
/* 913 */                                       fragment3.setAnimations(dn0Var.f7328d, dn0Var.f7329e, dn0Var.f7330f, dn0Var.f7331g);
/* 916 */                                       abstractC0111w.getClass();
/* 925 */                                       if (m674K(2)) {
/* 927 */                                           Objects.toString(fragment3);
                                                }
/* 932 */                                       if (!fragment3.mHidden) {
/* 935 */                                           fragment3.mHidden = true;
/* 940 */                                           fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
/* 942 */                                           abstractC0111w.m702b0(fragment3);
                                                }
/* 987 */                                       i12++;
/* 989 */                                       i11 = i3;
                                                break;
                                            case 5:
/* 860 */                                       i3 = i11;
/* 870 */                                       fragment3.setAnimations(dn0Var.f7328d, dn0Var.f7329e, dn0Var.f7330f, dn0Var.f7331g);
/* 874 */                                       abstractC0111w.m697Y(fragment3, false);
/* 883 */                                       if (m674K(2)) {
/* 885 */                                           Objects.toString(fragment3);
                                                }
/* 890 */                                       if (fragment3.mHidden) {
/* 892 */                                           fragment3.mHidden = false;
/* 900 */                                           fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                                }
/* 987 */                                       i12++;
/* 989 */                                       i11 = i3;
                                                break;
                                            case 6:
/* 843 */                                       i3 = i11;
/* 853 */                                       fragment3.setAnimations(dn0Var.f7328d, dn0Var.f7329e, dn0Var.f7330f, dn0Var.f7331g);
/* 856 */                                       abstractC0111w.m710h(fragment3);
/* 987 */                                       i12++;
/* 989 */                                       i11 = i3;
                                                break;
                                            case 7:
/* 826 */                                       i3 = i11;
/* 832 */                                       fragment3.setAnimations(dn0Var.f7328d, dn0Var.f7329e, dn0Var.f7330f, dn0Var.f7331g);
/* 836 */                                       abstractC0111w.m697Y(fragment3, false);
/* 839 */                                       abstractC0111w.m703c(fragment3);
/* 987 */                                       i12++;
/* 989 */                                       i11 = i3;
                                                break;
                                            case 8:
/* 817 */                                       abstractC0111w.m700a0(fragment3);
/* 805 */                                       i3 = i11;
/* 987 */                                       i12++;
/* 989 */                                       i11 = i3;
                                                break;
                                            case 9:
/* 812 */                                       abstractC0111w.m700a0(null);
/* 805 */                                       i3 = i11;
/* 987 */                                       i12++;
/* 989 */                                       i11 = i3;
                                                break;
                                            case 10:
/* 802 */                                       abstractC0111w.m698Z(fragment3, dn0Var.f7333i);
/* 805 */                                       i3 = i11;
/* 987 */                                       i12++;
/* 989 */                                       i11 = i3;
                                                break;
                                        }
/* 568 */                               return;
                                    }
                                }
/* 489 */                       c0086a.m637c(-1);
/* 492 */                       AbstractC0111w abstractC0111w2 = c0086a.f1401q;
/* 494 */                       ArrayList arrayList6 = c0086a.f1385a;
/* 500 */                       boolean z7 = true;
/* 502 */                       for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
/* 508 */                           dn0 dn0Var2 = (dn0) arrayList6.get(size2);
/* 510 */                           Fragment fragment4 = dn0Var2.f7326b;
/* 512 */                           if (fragment4 != null) {
/* 515 */                               fragment4.mBeingSaved = false;
/* 517 */                               fragment4.setPopDirection(z7);
/* 520 */                               int i13 = c0086a.f1390f;
/* 522 */                               int i14 = 8194;
/* 524 */                               int i15 = 4097;
/* 526 */                               if (i13 != 4097) {
/* 528 */                                   if (i13 != 8194) {
/* 530 */                                       i14 = 4100;
/* 534 */                                       if (i13 != 8197) {
/* 536 */                                           i15 = 4099;
/* 538 */                                           if (i13 != 4099) {
/* 544 */                                               i14 = i13 != 4100 ? 0 : 8197;
                                                    } else {
/* 547 */                                               i14 = i15;
                                                    }
                                                }
                                            } else {
/* 547 */                                       i14 = i15;
                                            }
                                        }
/* 548 */                               fragment4.setNextTransition(i14);
/* 555 */                               fragment4.setSharedElementNames(c0086a.f1399o, c0086a.f1398n);
                                    }
                                    switch (dn0Var2.f7325a) {
                                        case 1:
/* 726 */                                   fragment4.setAnimations(dn0Var2.f7328d, dn0Var2.f7329e, dn0Var2.f7330f, dn0Var2.f7331g);
/* 729 */                                   z7 = true;
/* 730 */                                   abstractC0111w2.m697Y(fragment4, true);
/* 733 */                                   abstractC0111w2.m692T(fragment4);
                                            break;
                                        case 2:
                                        default:
/* 565 */                                   s80.m8429j(dn0Var2.f7325a, "Unknown cmd: ");
                                            break;
                                        case 3:
/* 710 */                                   fragment4.setAnimations(dn0Var2.f7328d, dn0Var2.f7329e, dn0Var2.f7330f, dn0Var2.f7331g);
/* 713 */                                   abstractC0111w2.m699a(fragment4);
/* 574 */                                   z7 = true;
                                            break;
                                        case 4:
/* 669 */                                   fragment4.setAnimations(dn0Var2.f7328d, dn0Var2.f7329e, dn0Var2.f7330f, dn0Var2.f7331g);
/* 672 */                                   abstractC0111w2.getClass();
/* 681 */                                   if (m674K(2)) {
/* 683 */                                       Objects.toString(fragment4);
                                            }
/* 688 */                                   if (fragment4.mHidden) {
/* 691 */                                       fragment4.mHidden = false;
/* 699 */                                       fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
                                            }
/* 574 */                                   z7 = true;
                                            break;
                                        case 5:
/* 628 */                                   fragment4.setAnimations(dn0Var2.f7328d, dn0Var2.f7329e, dn0Var2.f7330f, dn0Var2.f7331g);
/* 632 */                                   abstractC0111w2.m697Y(fragment4, true);
/* 641 */                                   if (m674K(2)) {
/* 643 */                                       Objects.toString(fragment4);
                                            }
/* 648 */                                   if (!fragment4.mHidden) {
/* 650 */                                       fragment4.mHidden = true;
/* 655 */                                       fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
/* 657 */                                       abstractC0111w2.m702b0(fragment4);
                                            }
/* 574 */                                   z7 = true;
                                            break;
                                        case 6:
/* 613 */                                   fragment4.setAnimations(dn0Var2.f7328d, dn0Var2.f7329e, dn0Var2.f7330f, dn0Var2.f7331g);
/* 616 */                                   abstractC0111w2.m703c(fragment4);
/* 574 */                                   z7 = true;
                                            break;
                                        case 7:
/* 594 */                                   fragment4.setAnimations(dn0Var2.f7328d, dn0Var2.f7329e, dn0Var2.f7330f, dn0Var2.f7331g);
/* 598 */                                   abstractC0111w2.m697Y(fragment4, true);
/* 601 */                                   abstractC0111w2.m710h(fragment4);
/* 574 */                                   z7 = true;
                                            break;
                                        case 8:
/* 582 */                                   abstractC0111w2.m700a0(null);
/* 574 */                                   z7 = true;
                                            break;
                                        case 9:
/* 577 */                                   abstractC0111w2.m700a0(fragment4);
/* 574 */                                   z7 = true;
                                            break;
                                        case 10:
/* 571 */                                   abstractC0111w2.m698Z(fragment4, dn0Var2.f7332h);
/* 574 */                                   z7 = true;
                                            break;
                                    }
/* 568 */                           return;
                                }
/* 993 */                       i11++;
                            }
/* 1005 */                  boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
/* 1009 */                  ArrayList<bt0> arrayList7 = this.f1503m;
/* 1011 */                  if (z6 && !arrayList7.isEmpty()) {
/* 1021 */                      LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
/* 1024 */                      Iterator it2 = arrayList.iterator();
/* 1032 */                      while (it2.hasNext()) {
/* 1044 */                          linkedHashSet.addAll(m673F((C0086a) it2.next()));
                                }
/* 1050 */                      if (this.f1498h == null) {
/* 1060 */                          for (bt0 bt0Var : arrayList7) {
/* 1076 */                              for (Fragment fragment5 : linkedHashSet) {
/* 1084 */                                  bt0Var.getClass();
                                        }
                                    }
/* 1096 */                          for (bt0 bt0Var2 : arrayList7) {
/* 1112 */                              for (Fragment fragment6 : linkedHashSet) {
/* 1120 */                                  bt0Var2.getClass();
                                        }
                                    }
                                }
                            }
/* 1125 */                  for (int i16 = i7; i16 < i2; i16++) {
/* 1131 */                      C0086a c0086a2 = (C0086a) arrayList.get(i16);
/* 1133 */                      if (zBooleanValue) {
/* 1145 */                          for (int size3 = c0086a2.f1385a.size() - 1; size3 >= 0; size3--) {
/* 1155 */                              Fragment fragment7 = ((dn0) c0086a2.f1385a.get(size3)).f7326b;
/* 1157 */                              if (fragment7 != null) {
/* 1163 */                                  m709g(fragment7).m741i();
                                        }
                                    }
                                } else {
/* 1171 */                          Iterator it3 = c0086a2.f1385a.iterator();
/* 1179 */                          while (it3.hasNext()) {
/* 1187 */                              Fragment fragment8 = ((dn0) it3.next()).f7326b;
/* 1189 */                              if (fragment8 != null) {
/* 1195 */                                  m709g(fragment8).m741i();
                                        }
                                    }
                                }
                            }
/* 1205 */                  m687O(this.f1511u, true);
/* 1220 */                  for (C0096h c0096h : m708f(arrayList, i7, i2)) {
/* 1228 */                      c0096h.f1443d = zBooleanValue;
/* 1230 */                      c0096h.m663k();
/* 1233 */                      c0096h.m659e();
                            }
/* 1237 */                  while (i7 < i2) {
/* 1243 */                      C0086a c0086a3 = (C0086a) arrayList.get(i7);
/* 1255 */                      if (((Boolean) arrayList2.get(i7)).booleanValue() && c0086a3.f1403s >= 0) {
/* 1261 */                          c0086a3.f1403s = -1;
                                }
/* 1263 */                      c0086a3.getClass();
/* 1266 */                      i7++;
                            }
/* 1269 */                  if (z6) {
/* 1276 */                      for (int i17 = 0; i17 < arrayList7.size(); i17++) {
/* 1284 */                          HSMainActivity hSMainActivity = ((bt0) arrayList7.get(i17)).f2593a;
/* 1286 */                          int i18 = HSMainActivity.f5313i;
/* 1288 */                          Fragment fragmentM2539f = hSMainActivity.m2539f();
/* 1292 */                          if (fragmentM2539f == null) {
/* 1296 */                              HSMainActivity.m2537d(hSMainActivity, false, true);
                                    } else if (fragmentM2539f instanceof ls0) {
/* 1306 */                              HSMainActivity.m2537d(hSMainActivity, false, false);
                                    } else if (fragmentM2539f instanceof xs0) {
/* 1314 */                              HSMainActivity.m2537d(hSMainActivity, true, false);
                                    }
                                }
/* 1320 */                      return;
                            }
/* 1320 */                  return;
                        }
/* 56 */                C0086a c0086a4 = (C0086a) arrayList.get(i8);
/* 64 */                boolean zBooleanValue2 = ((Boolean) arrayList2.get(i8)).booleanValue();
/* 68 */                ArrayList arrayList8 = this.f1488M;
/* 70 */                if (zBooleanValue2) {
/* 329 */                   z = z3;
/* 331 */                   i4 = i8;
/* 333 */                   z2 = z4;
/* 335 */                   int i19 = 1;
/* 336 */                   ArrayList arrayList9 = c0086a4.f1385a;
/* 342 */                   int size4 = arrayList9.size() - 1;
/* 343 */                   while (size4 >= 0) {
/* 349 */                       dn0 dn0Var3 = (dn0) arrayList9.get(size4);
/* 351 */                       int i20 = dn0Var3.f7325a;
/* 354 */                       if (i20 == i19) {
/* 380 */                           arrayList8.remove(dn0Var3.f7326b);
                                } else if (i20 != 3) {
                                    switch (i20) {
                                        case 6:
/* 374 */                                   arrayList8.add(dn0Var3.f7326b);
                                            break;
                                        case 7:
/* 380 */                                   arrayList8.remove(dn0Var3.f7326b);
                                            break;
                                        case 8:
/* 370 */                                   fragment = null;
                                            break;
                                        case 9:
/* 367 */                                   fragment = dn0Var3.f7326b;
                                            break;
                                        case 10:
/* 364 */                                   dn0Var3.f7333i = dn0Var3.f7332h;
                                            break;
                                    }
                                } else {
/* 374 */                           arrayList8.add(dn0Var3.f7326b);
                                }
/* 383 */                       size4--;
/* 385 */                       i19 = 1;
                            }
                        } else {
/* 72 */                    ArrayList arrayList10 = c0086a4.f1385a;
/* 74 */                    int i21 = 0;
/* 79 */                    while (i21 < arrayList10.size()) {
/* 85 */                        dn0 dn0Var4 = (dn0) arrayList10.get(i21);
/* 87 */                        boolean z8 = z3;
/* 89 */                        int i22 = dn0Var4.f7325a;
/* 91 */                        if (i22 != i9) {
/* 94 */                            if (i22 != 2) {
/* 97 */                                if (i22 == 3 || i22 == 6) {
/* 145 */                                   i8 = i8;
/* 149 */                                   arrayList8.remove(dn0Var4.f7326b);
/* 152 */                                   Fragment fragment9 = dn0Var4.f7326b;
/* 154 */                                   if (fragment9 == fragment) {
/* 163 */                                       arrayList10.add(i21, new dn0(fragment9, 9));
/* 166 */                                       i21++;
/* 170 */                                       fragment = null;
                                            }
/* 135 */                                   i5 = 1;
                                        } else if (i22 == 7) {
/* 140 */                                   i5 = 1;
                                        } else if (i22 != 8) {
/* 109 */                                   i8 = i8;
                                        } else {
/* 114 */                                   i8 = i8;
/* 122 */                                   arrayList10.add(i21, new dn0(9, fragment, 0));
/* 126 */                                   dn0Var4.f7327c = true;
/* 128 */                                   i21++;
/* 130 */                                   fragment = dn0Var4.f7326b;
                                        }
/* 135 */                               i5 = 1;
                                    } else {
/* 172 */                               i8 = i8;
/* 174 */                               Fragment fragment10 = dn0Var4.f7326b;
/* 176 */                               int i23 = fragment10.mContainerId;
/* 184 */                               int size5 = arrayList8.size() - 1;
/* 186 */                               boolean z9 = false;
/* 188 */                               while (size5 >= 0) {
/* 194 */                                   boolean z10 = z4;
/* 198 */                                   Fragment fragment11 = (Fragment) arrayList8.get(size5);
/* 200 */                                   int i24 = size5;
/* 204 */                                   if (fragment11.mContainerId != i23) {
/* 273 */                                       i23 = i23;
                                            } else if (fragment11 == fragment10) {
/* 208 */                                       i23 = i23;
/* 211 */                                       z9 = true;
                                            } else {
/* 214 */                                       if (fragment11 == fragment) {
/* 222 */                                           i6 = 0;
/* 226 */                                           arrayList10.add(i21, new dn0(9, fragment11, 0));
/* 229 */                                           i21++;
/* 231 */                                           fragment = null;
                                                } else {
/* 237 */                                           i6 = 0;
                                                }
/* 243 */                                       dn0 dn0Var5 = new dn0(3, fragment11, i6);
/* 248 */                                       dn0Var5.f7328d = dn0Var4.f7328d;
/* 252 */                                       dn0Var5.f7330f = dn0Var4.f7330f;
/* 256 */                                       dn0Var5.f7329e = dn0Var4.f7329e;
/* 260 */                                       dn0Var5.f7331g = dn0Var4.f7331g;
/* 262 */                                       arrayList10.add(i21, dn0Var5);
/* 265 */                                       arrayList8.remove(fragment11);
/* 269 */                                       i21++;
/* 270 */                                       fragment = fragment;
                                            }
/* 276 */                                   size5 = i24 - 1;
/* 278 */                                   i23 = i23;
/* 280 */                                   z4 = z10;
                                        }
/* 283 */                               z4 = z4;
/* 285 */                               i5 = 1;
/* 286 */                               if (z9) {
/* 288 */                                   arrayList10.remove(i21);
/* 291 */                                   i21--;
                                        } else {
/* 294 */                                   dn0Var4.f7325a = 1;
/* 296 */                                   dn0Var4.f7327c = true;
/* 298 */                                   arrayList8.add(fragment10);
                                        }
                                    }
/* 312 */                           i21 += i5;
/* 313 */                           i9 = i5;
/* 314 */                           z3 = z8;
/* 316 */                           i8 = i8;
/* 318 */                           z4 = z4;
                                } else {
/* 304 */                           i5 = i9;
                                }
/* 141 */                       z4 = z4;
/* 309 */                       arrayList8.add(dn0Var4.f7326b);
/* 312 */                       i21 += i5;
/* 313 */                       i9 = i5;
/* 314 */                       z3 = z8;
/* 316 */                       i8 = i8;
/* 318 */                       z4 = z4;
                            }
/* 322 */                   z = z3;
/* 324 */                   i4 = i8;
/* 326 */                   z2 = z4;
                        }
/* 396 */               z4 = z2 || c0086a4.f1391g;
/* 397 */               i8 = i4 + 1;
/* 399 */               z3 = z;
                    }
                }

                /* JADX INFO: renamed from: C */
                public final Fragment m679C(int i) {
/* 1 */             C0114z c0114z = this.f1493c;
/* 3 */             ArrayList arrayList = c0114z.f1529a;
/* 11 */            for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 17 */                Fragment fragment = (Fragment) arrayList.get(size);
/* 19 */                if (fragment != null && fragment.mFragmentId == i) {
/* 25 */                    return fragment;
                        }
                    }
/* 43 */            for (C0113y c0113y : c0114z.f1530b.values()) {
/* 51 */                if (c0113y != null) {
/* 53 */                    Fragment fragment2 = c0113y.f1526c;
/* 57 */                    if (fragment2.mFragmentId == i) {
/* 59 */                        return fragment2;
                            }
                        }
                    }
/* 60 */            return null;
                }

                /* JADX INFO: renamed from: D */
                public final Fragment m680D(String str) {
/* 1 */             C0114z c0114z = this.f1493c;
/* 3 */             ArrayList arrayList = c0114z.f1529a;
/* 11 */            for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 17 */                Fragment fragment = (Fragment) arrayList.get(size);
/* 19 */                if (fragment != null && str.equals(fragment.mTag)) {
/* 29 */                    return fragment;
                        }
                    }
/* 47 */            for (C0113y c0113y : c0114z.f1530b.values()) {
/* 55 */                if (c0113y != null) {
/* 57 */                    Fragment fragment2 = c0113y.f1526c;
/* 65 */                    if (str.equals(fragment2.mTag)) {
/* 67 */                        return fragment2;
                            }
                        }
                    }
/* 68 */            return null;
                }

                /* JADX INFO: renamed from: E */
                public final void m681E() {
/* 13 */            for (C0096h c0096h : m707e()) {
/* 23 */                if (c0096h.f1444e) {
/* 26 */                    c0096h.f1444e = false;
/* 28 */                    c0096h.m659e();
                        }
                    }
                }

                /* JADX INFO: renamed from: G */
                public final int m682G() {
/* 14 */            return this.f1494d.size() + (this.f1498h != null ? 1 : 0);
                }

                /* JADX INFO: renamed from: H */
                public final ViewGroup m683H(Fragment fragment) {
/* 1 */             ViewGroup viewGroup = fragment.mContainer;
/* 3 */             if (viewGroup != null) {
/* 5 */                 return viewGroup;
                    }
/* 8 */             if (fragment.mContainerId <= 0 || !this.f1513w.mo670c()) {
/* 34 */                return null;
                    }
/* 23 */            View viewMo669b = this.f1513w.mo669b(fragment.mContainerId);
/* 29 */            if (viewMo669b instanceof ViewGroup) {
/* 31 */                return (ViewGroup) viewMo669b;
                    }
/* 34 */            return null;
                }

                /* JADX INFO: renamed from: I */
                public final rm0 m684I() {
/* 1 */             Fragment fragment = this.f1514x;
                    return fragment != null ? fragment.mFragmentManager.m684I() : this.f1516z;
                }

                /* JADX INFO: renamed from: J */
                public final ec0 m685J() {
/* 1 */             Fragment fragment = this.f1514x;
                    return fragment != null ? fragment.mFragmentManager.m685J() : this.f1476A;
                }

                /* JADX INFO: renamed from: M */
                public final boolean m686M() {
/* 1 */             Fragment fragment = this.f1514x;
/* 4 */             if (fragment == null) {
/* 3 */                 return true;
                    }
                    return fragment.isAdded() && this.f1514x.getParentFragmentManager().m686M();
                }

                /* JADX INFO: renamed from: O */
                public final void m687O(int i, boolean z) {
                    om0 om0Var;
/* 3 */             if (this.f1512v == null && i != -1) {
/* 11 */                f42.m3656l("No activity");
/* 14 */                return;
                    }
/* 15 */            if (z || i != this.f1511u) {
/* 23 */                this.f1511u = i;
/* 25 */                C0114z c0114z = this.f1493c;
/* 27 */                HashMap map = c0114z.f1530b;
/* 31 */                Iterator it = c0114z.f1529a.iterator();
/* 39 */                while (it.hasNext()) {
/* 53 */                    C0113y c0113y = (C0113y) map.get(((Fragment) it.next()).mWho);
/* 55 */                    if (c0113y != null) {
/* 57 */                        c0113y.m741i();
                            }
                        }
/* 73 */                for (C0113y c0113y2 : map.values()) {
/* 81 */                    if (c0113y2 != null) {
/* 83 */                        c0113y2.m741i();
/* 86 */                        Fragment fragment = c0113y2.f1526c;
/* 90 */                        if (fragment.mRemoving && !fragment.isInBackStack()) {
/* 100 */                           if (fragment.mBeingSaved && !c0114z.f1531c.containsKey(fragment.mWho)) {
/* 118 */                               c0114z.m754i(fragment.mWho, c0113y2.m744l());
                                    }
/* 121 */                           c0114z.m753h(c0113y2);
                                }
                            }
                        }
/* 138 */               for (C0113y c0113y3 : c0114z.m749d()) {
/* 146 */                   Fragment fragment2 = c0113y3.f1526c;
/* 150 */                   if (fragment2.mDeferStart) {
/* 154 */                       if (this.f1492b) {
/* 157 */                           this.f1485J = true;
                                } else {
/* 160 */                           fragment2.mDeferStart = false;
/* 162 */                           c0113y3.m741i();
                                }
                            }
                        }
/* 168 */               if (this.f1481F && (om0Var = this.f1512v) != null && this.f1511u == 7) {
/* 183 */                   ((C0105q) om0Var).f1468e.invalidateMenu();
/* 186 */                   this.f1481F = false;
                        }
                    }
                }

                /* JADX INFO: renamed from: P */
                public final void m688P() {
/* 3 */             if (this.f1512v == null) {
/* 43 */                return;
                    }
/* 7 */             this.f1482G = false;
/* 9 */             this.f1483H = false;
/* 13 */            this.f1489N.f1523i = false;
/* 29 */            for (Fragment fragment : this.f1493c.m751f()) {
/* 37 */                if (fragment != null) {
/* 39 */                    fragment.noteStateNotSaved();
                        }
                    }
                }

                /* JADX INFO: renamed from: Q */
                public final boolean m689Q() {
/* 3 */             return m690R(-1, 0);
                }

                /* JADX INFO: renamed from: R */
                public final boolean m690R(int i, int i2) {
/* 2 */             m728z(false);
/* 6 */             m727y(true);
/* 9 */             Fragment fragment = this.f1515y;
/* 11 */            if (fragment != null && i < 0 && fragment.getChildFragmentManager().m689Q()) {
/* 5 */                 return true;
                    }
/* 30 */            boolean zM691S = m691S(this.f1486K, this.f1487L, i, i2);
/* 34 */            if (zM691S) {
/* 36 */                this.f1492b = true;
                        try {
/* 42 */                    m693U(this.f1486K, this.f1487L);
/* 45 */                    m705d();
                        } catch (Throwable th) {
/* 50 */                    m705d();
/* 53 */                    throw th;
                        }
                    }
/* 54 */            m706d0();
/* 57 */            boolean z = this.f1485J;
/* 59 */            C0114z c0114z = this.f1493c;
/* 61 */            if (z) {
/* 63 */                this.f1485J = false;
/* 77 */                for (C0113y c0113y : c0114z.m749d()) {
/* 85 */                    Fragment fragment2 = c0113y.f1526c;
/* 89 */                    if (fragment2.mDeferStart) {
/* 93 */                        if (this.f1492b) {
/* 95 */                            this.f1485J = true;
                                } else {
/* 98 */                            fragment2.mDeferStart = false;
/* 100 */                           c0113y.m741i();
                                }
                            }
                        }
                    }
/* 115 */           c0114z.f1530b.values().removeAll(Collections.singleton(null));
/* 118 */           return zM691S;
                }

                /* JADX INFO: renamed from: S */
                public final boolean m691S(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
/* 8 */             boolean z = (i2 & 1) != 0;
/* 15 */            int size = -1;
/* 16 */            if (!this.f1494d.isEmpty()) {
/* 19 */                if (i < 0) {
/* 31 */                    size = z ? 0 : this.f1494d.size() - 1;
                        } else {
/* 40 */                    int size2 = this.f1494d.size() - 1;
/* 41 */                    while (size2 >= 0) {
/* 49 */                        C0086a c0086a = (C0086a) this.f1494d.get(size2);
/* 51 */                        if (i >= 0 && i == c0086a.f1403s) {
                                    break;
                                }
/* 58 */                        size2--;
                            }
/* 61 */                    if (size2 < 0) {
/* 63 */                        size = size2;
                            } else if (z) {
/* 67 */                        size = size2;
/* 68 */                        while (size > 0) {
/* 78 */                            C0086a c0086a2 = (C0086a) this.f1494d.get(size - 1);
/* 80 */                            if (i < 0 || i != c0086a2.f1403s) {
                                        break;
                                    }
/* 86 */                            size--;
                                }
                            } else if (size2 != this.f1494d.size() - 1) {
/* 99 */                        size = size2 + 1;
                            }
                        }
                    }
/* 101 */           if (size < 0) {
/* 3 */                 return false;
                    }
/* 111 */           for (int size3 = this.f1494d.size() - 1; size3 >= size; size3--) {
/* 121 */               arrayList.add((C0086a) this.f1494d.remove(size3));
/* 126 */               arrayList2.add(Boolean.TRUE);
                    }
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: T */
                public final void m692T(Fragment fragment) {
/* 6 */             if (m674K(2)) {
/* 8 */                 Objects.toString(fragment);
                    }
/* 11 */            boolean zIsInBackStack = fragment.isInBackStack();
/* 17 */            if (fragment.mDetached && zIsInBackStack) {
/* 22 */                return;
                    }
/* 23 */            C0114z c0114z = this.f1493c;
                    synchronized (c0114z.f1529a) {
/* 30 */                c0114z.f1529a.remove(fragment);
                    }
/* 35 */            fragment.mAdded = false;
/* 42 */            if (m675L(fragment)) {
/* 44 */                this.f1481F = true;
                    }
/* 46 */            fragment.mRemoving = true;
/* 48 */            m702b0(fragment);
                }

                /* JADX INFO: renamed from: U */
                public final void m693U(ArrayList arrayList, ArrayList arrayList2) {
/* 5 */             if (arrayList.isEmpty()) {
/* 95 */                return;
                    }
/* 16 */            if (arrayList.size() != arrayList2.size()) {
/* 98 */                f42.m3656l("Internal error with the back stack records");
/* 101 */               return;
                    }
/* 18 */            int size = arrayList.size();
/* 22 */            int i = 0;
/* 23 */            int i2 = 0;
/* 24 */            while (i < size) {
/* 34 */                if (!((C0086a) arrayList.get(i)).f1400p) {
/* 36 */                    if (i2 != i) {
/* 38 */                        m678B(arrayList, arrayList2, i2, i);
                            }
/* 41 */                    i2 = i + 1;
/* 53 */                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
/* 55 */                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0086a) arrayList.get(i2)).f1400p) {
/* 79 */                            i2++;
                                }
                            }
/* 82 */                    m678B(arrayList, arrayList2, i, i2);
/* 85 */                    i = i2 - 1;
                        }
/* 87 */                i++;
                    }
/* 90 */            if (i2 != size) {
/* 92 */                m678B(arrayList, arrayList2, i2, size);
                    }
                }

                /* JADX INFO: renamed from: V */
                public final void m694V(Bundle bundle) {
                    wc0 wc0Var;
                    int i;
                    int i2;
                    C0113y c0113y;
                    Bundle bundle2;
                    Bundle bundle3;
/* 17 */            for (String str : bundle.keySet()) {
/* 31 */                if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
/* 47 */                    bundle3.setClassLoader(this.f1512v.f14817b.getClassLoader());
/* 57 */                    this.f1502l.put(str.substring(7), bundle3);
                        }
                    }
/* 63 */            HashMap map = new HashMap();
/* 78 */            for (String str2 : bundle.keySet()) {
/* 92 */                if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
/* 108 */                   bundle2.setClassLoader(this.f1512v.f14817b.getClassLoader());
/* 117 */                   map.put(str2.substring(9), bundle2);
                        }
                    }
/* 121 */           C0114z c0114z = this.f1493c;
/* 123 */           HashMap map2 = c0114z.f1531c;
/* 125 */           HashMap map3 = c0114z.f1530b;
/* 127 */           map2.clear();
/* 130 */           map2.putAll(map);
/* 139 */           FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
/* 141 */           if (fragmentManagerState == null) {
/* 143 */               return;
                    }
/* 144 */           map3.clear();
/* 149 */           Iterator it = fragmentManagerState.f1359a.iterator();
                    while (true) {
/* 153 */               boolean zHasNext = it.hasNext();
/* 157 */               wc0Var = this.f1504n;
/* 159 */               i = 2;
/* 160 */               if (!zHasNext) {
                            break;
                        }
/* 169 */               Bundle bundleM754i = c0114z.m754i((String) it.next(), null);
/* 173 */               if (bundleM754i != null) {
/* 191 */                   Fragment fragment = (Fragment) this.f1489N.f1518d.get(((FragmentState) bundleM754i.getParcelable("state")).f1373b);
/* 193 */                   if (fragment != null) {
/* 199 */                       if (m674K(2)) {
/* 201 */                           fragment.toString();
                                }
/* 206 */                       c0113y = new C0113y(wc0Var, c0114z, fragment, bundleM754i);
                            } else {
/* 228 */                       c0113y = new C0113y(this.f1504n, this.f1493c, this.f1512v.f14817b.getClassLoader(), m684I(), bundleM754i);
                            }
/* 232 */                   Fragment fragment2 = c0113y.f1526c;
/* 234 */                   fragment2.mSavedFragmentState = bundleM754i;
/* 236 */                   fragment2.mFragmentManager = this;
/* 242 */                   if (m674K(2)) {
/* 244 */                       fragment2.toString();
                            }
/* 255 */                   c0113y.m742j(this.f1512v.f14817b.getClassLoader());
/* 258 */                   c0114z.m752g(c0113y);
/* 263 */                   c0113y.f1528e = this.f1511u;
                        }
                    }
/* 266 */           C0112x c0112x = this.f1489N;
/* 268 */           c0112x.getClass();
/* 291 */           for (Fragment fragment3 : new ArrayList(c0112x.f1518d.values())) {
/* 305 */               if (map3.get(fragment3.mWho) == null) {
/* 312 */                   if (m674K(2)) {
/* 314 */                       fragment3.toString();
/* 319 */                       Objects.toString(fragmentManagerState.f1359a);
                            }
/* 324 */                   this.f1489N.m732e(fragment3);
/* 327 */                   fragment3.mFragmentManager = this;
/* 331 */                   C0113y c0113y2 = new C0113y(wc0Var, c0114z, fragment3);
/* 334 */                   c0113y2.f1528e = 1;
/* 336 */                   c0113y2.m741i();
/* 339 */                   fragment3.mRemoving = true;
/* 341 */                   c0113y2.m741i();
                        }
                    }
/* 345 */           ArrayList<String> arrayList = fragmentManagerState.f1360b;
/* 349 */           c0114z.f1529a.clear();
/* 352 */           if (arrayList != null) {
/* 362 */               for (String str3 : arrayList) {
/* 370 */                   Fragment fragmentM747b = c0114z.m747b(str3);
/* 374 */                   if (fragmentM747b == null) {
/* 397 */                       f42.m3656l(fm0.m3784j("No instantiated fragment for (", str3, ")"));
/* 400 */                       return;
                            } else {
/* 380 */                       if (m674K(2)) {
/* 382 */                           fragmentM747b.toString();
                                }
/* 385 */                       c0114z.m746a(fragmentM747b);
                            }
                        }
                    }
/* 403 */           if (fragmentManagerState.f1361c != null) {
/* 413 */               this.f1494d = new ArrayList(fragmentManagerState.f1361c.length);
/* 415 */               int i3 = 0;
                        while (true) {
/* 416 */                   BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f1361c;
/* 419 */                   if (i3 >= backStackRecordStateArr.length) {
                                break;
                            }
/* 421 */                   BackStackRecordState backStackRecordState = backStackRecordStateArr[i3];
/* 423 */                   ArrayList arrayList2 = backStackRecordState.f1342b;
/* 427 */                   C0086a c0086a = new C0086a(this);
/* 430 */                   int[] iArr = backStackRecordState.f1341a;
/* 432 */                   int i4 = 0;
/* 433 */                   int i5 = 0;
/* 435 */                   while (i4 < iArr.length) {
/* 439 */                       dn0 dn0Var = new dn0();
/* 442 */                       int i6 = i4 + 1;
/* 446 */                       dn0Var.f7325a = iArr[i4];
/* 452 */                       if (m674K(i)) {
/* 454 */                           Objects.toString(c0086a);
/* 457 */                           int i7 = iArr[i6];
                                }
/* 463 */                       int i8 = i;
/* 471 */                       dn0Var.f7332h = u61.values()[backStackRecordState.f1343c[i5]];
/* 483 */                       dn0Var.f7333i = u61.values()[backStackRecordState.f1344d[i5]];
/* 485 */                       int i9 = i4 + 2;
/* 494 */                       dn0Var.f7327c = iArr[i6] != 0;
/* 498 */                       int i10 = iArr[i9];
/* 500 */                       dn0Var.f7328d = i10;
/* 504 */                       int i11 = iArr[i4 + 3];
/* 506 */                       dn0Var.f7329e = i11;
/* 508 */                       int i12 = i4 + 5;
/* 510 */                       int i13 = iArr[i4 + 4];
/* 512 */                       dn0Var.f7330f = i13;
/* 514 */                       i4 += 6;
/* 516 */                       int i14 = iArr[i12];
/* 518 */                       dn0Var.f7331g = i14;
/* 520 */                       c0086a.f1386b = i10;
/* 522 */                       c0086a.f1387c = i11;
/* 524 */                       c0086a.f1388d = i13;
/* 526 */                       c0086a.f1389e = i14;
/* 528 */                       c0086a.m636b(dn0Var);
/* 531 */                       i5++;
/* 533 */                       i = i8;
                            }
/* 536 */                   int i15 = i;
/* 540 */                   c0086a.f1390f = backStackRecordState.f1345e;
/* 544 */                   c0086a.f1393i = backStackRecordState.f1346f;
/* 546 */                   c0086a.f1391g = true;
/* 550 */                   c0086a.f1394j = backStackRecordState.f1348v;
/* 554 */                   c0086a.f1395k = backStackRecordState.f1349w;
/* 558 */                   c0086a.f1396l = backStackRecordState.f1336U;
/* 562 */                   c0086a.f1397m = backStackRecordState.f1337V;
/* 566 */                   c0086a.f1398n = backStackRecordState.f1338W;
/* 570 */                   c0086a.f1399o = backStackRecordState.f1339X;
/* 574 */                   c0086a.f1400p = backStackRecordState.f1340Y;
/* 578 */                   c0086a.f1403s = backStackRecordState.f1347i;
/* 585 */                   for (int i16 = 0; i16 < arrayList2.size(); i16++) {
/* 591 */                       String str4 = (String) arrayList2.get(i16);
/* 593 */                       if (str4 != null) {
/* 607 */                           ((dn0) c0086a.f1385a.get(i16)).f7326b = c0114z.m747b(str4);
                                }
                            }
/* 612 */                   c0086a.m637c(1);
/* 619 */                   if (m674K(i15)) {
/* 621 */                       c0086a.toString();
/* 631 */                       PrintWriter printWriter = new PrintWriter(new ga1());
/* 637 */                       c0086a.m640f("  ", printWriter, false);
/* 640 */                       printWriter.close();
                            }
/* 647 */                   this.f1494d.add(c0086a);
/* 650 */                   i3++;
/* 652 */                   i = i15;
                        }
/* 656 */               i2 = 0;
                    } else {
/* 658 */               i2 = 0;
/* 664 */               this.f1494d = new ArrayList();
                    }
/* 670 */           this.f1500j.set(fragmentManagerState.f1362d);
/* 673 */           String str5 = fragmentManagerState.f1363e;
/* 675 */           if (str5 != null) {
/* 677 */               Fragment fragmentM747b2 = c0114z.m747b(str5);
/* 681 */               this.f1515y = fragmentM747b2;
/* 683 */               m720r(fragmentM747b2);
                    }
/* 686 */           ArrayList arrayList3 = fragmentManagerState.f1364f;
/* 688 */           if (arrayList3 != null) {
/* 695 */               for (int i17 = i2; i17 < arrayList3.size(); i17++) {
/* 713 */                   this.f1501k.put((String) arrayList3.get(i17), (BackStackState) fragmentManagerState.f1365i.get(i17));
                        }
                    }
/* 726 */           this.f1480E = new ArrayDeque(fragmentManagerState.f1366v);
                }

                /* JADX INFO: renamed from: W */
                public final Bundle m695W() {
                    ArrayList arrayList;
                    BackStackRecordState[] backStackRecordStateArr;
/* 3 */             Bundle bundle = new Bundle();
/* 6 */             m681E();
/* 9 */             m725w();
/* 13 */            m728z(true);
/* 16 */            this.f1482G = true;
/* 20 */            this.f1489N.f1523i = true;
/* 22 */            C0114z c0114z = this.f1493c;
/* 24 */            c0114z.getClass();
/* 29 */            HashMap map = c0114z.f1530b;
/* 35 */            ArrayList arrayList2 = new ArrayList(map.size());
/* 51 */            for (C0113y c0113y : map.values()) {
/* 59 */                if (c0113y != null) {
/* 61 */                    Fragment fragment = c0113y.f1526c;
/* 69 */                    c0114z.m754i(fragment.mWho, c0113y.m744l());
/* 74 */                    arrayList2.add(fragment.mWho);
/* 81 */                    if (m674K(2)) {
/* 83 */                        fragment.toString();
/* 88 */                        Objects.toString(fragment.mSavedFragmentState);
                            }
                        }
                    }
/* 94 */            HashMap map2 = this.f1493c.f1531c;
/* 100 */           if (!map2.isEmpty()) {
/* 104 */               C0114z c0114z2 = this.f1493c;
                        synchronized (c0114z2.f1529a) {
                            try {
/* 116 */                       if (c0114z2.f1529a.isEmpty()) {
/* 119 */                           arrayList = null;
                                } else {
/* 132 */                           arrayList = new ArrayList(c0114z2.f1529a.size());
/* 145 */                           for (Fragment fragment2 : c0114z2.f1529a) {
/* 155 */                               arrayList.add(fragment2.mWho);
/* 162 */                               if (m674K(2)) {
/* 164 */                                   fragment2.toString();
                                        }
                                    }
                                }
                            } catch (Throwable th) {
/* 369 */                       throw th;
                            }
                        }
/* 171 */               int size = this.f1494d.size();
/* 175 */               if (size > 0) {
/* 177 */                   backStackRecordStateArr = new BackStackRecordState[size];
/* 180 */                   for (int i = 0; i < size; i++) {
/* 195 */                       backStackRecordStateArr[i] = new BackStackRecordState((C0086a) this.f1494d.get(i));
/* 201 */                       if (m674K(2)) {
/* 209 */                           Objects.toString(this.f1494d.get(i));
                                }
                            }
                        } else {
/* 215 */                   backStackRecordStateArr = null;
                        }
/* 218 */               FragmentManagerState fragmentManagerState = new FragmentManagerState();
/* 221 */               fragmentManagerState.f1363e = null;
/* 225 */               ArrayList arrayList3 = new ArrayList();
/* 228 */               fragmentManagerState.f1364f = arrayList3;
/* 232 */               ArrayList arrayList4 = new ArrayList();
/* 235 */               fragmentManagerState.f1365i = arrayList4;
/* 237 */               fragmentManagerState.f1359a = arrayList2;
/* 239 */               fragmentManagerState.f1360b = arrayList;
/* 241 */               fragmentManagerState.f1361c = backStackRecordStateArr;
/* 249 */               fragmentManagerState.f1362d = this.f1500j.get();
/* 251 */               Fragment fragment3 = this.f1515y;
/* 253 */               if (fragment3 != null) {
/* 257 */                   fragmentManagerState.f1363e = fragment3.mWho;
                        }
/* 265 */               arrayList3.addAll(this.f1501k.keySet());
/* 274 */               arrayList4.addAll(this.f1501k.values());
/* 284 */               fragmentManagerState.f1366v = new ArrayList(this.f1480E);
/* 288 */               bundle.putParcelable("state", fragmentManagerState);
/* 305 */               for (String str : this.f1502l.keySet()) {
/* 327 */                   bundle.putBundle(AbstractC0886en.m3507k("result_", str), (Bundle) this.f1502l.get(str));
                        }
/* 343 */               for (String str2 : map2.keySet()) {
/* 363 */                   bundle.putBundle(AbstractC0886en.m3507k("fragment_", str2), (Bundle) map2.get(str2));
                        }
                    }
/* 367 */           return bundle;
                }

                /* JADX INFO: renamed from: X */
                public final void m696X() {
                    synchronized (this.f1491a) {
                        try {
/* 11 */                    if (this.f1491a.size() == 1) {
/* 19 */                        this.f1512v.f14818c.removeCallbacks(this.f1490O);
/* 28 */                        this.f1512v.f14818c.post(this.f1490O);
/* 31 */                        m706d0();
                            }
                        } catch (Throwable th) {
/* 40 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: Y */
                public final void m697Y(Fragment fragment, boolean z) {
/* 1 */             ViewGroup viewGroupM683H = m683H(fragment);
/* 5 */             if (viewGroupM683H == null || !(viewGroupM683H instanceof FragmentContainerView)) {
/* 18 */                return;
                    }
/* 15 */            ((FragmentContainerView) viewGroupM683H).setDrawDisappearingViewsLast(!z);
                }

                /* JADX INFO: renamed from: Z */
                public final void m698Z(Fragment fragment, u61 u61Var) {
/* 13 */            if (fragment.equals(this.f1493c.m747b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
/* 23 */                fragment.mMaxState = u61Var;
                    } else {
/* 30 */                ds0.m3196m("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
                    }
                }

                /* JADX INFO: renamed from: a */
                public final C0113y m699a(Fragment fragment) {
/* 1 */             String str = fragment.mPreviousWho;
/* 3 */             if (str != null) {
/* 5 */                 bn0.m1398d(fragment, str);
                    }
/* 13 */            if (m674K(2)) {
/* 15 */                fragment.toString();
                    }
/* 18 */            C0113y c0113yM709g = m709g(fragment);
/* 22 */            fragment.mFragmentManager = this;
/* 24 */            C0114z c0114z = this.f1493c;
/* 26 */            c0114z.m752g(c0113yM709g);
/* 31 */            if (!fragment.mDetached) {
/* 33 */                c0114z.m746a(fragment);
/* 37 */                fragment.mRemoving = false;
/* 41 */                if (fragment.mView == null) {
/* 43 */                    fragment.mHiddenChanged = false;
                        }
/* 49 */                if (m675L(fragment)) {
/* 52 */                    this.f1481F = true;
                        }
                    }
/* 54 */            return c0113yM709g;
                }

                /* JADX INFO: renamed from: a0 */
                public final void m700a0(Fragment fragment) {
/* 1 */             if (fragment != null) {
/* 15 */                if (!fragment.equals(this.f1493c.m747b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
/* 30 */                    ds0.m3196m("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
/* 33 */                    return;
                        }
                    }
/* 34 */            Fragment fragment2 = this.f1515y;
/* 36 */            this.f1515y = fragment;
/* 38 */            m720r(fragment2);
/* 43 */            m720r(this.f1515y);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: b */
                public final void m701b(om0 om0Var, mm0 mm0Var, Fragment fragment) {
                    g71 g71Var;
/* 3 */             if (this.f1512v != null) {
/* 377 */               f42.m3656l("Already attached");
/* 380 */               return;
                    }
/* 5 */             this.f1512v = om0Var;
/* 7 */             this.f1513w = mm0Var;
/* 9 */             this.f1514x = fragment;
/* 11 */            CopyOnWriteArrayList copyOnWriteArrayList = this.f1505o;
/* 13 */            if (fragment != null) {
/* 20 */                copyOnWriteArrayList.add(new sm0(fragment));
                    } else if (om0Var instanceof xm0) {
/* 31 */                copyOnWriteArrayList.add((xm0) om0Var);
                    }
/* 36 */            if (this.f1514x != null) {
/* 38 */                m706d0();
                    }
/* 43 */            if (om0Var instanceof tp1) {
/* 46 */                tp1 tp1Var = (tp1) om0Var;
/* 48 */                sp1 onBackPressedDispatcher = tp1Var.getOnBackPressedDispatcher();
/* 52 */                this.f1497g = onBackPressedDispatcher;
/* 54 */                if (fragment != null) {
                            g71Var = tp1Var;
/* 56 */                    g71Var = fragment;
                        }
                        g71Var = tp1Var;
/* 59 */                onBackPressedDispatcher.m8601a(g71Var, this.f1499i);
                    }
/* 62 */            int i = 0;
/* 63 */            if (fragment != null) {
/* 67 */                C0112x c0112x = fragment.mFragmentManager.f1489N;
/* 69 */                HashMap map = c0112x.f1519e;
/* 77 */                C0112x c0112x2 = (C0112x) map.get(fragment.mWho);
/* 79 */                if (c0112x2 == null) {
/* 85 */                    c0112x2 = new C0112x(c0112x.f1521g);
/* 90 */                    map.put(fragment.mWho, c0112x2);
                        }
/* 93 */                this.f1489N = c0112x2;
                    } else if (om0Var instanceof u33) {
/* 110 */               ac1 ac1Var = new ac1(((u33) om0Var).getViewModelStore(), C0112x.f1517j);
/* 115 */               String canonicalName = C0112x.class.getCanonicalName();
/* 119 */               if (canonicalName == null) {
/* 138 */                   C1951n4.m6859j("Local and anonymous classes can not be ViewModels");
/* 141 */                   return;
                        }
/* 133 */               this.f1489N = (C0112x) ac1Var.m182l(C0112x.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
                    } else {
/* 147 */               this.f1489N = new C0112x(false);
                    }
/* 149 */           C0112x c0112x3 = this.f1489N;
/* 153 */           int i2 = 1;
/* 164 */           c0112x3.f1523i = this.f1482G || this.f1483H;
/* 168 */           this.f1493c.f1532d = c0112x3;
/* 170 */           Object obj = this.f1512v;
/* 174 */           if ((obj instanceof z62) && fragment == null) {
/* 180 */               x62 savedStateRegistry = ((z62) obj).getSavedStateRegistry();
/* 191 */               savedStateRegistry.m9724c("android:support:fragments", new C2234tx(this, 1));
/* 194 */               Bundle bundleM9722a = savedStateRegistry.m9722a("android:support:fragments");
/* 198 */               if (bundleM9722a != null) {
/* 200 */                   m694V(bundleM9722a);
                        }
                    }
/* 203 */           Object obj2 = this.f1512v;
/* 207 */           if (obj2 instanceof InterfaceC1876l3) {
/* 211 */               AbstractC1816k3 activityResultRegistry = ((InterfaceC1876l3) obj2).getActivityResultRegistry();
/* 235 */               String strConcat = "FragmentManager:".concat(fragment != null ? fm0.m3789o(new StringBuilder(), fragment.mWho, ":") : HttpUrl.FRAGMENT_ENCODE_SET);
/* 259 */               this.f1477B = activityResultRegistry.m5939c(strConcat.concat("StartActivityForResult"), new C0866e3(i2), new C0108t(this, i2));
/* 283 */               this.f1478C = activityResultRegistry.m5939c(strConcat.concat("StartIntentSenderForResult"), new C0866e3(3), new C0108t(this, 2));
/* 305 */               this.f1479D = activityResultRegistry.m5939c(strConcat.concat("RequestPermissions"), new C0866e3(i), new C0108t(this, i));
                    }
/* 307 */           Object obj3 = this.f1512v;
/* 311 */           if (obj3 instanceof vp1) {
/* 317 */               ((vp1) obj3).addOnConfigurationChangedListener(this.f1506p);
                    }
/* 320 */           Object obj4 = this.f1512v;
/* 324 */           if (obj4 instanceof eq1) {
/* 330 */               ((eq1) obj4).addOnTrimMemoryListener(this.f1507q);
                    }
/* 333 */           Object obj5 = this.f1512v;
/* 337 */           if (obj5 instanceof aq1) {
/* 343 */               ((aq1) obj5).addOnMultiWindowModeChangedListener(this.f1508r);
                    }
/* 346 */           Object obj6 = this.f1512v;
/* 350 */           if (obj6 instanceof bq1) {
/* 356 */               ((bq1) obj6).addOnPictureInPictureModeChangedListener(this.f1509s);
                    }
/* 359 */           Object obj7 = this.f1512v;
/* 363 */           if ((obj7 instanceof lg1) && fragment == null) {
/* 371 */               ((lg1) obj7).addMenuProvider(this.f1510t);
                    }
                }

                /* JADX INFO: renamed from: b0 */
                public final void m702b0(Fragment fragment) {
/* 1 */             ViewGroup viewGroupM683H = m683H(fragment);
/* 5 */             if (viewGroupM683H != null) {
/* 26 */                if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
/* 34 */                    if (viewGroupM683H.getTag(R$id.visible_removing_fragment_view_tag) == null) {
/* 38 */                        viewGroupM683H.setTag(R$id.visible_removing_fragment_view_tag, fragment);
                            }
/* 53 */                    ((Fragment) viewGroupM683H.getTag(R$id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m703c(Fragment fragment) {
/* 6 */             if (m674K(2)) {
/* 8 */                 Objects.toString(fragment);
                    }
/* 13 */            if (fragment.mDetached) {
/* 16 */                fragment.mDetached = false;
/* 20 */                if (fragment.mAdded) {
/* 45 */                    return;
                        }
/* 24 */                this.f1493c.m746a(fragment);
/* 31 */                if (m674K(2)) {
/* 33 */                    fragment.toString();
                        }
/* 40 */                if (m675L(fragment)) {
/* 43 */                    this.f1481F = true;
                        }
                    }
                }

                /* JADX INFO: renamed from: c0 */
                public final void m704c0(IllegalStateException illegalStateException) {
/* 7 */             AbstractC1245n0.m4876d("FragmentManager", illegalStateException.getMessage());
/* 12 */            AbstractC1245n0.m4876d("FragmentManager", "Activity state:");
/* 22 */            PrintWriter printWriter = new PrintWriter(new ga1());
/* 25 */            om0 om0Var = this.f1512v;
/* 33 */            if (om0Var == null) {
                        try {
/* 52 */                    m724v("  ", null, printWriter, new String[0]);
/* 60 */                    throw illegalStateException;
                        } catch (Exception e) {
/* 57 */                    AbstractC1245n0.m4877e("FragmentManager", "Failed dumping state", e);
/* 60 */                    throw illegalStateException;
                        }
                    }
                    try {
/* 41 */                ((C0105q) om0Var).f1468e.dump("  ", null, printWriter, new String[0]);
/* 60 */                throw illegalStateException;
                    } catch (Exception e2) {
/* 46 */                AbstractC1245n0.m4877e("FragmentManager", "Failed dumping state", e2);
/* 60 */                throw illegalStateException;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m705d() {
/* 2 */             this.f1492b = false;
/* 6 */             this.f1487L.clear();
/* 11 */            this.f1486K.clear();
                }

                /* JADX INFO: renamed from: d0 */
                public final void m706d0() {
                    synchronized (this.f1491a) {
                        try {
/* 12 */                    if (!this.f1491a.isEmpty()) {
/* 16 */                        this.f1499i.setEnabled(true);
/* 23 */                        if (m674K(3)) {
/* 25 */                            toString();
                                }
                            } else {
/* 38 */                        boolean z = m682G() > 0 && m676N(this.f1514x);
/* 54 */                        if (m674K(3)) {
/* 56 */                            toString();
                                }
/* 61 */                        this.f1499i.setEnabled(z);
                            }
                        } catch (Throwable th) {
/* 66 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public final HashSet m707e() {
                    C0096h c0096h;
/* 3 */             HashSet hashSet = new HashSet();
/* 12 */            Iterator it = this.f1493c.m749d().iterator();
/* 20 */            while (it.hasNext()) {
/* 30 */                ViewGroup viewGroup = ((C0113y) it.next()).f1526c.mContainer;
/* 32 */                if (viewGroup != null) {
/* 38 */                    m685J().getClass();
/* 43 */                    Object tag = viewGroup.getTag(R$id.special_effects_controller_view_tag);
/* 49 */                    if (tag instanceof C0096h) {
/* 51 */                        c0096h = (C0096h) tag;
                            } else {
/* 56 */                        c0096h = new C0096h(viewGroup);
/* 61 */                        viewGroup.setTag(R$id.special_effects_controller_view_tag, c0096h);
                            }
/* 64 */                    hashSet.add(c0096h);
                        }
                    }
/* 68 */            return hashSet;
                }

                /* JADX INFO: renamed from: f */
                public final HashSet m708f(ArrayList arrayList, int i, int i2) {
                    ViewGroup viewGroup;
/* 3 */             HashSet hashSet = new HashSet();
/* 6 */             while (i < i2) {
/* 16 */                Iterator it = ((C0086a) arrayList.get(i)).f1385a.iterator();
/* 24 */                while (it.hasNext()) {
/* 32 */                    Fragment fragment = ((dn0) it.next()).f7326b;
/* 34 */                    if (fragment != null && (viewGroup = fragment.mContainer) != null) {
/* 44 */                        hashSet.add(C0096h.m654j(viewGroup, this));
                            }
                        }
/* 48 */                i++;
                    }
/* 51 */            return hashSet;
                }

                /* JADX INFO: renamed from: g */
                public final C0113y m709g(Fragment fragment) {
/* 1 */             String str = fragment.mWho;
/* 3 */             C0114z c0114z = this.f1493c;
/* 11 */            C0113y c0113y = (C0113y) c0114z.f1530b.get(str);
/* 13 */            if (c0113y != null) {
/* 15 */                return c0113y;
                    }
/* 20 */            C0113y c0113y2 = new C0113y(this.f1504n, c0114z, fragment);
/* 31 */            c0113y2.m742j(this.f1512v.f14817b.getClassLoader());
/* 36 */            c0113y2.f1528e = this.f1511u;
/* 38 */            return c0113y2;
                }

                /* JADX INFO: renamed from: h */
                public final void m710h(Fragment fragment) {
/* 6 */             if (m674K(2)) {
/* 8 */                 Objects.toString(fragment);
                    }
/* 13 */            if (fragment.mDetached) {
/* 60 */                return;
                    }
/* 16 */            fragment.mDetached = true;
/* 20 */            if (fragment.mAdded) {
/* 26 */                if (m674K(2)) {
/* 28 */                    fragment.toString();
                        }
/* 31 */                C0114z c0114z = this.f1493c;
                        synchronized (c0114z.f1529a) {
/* 38 */                    c0114z.f1529a.remove(fragment);
                        }
/* 43 */                fragment.mAdded = false;
/* 49 */                if (m675L(fragment)) {
/* 51 */                    this.f1481F = true;
                        }
/* 53 */                m702b0(fragment);
                    }
                }

                /* JADX INFO: renamed from: i */
                public final void m711i(boolean z, Configuration configuration) {
/* 1 */             if (z && (this.f1512v instanceof vp1)) {
/* 17 */                m704c0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
/* 21 */                throw null;
                    }
/* 36 */            for (Fragment fragment : this.f1493c.m751f()) {
/* 44 */                if (fragment != null) {
/* 46 */                    fragment.performConfigurationChanged(configuration);
/* 49 */                    if (z) {
/* 54 */                        fragment.mChildFragmentManager.m711i(true, configuration);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: j */
                public final boolean m712j(MenuItem menuItem) {
/* 5 */             if (this.f1511u < 1) {
/* 3 */                 return false;
                    }
/* 22 */            for (Fragment fragment : this.f1493c.m751f()) {
/* 30 */                if (fragment != null && fragment.performContextItemSelected(menuItem)) {
/* 4 */                     return true;
                        }
                    }
/* 3 */             return false;
                }

                /* JADX INFO: renamed from: k */
                public final boolean m713k(Menu menu, MenuInflater menuInflater) {
/* 5 */             if (this.f1511u < 1) {
/* 3 */                 return false;
                    }
/* 18 */            ArrayList arrayList = null;
/* 19 */            boolean z = false;
/* 24 */            for (Fragment fragment : this.f1493c.m751f()) {
/* 32 */                if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
/* 46 */                    if (arrayList == null) {
/* 50 */                        arrayList = new ArrayList();
                            }
/* 53 */                    arrayList.add(fragment);
/* 56 */                    z = true;
                        }
                    }
/* 60 */            if (this.f1495e != null) {
/* 68 */                for (int i = 0; i < this.f1495e.size(); i++) {
/* 76 */                    Fragment fragment2 = (Fragment) this.f1495e.get(i);
/* 78 */                    if (arrayList == null || !arrayList.contains(fragment2)) {
/* 86 */                        fragment2.onDestroyOptionsMenu();
                            }
                        }
                    }
/* 92 */            this.f1495e = arrayList;
/* 94 */            return z;
                }

                /* JADX INFO: renamed from: l */
                public final void m714l() {
/* 1 */             boolean zIsChangingConfigurations = true;
/* 2 */             this.f1484I = true;
/* 4 */             m728z(true);
/* 7 */             m725w();
/* 10 */            om0 om0Var = this.f1512v;
/* 12 */            boolean z = om0Var instanceof u33;
/* 14 */            C0114z c0114z = this.f1493c;
/* 16 */            if (z) {
/* 20 */                zIsChangingConfigurations = c0114z.f1532d.f1522h;
                    } else {
/* 23 */                FragmentActivity fragmentActivity = om0Var.f14817b;
/* 25 */                if (fragmentActivity != null) {
/* 31 */                    zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
                        }
                    }
/* 32 */            if (zIsChangingConfigurations) {
/* 40 */                Iterator it = this.f1501k.values().iterator();
/* 48 */                while (it.hasNext()) {
/* 58 */                    Iterator it2 = ((BackStackState) it.next()).f1350a.iterator();
/* 66 */                    while (it2.hasNext()) {
/* 77 */                        c0114z.f1532d.m731d((String) it2.next(), false);
                            }
                        }
                    }
/* 82 */            m723u(-1);
/* 85 */            Object obj = this.f1512v;
/* 89 */            if (obj instanceof eq1) {
/* 95 */                ((eq1) obj).removeOnTrimMemoryListener(this.f1507q);
                    }
/* 98 */            Object obj2 = this.f1512v;
/* 102 */           if (obj2 instanceof vp1) {
/* 108 */               ((vp1) obj2).removeOnConfigurationChangedListener(this.f1506p);
                    }
/* 111 */           Object obj3 = this.f1512v;
/* 115 */           if (obj3 instanceof aq1) {
/* 121 */               ((aq1) obj3).removeOnMultiWindowModeChangedListener(this.f1508r);
                    }
/* 124 */           Object obj4 = this.f1512v;
/* 128 */           if (obj4 instanceof bq1) {
/* 134 */               ((bq1) obj4).removeOnPictureInPictureModeChangedListener(this.f1509s);
                    }
/* 137 */           Object obj5 = this.f1512v;
/* 141 */           if ((obj5 instanceof lg1) && this.f1514x == null) {
/* 151 */               ((lg1) obj5).removeMenuProvider(this.f1510t);
                    }
/* 155 */           this.f1512v = null;
/* 157 */           this.f1513w = null;
/* 159 */           this.f1514x = null;
/* 163 */           if (this.f1497g != null) {
/* 167 */               this.f1499i.remove();
/* 170 */               this.f1497g = null;
                    }
/* 172 */           C0977h3 c0977h3 = this.f1477B;
/* 174 */           if (c0977h3 != null) {
/* 176 */               c0977h3.m4098b();
/* 181 */               this.f1478C.m4098b();
/* 186 */               this.f1479D.m4098b();
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m715m(boolean z) {
/* 1 */             if (z && (this.f1512v instanceof eq1)) {
/* 17 */                m704c0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
/* 21 */                throw null;
                    }
/* 36 */            for (Fragment fragment : this.f1493c.m751f()) {
/* 44 */                if (fragment != null) {
/* 46 */                    fragment.performLowMemory();
/* 49 */                    if (z) {
/* 54 */                        fragment.mChildFragmentManager.m715m(true);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: n */
                public final void m716n(boolean z, boolean z2) {
/* 1 */             if (z2 && (this.f1512v instanceof aq1)) {
/* 17 */                m704c0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
/* 21 */                throw null;
                    }
/* 36 */            for (Fragment fragment : this.f1493c.m751f()) {
/* 44 */                if (fragment != null) {
/* 46 */                    fragment.performMultiWindowModeChanged(z);
/* 49 */                    if (z2) {
/* 54 */                        fragment.mChildFragmentManager.m716n(z, true);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: o */
                public final void m717o() {
/* 15 */            for (Fragment fragment : this.f1493c.m750e()) {
/* 23 */                if (fragment != null) {
/* 29 */                    fragment.onHiddenChanged(fragment.isHidden());
/* 34 */                    fragment.mChildFragmentManager.m717o();
                        }
                    }
                }

                /* JADX INFO: renamed from: p */
                public final boolean m718p(MenuItem menuItem) {
/* 5 */             if (this.f1511u < 1) {
/* 3 */                 return false;
                    }
/* 22 */            for (Fragment fragment : this.f1493c.m751f()) {
/* 30 */                if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
/* 4 */                     return true;
                        }
                    }
/* 3 */             return false;
                }

                /* JADX INFO: renamed from: q */
                public final void m719q(Menu menu) {
/* 4 */             if (this.f1511u < 1) {
/* 35 */                return;
                    }
/* 21 */            for (Fragment fragment : this.f1493c.m751f()) {
/* 29 */                if (fragment != null) {
/* 31 */                    fragment.performOptionsMenuClosed(menu);
                        }
                    }
                }

                /* JADX INFO: renamed from: r */
                public final void m720r(Fragment fragment) {
/* 1 */             if (fragment != null) {
/* 15 */                if (fragment.equals(this.f1493c.m747b(fragment.mWho))) {
/* 17 */                    fragment.performPrimaryNavigationFragmentChanged();
                        }
                    }
                }

                /* JADX INFO: renamed from: s */
                public final void m721s(boolean z, boolean z2) {
/* 1 */             if (z2 && (this.f1512v instanceof bq1)) {
/* 17 */                m704c0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
/* 21 */                throw null;
                    }
/* 36 */            for (Fragment fragment : this.f1493c.m751f()) {
/* 44 */                if (fragment != null) {
/* 46 */                    fragment.performPictureInPictureModeChanged(z);
/* 49 */                    if (z2) {
/* 54 */                        fragment.mChildFragmentManager.m721s(z, true);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: t */
                public final boolean m722t(Menu menu) {
/* 3 */             boolean z = false;
/* 5 */             if (this.f1511u < 1) {
/* 3 */                 return false;
                    }
/* 22 */            for (Fragment fragment : this.f1493c.m751f()) {
/* 30 */                if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
/* 44 */                    z = true;
                        }
                    }
/* 46 */            return z;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(128);
/* 10 */            sb.append("FragmentManager{");
/* 21 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 26 */            sb.append(" in ");
/* 29 */            Fragment fragment = this.f1514x;
/* 35 */            if (fragment != null) {
/* 45 */                sb.append(fragment.getClass().getSimpleName());
/* 48 */                sb.append("{");
/* 61 */                sb.append(Integer.toHexString(System.identityHashCode(this.f1514x)));
/* 64 */                sb.append("}");
                    } else {
/* 68 */                om0 om0Var = this.f1512v;
/* 70 */                if (om0Var != null) {
/* 80 */                    sb.append(om0Var.getClass().getSimpleName());
/* 83 */                    sb.append("{");
/* 96 */                    sb.append(Integer.toHexString(System.identityHashCode(this.f1512v)));
/* 99 */                    sb.append("}");
                        } else {
/* 105 */                   sb.append("null");
                        }
                    }
/* 110 */           sb.append("}}");
/* 113 */           return sb.toString();
                }

                /* JADX INFO: renamed from: u */
                public final void m723u(int i) {
                    try {
/* 3 */                 this.f1492b = true;
/* 21 */                for (C0113y c0113y : this.f1493c.f1530b.values()) {
/* 29 */                    if (c0113y != null) {
/* 31 */                        c0113y.f1528e = i;
                            }
                        }
/* 34 */                m687O(i, false);
/* 41 */                Iterator it = m707e().iterator();
/* 49 */                while (it.hasNext()) {
/* 57 */                    ((C0096h) it.next()).m662i();
                        }
/* 63 */                this.f1492b = false;
/* 65 */                m728z(true);
                    } catch (Throwable th) {
/* 69 */                this.f1492b = false;
/* 71 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: v */
                public final void m724v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
                    int size;
/* 3 */             String strM3783i = fm0.m3783i(str, "    ");
/* 7 */             C0114z c0114z = this.f1493c;
/* 9 */             ArrayList arrayList = c0114z.f1529a;
/* 13 */            String strM3783i2 = fm0.m3783i(str, "    ");
/* 17 */            HashMap map = c0114z.f1530b;
/* 23 */            if (!map.isEmpty()) {
/* 25 */                printWriter.print(str);
/* 30 */                printWriter.println("Active Fragments:");
/* 45 */                for (C0113y c0113y : map.values()) {
/* 53 */                    printWriter.print(str);
/* 56 */                    if (c0113y != null) {
/* 58 */                        Fragment fragment = c0113y.f1526c;
/* 60 */                        printWriter.println(fragment);
/* 63 */                        fragment.dump(strM3783i2, fileDescriptor, printWriter, strArr);
                            } else {
/* 69 */                        printWriter.println("null");
                            }
                        }
                    }
/* 73 */            int size2 = arrayList.size();
/* 78 */            if (size2 > 0) {
/* 80 */                printWriter.print(str);
/* 85 */                printWriter.println("Added Fragments:");
/* 89 */                for (int i = 0; i < size2; i++) {
/* 95 */                    Fragment fragment2 = (Fragment) arrayList.get(i);
/* 97 */                    printWriter.print(str);
/* 102 */                   printWriter.print("  #");
/* 105 */                   printWriter.print(i);
/* 110 */                   printWriter.print(": ");
/* 117 */                   printWriter.println(fragment2.toString());
                        }
                    }
/* 123 */           ArrayList arrayList2 = this.f1495e;
/* 125 */           if (arrayList2 != null && (size = arrayList2.size()) > 0) {
/* 133 */               printWriter.print(str);
/* 138 */               printWriter.println("Fragments Created Menus:");
/* 142 */               for (int i2 = 0; i2 < size; i2++) {
/* 150 */                   Fragment fragment3 = (Fragment) this.f1495e.get(i2);
/* 152 */                   printWriter.print(str);
/* 157 */                   printWriter.print("  #");
/* 160 */                   printWriter.print(i2);
/* 165 */                   printWriter.print(": ");
/* 172 */                   printWriter.println(fragment3.toString());
                        }
                    }
/* 180 */           int size3 = this.f1494d.size();
/* 184 */           if (size3 > 0) {
/* 186 */               printWriter.print(str);
/* 191 */               printWriter.println("Back Stack:");
/* 195 */               for (int i3 = 0; i3 < size3; i3++) {
/* 203 */                   C0086a c0086a = (C0086a) this.f1494d.get(i3);
/* 205 */                   printWriter.print(str);
/* 210 */                   printWriter.print("  #");
/* 213 */                   printWriter.print(i3);
/* 218 */                   printWriter.print(": ");
/* 225 */                   printWriter.println(c0086a.toString());
/* 229 */                   c0086a.m640f(strM3783i, printWriter, true);
                        }
                    }
/* 235 */           printWriter.print(str);
/* 258 */           printWriter.println("Back Stack Index: " + this.f1500j.get());
                    synchronized (this.f1491a) {
                        try {
/* 266 */                   int size4 = this.f1491a.size();
/* 270 */                   if (size4 > 0) {
/* 272 */                       printWriter.print(str);
/* 277 */                       printWriter.println("Pending Actions:");
/* 280 */                       for (int i4 = 0; i4 < size4; i4++) {
/* 288 */                           Object obj = (tm0) this.f1491a.get(i4);
/* 290 */                           printWriter.print(str);
/* 295 */                           printWriter.print("  #");
/* 298 */                           printWriter.print(i4);
/* 303 */                           printWriter.print(": ");
/* 306 */                           printWriter.println(obj);
                                }
                            }
                        } catch (Throwable th) {
/* 428 */                   throw th;
                        }
                    }
/* 315 */           printWriter.print(str);
/* 320 */           printWriter.println("FragmentManager misc state:");
/* 323 */           printWriter.print(str);
/* 328 */           printWriter.print("  mHost=");
/* 333 */           printWriter.println(this.f1512v);
/* 336 */           printWriter.print(str);
/* 341 */           printWriter.print("  mContainer=");
/* 346 */           printWriter.println(this.f1513w);
/* 351 */           if (this.f1514x != null) {
/* 353 */               printWriter.print(str);
/* 358 */               printWriter.print("  mParent=");
/* 363 */               printWriter.println(this.f1514x);
                    }
/* 366 */           printWriter.print(str);
/* 371 */           printWriter.print("  mCurState=");
/* 376 */           printWriter.print(this.f1511u);
/* 381 */           printWriter.print(" mStateSaved=");
/* 386 */           printWriter.print(this.f1482G);
/* 391 */           printWriter.print(" mStopped=");
/* 396 */           printWriter.print(this.f1483H);
/* 401 */           printWriter.print(" mDestroyed=");
/* 406 */           printWriter.println(this.f1484I);
/* 411 */           if (this.f1481F) {
/* 413 */               printWriter.print(str);
/* 418 */               printWriter.print("  mNeedMenuInvalidate=");
/* 423 */               printWriter.println(this.f1481F);
                    }
                }

                /* JADX INFO: renamed from: w */
                public final void m725w() {
/* 5 */             Iterator it = m707e().iterator();
/* 13 */            while (it.hasNext()) {
/* 21 */                ((C0096h) it.next()).m662i();
                    }
                }

                /* JADX INFO: renamed from: x */
                public final void m726x(tm0 tm0Var, boolean z) {
/* 1 */             if (!z) {
/* 5 */                 if (this.f1512v == null) {
/* 9 */                     if (this.f1484I) {
/* 13 */                        f42.m3656l("FragmentManager has been destroyed");
/* 16 */                        return;
                            } else {
/* 19 */                        f42.m3656l("FragmentManager has not been attached to a host.");
/* 22 */                        return;
                            }
                        }
/* 25 */                if (this.f1482G || this.f1483H) {
/* 34 */                    f42.m3656l("Can not perform this action after onSaveInstanceState");
/* 37 */                    return;
                        }
                    }
                    synchronized (this.f1491a) {
                        try {
/* 43 */                    if (this.f1512v == null) {
/* 45 */                        if (!z) {
/* 58 */                            throw new IllegalStateException("Activity has been destroyed");
                                }
                            } else {
/* 61 */                        this.f1491a.add(tm0Var);
/* 64 */                        m696X();
                            }
                        } catch (Throwable th) {
/* 70 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: y */
                public final void m727y(boolean z) {
/* 3 */             if (this.f1492b) {
/* 83 */                f42.m3656l("FragmentManager is already executing transactions");
/* 86 */                return;
                    }
/* 7 */             if (this.f1512v == null) {
/* 11 */                if (this.f1484I) {
/* 15 */                    f42.m3656l("FragmentManager has been destroyed");
/* 18 */                    return;
                        } else {
/* 21 */                    f42.m3656l("FragmentManager has not been attached to a host.");
/* 24 */                    return;
                        }
                    }
/* 37 */            if (Looper.myLooper() != this.f1512v.f14818c.getLooper()) {
/* 77 */                f42.m3656l("Must be called from main thread of fragment host");
/* 80 */                return;
                    }
/* 39 */            if (!z && (this.f1482G || this.f1483H)) {
/* 52 */                f42.m3656l("Can not perform this action after onSaveInstanceState");
                    } else if (this.f1486K == null) {
/* 65 */                this.f1486K = new ArrayList();
/* 72 */                this.f1487L = new ArrayList();
                    }
                }

                /* JADX INFO: renamed from: z */
                public final boolean m728z(boolean z) {
                    boolean zMo635a;
                    ArrayList arrayList;
/* 1 */             m727y(z);
/* 5 */             boolean z2 = false;
                    while (true) {
/* 6 */                 ArrayList arrayList2 = this.f1486K;
/* 8 */                 ArrayList arrayList3 = this.f1487L;
                        synchronized (this.f1491a) {
/* 19 */                    if (this.f1491a.isEmpty()) {
/* 22 */                        zMo635a = false;
                            } else {
                                try {
/* 29 */                            int size = this.f1491a.size();
/* 33 */                            int i = 0;
/* 34 */                            zMo635a = false;
                                    while (true) {
/* 35 */                                arrayList = this.f1491a;
/* 37 */                                if (i >= size) {
                                            break;
                                        }
/* 49 */                                zMo635a |= ((tm0) arrayList.get(i)).mo635a(arrayList2, arrayList3);
/* 50 */                                i++;
/* 173 */                               throw th;
                                    }
/* 55 */                            arrayList.clear();
/* 64 */                            this.f1512v.f14818c.removeCallbacks(this.f1490O);
                                } catch (Throwable th) {
/* 159 */                           this.f1491a.clear();
/* 168 */                           this.f1512v.f14818c.removeCallbacks(this.f1490O);
/* 171 */                           throw th;
                                }
                            }
                        }
/* 69 */                if (!zMo635a) {
                            break;
                        }
/* 71 */                this.f1492b = true;
                        try {
/* 77 */                    m693U(this.f1486K, this.f1487L);
/* 80 */                    m705d();
/* 83 */                    z2 = true;
                        } catch (Throwable th2) {
/* 86 */                    m705d();
/* 89 */                    throw th2;
                        }
                    }
/* 90 */            m706d0();
/* 95 */            if (this.f1485J) {
/* 97 */                this.f1485J = false;
/* 113 */               for (C0113y c0113y : this.f1493c.m749d()) {
/* 121 */                   Fragment fragment = c0113y.f1526c;
/* 125 */                   if (fragment.mDeferStart) {
/* 129 */                       if (this.f1492b) {
/* 131 */                           this.f1485J = true;
                                } else {
/* 134 */                           fragment.mDeferStart = false;
/* 136 */                           c0113y.m741i();
                                }
                            }
                        }
                    }
/* 153 */           this.f1493c.f1530b.values().removeAll(Collections.singleton(null));
/* 156 */           return z2;
                }
            }
