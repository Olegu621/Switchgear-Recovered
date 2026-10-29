            package io.flutter.embedding.engine.plugins;

            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface PluginRegistry {
                void add(FlutterPlugin flutterPlugin);

                void add(Set<FlutterPlugin> set);

                FlutterPlugin get(Class<? extends FlutterPlugin> cls);

                boolean has(Class<? extends FlutterPlugin> cls);

                void remove(Class<? extends FlutterPlugin> cls);

                void remove(Set<Class<? extends FlutterPlugin>> set);

                void removeAll();
            }
