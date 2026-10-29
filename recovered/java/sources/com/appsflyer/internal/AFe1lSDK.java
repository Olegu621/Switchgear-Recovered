            package com.appsflyer.internal;

            import java.util.TimerTask;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class AFe1lSDK extends TimerTask {
                private final Thread getCurrencyIso4217Code;

                public AFe1lSDK(Thread thread) {
/* 4 */             this.getCurrencyIso4217Code = thread;
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
/* 3 */             this.getCurrencyIso4217Code.interrupt();
                }
            }
