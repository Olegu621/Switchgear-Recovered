            package io.flutter.embedding.engine.plugins.service;

            import android.app.Service;
            import p000.v61;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface ServiceControlSurface {
                void attachToService(Service service, v61 v61Var, boolean z);

                void detachFromService();

                void onMoveToBackground();

                void onMoveToForeground();
            }
