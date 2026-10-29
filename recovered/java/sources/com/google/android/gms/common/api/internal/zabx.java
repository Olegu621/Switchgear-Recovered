            package com.google.android.gms.common.api.internal;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import p000.fb3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zabx extends BroadcastReceiver {

                /* JADX INFO: renamed from: a */
                Context f3450a;

                /* JADX INFO: renamed from: b */
                private final fb3 f3451b;

                public zabx(fb3 fb3Var) {
/* 4 */             this.f3451b = fb3Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m2009a(Context context) {
/* 1 */             this.f3450a = context;
                }

                /* JADX INFO: renamed from: b */
                public final synchronized void m2010b() {
                    try {
/* 2 */                 Context context = this.f3450a;
/* 4 */                 if (context != null) {
/* 6 */                     context.unregisterReceiver(this);
                        }
/* 13 */                this.f3450a = null;
                    } catch (Throwable th) {
/* 18 */                throw th;
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
/* 1 */             Uri data = intent.getData();
/* 19 */            if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
/* 23 */                this.f3451b.mo3408a();
/* 26 */                m2010b();
                    }
                }
            }
