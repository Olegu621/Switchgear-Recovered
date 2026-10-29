            package com.quago.mobile.sdk;

            import android.os.HandlerThread;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.s0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0759s0 {

                /* JADX INFO: renamed from: a */
                public final C0740j0 f5625a = AbstractC0743k0.m2619a("QuagoNetworkModule");

                /* JADX INFO: renamed from: b */
                public final C0769x0 f5626b;

                /* JADX INFO: renamed from: c */
                public final HandlerC0757r0 f5627c;

                public C0759s0(C0769x0 c0769x0) {
/* 12 */            this.f5626b = c0769x0;
/* 19 */            HandlerThread handlerThread = new HandlerThread("NetworkManagerThread", 5);
/* 27 */            handlerThread.setUncaughtExceptionHandler(new C0756q0(this));
/* 30 */            handlerThread.start();
/* 42 */            this.f5627c = new HandlerC0757r0(this, handlerThread.getLooper(), c0769x0);
                }
            }
