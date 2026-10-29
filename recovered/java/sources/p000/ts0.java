            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.SharedPreferences;
            import android.content.res.Resources;
            import android.graphics.Color;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.Window;
            import android.webkit.WebView;
            import androidx.appcompat.widget.LinearLayoutCompat;
            import androidx.recyclerview.widget.RecyclerView;
            import androidx.transition.Fade;
            import androidx.transition.Slide;
            import androidx.viewpager2.widget.ViewPager2;
            import com.google.android.material.navigationrail.NavigationRailView;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import com.supercell.titan.PurchaseManagerGoogle;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.components.UCImageView;
            import com.usercentrics.sdk.p009v2.settings.data.ConsentDisclosureObject;
            import com.usercentrics.sdk.p009v2.settings.data.ServiceConsentTemplate;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsService;
            import com.usercentrics.sdk.p009v2.translation.data.LegalBasisLocalization;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.InvocationHandler;
            import java.text.SimpleDateFormat;
            import java.time.Instant;
            import java.time.LocalDateTime;
            import java.time.ZoneOffset;
            import java.time.format.DateTimeFormatter;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Date;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.MissingFormatArgumentException;
            import java.util.NoSuchElementException;
            import java.util.Set;
            import java.util.WeakHashMap;
            import javax.inject.Provider;
            import kotlin.Unit;
            import kotlin.collections.C1839a;
            import kotlin.coroutines.C1846g;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
            import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
            import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
            import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
            import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
            import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
            import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
            import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
            import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
            import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 19 */    public final class ts0 implements xo0, InterfaceC2299vm, j53, InterfaceC0919fj, fk0, sg0, y82, InterfaceC0976h2, hg1, InterfaceC2091q1, WebMessageListenerBoundaryInterface, e73, w73 {

                /* JADX INFO: renamed from: a */
                public Object f17248a;

                public ts0(Bundle bundle) {
/* 4 */             if (bundle != null) {
/* 11 */                this.f17248a = new Bundle(bundle);
                    } else {
/* 16 */                C1951n4.m6868s(SharedDataContentProvider.BASE_PATH);
/* 20 */                throw null;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Collection, java.util.List] */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
                /* JADX INFO: renamed from: A */
                public static h61 m8884A(InterfaceC0972gz interfaceC0972gz, List list, LegalBasisLocalization legalBasisLocalization) {
                    Object next;
                    List<String> list2;
                    String str;
/* 3 */             Iterator it = list.iterator();
                    while (true) {
/* 11 */                if (!it.hasNext()) {
/* 45 */                    next = null;
                            break;
                        }
/* 13 */                next = it.next();
/* 18 */                UsercentricsService usercentricsService = (UsercentricsService) next;
/* 30 */                if (Intrinsics.m6216a(interfaceC0972gz.mo2821b(), usercentricsService.f6666a) && Intrinsics.m6216a(interfaceC0972gz.mo2824e(), usercentricsService.f6667b)) {
                            break;
                        }
                    }
/* 46 */            UsercentricsService usercentricsService2 = (UsercentricsService) next;
/* 48 */            if (usercentricsService2 == null) {
/* 50 */                String description = interfaceC0972gz.getDescription();
/* 54 */                String strMo2821b = interfaceC0972gz.mo2821b();
/* 58 */                String strMo2824e = interfaceC0972gz.mo2824e();
/* 62 */                boolean zMo2820a = interfaceC0972gz.mo2820a();
/* 66 */                String strMo2822c = interfaceC0972gz.mo2822c();
/* 70 */                Boolean boolMo2823d = interfaceC0972gz.mo2823d();
/* 76 */                nd0 nd0Var = nd0.f14189a;
/* 153 */               usercentricsService2 = new UsercentricsService(strMo2821b, strMo2824e, null, null, HttpUrl.FRAGMENT_ENCODE_SET, nd0Var, null, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, nd0Var, nd0Var, nd0Var, nd0Var, nd0Var, nd0Var, nd0Var, null, HttpUrl.FRAGMENT_ENCODE_SET, null, null, null, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, strMo2822c, null, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, null, HttpUrl.FRAGMENT_ENCODE_SET, description, null, null, null, new ConsentDisclosureObject(), null, zMo2820a, null, boolMo2823d, null, null, false);
                    }
/* 157 */           String str2 = usercentricsService2.f6670e;
/* 159 */           ?? M6210b = usercentricsService2.f6681p;
/* 161 */           List list3 = usercentricsService2.f6678m;
/* 169 */           mu1 mu1Var = new mu1(usercentricsService2.f6651G, usercentricsService2.f6653I);
/* 172 */           List list4 = usercentricsService2.f6679n;
/* 178 */           if (list4.isEmpty()) {
/* 180 */               list4 = usercentricsService2.f6671f;
                    }
/* 182 */           List list5 = list4;
/* 183 */           List list6 = usercentricsService2.f6680o;
/* 185 */           String str3 = usercentricsService2.f6675j;
/* 187 */           String strMo2821b2 = interfaceC0972gz.mo2821b();
/* 191 */           boolean z = interfaceC0972gz instanceof ServiceConsentTemplate;
/* 193 */           if (z && (list2 = ((ServiceConsentTemplate) interfaceC0972gz).f6456j) != null && (!list2.isEmpty())) {
/* 218 */               M6210b = new ArrayList(C2122qw.m8020h(list2, 10));
/* 229 */               for (String str4 : list2) {
/* 239 */                   Map map = legalBasisLocalization.f6759c;
/* 241 */                   if (map != null && (str = (String) map.get(str4)) != null) {
/* 252 */                       str4 = str;
                            }
/* 253 */                   M6210b.add(str4);
                        }
                    } else if (M6210b.isEmpty()) {
/* 268 */               M6210b = C1839a.m6210b(usercentricsService2.f6689x);
                    }
/* 257 */           ?? r11 = M6210b;
/* 273 */           if (str2 == null || StringsKt.m6228D(str2)) {
/* 284 */               str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 364 */           return new h61(list3, mu1Var, list5, list6, str3, strMo2821b2, r11, str2, z ? ((ServiceConsentTemplate) interfaceC0972gz).f6457k : Boolean.FALSE, new hv1(usercentricsService2.f6674i, usercentricsService2.f6648D, usercentricsService2.f6673h), usercentricsService2.f6647C, usercentricsService2.f6676k, new aw1(usercentricsService2.f6650F, usercentricsService2.f6688w, usercentricsService2.f6690y, usercentricsService2.f6649E), interfaceC0972gz.mo2824e(), usercentricsService2.f6655K, usercentricsService2.f6656L, usercentricsService2.f6657M, usercentricsService2.f6658N, usercentricsService2.f6659O, usercentricsService2.f6660P);
                }

                /* JADX INFO: renamed from: H */
                public static String m8885H(String str) {
                    return str.startsWith("gcm.n.") ? str.substring(6) : str;
                }

                /* JADX INFO: renamed from: f */
                public static JSONObject m8886f(String str, JSONObject jSONObject) {
                    try {
/* 1 */                 return jSONObject.getJSONObject(str);
                    } catch (JSONException e) {
/* 15 */                xe2.m9777o("genricDataMngr", "Error in reading the json value for key ".concat(str), e);
/* 18 */                return null;
                    }
                }

                /* JADX INFO: renamed from: z */
                public static boolean m8887z(Bundle bundle) {
                    return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
                }

                /* JADX INFO: renamed from: B */
                public Bundle m8888B() {
/* 5 */             Bundle bundle = (Bundle) this.f17248a;
/* 7 */             Bundle bundle2 = new Bundle(bundle);
/* 22 */            for (String str : bundle.keySet()) {
/* 36 */                if (!str.startsWith("google.c.a.") && !str.equals("from")) {
/* 47 */                    bundle2.remove(str);
                        }
                    }
/* 51 */            return bundle2;
                }

                /* JADX INFO: renamed from: C */
                public synchronized void m8889C(String str) {
                    try {
/* 2 */                 String strM8910v = m8910v(str);
/* 6 */                 if (strM8910v == null) {
/* 9 */                     return;
                        }
/* 25 */                HashSet hashSet = new HashSet(((SharedPreferences) this.f17248a).getStringSet(strM8910v, new HashSet()));
/* 28 */                hashSet.remove(str);
/* 31 */                boolean zIsEmpty = hashSet.isEmpty();
/* 37 */                SharedPreferences sharedPreferences = (SharedPreferences) this.f17248a;
/* 39 */                if (zIsEmpty) {
/* 49 */                    sharedPreferences.edit().remove(strM8910v).commit();
                        } else {
/* 63 */                    sharedPreferences.edit().putStringSet(strM8910v, hashSet).commit();
                        }
                    } catch (Throwable th) {
/* 69 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: D */
                public void m8890D(int i) {
/* 3 */             RecyclerView recyclerView = (RecyclerView) this.f17248a;
/* 5 */             View childAt = recyclerView.getChildAt(i);
/* 9 */             if (childAt != null) {
/* 11 */                recyclerView.m889o(childAt);
/* 14 */                childAt.clearAnimation();
                    }
/* 17 */            recyclerView.removeViewAt(i);
                }

                /* JADX INFO: renamed from: E */
                public synchronized boolean m8891E(long j) {
/* 8 */             boolean zContains = ((SharedPreferences) this.f17248a).contains("fire-global");
/* 14 */            SharedPreferences sharedPreferences = (SharedPreferences) this.f17248a;
/* 17 */            if (!zContains) {
/* 74 */                sharedPreferences.edit().putLong("fire-global", j).commit();
/* 16 */                return true;
                    }
/* 21 */            long j2 = sharedPreferences.getLong("fire-global", -1L);
                    synchronized (this) {
/* 39 */                if (m8901k(j2).equals(m8901k(j))) {
/* 61 */                    return false;
                        }
/* 53 */                ((SharedPreferences) this.f17248a).edit().putLong("fire-global", j).commit();
/* 16 */                return true;
                    }
                }

                /* JADX INFO: renamed from: F */
                public synchronized void m8892F(String str, long j) {
/* 2 */             String strM8901k = m8901k(j);
/* 22 */            if (((SharedPreferences) this.f17248a).getString("last-used-date", HttpUrl.FRAGMENT_ENCODE_SET).equals(strM8901k)) {
/* 24 */                String strM8910v = m8910v(strM8901k);
/* 28 */                if (strM8910v == null) {
/* 31 */                    return;
                        }
/* 36 */                if (strM8910v.equals(str)) {
/* 39 */                    return;
                        }
/* 40 */                m8893G(str, strM8901k);
/* 44 */                return;
                    }
/* 55 */            long j2 = ((SharedPreferences) this.f17248a).getLong("fire-count", 0L);
/* 67 */            if (j2 + 1 == 30) {
/* 69 */                m8895b();
/* 78 */                j2 = ((SharedPreferences) this.f17248a).getLong("fire-count", 0L);
                    }
/* 97 */            HashSet hashSet = new HashSet(((SharedPreferences) this.f17248a).getStringSet(str, new HashSet()));
/* 100 */           hashSet.add(strM8901k);
/* 128 */           ((SharedPreferences) this.f17248a).edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strM8901k).commit();
                }

                /* JADX INFO: renamed from: G */
                public synchronized void m8893G(String str, String str2) {
/* 2 */             m8889C(str2);
/* 20 */            HashSet hashSet = new HashSet(((SharedPreferences) this.f17248a).getStringSet(str, new HashSet()));
/* 23 */            hashSet.add(str2);
/* 38 */            ((SharedPreferences) this.f17248a).edit().putStringSet(str, hashSet).commit();
                }

                /* JADX INFO: renamed from: I */
                public fk0 m8894I(Activity activity) {
/* 6 */             C2562zs c2562zs = new C2562zs(this, activity, null, 8);
/* 11 */            C1846g c1846g = C1846g.f12919a;
/* 16 */            C2149rm c2149rm = new C2149rm(c2562zs, c1846g, -2, EnumC2464xk.f19232a);
/* 19 */            m60 m60Var = z80.f19975a;
/* 21 */            kt0 kt0Var = gb1.f8531a;
/* 29 */            if (kt0Var.get(xt0.f19368w) == null) {
                        return kt0Var.equals(c1846g) ? c2149rm : b40.m1228l(c2149rm, kt0Var, 0, null, 6);
                    }
/* 47 */            C1951n4.m6867r(kt0Var, "Flow context cannot contain job in it. Had ");
/* 5 */             return null;
                }

                @Override // p000.e73
                /* JADX INFO: renamed from: a */
                public String[] mo2990a() {
/* 5 */             return ((WebViewProviderFactoryBoundaryInterface) this.f17248a).getSupportedFeatures();
                }

                /* JADX INFO: renamed from: b */
                public synchronized void m8895b() {
                    try {
/* 10 */                long j = ((SharedPreferences) this.f17248a).getLong("fire-count", 0L);
/* 14 */                String key = HttpUrl.FRAGMENT_ENCODE_SET;
/* 32 */                String str = null;
/* 37 */                for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f17248a).getAll().entrySet()) {
/* 51 */                    if (entry.getValue() instanceof Set) {
/* 67 */                        for (String str2 : (Set) entry.getValue()) {
/* 75 */                            if (str == null || str.compareTo(str2) > 0) {
/* 86 */                                key = entry.getKey();
/* 92 */                                str = str2;
                                    }
                                }
                            }
                        }
/* 109 */               HashSet hashSet = new HashSet(((SharedPreferences) this.f17248a).getStringSet(key, new HashSet()));
/* 112 */               hashSet.remove(str);
/* 136 */               ((SharedPreferences) this.f17248a).edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
                    } catch (Throwable th) {
/* 142 */               throw th;
                    }
                }

                @Override // p000.hg1
                /* JADX INFO: renamed from: c */
                public boolean mo3404c(jg1 jg1Var, MenuItem menuItem) {
/* 1 */             return false;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p000.fk0
                public Object collect(hk0 hk0Var, c10 c10Var) throws Throwable {
                    C1872l c1872l;
                    w52 w52Var;
/* 3 */             if (c10Var instanceof C1872l) {
/* 6 */                 c1872l = (C1872l) c10Var;
/* 8 */                 int i = c1872l.f13059d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    c1872l.f13059d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    c1872l = new C1872l(this, c10Var);
                        }
                    } else {
/* 22 */                c1872l = new C1872l(this, c10Var);
                    }
/* 25 */            Object obj = c1872l.f13057b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = c1872l.f13059d;
/* 32 */            if (i2 != 0) {
/* 34 */                if (i2 != 1) {
/* 46 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 49 */                    return null;
                        }
/* 36 */                w52Var = c1872l.f13056a;
                        try {
/* 38 */                    pg3.m7417A(obj);
/* 84 */                    w52Var.releaseIntercepted();
/* 87 */                    return Unit.f12910a;
                        } catch (Throwable th) {
/* 42 */                    th = th;
/* 96 */                    w52Var.releaseIntercepted();
/* 99 */                    throw th;
                        }
                    }
/* 51 */            pg3.m7417A(obj);
/* 60 */            w52 w52Var2 = new w52(hk0Var, c1872l.getContext());
                    try {
/* 63 */                c1872l.f13056a = w52Var2;
/* 65 */                c1872l.f13059d = 1;
                        try {
/* 71 */                    Object objInvoke = ((Function2) this.f17248a).invoke(w52Var2, c1872l);
/* 75 */                    if (objInvoke != z10Var) {
/* 78 */                        objInvoke = Unit.f12910a;
                            }
/* 80 */                    if (objInvoke == z10Var) {
/* 82 */                        return z10Var;
                            }
/* 83 */                    w52Var = w52Var2;
/* 84 */                    w52Var.releaseIntercepted();
/* 87 */                    return Unit.f12910a;
                        } catch (Throwable th2) {
/* 91 */                    th = th2;
/* 92 */                    w52Var = w52Var2;
/* 96 */                    w52Var.releaseIntercepted();
/* 99 */                    throw th;
                        }
                    } catch (Throwable th3) {
/* 94 */                th = th3;
                    }
                }

                @Override // p000.e73
                public WebViewProviderBoundaryInterface createWebView(WebView webView) {
/* 15 */            return (WebViewProviderBoundaryInterface) j13.m5642b(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f17248a).createWebView(webView));
                }

                /* JADX INFO: renamed from: d */
                public void m8896d(int[] iArr, int i) {
                    int[] iArr2;
                    int[] iArr3;
                    wc0 wc0Var;
                    wc0 wc0Var2;
                    wc0 wc0Var3;
                    int iM9600b;
                    int i2;
/* 5 */             int i3 = i;
/* 9 */             wq0 wq0Var = (wq0) this.f17248a;
/* 12 */            if (iArr.length == 0) {
/* 645 */               f42.m3649e();
/* 648 */               return;
                    }
/* 14 */            int length = iArr.length;
/* 15 */            int i4 = 0;
/* 16 */            int i5 = 1;
/* 17 */            if (length <= 1 || iArr[0] != 0) {
/* 48 */                iArr2 = iArr;
                    } else {
/* 23 */                int i6 = 1;
/* 24 */                while (i6 < length && iArr[i6] == 0) {
/* 30 */                    i6++;
                        }
/* 33 */                if (i6 == length) {
/* 35 */                    iArr2 = new int[]{0};
                        } else {
/* 40 */                    int i7 = length - i6;
/* 41 */                    int[] iArr4 = new int[i7];
/* 43 */                    System.arraycopy(iArr, i6, iArr4, 0, i7);
/* 46 */                    iArr2 = iArr4;
                        }
                    }
/* 49 */            int[] iArr5 = new int[i3];
/* 52 */            boolean z = true;
/* 53 */            for (int i8 = 0; i8 < i3; i8++) {
/* 60 */                int i9 = wq0Var.f18733a[wq0Var.f18739g + i8];
/* 62 */                if (i9 == 0) {
/* 66 */                    i2 = iArr2[iArr2.length - 1];
                        } else {
/* 69 */                    if (i9 == 1) {
/* 72 */                        iM9600b = 0;
/* 74 */                        for (int i10 : iArr2) {
/* 78 */                            wq0 wq0Var2 = wq0.f18732h;
/* 80 */                            iM9600b ^= i10;
                                }
                            } else {
/* 86 */                        iM9600b = iArr2[0];
/* 88 */                        int length2 = iArr2.length;
/* 90 */                        for (int i11 = 1; i11 < length2; i11++) {
/* 98 */                            iM9600b = wq0Var.m9600b(i9, iM9600b) ^ iArr2[i11];
                                }
                            }
/* 84 */                    i2 = iM9600b;
                        }
/* 105 */               iArr5[(i3 - 1) - i8] = i2;
/* 107 */               if (i2 != 0) {
/* 109 */                   z = false;
                        }
                    }
/* 113 */           if (z) {
/* 624 */               return;
                    }
/* 119 */           wc0 wc0Var4 = new wc0(wq0Var, iArr5);
/* 122 */           wq0Var.getClass();
/* 125 */           wc0 wc0Var5 = wq0Var.f18735c;
/* 127 */           if (i3 < 0) {
/* 641 */               f42.m3649e();
/* 644 */               return;
                    }
/* 131 */           int[] iArr6 = new int[i3 + 1];
/* 133 */           iArr6[0] = 1;
/* 137 */           wc0 wc0Var6 = new wc0(wq0Var, iArr6);
/* 148 */           if (wc0Var6.m9548w() >= wc0Var4.m9548w()) {
/* 153 */               wc0Var6 = wc0Var4;
/* 154 */               wc0Var4 = wc0Var6;
                    }
/* 159 */           wc0 wc0VarM9530e = wc0Var4;
/* 160 */           wc0 wc0Var7 = wc0Var6;
/* 156 */           wc0 wc0Var8 = wq0Var.f18736d;
/* 162 */           wc0 wc0Var9 = wc0Var5;
/* 169 */           while (wc0Var7.m9548w() >= i3 / 2) {
/* 175 */               if (wc0Var7.m9550z()) {
/* 442 */                   throw new d22("r_{i-1} was zero");
                        }
/* 185 */               int iM9599a = wq0Var.m9599a(wc0Var7.m9547v(wc0Var7.m9548w()));
/* 189 */               wc0 wc0VarM9530e2 = wc0Var5;
/* 198 */               while (wc0VarM9530e.m9548w() >= wc0Var7.m9548w() && !wc0VarM9530e.m9550z()) {
/* 214 */                   int iM9548w = wc0VarM9530e.m9548w() - wc0Var7.m9548w();
/* 223 */                   int iM9600b2 = wq0Var.m9600b(wc0VarM9530e.m9547v(wc0VarM9530e.m9548w()), iM9599a);
/* 227 */                   if (iM9548w < 0) {
/* 306 */                       f42.m3649e();
/* 309 */                       return;
                            }
/* 229 */                   if (iM9600b2 == 0) {
/* 231 */                       wc0Var2 = wc0Var5;
                            } else {
/* 235 */                       int[] iArr7 = new int[iM9548w + 1];
/* 237 */                       iArr7[i4] = iM9600b2;
/* 241 */                       wc0Var2 = new wc0(wq0Var, iArr7);
                            }
/* 244 */                   wc0VarM9530e2 = wc0VarM9530e2.m9530e(wc0Var2);
/* 250 */                   int[] iArr8 = (int[]) wc0Var7.f18578c;
/* 254 */                   wq0 wq0Var3 = (wq0) wc0Var7.f18577b;
/* 256 */                   if (iM9548w < 0) {
/* 302 */                       f42.m3649e();
/* 305 */                       return;
                            }
/* 258 */                   if (iM9600b2 == 0) {
/* 260 */                       wc0Var3 = wq0Var3.f18735c;
                            } else {
/* 267 */                       int length3 = iArr8.length;
/* 269 */                       int[] iArr9 = new int[iM9548w + length3];
/* 271 */                       while (i4 < length3) {
/* 279 */                           iArr9[i4] = wq0Var3.m9600b(iArr8[i4], iM9600b2);
/* 281 */                           i4++;
                                }
/* 288 */                       wc0Var3 = new wc0(wq0Var3, iArr9);
                            }
/* 292 */                   wc0VarM9530e = wc0VarM9530e.m9530e(wc0Var3);
/* 296 */                   i4 = 0;
/* 297 */                   i5 = i5;
                        }
/* 310 */               int i12 = i5;
/* 314 */               wq0 wq0Var4 = (wq0) wc0VarM9530e2.f18577b;
/* 324 */               if (!wq0Var4.equals((wq0) wc0Var8.f18577b)) {
/* 431 */                   C1951n4.m6859j("GenericGFPolys do not have same GenericGF field");
/* 434 */                   return;
                        }
/* 330 */               if (wc0VarM9530e2.m9550z() || wc0Var8.m9550z()) {
/* 395 */                   wc0Var = wq0Var4.f18735c;
                        } else {
/* 341 */                   int[] iArr10 = (int[]) wc0VarM9530e2.f18578c;
/* 343 */                   int length4 = iArr10.length;
/* 346 */                   int[] iArr11 = (int[]) wc0Var8.f18578c;
/* 348 */                   int length5 = iArr11.length;
/* 353 */                   int[] iArr12 = new int[(length4 + length5) - 1];
/* 356 */                   for (int i13 = 0; i13 < length4; i13++) {
/* 358 */                       int i14 = iArr10[i13];
/* 360 */                       int i15 = 0;
/* 361 */                       while (i15 < length5) {
/* 363 */                           int i16 = i13 + i15;
/* 377 */                           iArr12[i16] = iArr12[i16] ^ wq0Var4.m9600b(i14, iArr11[i15]);
/* 379 */                           i15++;
/* 381 */                           iArr10 = iArr10;
                                }
                            }
/* 391 */                   wc0Var = new wc0(wq0Var4, iArr12);
                        }
/* 397 */               wc0 wc0VarM9530e3 = wc0Var.m9530e(wc0Var9);
/* 409 */               if (wc0VarM9530e.m9548w() >= wc0Var7.m9548w()) {
/* 425 */                   f42.m3656l("Division algorithm failed to reduce polynomial?");
/* 428 */                   return;
                        }
/* 411 */               wc0 wc0Var10 = wc0VarM9530e;
/* 412 */               wc0VarM9530e = wc0Var7;
/* 413 */               wc0Var7 = wc0Var10;
/* 414 */               i4 = 0;
/* 415 */               i5 = i12;
/* 417 */               wc0Var9 = wc0Var8;
/* 418 */               wc0Var8 = wc0VarM9530e3;
/* 419 */               i3 = i;
                    }
/* 443 */           int i17 = i4;
/* 444 */           int i18 = i5;
/* 446 */           int iM9547v = wc0Var8.m9547v(i17);
/* 450 */           if (iM9547v == 0) {
/* 640 */               throw new d22("sigmaTilde(0) was zero");
                    }
/* 452 */           int iM9599a2 = wq0Var.m9599a(iM9547v);
/* 464 */           wc0[] wc0VarArr = {wc0Var8.m9524A(iM9599a2), wc0Var7.m9524A(iM9599a2)};
/* 468 */           wc0 wc0Var11 = wc0VarArr[i17];
/* 470 */           wc0 wc0Var12 = wc0VarArr[i18];
/* 472 */           int iM9548w2 = wc0Var11.m9548w();
/* 478 */           if (iM9548w2 == i18) {
/* 484 */               iArr3 = new int[]{wc0Var11.m9547v(i18)};
                    } else {
/* 489 */               int[] iArr13 = new int[iM9548w2];
/* 491 */               int i19 = i17;
/* 495 */               for (int i20 = 1; i20 < wq0Var.f18737e && i19 < iM9548w2; i20++) {
/* 503 */                   if (wc0Var11.m9545t(i20) == 0) {
/* 509 */                       iArr13[i19] = wq0Var.m9599a(i20);
/* 511 */                       i19++;
                            }
                        }
/* 516 */               if (i19 != iM9548w2) {
/* 632 */                   throw new d22("Error locator degree does not match number of roots");
                        }
/* 518 */               iArr3 = iArr13;
                    }
/* 519 */           int length6 = iArr3.length;
/* 520 */           int[] iArr14 = new int[length6];
/* 523 */           for (int i21 = i17; i21 < length6; i21++) {
/* 527 */               int iM9599a3 = wq0Var.m9599a(iArr3[i21]);
/* 532 */               int iM9600b3 = 1;
/* 533 */               for (int i22 = i17; i22 < length6; i22++) {
/* 535 */                   if (i21 != i22) {
/* 539 */                       int iM9600b4 = wq0Var.m9600b(iArr3[i22], iM9599a3);
/* 552 */                       iM9600b3 = wq0Var.m9600b(iM9600b3, (iM9600b4 & 1) == 0 ? iM9600b4 | 1 : iM9600b4 & (-2));
                            }
                        }
/* 567 */               int iM9600b5 = wq0Var.m9600b(wc0Var12.m9545t(iM9599a3), wq0Var.m9599a(iM9600b3));
/* 571 */               iArr14[i21] = iM9600b5;
/* 575 */               if (wq0Var.f18739g != 0) {
/* 581 */                   iArr14[i21] = wq0Var.m9600b(iM9600b5, iM9599a3);
                        }
                    }
/* 587 */           while (i17 < iArr3.length) {
/* 591 */               int length7 = iArr.length - 1;
/* 592 */               int i23 = iArr3[i17];
/* 594 */               if (i23 == 0) {
/* 621 */                   f42.m3649e();
/* 624 */                   return;
                        }
/* 600 */               int i24 = length7 - wq0Var.f18734b[i23];
/* 601 */               if (i24 < 0) {
/* 620 */                   throw new d22("Bad error location");
                        }
/* 608 */               iArr[i24] = iArr[i24] ^ iArr14[i17];
/* 610 */               i17++;
                    }
                }

                /* JADX INFO: renamed from: e */
                public synchronized void m8897e() {
                    try {
/* 6 */                 SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f17248a).edit();
/* 26 */                int i = 0;
/* 31 */                for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f17248a).getAll().entrySet()) {
/* 45 */                    if (entry.getValue() instanceof Set) {
/* 51 */                        Set set = (Set) entry.getValue();
/* 57 */                        String strM8901k = m8901k(System.currentTimeMillis());
/* 61 */                        String key = entry.getKey();
/* 71 */                        if (set.contains(strM8901k)) {
/* 75 */                            HashSet hashSet = new HashSet();
/* 78 */                            hashSet.add(strM8901k);
/* 81 */                            i++;
/* 83 */                            editorEdit.putStringSet(key, hashSet);
                                } else {
/* 89 */                            editorEdit.remove(key);
                                }
                            }
                        }
/* 93 */                if (i == 0) {
/* 97 */                    editorEdit.remove("fire-count");
                        } else {
/* 104 */                   editorEdit.putLong("fire-count", i);
                        }
/* 107 */               editorEdit.commit();
                    } catch (Throwable th) {
/* 113 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: g */
                public void m8898g(nz2 nz2Var) {
                    Unit unit;
                    UCImageView uCImageView;
                    ig2 ig2Var;
                    ig2 ig2Var2;
/* 3 */             ra2 ra2Var = (ra2) this.f17248a;
/* 7 */             s03 s03Var = (s03) ra2Var.f15957c;
/* 9 */             if (s03Var != null) {
/* 11 */                s03Var.invoke(nz2Var);
                    }
/* 15 */            ra2Var.f15957c = null;
/* 20 */            rz2 rz2Var = (rz2) ra2Var.f15956b;
/* 22 */            if (rz2Var != null) {
/* 24 */                ys2 ys2Var = rz2Var.f16365i;
/* 26 */                if (ys2Var != null) {
/* 39 */                    n33 n33Var = (n33) new m33(ys2Var.f19810d).iterator();
/* 45 */                    if (!n33Var.hasNext()) {
/* 108 */                       throw new NoSuchElementException("Sequence is empty.");
                            }
/* 51 */                    View view = (View) n33Var.next();
/* 55 */                    if (view instanceof qu2) {
/* 65 */                        UCImageView uCImageView2 = (UCImageView) ((LinearLayoutCompat) view).findViewById(R$id.ucFirstLayerHeaderLogo);
/* 67 */                        if (uCImageView2 != null && (ig2Var2 = uCImageView2.f6250c) != null) {
/* 73 */                            ig2Var2.cancel(null);
                                }
                            } else if ((view instanceof wv2) && (uCImageView = (UCImageView) ((LinearLayoutCompat) view).findViewById(R$id.ucHeaderLogo)) != null && (ig2Var = uCImageView.f6250c) != null) {
/* 97 */                        ig2Var.cancel(null);
                            }
                        }
/* 109 */               bt2 bt2Var = rz2Var.f16366j;
/* 111 */               if (bt2Var != null) {
/* 124 */                   v11 v11Var = new v11(0, rz2Var, rz2.class, "dismissDialogEffectively", "dismissDialogEffectively()V", 0, 7);
/* 129 */                   if (bt2Var.f2601e) {
/* 133 */                       Slide slide = new Slide();
/* 138 */                       slide.f1883l0 = Slide.f1882t0;
/* 142 */                       slide.m1079M(80);
/* 147 */                       slide.f1897c = 300L;
/* 149 */                       ys2 ys2Var2 = bt2Var.f2600d;
/* 151 */                       slide.mo1091b(ys2Var2);
/* 154 */                       lr2.m6525a(ys2Var2, slide);
/* 158 */                       ys2Var2.setVisibility(4);
/* 164 */                       Fade fade = new Fade(2);
/* 167 */                       fade.f1897c = 300L;
/* 173 */                       fade.mo1091b(bt2Var.m1432a());
/* 182 */                       fade.m1090a(new pn0(v11Var, 1));
/* 189 */                       lr2.m6525a(bt2Var.m1432a(), fade);
/* 196 */                       bt2Var.m1432a().setVisibility(4);
                            } else {
/* 200 */                       v11Var.invoke();
                            }
/* 203 */                   unit = Unit.f12910a;
                        } else {
/* 206 */                   unit = null;
                        }
/* 207 */               if (unit == null) {
/* 209 */                   rz2Var.m8338b();
                        }
                    }
/* 212 */           ra2Var.f15956b = null;
/* 214 */           ra2Var.f15957c = null;
/* 216 */           qu1.f15756b = null;
/* 224 */           qu1.f15759e = r51.m8065b(C2498yh.f19622e0);
/* 226 */           qu1.f15757c = null;
                }

                @Override // javax.inject.Provider
                public Object get() {
/* 25 */            return new k72((Context) ((Provider) this.f17248a).get(), "com.google.android.datatransport.events", Integer.valueOf(k72.f12633d).intValue());
                }

                @Override // p000.e73
                public DropDataContentProviderBoundaryInterface getDropDataProvider() {
/* 15 */            return (DropDataContentProviderBoundaryInterface) j13.m5642b(DropDataContentProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f17248a).getDropDataProvider());
                }

                @Override // p000.e73
                public ProxyControllerBoundaryInterface getProxyController() {
/* 15 */            return (ProxyControllerBoundaryInterface) j13.m5642b(ProxyControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f17248a).getProxyController());
                }

                @Override // p000.e73
                public StaticsBoundaryInterface getStatics() {
/* 15 */            return (StaticsBoundaryInterface) j13.m5642b(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f17248a).getStatics());
                }

                @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
                public String[] getSupportedFeatures() {
/* 5 */             return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
                }

                @Override // p000.e73
                public TracingControllerBoundaryInterface getTracingController() {
/* 15 */            return (TracingControllerBoundaryInterface) j13.m5642b(TracingControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f17248a).getTracingController());
                }

                @Override // p000.e73
                public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
/* 15 */            return (WebkitToCompatConverterBoundaryInterface) j13.m5642b(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f17248a).getWebkitToCompatConverter());
                }

                /* JADX INFO: renamed from: h */
                public synchronized ArrayList m8899h() {
                    try {
/* 4 */                 ArrayList arrayList = new ArrayList();
/* 27 */                for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f17248a).getAll().entrySet()) {
/* 41 */                    if (entry.getValue() instanceof Set) {
/* 51 */                        HashSet hashSet = new HashSet((Set) entry.getValue());
/* 62 */                        hashSet.remove(m8901k(System.currentTimeMillis()));
/* 69 */                        if (!hashSet.isEmpty()) {
/* 87 */                            arrayList.add(new C2291vf(entry.getKey(), new ArrayList(hashSet)));
                                }
                            }
                        }
/* 93 */                long jCurrentTimeMillis = System.currentTimeMillis();
                        synchronized (this) {
/* 112 */                   ((SharedPreferences) this.f17248a).edit().putLong("fire-global", jCurrentTimeMillis).commit();
                        }
/* 117 */               return arrayList;
                    } catch (Throwable th) {
/* 122 */               throw th;
                    }
/* 117 */           return arrayList;
                }

                /* JADX INFO: renamed from: i */
                public boolean m8900i(String str) {
/* 1 */             String strM8911x = m8911x(str);
                    return "1".equals(strM8911x) || Boolean.parseBoolean(strM8911x);
                }

                @Override // p000.InterfaceC2091q1
                /* JADX INFO: renamed from: j */
                public boolean mo2236j(View view) {
/* 5 */             ra2 ra2Var = (ra2) this.f17248a;
/* 12 */            int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
/* 15 */            ViewPager2 viewPager2 = (ViewPager2) ra2Var.f15958d;
/* 19 */            if (viewPager2.f2021f0) {
/* 21 */                viewPager2.m1142c(currentItem);
                    }
/* 11 */            return true;
                }

                /* JADX INFO: renamed from: k */
                public synchronized String m8901k(long j) {
/* 6 */             if (Build.VERSION.SDK_INT < 26) {
/* 53 */                return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
                    }
/* 1 */             Instant instant = new Date(j).toInstant();
/* 1 */             ZoneOffset unused = ZoneOffset.UTC;
/* 1 */             LocalDateTime localDateTime = instant.atOffset(ZoneOffset.UTC).toLocalDateTime();
/* 1 */             DateTimeFormatter unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
/* 3 */             return localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
                }

                @Override // p000.hg1
                /* JADX INFO: renamed from: l */
                public void mo3407l(jg1 jg1Var) {
/* 3 */             xp2 xp2Var = (xp2) this.f17248a;
/* 9 */             boolean zM409o = xp2Var.f19302a.f762a.m409o();
/* 13 */            Window.Callback callback = xp2Var.f19303b;
/* 17 */            if (zM409o) {
/* 19 */                callback.onPanelClosed(108, jg1Var);
                    } else if (callback.onPreparePanel(0, null, jg1Var)) {
/* 31 */                callback.onMenuOpened(108, jg1Var);
                    }
                }

                /* JADX INFO: renamed from: m */
                public Integer m8902m(String str) {
/* 1 */             String strM8911x = m8911x(str);
/* 9 */             if (TextUtils.isEmpty(strM8911x)) {
/* 56 */                return null;
                    }
                    try {
/* 15 */                return Integer.valueOf(Integer.parseInt(strM8911x));
                    } catch (NumberFormatException unused) {
/* 53 */                AbstractC1245n0.m4889q("NotificationParams", "Couldn't parse value of " + m8885H(str) + "(" + strM8911x + ") into an int");
/* 56 */                return null;
                    }
                }

                /* JADX INFO: renamed from: n */
                public JSONArray m8903n(String str) {
/* 1 */             String strM8911x = m8911x(str);
/* 9 */             if (TextUtils.isEmpty(strM8911x)) {
/* 53 */                return null;
                    }
                    try {
/* 13 */                return new JSONArray(strM8911x);
                    } catch (JSONException unused) {
/* 50 */                AbstractC1245n0.m4889q("NotificationParams", "Malformed JSON for key " + m8885H(str) + ": " + strM8911x + ", falling back to default");
/* 53 */                return null;
                    }
                }

                /* JADX INFO: renamed from: o */
                public int[] m8904o() {
/* 9 */             JSONArray jSONArrayM8903n = m8903n("gcm.n.light_settings");
/* 14 */            if (jSONArrayM8903n == null) {
/* 13 */                return null;
                    }
/* 18 */            int[] iArr = new int[3];
                    try {
/* 24 */                if (jSONArrayM8903n.length() != 3) {
/* 73 */                    throw new JSONException("lightSettings don't have all three fields");
                        }
/* 31 */                int color = Color.parseColor(jSONArrayM8903n.optString(0));
/* 37 */                if (color == -16777216) {
/* 65 */                    throw new IllegalArgumentException("Transparent color is invalid");
                        }
/* 39 */                iArr[0] = color;
/* 46 */                iArr[1] = jSONArrayM8903n.optInt(1);
/* 53 */                iArr[2] = jSONArrayM8903n.optInt(2);
/* 55 */                return iArr;
                    } catch (IllegalArgumentException e) {
/* 101 */               AbstractC1245n0.m4889q("NotificationParams", "LightSettings is invalid: " + jSONArrayM8903n + ". " + e.getMessage() + ". Skipping setting LightSettings");
/* 13 */                return null;
                    } catch (JSONException unused) {
/* 120 */               AbstractC1245n0.m4889q("NotificationParams", "LightSettings is invalid: " + jSONArrayM8903n + ". Skipping setting LightSettings");
/* 13 */                return null;
                    }
                }

                @Override // p000.InterfaceC0919fj
                public void onBillingServiceDisconnected() {
/* 5 */             AbstractC1245n0.m4889q("PurchaseManagerGoogle", "->onBillingServiceDisconnected()");
/* 10 */            PurchaseManagerGoogle purchaseManagerGoogle = (PurchaseManagerGoogle) this.f17248a;
/* 12 */            C1795jj c1795jjM6120a = C1833kj.m6120a();
/* 17 */            c1795jjM6120a.f12324a = 3;
/* 21 */            c1795jjM6120a.f12325b = "onBillingServiceDisconnected";
/* 27 */            purchaseManagerGoogle.f5883u = c1795jjM6120a.m5841a();
                }

                @Override // p000.InterfaceC0919fj
                public void onBillingSetupFinished(C1833kj c1833kj) {
/* 5 */             AbstractC1245n0.m4889q("PurchaseManagerGoogle", "->onBillingSetupFinished()");
/* 10 */            if (c1833kj.f12818a != 0) {
/* 38 */                AbstractC1245n0.m4889q("PurchaseManagerGoogle", "billing init is not ok: " + c1833kj.f12818a + " ; debug message :" + c1833kj.f12819b);
                    }
/* 43 */            PurchaseManagerGoogle purchaseManagerGoogle = (PurchaseManagerGoogle) this.f17248a;
/* 46 */            purchaseManagerGoogle.f5884v = true;
/* 48 */            purchaseManagerGoogle.f5883u = c1833kj;
/* 50 */            purchaseManagerGoogle.m2742b(true);
                }

                @Override // p000.xo0
                public void onFailure(Throwable th) throws Exception {
/* 5 */             ((mw0) this.f17248a).close();
                }

                @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
                public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
/* 9 */             i63 i63VarM4118a = h63.m4118a((WebMessageBoundaryInterface) j13.m5642b(WebMessageBoundaryInterface.class, invocationHandler));
/* 13 */            if (i63VarM4118a != null) {
/* 21 */                JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) j13.m5642b(JsReplyProxyBoundaryInterface.class, invocationHandler2);
/* 44 */                ((x63) this.f17248a).onPostMessage(webView, i63VarM4118a, uri, z, (e01) jsReplyProxyBoundaryInterface.getOrCreatePeer(new CallableC2139rc(jsReplyProxyBoundaryInterface, 2)));
                    }
                }

                @Override // p000.xo0
                public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                }

                @Override // p000.j53
                /* JADX INFO: renamed from: p */
                public m83 mo3876p(View view, m83 m83Var, k53 k53Var) {
                    boolean fitsSystemWindows;
                    boolean fitsSystemWindows2;
/* 1 */             j83 j83Var = m83Var.f13660a;
/* 5 */             NavigationRailView navigationRailView = (NavigationRailView) this.f17248a;
/* 7 */             Boolean bool = navigationRailView.f4841v;
/* 9 */             if (bool != null) {
/* 11 */                fitsSystemWindows = bool.booleanValue();
                    } else {
/* 16 */                WeakHashMap weakHashMap = e33.f7494a;
/* 18 */                fitsSystemWindows = navigationRailView.getFitsSystemWindows();
                    }
/* 23 */            if (fitsSystemWindows) {
/* 34 */                k53Var.f12606b += j83Var.mo2970f(7).f13529b;
                    }
/* 36 */            Boolean bool2 = navigationRailView.f4842w;
/* 38 */            if (bool2 != null) {
/* 40 */                fitsSystemWindows2 = bool2.booleanValue();
                    } else {
/* 45 */                WeakHashMap weakHashMap2 = e33.f7494a;
/* 47 */                fitsSystemWindows2 = navigationRailView.getFitsSystemWindows();
                    }
/* 51 */            if (fitsSystemWindows2) {
/* 62 */                k53Var.f12608d += j83Var.mo2970f(7).f13531d;
                    }
/* 64 */            WeakHashMap weakHashMap3 = e33.f7494a;
/* 71 */            boolean z = view.getLayoutDirection() == 1;
/* 75 */            int iM6622b = m83Var.m6622b();
/* 79 */            int iM6623c = m83Var.m6623c();
/* 83 */            int i = k53Var.f12605a;
/* 85 */            if (z) {
/* 87 */                iM6622b = iM6623c;
                    }
/* 88 */            int i2 = i + iM6622b;
/* 89 */            k53Var.f12605a = i2;
/* 97 */            view.setPaddingRelative(i2, k53Var.f12606b, k53Var.f12607c, k53Var.f12608d);
/* 100 */           return m83Var;
                }

                /* JADX INFO: renamed from: q */
                public Object[] m8905q(String str) {
/* 7 */             JSONArray jSONArrayM8903n = m8903n(str.concat("_loc_args"));
/* 11 */            if (jSONArrayM8903n == null) {
/* 13 */                return null;
                    }
/* 15 */            int length = jSONArrayM8903n.length();
/* 19 */            String[] strArr = new String[length];
/* 22 */            for (int i = 0; i < length; i++) {
/* 28 */                strArr[i] = jSONArrayM8903n.optString(i);
                    }
/* 33 */            return strArr;
                }

                /* JADX INFO: renamed from: r */
                public String m8906r(String str) {
/* 7 */             return m8911x(str.concat("_loc_key"));
                }

                /* JADX INFO: renamed from: s */
                public Long m8907s() {
/* 3 */             String strM8911x = m8911x("gcm.n.event_time");
/* 11 */            if (TextUtils.isEmpty(strM8911x)) {
/* 58 */                return null;
                    }
                    try {
/* 17 */                return Long.valueOf(Long.parseLong(strM8911x));
                    } catch (NumberFormatException unused) {
/* 55 */                AbstractC1245n0.m4889q("NotificationParams", "Couldn't parse value of " + m8885H("gcm.n.event_time") + "(" + strM8911x + ") into a long");
/* 58 */                return null;
                    }
                }

                /* JADX INFO: renamed from: t */
                public String m8908t(int i, String str) {
/* 11 */            String strM3589r = ((er0) ((er0) this.f17248a).f7853b).m3589r("notification_content");
/* 21 */            JSONObject jSONObject = null;
/* 22 */            if (!b40.m1232p(strM3589r)) {
                        try {
/* 27 */                    jSONObject = new JSONObject(strM3589r);
                        } catch (Exception e) {
/* 35 */                    xe2.m9777o("genricDataMngr", "Error in reading unread count notification content", e);
                        }
                    }
/* 40 */            if (jSONObject == null) {
/* 38 */                return "You have new messages";
                    }
                    try {
/* 57 */                return jSONObject.getString(str).replace(jSONObject.getString("placeholder"), String.valueOf(i));
                    } catch (Exception e2) {
/* 65 */                xe2.m9777o("genricDataMngr", "Error in constructing unread count string", e2);
/* 38 */                return "You have new messages";
                    }
                }

                /* JADX INFO: renamed from: u */
                public String m8909u(Resources resources, String str, String str2) {
/* 1 */             String strM8911x = m8911x(str2);
/* 9 */             if (!TextUtils.isEmpty(strM8911x)) {
/* 11 */                return strM8911x;
                    }
/* 12 */            String strM8906r = m8906r(str2);
/* 21 */            if (TextUtils.isEmpty(strM8906r)) {
/* 20 */                return null;
                    }
/* 26 */            int identifier = resources.getIdentifier(strM8906r, "string", str);
/* 34 */            if (identifier == 0) {
/* 69 */                AbstractC1245n0.m4889q("NotificationParams", m8885H(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
/* 20 */                return null;
                    }
/* 73 */            Object[] objArrM8905q = m8905q(str2);
/* 77 */            if (objArrM8905q == null) {
/* 79 */                return resources.getString(identifier);
                    }
                    try {
/* 84 */                return resources.getString(identifier, objArrM8905q);
                    } catch (MissingFormatArgumentException e) {
/* 123 */               AbstractC1245n0.m4891s("NotificationParams", "Missing format argument for " + m8885H(str2) + ": " + Arrays.toString(objArrM8905q) + " Default value will be used.", e);
/* 20 */                return null;
                    }
                }

                /* JADX INFO: renamed from: v */
                public synchronized String m8910v(String str) {
/* 22 */            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f17248a).getAll().entrySet()) {
/* 36 */                if (entry.getValue() instanceof Set) {
/* 44 */                    Iterator it = ((Set) entry.getValue()).iterator();
/* 52 */                    while (it.hasNext()) {
/* 64 */                        if (str.equals((String) it.next())) {
/* 66 */                            return entry.getKey();
                                }
                            }
                        }
                    }
/* 77 */            return null;
                }

                @Override // p000.InterfaceC2299vm
                /* JADX INFO: renamed from: w */
                public Object mo1148w(C2260um c2260um) {
/* 3 */             f81 f81Var = (f81) this.f17248a;
/* 14 */            de3.m3028j("The result can only set once!", f81Var.f8044f == null);
/* 17 */            f81Var.f8044f = c2260um;
/* 34 */            return "ListFuture[" + this + "]";
                }

                /* JADX INFO: renamed from: x */
                public String m8911x(String str) {
/* 3 */             Bundle bundle = (Bundle) this.f17248a;
/* 9 */             if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
/* 29 */                String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
/* 37 */                if (bundle.containsKey(strReplace)) {
/* 39 */                    str = strReplace;
                        }
                    }
/* 40 */            return bundle.getString(str);
                }

                /* JADX INFO: renamed from: y */
                public long[] m8912y() {
/* 3 */             JSONArray jSONArrayM8903n = m8903n("gcm.n.vibrate_timings");
/* 8 */             if (jSONArrayM8903n == null) {
/* 7 */                 return null;
                    }
                    try {
/* 16 */                if (jSONArrayM8903n.length() <= 1) {
/* 44 */                    throw new JSONException("vibrateTimings have invalid length");
                        }
/* 18 */                int length = jSONArrayM8903n.length();
/* 22 */                long[] jArr = new long[length];
/* 25 */                for (int i = 0; i < length; i++) {
/* 31 */                    jArr[i] = jSONArrayM8903n.optLong(i);
                        }
/* 36 */                return jArr;
                    } catch (NumberFormatException | JSONException unused) {
/* 66 */                AbstractC1245n0.m4889q("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayM8903n + ". Skipping setting vibrateTimings.");
/* 7 */                 return null;
                    }
                }

/* 20 */        public /* synthetic */ ts0(Object obj) {
/* 21 */            this.f17248a = obj;
                }
            }
