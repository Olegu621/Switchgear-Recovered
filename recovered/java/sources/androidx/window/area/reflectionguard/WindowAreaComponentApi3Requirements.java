            package androidx.window.area.reflectionguard;

            import android.app.Activity;
            import android.util.DisplayMetrics;
            import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
            import androidx.window.extensions.area.ExtensionWindowAreaStatus;
            import androidx.window.extensions.core.util.function.Consumer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface WindowAreaComponentApi3Requirements extends WindowAreaComponentApi2Requirements {
                void addRearDisplayPresentationStatusListener(Consumer<ExtensionWindowAreaStatus> consumer);

                void endRearDisplayPresentationSession();

                DisplayMetrics getRearDisplayMetrics();

                ExtensionWindowAreaPresentation getRearDisplayPresentation();

                void removeRearDisplayPresentationStatusListener(Consumer<ExtensionWindowAreaStatus> consumer);

                void startRearDisplayPresentationSession(Activity activity, Consumer<Integer> consumer);
            }
