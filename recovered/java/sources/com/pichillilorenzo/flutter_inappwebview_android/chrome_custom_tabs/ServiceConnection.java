            package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

            import android.content.ComponentName;
            import java.lang.ref.WeakReference;
            import p000.e30;
            import p000.l30;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ServiceConnection extends l30 {
                private WeakReference<ServiceConnectionCallback> mConnectionCallback;

                public ServiceConnection(ServiceConnectionCallback serviceConnectionCallback) {
/* 9 */             this.mConnectionCallback = new WeakReference<>(serviceConnectionCallback);
                }

                @Override // p000.l30
                public void onCustomTabsServiceConnected(ComponentName componentName, e30 e30Var) {
/* 3 */             ServiceConnectionCallback serviceConnectionCallback = this.mConnectionCallback.get();
/* 9 */             if (serviceConnectionCallback != null) {
/* 11 */                serviceConnectionCallback.onServiceConnected(e30Var);
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
/* 3 */             ServiceConnectionCallback serviceConnectionCallback = this.mConnectionCallback.get();
/* 9 */             if (serviceConnectionCallback != null) {
/* 11 */                serviceConnectionCallback.onServiceDisconnected();
                    }
                }
            }
