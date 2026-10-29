            package p000;

            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Rect;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Messenger;
            import android.os.RemoteException;
            import android.util.SparseArray;
            import android.util.SparseIntArray;
            import android.view.Surface;
            import android.view.View;
            import androidx.recyclerview.widget.AbstractC0137o;
            import androidx.viewpager.widget.ViewPager;
            import com.google.android.gms.cloudmessaging.zzd;
            import com.google.android.gms.common.R$string;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.api.internal.BasePendingResult;
            import com.google.android.gms.internal.measurement.zzda;
            import com.google.android.gms.internal.measurement.zzo;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.internal.play_billing.zzjz;
            import com.google.android.gms.internal.play_billing.zzkd;
            import com.google.android.gms.internal.play_billing.zzks;
            import com.google.android.gms.internal.play_billing.zzku;
            import com.google.android.gms.internal.play_billing.zzli;
            import com.google.android.gms.internal.play_billing.zzlk;
            import com.google.android.gms.internal.play_billing.zzlq;
            import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
            import com.google.android.gms.measurement.internal.zzog;
            import com.google.android.gms.tasks.Continuation;
            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.WeakHashMap;
            import java.util.concurrent.CancellationException;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function0;
            import kotlin.text.StringsKt;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 33 */    public final class we2 implements xo0, jp1, OnCompleteListener, jf3, zzo, qk3, jd3, Continuation {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18594a;

                /* JADX INFO: renamed from: b */
                public Object f18595b;

                /* JADX INFO: renamed from: c */
                public Object f18596c;

                public we2(int i) {
/* 1 */             this.f18594a = i;
                    switch (i) {
                        case 1:
/* 77 */                    this.f18595b = new ArrayList();
/* 84 */                    this.f18596c = new ug2();
                            break;
                        case 11:
/* 59 */                    this.f18596c = new le2();
/* 66 */                    this.f18595b = new ta1();
                            break;
                        case 16:
/* 37 */                    this.f18596c = Collections.synchronizedMap(new WeakHashMap());
/* 48 */                    this.f18595b = Collections.synchronizedMap(new WeakHashMap());
                            break;
                        case 17:
/* 10 */                    pr0 pr0Var = pr0.f15259d;
/* 20 */                    this.f18596c = new SparseIntArray();
/* 22 */                    this.f18595b = pr0Var;
                            break;
                    }
                }

                /* JADX INFO: renamed from: d */
                public static zt2 m9551d(mv1 mv1Var, ra2 ra2Var) {
/* 3 */             ArrayList arrayListM10223r = yy1.m10223r(mv1Var.f14036e);
/* 11 */            if (arrayListM10223r.isEmpty()) {
/* 31 */                return null;
                    }
/* 19 */            ru1 ru1Var = ((nv1) ra2Var.f15956b).f14465a;
/* 27 */            return new zt2(ru1Var.f16298b, ru1Var.f16297a, null, arrayListM10223r, 4);
                }

                /* JADX INFO: renamed from: e */
                public static zt2 m9552e(mv1 mv1Var, ra2 ra2Var) {
/* 3 */             ArrayList arrayListM10223r = yy1.m10223r(mv1Var.f14038g);
/* 11 */            if (arrayListM10223r.isEmpty()) {
/* 31 */                return null;
                    }
/* 19 */            ru1 ru1Var = ((nv1) ra2Var.f15956b).f14467c;
/* 27 */            return new zt2(ru1Var.f16298b, ru1Var.f16297a, null, arrayListM10223r, 4);
                }

                /* JADX INFO: renamed from: f */
                public static zt2 m9553f(mv1 mv1Var, ra2 ra2Var) {
/* 3 */             ArrayList arrayListM10223r = yy1.m10223r(mv1Var.f14039h);
/* 11 */            if (arrayListM10223r.isEmpty()) {
/* 28 */                return null;
                    }
/* 24 */            return new zt2(((nv1) ra2Var.f15956b).f14468d, null, null, arrayListM10223r, 6);
                }

                /* JADX INFO: renamed from: g */
                public static xt2 m9554g(mv1 mv1Var, ra2 ra2Var) {
/* 1 */             kv1 kv1Var = mv1Var.f14046o;
/* 9 */             ArrayList arrayList = kv1Var != null ? kv1Var.f13020a : null;
/* 10 */            if (arrayList == null || arrayList.isEmpty()) {
/* 3 */                 return null;
                    }
/* 25 */            String str = ((nv1) ra2Var.f15956b).f14470f.f16298b;
/* 27 */            List<vu1> listM6184C = CollectionsKt.m6184C(arrayList);
/* 39 */            ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(listM6184C, 10));
/* 50 */            for (vu1 vu1Var : listM6184C) {
/* 69 */                arrayList2.add(new rt2(vu1Var.f18358c, vu1Var.f18357b, vu1Var.f18356a));
                    }
/* 75 */            eq2 eq2Var = (eq2) ra2Var.f15955a;
/* 87 */            return new xt2(str, arrayList2, (String) eq2Var.f7834c, (String) eq2Var.f7833b);
                }

                /* JADX INFO: renamed from: h */
                public static zt2 m9555h(mv1 mv1Var, ra2 ra2Var) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             hv1 hv1Var = mv1Var.f14041j;
/* 14 */            String str = hv1Var != null ? hv1Var.f9335c : null;
/* 15 */            if (str != null && !StringsKt.m6228D(str)) {
/* 24 */                sb.append(str);
                    }
/* 32 */            String str2 = hv1Var != null ? hv1Var.f9333a : null;
/* 33 */            if (str2 != null && !StringsKt.m6228D(str2)) {
/* 46 */                if (sb.length() > 0) {
/* 50 */                    sb.append("\n");
                        }
/* 53 */                sb.append(str2);
                    }
/* 56 */            String string = sb.toString();
/* 64 */            if (StringsKt.m6228D(string)) {
/* 8 */                 return null;
                    }
/* 78 */            return new zt2(((nv1) ra2Var.f15956b).f14472h, string, null, null, 12);
                }

                /* JADX INFO: renamed from: i */
                public static zt2 m9556i(mv1 mv1Var, ra2 ra2Var) {
/* 7 */             if (StringsKt.m6228D(mv1Var.f14040i)) {
/* 27 */                return null;
                    }
/* 23 */            return new zt2(((nv1) ra2Var.f15956b).f14469e, mv1Var.f14040i, null, null, 12);
                }

                /* JADX INFO: renamed from: a */
                public void m9557a(ValueAnimator valueAnimator) {
/* 4 */             q62 q62Var = new q62(3);
/* 11 */            valueAnimator.addListener((ug2) this.f18596c);
/* 18 */            ((ArrayList) this.f18595b).add(q62Var);
                }

                /* JADX INFO: renamed from: b */
                public void m9558b(AbstractC0137o abstractC0137o, m12 m12Var) {
/* 3 */             le2 le2Var = (le2) this.f18596c;
/* 10 */            p33 p33VarM7324a = (p33) le2Var.getOrDefault(abstractC0137o, null);
/* 12 */            if (p33VarM7324a == null) {
/* 14 */                p33VarM7324a = p33.m7324a();
/* 18 */                le2Var.put(abstractC0137o, p33VarM7324a);
                    }
/* 21 */            p33VarM7324a.f14959c = m12Var;
/* 27 */            p33VarM7324a.f14957a |= 8;
                }

                /* JADX INFO: renamed from: c */
                public View m9559c(int i, int i2, int i3, int i4) {
/* 3 */             l23 l23Var = (l23) this.f18595b;
/* 7 */             m23 m23Var = (m23) this.f18596c;
/* 9 */             int iMo965b = m23Var.mo965b();
/* 13 */            int iMo966c = m23Var.mo966c();
/* 21 */            int i5 = i2 > i ? 1 : -1;
/* 22 */            View view = null;
/* 23 */            while (i != i2) {
/* 25 */                View viewMo967d = m23Var.mo967d(i);
/* 29 */                int iMo964a = m23Var.mo964a(viewMo967d);
/* 33 */                int iMo968e = m23Var.mo968e(viewMo967d);
/* 37 */                l23Var.f13085b = iMo965b;
/* 39 */                l23Var.f13086c = iMo966c;
/* 41 */                l23Var.f13087d = iMo964a;
/* 43 */                l23Var.f13088e = iMo968e;
/* 45 */                if (i3 != 0) {
/* 47 */                    l23Var.f13084a = i3;
/* 53 */                    if (l23Var.m6332a()) {
/* 55 */                        return viewMo967d;
                            }
                        }
/* 56 */                if (i4 != 0) {
/* 58 */                    l23Var.f13084a = i4;
/* 64 */                    if (l23Var.m6332a()) {
/* 66 */                        view = viewMo967d;
                            }
                        }
/* 67 */                i += i5;
                    }
/* 69 */            return view;
                }

                /* JADX INFO: renamed from: j */
                public String m9560j(String str) {
/* 3 */             String str2 = (String) this.f18596c;
/* 7 */             Resources resources = (Resources) this.f18595b;
/* 11 */            int identifier = resources.getIdentifier(str, "string", str2);
/* 15 */            if (identifier == 0) {
/* 17 */                return null;
                    }
/* 19 */            return resources.getString(identifier);
                }

                @Override // p000.jp1
                /* JADX INFO: renamed from: k */
                public m83 mo1634k(View view, m83 m83Var) {
                    switch (this.f18594a) {
                        case 12:
/* 42 */                    ViewPager viewPager = (ViewPager) this.f18595b;
/* 44 */                    m83 m83VarM3312h = e33.m3312h(view, m83Var);
/* 54 */                    if (m83VarM3312h.f13660a.mo3342m()) {
/* 163 */                       return m83VarM3312h;
                            }
/* 59 */                    Rect rect = (Rect) this.f18596c;
/* 65 */                    rect.left = m83VarM3312h.m6622b();
/* 71 */                    rect.top = m83VarM3312h.m6624d();
/* 77 */                    rect.right = m83VarM3312h.m6623c();
/* 83 */                    rect.bottom = m83VarM3312h.m6621a();
/* 85 */                    int childCount = viewPager.getChildCount();
/* 90 */                    for (int i = 0; i < childCount; i++) {
/* 96 */                        m83 m83VarM3306b = e33.m3306b(viewPager.getChildAt(i), m83VarM3312h);
/* 110 */                       rect.left = Math.min(m83VarM3306b.m6622b(), rect.left);
/* 122 */                       rect.top = Math.min(m83VarM3306b.m6624d(), rect.top);
/* 134 */                       rect.right = Math.min(m83VarM3306b.m6623c(), rect.right);
/* 146 */                       rect.bottom = Math.min(m83VarM3306b.m6621a(), rect.bottom);
                            }
/* 159 */                   return m83VarM3312h.m6625f(rect.left, rect.top, rect.right, rect.bottom);
                        default:
/* 8 */                     j53 j53Var = (j53) this.f18596c;
/* 14 */                    k53 k53Var = (k53) this.f18595b;
/* 16 */                    k53 k53Var2 = new k53();
/* 21 */                    k53Var2.f12605a = k53Var.f12605a;
/* 25 */                    k53Var2.f12606b = k53Var.f12606b;
/* 29 */                    k53Var2.f12607c = k53Var.f12607c;
/* 33 */                    k53Var2.f12608d = k53Var.f12608d;
/* 35 */                    return j53Var.mo3876p(view, m83Var, k53Var2);
                    }
                }

                /* JADX INFO: renamed from: l */
                public void m9561l(String str, String str2, Bundle bundle, long j) {
                    try {
/* 10 */                ((zzda) this.f18596c).zze(str, str2, bundle, j);
                    } catch (RemoteException e) {
/* 20 */                ij3 ij3Var = ((AppMeasurementDynamiteService) this.f18595b).f4190a;
/* 22 */                if (ij3Var != null) {
/* 24 */                    uh3 uh3Var = ij3Var.f9655f;
/* 26 */                    ij3.m4555l(uh3Var);
/* 33 */                    uh3Var.f17541w.m8511b(e, "Event interceptor threw exception");
                        }
                    }
                }

                /* JADX INFO: renamed from: m */
                public boolean m9562m(View view) {
/* 3 */             l23 l23Var = (l23) this.f18595b;
/* 7 */             m23 m23Var = (m23) this.f18596c;
/* 9 */             int iMo965b = m23Var.mo965b();
/* 13 */            int iMo966c = m23Var.mo966c();
/* 17 */            int iMo964a = m23Var.mo964a(view);
/* 21 */            int iMo968e = m23Var.mo968e(view);
/* 25 */            l23Var.f13085b = iMo965b;
/* 27 */            l23Var.f13086c = iMo966c;
/* 29 */            l23Var.f13087d = iMo964a;
/* 31 */            l23Var.f13088e = iMo968e;
/* 35 */            l23Var.f13084a = 24579;
/* 37 */            return l23Var.m6332a();
                }

                /* JADX INFO: renamed from: n */
                public m12 m9563n(AbstractC0137o abstractC0137o, int i) {
                    p33 p33Var;
                    m12 m12Var;
/* 3 */             le2 le2Var = (le2) this.f18596c;
/* 5 */             int iM6425e = le2Var.m6425e(abstractC0137o);
/* 10 */            if (iM6425e >= 0 && (p33Var = (p33) le2Var.m6430j(iM6425e)) != null) {
/* 21 */                int i2 = p33Var.f14957a;
/* 25 */                if ((i2 & i) != 0) {
/* 28 */                    int i3 = i2 & (~i);
/* 29 */                    p33Var.f14957a = i3;
/* 32 */                    if (i == 4) {
/* 34 */                        m12Var = p33Var.f14958b;
                            } else if (i == 8) {
/* 41 */                        m12Var = p33Var.f14959c;
                            } else {
/* 65 */                        C1951n4.m6859j("Must provide flag PRE or POST");
                            }
/* 45 */                    if ((i3 & 12) == 0) {
/* 47 */                        le2Var.m6429i(iM6425e);
/* 51 */                        p33Var.f14957a = 0;
/* 53 */                        p33Var.f14958b = null;
/* 55 */                        p33Var.f14959c = null;
/* 59 */                        p33.f14956d.mo7044c(p33Var);
                            }
/* 62 */                    return m12Var;
                        }
                    }
/* 9 */             return null;
                }

                /* JADX INFO: renamed from: o */
                public void m9564o(AbstractC0137o abstractC0137o) {
/* 10 */            p33 p33Var = (p33) ((le2) this.f18596c).getOrDefault(abstractC0137o, null);
/* 12 */            if (p33Var == null) {
/* 14 */                return;
                    }
/* 19 */            p33Var.f14957a &= -2;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task task) {
                    switch (this.f18594a) {
                        case 14:
/* 45 */                    z93 z93Var = (z93) this.f18596c;
/* 49 */                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f18595b;
                            synchronized (z93Var.f20009f) {
/* 56 */                        z93Var.f20008e.remove(taskCompletionSource);
                                break;
                            }
/* 60 */                    return;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 39 */                    ((Map) ((we2) this.f18595b).f18595b).remove((TaskCompletionSource) this.f18596c);
/* 42 */                    return;
                        default:
/* 8 */                     yr3 yr3Var = (yr3) this.f18596c;
/* 12 */                    TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f18595b;
                            synchronized (yr3Var.f19791f) {
/* 19 */                        yr3Var.f19790e.remove(taskCompletionSource2);
                                break;
                            }
/* 23 */                    return;
                    }
                }

                @Override // p000.xo0
                public void onFailure(Throwable th) {
/* 5 */             int i = 2;
                    switch (this.f18594a) {
                        case 4:
/* 375 */                   int i2 = ((lj2) this.f18596c).f13323f;
/* 379 */                   if (i2 == 2 && (th instanceof CancellationException)) {
/* 385 */                       hu0.m4312F0("SurfaceProcessorNode");
                            } else {
/* 399 */                       hu0.m4317I0("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(hu0.m4334c0(i2)), th);
                            }
                            break;
                        case 5:
/* 345 */                   if (!(th instanceof pj2)) {
/* 367 */                       de3.m3028j(null, ((C2260um) this.f18596c).m9040a(null));
                            } else {
/* 355 */                       de3.m3028j(null, ((C2466xm) this.f18595b).cancel(false));
                            }
                            break;
                        case 6:
/* 323 */                   de3.m3028j("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof pj2);
/* 339 */                   ((c00) this.f18596c).accept(new C2254ug(1, (Surface) this.f18595b));
                            break;
                        default:
/* 12 */                    zzog zzogVar = (zzog) this.f18596c;
/* 16 */                    sl3 sl3Var = (sl3) this.f18595b;
/* 18 */                    sl3Var.mo1375y();
/* 21 */                    sl3Var.f16696w = false;
/* 25 */                    ij3 ij3Var = (ij3) sl3Var.f16749a;
/* 27 */                    pd3 pd3Var = ij3Var.f9651d;
/* 29 */                    uh3 uh3Var = ij3Var.f9655f;
/* 37 */                    if (pd3Var.m7406J(null, vg3.f18102T0)) {
/* 39 */                        String message = th.getMessage();
/* 43 */                        sl3Var.f16680Y = false;
/* 45 */                        if (message != null) {
/* 50 */                            if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
/* 98 */                                if (message.contains("Background")) {
/* 102 */                                   sl3Var.f16680Y = true;
                                        }
/* 100 */                               i = 1;
                                    } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
/* 90 */                                i = 3;
                                    }
                                }
                            }
/* 105 */                   int i3 = i - 1;
/* 107 */                   if (i3 == 0) {
/* 267 */                       ij3.m4555l(uh3Var);
/* 294 */                       uh3Var.f17541w.m8512c(uh3.m9013H(ij3Var.m4569q().m4534F()), "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", uh3.m9013H(th.toString()));
/* 297 */                       sl3Var.f16676U = 1;
/* 303 */                       sl3Var.m8572W().add(zzogVar);
                            } else if (i3 == 1) {
/* 147 */                       sl3Var.m8572W().add(zzogVar);
/* 164 */                       if (sl3Var.f16676U <= ((Integer) vg3.f18170w0.m9011a(null)).intValue()) {
/* 199 */                           ij3.m4555l(uh3Var);
/* 236 */                           uh3Var.f17541w.m8513d("registerTriggerAsync failed. App ID, delay in seconds, throwable", uh3.m9013H(ij3Var.m4569q().m4534F()), uh3.m9013H(String.valueOf(sl3Var.f16676U)), uh3.m9013H(th.toString()));
/* 239 */                           int i4 = sl3Var.f16676U;
/* 243 */                           if (sl3Var.f16677V == null) {
/* 250 */                               sl3Var.f16677V = new wk3(sl3Var, ij3Var, 1);
                                    }
/* 258 */                           sl3Var.f16677V.m1348b(((long) i4) * 1000);
/* 261 */                           int i5 = sl3Var.f16676U;
/* 264 */                           sl3Var.f16676U = i5 + i5;
                                } else {
/* 166 */                           sl3Var.f16676U = 1;
/* 168 */                           ij3.m4555l(uh3Var);
/* 195 */                           uh3Var.f17541w.m8512c(uh3.m9013H(ij3Var.m4569q().m4534F()), "registerTriggerAsync failed. May try later. App ID, throwable", uh3.m9013H(th.toString()));
                                }
                            } else {
/* 111 */                       ij3.m4555l(uh3Var);
/* 130 */                       uh3Var.f17538f.m8512c(uh3.m9013H(ij3Var.m4569q().m4534F()), "registerTriggerAsync failed. Dropping URI. App ID, Throwable", th);
/* 133 */                       m9568s();
/* 136 */                       sl3Var.f16676U = 1;
/* 138 */                       sl3Var.m8573X();
                            }
                            break;
                    }
                }

                @Override // p000.xo0
                public void onSuccess(Object obj) {
                    switch (this.f18594a) {
                        case 4:
/* 41 */                    mj2 mj2Var = (mj2) obj;
/* 43 */                    mj2Var.getClass();
/* 52 */                    x60 x60Var = (x60) ((ac1) this.f18595b).f177b;
/* 60 */                    if (!x60Var.f18966e.get()) {
/* 70 */                        RunnableC1784j8 runnableC1784j8 = new RunnableC1784j8(15, x60Var, mj2Var);
/* 73 */                        Objects.requireNonNull(mj2Var);
/* 83 */                        x60Var.m9716b(runnableC1784j8, new RunnableC2166s2(mj2Var, 14));
                            } else {
/* 62 */                        mj2Var.close();
                            }
                            break;
                        case 5:
/* 37 */                    de3.m3028j(null, ((C2260um) this.f18596c).m9040a(null));
                            break;
                        default:
/* 22 */                    ((c00) this.f18596c).accept(new C2254ug(0, (Surface) this.f18595b));
                            break;
                    }
                }

                /* JADX INFO: renamed from: p */
                public void m9565p(AbstractC0137o abstractC0137o) {
/* 3 */             ta1 ta1Var = (ta1) this.f18595b;
/* 11 */            for (int iM8756e = ta1Var.m8756e() - 1; iM8756e >= 0; iM8756e--) {
/* 17 */                if (abstractC0137o == ta1Var.m8757f(iM8756e)) {
/* 19 */                    Object[] objArr = ta1Var.f17007c;
/* 21 */                    Object obj = objArr[iM8756e];
/* 23 */                    Object obj2 = ta1.f17004e;
/* 25 */                    if (obj == obj2) {
                                break;
                            }
/* 27 */                    objArr[iM8756e] = obj2;
/* 29 */                    ta1Var.f17005a = true;
                            break;
                        }
                    }
/* 43 */            p33 p33Var = (p33) ((le2) this.f18596c).remove(abstractC0137o);
/* 45 */            if (p33Var != null) {
/* 48 */                p33Var.f14957a = 0;
/* 51 */                p33Var.f14958b = null;
/* 53 */                p33Var.f14959c = null;
/* 57 */                p33.f14956d.mo7044c(p33Var);
                    }
                }

                /* JADX INFO: renamed from: q */
                public zt2 m9566q(lv1 lv1Var) {
/* 1 */             lv1Var.getClass();
/* 6 */             uv1 uv1Var = (uv1) lv1Var.f13501b;
/* 8 */             tv1 tv1Var = uv1Var.f17732g;
/* 39 */            return new zt2(lv1Var.f13500a, uv1Var.f17731f, tv1Var != null ? new we2(tv1Var.f17288a, new C1908lz(10, this, tv1Var)) : null, null, 8);
                }

                /* JADX INFO: renamed from: r */
                public void m9567r(Status status, boolean z) {
                    HashMap map;
                    HashMap map2;
                    synchronized (((Map) this.f18596c)) {
/* 12 */                map = new HashMap((Map) this.f18596c);
                    }
                    synchronized (((Map) this.f18595b)) {
/* 28 */                map2 = new HashMap((Map) this.f18595b);
                    }
/* 44 */            for (Map.Entry entry : map.entrySet()) {
/* 52 */                if (z || ((Boolean) entry.getValue()).booleanValue()) {
/* 72 */                    ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
                        }
                    }
/* 88 */            for (Map.Entry entry2 : map2.entrySet()) {
/* 96 */                if (z || ((Boolean) entry2.getValue()).booleanValue()) {
/* 121 */                   ((TaskCompletionSource) entry2.getKey()).trySetException(new C1020i9(status));
                        }
                    }
                }

                /* JADX INFO: renamed from: s */
                public void m9568s() {
/* 7 */             ij3 ij3Var = (ij3) ((sl3) this.f18595b).f16749a;
/* 9 */             ki3 ki3Var = ij3Var.f9653e;
/* 11 */            ij3.m4553j(ki3Var);
/* 14 */            SparseArray sparseArrayM6115F = ki3Var.m6115F();
/* 20 */            zzog zzogVar = (zzog) this.f18596c;
/* 30 */            sparseArrayM6115F.put(zzogVar.f4217c, Long.valueOf(zzogVar.f4216b));
/* 33 */            ki3 ki3Var2 = ij3Var.f9653e;
/* 35 */            ij3.m4553j(ki3Var2);
/* 42 */            int[] iArr = new int[sparseArrayM6115F.size()];
/* 48 */            long[] jArr = new long[sparseArrayM6115F.size()];
/* 55 */            for (int i = 0; i < sparseArrayM6115F.size(); i++) {
/* 61 */                iArr[i] = sparseArrayM6115F.keyAt(i);
/* 73 */                jArr[i] = ((Long) sparseArrayM6115F.valueAt(i)).longValue();
                    }
/* 80 */            Bundle bundle = new Bundle();
/* 85 */            bundle.putIntArray("uriSources", iArr);
/* 90 */            bundle.putLongArray("uriTimestamps", jArr);
/* 95 */            ki3Var2.f12799Y.m8120y(bundle);
                }

                /* JADX INFO: renamed from: t */
                public void m9569t(zzjz zzjzVar) {
/* 1 */             if (zzjzVar == null) {
/* 3 */                 return;
                    }
                    try {
/* 4 */                 zzli zzliVarZzc = zzlk.zzc();
/* 12 */                zzliVarZzc.zzo((zzku) this.f18596c);
/* 15 */                zzliVarZzc.zza(zzjzVar);
/* 28 */                ((zr3) this.f18595b).m10429A((zzlk) zzliVarZzc.zzf());
                    } catch (Throwable th) {
/* 37 */                zze.zzm("BillingLogger", "Unable to log.", th);
                    }
                }

                @Override // com.google.android.gms.tasks.Continuation
                public Object then(Task task) {
                    Bundle bundle;
/* 3 */             h52 h52Var = (h52) this.f18596c;
/* 7 */             Bundle bundle2 = (Bundle) this.f18595b;
/* 9 */             h52Var.getClass();
                    return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? h52Var.m4116a(bundle2).onSuccessTask(o80.f14671d, xt0.f19360Y) : task;
                }

                /* JADX INFO: renamed from: u */
                public void m9570u(zzjz zzjzVar, int i) {
                    try {
/* 9 */                 zzks zzksVar = (zzks) ((zzku) this.f18596c).zzn();
/* 11 */                zzksVar.zza(i);
/* 20 */                this.f18596c = (zzku) zzksVar.zzf();
/* 22 */                m9569t(zzjzVar);
                    } catch (Throwable th) {
/* 31 */                zze.zzm("BillingLogger", "Unable to log.", th);
                    }
                }

                /* JADX INFO: renamed from: v */
                public void m9571v(zzkd zzkdVar) {
/* 1 */             if (zzkdVar == null) {
/* 3 */                 return;
                    }
                    try {
/* 4 */                 zzli zzliVarZzc = zzlk.zzc();
/* 12 */                zzliVarZzc.zzo((zzku) this.f18596c);
/* 15 */                zzliVarZzc.zzm(zzkdVar);
/* 28 */                ((zr3) this.f18595b).m10429A((zzlk) zzliVarZzc.zzf());
                    } catch (Throwable th) {
/* 37 */                zze.zzm("BillingLogger", "Unable to log.", th);
                    }
                }

                /* JADX INFO: renamed from: w */
                public void m9572w(zzlq zzlqVar) {
                    try {
/* 3 */                 zr3 zr3Var = (zr3) this.f18595b;
/* 5 */                 zzli zzliVarZzc = zzlk.zzc();
/* 13 */                zzliVarZzc.zzo((zzku) this.f18596c);
/* 16 */                zzliVarZzc.zzp(zzlqVar);
/* 25 */                zr3Var.m10429A((zzlk) zzliVarZzc.zzf());
                    } catch (Throwable th) {
/* 34 */                zze.zzm("BillingLogger", "Unable to log.", th);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzo
                public String zza(String str) {
/* 16 */            Map map = (Map) ((vi3) this.f18595b).f18211d.getOrDefault((String) this.f18596c, null);
/* 18 */            if (map == null || !map.containsKey(str)) {
/* 11 */                return null;
                    }
/* 31 */            return (String) map.get(str);
                }

                @Override // p000.jd3
/* 34 */        public Object zza() {
/* 39 */            return new wq3((Context) ((qf3) ((pi3) this.f18596c).f15137a).f15523a, (lr3) ((jd3) this.f18595b).zza());
                }

/* 86 */        public /* synthetic */ we2(Object obj, Object obj2, int i, boolean z) {
/* 87 */            this.f18594a = i;
                    this.f18596c = obj;
                    this.f18595b = obj2;
                }

/* 87 */        public we2(Context context) {
                    this.f18594a = 3;
                    kb1.m6061n(context);
/* 89 */            Resources resources = context.getResources();
                    this.f18595b = resources;
/* 91 */            this.f18596c = resources.getResourcePackageName(R$string.common_google_play_services_unknown_issue);
                }

/* 91 */        public we2(Context context, zzku zzkuVar) {
                    this.f18594a = 18;
/* 93 */            zr3 zr3Var = new zr3();
                    try {
                        yr2.m10174b(context);
/* 99 */                zr3Var.f20312c = yr2.m10173a().m10175c(C0959gm.f8708e).m10019a("PLAY_BILLING_LIBRARY", new vd0("proto"), new q62(27));
                    } catch (Throwable unused) {
                        zr3Var.f20311b = true;
                    }
                    this.f18595b = zr3Var;
                    this.f18596c = zzkuVar;
                }

/* 100 */       public we2(IBinder iBinder) throws RemoteException {
                    this.f18594a = 25;
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
/* 102 */           if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
/* 103 */               this.f18596c = new Messenger(iBinder);
                        this.f18595b = null;
                    } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
/* 106 */               this.f18595b = new zzd(iBinder);
                        this.f18596c = null;
                    } else {
/* 108 */               AbstractC1245n0.m4889q("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
/* 109 */               throw new RemoteException();
                    }
                }

/* 109 */       public we2(lo3 lo3Var) {
                    this.f18594a = 22;
                    this.f18595b = lo3Var;
                }

/* 110 */       public /* synthetic */ we2(int i, Object obj, Object obj2) {
/* 111 */           this.f18594a = i;
                    this.f18595b = obj;
                    this.f18596c = obj2;
                }

/* 111 */       public we2(od2 od2Var, od2 od2Var2) {
                    this.f18594a = 2;
                    od2Var.getClass();
                    od2Var2.getClass();
/* 113 */           this.f18596c = od2Var;
/* 114 */           this.f18595b = od2Var2;
                }

/* 114 */       public we2(String str, Function0 function0) {
                    this.f18594a = 7;
                    str.getClass();
/* 116 */           this.f18596c = str;
/* 117 */           this.f18595b = function0;
                }

/* 117 */       public we2(m23 m23Var) {
                    this.f18594a = 10;
/* 119 */           this.f18596c = m23Var;
/* 121 */           l23 l23Var = new l23();
/* 122 */           l23Var.f13084a = 0;
/* 123 */           this.f18595b = l23Var;
                }

/* 123 */       public we2(ViewPager viewPager) {
                    this.f18594a = 12;
                    this.f18595b = viewPager;
/* 125 */           this.f18596c = new Rect();
                }
            }
