            package io.flutter.embedding.engine.plugins.activity;

            import android.app.Activity;
            import android.os.Bundle;
            import io.flutter.plugin.common.PluginRegistry;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface ActivityPluginBinding {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface OnSaveInstanceStateListener {
                    void onRestoreInstanceState(Bundle bundle);

                    void onSaveInstanceState(Bundle bundle);
                }

                void addActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener);

                void addOnNewIntentListener(PluginRegistry.NewIntentListener newIntentListener);

                void addOnSaveStateListener(OnSaveInstanceStateListener onSaveInstanceStateListener);

                void addOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener userLeaveHintListener);

                void addOnWindowFocusChangedListener(PluginRegistry.WindowFocusChangedListener windowFocusChangedListener);

                void addRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener);

                Activity getActivity();

                Object getLifecycle();

                void removeActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener);

                void removeOnNewIntentListener(PluginRegistry.NewIntentListener newIntentListener);

                void removeOnSaveStateListener(OnSaveInstanceStateListener onSaveInstanceStateListener);

                void removeOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener userLeaveHintListener);

                void removeOnWindowFocusChangedListener(PluginRegistry.WindowFocusChangedListener windowFocusChangedListener);

                void removeRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener);
            }
