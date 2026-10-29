            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.graphics.Rect;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.appcompat.widget.C0062b;
            import androidx.appcompat.widget.Toolbar;
            import androidx.profileinstaller.ProfileInstallReceiver;
            import androidx.recyclerview.widget.AbstractC0137o;
            import androidx.recyclerview.widget.C0134l;
            import androidx.recyclerview.widget.RecyclerView;
            import androidx.viewpager2.widget.ViewPager2;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.material.internal.ScrimInsetsFrameLayout;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.lang.reflect.Method;
            import java.security.GeneralSecurityException;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.WeakHashMap;
            import java.util.concurrent.atomic.AtomicInteger;
            import okhttp3.HttpUrl;
            import okio.Segment;
            import org.json.JSONArray;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 52 */    public final class er0 implements cr0, xo0, ay1, jp1, hg1, InterfaceC2091q1, InterfaceC0845di {

                /* JADX INFO: renamed from: c */
                public static Class f7846c;

                /* JADX INFO: renamed from: d */
                public static boolean f7847d;

                /* JADX INFO: renamed from: e */
                public static Method f7848e;

                /* JADX INFO: renamed from: f */
                public static boolean f7849f;

                /* JADX INFO: renamed from: i */
                public static Method f7850i;

                /* JADX INFO: renamed from: v */
                public static boolean f7851v;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7852a;

                /* JADX INFO: renamed from: b */
                public Object f7853b;

                public er0(kx0 kx0Var, Class cls) {
/* 2 */             this.f7852a = 4;
/* 19 */            if (((Map) kx0Var.f13034b).keySet().contains(cls) || Void.class.equals(cls)) {
/* 51 */                this.f7853b = kx0Var;
                    } else {
/* 46 */                C1951n4.m6859j(AbstractC0886en.m3509m("Given internalKeyMananger ", kx0Var.toString(), " does not support primitive class ", cls.getName()));
/* 50 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: B */
                public static void m3576B(er0 er0Var) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 10 */            Iterator it = ((ArrayList) er0Var.f7853b).iterator();
/* 18 */            while (it.hasNext()) {
/* 34 */                arrayList.add(((h02) it.next()).getClass().getSimpleName());
                    }
/* 40 */            StringBuilder sb = new StringBuilder();
/* 43 */            Iterator it2 = arrayList.iterator();
/* 51 */            if (!it2.hasNext()) {
/* 74 */                return;
                    }
                    while (true) {
/* 59 */                sb.append((CharSequence) it2.next());
/* 66 */                if (!it2.hasNext()) {
/* 74 */                    return;
                        } else {
/* 70 */                    sb.append((CharSequence) " | ");
                        }
                    }
                }

                /* JADX INFO: renamed from: w */
                private final void m3577w(Throwable th) {
                }

                /* JADX INFO: renamed from: A */
                public void m3578A(JSONArray jSONArray) {
/* 7 */             m3595y("failed_analytics_events", jSONArray.toString());
                }

                @Override // p000.cr0
                /* JADX INFO: renamed from: a */
                public void mo2870a(ViewGroup viewGroup, View view) {
                }

                @Override // p000.InterfaceC0845di
                /* JADX INFO: renamed from: b */
                public void mo3086b(ConnectionResult connectionResult) {
/* 5 */             ((wp1) this.f7853b).mo1611b(connectionResult);
                }

                @Override // p000.hg1
                /* JADX INFO: renamed from: c */
                public boolean mo3404c(jg1 jg1Var, MenuItem menuItem) {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: d */
                public boolean m3579d(Class cls) {
/* 5 */             Iterator it = ((ArrayList) this.f7853b).iterator();
/* 13 */            while (it.hasNext()) {
/* 29 */                if (cls.isAssignableFrom(((h02) it.next()).getClass())) {
/* 31 */                    return true;
                        }
                    }
/* 33 */            return false;
                }

                /* JADX INFO: renamed from: e */
                public void m3580e(C2056p3 c2056p3) {
/* 3 */             RecyclerView recyclerView = (RecyclerView) this.f7853b;
/* 5 */             int i = c2056p3.f14951a;
/* 8 */             if (i == 1) {
/* 57 */                recyclerView.f1637a0.mo773f0(c2056p3.f14952b, c2056p3.f14953c);
/* 60 */                return;
                    }
/* 11 */            if (i == 2) {
/* 47 */                recyclerView.f1637a0.mo778i0(c2056p3.f14952b, c2056p3.f14953c);
                    } else if (i == 4) {
/* 37 */                recyclerView.f1637a0.mo779k0(recyclerView, c2056p3.f14952b, c2056p3.f14953c);
                    } else {
/* 18 */                if (i != 8) {
/* 20 */                    return;
                        }
/* 27 */                recyclerView.f1637a0.mo777h0(c2056p3.f14952b, c2056p3.f14953c);
                    }
                }

                @Override // p000.ay1
                /* JADX INFO: renamed from: f */
                public void mo1180f(int i, Object obj) {
                    String str;
                    switch (i) {
                        case 1:
/* 34 */                    str = "RESULT_INSTALL_SUCCESS";
                            break;
                        case 2:
/* 31 */                    str = "RESULT_ALREADY_INSTALLED";
                            break;
                        case 3:
/* 28 */                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                            break;
                        case 4:
/* 25 */                    str = "RESULT_NOT_WRITABLE";
                            break;
                        case 5:
/* 22 */                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                            break;
                        case 6:
/* 19 */                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                            break;
                        case 7:
/* 16 */                    str = "RESULT_IO_EXCEPTION";
                            break;
                        case 8:
/* 13 */                    str = "RESULT_PARSE_EXCEPTION";
                            break;
                        case 9:
                        default:
/* 4 */                     str = HttpUrl.FRAGMENT_ENCODE_SET;
                            break;
                        case 10:
/* 10 */                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                            break;
                        case 11:
/* 7 */                     str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                            break;
                    }
/* 37 */            if (i == 6 || i == 7 || i == 8) {
/* 51 */                AbstractC1245n0.m4877e("ProfileInstaller", str, (Throwable) obj);
                    }
/* 58 */            ((ProfileInstallReceiver) this.f7853b).setResultCode(i);
                }

                /* JADX INFO: renamed from: g */
                public AbstractC0137o m3581g(int i) {
/* 3 */             RecyclerView recyclerView = (RecyclerView) this.f7853b;
/* 7 */             int iM3363A = recyclerView.f1648e.m3363A();
/* 13 */            AbstractC0137o abstractC0137o = null;
/* 14 */            for (int i2 = 0; i2 < iM3363A; i2++) {
/* 22 */                AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(recyclerView.f1648e.m3399z(i2));
/* 26 */                if (abstractC0137oM843J != null && !abstractC0137oM843J.m1024h() && abstractC0137oM843J.f1780c == i) {
/* 51 */                    if (!((ArrayList) recyclerView.f1648e.f7615d).contains(abstractC0137oM843J.f1778a)) {
/* 55 */                        abstractC0137o = abstractC0137oM843J;
                                break;
                            }
/* 53 */                    abstractC0137o = abstractC0137oM843J;
                        }
                    }
/* 60 */            if (abstractC0137o != null) {
/* 75 */                if (!((ArrayList) recyclerView.f1648e.f7615d).contains(abstractC0137o.f1778a)) {
/* 78 */                    return abstractC0137o;
                        }
                    }
/* 11 */            return null;
                }

                /* JADX INFO: renamed from: h */
                public h02 m3582h(Class cls) {
/* 13 */            for (h02 h02Var : (ArrayList) this.f7853b) {
/* 25 */                if (h02Var.getClass() == cls) {
/* 27 */                    return h02Var;
                        }
                    }
/* 28 */            return null;
                }

                /* JADX INFO: renamed from: i */
                public JSONArray m3583i() {
                    try {
/* 7 */                 String strM3589r = ((er0) this.f7853b).m3589r("breadcrumbs");
/* 15 */                if (!b40.m1232p(strM3589r)) {
/* 19 */                    return new JSONArray(strM3589r);
                        }
                    } catch (Exception e) {
/* 28 */                xe2.m9777o("hsPerStore", "Error Getting BreadCrumbs", e);
                    }
/* 33 */            return new JSONArray();
                }

                @Override // p000.InterfaceC2091q1
                /* JADX INFO: renamed from: j */
                public boolean mo2236j(View view) {
/* 5 */             ra2 ra2Var = (ra2) this.f7853b;
/* 12 */            int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
/* 15 */            ViewPager2 viewPager2 = (ViewPager2) ra2Var.f15958d;
/* 19 */            if (viewPager2.f2021f0) {
/* 21 */                viewPager2.m1142c(currentItem);
                    }
/* 11 */            return true;
                }

                @Override // p000.jp1
                /* JADX INFO: renamed from: k */
                public m83 mo1634k(View view, m83 m83Var) {
/* 3 */             ScrimInsetsFrameLayout scrimInsetsFrameLayout = (ScrimInsetsFrameLayout) this.f7853b;
/* 7 */             if (scrimInsetsFrameLayout.f4807b == null) {
/* 14 */                scrimInsetsFrameLayout.f4807b = new Rect();
                    }
/* 16 */            Rect rect = scrimInsetsFrameLayout.f4807b;
/* 18 */            int iM6622b = m83Var.m6622b();
/* 22 */            j83 j83Var = m83Var.f13660a;
/* 36 */            rect.set(iM6622b, m83Var.m6624d(), m83Var.m6623c(), m83Var.m6621a());
/* 39 */            scrimInsetsFrameLayout.mo2343a(m83Var);
/* 62 */            scrimInsetsFrameLayout.setWillNotDraw(j83Var.mo2971j().equals(ly0.f13527e) || scrimInsetsFrameLayout.f4806a == null);
/* 65 */            WeakHashMap weakHashMap = e33.f7494a;
/* 67 */            scrimInsetsFrameLayout.postInvalidateOnAnimation();
/* 70 */            return j83Var.mo3340c();
                }

                @Override // p000.hg1
                /* JADX INFO: renamed from: l */
                public void mo3407l(jg1 jg1Var) {
/* 3 */             Toolbar toolbar = (Toolbar) this.f7853b;
/* 7 */             C0062b c0062b = toolbar.f696a.f461h0;
/* 9 */             if (c0062b == null || !c0062b.m427m()) {
/* 22 */                Iterator it = toolbar.f723u0.f15112b.iterator();
/* 30 */                while (it.hasNext()) {
/* 42 */                    ((qm0) ((fh1) it.next())).f15653a.m722t(jg1Var);
                        }
                    }
/* 46 */            ts0 ts0Var = toolbar.f687C0;
/* 48 */            if (ts0Var != null) {
/* 50 */                ts0Var.mo3407l(jg1Var);
                    }
                }

                /* JADX INFO: renamed from: m */
                public String m3584m() {
/* 7 */             return ((er0) this.f7853b).m3589r("current_push_token");
                }

                /* JADX INFO: renamed from: n */
                public JSONArray m3585n() {
                    try {
/* 7 */                 String strM3589r = ((er0) this.f7853b).m3589r("failed_analytics_events");
                        return b40.m1232p(strM3589r) ? new JSONArray() : new JSONArray(strM3589r);
                    } catch (Exception e) {
/* 34 */                xe2.m9777o("hsPerStore", "Error getting failed events", e);
/* 39 */                return new JSONArray();
                    }
                }

                /* JADX INFO: renamed from: o */
                public int m3586o(String str) {
/* 10 */            return ((SharedPreferences) ((er0) this.f7853b).f7853b).getInt(str, 0);
                }

                @Override // p000.xo0
                public void onFailure(Throwable th) {
                    gk2 gk2Var;
                    switch (this.f7852a) {
                        case 3:
/* 137 */                   ((vv0) this.f7853b).close();
/* 140 */                   return;
                        case 17:
/* 132 */                   return;
                        default:
/* 8 */                     gk2 gk2Var2 = (gk2) this.f7853b;
                            synchronized (gk2Var2.f8664a) {
                                try {
/* 13 */                            List list = gk2Var2.f8674k;
/* 16 */                            if (list != null) {
/* 18 */                                Iterator it = list.iterator();
/* 26 */                                while (it.hasNext()) {
/* 34 */                                    ((d70) it.next()).m2952b();
                                        }
/* 38 */                                gk2Var2.f8674k = null;
                                    }
                                } catch (Throwable th2) {
/* 131 */                           throw th2;
                                }
                                break;
                            }
/* 46 */                    gk2Var2.f8684u.m10440w();
/* 49 */                    qi1 qi1Var = gk2Var2.f8665b;
/* 55 */                    Iterator it2 = qi1Var.m7860g().iterator();
/* 63 */                    while (it2.hasNext() && (gk2Var = (gk2) it2.next()) != gk2Var2) {
                                synchronized (gk2Var.f8664a) {
                                    try {
/* 77 */                                List list2 = gk2Var.f8674k;
/* 79 */                                if (list2 != null) {
/* 81 */                                    Iterator it3 = list2.iterator();
/* 89 */                                    while (it3.hasNext()) {
/* 97 */                                        ((d70) it3.next()).m2952b();
                                            }
/* 101 */                                   gk2Var.f8674k = null;
                                        }
                                    } catch (Throwable th3) {
/* 114 */                               throw th3;
                                    }
                                }
/* 109 */                       gk2Var.f8684u.m10440w();
                            }
                            synchronized (qi1Var.f15573b) {
/* 122 */                       ((LinkedHashSet) qi1Var.f15576e).remove(gk2Var2);
                                break;
                            }
/* 126 */                   return;
                    }
                }

                @Override // p000.xo0
                public void onSuccess(Object obj) {
                    switch (this.f7852a) {
                        case 3:
                            break;
                        case 17:
/* 15 */                    ((fj2) this.f7853b).run();
                            break;
                        default:
                            break;
                    }
                }

                /* JADX INFO: renamed from: p */
                public long m3587p(String str) {
/* 7 */             return ((SharedPreferences) this.f7853b).getLong(str, 0L);
                }

                /* JADX INFO: renamed from: q */
                public String m3588q() {
/* 7 */             return ((er0) this.f7853b).m3589r("platform_id");
                }

                /* JADX INFO: renamed from: r */
                public String m3589r(String str) {
/* 7 */             return ((SharedPreferences) this.f7853b).getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
                }

                /* JADX INFO: renamed from: s */
                public void m3590s(int i, int i2) {
                    int i3;
                    int i4;
/* 3 */             RecyclerView recyclerView = (RecyclerView) this.f7853b;
/* 7 */             int iM3363A = recyclerView.f1648e.m3363A();
/* 11 */            int i5 = i2 + i;
/* 15 */            for (int i6 = 0; i6 < iM3363A; i6++) {
/* 19 */                View viewM3399z = recyclerView.f1648e.m3399z(i6);
/* 23 */                AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(viewM3399z);
/* 27 */                if (abstractC0137oM843J != null && !abstractC0137oM843J.m1031o() && (i4 = abstractC0137oM843J.f1780c) >= i && i4 < i5) {
/* 42 */                    abstractC0137oM843J.m1017a(2);
/* 47 */                    abstractC0137oM843J.m1017a(Segment.SHARE_MINIMUM);
/* 56 */                    ((RecyclerView.LayoutParams) viewM3399z.getLayoutParams()).f1683c = true;
                        }
                    }
/* 61 */            C0134l c0134l = recyclerView.f1639b;
/* 63 */            ArrayList arrayList = c0134l.f1770c;
/* 70 */            for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 76 */                AbstractC0137o abstractC0137o = (AbstractC0137o) arrayList.get(size);
/* 78 */                if (abstractC0137o != null && (i3 = abstractC0137o.f1780c) >= i && i3 < i5) {
/* 87 */                    abstractC0137o.m1017a(2);
/* 90 */                    c0134l.m1008e(size);
                        }
                    }
/* 96 */            recyclerView.f1630V0 = true;
                }

                @Override // p000.cr0
                public void setVisibility(int i) {
/* 5 */             ((View) this.f7853b).setVisibility(i);
                }

                /* JADX INFO: renamed from: t */
                public i31 m3591t(AbstractC2298vl abstractC2298vl) throws GeneralSecurityException {
/* 3 */             kx0 kx0Var = (kx0) this.f7853b;
                    try {
/* 5 */                 sq3 sq3VarMo6296o = kx0Var.mo6296o();
/* 9 */                 AbstractC2313w abstractC2313wMo7327k = sq3VarMo6296o.mo7327k(abstractC2298vl);
/* 13 */                sq3VarMo6296o.mo7328m(abstractC2313wMo7327k);
/* 16 */                AbstractC2313w abstractC2313wMo7325h = sq3VarMo6296o.mo7325h(abstractC2313wMo7327k);
/* 20 */                g31 g31VarM4453D = i31.m4453D();
/* 24 */                String strMo6294m = kx0Var.mo6294m();
/* 28 */                g31VarM4453D.m7234e();
/* 35 */                i31.m4454w((i31) g31VarM4453D.f14864b, strMo6294m);
                        try {
/* 42 */                    int iMo8615b = ((sq0) abstractC2313wMo7325h).mo8615b(null);
/* 46 */                    byte[] bArr = new byte[iMo8615b];
/* 50 */                    C1808jw c1808jw = new C1808jw(bArr, iMo8615b);
/* 53 */                    abstractC2313wMo7325h.mo8617f(c1808jw);
/* 61 */                    if (c1808jw.f12515c - c1808jw.f12516d != 0) {
/* 106 */                       throw new IllegalStateException("Did not write as much data as expected.");
                            }
/* 65 */                    C2222tl c2222tl = new C2222tl(bArr);
/* 68 */                    g31VarM4453D.m7234e();
/* 75 */                    i31.m4455x((i31) g31VarM4453D.f14864b, c2222tl);
/* 78 */                    h31 h31VarMo6297p = kx0Var.mo6297p();
/* 82 */                    g31VarM4453D.m7234e();
/* 89 */                    i31.m4456y((i31) g31VarM4453D.f14864b, h31VarMo6297p);
/* 96 */                    return (i31) g31VarM4453D.m7231b();
                        } catch (IOException e) {
/* 119 */                   throw new RuntimeException(abstractC2313wMo7325h.m9358c("ByteString"), e);
                        }
                    } catch (pz0 e2) {
/* 128 */               throw new GeneralSecurityException("Unexpected proto", e2);
                    }
                }

                public String toString() {
                    switch (this.f7852a) {
                        case 5:
/* 15 */                    StringBuilder sb = new StringBuilder("[Result: <");
/* 36 */                    sb.append("Value: " + ((EnumC2506yp) this.f7853b));
/* 41 */                    sb.append(">]");
/* 44 */                    return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

                /* JADX INFO: renamed from: u */
                public void m3592u(int i, int i2) {
/* 3 */             RecyclerView recyclerView = (RecyclerView) this.f7853b;
/* 7 */             int iM3363A = recyclerView.f1648e.m3363A();
/* 14 */            for (int i3 = 0; i3 < iM3363A; i3++) {
/* 22 */                AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(recyclerView.f1648e.m3399z(i3));
/* 26 */                if (abstractC0137oM843J != null && !abstractC0137oM843J.m1031o() && abstractC0137oM843J.f1780c >= i) {
/* 38 */                    abstractC0137oM843J.m1028l(i2, false);
/* 43 */                    recyclerView.f1624R0.f19442f = true;
                        }
                    }
/* 50 */            ArrayList arrayList = recyclerView.f1639b.f1770c;
/* 52 */            int size = arrayList.size();
/* 57 */            for (int i4 = 0; i4 < size; i4++) {
/* 63 */                AbstractC0137o abstractC0137o = (AbstractC0137o) arrayList.get(i4);
/* 65 */                if (abstractC0137o != null && abstractC0137o.f1780c >= i) {
/* 71 */                    abstractC0137o.m1028l(i2, false);
                        }
                    }
/* 77 */            recyclerView.requestLayout();
/* 80 */            recyclerView.f1628U0 = true;
                }

                /* JADX INFO: renamed from: v */
                public void m3593v(int i, int i2) {
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
/* 3 */             RecyclerView recyclerView = (RecyclerView) this.f7853b;
/* 7 */             int iM3363A = recyclerView.f1648e.m3363A();
/* 11 */            int i10 = -1;
/* 13 */            if (i < i2) {
/* 15 */                i4 = i;
/* 16 */                i3 = i2;
/* 17 */                i5 = -1;
                    } else {
/* 19 */                i3 = i;
/* 20 */                i4 = i2;
/* 21 */                i5 = 1;
                    }
/* 24 */            for (int i11 = 0; i11 < iM3363A; i11++) {
/* 32 */                AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(recyclerView.f1648e.m3399z(i11));
/* 36 */                if (abstractC0137oM843J != null && (i9 = abstractC0137oM843J.f1780c) >= i4 && i9 <= i3) {
/* 45 */                    if (i9 == i) {
/* 49 */                        abstractC0137oM843J.m1028l(i2 - i, false);
                            } else {
/* 53 */                        abstractC0137oM843J.m1028l(i5, false);
                            }
/* 58 */                    recyclerView.f1624R0.f19442f = true;
                        }
                    }
/* 65 */            ArrayList arrayList = recyclerView.f1639b.f1770c;
/* 67 */            if (i < i2) {
/* 69 */                i7 = i;
/* 70 */                i6 = i2;
                    } else {
/* 72 */                i6 = i;
/* 73 */                i7 = i2;
/* 74 */                i10 = 1;
                    }
/* 75 */            int size = arrayList.size();
/* 80 */            for (int i12 = 0; i12 < size; i12++) {
/* 86 */                AbstractC0137o abstractC0137o = (AbstractC0137o) arrayList.get(i12);
/* 88 */                if (abstractC0137o != null && (i8 = abstractC0137o.f1780c) >= i7 && i8 <= i6) {
/* 97 */                    if (i8 == i) {
/* 101 */                       abstractC0137o.m1028l(i2 - i, false);
                            } else {
/* 105 */                       abstractC0137o.m1028l(i10, false);
                            }
                        }
                    }
/* 111 */           recyclerView.requestLayout();
/* 114 */           recyclerView.f1628U0 = true;
                }

                /* JADX INFO: renamed from: x */
                public void m3594x(int i, String str) {
/* 9 */             SharedPreferences.Editor editorEdit = ((SharedPreferences) ((er0) this.f7853b).f7853b).edit();
/* 13 */            editorEdit.putInt(str, i);
/* 20 */            if (editorEdit.commit()) {
/* 25 */                return;
                    }
/* 22 */            editorEdit.commit();
                }

                /* JADX INFO: renamed from: y */
                public void m3595y(String str, String str2) {
/* 9 */             SharedPreferences.Editor editorEdit = ((SharedPreferences) ((er0) this.f7853b).f7853b).edit();
/* 13 */            editorEdit.putString(str, str2);
/* 20 */            if (editorEdit.commit()) {
/* 25 */                return;
                    }
/* 22 */            editorEdit.commit();
                }

                /* JADX INFO: renamed from: z */
                public void m3596z(String str) {
/* 5 */             SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f7853b).edit();
/* 9 */             editorEdit.remove(str);
/* 16 */            if (editorEdit.commit()) {
/* 21 */                return;
                    }
/* 18 */            editorEdit.commit();
                }

/* 53 */        public /* synthetic */ er0(Object obj, int i) {
/* 54 */            this.f7852a = i;
                    this.f7853b = obj;
                }

/* 54 */        public er0(Context context, String str) {
                    this.f7852a = 16;
/* 56 */            this.f7853b = context.getSharedPreferences(str, 0);
                }

/* 56 */        public er0(n01 n01Var, n01 n01Var2) {
                    this.f7852a = 21;
/* 58 */            this.f7853b = new we2(n01Var, n01Var2, 8, false);
                }

/* 58 */        public er0(y92 y92Var) {
                    this.f7852a = 23;
/* 60 */            this.f7853b = new AtomicInteger(0);
                }

/* 60 */        public /* synthetic */ er0(int i) {
/* 61 */            this.f7852a = i;
                }

/* 61 */        public er0(List list) {
                    this.f7852a = 12;
/* 63 */            this.f7853b = new ArrayList(list);
                }
            }
