            package com.quago.mobile.sdk;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.q0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0756q0 implements Thread.UncaughtExceptionHandler {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C0759s0 f5615a;

                public C0756q0(C0759s0 c0759s0) {
/* 1 */             this.f5615a = c0759s0;
                }

                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
/* 17 */            this.f5615a.f5625a.m2613b("NetworkManager", "Thread = %s", thread.getName());
/* 24 */            this.f5615a.f5625a.m2612a("NetworkManager", th);
                }
            }
