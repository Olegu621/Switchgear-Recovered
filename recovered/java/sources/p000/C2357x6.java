            package p000;

            import android.app.Activity;
            import android.content.ClipData;
            import android.content.Intent;
            import android.database.sqlite.SQLiteDatabase;
            import android.hardware.SensorManager;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.util.Log;
            import android.view.View;
            import androidx.appcompat.widget.AppCompatEditText;
            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.OnSuccessListener;
            import com.google.android.gms.tasks.Task;
            import com.supercell.p007id.scid_plugin.MobileScanner;
            import com.supercell.titan.agesignals.AgeSignals;
            import io.flutter.embedding.android.KeyboardManager;
            import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
            import io.flutter.plugin.common.BasicMessageChannel;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.util.ViewUtils;
            import io.sentry.C1764z6;
            import io.sentry.InterfaceC1156a1;
            import io.sentry.InterfaceC1427d4;
            import io.sentry.InterfaceC1549m1;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.android.core.C1191g0;
            import io.sentry.android.core.C1289z0;
            import io.sentry.android.core.FeedbackShakeIntegration;
            import io.sentry.android.core.InterfaceC1243m1;
            import java.io.BufferedReader;
            import java.io.BufferedWriter;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.io.OutputStream;
            import java.io.OutputStreamWriter;
            import java.lang.ref.WeakReference;
            import java.net.ConnectException;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.net.UnknownHostException;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.zip.GZIPInputStream;
            import java.util.zip.GZIPOutputStream;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.Call;
            import okhttp3.EventListener;
            import okhttp3.internal.Util;
            
            /* JADX INFO: renamed from: x6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public final /* synthetic */ class C2357x6 implements OnSuccessListener, fp1, lv0, KeyEventChannel.EventResponseHandler, BasicMessageChannel.Reply, nw0, InterfaceC2251ud, so0, MethodChannel.MethodCallHandler, bk2, EventListener.Factory, ViewUtils.ViewVisitor, OnCompleteListener, InterfaceC1427d4, InterfaceC1243m1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18960a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f18961b;

                public /* synthetic */ C2357x6(int i, Object obj, Object obj2) {
/* 1 */             this.f18960a = i;
/* 3 */             this.f18961b = obj2;
                }

                @Override // p000.lv0
                /* JADX INFO: renamed from: a */
                public void mo6538a(wb2 wb2Var) throws Exception {
/* 1 */             int i = this.f18960a;
/* 3 */             Object obj = this.f18961b;
                    switch (i) {
                        case 4:
/* 74 */                    ((lv0) obj).mo6538a(wb2Var);
                            break;
                        case 9:
/* 14 */                    fj1 fj1Var = (fj1) obj;
/* 22 */                    if (wb2Var.f2998b.mo1724P0() != null) {
/* 28 */                        int iM3769a = fj1Var.m3769a();
/* 34 */                        if (fj1Var.f8234a0 != iM3769a) {
/* 36 */                            fj1Var.f8234a0 = iM3769a;
/* 44 */                            fj1Var.f8237c.invoke(Integer.valueOf(iM3769a));
                                }
/* 49 */                        if (!fj1Var.f8232Z) {
/* 51 */                            wb2Var.close();
                                } else {
/* 68 */                            i13.m4443w(fj1Var.f8228V, null, new C0871e8(fj1Var, wb2Var, null), 3).start();
                                }
                            } else {
/* 24 */                        wb2Var.close();
                            }
                            break;
                        default:
/* 1 */                     MobileScanner.captureOutput$lambda$0((MobileScanner) obj, wb2Var);
                            break;
                    }
                }

                @Override // p000.InterfaceC2251ud
                /* JADX INFO: renamed from: apply */
                public s81 mo10660apply(Object obj) {
/* 1 */             int i = this.f18960a;
/* 3 */             Object obj2 = this.f18961b;
                    switch (i) {
                        case 11:
/* 81 */                    return (s81) ((C1983o) obj2).invoke(obj);
                        default:
/* 8 */                     ArrayList arrayList = (ArrayList) obj2;
/* 10 */                    List list = (List) obj;
/* 12 */                    Objects.toString(list);
/* 17 */                    hu0.m4312F0("SyncCaptureSessionBase");
/* 25 */                    if (list.isEmpty()) {
/* 36 */                        return new tw0(new IllegalArgumentException("Unable to open capture session without surfaces"), 1);
                            }
                            return list.contains(null) ? new tw0(new c70("Surface closed", (d70) arrayList.get(list.indexOf(null))), 1) : w11.m9450t(list);
                    }
                }

                @Override // io.sentry.android.core.InterfaceC1243m1
                /* JADX INFO: renamed from: b */
                public void mo4872b() {
/* 3 */             FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.f18961b;
/* 5 */             WeakReference weakReference = feedbackShakeIntegration.f9863d;
/* 16 */            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
/* 19 */            Boolean bool = C1191g0.f10017e.f10021d;
/* 21 */            if (activity == null || feedbackShakeIntegration.f9862c == null || feedbackShakeIntegration.f9864e || Boolean.TRUE.equals(bool)) {
/* 49 */                return;
                    }
/* 46 */            activity.runOnUiThread(new ji1(22, feedbackShakeIntegration, activity));
                }

                /* JADX INFO: renamed from: c */
                public C0176bd m9712c(C0875ec c0875ec) {
/* 7 */             C0154as c0154as = (C0154as) this.f18961b;
/* 11 */            URL url = (URL) c0875ec.f7613b;
/* 24 */            if (Log.isLoggable(py0.m7607l0("CctTransportBackend"), 4)) {
/* 32 */                String.format("Making request to: %s", url);
                    }
/* 39 */            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
/* 43 */            httpURLConnection.setConnectTimeout(30000);
/* 48 */            httpURLConnection.setReadTimeout(c0154as.f2071g);
/* 52 */            httpURLConnection.setDoOutput(true);
/* 56 */            httpURLConnection.setInstanceFollowRedirects(false);
/* 61 */            httpURLConnection.setRequestMethod("POST");
/* 68 */            httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
/* 75 */            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
/* 82 */            httpURLConnection.setRequestProperty("Content-Type", "application/json");
/* 87 */            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
/* 92 */            String str = (String) c0875ec.f7615d;
/* 94 */            if (str != null) {
/* 98 */                httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                    }
                    try {
/* 101 */               OutputStream outputStream = httpURLConnection.getOutputStream();
                        try {
/* 107 */                   GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                            try {
/* 110 */                       fs0 fs0Var = c0154as.f2065a;
/* 114 */                       C0214cf c0214cf = (C0214cf) c0875ec.f7614c;
/* 123 */                       BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
/* 130 */                       i11 i11Var = (i11) fs0Var.f8339b;
/* 145 */                       l21 l21Var = new l21(bufferedWriter, i11Var.f9395a, i11Var.f9396b, i11Var.f9397c, i11Var.f9398d);
/* 148 */                       l21Var.m6329f(c0214cf);
/* 151 */                       l21Var.m6331h();
/* 156 */                       l21Var.f13079b.flush();
/* 159 */                       gZIPOutputStream.close();
/* 162 */                       if (outputStream != null) {
/* 164 */                           outputStream.close();
                                }
/* 182 */                       int responseCode = httpURLConnection.getResponseCode();
/* 186 */                       Integer numValueOf = Integer.valueOf(responseCode);
/* 198 */                       if (Log.isLoggable(py0.m7607l0("CctTransportBackend"), 4)) {
/* 206 */                           String.format("Status Code: %d", numValueOf);
                                }
/* 215 */                       py0.m7593P("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
/* 224 */                       py0.m7593P("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
/* 229 */                       if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
/* 350 */                           return new C0176bd(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                                }
/* 242 */                       if (responseCode != 200) {
/* 249 */                           return new C0176bd(responseCode, null, 0L);
                                }
/* 253 */                       InputStream inputStream = httpURLConnection.getInputStream();
                                try {
/* 273 */                           InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                    try {
/* 293 */                               C0176bd c0176bd = new C0176bd(responseCode, null, C0843dg.m3056a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f7171a);
/* 296 */                               if (gZIPInputStream != null) {
/* 298 */                                   gZIPInputStream.close();
                                        }
/* 305 */                               if (inputStream != null) {
/* 307 */                                   inputStream.close();
                                        }
/* 310 */                               return c0176bd;
                                    } catch (Throwable th) {
/* 313 */                               if (gZIPInputStream == null) {
/* 323 */                                   throw th;
                                        }
                                        try {
/* 315 */                                   gZIPInputStream.close();
/* 323 */                                   throw th;
                                        } catch (Throwable th2) {
/* 320 */                                   th.addSuppressed(th2);
/* 323 */                                   throw th;
                                        }
                                    }
                                } catch (Throwable th3) {
/* 324 */                           if (inputStream == null) {
/* 334 */                               throw th3;
                                    }
                                    try {
/* 326 */                               inputStream.close();
/* 334 */                               throw th3;
                                    } catch (Throwable th4) {
/* 331 */                               th3.addSuppressed(th4);
/* 334 */                               throw th3;
                                    }
                                }
                            } catch (Throwable th5) {
                                try {
/* 361 */                           gZIPOutputStream.close();
/* 369 */                           throw th5;
                                } catch (Throwable th6) {
/* 366 */                           th5.addSuppressed(th6);
/* 369 */                           throw th5;
                                }
                            }
                        } catch (Throwable th7) {
/* 370 */                   if (outputStream == null) {
/* 380 */                       throw th7;
                            }
                            try {
/* 372 */                       outputStream.close();
/* 380 */                       throw th7;
                            } catch (Throwable th8) {
/* 377 */                       th7.addSuppressed(th8);
/* 380 */                       throw th7;
                            }
                        }
                    } catch (ConnectException e) {
/* 180 */               e = e;
/* 399 */               py0.m7595R("CctTransportBackend", "Couldn't open connection, returning with 500", e);
/* 406 */               return new C0176bd(500, null, 0L);
                    } catch (UnknownHostException e2) {
/* 174 */               e = e2;
/* 399 */               py0.m7595R("CctTransportBackend", "Couldn't open connection, returning with 500", e);
/* 406 */               return new C0176bd(500, null, 0L);
                    } catch (IOException e3) {
/* 168 */               e = e3;
/* 383 */               py0.m7595R("CctTransportBackend", "Couldn't encode request, returning with 400", e);
/* 393 */               return new C0176bd(400, null, 0L);
                    } catch (wd0 e4) {
/* 171 */               e = e4;
/* 383 */               py0.m7595R("CctTransportBackend", "Couldn't encode request, returning with 400", e);
/* 393 */               return new C0176bd(400, null, 0L);
                    }
                }

                @Override // okhttp3.EventListener.Factory
                public EventListener create(Call call) {
/* 1 */             return Util.m10634asFactory$lambda8((EventListener) this.f18961b, call);
                }

                /* JADX INFO: renamed from: d */
                public boolean m9713d(ts0 ts0Var, int i, Bundle bundle) {
                    i00 gr0Var;
/* 3 */             AppCompatEditText appCompatEditText = (AppCompatEditText) this.f18961b;
/* 5 */             int i2 = Build.VERSION.SDK_INT;
/* 11 */            if (i2 >= 25 && (i & 1) != 0) {
                        try {
/* 20 */                    ((fy0) ts0Var.f17248a).mo3379b();
/* 31 */                    Parcelable parcelable = (Parcelable) ((fy0) ts0Var.f17248a).mo3381d();
/* 43 */                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
/* 49 */                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
                        } catch (Exception e) {
/* 58 */                    AbstractC1245n0.m4891s("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
/* 9 */                     return false;
                        }
                    }
/* 66 */            fy0 fy0Var = (fy0) ts0Var.f17248a;
/* 81 */            ClipData clipData = new ClipData(fy0Var.getDescription(), new ClipData.Item(fy0Var.mo3378a()));
/* 87 */            if (i2 >= 31) {
/* 91 */                gr0Var = new gr0(clipData, 2);
                    } else {
/* 97 */                j00 j00Var = new j00();
/* 100 */               j00Var.f11980b = clipData;
/* 102 */               j00Var.f11981c = 2;
                        gr0Var = j00Var;
                    }
/* 108 */           gr0Var.mo3992d(fy0Var.mo3380c());
/* 111 */           gr0Var.setExtras(bundle);
                    return e33.m3313i(appCompatEditText, gr0Var.build()) == null;
                }

                @Override // io.sentry.InterfaceC1427d4
                /* JADX INFO: renamed from: e */
                public void mo4804e(InterfaceC1156a1 interfaceC1156a1) {
                    C1764z6 c1764z6Mo4705r;
                    Date date;
/* 1 */             int i = this.f18960a;
/* 3 */             Object obj = this.f18961b;
                    switch (i) {
                        case 24:
/* 65 */                    ((AtomicReference) obj).set(interfaceC1156a1.mo4696i());
                            break;
                        case io.flutter.Build.API_LEVELS.API_25 /* 25 */:
                        default:
/* 10 */                    AtomicLong atomicLong = ((C1289z0) obj).f10396a;
/* 20 */                    if (atomicLong.get() == 0 && (c1764z6Mo4705r = interfaceC1156a1.mo4705r()) != null && (date = c1764z6Mo4705r.f11860a) != null) {
/* 36 */                        atomicLong.set(date.getTime());
                                break;
                            }
                            break;
                        case io.flutter.Build.API_LEVELS.API_26 /* 26 */:
/* 55 */                    interfaceC1156a1.mo4710x((String) obj);
                            break;
                        case io.flutter.Build.API_LEVELS.API_27 /* 27 */:
/* 49 */                    interfaceC1156a1.mo4683G(new C2076pn(20, (InterfaceC1549m1) obj, interfaceC1156a1));
                            break;
                    }
                }

                @Override // p000.bk2
                public Object execute() {
/* 1 */             int i = this.f18960a;
/* 4 */             Object obj = this.f18961b;
                    switch (i) {
                        case 16:
/* 58 */                    s52 s52Var = (s52) ((f31) obj).f7991i;
/* 60 */                    SQLiteDatabase sQLiteDatabaseM8404c = s52Var.m8404c();
/* 64 */                    sQLiteDatabaseM8404c.beginTransaction();
                            try {
/* 73 */                        sQLiteDatabaseM8404c.compileStatement("DELETE FROM log_event_dropped").execute();
/* 100 */                       sQLiteDatabaseM8404c.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + s52Var.f16432b.mo7340a()).execute();
/* 103 */                       sQLiteDatabaseM8404c.setTransactionSuccessful();
/* 3 */                         return null;
                            } finally {
/* 111 */                       sQLiteDatabaseM8404c.endTransaction();
                            }
                        default:
/* 9 */                     ra2 ra2Var = (ra2) obj;
/* 27 */                    Iterator it = ((Iterable) ((s52) ra2Var.f15956b).m8405g(new f42(2))).iterator();
/* 35 */                    while (it.hasNext()) {
/* 49 */                        ((C0875ec) ra2Var.f15957c).m3372K((C2497yg) it.next(), 1, false);
                            }
/* 3 */                     return null;
                    }
                }

                @Override // p000.nw0
                /* JADX INFO: renamed from: f */
                public void mo6871f(ow0 ow0Var) throws Exception {
/* 1 */             int i = this.f18960a;
/* 3 */             Object obj = this.f18961b;
                    switch (i) {
                        case 8:
/* 52 */                    li1 li1Var = (li1) obj;
                            synchronized (li1Var.f13304a) {
/* 61 */                        li1Var.f13306c++;
                                break;
                            }
/* 64 */                    li1Var.m6456i(ow0Var);
/* 67 */                    return;
                        default:
/* 8 */                     zr0 zr0Var = (zr0) obj;
/* 10 */                    zr0Var.getClass();
                            try {
/* 13 */                        mw0 mw0VarAcquireLatestImage = ow0Var.acquireLatestImage();
/* 17 */                        if (mw0VarAcquireLatestImage != null) {
/* 23 */                            ((ac1) zr0Var.f20300e).m181k(mw0VarAcquireLatestImage);
/* 51 */                            return;
                                }
/* 51 */                        return;
                            } catch (IllegalStateException e) {
/* 48 */                        hu0.m4325T("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e.getMessage());
/* 51 */                        return;
                            }
                    }
                }

                /* JADX INFO: renamed from: g */
                public void m9714g(C1833kj c1833kj, List list) {
/* 5 */             ((tz1) this.f18961b).mo3210e(c1833kj, list);
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task task) {
/* 1 */             int i = this.f18960a;
/* 3 */             Object obj = this.f18961b;
                    switch (i) {
                        case 19:
/* 26 */                    yy1.m10217l((Intent) obj);
                            break;
                        case 20:
/* 20 */                    ((b93) obj).f2332b.trySetResult(null);
                            break;
                        default:
/* 11 */                    ((ScheduledFuture) obj).cancel(false);
                            break;
                    }
                }

                @Override // io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler
                public void onFrameworkResponse(boolean z) {
/* 1 */             ((KeyboardManager.Responder.OnKeyEventHandledCallback) this.f18961b).onKeyEventHandled(z);
                }

                @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                    jh2 jh2Var;
/* 3 */             o92 o92Var = (o92) this.f18961b;
/* 5 */             methodCall.getClass();
/* 8 */             result.getClass();
/* 11 */            String str = methodCall.method;
/* 14 */            if (str != null) {
                        switch (str) {
                            case "setAccelerationSamplingPeriod":
/* 93 */                        jh2Var = o92Var.f14684f;
/* 95 */                        if (jh2Var == null) {
/* 100 */                           Intrinsics.m6220e("accelerometerStreamHandler");
/* 103 */                           throw null;
                                }
                            case "setMagnetometerSamplingPeriod":
/* 73 */                        jh2Var = o92Var.f14687w;
/* 75 */                        if (jh2Var == null) {
/* 80 */                            Intrinsics.m6220e("magnetometerStreamHandler");
/* 83 */                            throw null;
                                }
                            case "setUserAccelerometerSamplingPeriod":
/* 53 */                        jh2Var = o92Var.f14685i;
/* 55 */                        if (jh2Var == null) {
/* 60 */                            Intrinsics.m6220e("userAccelStreamHandler");
/* 63 */                            throw null;
                                }
                            case "setGyroscopeSamplingPeriod":
/* 33 */                        jh2Var = o92Var.f14686v;
/* 35 */                        if (jh2Var == null) {
/* 40 */                            Intrinsics.m6220e("gyroscopeStreamHandler");
/* 43 */                            throw null;
                                }
                            default:
/* 104 */                       jh2Var = null;
                                break;
                        }
                    } else {
/* 104 */               jh2Var = null;
                    }
/* 105 */           if (jh2Var != null) {
/* 107 */               Object obj = methodCall.arguments;
/* 109 */               obj.getClass();
/* 118 */               jh2Var.f12311e = ((Integer) obj).intValue();
/* 120 */               SensorManager sensorManager = jh2Var.f12307a;
/* 122 */               ih2 ih2Var = jh2Var.f12309c;
/* 124 */               if (ih2Var != null) {
/* 126 */                   sensorManager.unregisterListener(ih2Var);
/* 135 */                   sensorManager.registerListener(jh2Var.f12309c, jh2Var.f12310d, jh2Var.f12311e);
                        }
                    }
/* 138 */           if (jh2Var != null) {
/* 140 */               result.success(null);
                    } else {
/* 144 */               result.notImplemented();
                    }
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(Object obj) {
/* 3 */             C0899f c0899f = (C0899f) this.f18961b;
/* 5 */             int i = AgeSignals.MAX_RETRIES;
/* 7 */             c0899f.invoke(obj);
                }

                @Override // p000.fp1
                /* JADX INFO: renamed from: q */
                public void mo3429q(Object obj) {
/* 5 */             ((C2504yn) this.f18961b).mo124j(obj);
                }

                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public void reply(Object obj) {
/* 1 */             KeyEventChannel.lambda$createReplyHandler$0((KeyEventChannel.EventResponseHandler) this.f18961b, obj);
                }

                @Override // io.flutter.util.ViewUtils.ViewVisitor
                public boolean run(View view) {
/* 1 */             return ViewUtils.lambda$hasChildViewOfType$1((Class[]) this.f18961b, view);
                }

/* 8 */         public /* synthetic */ C2357x6(Object obj, int i) {
/* 9 */             this.f18960a = i;
                    this.f18961b = obj;
                }

                @Override // p000.so0
/* 84 */        public Object apply(Object obj) {
/* 85 */            return (sx1) ((nd1) this.f18961b).invoke(obj);
                }
            }
