            package p000;

            import android.content.Intent;
            import android.graphics.Rect;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.ResultReceiver;
            import android.text.TextUtils;
            import android.util.Size;
            import android.view.Surface;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.activity.result.ActivityResult;
            import com.android.billingclient.api.ProxyBillingActivityV2;
            import com.google.android.gms.common.internal.TelemetryData;
            import com.google.android.gms.common.internal.service.zai;
            import com.google.android.gms.internal.base.zac;
            import com.google.android.gms.internal.play_billing.zzco;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.material.behavior.SwipeDismissBehavior;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.PurchaseManager;
            import com.supercell.titan.PurchaseManagerGoogle;
            import com.supercell.titan.RunnableC0804k;
            import com.usercentrics.tcf.core.model.gvl.Declarations;
            import com.usercentrics.tcf.core.model.gvl.VendorList;
            import java.lang.reflect.InvocationHandler;
            import java.security.GeneralSecurityException;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.WeakHashMap;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import okhttp3.HttpUrl;
            import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
            import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 31 */    public final class fs0 implements tc1, ow0, tz1, InterfaceC2091q1, wp2, fz2, WebMessageCallbackBoundaryInterface, InterfaceC0918fi, c32, InterfaceC0202c3 {

                /* JADX INFO: renamed from: c */
                public static fs0 f8337c;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8338a;

                /* JADX INFO: renamed from: b */
                public Object f8339b;

                public fs0(int i) {
/* 1 */             this.f8338a = i;
                    switch (i) {
                        case 18:
/* 30 */                    this.f8339b = new HashMap();
                            break;
                        default:
/* 14 */                    this.f8339b = new rk1();
/* 18 */                    new HashMap();
                            break;
                    }
                }

                /* JADX INFO: renamed from: k */
                public static wb2 m3807k(mw0 mw0Var) {
/* 1 */             Object obj = null;
/* 2 */             if (mw0Var == null) {
/* 1 */                 return null;
                    }
/* 40 */            return new wb2(mw0Var, new Size(mw0Var.getWidth(), mw0Var.getHeight()), new C2225to(new hh2(obj, mw0Var.mo1727x0().mo4037b(), nm2.f14382b)));
                }

                /* JADX INFO: renamed from: y */
                public static fs0 m3808y(String str) {
/* 31 */            return new fs0((TextUtils.isEmpty(str) || str.length() > 1) ? lk3.UNINITIALIZED : ok3.m7184e(str.charAt(0)), 29);
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: a */
                public int mo3809a() {
/* 5 */             return ((C1822k8) this.f8339b).mo3809a();
                }

                @Override // p000.c32
                public void accept(Object obj, Object obj2) throws RemoteException {
/* 9 */             zai zaiVar = (zai) ((gc3) obj).getService();
/* 13 */            TelemetryData telemetryData = (TelemetryData) this.f8339b;
/* 15 */            Parcel parcelZaa = zaiVar.zaa();
/* 19 */            zac.zac(parcelZaa, telemetryData);
/* 23 */            zaiVar.zad(1, parcelZaa);
/* 27 */            ((TaskCompletionSource) obj2).setResult(null);
                }

                @Override // p000.ow0
                public mw0 acquireLatestImage() {
/* 9 */             return m3807k(((C1822k8) this.f8339b).acquireLatestImage());
                }

                @Override // p000.fz2
                /* JADX INFO: renamed from: b */
                public void mo3403b(ez2 ez2Var) {
/* 5 */             ((u03) this.f8339b).mo23c(ez2Var);
                }

                @Override // p000.InterfaceC0202c3
                /* JADX INFO: renamed from: c */
                public void mo198c(Object obj) {
/* 3 */             ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f8339b;
/* 5 */             ActivityResult activityResult = (ActivityResult) obj;
/* 7 */             Intent intent = activityResult.f352b;
/* 15 */            int i = zze.zzf(intent, "ProxyBillingActivityV2").f12818a;
/* 17 */            ResultReceiver resultReceiver = proxyBillingActivityV2.f3033d;
/* 19 */            if (resultReceiver != null) {
/* 29 */                resultReceiver.send(i, intent == null ? null : intent.getExtras());
                    }
/* 32 */            int i2 = activityResult.f351a;
/* 35 */            if (i2 != -1 || i != 0) {
/* 61 */                zze.zzl("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
                    }
/* 64 */            proxyBillingActivityV2.finish();
                }

                @Override // p000.ow0
                public void close() {
/* 5 */             ((C1822k8) this.f8339b).close();
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: d */
                public void mo3810d() {
/* 5 */             ((C1822k8) this.f8339b).mo3810d();
                }

                @Override // p000.tz1
                /* JADX INFO: renamed from: e */
                public void mo3210e(C1833kj c1833kj, List list) {
/* 1 */             int i = c1833kj.f12818a;
/* 4 */             if (list != null) {
/* 6 */                 Iterator it = list.iterator();
/* 14 */                while (it.hasNext()) {
/* 20 */                    sz1 sz1Var = (sz1) it.next();
/* 30 */                    TextUtils.isEmpty(sz1Var.f16881c.optString("orderId"));
/* 35 */                    ArrayList arrayListM8667a = sz1Var.m8667a();
/* 41 */                    StringBuilder sb = new StringBuilder();
/* 44 */                    Iterator it2 = arrayListM8667a.iterator();
/* 52 */                    if (it2.hasNext()) {
                                while (true) {
/* 60 */                            sb.append((CharSequence) it2.next());
/* 67 */                            if (it2.hasNext()) {
/* 69 */                                sb.append((CharSequence) ",");
                                    }
                                }
                            }
/* 73 */                    JSONObject jSONObject = sz1Var.f16881c;
/* 83 */                    jSONObject.optString("token", jSONObject.optString("purchaseToken"));
/* 90 */                    sz1Var.f16881c.optInt("purchaseState", 1);
                        }
                    }
/* 94 */            int i2 = c1833kj.f12818a;
/* 98 */            if (i2 != 0) {
/* 100 */               if (i2 == 1) {
/* 225 */                   PurchaseManagerGoogle purchaseManagerGoogle = (PurchaseManagerGoogle) this.f8339b;
/* 235 */                   if (purchaseManagerGoogle.f5882t.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 445 */                       return;
                            }
/* 241 */                   purchaseManagerGoogle.f5857c.add(purchaseManagerGoogle.f5882t);
/* 246 */                   purchaseManagerGoogle.f5882t = HttpUrl.FRAGMENT_ENCODE_SET;
                            synchronized (purchaseManagerGoogle) {
/* 256 */                       purchaseManagerGoogle.f5862h = Math.max(purchaseManagerGoogle.f5862h - 1, 0);
                            }
/* 259 */                   return;
                        }
/* 102 */               if (i2 != 2 && i2 != 3 && i2 != 6) {
/* 111 */                   if (i2 == 7) {
/* 128 */                       PurchaseManagerGoogle purchaseManagerGoogle2 = (PurchaseManagerGoogle) this.f8339b;
/* 132 */                       PurchaseManager.BillingProductFailed billingProductFailed = new PurchaseManager.BillingProductFailed();
/* 137 */                       billingProductFailed.errorCode = c1833kj.f12818a;
/* 141 */                       billingProductFailed.localizedDescription = c1833kj.f12819b;
/* 145 */                       billingProductFailed.productID = purchaseManagerGoogle2.f5882t;
/* 149 */                       purchaseManagerGoogle2.f5856b.add(billingProductFailed);
/* 154 */                       purchaseManagerGoogle2.f5882t = HttpUrl.FRAGMENT_ENCODE_SET;
                                synchronized (purchaseManagerGoogle2) {
/* 164 */                           purchaseManagerGoogle2.f5862h = Math.max(purchaseManagerGoogle2.f5862h - 1, 0);
                                }
/* 167 */                       return;
                            }
/* 115 */                   if (i2 != 12) {
/* 121 */                       PurchaseManagerGoogle.m2741a((PurchaseManagerGoogle) this.f8339b, c1833kj);
/* 124 */                       return;
                            }
                        }
/* 173 */               PurchaseManagerGoogle purchaseManagerGoogle3 = (PurchaseManagerGoogle) this.f8339b;
/* 177 */               PurchaseManager.BillingProductFailed billingProductFailed2 = new PurchaseManager.BillingProductFailed();
/* 182 */               billingProductFailed2.errorCode = c1833kj.f12818a;
/* 186 */               billingProductFailed2.localizedDescription = c1833kj.f12819b;
/* 190 */               billingProductFailed2.productID = purchaseManagerGoogle3.f5882t;
/* 194 */               purchaseManagerGoogle3.f5856b.add(billingProductFailed2);
/* 199 */               purchaseManagerGoogle3.f5882t = HttpUrl.FRAGMENT_ENCODE_SET;
                        synchronized (purchaseManagerGoogle3) {
/* 209 */                   purchaseManagerGoogle3.f5862h = Math.max(purchaseManagerGoogle3.f5862h - 1, 0);
                        }
/* 216 */               PurchaseManagerGoogle.m2741a((PurchaseManagerGoogle) this.f8339b, c1833kj);
/* 219 */               return;
                    }
/* 265 */           PurchaseManagerGoogle purchaseManagerGoogle4 = (PurchaseManagerGoogle) this.f8339b;
/* 267 */           if (list != null) {
/* 269 */               Iterator it3 = list.iterator();
/* 277 */               while (it3.hasNext()) {
/* 283 */                   sz1 sz1Var2 = (sz1) it3.next();
/* 287 */                   if (sz1Var2.f16879a != null) {
                                try {
/* 291 */                           if (sz1Var2.f16880b != null) {
/* 293 */                               JSONObject jSONObject2 = sz1Var2.f16881c;
/* 303 */                               String strOptString = jSONObject2.optString("token", jSONObject2.optString("purchaseToken"));
/* 307 */                               ArrayList arrayListM8667a2 = sz1Var2.m8667a();
/* 315 */                               if (!arrayListM8667a2.isEmpty() && !strOptString.isEmpty()) {
/* 327 */                                   String str = (String) arrayListM8667a2.get(0);
/* 331 */                                   PurchaseManager.PurchaseInfo purchaseInfo = new PurchaseManager.PurchaseInfo();
/* 338 */                                   String strOptString2 = sz1Var2.f16881c.optString("orderId");
/* 346 */                                   if (TextUtils.isEmpty(strOptString2)) {
/* 348 */                                       strOptString2 = null;
                                            }
/* 349 */                                   purchaseInfo.transactionId = strOptString2;
/* 351 */                                   purchaseInfo.productID = str;
/* 355 */                                   purchaseInfo.receipt = sz1Var2.f16879a;
/* 359 */                                   purchaseInfo.signature = sz1Var2.f16880b;
/* 361 */                                   purchaseInfo.purchaseToken = strOptString;
/* 363 */                                   LinkedHashMap linkedHashMap = purchaseManagerGoogle4.f5861g;
/* 365 */                                   if (str != null && !str.isEmpty() && (linkedHashMap.isEmpty() || linkedHashMap.containsKey(str))) {
/* 400 */                                       if ((sz1Var2.f16881c.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2) == 1) {
/* 406 */                                           purchaseManagerGoogle4.f5855a.add(purchaseInfo);
/* 415 */                                           if (purchaseManagerGoogle4.f5882t.equals(str)) {
/* 419 */                                               purchaseManagerGoogle4.f5882t = HttpUrl.FRAGMENT_ENCODE_SET;
                                                    }
                                                    synchronized (purchaseManagerGoogle4) {
                                                        try {
/* 432 */                                                   purchaseManagerGoogle4.f5862h = Math.max(purchaseManagerGoogle4.f5862h - 1, 0);
                                                        } catch (Throwable th) {
/* 439 */                                                   throw th;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } catch (Exception e) {
/* 440 */                           GameApp.debuggerException(e);
                                }
                            }
                        }
                    }
                }

                public boolean equals(Object obj) {
                    switch (this.f8338a) {
                        case 10:
/* 15 */                    return ((C1792jg) this.f8339b).equals(obj);
                        default:
/* 6 */                     return super.equals(obj);
                    }
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: f */
                public void mo3811f(nw0 nw0Var, Executor executor) {
/* 12 */            ((C1822k8) this.f8339b).mo3811f(new C2076pn(8, this, nw0Var), executor);
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: g */
                public int mo3812g() {
/* 5 */             return ((C1822k8) this.f8339b).mo3812g();
                }

                @Override // p000.ow0
                public int getHeight() {
/* 5 */             return ((C1822k8) this.f8339b).getHeight();
                }

                @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
                public String[] getSupportedFeatures() {
/* 3 */             return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
                }

                @Override // p000.ow0
                public Surface getSurface() {
/* 5 */             return ((C1822k8) this.f8339b).getSurface();
                }

                @Override // p000.ow0
                public int getWidth() {
/* 5 */             return ((C1822k8) this.f8339b).getWidth();
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: h */
                public mw0 mo3813h() {
/* 9 */             return m3807k(((C1822k8) this.f8339b).mo3813h());
                }

                public int hashCode() {
                    switch (this.f8338a) {
                        case 10:
/* 15 */                    return ((C1792jg) this.f8339b).hashCode();
                        default:
/* 6 */                     return super.hashCode();
                    }
                }

                /* JADX INFO: renamed from: i */
                public synchronized void m3814i(w31 w31Var) {
                    h41 h41VarM3815l;
                    synchronized (this) {
/* 11 */                h41VarM3815l = m3815l(r22.m8056e(w31Var), w31Var.m9463A());
                    }
/* 18 */            f41 f41Var = (f41) this.f8339b;
/* 20 */            f41Var.m7234e();
/* 27 */            i41.m4468x((i41) f41Var.f14864b, h41VarM3815l);
                }

                @Override // p000.InterfaceC2091q1
                /* JADX INFO: renamed from: j */
                public boolean mo2236j(View view) {
/* 3 */             SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f8339b;
/* 10 */            if (!swipeDismissBehavior.mo2237s(view)) {
/* 9 */                 return false;
                    }
/* 12 */            WeakHashMap weakHashMap = e33.f7494a;
/* 19 */            boolean z = view.getLayoutDirection() == 1;
/* 22 */            int i = swipeDismissBehavior.f4444d;
/* 42 */            view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
/* 46 */            view.setAlpha(0.0f);
/* 49 */            fs0 fs0Var = swipeDismissBehavior.f4442b;
/* 51 */            if (fs0Var != null) {
/* 59 */                ((RunnableC0804k) fs0Var.f8339b).f6011b.dismiss();
                    }
/* 18 */            return true;
                }

                /* JADX INFO: renamed from: l */
                public synchronized h41 m3815l(i31 i31Var, wq1 wq1Var) {
                    int iM7289a;
                    synchronized (this) {
/* 3 */                 iM7289a = p13.m7289a();
/* 11 */                while (m3824u(iM7289a)) {
/* 13 */                    iM7289a = p13.m7289a();
                        }
                    }
/* 73 */            return (h41) g41VarM4102F.m7231b();
/* 23 */            if (wq1Var == wq1.UNKNOWN_PREFIX) {
/* 86 */                throw new GeneralSecurityException("unknown output prefix type");
                    }
/* 25 */            g41 g41VarM4102F = h41.m4102F();
/* 29 */            g41VarM4102F.m7234e();
/* 36 */            h41.m4103w((h41) g41VarM4102F.f14864b, i31Var);
/* 39 */            g41VarM4102F.m7234e();
/* 46 */            h41.m4106z((h41) g41VarM4102F.f14864b, iM7289a);
/* 49 */            g41VarM4102F.m7234e();
/* 56 */            h41.m4105y((h41) g41VarM4102F.f14864b);
/* 59 */            g41VarM4102F.m7234e();
/* 66 */            h41.m4104x((h41) g41VarM4102F.f14864b, wq1Var);
/* 73 */            return (h41) g41VarM4102F.m7231b();
                }

                /* JADX INFO: renamed from: m */
                public eb2 m3816m() {
/* 3 */             eb2 eb2Var = new eb2();
/* 8 */             ArrayList arrayList = new ArrayList();
/* 27 */            for (Map.Entry entry : ((LinkedHashMap) this.f8339b).entrySet()) {
/* 39 */                xy2 xy2Var = (xy2) entry.getValue();
/* 43 */                if (xy2Var.f19403e) {
/* 47 */                    eb2Var.m3357a(xy2Var.f19399a);
/* 56 */                    arrayList.add((String) entry.getKey());
                        }
                    }
/* 60 */            arrayList.toString();
/* 65 */            hu0.m4312F0("UseCaseAttachState");
/* 68 */            return eb2Var;
                }

                /* JADX INFO: renamed from: n */
                public Collection m3817n() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 22 */            for (Map.Entry entry : ((LinkedHashMap) this.f8339b).entrySet()) {
/* 38 */                if (((xy2) entry.getValue()).f19403e) {
/* 48 */                    arrayList.add(((xy2) entry.getValue()).f19399a);
                        }
                    }
/* 52 */            return Collections.unmodifiableCollection(arrayList);
                }

                /* JADX INFO: renamed from: o */
                public Collection m3818o() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 22 */            for (Map.Entry entry : ((LinkedHashMap) this.f8339b).entrySet()) {
/* 38 */                if (((xy2) entry.getValue()).f19403e) {
/* 48 */                    arrayList.add(((xy2) entry.getValue()).f19400b);
                        }
                    }
/* 52 */            return Collections.unmodifiableCollection(arrayList);
                }

                @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
                public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
/* 9 */             i63 i63VarM4118a = h63.m4118a((WebMessageBoundaryInterface) j13.m5642b(WebMessageBoundaryInterface.class, invocationHandler2));
/* 13 */            if (i63VarM4118a != null) {
/* 24 */                ((k63) this.f8339b).onMessage(new m63(invocationHandler), i63VarM4118a);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: p */
                public Object m3819p(String str, d10 d10Var) {
                    yk2 yk2Var;
/* 3 */             if (d10Var instanceof yk2) {
/* 6 */                 yk2Var = (yk2) d10Var;
/* 8 */                 int i = yk2Var.f19675d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    yk2Var.f19675d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    yk2Var = new yk2(this, d10Var);
                        }
                    } else {
/* 22 */                yk2Var = new yk2(this, d10Var);
                    }
/* 25 */            Object obj = yk2Var.f19673b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = yk2Var.f19675d;
                    try {
/* 32 */                if (i2 == 0) {
/* 49 */                    pg3.m7417A(obj);
/* 54 */                    gl2 gl2Var = (gl2) this.f8339b;
/* 56 */                    yk2Var.f19672a = this;
/* 58 */                    yk2Var.f19675d = 1;
/* 64 */                    if (gl2Var.m3971a(str, yk2Var) == z10Var) {
/* 66 */                        return z10Var;
                            }
                        } else {
/* 34 */                    if (i2 != 1) {
/* 44 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 47 */                        return null;
                            }
/* 36 */                    this = yk2Var.f19672a;
/* 38 */                    pg3.m7417A(obj);
                        }
/* 67 */                m42 m42Var = o42.f14612b;
/* 73 */                Declarations declarations = ((gl2) this.f8339b).f8702d;
/* 75 */                declarations.getClass();
/* 78 */                return declarations;
                    } catch (Exception e) {
/* 80 */                m42 m42Var2 = o42.f14612b;
/* 91 */                return new n42(new vz2("Unable to initialise due to poor or no network connection while fetching the TCF data.", e));
                    }
                }

                /* JADX INFO: renamed from: q */
                public synchronized C0875ec m3820q() {
/* 12 */            return C0875ec.m3361s((i41) ((f41) this.f8339b).m7231b());
                }

                /* JADX INFO: renamed from: r */
                public ng2 m3821r(String str) {
                    tg2 tg2Var;
                    synchronized (this) {
/* 10 */                tg2Var = (tg2) ((HashMap) this.f8339b).get(str);
                    }
/* 13 */            if (tg2Var == null) {
/* 15 */                return null;
                    }
/* 17 */            return tg2Var.m8788a();
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: s */
                public Object m3822s(d10 d10Var) {
                    zk2 zk2Var;
/* 3 */             if (d10Var instanceof zk2) {
/* 6 */                 zk2Var = (zk2) d10Var;
/* 8 */                 int i = zk2Var.f20229d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zk2Var.f20229d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zk2Var = new zk2(this, d10Var);
                        }
                    } else {
/* 22 */                zk2Var = new zk2(this, d10Var);
                    }
/* 25 */            Object obj = zk2Var.f20227b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = zk2Var.f20229d;
                    try {
/* 32 */                if (i2 == 0) {
/* 49 */                    pg3.m7417A(obj);
/* 54 */                    gl2 gl2Var = (gl2) this.f8339b;
/* 56 */                    zk2Var.f20226a = this;
/* 58 */                    zk2Var.f20229d = 1;
/* 64 */                    if (gl2Var.m3972b(zk2Var) == z10Var) {
/* 66 */                        return z10Var;
                            }
                        } else {
/* 34 */                    if (i2 != 1) {
/* 44 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 47 */                        return null;
                            }
/* 36 */                    this = zk2Var.f20226a;
/* 38 */                    pg3.m7417A(obj);
                        }
/* 67 */                m42 m42Var = o42.f14612b;
/* 73 */                VendorList vendorList = ((gl2) this.f8339b).f8701c;
/* 75 */                vendorList.getClass();
/* 78 */                return vendorList;
                    } catch (Exception e) {
/* 80 */                m42 m42Var2 = o42.f14612b;
/* 91 */                return new n42(new vz2("Unable to initialise due to poor or no network connection while fetching the TCF data.", e));
                    }
                }

                /* JADX INFO: renamed from: t */
                public boolean m3823t(String str) {
/* 3 */             LinkedHashMap linkedHashMap = (LinkedHashMap) this.f8339b;
/* 9 */             if (linkedHashMap.containsKey(str)) {
/* 19 */                return ((xy2) linkedHashMap.get(str)).f19403e;
                    }
/* 11 */            return false;
                }

                public String toString() {
                    switch (this.f8338a) {
                        case 10:
/* 15 */                    return ((C1792jg) this.f8339b).toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

                /* JADX INFO: renamed from: u */
                public synchronized boolean m3824u(int i) {
/* 18 */            Iterator it = Collections.unmodifiableList(((i41) ((f41) this.f8339b).f14864b).m4469A()).iterator();
/* 26 */            while (it.hasNext()) {
/* 38 */                if (((h41) it.next()).m4108B() == i) {
/* 41 */                    return true;
                        }
                    }
/* 46 */            return false;
                }

                /* JADX INFO: renamed from: v */
                public void m3825v() {
/* 15 */            ((cb3) this.f8339b).f2832o.f17695n.post(new bb3(this, 1));
                }

                /* JADX INFO: renamed from: w */
                public void m3826w(Runnable runnable) {
                    try {
/* 11 */                ((ExecutorService) this.f8339b).submit(new f62(runnable, 1));
                    } catch (Exception e) {
/* 20 */                xe2.m9777o("HSThreader", "Error while submitting request.", e);
                    }
                }

                /* JADX INFO: renamed from: x */
                public void m3827x(String str, fb2 fb2Var, zy2 zy2Var, C2069pg c2069pg, List list) {
/* 3 */             LinkedHashMap linkedHashMap = (LinkedHashMap) this.f8339b;
/* 9 */             if (linkedHashMap.containsKey(str)) {
/* 14 */                xy2 xy2Var = new xy2(fb2Var, zy2Var, c2069pg, list);
/* 21 */                xy2 xy2Var2 = (xy2) linkedHashMap.get(str);
/* 25 */                xy2Var.f19403e = xy2Var2.f19403e;
/* 29 */                xy2Var.f19404f = xy2Var2.f19404f;
/* 31 */                linkedHashMap.put(str, xy2Var);
                    }
                }

/* 32 */        public /* synthetic */ fs0(er0 er0Var) {
                    this.f8338a = 9;
/* 34 */            this.f8339b = (zzco) er0Var.f7853b;
                }

/* 34 */        public /* synthetic */ fs0(Object obj, int i) {
/* 35 */            this.f8338a = i;
                    this.f8339b = obj;
                }

/* 35 */        public fs0(Bundle bundle) {
                    this.f8338a = 27;
                    this.f8339b = bundle == null ? new Bundle() : bundle;
                }

/* 36 */        public fs0(u03 u03Var) {
                    this.f8338a = 20;
                    u03Var.getClass();
/* 38 */            this.f8339b = u03Var;
                }

/* 38 */        public fs0(gl2 gl2Var) {
                    this.f8338a = 16;
                    gl2Var.getClass();
/* 40 */            this.f8339b = gl2Var;
                }

/* 40 */        public fs0(ViewGroup viewGroup) {
                    this.f8338a = 21;
/* 42 */            this.f8339b = viewGroup.getOverlay();
                }

/* 42 */        public fs0(String str) {
                    this.f8338a = 19;
/* 44 */            this.f8339b = new LinkedHashMap();
                }

/* 44 */        public /* synthetic */ fs0(int i, boolean z) {
/* 45 */            this.f8338a = i;
                }

/* 45 */        public fs0(Size size, Rect rect, int i) {
                    this.f8338a = 10;
/* 49 */            this.f8339b = new C1792jg(size, rect, i);
                }
            }
