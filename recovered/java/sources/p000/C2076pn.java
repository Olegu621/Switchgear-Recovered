            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentSender;
            import android.content.pm.ApplicationInfo;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.graphics.SurfaceTexture;
            import android.os.Trace;
            import android.util.Size;
            import android.view.Surface;
            import com.google.android.gms.tasks.Continuation;
            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import com.google.firebase.FirebaseCommonRegistrar;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.firebase.messaging.EnhancedIntentService;
            import com.supercell.p007id.scid_plugin.MobileScanner;
            import com.supercell.p007id.scid_plugin.PlayStoreCountryCallback;
            import com.supercell.p007id.scid_plugin.PlayStoreCountryObserver;
            import com.supercell.titan.SentryTitan;
            import io.flutter.Build;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.view.TextureRegistry;
            import io.sentry.AbstractC1552m4;
            import io.sentry.C1387c;
            import io.sentry.C1393c5;
            import io.sentry.C1486i0;
            import io.sentry.C1554m6;
            import io.sentry.C1671t3;
            import io.sentry.C1748x6;
            import io.sentry.InterfaceC1156a1;
            import io.sentry.InterfaceC1159a4;
            import io.sentry.InterfaceC1389c1;
            import io.sentry.InterfaceC1427d4;
            import io.sentry.InterfaceC1549m1;
            import io.sentry.InterfaceC1753y3;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.android.core.ActivityLifecycleIntegration;
            import io.sentry.android.core.AlertDialogC1270s1;
            import io.sentry.android.core.C1184e;
            import io.sentry.android.core.InterfaceC1243m1;
            import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC1205g;
            import io.sentry.instrumentation.file.C1498e;
            import io.sentry.instrumentation.file.C1500g;
            import io.sentry.instrumentation.file.InterfaceC1494a;
            import io.sentry.protocol.C1626w;
            import java.io.IOException;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.ListIterator;
            import java.util.Map;
            import java.util.Random;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicReference;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: pn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 303 */   public final /* synthetic */ class C2076pn implements InterfaceC2251ud, InterfaceC0934fy, OnCompleteListener, uw1, nw0, InterfaceC2299vm, Continuation, q52, InterfaceC1427d4, bk2, InterfaceC1159a4, InterfaceC1243m1, InterfaceC1494a, InterfaceC1753y3 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15181a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f15182b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f15183c;

                public /* synthetic */ C2076pn(int i, Object obj, Object obj2) {
/* 1 */             this.f15181a = i;
/* 3 */             this.f15182b = obj;
/* 5 */             this.f15183c = obj2;
                }

                @Override // io.sentry.InterfaceC1753y3
                /* JADX INFO: renamed from: a */
                public void mo4802a(C1671t3 c1671t3) {
/* 3 */             InterfaceC1156a1 interfaceC1156a1 = (InterfaceC1156a1) this.f15182b;
/* 7 */             C1554m6 c1554m6 = (C1554m6) this.f15183c;
/* 11 */            C1387c c1387c = (C1387c) c1671t3.f11671e;
/* 15 */            if (c1387c.f10776f) {
/* 17 */                C1671t3 c1671t3Mo4708u = interfaceC1156a1.mo4708u();
/* 21 */                C1626w c1626wMo4696i = interfaceC1156a1.mo4696i();
/* 35 */                c1387c.m5076d("sentry-trace_id", ((C1626w) c1671t3Mo4708u.f11668b).m5380a());
/* 46 */                c1387c.m5076d("sentry-public_key", c1554m6.retrieveParsedDsn().f11845b);
/* 55 */                c1387c.m5076d("sentry-release", c1554m6.getRelease());
/* 64 */                c1387c.m5076d("sentry-environment", c1554m6.getEnvironment());
/* 73 */                if (!C1626w.f11478b.equals(c1626wMo4696i)) {
/* 81 */                    c1387c.m5076d("sentry-replay_id", c1626wMo4696i.m5380a());
                        }
/* 90 */                c1387c.m5076d("sentry-org_id", c1554m6.getEffectiveOrgId());
/* 96 */                c1387c.m5076d("sentry-transaction", null);
/* 101 */               if (c1387c.f10776f) {
/* 103 */                   c1387c.f10773c = null;
                        }
/* 107 */               c1387c.m5076d("sentry-sampled", null);
/* 111 */               c1387c.f10776f = false;
                    }
                }

                @Override // p000.q52
                public Object apply(Object obj) {
/* 3 */             s52 s52Var = (s52) this.f15182b;
/* 7 */             C2497yg c2497yg = (C2497yg) this.f15183c;
/* 10 */            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
/* 12 */            C2179sf c2179sf = s52Var.f16434d;
/* 16 */            ArrayList arrayListM8406h = s52Var.m8406h(sQLiteDatabase, c2497yg, c2179sf.f16555b);
/* 27 */            for (px1 px1Var : px1.values()) {
/* 33 */                if (px1Var != c2497yg.f19602c) {
/* 42 */                    int size = c2179sf.f16555b - arrayListM8406h.size();
/* 43 */                    if (size <= 0) {
                                break;
                            }
/* 46 */                    C0875ec c0875ecM10147a = C2497yg.m10147a();
/* 52 */                    c0875ecM10147a.m3373L(c2497yg.f19600a);
/* 55 */                    if (px1Var == null) {
/* 79 */                        C1951n4.m6868s("Null priority");
/* 82 */                        return null;
                            }
/* 57 */                    c0875ecM10147a.f7615d = px1Var;
/* 61 */                    c0875ecM10147a.f7614c = c2497yg.f19601b;
/* 71 */                    arrayListM8406h.addAll(s52Var.m8406h(sQLiteDatabase, c0875ecM10147a.m3390m(), size));
                        }
                    }
/* 86 */            HashMap map = new HashMap();
/* 93 */            StringBuilder sb = new StringBuilder("event_id IN (");
/* 102 */           for (int i = 0; i < arrayListM8406h.size(); i++) {
/* 112 */               sb.append(((C0990hg) arrayListM8406h.get(i)).f9063a);
/* 120 */               if (i < arrayListM8406h.size() - 1) {
/* 124 */                   sb.append(',');
                        }
                    }
/* 132 */           sb.append(')');
/* 155 */           Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", FirebaseAnalytics.Param.VALUE}, sb.toString(), null, null, null, null);
/* 163 */           while (cursorQuery.moveToNext()) {
                        try {
/* 165 */                   long j = cursorQuery.getLong(0);
/* 177 */                   Set hashSet = (Set) map.get(Long.valueOf(j));
/* 179 */                   if (hashSet == null) {
/* 183 */                       hashSet = new HashSet();
/* 190 */                       map.put(Long.valueOf(j), hashSet);
                            }
/* 207 */                   hashSet.add(new r52(cursorQuery.getString(1), cursorQuery.getString(2)));
                        } catch (Throwable th) {
/* 301 */                   cursorQuery.close();
/* 304 */                   throw th;
                        }
                    }
/* 211 */           cursorQuery.close();
/* 214 */           ListIterator listIterator = arrayListM8406h.listIterator();
/* 222 */           while (listIterator.hasNext()) {
/* 228 */               C0990hg c0990hg = (C0990hg) listIterator.next();
/* 230 */               long j2 = c0990hg.f9063a;
/* 240 */               if (map.containsKey(Long.valueOf(j2))) {
/* 245 */                   xy1 xy1VarM8154c = c0990hg.f9065c.m8154c();
/* 267 */                   for (r52 r52Var : (Set) map.get(Long.valueOf(j2))) {
/* 279 */                       xy1VarM8154c.m10040c(r52Var.f15881a, r52Var.f15882b);
                            }
/* 294 */                   listIterator.set(new C0990hg(j2, c0990hg.f9064b, xy1VarM8154c.m10041d()));
                        }
                    }
/* 298 */           return arrayListM8406h;
                }

                @Override // io.sentry.android.core.InterfaceC1243m1
                /* JADX INFO: renamed from: b */
                public void mo4872b() {
/* 3 */             AlertDialogC1270s1 alertDialogC1270s1 = (AlertDialogC1270s1) this.f15182b;
/* 13 */            Activity activity = (Activity) ((WeakReference) this.f15183c).get();
/* 15 */            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
/* 39 */                return;
                    }
/* 36 */            activity.runOnUiThread(new ji1(24, alertDialogC1270s1, activity));
                }

                @Override // io.sentry.InterfaceC1159a4
                /* JADX INFO: renamed from: c */
                public void mo4715c(InterfaceC1549m1 interfaceC1549m1) {
/* 1 */             int i = this.f15181a;
/* 3 */             Object obj = this.f15183c;
/* 5 */             Object obj2 = this.f15182b;
                    switch (i) {
                        case 19:
/* 34 */                    InterfaceC1156a1 interfaceC1156a1 = (InterfaceC1156a1) obj;
/* 36 */                    if (interfaceC1549m1 == ((C1748x6) obj2)) {
/* 38 */                        interfaceC1156a1.mo4703p();
                            }
                            break;
                        case 20:
/* 24 */                    InterfaceC1156a1 interfaceC1156a2 = (InterfaceC1156a1) obj;
/* 26 */                    if (interfaceC1549m1 == ((InterfaceC1549m1) obj2)) {
/* 28 */                        interfaceC1156a2.mo4703p();
                            }
                            break;
                        default:
/* 12 */                    InterfaceC1156a1 interfaceC1156a3 = (InterfaceC1156a1) obj;
/* 16 */                    if (interfaceC1549m1 == ((GestureDetectorOnGestureListenerC1205g) obj2).f10092e) {
/* 18 */                        interfaceC1156a3.mo4703p();
                            }
                            break;
                    }
                }

                @Override // io.sentry.instrumentation.file.InterfaceC1494a
                public Object call() throws IOException {
/* 1 */             int i = this.f15181a;
/* 3 */             Object obj = this.f15183c;
/* 5 */             Object obj2 = this.f15182b;
                    switch (i) {
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 59 */                    return Integer.valueOf(((C1498e) obj2).f11030a.read((byte[]) obj));
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 31 */                    int i2 = ((C1498e) obj2).f11030a.read();
/* 35 */                    ((AtomicInteger) obj).set(i2);
/* 44 */                    return Integer.valueOf(i2 != -1 ? 1 : 0);
                        default:
/* 12 */                    byte[] bArr = (byte[]) obj;
/* 16 */                    ((C1500g) obj2).f11034a.write(bArr);
/* 20 */                    return Integer.valueOf(bArr.length);
                    }
                }

                @Override // p000.InterfaceC0934fy
                public Object create(InterfaceC0824cy interfaceC0824cy) {
/* 1 */             int i = this.f15181a;
/* 3 */             Object obj = this.f15183c;
/* 7 */             String str = (String) this.f15182b;
                    switch (i) {
                        case 2:
/* 147 */                   C2197sx c2197sx = (C2197sx) obj;
                            try {
/* 149 */                       Trace.beginSection(str);
/* 154 */                       return c2197sx.f16836f.create(interfaceC0824cy);
                            } finally {
/* 163 */                       Trace.endSection();
                            }
                        default:
/* 22 */                    Context context = (Context) ((C0168b5) interfaceC0824cy).get(Context.class);
/* 24 */                    int i2 = ((s80) obj).f16471a;
/* 26 */                    String strValueOf = HttpUrl.FRAGMENT_ENCODE_SET;
                            switch (i2) {
                                case 10:
/* 129 */                           ApplicationInfo applicationInfo = context.getApplicationInfo();
/* 133 */                           if (applicationInfo != null) {
/* 137 */                               strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                                    }
                                    break;
                                case 11:
/* 116 */                           ApplicationInfo applicationInfo2 = context.getApplicationInfo();
/* 120 */                           if (applicationInfo2 != null) {
/* 124 */                               strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                                    }
                                    break;
                                case 12:
/* 60 */                            if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
/* 62 */                                strValueOf = "tv";
                                    } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
/* 77 */                                strValueOf = "watch";
                                    } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
/* 92 */                                strValueOf = "auto";
                                    } else if (android.os.Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
/* 113 */                               strValueOf = "embedded";
                                    }
                                    break;
                                default:
/* 39 */                            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
/* 43 */                            if (installerPackageName != null) {
/* 45 */                                strValueOf = FirebaseCommonRegistrar.m2513a(installerPackageName);
                                    }
                                    break;
                            }
/* 143 */                   return new C2549zf(str, strValueOf);
                    }
                }

                @Override // p000.uw1
                /* JADX INFO: renamed from: d */
                public void mo6870d(rj2 rj2Var) {
/* 1 */             int i = this.f15181a;
/* 3 */             Object obj = this.f15183c;
/* 5 */             Object obj2 = this.f15182b;
                    switch (i) {
                        case 6:
/* 18 */                    fj1 fj1Var = (fj1) obj2;
/* 20 */                    Executor executor = (Executor) obj;
/* 22 */                    rj2Var.getClass();
/* 25 */                    Size size = rj2Var.f16122b;
/* 29 */                    if (fj1Var.f8242v != null || fj1Var.f8243w != null) {
/* 36 */                        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = fj1Var.f8227U;
/* 38 */                        surfaceTextureEntry.getClass();
/* 41 */                        SurfaceTexture surfaceTexture = surfaceTextureEntry.surfaceTexture();
/* 45 */                        surfaceTexture.getClass();
/* 56 */                        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
/* 70 */                        rj2Var.m8190a(new Surface(surfaceTexture), executor, new C1863kr(5));
                            }
                            break;
                        default:
/* 1 */                     MobileScanner.start$lambda$5$lambda$2((MobileScanner) obj2, (Executor) obj, rj2Var);
                            break;
                    }
                }

                @Override // io.sentry.InterfaceC1427d4
                /* JADX INFO: renamed from: e */
                public void mo4804e(InterfaceC1156a1 interfaceC1156a1) {
/* 1 */             int i = this.f15181a;
/* 3 */             Object obj = this.f15183c;
/* 5 */             Object obj2 = this.f15182b;
                    switch (i) {
                        case 14:
/* 38 */                    SentryTitan.EventAttachment[] eventAttachmentArr = (SentryTitan.EventAttachment[]) obj2;
/* 40 */                    C1393c5 c1393c5 = (C1393c5) obj;
/* 42 */                    Random random = SentryTitan.f5920a;
/* 44 */                    if (eventAttachmentArr != null) {
/* 48 */                        for (SentryTitan.EventAttachment eventAttachment : eventAttachmentArr) {
/* 56 */                            interfaceC1156a1.mo4697j(eventAttachment.toSentryAttachment());
                                }
                            }
/* 62 */                    InterfaceC1389c1 interfaceC1389c1M5357b = AbstractC1552m4.m5357b();
/* 66 */                    interfaceC1389c1M5357b.getClass();
/* 74 */                    interfaceC1389c1M5357b.mo5080B(c1393c5, new C1486i0());
                            break;
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 34 */                    interfaceC1156a1.mo4683G(new C1184e((ActivityLifecycleIntegration) obj2, interfaceC1156a1, (InterfaceC1549m1) obj));
                            break;
                        default:
/* 21 */                    interfaceC1156a1.mo4683G(new C2080pr(10, (GestureDetectorOnGestureListenerC1205g) obj2, interfaceC1156a1, (InterfaceC1549m1) obj));
                            break;
                    }
                }

                @Override // p000.bk2
                public Object execute() {
/* 1 */             int i = this.f15181a;
/* 4 */             Object obj = this.f15183c;
/* 8 */             f31 f31Var = (f31) this.f15182b;
                    switch (i) {
                        case 17:
/* 63 */                    Iterable iterable = (Iterable) obj;
/* 67 */                    s52 s52Var = (s52) f31Var.f7985c;
/* 69 */                    s52Var.getClass();
/* 80 */                    if (iterable.iterator().hasNext()) {
/* 101 */                       s52Var.m8404c().compileStatement("DELETE FROM events WHERE _id in ".concat(s52.m8402l(iterable))).execute();
                            }
                            break;
                        default:
/* 27 */                    for (Map.Entry entry : ((HashMap) obj).entrySet()) {
/* 58 */                        ((s52) f31Var.f7991i).m8407i(((Integer) entry.getValue()).intValue(), ca1.INVALID_PAYLOD, (String) entry.getKey());
                            }
                            break;
                    }
/* 3 */             return null;
                }

                @Override // p000.nw0
                /* JADX INFO: renamed from: f */
                public void mo6871f(ow0 ow0Var) {
/* 1 */             int i = this.f15181a;
/* 3 */             Object obj = this.f15183c;
/* 5 */             Object obj2 = this.f15182b;
                    switch (i) {
                        case 8:
/* 22 */                    ((nw0) obj).mo6871f((fs0) obj2);
                            break;
                        default:
/* 14 */                    ((nw0) obj).mo6871f((C1767ir) obj2);
                            break;
                    }
                }

                /* JADX INFO: renamed from: g */
                public void m7497g(C1833kj c1833kj, C0956gj c0956gj) {
/* 1 */             PlayStoreCountryObserver.queryBillingConfig$lambda$1((PlayStoreCountryCallback) this.f15182b, (PlayStoreCountryObserver) this.f15183c, c1833kj, c0956gj);
                }

                /* JADX INFO: renamed from: h */
                public void m7498h(C2292vg c2292vg) {
/* 3 */             x60 x60Var = (x60) this.f15182b;
/* 24 */            pp0 pp0Var = (((rj2) this.f15183c).f16123c.m6634a() && c2292vg.f18049d) ? pp0.f15228c : pp0.f15227b;
/* 26 */            jq1 jq1Var = x60Var.f18962a;
/* 31 */            sp0.m8593d(jq1Var.f12424a, true);
/* 36 */            sp0.m8592c(jq1Var.f12426c);
/* 41 */            if (jq1Var.f12435l != pp0Var) {
/* 43 */                jq1Var.f12435l = pp0Var;
/* 47 */                jq1Var.m5891k(jq1Var.f12436m);
                    }
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task task) {
                    Activity activity;
/* 1 */             int i = this.f15181a;
/* 3 */             Object obj = this.f15183c;
/* 5 */             Object obj2 = this.f15182b;
                    switch (i) {
                        case 4:
/* 79 */                    int i2 = EnhancedIntentService.f5293a;
/* 81 */                    ((EnhancedIntentService) obj2).m2524a((Intent) obj);
                            break;
                        default:
/* 10 */                    MethodChannel.Result result = (MethodChannel.Result) obj2;
/* 12 */                    hf2 hf2Var = (hf2) obj;
/* 14 */                    task.getClass();
/* 21 */                    if (!task.isSuccessful()) {
/* 29 */                        Exception exception = task.getException();
/* 35 */                        if ((exception instanceof t32) && ((t32) exception).getStatusCode() == 6 && (activity = hf2Var.f9057b) != null) {
                                    try {
/* 51 */                                hf2Var.f9060e = result;
/* 57 */                                ((t32) exception).m8685a(activity, 11102);
                                    } catch (IntentSender.SendIntentException e) {
/* 66 */                                AbstractC1245n0.m4877e("Pinput/SmartAuth", "Failed to send resolution.", e);
                                    }
                                }
/* 71 */                        result.success(Boolean.FALSE);
                            } else {
/* 25 */                        result.success(Boolean.TRUE);
                            }
                            break;
                    }
                }

                @Override // com.google.android.gms.tasks.Continuation
                public Object then(Task task) {
/* 3 */             wc0 wc0Var = (wc0) this.f15182b;
/* 7 */             String str = (String) this.f15183c;
                    synchronized (wc0Var) {
/* 14 */                ((C1024id) wc0Var.f18578c).remove(str);
                    }
/* 18 */            return task;
                }

                @Override // p000.InterfaceC2299vm
                /* JADX INFO: renamed from: w */
                public Object mo1148w(C2260um c2260um) {
                    switch (this.f15181a) {
                        case 10:
/* 43 */                    sx1 sx1Var = (sx1) this.f15182b;
/* 47 */                    C2303vq c2303vq = (C2303vq) this.f15183c;
/* 49 */                    sx1Var.getClass();
                            synchronized (sx1Var.f16852a) {
/* 79 */                        RunnableC1901ls runnableC1901lsM9399I = w11.m9399I(yo0.m10162b(tw0.f17292c), new C2357x6(new C1983o(c2303vq, 14), 11), pg3.m7428g());
/* 100 */                       runnableC1901lsM9399I.mo3676a(new dp0(0, runnableC1901lsM9399I, new wc0(26, c2260um, c2303vq)), pg3.m7428g());
                            }
/* 104 */                   return "ProcessCameraProvider-initializeCameraX";
                        default:
/* 8 */                     rj2 rj2Var = (rj2) this.f15182b;
/* 14 */                    ((AtomicReference) this.f15183c).set(c2260um);
/* 36 */                    return "SurfaceRequest-surface-recreation(" + rj2Var.hashCode() + ")";
                    }
                }

                @Override // p000.InterfaceC2251ud
                /* JADX INFO: renamed from: apply, reason: collision with other method in class */
/* 304 */       public s81 mo10660apply(Object obj) {
                    C2154rr c2154rr = (C2154rr) this.f15182b;
                    uw0 uw0Var = (uw0) this.f15183c;
/* 305 */           c2154rr.m8229a();
/* 306 */           uw0Var.mo2951a();
/* 307 */           return c2154rr.m8237j();
                }
            }
