            package io.flutter.embedding.engine.deferredcomponents;

            import io.flutter.embedding.engine.FlutterJNI;
            import io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface DeferredComponentManager {
                void destroy();

                String getDeferredComponentInstallState(int i, String str);

                void installDeferredComponent(int i, String str);

                void loadAssets(int i, String str);

                void loadDartLibrary(int i, String str);

                void setDeferredComponentChannel(DeferredComponentChannel deferredComponentChannel);

                void setJNI(FlutterJNI flutterJNI);

                boolean uninstallDeferredComponent(int i, String str);
            }
