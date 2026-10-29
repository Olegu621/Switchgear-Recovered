            package androidx.window.area.reflectionguard;

            import android.app.Activity;
            import androidx.window.extensions.core.util.function.Consumer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface WindowAreaComponentApi2Requirements {
                void addRearDisplayStatusListener(Consumer<Integer> consumer);

                void endRearDisplaySession();

                void removeRearDisplayStatusListener(Consumer<Integer> consumer);

                void startRearDisplaySession(Activity activity, Consumer<Integer> consumer);
            }
