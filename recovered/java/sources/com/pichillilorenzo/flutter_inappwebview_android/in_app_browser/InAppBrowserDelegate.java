            package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

            import android.app.Activity;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface InAppBrowserDelegate {
                void didChangeProgress(int i);

                void didChangeTitle(String str);

                void didFailNavigation(String str, int i, String str2);

                void didFinishNavigation(String str);

                void didStartNavigation(String str);

                void didUpdateVisitedHistory(String str);

                Activity getActivity();

                List<ActivityResultListener> getActivityResultListeners();
            }
