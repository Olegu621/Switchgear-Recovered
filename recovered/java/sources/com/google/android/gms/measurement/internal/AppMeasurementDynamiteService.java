            package com.google.android.gms.measurement.internal;

            import android.app.Activity;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import com.google.android.gms.dynamic.IObjectWrapper;
            import com.google.android.gms.dynamic.ObjectWrapper;
            import com.google.android.gms.internal.measurement.zzcq;
            import com.google.android.gms.internal.measurement.zzcu;
            import com.google.android.gms.internal.measurement.zzcx;
            import com.google.android.gms.internal.measurement.zzda;
            import com.google.android.gms.internal.measurement.zzdc;
            import com.google.android.gms.internal.measurement.zzdd;
            import com.google.android.gms.internal.measurement.zzdf;
            import java.net.MalformedURLException;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.net.URL;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.C1024id;
            import p000.RunnableC2176sc;
            import p000.RunnableC2265ur;
            import p000.ac1;
            import p000.bj3;
            import p000.bm3;
            import p000.cp0;
            import p000.dh0;
            import p000.dp0;
            import p000.eu0;
            import p000.f42;
            import p000.fq3;
            import p000.ft0;
            import p000.gl3;
            import p000.hl3;
            import p000.ih3;
            import p000.ij3;
            import p000.il3;
            import p000.kb1;
            import p000.lm3;
            import p000.of3;
            import p000.ol3;
            import p000.pl3;
            import p000.q62;
            import p000.qj3;
            import p000.qk3;
            import p000.rk3;
            import p000.sh3;
            import p000.sl3;
            import p000.uh3;
            import p000.up3;
            import p000.we2;
            import p000.wl3;
            import p000.yl3;
            import p000.zk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AppMeasurementDynamiteService extends zzcq {

                /* JADX INFO: renamed from: a */
                public ij3 f4190a = null;

                /* JADX INFO: renamed from: b */
                public final C1024id f4191b = new C1024id();

                /* JADX INFO: renamed from: a */
                public final void m2162a() {
/* 3 */             if (this.f4190a != null) {
/* 5 */                 return;
                    }
/* 8 */             f42.m3656l("Attempting to perform action before initialize.");
                }

                /* JADX INFO: renamed from: b */
                public final void m2163b(String str, zzcu zzcuVar) {
/* 1 */             m2162a();
/* 6 */             up3 up3Var = this.f4190a.f9668w;
/* 8 */             ij3.m4553j(up3Var);
/* 11 */            up3Var.m9105h0(str, zzcuVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void beginAdUnitExposure(String str, long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             of3 of3Var = this.f4190a.f9643Y;
/* 8 */             ij3.m4552i(of3Var);
/* 11 */            of3Var.m7161A(str, j);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 11 */            sl3Var.m8563N(str, str2, bundle);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void clearMeasurementEnabled(long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 11 */            sl3Var.m9576A();
/* 18 */            bj3 bj3Var = ((ij3) sl3Var.f16749a).f9659i;
/* 20 */            ij3.m4555l(bj3Var);
/* 32 */            bj3Var.m1370I(new cp0(sl3Var, null, 29, false));
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void endAdUnitExposure(String str, long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             of3 of3Var = this.f4190a.f9643Y;
/* 8 */             ij3.m4552i(of3Var);
/* 11 */            of3Var.m7162B(str, j);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void generateEventId(zzcu zzcuVar) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             up3 up3Var = this.f4190a.f9668w;
/* 8 */             ij3.m4553j(up3Var);
/* 11 */            long jM9115v0 = up3Var.m9115v0();
/* 15 */            m2162a();
/* 20 */            up3 up3Var2 = this.f4190a.f9668w;
/* 22 */            ij3.m4553j(up3Var2);
/* 25 */            up3Var2.m9106i0(zzcuVar, jM9115v0);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void getAppInstanceId(zzcu zzcuVar) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             bj3 bj3Var = this.f4190a.f9659i;
/* 8 */             ij3.m4555l(bj3Var);
/* 19 */            bj3Var.m1370I(new cp0(this, zzcuVar, 26, false));
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void getCachedAppInstanceId(zzcu zzcuVar) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 19 */            m2163b((String) sl3Var.f16694i.get(), zzcuVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void getConditionalUserProperties(String str, String str2, zzcu zzcuVar) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             bj3 bj3Var = this.f4190a.f9659i;
/* 8 */             ij3.m4555l(bj3Var);
/* 21 */            bj3Var.m1370I(new RunnableC2265ur(this, zzcuVar, str, str2, 6));
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void getCurrentScreenClass(zzcu zzcuVar) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 15 */            lm3 lm3Var = ((ij3) sl3Var.f16749a).f9641W;
/* 17 */            ij3.m4554k(lm3Var);
/* 20 */            bm3 bm3Var = lm3Var.f13414c;
/* 28 */            m2163b(bm3Var != null ? bm3Var.f2539b : null, zzcuVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void getCurrentScreenName(zzcu zzcuVar) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 15 */            lm3 lm3Var = ((ij3) sl3Var.f16749a).f9641W;
/* 17 */            ij3.m4554k(lm3Var);
/* 20 */            bm3 bm3Var = lm3Var.f13414c;
/* 28 */            m2163b(bm3Var != null ? bm3Var.f2538a : null, zzcuVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void getGmpAppId(zzcu zzcuVar) throws RemoteException {
                    String strM7886S;
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 13 */            ij3 ij3Var = (ij3) sl3Var.f16749a;
                    try {
/* 19 */                strM7886S = qj3.m7886S(ij3Var.f9645a, ij3Var.f9646a0);
                    } catch (IllegalStateException e) {
/* 25 */                uh3 uh3Var = ij3Var.f9655f;
/* 27 */                ij3.m4555l(uh3Var);
/* 34 */                uh3Var.f17538f.m8511b(e, "getGoogleAppId failed with exception");
/* 37 */                strM7886S = null;
                    }
/* 38 */            m2163b(strM7886S, zzcuVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void getMaxUserProperties(String str, zzcu zzcuVar) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 11 */            kb1.m6058k(str);
/* 18 */            ((ij3) sl3Var.f16749a).getClass();
/* 21 */            m2162a();
/* 26 */            up3 up3Var = this.f4190a.f9668w;
/* 28 */            ij3.m4553j(up3Var);
/* 33 */            up3Var.m9107j0(zzcuVar, 25);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void getSessionId(zzcu zzcuVar) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 15 */            bj3 bj3Var = ((ij3) sl3Var.f16749a).f9659i;
/* 17 */            ij3.m4555l(bj3Var);
/* 25 */            bj3Var.m1370I(new dp0(sl3Var, zzcuVar));
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void getTestFlag(zzcu zzcuVar, int i) throws RemoteException {
/* 1 */             m2162a();
/* 5 */             if (i == 0) {
/* 255 */               up3 up3Var = this.f4190a.f9668w;
/* 257 */               ij3.m4553j(up3Var);
/* 262 */               sl3 sl3Var = this.f4190a.f9642X;
/* 264 */               ij3.m4554k(sl3Var);
/* 269 */               AtomicReference atomicReference = new AtomicReference();
/* 276 */               bj3 bj3Var = ((ij3) sl3Var.f16749a).f9659i;
/* 278 */               ij3.m4555l(bj3Var);
/* 296 */               up3Var.m9105h0((String) bj3Var.m1371J(atomicReference, 15000L, "String test flag value", new gl3(sl3Var, atomicReference, 1)), zzcuVar);
/* 299 */               return;
                    }
/* 8 */             if (i == 1) {
/* 204 */               up3 up3Var2 = this.f4190a.f9668w;
/* 206 */               ij3.m4553j(up3Var2);
/* 211 */               sl3 sl3Var2 = this.f4190a.f9642X;
/* 213 */               ij3.m4554k(sl3Var2);
/* 218 */               AtomicReference atomicReference2 = new AtomicReference();
/* 225 */               bj3 bj3Var2 = ((ij3) sl3Var2.f16749a).f9659i;
/* 227 */               ij3.m4555l(bj3Var2);
/* 249 */               up3Var2.m9106i0(zzcuVar, ((Long) bj3Var2.m1371J(atomicReference2, 15000L, "long test flag value", new il3(sl3Var2, atomicReference2, 0))).longValue());
/* 252 */               return;
                    }
/* 11 */            if (i == 2) {
/* 124 */               up3 up3Var3 = this.f4190a.f9668w;
/* 126 */               ij3.m4553j(up3Var3);
/* 131 */               sl3 sl3Var3 = this.f4190a.f9642X;
/* 133 */               ij3.m4554k(sl3Var3);
/* 138 */               AtomicReference atomicReference3 = new AtomicReference();
/* 145 */               bj3 bj3Var3 = ((ij3) sl3Var3.f16749a).f9659i;
/* 147 */               ij3.m4555l(bj3Var3);
/* 165 */               double dDoubleValue = ((Double) bj3Var3.m1371J(atomicReference3, 15000L, "double test flag value", new il3(sl3Var3, atomicReference3, 1))).doubleValue();
/* 171 */               Bundle bundle = new Bundle();
/* 176 */               bundle.putDouble("r", dDoubleValue);
                        try {
/* 179 */                   zzcuVar.zzb(bundle);
/* 182 */                   return;
                        } catch (RemoteException e) {
/* 189 */                   uh3 uh3Var = ((ij3) up3Var3.f16749a).f9655f;
/* 191 */                   ij3.m4555l(uh3Var);
/* 198 */                   uh3Var.f17541w.m8511b(e, "Error returning double value to wrapper");
/* 201 */                   return;
                        }
                    }
/* 14 */            if (i == 3) {
/* 73 */                up3 up3Var4 = this.f4190a.f9668w;
/* 75 */                ij3.m4553j(up3Var4);
/* 80 */                sl3 sl3Var4 = this.f4190a.f9642X;
/* 82 */                ij3.m4554k(sl3Var4);
/* 87 */                AtomicReference atomicReference4 = new AtomicReference();
/* 94 */                bj3 bj3Var4 = ((ij3) sl3Var4.f16749a).f9659i;
/* 96 */                ij3.m4555l(bj3Var4);
/* 118 */               up3Var4.m9107j0(zzcuVar, ((Integer) bj3Var4.m1371J(atomicReference4, 15000L, "int test flag value", new gl3(sl3Var4, atomicReference4, 2))).intValue());
/* 121 */               return;
                    }
/* 17 */            if (i != 4) {
/* 19 */                return;
                    }
/* 22 */            up3 up3Var5 = this.f4190a.f9668w;
/* 24 */            ij3.m4553j(up3Var5);
/* 29 */            sl3 sl3Var5 = this.f4190a.f9642X;
/* 31 */            ij3.m4554k(sl3Var5);
/* 36 */            AtomicReference atomicReference5 = new AtomicReference();
/* 43 */            bj3 bj3Var5 = ((ij3) sl3Var5.f16749a).f9659i;
/* 45 */            ij3.m4555l(bj3Var5);
/* 67 */            up3Var5.m9109l0(zzcuVar, ((Boolean) bj3Var5.m1371J(atomicReference5, 15000L, "boolean test flag value", new gl3(sl3Var5, atomicReference5, 0))).booleanValue());
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void getUserProperties(String str, String str2, boolean z, zzcu zzcuVar) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             bj3 bj3Var = this.f4190a.f9659i;
/* 8 */             ij3.m4555l(bj3Var);
/* 21 */            bj3Var.m1370I(new ft0(this, zzcuVar, str, str2, z));
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void initForTests(Map map) throws RemoteException {
/* 1 */             m2162a();
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void initialize(IObjectWrapper iObjectWrapper, zzdd zzddVar, long j) throws RemoteException {
/* 1 */             ij3 ij3Var = this.f4190a;
/* 3 */             if (ij3Var == null) {
/* 9 */                 Context context = (Context) ObjectWrapper.m2045b(iObjectWrapper);
/* 11 */                kb1.m6061n(context);
/* 22 */                this.f4190a = ij3.m4556r(context, zzddVar, Long.valueOf(j));
                    } else {
/* 25 */                uh3 uh3Var = ij3Var.f9655f;
/* 27 */                ij3.m4555l(uh3Var);
/* 34 */                uh3Var.f17541w.m8510a("Attempting to initialize multiple times");
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void isDataCollectionEnabled(zzcu zzcuVar) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             bj3 bj3Var = this.f4190a.f9659i;
/* 8 */             ij3.m4555l(bj3Var);
/* 17 */            bj3Var.m1370I(new ol3(3, this, zzcuVar));
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 17 */            sl3Var.m8554E(str, str2, bundle, z, z2, j);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j) throws RemoteException {
/* 1 */             m2162a();
/* 4 */             kb1.m6058k(str2);
/* 24 */            (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
/* 36 */            zzbg zzbgVar = new zzbg(str2, new zzbe(bundle), "app", j);
/* 42 */            bj3 bj3Var = this.f4190a.f9659i;
/* 44 */            ij3.m4555l(bj3Var);
/* 56 */            bj3Var.m1370I(new RunnableC2265ur(this, zzcuVar, zzbgVar, str, 3));
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
/* 1 */             m2162a();
/* 9 */             Object objM2045b = iObjectWrapper == null ? null : ObjectWrapper.m2045b(iObjectWrapper);
/* 18 */            Object objM2045b2 = iObjectWrapper2 == null ? null : ObjectWrapper.m2045b(iObjectWrapper2);
/* 27 */            Object objM2045b3 = iObjectWrapper3 != null ? ObjectWrapper.m2045b(iObjectWrapper3) : null;
/* 34 */            uh3 uh3Var = this.f4190a.f9655f;
/* 36 */            ij3.m4555l(uh3Var);
/* 43 */            uh3Var.m9020I(i, true, false, str, objM2045b, objM2045b2, objM2045b3);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
/* 1 */             m2162a();
/* 8 */             Activity activity = (Activity) ObjectWrapper.m2045b(iObjectWrapper);
/* 10 */            kb1.m6061n(activity);
/* 17 */            onActivityCreatedByScionActivityInfo(zzdf.zza(activity), bundle, j);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 11 */            dh0 dh0Var = sl3Var.f16684c;
/* 13 */            if (dh0Var != null) {
/* 17 */                sl3 sl3Var2 = this.f4190a.f9642X;
/* 19 */                ij3.m4554k(sl3Var2);
/* 22 */                sl3Var2.m8567R();
/* 25 */                dh0Var.m3079n(zzdfVar, bundle);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
/* 1 */             m2162a();
/* 8 */             Activity activity = (Activity) ObjectWrapper.m2045b(iObjectWrapper);
/* 10 */            kb1.m6061n(activity);
/* 17 */            onActivityDestroyedByScionActivityInfo(zzdf.zza(activity), j);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 11 */            dh0 dh0Var = sl3Var.f16684c;
/* 13 */            if (dh0Var != null) {
/* 17 */                sl3 sl3Var2 = this.f4190a.f9642X;
/* 19 */                ij3.m4554k(sl3Var2);
/* 22 */                sl3Var2.m8567R();
/* 25 */                dh0Var.m3080o(zzdfVar);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
/* 1 */             m2162a();
/* 8 */             Activity activity = (Activity) ObjectWrapper.m2045b(iObjectWrapper);
/* 10 */            kb1.m6061n(activity);
/* 17 */            onActivityPausedByScionActivityInfo(zzdf.zza(activity), j);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 11 */            dh0 dh0Var = sl3Var.f16684c;
/* 13 */            if (dh0Var != null) {
/* 17 */                sl3 sl3Var2 = this.f4190a.f9642X;
/* 19 */                ij3.m4554k(sl3Var2);
/* 22 */                sl3Var2.m8567R();
/* 25 */                dh0Var.m3081p(zzdfVar);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
/* 1 */             m2162a();
/* 8 */             Activity activity = (Activity) ObjectWrapper.m2045b(iObjectWrapper);
/* 10 */            kb1.m6061n(activity);
/* 17 */            onActivityResumedByScionActivityInfo(zzdf.zza(activity), j);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 11 */            dh0 dh0Var = sl3Var.f16684c;
/* 13 */            if (dh0Var != null) {
/* 17 */                sl3 sl3Var2 = this.f4190a.f9642X;
/* 19 */                ij3.m4554k(sl3Var2);
/* 22 */                sl3Var2.m8567R();
/* 25 */                dh0Var.m3082q(zzdfVar);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcu zzcuVar, long j) throws RemoteException {
/* 1 */             m2162a();
/* 8 */             Activity activity = (Activity) ObjectWrapper.m2045b(iObjectWrapper);
/* 10 */            kb1.m6061n(activity);
/* 17 */            onActivitySaveInstanceStateByScionActivityInfo(zzdf.zza(activity), zzcuVar, j);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 11 */            dh0 dh0Var = sl3Var.f16684c;
/* 15 */            Bundle bundle = new Bundle();
/* 18 */            if (dh0Var != null) {
/* 22 */                sl3 sl3Var2 = this.f4190a.f9642X;
/* 24 */                ij3.m4554k(sl3Var2);
/* 27 */                sl3Var2.m8567R();
/* 30 */                dh0Var.m3083r(zzdfVar, bundle);
                    }
                    try {
/* 33 */                zzcuVar.zzb(bundle);
                    } catch (RemoteException e) {
/* 40 */                uh3 uh3Var = this.f4190a.f9655f;
/* 42 */                ij3.m4555l(uh3Var);
/* 49 */                uh3Var.f17541w.m8511b(e, "Error returning bundle value to wrapper");
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
/* 1 */             m2162a();
/* 8 */             Activity activity = (Activity) ObjectWrapper.m2045b(iObjectWrapper);
/* 10 */            kb1.m6061n(activity);
/* 17 */            onActivityStartedByScionActivityInfo(zzdf.zza(activity), j);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 13 */            if (sl3Var.f16684c != null) {
/* 17 */                sl3 sl3Var2 = this.f4190a.f9642X;
/* 19 */                ij3.m4554k(sl3Var2);
/* 22 */                sl3Var2.m8567R();
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
/* 1 */             m2162a();
/* 8 */             Activity activity = (Activity) ObjectWrapper.m2045b(iObjectWrapper);
/* 10 */            kb1.m6061n(activity);
/* 17 */            onActivityStoppedByScionActivityInfo(zzdf.zza(activity), j);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 13 */            if (sl3Var.f16684c != null) {
/* 17 */                sl3 sl3Var2 = this.f4190a.f9642X;
/* 19 */                ij3.m4554k(sl3Var2);
/* 22 */                sl3Var2.m8567R();
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void performAction(Bundle bundle, zzcu zzcuVar, long j) throws RemoteException {
/* 1 */             m2162a();
/* 5 */             zzcuVar.zzb(null);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void registerOnMeasurementEventListener(zzda zzdaVar) throws RemoteException {
                    Object fq3Var;
/* 1 */             m2162a();
/* 4 */             C1024id c1024id = this.f4191b;
                    synchronized (c1024id) {
                        try {
/* 20 */                    fq3Var = (rk3) c1024id.getOrDefault(Integer.valueOf(zzdaVar.zzf()), null);
/* 22 */                    if (fq3Var == null) {
/* 26 */                        fq3Var = new fq3(this, zzdaVar);
/* 37 */                        c1024id.put(Integer.valueOf(zzdaVar.zzf()), fq3Var);
                            }
                        } catch (Throwable th) {
/* 80 */                    throw th;
                        }
                    }
/* 46 */            sl3 sl3Var = this.f4190a.f9642X;
/* 48 */            ij3.m4554k(sl3Var);
/* 51 */            sl3Var.m9576A();
/* 60 */            if (sl3Var.f16688e.add(fq3Var)) {
/* 78 */                return;
                    }
/* 66 */            uh3 uh3Var = ((ij3) sl3Var.f16749a).f9655f;
/* 68 */            ij3.m4555l(uh3Var);
/* 75 */            uh3Var.f17541w.m8510a("OnEventListener already registered");
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void resetAnalyticsData(long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 14 */            sl3Var.f16694i.set(null);
/* 21 */            bj3 bj3Var = ((ij3) sl3Var.f16749a).f9659i;
/* 23 */            ij3.m4555l(bj3Var);
/* 32 */            bj3Var.m1370I(new zk3(sl3Var, j, 1));
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void retrieveAndUploadBatches(zzcx zzcxVar) {
                    yl3 yl3Var;
/* 3 */             m2162a();
/* 8 */             sl3 sl3Var = this.f4190a.f9642X;
/* 10 */            ij3.m4554k(sl3Var);
/* 13 */            sl3Var.m9576A();
/* 19 */            ij3 ij3Var = (ij3) sl3Var.f16749a;
/* 21 */            bj3 bj3Var = ij3Var.f9659i;
/* 23 */            ij3.m4555l(bj3Var);
/* 30 */            if (bj3Var.m1367F()) {
/* 535 */               uh3 uh3Var = ij3Var.f9655f;
/* 537 */               ij3.m4555l(uh3Var);
/* 544 */               uh3Var.f17538f.m8510a("Cannot retrieve and upload batches from analytics worker thread");
/* 547 */               return;
                    }
/* 32 */            bj3 bj3Var2 = ij3Var.f9659i;
/* 34 */            ij3.m4555l(bj3Var2);
/* 43 */            if (Thread.currentThread() == bj3Var2.f2453d) {
/* 45 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 47 */                ij3.m4555l(uh3Var2);
/* 54 */                uh3Var2.f17538f.m8510a("Cannot retrieve and upload batches from analytics network thread");
/* 57 */                return;
                    }
/* 58 */            boolean zM7734g = q62.m7734g();
/* 62 */            uh3 uh3Var3 = ij3Var.f9655f;
/* 64 */            if (zM7734g) {
/* 524 */               ij3.m4555l(uh3Var3);
/* 531 */               uh3Var3.f17538f.m8510a("Cannot retrieve and upload batches from main thread");
/* 534 */               return;
                    }
/* 66 */            ij3.m4555l(uh3Var3);
/* 73 */            uh3Var3.f17534Y.m8510a("[sgtm] Started client-side batch upload work.");
/* 76 */            boolean z = false;
/* 77 */            int size = 0;
/* 78 */            int i = 0;
/* 79 */            while (!z) {
/* 81 */                uh3 uh3Var4 = ij3Var.f9655f;
/* 83 */                ij3.m4555l(uh3Var4);
/* 90 */                uh3Var4.f17534Y.m8510a("[sgtm] Getting upload batches from service (FE)");
/* 95 */                AtomicReference atomicReference = new AtomicReference();
/* 98 */                bj3 bj3Var3 = ij3Var.f9659i;
/* 100 */               ij3.m4555l(bj3Var3);
/* 113 */               bj3Var3.m1371J(atomicReference, 10000L, "[sgtm] Getting upload batches", new il3(sl3Var, atomicReference, 2));
/* 120 */               zzop zzopVar = (zzop) atomicReference.get();
/* 122 */               if (zzopVar == null) {
                            break;
                        }
/* 124 */               List list = zzopVar.f4226a;
/* 130 */               if (list.isEmpty()) {
                            break;
                        }
/* 134 */               uh3 uh3Var5 = ij3Var.f9655f;
/* 136 */               ij3.m4555l(uh3Var5);
/* 151 */               uh3Var5.f17534Y.m8511b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
/* 158 */               size += list.size();
/* 159 */               Iterator it = list.iterator();
                        while (true) {
/* 167 */                   if (!it.hasNext()) {
/* 478 */                       z = false;
                                break;
                            }
/* 174 */                   zzol zzolVar = (zzol) it.next();
                            try {
/* 183 */                       URL url = new URI(zzolVar.f4220c).toURL();
/* 189 */                       AtomicReference atomicReference2 = new AtomicReference();
/* 196 */                       ih3 ih3VarM4569q = ((ij3) sl3Var.f16749a).m4569q();
/* 200 */                       ih3VarM4569q.m9576A();
/* 205 */                       kb1.m6061n(ih3VarM4569q.f9601i);
/* 208 */                       String str = ih3VarM4569q.f9601i;
/* 212 */                       ij3 ij3Var2 = (ij3) sl3Var.f16749a;
/* 214 */                       uh3 uh3Var6 = ij3Var2.f9655f;
/* 216 */                       ij3.m4555l(uh3Var6);
/* 219 */                       sh3 sh3Var = uh3Var6.f17534Y;
/* 223 */                       Long lValueOf = Long.valueOf(zzolVar.f4218a);
/* 238 */                       sh3Var.m8513d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzolVar.f4220c, Integer.valueOf(zzolVar.f4219b.length));
/* 247 */                       if (!TextUtils.isEmpty(zzolVar.f4224i)) {
/* 249 */                           uh3 uh3Var7 = ij3Var2.f9655f;
/* 251 */                           ij3.m4555l(uh3Var7);
/* 260 */                           uh3Var7.f17534Y.m8512c(lValueOf, "[sgtm] Uploading data from app. row_id", zzolVar.f4224i);
                                }
/* 265 */                       HashMap map = new HashMap();
/* 268 */                       Bundle bundle = zzolVar.f4221d;
/* 282 */                       for (String str2 : bundle.keySet()) {
/* 290 */                           String string = bundle.getString(str2);
/* 298 */                           if (!TextUtils.isEmpty(string)) {
/* 300 */                               map.put(str2, string);
                                    }
                                }
/* 304 */                       wl3 wl3Var = ij3Var2.f9644Z;
/* 306 */                       ij3.m4555l(wl3Var);
/* 309 */                       byte[] bArr = zzolVar.f4219b;
/* 315 */                       ac1 ac1Var = new ac1(29, sl3Var, atomicReference2, zzolVar);
/* 318 */                       wl3Var.m4240B();
/* 321 */                       kb1.m6061n(url);
/* 324 */                       kb1.m6061n(bArr);
/* 331 */                       bj3 bj3Var4 = ((ij3) wl3Var.f16749a).f9659i;
/* 333 */                       ij3.m4555l(bj3Var4);
/* 343 */                       bj3Var4.m1373L(new eu0(wl3Var, str, url, bArr, map, ac1Var));
                                try {
/* 346 */                           up3 up3Var = ij3Var2.f9668w;
/* 348 */                           ij3.m4553j(up3Var);
/* 353 */                           ij3 ij3Var3 = (ij3) up3Var.f16749a;
/* 357 */                           ij3Var3.f9640V.getClass();
/* 367 */                           long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                                    synchronized (atomicReference2) {
/* 373 */                               for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                            try {
/* 381 */                                       atomicReference2.wait(jCurrentTimeMillis2);
/* 386 */                                       ij3Var3.f9640V.getClass();
                                            } catch (Throwable th) {
/* 401 */                                       throw th;
                                            }
                                        }
                                    }
                                } catch (InterruptedException unused) {
/* 406 */                           uh3 uh3Var8 = ((ij3) sl3Var.f16749a).f9655f;
/* 408 */                           ij3.m4555l(uh3Var8);
/* 415 */                           uh3Var8.f17541w.m8510a("[sgtm] Interrupted waiting for uploading batch");
                                }
/* 431 */                       yl3Var = atomicReference2.get() == null ? yl3.UNKNOWN : (yl3) atomicReference2.get();
                            } catch (MalformedURLException | URISyntaxException e) {
/* 441 */                       uh3 uh3Var9 = ((ij3) sl3Var.f16749a).f9655f;
/* 443 */                       ij3.m4555l(uh3Var9);
/* 458 */                       uh3Var9.f17538f.m8513d("[sgtm] Bad upload url for row_id", zzolVar.f4220c, Long.valueOf(zzolVar.f4218a), e);
/* 461 */                       yl3Var = yl3.FAILURE;
                            }
/* 465 */                   if (yl3Var != yl3.SUCCESS) {
/* 473 */                       if (yl3Var == yl3.BACKOFF) {
/* 475 */                           z = true;
                                    break;
                                }
                            } else {
/* 467 */                       i++;
                            }
                        }
                    }
/* 481 */           uh3 uh3Var10 = ij3Var.f9655f;
/* 483 */           ij3.m4555l(uh3Var10);
/* 498 */           uh3Var10.f17534Y.m8512c(Integer.valueOf(size), "[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i));
                    try {
/* 501 */               zzcxVar.zze();
                    } catch (RemoteException e2) {
/* 506 */               ij3 ij3Var4 = this.f4190a;
/* 508 */               kb1.m6061n(ij3Var4);
/* 511 */               uh3 uh3Var11 = ij3Var4.f9655f;
/* 513 */               ij3.m4555l(uh3Var11);
/* 520 */               uh3Var11.f17541w.m8511b(e2, "Failed to call IDynamiteUploadBatchesCallback");
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
/* 1 */             m2162a();
/* 4 */             ij3 ij3Var = this.f4190a;
/* 6 */             if (bundle == null) {
/* 8 */                 uh3 uh3Var = ij3Var.f9655f;
/* 10 */                ij3.m4555l(uh3Var);
/* 17 */                uh3Var.f17538f.m8510a("Conditional user property must not be null");
                    } else {
/* 21 */                sl3 sl3Var = ij3Var.f9642X;
/* 23 */                ij3.m4554k(sl3Var);
/* 26 */                sl3Var.m8562M(bundle, j);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void setConsent(Bundle bundle, long j) throws RemoteException {
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 13 */            sl3Var.m8568S(bundle, -20, j);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
/* 1 */             m2162a();
/* 8 */             Activity activity = (Activity) ObjectWrapper.m2045b(iObjectWrapper);
/* 10 */            kb1.m6061n(activity);
/* 21 */            setCurrentScreenByScionActivityInfo(zzdf.zza(activity), str, str2, j);
                }

                /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
                
                    if (r2 <= 500) goto L31;
                 */
                @Override // com.google.android.gms.internal.measurement.zzcr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             lm3 lm3Var = this.f4190a.f9641W;
/* 8 */             ij3.m4554k(lm3Var);
/* 13 */            ij3 ij3Var = (ij3) lm3Var.f16749a;
/* 21 */            if (!ij3Var.f9651d.m7410N()) {
/* 23 */                uh3 uh3Var = ij3Var.f9655f;
/* 25 */                ij3.m4555l(uh3Var);
/* 32 */                uh3Var.f17531V.m8510a("setCurrentScreen cannot be called while screen reporting is disabled.");
/* 35 */                return;
                    }
/* 36 */            bm3 bm3Var = lm3Var.f13414c;
/* 38 */            if (bm3Var == null) {
/* 40 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 42 */                ij3.m4555l(uh3Var2);
/* 49 */                uh3Var2.f17531V.m8510a("setCurrentScreen cannot be called while no activity active");
/* 52 */                return;
                    }
/* 53 */            ConcurrentHashMap concurrentHashMap = lm3Var.f13417f;
/* 57 */            Integer numValueOf = Integer.valueOf(zzdfVar.zza);
/* 65 */            if (concurrentHashMap.get(numValueOf) == null) {
/* 67 */                uh3 uh3Var3 = ij3Var.f9655f;
/* 69 */                ij3.m4555l(uh3Var3);
/* 76 */                uh3Var3.f17531V.m8510a("setCurrentScreen must be called with an activity in the activity lifecycle");
/* 79 */                return;
                    }
/* 80 */            if (str2 == null) {
/* 84 */                str2 = lm3Var.m6504G(zzdfVar.zzb);
                    }
/* 88 */            String str3 = bm3Var.f2539b;
/* 90 */            String str4 = bm3Var.f2538a;
/* 92 */            boolean zEquals = Objects.equals(str3, str2);
/* 96 */            boolean zEquals2 = Objects.equals(str4, str);
/* 100 */           if (zEquals && zEquals2) {
/* 105 */               uh3 uh3Var4 = ij3Var.f9655f;
/* 107 */               ij3.m4555l(uh3Var4);
/* 114 */               uh3Var4.f17531V.m8510a("setCurrentScreen cannot be called with the same class and name");
/* 117 */               return;
                    }
/* 120 */           if (str != null) {
/* 126 */               if (str.length() > 0) {
/* 128 */                   int length = str.length();
/* 134 */                   ij3Var.f9651d.getClass();
                        }
/* 140 */               uh3 uh3Var5 = ij3Var.f9655f;
/* 142 */               ij3.m4555l(uh3Var5);
/* 157 */               uh3Var5.f17531V.m8511b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
/* 160 */               return;
                    }
/* 165 */           if (str2.length() > 0) {
/* 167 */               int length2 = str2.length();
/* 173 */               ij3Var.f9651d.getClass();
/* 176 */               if (length2 <= 500) {
/* 178 */                   uh3 uh3Var6 = ij3Var.f9655f;
/* 180 */                   ij3.m4555l(uh3Var6);
/* 193 */                   uh3Var6.f17534Y.m8512c(str == null ? "null" : str, "Setting current screen to name, class", str2);
/* 198 */                   up3 up3Var = ij3Var.f9668w;
/* 200 */                   ij3.m4553j(up3Var);
/* 207 */                   bm3 bm3Var2 = new bm3(str, up3Var.m9115v0(), str2);
/* 210 */                   concurrentHashMap.put(numValueOf, bm3Var2);
/* 216 */                   lm3Var.m6506I(zzdfVar.zzb, bm3Var2, true);
/* 219 */                   return;
                        }
                    }
/* 220 */           uh3 uh3Var7 = ij3Var.f9655f;
/* 222 */           ij3.m4555l(uh3Var7);
/* 237 */           uh3Var7.f17531V.m8511b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void setDataCollectionEnabled(boolean z) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 11 */            sl3Var.m9576A();
/* 18 */            bj3 bj3Var = ((ij3) sl3Var.f16749a).f9659i;
/* 20 */            ij3.m4555l(bj3Var);
/* 28 */            bj3Var.m1370I(new RunnableC2176sc(sl3Var, z));
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void setDefaultEventParameters(Bundle bundle) {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 21 */            Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
/* 29 */            bj3 bj3Var = ((ij3) sl3Var.f16749a).f9659i;
/* 31 */            ij3.m4555l(bj3Var);
/* 40 */            bj3Var.m1370I(new hl3(sl3Var, bundle2, 1));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.measurement.zzcr
                public void setEventInterceptor(zzda zzdaVar) throws RemoteException {
/* 1 */             m2162a();
/* 8 */             we2 we2Var = new we2(24, this, zzdaVar);
/* 13 */            bj3 bj3Var = this.f4190a.f9659i;
/* 15 */            ij3.m4555l(bj3Var);
/* 18 */            boolean zM1367F = bj3Var.m1367F();
/* 22 */            ij3 ij3Var = this.f4190a;
/* 24 */            Object[] objArr = 0;
/* 25 */            if (!zM1367F) {
/* 53 */                bj3 bj3Var2 = ij3Var.f9659i;
/* 55 */                ij3.m4555l(bj3Var2);
/* 63 */                bj3Var2.m1370I(new ol3(objArr == true ? 1 : 0, this, we2Var));
/* 66 */                return;
                    }
/* 27 */            sl3 sl3Var = ij3Var.f9642X;
/* 29 */            ij3.m4554k(sl3Var);
/* 32 */            sl3Var.mo1375y();
/* 35 */            sl3Var.m9576A();
/* 38 */            qk3 qk3Var = sl3Var.f16686d;
/* 40 */            if (we2Var != qk3Var) {
/* 47 */                kb1.m6063p("EventInterceptor already set.", qk3Var == null);
                    }
/* 50 */            sl3Var.f16686d = we2Var;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void setInstanceIdProvider(zzdc zzdcVar) throws RemoteException {
/* 1 */             m2162a();
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 11 */            Boolean boolValueOf = Boolean.valueOf(z);
/* 15 */            sl3Var.m9576A();
/* 22 */            bj3 bj3Var = ((ij3) sl3Var.f16749a).f9659i;
/* 24 */            ij3.m4555l(bj3Var);
/* 35 */            bj3Var.m1370I(new cp0(sl3Var, boolValueOf, 29, false));
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void setMinimumSessionDuration(long j) throws RemoteException {
/* 1 */             m2162a();
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void setSessionTimeoutDuration(long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 15 */            bj3 bj3Var = ((ij3) sl3Var.f16749a).f9659i;
/* 17 */            ij3.m4555l(bj3Var);
/* 26 */            bj3Var.m1370I(new zk3(sl3Var, j, 0));
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void setSgtmDebugInfo(Intent intent) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 13 */            ij3 ij3Var = (ij3) sl3Var.f16749a;
/* 15 */            Uri data = intent.getData();
/* 19 */            if (data == null) {
/* 21 */                uh3 uh3Var = ij3Var.f9655f;
/* 23 */                ij3.m4555l(uh3Var);
/* 30 */                uh3Var.f17532W.m8510a("Activity intent has no data. Preview Mode was not enabled.");
/* 33 */                return;
                    }
/* 36 */            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
/* 40 */            if (queryParameter == null || !queryParameter.equals("1")) {
/* 80 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 82 */                ij3.m4555l(uh3Var2);
/* 89 */                uh3Var2.f17532W.m8510a("[sgtm] Preview Mode was not enabled.");
/* 95 */                ij3Var.f9651d.f15074c = null;
/* 97 */                return;
                    }
/* 53 */            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
/* 61 */            if (TextUtils.isEmpty(queryParameter2)) {
/* 79 */                return;
                    }
/* 63 */            uh3 uh3Var3 = ij3Var.f9655f;
/* 65 */            ij3.m4555l(uh3Var3);
/* 72 */            uh3Var3.f17532W.m8511b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
/* 77 */            ij3Var.f9651d.f15074c = queryParameter2;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void setUserId(String str, long j) throws RemoteException {
/* 1 */             m2162a();
/* 6 */             sl3 sl3Var = this.f4190a.f9642X;
/* 8 */             ij3.m4554k(sl3Var);
/* 13 */            ij3 ij3Var = (ij3) sl3Var.f16749a;
/* 15 */            if (str != null && TextUtils.isEmpty(str)) {
/* 23 */                uh3 uh3Var = ij3Var.f9655f;
/* 25 */                ij3.m4555l(uh3Var);
/* 32 */                uh3Var.f17541w.m8510a("User ID must be non-empty or null");
                    } else {
/* 36 */                bj3 bj3Var = ij3Var.f9659i;
/* 38 */                ij3.m4555l(bj3Var);
/* 47 */                bj3Var.m1370I(new pl3(1, sl3Var, str));
/* 56 */                sl3Var.m8559J(null, "_id", str, true, j);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
/* 1 */             m2162a();
/* 4 */             Object objM2045b = ObjectWrapper.m2045b(iObjectWrapper);
/* 10 */            sl3 sl3Var = this.f4190a.f9642X;
/* 12 */            ij3.m4554k(sl3Var);
/* 15 */            sl3Var.m8559J(str, str2, objM2045b, z, j);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public void unregisterOnMeasurementEventListener(zzda zzdaVar) throws RemoteException {
                    Object fq3Var;
/* 1 */             m2162a();
/* 4 */             C1024id c1024id = this.f4191b;
                    synchronized (c1024id) {
/* 19 */                fq3Var = (rk3) c1024id.remove(Integer.valueOf(zzdaVar.zzf()));
                    }
/* 22 */            if (fq3Var == null) {
/* 26 */                fq3Var = new fq3(this, zzdaVar);
                    }
/* 31 */            sl3 sl3Var = this.f4190a.f9642X;
/* 33 */            ij3.m4554k(sl3Var);
/* 36 */            sl3Var.m9576A();
/* 45 */            if (sl3Var.f16688e.remove(fq3Var)) {
/* 63 */                return;
                    }
/* 51 */            uh3 uh3Var = ((ij3) sl3Var.f16749a).f9655f;
/* 53 */            ij3.m4555l(uh3Var);
/* 60 */            uh3Var.f17541w.m8510a("OnEventListener had not been registered");
                }
            }
